package de.lavego.saleTerminal.ui.nexo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;

import java.math.BigDecimal;

import de.lavego.saleTerminal.R;
import de.lavego.saleTerminal.ui.nexo.model.Command;
import de.lavego.sdk.Constants;
import de.lavego.sdk.Payment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaymentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaymentFragment extends NexoBaseSubFragment
{
    public PaymentFragment()
    {
        // Required empty public constructor
    }
    
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment PaymentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PaymentFragment newInstance()
    {
        PaymentFragment fragment = new PaymentFragment();
        Bundle          args     = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        if (getArguments() != null)
        {
        }
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        final View              root         = inflater.inflate(R.layout.fragment_payment, container, false);
        final Button            send         = root.findViewById(R.id.send);
        final TextInputEditText input_amount = root.findViewById(R.id.input_amount);
        
        send.setOnClickListener(v -> {
            post(new Command(Constants.PAYMENT, Payment.toJson(new Payment(new BigDecimal(input_amount.getText().toString()), "EUR")))); });
        return root;
    }
    
    @Override
    public String tag()
    {
        return "PaymentFragment";
    }
}
