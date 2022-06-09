package de.lavego.nexo;

import androidx.annotation.NonNull;

import de.lavego.nexo.generated.SaleToPOIResponse;

public interface NexoResponseCallback
{
    void onResponse(@NonNull SaleToPOIResponse response, int type);
    void onSocketConnected(boolean connected);
}
