package de.lavego.saleTerminal.ui.nexo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.lavego.saleTerminal.R;
import de.lavego.saleTerminal.ui.nexo.model.Command;
import de.lavego.sdk.Constants;

public class ReconciliationFragment extends NexoBaseSubFragment
{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View   root   = inflater.inflate(R.layout.fragment_logout, container, false);
        final Button logout = root.findViewById(R.id.logout);
        
        logout.setOnClickListener(v -> post(new Command(Constants.RECONCILIATION)));
        
        return root;
    }
    
    @Override
    public String tag()
    {
        return "ReconciliationFragment";
    }
}
