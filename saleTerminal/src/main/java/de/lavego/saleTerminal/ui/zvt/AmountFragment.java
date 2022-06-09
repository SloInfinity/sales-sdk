package de.lavego.saleTerminal.ui.zvt;

import android.annotation.SuppressLint;
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

import java.math.BigDecimal;

import de.lavego.saleTerminal.R;
import de.lavego.sdk.Payment;

public class AmountFragment extends ZvtSubFragment
{
    private AmountViewModel amountViewModel;
    
    public AmountFragment() { this.setArguments(new Bundle()); }
    
    public static AmountFragment newInstance()
    {
        return new AmountFragment();
    }
    
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View root = inflater.inflate(R.layout.amount_fragment, container, false);
        
        final TextInputEditText input_amount = root.findViewById(R.id.input_amount);
        final Button            send         = root.findViewById(R.id.send);
        final FragmentActivity  hostActivity = getActivity();
        
        send.setOnClickListener(v -> {
            Payment payment = new Payment();
            String  amount  = input_amount.getText().toString();
            
            if (amount.matches("^\\d+$"))
            {
                payment.amount = new BigDecimal(input_amount.getText().toString());
                doPayment(payment);
            }
            else { Log.e("ZVT", String.format("Amount format or content wrong. Need Amount in CENT! {%s}", amount)); }
        });
        
        if (hostActivity != null)
        {
            amountViewModel = new ViewModelProvider(hostActivity).get(AmountViewModel.class);
            amountViewModel.liveData().observe(hostActivity, payment -> input_amount.setText(payment.amount.toString()));
        }
        
        return root;
    }
}
