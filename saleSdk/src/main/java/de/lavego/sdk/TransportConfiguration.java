package de.lavego.sdk;

import androidx.annotation.NonNull;

public class TransportConfiguration
{
    public String          host             = "127.0.0.1";
    public int             port             = 5555;
    public int             connections      = 1;
    public int             timeout_t1       = 5000;
    public int             timeout_t2       = 30;
    public int             max_message_size = 4096;
    public PaymentProtocol paymentProtocol  = PaymentProtocol.Nexo;
    
    @NonNull
    @Override
    public String toString()
    {
        return String.format("TransportConfiguration{host='%s', port=%s, connections=%s, timeout_t1=%s, timeout_t2=%s, max_message_size=%s, paymentProtocol=%s}",
                             host,
                             port,
                             connections,
                             timeout_t1,
                             timeout_t2,
                             max_message_size,
                             paymentProtocol);
    }
}
