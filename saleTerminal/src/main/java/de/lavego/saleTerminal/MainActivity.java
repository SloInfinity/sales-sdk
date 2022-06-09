package de.lavego.saleTerminal;

import static de.lavego.sdk.GoogleGson.Gson;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import org.apache.commons.codec.DecoderException;

import de.lavego.saleTerminal.ui.nexo.model.CommandModel;
import de.lavego.saleTerminal.ui.nexo.model.NexoViewModel;
import de.lavego.saleTerminal.ui.settings.SettingsFragment;
import de.lavego.saleTerminal.ui.settings.SettingsViewModel;
import de.lavego.saleTerminal.ui.zvt.RegisterViewModel;
import de.lavego.sdk.CommandInterface;
import de.lavego.sdk.CompletionForAuthResult;
import de.lavego.sdk.CompletionForGenericResult;
import de.lavego.sdk.Constants;
import de.lavego.sdk.Error;
import de.lavego.sdk.Payment;
import de.lavego.sdk.PaymentProtocol;
import de.lavego.sdk.PaymentTerminalActivity;
import de.lavego.sdk.SaleConfiguration;
import de.lavego.sdk.TransactionData;
import de.lavego.sdk.TransportConfiguration;
import de.lavego.zvt.ZvtResponseCallback;
import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Commons;
import de.lavego.zvt.cmds.CompletionForRegister;
import de.lavego.zvt.cmds.CompletionForStatusResult;

public class MainActivity extends PaymentTerminalActivity implements CommandInterface, ZvtResponseCallback
{
    private static final String                 TAG                    = "Main";
    private final        Handler                uiHandler              = new Handler(Looper.getMainLooper());
    private final        TransportConfiguration transportConfiguration = new TransportConfiguration();
    private final        SaleConfiguration      saleConfiguration      = new SaleConfiguration();
    
    private AppBarConfiguration mAppBarConfiguration;
    private NexoViewModel       nexoViewModel;
    private SettingsViewModel   settingsViewModel;
    private RegisterViewModel   registerViewModel;
    private CommandModel        commandModel;
    
