package de.lavego.nexo;

import android.icu.util.Currency;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;

import org.simpleframework.xml.Serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetSocketAddress;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.LinkedBlockingQueue;

import de.lavego.nexo.generated.GenericProfileEnumeration;
import de.lavego.nexo.generated.GlobalStatusEnumeration;
import de.lavego.nexo.generated.LoginResponseType;
import de.lavego.nexo.generated.LogoutResponseType;
import de.lavego.nexo.generated.MessageCategoryEnumeration;
import de.lavego.nexo.generated.MessageClassEnumeration;
import de.lavego.nexo.generated.MessageHeaderType;
import de.lavego.nexo.generated.MessageTypeEnumeration;
import de.lavego.nexo.generated.POICapabilitiesEnumeration;
import de.lavego.nexo.generated.POIProfileType;
import de.lavego.nexo.generated.POISoftwareType;
import de.lavego.nexo.generated.POIStatusType;
import de.lavego.nexo.generated.POISystemDataType;
import de.lavego.nexo.generated.POITerminalDataType;
import de.lavego.nexo.generated.PrinterStatusEnumeration;
import de.lavego.nexo.generated.ResponseType;
import de.lavego.nexo.generated.ResultEnumeration;
import de.lavego.nexo.generated.SaleToPOIResponse;
import de.lavego.nexo.generated.ServiceProfilesEnumeration;
import de.lavego.nexo.generated.TerminalEnvironmentEnumeration;
import de.lavego.nexo.types.DateTime;
import de.lavego.saleSdk.BuildConfig;
import de.lavego.sdk.Constants;
import de.lavego.utils.ByteUtils;

public class NexoSocketThread extends Thread
{
    private static final String                                          TAG = "NEXO_TCP";
    private final        WeakReference<LinkedBlockingQueue<NexoMessage>> messageQueueRef;
    private final        WeakReference<NexoResponseCallback>             nexoResponseCallRef;
    private final        String                                          hostname;
    private final        int                                             port;
    
    private SocketChannel client = null;
    
    public NexoSocketThread(@NonNull LinkedBlockingQueue<NexoMessage> messageQueue, @NonNull NexoResponseCallback callback)
    {
        this.messageQueueRef = new WeakReference<>(messageQueue);
        this.nexoResponseCallRef = new WeakReference<>(callback);
        this.hostname = "localhost";
        this.port = 5555;
    }
    
    public NexoSocketThread(@NonNull LinkedBlockingQueue<NexoMessage> messageQueue
            , @NonNull NexoResponseCallback callback
            , @NonNull String hostname
            , int port)
    {
        this.messageQueueRef = new WeakReference<>(messageQueue);
        this.nexoResponseCallRef = new WeakReference<>(callback);
        this.hostname = hostname;
        this.port = port;
    }
    
