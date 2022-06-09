package de.lavego.saleTerminal.ui.nexo.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CommandModel extends ViewModel
{
    private final MutableLiveData<Command> mlCommand;
    
    public CommandModel()
    {
        mlCommand = new MutableLiveData<>();
        mlCommand.setValue(new Command());
    }
    
    public MutableLiveData<Command> liveData()
    {
        return mlCommand;
    }
    
    public void post(@NonNull Command command)
    {
        mlCommand.postValue(command);
    }
    
    public void set(@NonNull Command command)
    {
        mlCommand.setValue(command);
    }
}
