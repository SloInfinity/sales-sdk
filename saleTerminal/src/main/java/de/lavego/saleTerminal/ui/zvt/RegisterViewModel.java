package de.lavego.saleTerminal.ui.zvt;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel
{
    private final MutableLiveData<String> password;
    
    public RegisterViewModel()
    {
        password = new MutableLiveData<>();
    }
    
    public LiveData<String> liveData()
    {
        return password;
    }
    
    public void post(@NonNull String pass)
    {
        this.password.postValue(pass);
    }
    
    public void set(@NonNull String pass)
    {
        password.setValue(pass);
    }
}
