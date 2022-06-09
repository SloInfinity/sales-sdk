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

public class ReconciliationFragment extends ZvtSubFragment
{
    public ReconciliationFragment() { setArguments(new Bundle()); }
    
    public static ReconciliationFragment newInstance()
    {
        return new ReconciliationFragment();
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View   root = inflater.inflate(R.layout.reconciliation_fragment, container, false);
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
        
        send.setOnClickListener(v -> doReconciliation());
        
        return root;
    }
}
