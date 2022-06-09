package de.lavego.zvt;

import static de.lavego.zvt.api.Commons.Command;
import static de.lavego.zvt.api.Commons.Log;
import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.isA;
import static de.lavego.zvt.api.Commons.toHex;

import android.os.Build;

import androidx.annotation.NonNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetSocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.LinkedBlockingQueue;

import de.lavego.sdk.App;
import de.lavego.sdk.CompletionForAuthResult;
import de.lavego.sdk.CompletionForGenericResult;
import de.lavego.sdk.CompletionForRegisterResult;
import de.lavego.sdk.IntermediateStatusResult;
import de.lavego.sdk.TransactionData;
import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Hex;
import de.lavego.zvt.cmds.BlockReceipt;
import de.lavego.zvt.cmds.CompletionForRegister;
import de.lavego.zvt.cmds.CompletionForStatusResult;
import de.lavego.zvt.cmds.IntermediateStatus;
import de.lavego.zvt.cmds.PrintLine;
import de.lavego.zvt.cmds.Status;

public class ZvtRunnable implements Runnable, ZvtResponseCallback
{
    private static final String                                         TAG = "ZVT_TCP";
    private final        WeakReference<LinkedBlockingQueue<ZvtMessage>> messageQueueRef;
    private final        WeakReference<ZvtResponseCallback>             zvtResponseCallbackWeakReference;
    private final        String                                         hostname;
    private final        int                                            port;
    
    private SocketChannel     client  = null;
    private SelectableChannel channel = null;
    
    public ZvtRunnable(LinkedBlockingQueue<ZvtMessage> messageQueue,
                       ZvtResponseCallback callback)
    {
        this.messageQueueRef = new WeakReference<>(messageQueue);
        this.zvtResponseCallbackWeakReference = new WeakReference<>(callback);
        this.hostname = "127.0.0.1";
        this.port = 20007;
    }
    
    public ZvtRunnable(LinkedBlockingQueue<ZvtMessage> messageQueue,
                       ZvtResponseCallback callback,
                       String hostname,
                       int port)
    {
        this.messageQueueRef = new WeakReference<>(messageQueue);
        this.zvtResponseCallbackWeakReference = new WeakReference<>(callback);
        this.hostname = hostname;
        this.port = port;
    }
    
