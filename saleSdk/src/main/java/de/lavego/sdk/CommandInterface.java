package de.lavego.sdk;

import androidx.annotation.NonNull;

public interface CommandInterface
{
    int doCustom(@NonNull byte[] apdu);
    int doDiagnosis(int type);
    int doLogin();
    int doPayment(@NonNull Payment payment);
    int doReconciliation();
    int doStatus();
    int doCancellation(int receiptNo);
}
