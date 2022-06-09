package de.lavego.saleTerminal.ui.nexo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import de.lavego.saleTerminal.ui.nexo.model.Command;
import de.lavego.saleTerminal.ui.nexo.model.CommandModel;

public abstract class NexoBaseSubFragment extends Fragment implements Observer<Command>
{
    private CommandModel commandModel;
    
    @Nullable
    public final MutableLiveData<Command> liveData() { return commandModel != null ? commandModel.liveData() : null; }
    
    @Override
    public void onChanged(Command command)
    {
    }
    
    public abstract String tag();
    
    @Override
    @CallSuper
    public void onViewCreated(@NonNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        
        final Activity self = getActivity();
        
        if (self != null)
        {
            commandModel = new ViewModelProvider(getActivity()).get(CommandModel.class);
            commandModel.liveData().observe(getActivity(), this);
        }
    }
    
    public void post(@NonNull Command command)
    {
        if (commandModel != null)
        {
            commandModel.post(command);
        }
    }
}