    private void logSupportedOptions()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        {
            for (SocketOption<?> option : client.supportedOptions())
            {
                Log(TAG, String.format("Supported option: %s", option.name()));
            }
        }
    }
    
    @Override
    public void run()
    {
        try
        {
            final LinkedBlockingQueue<ZvtMessage> messageQueue = messageQueueRef.get();
            
            if (messageQueue != null)
            {
                ZvtMessage zvtMessage  = null;
                Command    currentFlow = Command.CMD_UNKNOWN;
                
                while (! (zvtMessage = messageQueue.take()).isShutdown())
                {
                    Log(TAG, "command: " + toHex(zvtMessage.command().apdu()));
                    
                    openAndConnectSocket();
                    
                    currentFlow = isA(zvtMessage.command());
                    
                    sendApdu(zvtMessage.command());
                    
                    boolean loop = true;

                    StringBuilder receipt061D = new StringBuilder();
                    
                    while (loop)
                    {
                        try
                        {
                            Apdu apdu = new Apdu(readApdu());
                            
                            onRawData(Hex.encodeHexString(apdu.apdu()));
                            
                            switch (isA(apdu))
                            {
                                case CMD_060F:
                                {
                                    Log(TAG, "Completion received ...");
                                    sendApdu(new Apdu(Command.CMD_8000));
                                    
                                    if (currentFlow == Command.CMD_0600)
                                    {
                                        CompletionForRegister       completionForRegister       = new CompletionForRegister(apdu);
                                        CompletionForRegisterResult completionForRegisterResult = new CompletionForRegisterResult();
                                        
                                        completionForRegisterResult.initialCommand = currentFlow.name();
                                        completionForRegisterResult.needInitialisation = completionForRegister.status().needInitialisation();
                                        completionForRegisterResult.needDiagnosis = completionForRegister.status().needDiagnosis();
                                        completionForRegisterResult.needOPTAction = completionForRegister.status().needOPTAction();
                                        completionForRegisterResult.fillingMachineMode = completionForRegister.status().fillingMachineMode();
                                        completionForRegisterResult.vendingMachineMode = completionForRegister.status().vendingMachineMode();
                                        completionForRegisterResult.status = completionForRegister.status().valueAsInt();
                                        completionForRegisterResult.response_apdu = Hex.encodeHexString(apdu.apdu());
                                        
                                        onCompletion(App.Gson().toJson(completionForRegisterResult, CompletionForRegisterResult.class));
                                        
                                        if (completionForRegister.status().needDiagnosis()
                                            || completionForRegister.status().needInitialisation()
                                            || completionForRegister.status().needOPTAction())
                                        {
                                            abortCommandFlow();
                                        }
                                    }
                                    else if (currentFlow == Command.CMD_0501)
                                    {
                                        CompletionForStatusResult               completionForStatus = new CompletionForStatusResult(apdu);
                                        de.lavego.sdk.CompletionForStatusResult result              = new de.lavego.sdk.CompletionForStatusResult();
                                        
                                        result.applications.addAll(completionForStatus.applications());
                                        result.serials.addAll(completionForStatus.serials());
                                        result.devices.addAll(completionForStatus.devices());
                                        result.versions.addAll(completionForStatus.versions());
                                        result.initialCommand = currentFlow.name();
                                        result.status = completionForStatus.status();
                                        result.version = completionForStatus.version();
                                        result.response_apdu = Hex.encodeHexString(apdu.apdu());
                                        
                                        onCompletion(App.Gson().toJson(result, de.lavego.sdk.CompletionForStatusResult.class));
                                        
                                        if (completionForStatus.status() != 0x00)
                                        {
                                            abortCommandFlow();
                                        }
                                    }
                                    else if (currentFlow == Command.CMD_0601)
                                    {
                                        //06 0F 00
                                        CompletionForAuthResult result = new CompletionForAuthResult();
                                        result.initialCommand = currentFlow.name();
                                        result.success = true;
                                        result.response_apdu = Hex.encodeHexString(apdu.apdu());
                                        onCompletion(App.Gson().toJson(result, CompletionForAuthResult.class));
                                    }
                                    else
                                    {
                                        //Log(TAG, "Completion not parsed: ToDo: Implent completion for " + currentFlow);
                                        CompletionForGenericResult completion = new CompletionForGenericResult();
                                        completion.initialCommand = currentFlow.name();
                                        completion.response_apdu = Hex.encodeHexString(apdu.apdu());
                                        onCompletion(App.Gson().toJson(completion, CompletionForGenericResult.class));
                                    }
                                    loop = false;
                                    break;
                                }
                                case CMD_04FF:
                                {
                                    Log(TAG, "IntermediateStatus received ...");
                                    sendApdu(new Apdu(Command.CMD_8000));
                                    IntermediateStatus       intermediateStatus = new IntermediateStatus(apdu);
                                    IntermediateStatusResult result             = new IntermediateStatusResult();
                                    result.initialCommand = currentFlow.name();
                                    result.status = intermediateStatus.status();
                                    result.timeout = intermediateStatus.timeout();
                                    result.message = intermediateStatus.message();
                                    Log(TAG, String.format("%-20s: %s", "intermediateStatus", intermediateStatus.status()));
                                    Log(TAG, String.format("%-20s: %s", "timeout", intermediateStatus.timeout()));
                                    Log(TAG, String.format("%-20s: %s", "TLV container", toHex(intermediateStatus.tlv().bitmap())));
                                    onIntermediateStatus(intermediateStatus.message());
                                    break;
                                }
                                case CMD_040F:
                                {
                                    Log(TAG, "Status received ...");
                                    sendApdu(new Apdu(Command.CMD_8000));
                                    onStatus(App.Gson().toJson(new TransactionData(new Status(apdu)), TransactionData.class));
                                    break;
                                }
                                case CMD_06D1:
                                {
                                    sendApdu(new Apdu(Command.CMD_8000));
                                    PrintLine printLine = new PrintLine(apdu);
                                    Log(TAG, String.format("Receipt (line) received for {%s} isLastLine={%s}", currentFlow, printLine.isLastLine()));

                                    receipt061D.append(printLine.text()).append("\n");

                                    if(printLine.isLastLine()) {
                                        onReceipt(receipt061D.toString());
                                        receipt061D = new StringBuilder();
                                    }
                                    break;
                                }
                                case CMD_06D3:
                                {
                                    Log(TAG, "Receipt (Block) received for " + currentFlow);
                                    sendApdu(new Apdu(Command.CMD_8000));
                                    BlockReceipt blockReceipt = new BlockReceipt(apdu);
                                    onReceipt(blockReceipt.text().toString());
                                    break;
                                }
                                case CMD_8000:
                                {
                                    Log(TAG, "Ack received for " + currentFlow);
                                    //special case LogOff 060200. After ACK received the loop will hang. Stop looping to process new commands
                                    if(currentFlow == Command.CMD_0602)
                                    {
                                        Log(TAG, "Ack after 0602 will end the inner loop.  Send new commands is possible now  " + currentFlow);
                                        loop = false;
                                    }
                                    break;
                                }
                                case CMD_061E:
                                {
                                    Log(TAG, "Abort received ...");
                                    sendApdu(new Apdu(Command.CMD_8000));
                                    
                                    de.lavego.sdk.Error error = new de.lavego.sdk.Error();
                                    error.initialCommand = currentFlow.name();
                                    error.error_message = String.format("Abort of command flow %s", currentFlow.name());
                                    
                                    if (apdu.length() > 0) { error.error_code = apdu.data()[0]; }
                                    
                                    onError(App.Gson().toJson(error, de.lavego.sdk.Error.class));
                                    
                                    if (currentFlow == Command.CMD_0601)
                                    {
                                        CompletionForAuthResult result = new CompletionForAuthResult();
                                        result.initialCommand = currentFlow.name();
                                        result.success = false;
                                    }
                                    
                                    abortCommandFlow();
                                    loop = false;
                                    break;
                                }
                                case CMD_84xx:
                                case CMD_8400:
                                case CMD_849A:
                                case CMD_849C:
                                {
                                    Log(TAG, String.format("NACK Error in currentFlow {%s} {%s}", currentFlow, toHex(apdu.apdu())));
                                    de.lavego.sdk.Error error = new de.lavego.sdk.Error();
                                    error.initialCommand = currentFlow.name();
                                    error.error_message = String.format("NACK of command flow %s", currentFlow.name());
                                    if (apdu.length() > 0) { error.error_code = apdu.data()[0]; }
                                    onError(App.Gson().toJson(error, de.lavego.sdk.Error.class));
                                    abortCommandFlow();
                                    loop = false;
                                    break;
                                }
                                default:
                                    abortCommandFlow();
                                    loop = false;
                                    break;
                            }
                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                            loop = false;
                        }
                    }
                    Log(TAG, "leaving readApdu loop and waiting for a new ZvtMessage");
                }
                
                Log(TAG, "leaving message loop and stopping socket channel");
                closeChannel();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Log(TAG, String.format("Exception: %s type=%s", e.getMessage(), e));
        }
    }
    
    private void openAndConnectSocket() throws IOException
    {
        final InetSocketAddress hostAddress = new InetSocketAddress(hostname, port);
        
        closeChannel();
        
        client = SocketChannel.open();
        channel = client.configureBlocking(true);
        client.socket().setSoTimeout(0);
        client.socket().setKeepAlive(true);
        client.socket().setTcpNoDelay(true);
        client.socket().setSoLinger(true, 0);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        {
            client.setOption(StandardSocketOptions.SO_KEEPALIVE, true);
            client.setOption(StandardSocketOptions.TCP_NODELAY, true);
            client.setOption(StandardSocketOptions.SO_REUSEADDR, true);
            client.setOption(StandardSocketOptions.SO_LINGER, 1);
        }
        
        client.connect(hostAddress);
        
        logSocketChannel();
        onSocketConnected(client.isConnected() && client.isOpen());
    }
    
    private void sendApdu(Apdu command)
            throws IOException
    {
        byte[] messageBytes = command.apdu();
        
        //Log(TAG, String.format("message length is %s", messageBytes.length));
        ByteBuffer requestBuffer = ByteBuffer.allocate(messageBytes.length).put(messageBytes);
        
        //Log(TAG, String.format("length byte array has a length of %s", requestBuffer.limit()));
        requestBuffer.flip();
        Log("TO_PT", toHex(requestBuffer.array()));
        
        client.write(ByteBuffer.wrap(messageBytes));
    }
    
    private byte[] readApdu()
            throws IOException
    {
        ByteArrayOutputStream bao    = new ByteArrayOutputStream();
        ByteBuffer            buffer = ByteBuffer.allocate(256);
        
        int read     = 0;
        int sum      = 0;
        int expected = - 1;
        
        while ((read = client.read(buffer)) != - 1)
        {
            sum += read;
            
            if (read > 0)
            {
                byte[] bytes = new byte[read];
                
                buffer.flip();
                buffer.get(bytes, 0, bytes.length);
                bao.write(bytes);
                // clear the buffer, if not we cannot receive all bytes!
                buffer.clear();
                //Log(TAG, toHex(bytes));
            }
            
            //now, we have CCRC + APRC + LENGTH_BYTE (the first length byte)
            if (sum > 2 && expected == - 1)
            {
                byte[] apdu = bao.toByteArray();
                
                // the third bytes is the length (smaller 0xff)
                if (asInt(apdu[2]) < 0xff) { expected = asInt(apdu[2]) + 3; }
                // we have a 3-byte length, read two more bytes (lo + hi)
                else if (sum > 4) { expected = asInt(apdu[3]) + (asInt(apdu[4]) * 256) + 5; }
            }
            
            //Log(TAG, String.format("readApdu bytes {%s} sum {%s} expected {%s}", read, sum, expected));
            if (sum == expected) { break; }
        }
        Log("FROM_PT", toHex(bao.toByteArray()));
        return bao.toByteArray();
    }
    
    @Override
    public void onRawData(@NonNull String hex)
    {
        final ZvtResponseCallback callback = callback();
        if (callback != null)
        {
            callback.onRawData(hex);
        }
    }
    
    private void abortCommandFlow()
    {
        final LinkedBlockingQueue<ZvtMessage> messageQueue = messageQueueRef.get();
        if (messageQueue != null)
        {
            messageQueue.clear();
            //messageQueue.add(new ZvtMessage());
        }
        else { android.util.Log.e("ERROR", "messageQueue " + messageQueue); }
    }
    
    private void closeChannel() throws IOException
    {
        if (client != null)
        {
            client.socket().close();
            client.close();
            client = null;
        }
    }
    
    private void logSocketChannel()
    {
        if (client != null)
        {
            try
            {
                Log(TAG,
                    String.format("host=%s, port=%s, channel.isOpen=%s, isConnected=%s, isConnectionPending=%s, isBlocking=%s, isOpen=%s, isRegistered=%s, finishConnect=%s"
                            , hostname
                            , port
                            , channel.isOpen()
                            , client.isConnected()
                            , client.isConnectionPending()
                            , client.isBlocking()
                            , client.isOpen()
                            , client.isRegistered()
                            , client.finishConnect()));
                
                /*
                Log(TAG, String.format("isBound=%s, isClosed=%s, isConnected=%s, isInputShutdown=%s, isOutputShutdown=%s",
                                       client.socket().isBound(),
                                       client.socket().isClosed(),
                                       client.socket().isConnected(),
                                       client.socket().isInputShutdown(),
                                       client.socket().isOutputShutdown()));
                */
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            Log(TAG, "client is null...");
        }
    }
    
    public final ZvtResponseCallback callback()
    {
        return this.zvtResponseCallbackWeakReference.get();
        //return zvtResponseCallback;
    }
    
    @Override
    public void onStatus(@NonNull String status)
    {
        final ZvtResponseCallback callback = callback();
        
        if (callback != null)
        {
            callback.onStatus(status);
        }
        else { android.util.Log.e("ERROR", "callback " + callback); }
    }
    
    @Override
    public void onIntermediateStatus(@NonNull String status)
    {
        final ZvtResponseCallback callback = callback();
        
        if (callback != null)
        {
            callback.onIntermediateStatus(status);
        }
        else { android.util.Log.e("ERROR", "callback " + callback); }
    }
    
    @Override
    public void onCompletion(@NonNull String completion)
    {
        final ZvtResponseCallback callback = callback();
        
        if (callback != null)
        {
            callback.onCompletion(completion);
        }
        else { android.util.Log.e("ERROR", "callback " + callback); }
    }
    
    @Override
    public void onReceipt(String receipt)
    {
        final ZvtResponseCallback callback = callback();
        
        if (callback != null)
        {
            callback.onReceipt(receipt);
        }
        else { android.util.Log.e("ERROR", "callback " + callback); }
    }
    
    @Override
    public void onError(@NonNull String error)
    {
        final ZvtResponseCallback callback = callback();
        
        if (callback != null)
        {
            callback.onError(error);
        }
        else { android.util.Log.e("ERROR", "callback " + callback); }
    }
    
    @Override
    public void onSocketConnected(boolean connected)
    {
        final ZvtResponseCallback callback = callback();
        
        if (callback != null)
        {
            callback.onSocketConnected(connected);
        }
        else { android.util.Log.e("ERROR", "callback " + callback); }
    }
}
