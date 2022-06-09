package de.lavego.sdk;

import androidx.annotation.NonNull;

import java.math.BigDecimal;

public class Payment
{
    public BigDecimal amount   = BigDecimal.ZERO;
    public String     currency = "EUR";
    
    public Payment() {}
    
    public Payment(BigDecimal amount)
    {
        this.amount = amount;
    }
    
    public Payment(BigDecimal amount, String currency)
    {
        this.amount = amount;
        this.currency = currency;
    }
    
    public static Payment fromJson(@NonNull String payment)
    {
        return App.Gson().fromJson(payment, Payment.class);
    }
    
    public static String toJson(@NonNull Payment payment)
    {
        return App.Gson().toJson(payment, Payment.class);
    }
}
