package de.lavego.saleTerminal.ui.zvt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

import de.lavego.saleTerminal.R;

public class StatusFragment extends ZvtSubFragment
{
    public StatusFragment() { setArguments(new Bundle()); }
    
    public static StatusFragment newInstance()
    {
        return new StatusFragment();
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View   root = inflater.inflate(R.layout.status_fragment, container, false);
        final Button send = root.findViewById(R.id.send);
        
        try
        {
            final TextInputEditText input_password = root.findViewById(R.id.input_password);
            @SuppressWarnings("ConstantConditions") final SharedPreferences prefs = getActivity().getPreferences(Context.MODE_PRIVATE);
            
            input_password.setText(prefs.getString("SaleConfiguration.pin", "010203"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        send.setOnClickListener(v -> doStatus());
        
        return root;
    }
}
