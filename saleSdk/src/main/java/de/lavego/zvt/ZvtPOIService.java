package de.lavego.zvt;

import static de.lavego.zvt.api.Commons.Command.CMD_0670;
import static de.lavego.zvt.api.Commons.StringNumberToBCD;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import de.lavego.ISO4217;
import de.lavego.sdk.App;
import de.lavego.sdk.Payment;
import de.lavego.sdk.SaleConfiguration;
import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Bmp;
import de.lavego.zvt.api.Commons;
import de.lavego.zvt.api.Hex;
import de.lavego.zvt.cmds.Auth;
import de.lavego.zvt.cmds.DefaultRegister;
import de.lavego.zvt.cmds.Reversal;

public class ZvtPOIService extends Service implements ZvtResponseCallback
{
    private static final String TAG = "ZVT";
    
    private final LinkedBlockingQueue<ZvtMessage> messageQueue         = new LinkedBlockingQueue<>();
    private final ArrayList<ZvtResponseCallback>  remoteCallbacks      = new ArrayList<>();
    private final Handler                         uiHandler            = new Handler(Looper.getMainLooper());
    private final ExecutorService                 singleThreadExecutor = Executors.newSingleThreadExecutor();
    private final ZvtPOIServiceLocalBinder        binder               = new ZvtPOIServiceLocalBinder();
    private       Thread                          runnerThread;
    
    private ZvtRunnable       zvtRunnable = null;
    private SharedPreferences prefs       = null;
    
    public ZvtPOIService()
    {
    }
    
    public void addCallback(ZvtResponseCallback callback)
    {
        remoteCallbacks.add(callback);
    }
    
