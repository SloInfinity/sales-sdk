// INexoPOI.aidl
package de.lavego.nexo;

// Declare any non-default types here with import statements
import de.lavego.sdk.IPaymentServiceCallback;

interface INexoPOIService {

    /** Request the process ID of this service, to do evil things with it. */
    int getPid();
    void connectTerminalAppDefault();
    void connectTerminalApp(String ip, int port);
    String login(String saleConfiguration);
    String logout(String saleConfiguration);
    String payment(String saleConfiguration, String paymentObject);
    void disconnectTerminal();
    void launchNexoFastApp();
    String reconciliation(String saleConfiguration);
    void addCallback(IPaymentServiceCallback callback);
    void removeCallback(IPaymentServiceCallback callback);
}
