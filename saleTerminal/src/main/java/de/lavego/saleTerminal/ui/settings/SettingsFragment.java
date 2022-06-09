package de.lavego.saleTerminal.ui.settings;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.textfield.TextInputEditText;

import de.lavego.saleTerminal.R;
import de.lavego.sdk.PaymentProtocol;
import de.lavego.sdk.TransportConfiguration;

public class SettingsFragment extends Fragment implements TextView.OnEditorActionListener, RadioGroup.OnCheckedChangeListener
{
    private static final String TAG = "Settings";
    
    private SettingsViewModel settingsViewModel;
    
    public static SettingsFragment newInstance()
    {
        return new SettingsFragment();
    }
    
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId)
    {
        if (settingsViewModel != null)
        {
            final TransportConfiguration configuration = settingsViewModel.liveData().getValue();
            
            if (checkedId == R.id.nexo_rb) { configuration.paymentProtocol = PaymentProtocol.Nexo; }
            else if (checkedId == R.id.zvt_rb) { configuration.paymentProtocol = PaymentProtocol.Zvt; }
            
            settingsViewModel.post(configuration);
        }
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View              root         = inflater.inflate(R.layout.settings_fragment, container, false);
        final TextInputEditText input_ip     = root.findViewById(R.id.input_ip);
        final TextInputEditText input_port   = root.findViewById(R.id.input_port);
        final RadioGroup        protocol_rbg = root.findViewById(R.id.protocol_rbg);
        final FragmentActivity  hostActivity = getActivity();
        
        input_ip.setOnEditorActionListener(this);
        input_port.setOnEditorActionListener(this);
        protocol_rbg.setOnCheckedChangeListener(this);
        
        if (hostActivity != null)
        {
            settingsViewModel = new ViewModelProvider(hostActivity).get(SettingsViewModel.class);
            
            final TransportConfiguration transportConfiguration = settingsViewModel.liveData().getValue();
            
            if (transportConfiguration != null)
            {
                switch (transportConfiguration.paymentProtocol)
                {
                    case Nexo:
                        protocol_rbg.check(R.id.nexo_rb);
                        break;
                    case Zvt:
                        protocol_rbg.check(R.id.zvt_rb);
                        break;
                }
            }
            
            settingsViewModel.liveData().observe(hostActivity, configuration -> {
                input_ip.setText(configuration.host);
                input_port.setText(String.valueOf(configuration.port));
                
                switch (configuration.paymentProtocol)
                {
                    case Nexo:
                        protocol_rbg.check(R.id.nexo_rb);
                        break;
                    case Zvt:
                        protocol_rbg.check(R.id.zvt_rb);
                        break;
                }
            });
        }
        
        return root;
    }
    
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
    {
        Log.v(TAG, String.format("actionId=%s", actionId));
        switch (actionId)
        {
            case EditorInfo.IME_ACTION_DONE:
            case EditorInfo.IME_ACTION_GO:
            case EditorInfo.IME_ACTION_NEXT:
            case EditorInfo.IME_ACTION_SEND:
            {
                if (settingsViewModel != null)
                {
                    final TransportConfiguration configuration = settingsViewModel.liveData().getValue();
                    
                    if (v.getId() == R.id.input_ip) {configuration.host = v.getText().toString(); }
                    else if (v.getId() == R.id.input_port) {configuration.port = Integer.parseInt(v.getText().toString());}
                    
                    settingsViewModel.post(configuration);
                }
                
                break;
            }
        }
        return false;
    }
}