    @Override
    public void onBackPressed()
    {
        try
        {
            final NavHostFragment navHostFragment
                    = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
            
            Log.v("NEXO", "onBackPressed navHostFragment " + (navHostFragment != null ? navHostFragment.getClass().getSimpleName() : navHostFragment));
            
            for (Fragment current : navHostFragment.getChildFragmentManager().getFragments())
            {
                if (current.isVisible() && current instanceof SettingsFragment)
                {
                    Log.v("NEXO", "onBackPressed finishAndRemoveTask  " + current);
                    closeApp();
                    return;
                }
            }
            super.onBackPressed();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void closeApp()
    {
        this.finish();
    }
    
    @Override
    public boolean onSupportNavigateUp()
    {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
               || super.onSupportNavigateUp();
    }
    
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.v("NEXO", "onDestroy");
    }
    
    @Nullable
    private ZvtResponseCallback zvtResponseCallback()
    {
        try
        {
            final NavHostFragment navHostFragment
                    = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
            
            for (Fragment current : navHostFragment.getChildFragmentManager().getFragments())
            {
                if (current.isVisible() && current instanceof ZvtResponseCallback)
                {
                    Log.d("Main", String.format("ZvtResponseCallback: %s", current));
                    return (ZvtResponseCallback) current;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return null;
    }
    
    @NonNull
    @Override
    public TransportConfiguration transportConfiguration()
    {
        return transportConfiguration;
    }
    
    @NonNull
    @Override
    public SaleConfiguration saleConfiguration()
    {
        return saleConfiguration;
    }
    
    public void launchSelf(int delayMillies)
    {
        final Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setClassName("de.lavego.saleTerminal", "de.lavego.saleTerminal.MainActivity");
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        
        uiHandler.postDelayed(() -> startActivity(intent), delayMillies);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final DrawerLayout      drawer         = findViewById(R.id.drawer_layout);
        final NavigationView    navigationView = findViewById(R.id.nav_view);
        final Menu              navMenu        = navigationView.getMenu();
        final SharedPreferences prefs          = getPreferences(MODE_PRIVATE);
        
        final Button close_btn = navigationView.findViewById(R.id.close_btn);
        
        if (close_btn != null)
        {
            close_btn.setOnClickListener(v -> closeApp());
        }
        
        nexoViewModel = new ViewModelProvider(this).get(NexoViewModel.class);
        commandModel = new ViewModelProvider(this).get(CommandModel.class);
        settingsViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        registerViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);
        
        saleConfiguration.applicationName = "LAVEGO SDK Demo";
        saleConfiguration.operatorId = "ah";
        saleConfiguration.saleId = "SaleTermA";
        saleConfiguration.poiId = "52500133";
        saleConfiguration.pin = prefs.getString("SaleConfiguration.pin", saleConfiguration.pin);
        saleConfiguration.zvtFlags.configByteRegister((byte) 0x9e);
        saleConfiguration.zvtFlags.serviceByteRegister((byte) 0x00);
        saleConfiguration.zvtFlags.serviceByteStatusEnquiry((byte) 0x04);
        
        transportConfiguration.host = prefs.getString("TransportConfiguration.host", transportConfiguration.host);
        transportConfiguration.port = prefs.getInt("TransportConfiguration.port", transportConfiguration.port);
        transportConfiguration.paymentProtocol
                = PaymentProtocol.valueOf(prefs.getString("TransportConfiguration.paymentProtocol", transportConfiguration.paymentProtocol.name()));
        
        commandModel.liveData().observe(this, command -> {
            Log.i(TAG, "Command: " + command.command());
            
            switch (command.command())
            {
                case Constants.LOGIN:
                    command(Constants.LOGIN);
                    break;
                case Constants.LOGOUT:
                    command(Constants.LOGOUT);
                    break;
                case Constants.RECONCILIATION:
                    command(Constants.RECONCILIATION);
                    break;
                case Constants.PAYMENT:
                    Log.i(TAG, String.format("Payment: %s", command.data()));
                    command.command(Constants.PAYMENT);
                    doPayment(Payment.fromJson(command.data()));
                    break;
            }
        });
        
        settingsViewModel.post(transportConfiguration());
        settingsViewModel.liveData().observe(this, configuration -> {
            Log.v(TAG, String.format("%s", configuration.toString()));
            prefs.edit().putString("TransportConfiguration.host", configuration.host).apply();
            prefs.edit().putInt("TransportConfiguration.port", configuration.port).apply();
            
            PaymentProtocol current = PaymentProtocol.valueOf(prefs.getString("TransportConfiguration.paymentProtocol", PaymentProtocol.Nexo.name()));
            
            if (current != configuration.paymentProtocol)
            {
                unbindService();
                bindService();
                switchNavMenu(navMenu);
            }
            prefs.edit().putString("TransportConfiguration.paymentProtocol", configuration.paymentProtocol.name()).apply();
        });
        
        registerViewModel.post(saleConfiguration().pin);
        registerViewModel.liveData().observe(this, password -> {
            Log.i(TAG, "PIN changed!");
            saleConfiguration.pin = password;
            prefs.edit().putString("SaleConfiguration.pin", saleConfiguration.pin).apply();
            Log.i("'TAG'", "posted password and call login");
            doLogin();
        });
        
        switchNavMenu(navMenu);
        
        // binds Zvt OR Nexo POIService. Depending on the PaymentProtocol value in TransportConfiguration
        bindService();
        
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.mobile_navigation)
                .setDrawerLayout(drawer)
                .build();
        
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }
    
    @Override
    public void onPaymentResult(@NonNull TransactionData transactionData)
    {
        Log.i("NEXO", "onPaymentResult ... ");
        nexoViewModel.post(transactionData.data);
        
        /**
         * TODO:
         *
         * We need to check the response.
         * In case of a signature launchSelf must be called if the customer is done with it...
         *
         * Plan: We want hide this Situation and check the values from the xml internally.
         */
        //launchSelf(350);
    }
    
    @Override
    public void onResponse(@NonNull String response, int type)
    {
        Log.i("NEXO", "onResponse ... ");
        
        Fragment current = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        
        Log.v("NEXO", "current " + current);
        
        nexoViewModel.post(response);
        
        if (type == Constants.RECONCILIATION)
        {
            launchSelf(350);
        }
    }
    
    private void switchNavMenu(Menu menu)
    {
        switch (transportConfiguration().paymentProtocol)
        {
            case Nexo:
                menu.findItem(R.id.nav_nexo).setEnabled(true);
                menu.findItem(R.id.nav_zvt).setEnabled(false);
                break;
            case Zvt:
                menu.findItem(R.id.nav_nexo).setEnabled(false);
                menu.findItem(R.id.nav_zvt).setEnabled(true);
                break;
        }
    }
    
    @Override
    public void onStatus(@NonNull String status)
    {
        super.onStatus(status);
        final ZvtResponseCallback responseCallback = zvtResponseCallback();
        
        if (responseCallback != null)
        {
            responseCallback.onStatus(status);
        }
    }
    
    @Override
    public void onIntermediateStatus(String status)
    {
        super.onIntermediateStatus(status);
        final ZvtResponseCallback responseCallback = zvtResponseCallback();
        
        if (responseCallback != null)
        {
            responseCallback.onIntermediateStatus(status);
        }
    }
    
    @Override
    public void onCompletion(String completion)
    {
        super.onCompletion(completion);
        
        CompletionForGenericResult result = Gson().fromJson(completion, CompletionForGenericResult.class);
        Commons.Command            comand = Commons.Command.valueOf(result.initialCommand);
        
        Log.i(TAG, String.format("onCompletion: initialCommand is %s", comand.name()));
        
        switch (comand)
        {
            case CMD_0600:
                CompletionForRegister registerResult = Gson().fromJson(completion, CompletionForRegister.class);
                break;
            case CMD_0501:
                CompletionForStatusResult sttusResult = Gson().fromJson(completion, CompletionForStatusResult.class);
                break;
            case CMD_0601:
                CompletionForAuthResult authResult = Gson().fromJson(completion, CompletionForAuthResult.class);
                break;
            default:
                try
                {
                    Apdu apdu = new Apdu(result.response_apdu);
                }
                catch (DecoderException e)
                {
                    e.printStackTrace();
                }
                break;
        }
        
        final ZvtResponseCallback responseCallback = zvtResponseCallback();
        
        if (responseCallback != null)
        {
            responseCallback.onCompletion(completion);
        }
    }
    
    @Override
    public void onReceipt(String receipt)
    {
        super.onReceipt(receipt);
        final ZvtResponseCallback responseCallback = zvtResponseCallback();
        
        if (responseCallback != null)
        {
            responseCallback.onReceipt(receipt);
        }
    }
    
    @Override
    public void onError(String error)
    {
        super.onError(error);
        final ZvtResponseCallback responseCallback = zvtResponseCallback();
        
        Error err = Gson().fromJson(error, Error.class);
        
        if (responseCallback != null)
        {
            responseCallback.onError(error);
        }
    }
}
