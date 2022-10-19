package de.lavego.sdk;

import static de.lavego.zvt.api.Commons.isA;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.apache.commons.codec.DecoderException;

import de.lavego.nexo.INexoPOIService;
import de.lavego.nexo.NexoPOIService;
import de.lavego.zvt.ZvtPOIService;
import de.lavego.zvt.ZvtResponseCallback;
import de.lavego.zvt.api.Apdu;

public abstract class PaymentTerminalActivity extends AppCompatActivity implements ServiceConnection, CommandInterface, ZvtResponseCallback
{
    private final IPaymentServiceCallback.Stub iPaymentServiceCallback = new IPaymentServiceCallback.Stub()
    {
        @Override
        public void onResponse(String response, int type) throws RemoteException
        {
            Log.i("NEXO", String.format("onResponse type %s", type));
            Log.i("NEXO", String.format("onResponse%n%s", response));
            TransactionData result = new TransactionData();
            result.data = response;

            PaymentTerminalActivity.this.onResponse(response, type);

            if (type == Constants.PAYMENT) { PaymentTerminalActivity.this.onPaymentResult(result); }
            //else { PaymentTerminalActivity.this.onResponse(response, type); }
        }

        @Override
        public void onSocketConnected(boolean connected) throws RemoteException
        {
            Log.i("NEXO", String.format("onSocketConnected %s", connected));
        }
    };

    private INexoPOIService nexoPOIService = null;
    private ZvtPOIService   zvtPOIService  = null;

    public void bindService()
    {
        switch (transportConfiguration().paymentProtocol)
        {
            case Nexo:
                //startService(new Intent(getApplicationContext(), NexoPOIService.class));
                bindService(new Intent(getApplicationContext(), NexoPOIService.class), this, Context.BIND_AUTO_CREATE);
                break;
            case Zvt:
                //startService(new Intent(getApplicationContext(), ZvtPOIService.class));
                bindService(new Intent(getApplicationContext(), ZvtPOIService.class), this, Context.BIND_AUTO_CREATE);
                break;
        }
    }

    @NonNull
    public abstract TransportConfiguration transportConfiguration();

