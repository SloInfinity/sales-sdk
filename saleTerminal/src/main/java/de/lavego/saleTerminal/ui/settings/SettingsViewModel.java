package de.lavego.saleTerminal.ui.settings;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import de.lavego.sdk.TransportConfiguration;

public class SettingsViewModel extends ViewModel
{
    private final MutableLiveData<TransportConfiguration> transportConfig;
    
    public SettingsViewModel()
    {
        transportConfig = new MutableLiveData<>();
    }
    
    public LiveData<TransportConfiguration> liveData()
    {
        return transportConfig;
    }
    
    public void post(@NonNull TransportConfiguration configuration)
    {
        transportConfig.postValue(configuration);
    }
    
    public void set(@NonNull TransportConfiguration configuration)
    {
        transportConfig.setValue(configuration);
    }
}
