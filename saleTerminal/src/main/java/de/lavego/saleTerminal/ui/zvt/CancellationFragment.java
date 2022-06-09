package de.lavego.saleTerminal.ui.zvt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import de.lavego.saleTerminal.R;

public class CancellationFragment extends ZvtSubFragment
{
    public CancellationFragment() { setArguments(new Bundle()); }
    
    public static CancellationFragment newInstance()
    {
        return new CancellationFragment();
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View              root      = inflater.inflate(R.layout.cancellation_fragment, container, false);
        final Button            send      = root.findViewById(R.id.send);
        final TextInputEditText receiptNo = root.findViewById(R.id.input_receipt_no);
    
        send.setOnClickListener(v -> {
            doCancellation(Integer.parseInt(Objects.requireNonNull(receiptNo.getText()).toString()));
        });
        
        return root;
    }
}
