package de.lavego.saleTerminal.ui.nexo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

import de.lavego.saleTerminal.R;
import de.lavego.saleTerminal.ui.nexo.model.Command;
import de.lavego.sdk.Constants;

public class LoginFragment extends NexoBaseSubFragment
{
    private TextInputEditText username = null;
    private TextInputEditText password = null;
    private Button            login    = null;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        
        username = root.findViewById(R.id.username);
        password = root.findViewById(R.id.password);
        login = root.findViewById(R.id.login);
        
        login.setOnClickListener(v -> post(new Command(Constants.LOGIN)));
        
        return root;
    }
    
    @Override
    public String tag()
    {
        return "LoginFragment";
    }
    
    @Override
    public void onViewCreated(@NonNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
    }
}
