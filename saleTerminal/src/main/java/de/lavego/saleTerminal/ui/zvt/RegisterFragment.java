package de.lavego.saleTerminal.ui.zvt;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.textfield.TextInputEditText;

import de.lavego.saleTerminal.R;

public class RegisterFragment extends ZvtSubFragment
{
    private RegisterViewModel registerViewModel;
    
    public RegisterFragment() { this.setArguments(new Bundle()); }
    
    public static RegisterFragment newInstance()
    {
        return new RegisterFragment();
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View              root           = inflater.inflate(R.layout.register_fragment, container, false);
        final TextInputEditText input_password = root.findViewById(R.id.input_password);
        final Button            send           = root.findViewById(R.id.send);
        final FragmentActivity  hostActivity   = getActivity();
        
        send.setOnClickListener(v -> doLogin(input_password.getText().toString()));
        
        if (hostActivity != null)
        {
            registerViewModel = registerViewModel != null ? registerViewModel : new ViewModelProvider(hostActivity).get(RegisterViewModel.class);
            registerViewModel.liveData().observe(hostActivity, input_password::setText);
            input_password.setText(registerViewModel.liveData().getValue());
        }
        return root;
    }
    
    private void doLogin(String password)
    {
        Log.i("REGISTER", "with password " + password);
        if (registerViewModel != null)
        {
            registerViewModel.post(password);
        }
        //doLogin();
    }
    
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        
        final FragmentActivity hostActivity = getActivity();
        if (hostActivity != null)
        {
            registerViewModel = new ViewModelProvider(hostActivity).get(RegisterViewModel.class);
        }
    }
}
