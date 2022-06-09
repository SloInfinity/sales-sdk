package de.lavego.saleTerminal.ui.zvt;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import de.lavego.sdk.Payment;

public class AmountViewModel extends ViewModel
{
    private final MutableLiveData<Payment> paymentData;
    
    public AmountViewModel()
    {
        paymentData = new MutableLiveData<>();
    }
    
    public LiveData<Payment> liveData()
    {
        return paymentData;
    }
    
    public void post(@NonNull Payment payment)
    {
        this.paymentData.postValue(payment);
    }
    
    public void set(@NonNull Payment payment)
    {
        paymentData.setValue(payment);
    }
}
