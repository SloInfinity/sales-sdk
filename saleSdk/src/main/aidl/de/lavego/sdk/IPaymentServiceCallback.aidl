// IPaymentServiceCallback.aidl
package de.lavego.sdk;

// Declare any non-default types here with import statements

interface IPaymentServiceCallback {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void onResponse(String response, int type);
    void onSocketConnected(boolean connected);
}