    public String cancellation(@NonNull int receiptNo)
    {
        try
        {
            messageQueue.add(new ZvtMessage(new Reversal(receiptNo)));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "";
    }
    
    public void connectTerminal(String hostname, int port)
    {
        singleThreadExecutor.submit(new ZvtRunnable(messageQueue, this, hostname, port));
    }
    
    public String custom(@NonNull byte[] apdu)
    {
        try
        {
            messageQueue.add(new ZvtMessage(new Apdu(apdu)));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return Hex.encodeHexString(apdu);
    }
    
    public String diagnosis(int diagnosisType)
    {
        try
        {
            if (diagnosisType < 0x01 || diagnosisType > 0x05) { diagnosisType = 0x01; }
            
            messageQueue.add(new ZvtMessage(new Apdu(CMD_0670).add(new byte[]{
                    0x06,
                    0x03,
                    0x1b,
                    0x01,
                    (byte) diagnosisType
            })));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "";
    }
    
    public void disconnectTerminal()
    {
        // stop thread via poisioning
        messageQueue.add(new ZvtMessage());
    }
    
    public int getPid() { return Process.myPid(); }
    
    @Override
    public void onCreate()
    {
        super.onCreate();
        prefs = getSharedPreferences(TAG, Context.MODE_PRIVATE);
    }
    
    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }
    
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        shutdown(3500L);
    }
    
    @SuppressWarnings("SameParameterValue")
    private void shutdown(long timeout)
    {
        try
        {
            singleThreadExecutor.shutdown();
            
            if (! singleThreadExecutor.awaitTermination(timeout, TimeUnit.MILLISECONDS))
            {
                singleThreadExecutor.shutdownNow();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            Log.v(TAG, "connectPt: shutdown");
        }
    }
    
    @Override
    public IBinder onBind(Intent intent)
    {
        android.util.Log.v(TAG, "onBind");
        // Return the interface
        return binder;
    }
    
    @Override
    public boolean onUnbind(Intent intent)
    {
        android.util.Log.v(TAG, "onUnbind");
        this.remoteCallbacks.clear();
        return super.onUnbind(intent);
    }
    
    @Override
    public void onRawData(String hex)
    {
        uiHandler.post(() -> {
            try
            {
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        cb.onRawData(hex);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    @Override
    public void onStatus(@NonNull String status)
    {
        uiHandler.post(() -> {
            try
            {
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        cb.onStatus(status);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    @Override
    public void onIntermediateStatus(@NonNull String status)
    {
        uiHandler.post(() -> {
            try
            {
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        cb.onIntermediateStatus(status);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    @Override
    public void onCompletion(@NonNull String completion)
    {
        uiHandler.post(() -> {
            try
            {
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        cb.onCompletion(completion);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    @Override
    public void onReceipt(@NonNull String receipt)
    {
        uiHandler.post(() -> {
            try
            {
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        cb.onReceipt(receipt);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    @Override
    public void onError(@NonNull String error)
    {
        uiHandler.post(() -> {
            try
            {
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        cb.onError(error);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    @Override
    public void onSocketConnected(boolean connected)
    {
        uiHandler.post(() -> {
            try
            {
                Log.i(TAG, String.format("Socket connected is %s", connected));
                
                for (ZvtResponseCallback cb : remoteCallbacks)
                {
                    try
                    {
                        Log.i(TAG, String.format("Socket connected send to %s", cb));
                        cb.onSocketConnected(connected);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
    
    public String payment(@NonNull String saleConfiguration, @NonNull String paymentObject)
    {
        try
        {
            Commons.Log("PAYMENT", paymentObject);
            Commons.Log("CONFIG", saleConfiguration);
            final SaleConfiguration configuration = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
            final Payment           payment       = App.Gson().fromJson(paymentObject, Payment.class);
            
            Commons.Log("PAYMENT", String.format("%s %s"
                    , ISO4217.ISOCurrency.byAlpha(payment.currency)
                    , ISO4217.ISOCurrency.byAlpha(payment.currency).codeAsTwoByteHex()));
            
            messageQueue.add(new ZvtMessage(new Auth(
                    payment.amount.intValue(),
                    configuration.zvtFlags.paymentType(),
                    ISO4217.ISOCurrency.byAlpha(payment.currency).codeAsTwoByteHex())));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
    
    public String reconciliation(@NonNull String saleConfiguration)
    {
        try
        {
            final SaleConfiguration configuration = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
            messageQueue.add(new ZvtMessage(new Apdu(Commons.Command.CMD_0650)
                                                    .add(StringNumberToBCD(configuration.pin, 3))));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "";
    }
    
    public String register(@NonNull String saleConfiguration)
    {
        try
        {
            final SaleConfiguration configuration = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
            messageQueue.add(new ZvtMessage(new DefaultRegister(configuration.pin,
                                                                configuration.zvtFlags.configByteRegister(),
                                                                configuration.zvtFlags.isoCurrencyRegister(),
                                                                configuration.zvtFlags.serviceByteRegister())));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
    
    public void removeCallback(ZvtResponseCallback callback)
    {
        remoteCallbacks.remove(callback);
    }
    
    public String status(@NonNull String saleConfiguration)
    {
        try
        {
            final SaleConfiguration configuration = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
            messageQueue.add(new ZvtMessage(new Apdu(Commons.Command.CMD_0501)
                                                    .add(StringNumberToBCD(configuration.pin, 3))
                                                    .add(new Bmp(0x03, configuration.zvtFlags.serviceByteStatusEnquiry()))
                                                    .add(new byte[]{
                                                            0x06,
                                                            0x07,
                                                            0x14,
                                                            0x01,
                                                            (byte) configuration.zvtFlags.languageByteStatusEnquiry(),
                                                            0x15,
                                                            0x02,
                                                            0x44,
                                                            0x45
                                                    })));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "";
    }
    
    public class ZvtPOIServiceLocalBinder extends Binder
    {
        public ZvtPOIService service()
        {
            // Return this instance of LocalService so clients can call public methods
            return ZvtPOIService.this;
        }
    }
}