    @Override
    public void run()
    {
        super.run();
        
        if (BuildConfig.BUILD_TYPE.equals("debug"))
        {
            test(Commons.serializer());
        }
        
        try
        {
            final InetSocketAddress                hostAddress  = new InetSocketAddress(hostname, port);
            final LinkedBlockingQueue<NexoMessage> messageQueue = messageQueueRef.get();
            
            final Serializer serializer = Commons.serializer();
            
            if (messageQueue != null)
            {
                NexoMessage message = null;
                
                client = SocketChannel.open();
                client.socket().setSoTimeout(0);
                
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                {
                    client.setOption(StandardSocketOptions.SO_KEEPALIVE, true);
                    client.setOption(StandardSocketOptions.TCP_NODELAY, true);
                }
                
                SelectableChannel channel = client.configureBlocking(true);
                client.connect(hostAddress);
                
                onSocketConnected(client.isConnected() && client.isOpen());
                
                while ((message = messageQueue.take()) != null)
                {
                    Log.d(TAG, "message: " + message.getXmlOnOneLine());
                    
                    if (message.getXml().equals("shutdown"))
                    {
                        Log.d(TAG, "shutdown queue");
                        break;
                    }
                    
                    // may be v3.0 does not accept '\n' --> .replaceAll("\\n", " ")
                    byte[] messageBytes = message.getXmlOnOneLine()
                                                 .replaceAll("\\n", " ")
                                                 .replaceAll("\\t", " ")
                                                 .replaceAll("\\r", " ")
                                                 .getBytes(StandardCharsets.UTF_8);
                    // 2-byte hack for current nexoFast Implementation is SHORT / BYTE
                    ByteBuffer requestBuffer = ByteBuffer.allocate(Integer.SIZE / Byte.SIZE)
                                                         .putInt(messageBytes.length);
                    
                    Log.v(TAG, String.format("message length is %s", messageBytes.length));
                    Log.v(TAG, String.format("length byte array has a length of %s", requestBuffer.limit()));
                    ByteUtils.printData(TAG, requestBuffer.array());
                    
                    requestBuffer = ByteBuffer.allocate(requestBuffer.limit() + messageBytes.length)
                                              .put(requestBuffer.array())
                                              .put(messageBytes);
                    requestBuffer.flip();
                    ByteUtils.printData(TAG, requestBuffer.array());
                    Log.w(TAG, "HACK for broken nexoFast app");
                    client.write(requestBuffer);
                    
                    // when send with leading length bytes
                    //client.write(ByteBuffer.wrap(messageBytes));
                    
                    //nexoFast v3.0
                    //byte[] newline = "\n".getBytes(StandardCharsets.UTF_8);
                    //ByteBuffer newlineBuffer = ByteBuffer.allocate(newline.length).put(newline);
                    //client.write(newlineBuffer);
                    
                    ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                    int        bytesRead  = client.read(readBuffer);
                    readBuffer.flip();
                    
                    Log.d(TAG, String.format("receiving %s bytes with position on %s", bytesRead, readBuffer.position()));
                    ByteUtils.printData(TAG, readBuffer.array());
                    
                    int calcReadBytes = readBuffer.get(0) == 0x3c ? bytesRead : bytesRead - (Integer.SIZE / Byte.SIZE);
    
                    // we receive the 4-byte  length bytes (need 4-byte)
                    readBuffer.position(Integer.SIZE / Byte.SIZE);
                    readBuffer.mark();
                    
                    byte[] responseArray = new byte[calcReadBytes];
                    
                    Log.d(TAG, String.format("bytesRead=%s,  calcReadBytes=%s, position=%s", bytesRead, calcReadBytes, readBuffer.position()));
                    
                    readBuffer.get(responseArray, 0, responseArray.length);
                    
                    String response = new String(responseArray, StandardCharsets.UTF_8);
                    
                    Log.v(TAG, String.format("response%n{%s}", response));
                    
                    try
                    {
                        final SaleToPOIResponse saleToPOIResponse =
                                message.getType() == Constants.RECONCILIATION
                                ? Commons.fixItFelixReconciliationResponse(response)
                                : serializer.read(SaleToPOIResponse.class, response);
                        final NexoResponseCallback responseCallback = nexoResponseCallRef.get();
                        if (responseCallback != null) { responseCallback.onResponse(saleToPOIResponse, message.getType()); }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
                
                Log.d(TAG, "leaving loop and stopping socket channel");
                client.socket().close();
                client.close();
            }
        }
        catch (Exception e)
        {
            Log.w(TAG, String.format("Exception: %s type=%s", e.getMessage(), e));
        }
        finally
        {
            onSocketConnected(false);
        }
    }
    
    @Override
    public void interrupt()
    {
        if (client != null && client.isOpen() && client.isConnected())
        {
            try
            {
                client.socket().close();
                client.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        super.interrupt();
    }
    
    private void test(@NonNull Serializer serializer)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        {
            for (Currency c : Currency.getAvailableCurrencies())
            {
                Log.v("CURRENCY", c.getCurrencyCode());
            }
        }
        
        // LoginResponse
        final SaleToPOIResponse saleToPOIResponse = new SaleToPOIResponse();
        final MessageHeaderType messageHeaderType = new MessageHeaderType();
        
        messageHeaderType.setDeviceID("deviceId");
        messageHeaderType.setMessageCategory(MessageCategoryEnumeration.LOGOUT.value());
        messageHeaderType.setMessageClass(MessageClassEnumeration.SERVICE.value());
        messageHeaderType.setMessageType(MessageTypeEnumeration.RESPONSE.value());
        messageHeaderType.setPOIID("POIId");
        messageHeaderType.setSaleID("saleId");
        messageHeaderType.setServiceID("serviceId");
        messageHeaderType.setProtocolVersion("3.0");
        
        saleToPOIResponse.setMessageHeader(messageHeaderType);
        
        final LogoutResponseType logoutResponseType = new LogoutResponseType();
        final LoginResponseType  loginResponseType  = new LoginResponseType();
        
        final POISystemDataType   poiSystemDataType   = new POISystemDataType();
        final POISoftwareType     poiSoftwareType     = new POISoftwareType();
        final POITerminalDataType poiTerminalDataType = new POITerminalDataType();
        final POIProfileType      poiProfileType      = new POIProfileType();
        final POIStatusType       poiStatusType       = new POIStatusType();
        final ResponseType        responseType        = new ResponseType();
        
        poiSoftwareType.setApplicationName("nexoFast 3.0");
        poiSoftwareType.setCertificationCode("0123456789");
        poiSoftwareType.setComponentDescription("Lavego AG nexoFAST implemention");
        poiSoftwareType.setComponentType("componentType");
        poiSoftwareType.setProviderIdentification("providerIdentification");
        poiSoftwareType.setSoftwareVersion("3.0");
        
        poiProfileType.setGenericProfile(GenericProfileEnumeration.STANDARD.value());
        poiProfileType.getServiceProfiles().add(ServiceProfilesEnumeration.PIN.value());
        poiProfileType.getServiceProfiles().add(ServiceProfilesEnumeration.Loyalty.value());
        poiProfileType.getServiceProfiles().add(ServiceProfilesEnumeration.Communication.value());
        poiProfileType.getServiceProfiles().add(ServiceProfilesEnumeration.CardReader.value());
        
        poiTerminalDataType.setPOIProfile(poiProfileType);
        poiTerminalDataType.setPOISerialNumber("PL09202T00002");
        poiTerminalDataType.setTerminalEnvironment(TerminalEnvironmentEnumeration.ATTENDED.value());
        poiTerminalDataType.setPOIProfile(poiProfileType);
        poiTerminalDataType.addPoiCapability(POICapabilitiesEnumeration.CASH_HANDLING);
        poiTerminalDataType.addPoiCapability(POICapabilitiesEnumeration.CASHIER_DISPLAY);
        poiTerminalDataType.addPoiCapability(POICapabilitiesEnumeration.CASHIER_ERROR);
        poiTerminalDataType.addPoiCapability(POICapabilitiesEnumeration.CASHIER_INPUT);
        poiTerminalDataType.addPoiCapability(POICapabilitiesEnumeration.ICC);
        poiTerminalDataType.addPoiCapability(POICapabilitiesEnumeration.MAG_STRIPE);
        
        poiStatusType.setCardReaderOKFlag(true);
        poiStatusType.setCommunicationOKFlag(true);
        poiStatusType.setFraudPreventionFlag(true);
        poiStatusType.setGlobalStatus(GlobalStatusEnumeration.OK.value());
        poiStatusType.setPEDOKFlag(true);
        poiStatusType.setPrinterStatus(PrinterStatusEnumeration.OUT_OF_ORDER.value());
        poiStatusType.setSecurityOKFlag(true);
        
        poiSystemDataType.setCustomerOrderStatus(true);
        poiSystemDataType.setDateTime(new DateTime());
        poiSystemDataType.setPOISoftware(poiSoftwareType);
        poiSystemDataType.setPOIStatus(poiStatusType);
        poiSystemDataType.setTokenRequestStatus(true);
        poiSystemDataType.setPOITerminalData(poiTerminalDataType);
        
        responseType.setResult(ResultEnumeration.SUCCESS.value());
        
        logoutResponseType.setResponse(responseType);
        
        saleToPOIResponse.setLogoutResponse(logoutResponseType);
        
        ByteArrayOutputStream bao      = new ByteArrayOutputStream();
        ByteArrayOutputStream baocheck = new ByteArrayOutputStream();
        
        /**
         * LogoutResponse
         */
        try
        {
            serializer.write(saleToPOIResponse, bao);
            
            Log.v("TEST", bao.toString("UTF-8"));
            
            SaleToPOIResponse saleToPOIResponseCheck = serializer.read(SaleToPOIResponse.class, bao.toString("UTF-8"));
            
            serializer.write(saleToPOIResponseCheck, baocheck);
            Log.v("TEST", baocheck.toString("UTF-8"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        /**
         * LoginResponse
         */
        loginResponseType.setPOISystemData(poiSystemDataType);
        loginResponseType.setResponse(responseType);
        saleToPOIResponse.setLogoutResponse(null);
        saleToPOIResponse.setLoginResponse(loginResponseType);
        
        bao.reset();
        baocheck.reset();
        
        try
        {
            serializer.write(saleToPOIResponse, bao);
            
            Log.v("TEST", bao.toString("UTF-8"));
            
            SaleToPOIResponse saleToPOIResponseCheck = serializer.read(SaleToPOIResponse.class, bao.toString("UTF-8"));
            
            serializer.write(saleToPOIResponseCheck, baocheck);
            Log.v("TEST", baocheck.toString("UTF-8"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void onSocketConnected(boolean connected)
    {
        final NexoResponseCallback nexoResponseCallback = this.nexoResponseCallRef.get();
        
        if (nexoResponseCallback != null)
        {
            nexoResponseCallback.onSocketConnected(connected);
        }
    }
}
