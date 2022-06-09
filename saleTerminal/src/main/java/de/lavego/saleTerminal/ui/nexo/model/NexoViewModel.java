package de.lavego.saleTerminal.ui.nexo.model;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NexoViewModel extends ViewModel
{
    private MutableLiveData<String> mText;
    
    public NexoViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Start Fragment...");
    }
    
    public LiveData<String> getText()
    {
        return mText;
    }
    
    public void post(@NonNull String text)
    {
        mText.postValue(text);
    }
    
    public void set(@NonNull String text)
    {
        mText.setValue(text);
    }
}