    @CallSuper
    public int command(int action)
    {
        if (nexoPOIService != null)
        {
            try
            {
                switch (action)
                {
                    case Constants.CONNECT:
                        nexoPOIService.connectTerminalApp(transportConfiguration().host, transportConfiguration().port);
                        return 0;
                    case Constants.LOGIN:
                        nexoPOIService.login(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                        return 0;
                    case Constants.LOGOUT:
                        nexoPOIService.logout(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                        return 0;
                    case Constants.RECONCILIATION:
                        nexoPOIService.reconciliation(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                        //nexoPOIService.launchNexoFastApp();
                        return 0;
                    case Constants.DISCONNECT:
                        nexoPOIService.disconnectTerminal();
                        return 0;
                    case Constants.START_NEXO_FAST:
                        //nexoPOIService.launchNexoFastApp();
                        return 0;
                }
                return 1;
            }
            catch (RemoteException e)
            {
                e.printStackTrace();
            }
        }
        else if (zvtPOIService != null)
        {
            Log.e("ZVT", "command not implemented yet");
        }

        return 1;
    }

    @NonNull
    public abstract SaleConfiguration saleConfiguration();

    /*
    @CallSuper
    public void doConnectTerminal()
    {
        Log.d("SDK", "connectTerminal");
        
        try
        {
            final TransportConfiguration tc = transportConfiguration();
            
            if (nexoPOIService != null)
            {
                Log.i("NEXO", "connectTerminal calls nexoPOIService.connectTerminalApp");
                nexoPOIService.connectTerminalApp(tc.host, tc.port);
            }
            else if (zvtPOIService != null)
            {
                Log.i("ZVT", "connectTerminal calls zvtPOIService.connectTerminal");
                zvtPOIService.connectTerminal(tc.host, tc.port);
            }
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
    }
    */
    @Override
    public int doCustom(@NonNull byte[] apdu)
    {
        try
        {
            if (zvtPOIService != null)
            {
                zvtPOIService.custom(apdu);
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return 1;
    }

    @Override
    public int doDiagnosis(int type)
    {
        try
        {
            if (zvtPOIService != null)
            {
                zvtPOIService.diagnosis(type);
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return 1;
    }

    @CallSuper
    @Override
    public int doLogin()
    {
        try
        {
            if (nexoPOIService != null)
            {
                nexoPOIService.login(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                return 0;
            }
            else if (zvtPOIService != null)
            {
                zvtPOIService.register(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return 1;
    }

    @CallSuper
    @Override
    public int doPayment(@NonNull Payment payment)
    {
        try
        {
            if (nexoPOIService != null)
            {
                nexoPOIService.payment(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class), App.Gson().toJson(payment, Payment.class));
                return 0;
            }
            else if (zvtPOIService != null)
            {
                zvtPOIService.payment(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class), App.Gson().toJson(payment, Payment.class));
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return 1;
    }

    @Override
    public int doReconciliation()
    {
        try
        {
            if (zvtPOIService != null)
            {
                zvtPOIService.reconciliation(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return 1;
    }

    @CallSuper
    @Override
    public int doStatus()
    {
        try
        {
            if (zvtPOIService != null)
            {
                zvtPOIService.status(App.Gson().toJson(saleConfiguration(), SaleConfiguration.class));
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return 1;
    }

    @Override
    public int doCancellation(int receiptNo)
    {
        try
        {
            if (zvtPOIService != null)
            {
                zvtPOIService.cancellation(receiptNo);
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return 1;
    }

    public abstract void launchSelf(int delayMillies);

    @Override
    @CallSuper
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    @CallSuper
    protected void onDestroy()
    {
        super.onDestroy();

        try
        {
            if (nexoPOIService != null)
            {
                //nexoPOIService.logout();
                nexoPOIService.disconnectTerminal();
            }
            else if (zvtPOIService != null)
            {
                zvtPOIService.disconnectTerminal();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        unbindService();
    }

    public void unbindService()
    {
        try
        {
            if (nexoPOIService != null) { stopService(new Intent(getApplicationContext(), NexoPOIService.class)); }
            if (zvtPOIService != null) { stopService(new Intent(getApplicationContext(), ZvtPOIService.class)); }
            if (nexoPOIService != null || zvtPOIService != null) { unbindService(this); }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            nexoPOIService = null;
            zvtPOIService = null;
        }
    }

    public abstract void onPaymentResult(@NonNull TransactionData result);

    @Override
    public void onRawData(@NonNull String hex)
    {
        try
        {
            Apdu apdu = new Apdu(hex);
            Log.i("ACTIVITY", String.format("onRawData: command: %s", isA(apdu)));
        }
        catch (DecoderException e)
        {
            e.printStackTrace();
            Log.i("ACTIVITY", String.format("onRawData: %n%s", hex));
        }
    }

    @Override
    public void onStatus(@NonNull String status)
    {
        Log.i("ACTIVITY", String.format("onStatus: %s", status));
    }

    @Override
    public void onIntermediateStatus(@NonNull String status)
    {
        Log.i("ACTIVITY", String.format("onIntermediateStatus: %s", status));
    }

    @Override
    public void onCompletion(@NonNull String completion)
    {
        Log.i("ACTIVITY", String.format("onCompletion: %s", completion));
    }

    @Override
    public void onReceipt(@NonNull String receipt)
    {
        Log.i("ACTIVITY", String.format("onReceipt: {%s}", receipt));
    }

    @Override
    public void onError(@NonNull String error)
    {
        Log.i("ACTIVITY", String.format("onError: {%s}", error));
    }

    @Override
    public void onSocketConnected(boolean connected)
    {
        Log.i("ACTIVITY", String.format("onSocketConnected %s", connected));
    }

    public abstract void onResponse(@NonNull String response, int type);

    @Override
    @CallSuper
    public void onServiceConnected(ComponentName name, IBinder service)
    {
        Log.d("SDK", String.format("onServiceConnected ComponentName %s pkg=%s", name.getClassName(), name.getPackageName()));

        try
        {
            final TransportConfiguration tc = transportConfiguration();

            if (name.getClassName().contains(NexoPOIService.class.getName()))
            {
                Log.i("NEXO", "onServiceConnected calls connectTerminalAppDefault");
                nexoPOIService = INexoPOIService.Stub.asInterface(service);
                nexoPOIService.addCallback(iPaymentServiceCallback);
                nexoPOIService.connectTerminalApp(tc.host, tc.port);
            }
            else if (name.getClassName().contains(ZvtPOIService.class.getName()))
            {
                Log.i("ZVT", "onServiceConnected calls connectTerminal");
                ZvtPOIService.ZvtPOIServiceLocalBinder serviceBinder = (ZvtPOIService.ZvtPOIServiceLocalBinder) service;
                zvtPOIService = serviceBinder.service();
                zvtPOIService.addCallback(PaymentTerminalActivity.this);
                zvtPOIService.connectTerminal(tc.host, tc.port);
            }
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    @CallSuper
    public void onServiceDisconnected(ComponentName name)
    {
        try
        {
            if (nexoPOIService != null) { nexoPOIService.removeCallback(iPaymentServiceCallback); }
            if (zvtPOIService != null) { zvtPOIService.removeCallback(PaymentTerminalActivity.this); }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            nexoPOIService = null;
            zvtPOIService = null;
        }
    }

    @CallSuper
    public void removeCallback()
    {
        try
        {
            if (nexoPOIService != null) { nexoPOIService.removeCallback(iPaymentServiceCallback); }
            if (zvtPOIService != null) { zvtPOIService.removeCallback(PaymentTerminalActivity.this); }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            nexoPOIService = null;
            zvtPOIService = null;
        }
    }

    @CallSuper
    public void addCallback()
    {
        try
        {
            if (nexoPOIService != null) { nexoPOIService.addCallback(iPaymentServiceCallback); }
            if (zvtPOIService != null) { zvtPOIService.addCallback(PaymentTerminalActivity.this); }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            nexoPOIService = null;
            zvtPOIService = null;
        }
    }
}
