package de.lavego.saleTerminal.ui.zvt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.lavego.saleTerminal.R;

public class DiagnosisFragment extends ZvtSubFragment
{
    public DiagnosisFragment() { setArguments(new Bundle()); }
    
    public static DiagnosisFragment newInstance()
    {
        return new DiagnosisFragment();
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        final View    root           = inflater.inflate(R.layout.diagnosis_fragment, container, false);
        final Spinner diagnosis_type = root.findViewById(R.id.diagnosis_type);
        final Button  send           = root.findViewById(R.id.send);
        
        send.setOnClickListener(v -> doDiagnosis(diagnosis_type.getSelectedItemPosition() + 1));
        
        return root;
    }
}
