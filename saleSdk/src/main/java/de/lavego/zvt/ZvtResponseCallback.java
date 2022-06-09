package de.lavego.zvt;

public interface ZvtResponseCallback
{
    void onRawData(String hex);
    void onStatus(String status);
    void onIntermediateStatus(String status);
    void onCompletion(String completion);
    void onReceipt(String receipt);
    void onError(String error);
    void onSocketConnected(boolean connected);
}
