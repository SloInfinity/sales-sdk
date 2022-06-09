package de.lavego.nexo;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.NonNull;

import org.simpleframework.xml.Serializer;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import de.lavego.nexo.generated.AmountsReqType;
import de.lavego.nexo.generated.GenericProfileEnumeration;
import de.lavego.nexo.generated.LoginRequestType;
import de.lavego.nexo.generated.LoginResponseType;
import de.lavego.nexo.generated.LogoutRequestType;
import de.lavego.nexo.generated.LogoutResponseType;
import de.lavego.nexo.generated.LoyaltyHandlingEnumeration;
import de.lavego.nexo.generated.MessageCategoryEnumeration;
import de.lavego.nexo.generated.MessageClassEnumeration;
import de.lavego.nexo.generated.MessageHeaderType;
import de.lavego.nexo.generated.MessageTypeEnumeration;
import de.lavego.nexo.generated.PaymentDataType;
import de.lavego.nexo.generated.PaymentRequestType;
import de.lavego.nexo.generated.PaymentResponseType;
import de.lavego.nexo.generated.PaymentTransactionType;
import de.lavego.nexo.generated.PaymentTypeEnumeration;
import de.lavego.nexo.generated.ReconciliationRequestType;
import de.lavego.nexo.generated.ReconciliationResponseType;
import de.lavego.nexo.generated.ReconciliationTypeEnumeration;
import de.lavego.nexo.generated.SaleCapabilitiesEnumeration;
import de.lavego.nexo.generated.SaleDataType;
import de.lavego.nexo.generated.SaleProfileType;
import de.lavego.nexo.generated.SaleSoftwareType;
import de.lavego.nexo.generated.SaleTerminalDataType;
import de.lavego.nexo.generated.SaleToPOIRequest;
import de.lavego.nexo.generated.SaleToPOIResponse;
import de.lavego.nexo.generated.TerminalEnvironmentEnumeration;
import de.lavego.nexo.generated.TransactionConditionsType;
import de.lavego.nexo.generated.TransactionIdentificationType;
import de.lavego.sdk.App;
import de.lavego.sdk.Constants;
import de.lavego.sdk.IPaymentServiceCallback;
import de.lavego.sdk.Payment;
import de.lavego.sdk.SaleConfiguration;

public class NexoPOIService extends Service implements NexoResponseCallback
{
    private static final String TAG = "NEXO";
    
    private final LinkedBlockingQueue<NexoMessage>   messageQueue    = new LinkedBlockingQueue<>();
    private final ArrayList<IPaymentServiceCallback> remoteCallbacks = new ArrayList<>();
    private final Handler                            uiHandler       = new Handler(Looper.getMainLooper());
    
    private NexoSocketThread  nexoSocketThread = null;
    private SharedPreferences prefs            = null;
    
    private final INexoPOIService.Stub binder = new INexoPOIService.Stub()
    {
        public int getPid() { return Process.myPid(); }
        
        public void connectTerminalAppDefault()
        {
            try
            {
                nexoSocketThread = new NexoSocketThread(messageQueue, NexoPOIService.this);
                nexoSocketThread.start();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        public void connectTerminalApp(String hostname, int port)
        {
            try
            {
                nexoSocketThread = new NexoSocketThread(messageQueue, NexoPOIService.this, hostname, port);
                nexoSocketThread.start();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        public String login(@NonNull String saleConfiguration)
        {
            try
            {
                final SaleConfiguration configuration     = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
                SaleToPOIRequest        saleToPOIRequest  = new SaleToPOIRequest();
                MessageHeaderType       messageHeaderType = new MessageHeaderType();
                
                //messageHeaderType.setDeviceID("1234567890");
                messageHeaderType.setMessageCategory(MessageCategoryEnumeration.LOGIN.value());
                messageHeaderType.setMessageClass(MessageClassEnumeration.SERVICE.value());
                messageHeaderType.setMessageType(MessageTypeEnumeration.REQUEST.value());
                messageHeaderType.setSaleID(configuration.saleId);
                messageHeaderType.setServiceID(newServiceId());
                messageHeaderType.setProtocolVersion("3.0");
                messageHeaderType.setPOIID(configuration.poiId);
                
                saleToPOIRequest.setMessageHeader(messageHeaderType);
                
                LoginRequestType loginRequestType = new LoginRequestType();
                SaleSoftwareType softwareType     = new SaleSoftwareType();
                
                softwareType.setSoftwareVersion("0.7.1");
                softwareType.setApplicationName(configuration.applicationName);
                softwareType.setCertificationCode("01343423");
                softwareType.setProviderIdentification("LAV_PS");
                loginRequestType.setSaleSoftware(softwareType);
                loginRequestType.setTrainingModeFlag(configuration.trainingMode);
                
                SaleTerminalDataType terminalDataType = new SaleTerminalDataType();
                SaleProfileType      profileType      = new SaleProfileType();
                
                profileType.setGenericProfile(GenericProfileEnumeration.BASIC.value());
                //profileType.setGenericProfile(GenericProfileEnumeration.EXTENDED.value());
                //profileType.getServiceProfiles().add(ServiceProfilesEnumeration.Loyalty.value());
                //profileType.getServiceProfiles().add(ServiceProfilesEnumeration.PIN.value());
                //profileType.getServiceProfiles().add(ServiceProfilesEnumeration.CardReader.value());
                terminalDataType.getSaleCapabilities().add(SaleCapabilitiesEnumeration.CASHIER_STATUS.value());
                terminalDataType.getSaleCapabilities().add(SaleCapabilitiesEnumeration.CASHIER_DISPLAY.value());
                terminalDataType.getSaleCapabilities().add(SaleCapabilitiesEnumeration.CASHIER_ERROR.value());
                terminalDataType.getSaleCapabilities().add(SaleCapabilitiesEnumeration.CASHIER_INPUT.value());
                terminalDataType.getSaleCapabilities().add(SaleCapabilitiesEnumeration.PRINTER_RECEIPT.value());
                terminalDataType.getSaleCapabilities().add(SaleCapabilitiesEnumeration.PRINTER_VOUCHER.value());
                terminalDataType.setSaleProfile(profileType);
                terminalDataType.setTerminalEnvironment(TerminalEnvironmentEnumeration.ATTENDED.value());
                
                loginRequestType.setSaleTerminalData(terminalDataType);
                loginRequestType.setDateTime(Commons.isoDateTime());
                loginRequestType.setOperatorID(configuration.operatorId);
                loginRequestType.setOperatorLanguage(configuration.operatorLanguage);
                loginRequestType.setPOISerialNumber(configuration.poiSerialnumber);
                loginRequestType.setShiftNumber(configuration.shiftNumber);
                
                saleToPOIRequest.setLoginRequest(loginRequestType);
                
                NexoMessage nexoMessage = createNexoMessage(saleToPOIRequest, Constants.LOGIN);
                messageQueue.add(nexoMessage);
                return nexoMessage.getXml();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            return "";
        }
        
        public String logout(@NonNull String saleConfiguration)
        {
            try
            {
                final SaleConfiguration configuration     = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
                SaleToPOIRequest        saleToPOIRequest  = new SaleToPOIRequest();
                MessageHeaderType       messageHeaderType = new MessageHeaderType();
                
                //messageHeaderType.setDeviceID("1234567890");
                messageHeaderType.setMessageCategory(MessageCategoryEnumeration.LOGOUT.value());
                messageHeaderType.setMessageClass(MessageClassEnumeration.SERVICE.value());
                messageHeaderType.setMessageType(MessageTypeEnumeration.REQUEST.value());
                messageHeaderType.setServiceID(currentServiceId());
                messageHeaderType.setSaleID(configuration.saleId);
                messageHeaderType.setProtocolVersion("3.0");
                messageHeaderType.setPOIID(configuration.poiId);
                
                saleToPOIRequest.setMessageHeader(messageHeaderType);
                
                LogoutRequestType logoutRequestType = new LogoutRequestType();
                logoutRequestType.setMaintenanceAllowed(true);
                
                saleToPOIRequest.setLogoutRequest(logoutRequestType);
                
                NexoMessage nexoMessage = createNexoMessage(saleToPOIRequest, Constants.LOGOUT);
                messageQueue.add(nexoMessage);
                return nexoMessage.getXml();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            return "";
        }
        
        /*
                <?xml version="1.0" encoding="UTF-8"?>
                <SaleToPOIRequest xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="NexoSaleToPOIMessages.xsd">
                    <MessageHeader
                        MessageCategory="Payment"
                        MessageClass="Service"
                        MessageType="Request"
                        POIID="POITerm1"
                        SaleID="SaleTermA"
                        ServiceID="498"/>
                    <PaymentRequest>
                        <SaleData>
                            <SaleTransactionID TimeStamp="2020-0302T23:12:42.4+01:00" TransactionID="579"/>
                        </SaleData>
                        <PaymentTransaction>
                            <AmountsReq CashBackAmount="5" Currency="USD" RcncltnId="530061" RequestedAmount="10"/>
                            <TransactionConditions LoyaltyHandling="Forbidden"/>
                        </PaymentTransaction>
                        <PaymentData PaymentType="Normal"/>
                    </PaymentRequest>
                </SaleToPOIRequest>

         */
        public String payment(@NonNull String saleConfiguration, @NonNull String paymentObject)
        {
            try
            {
                final SaleConfiguration configuration     = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
                final Payment           payment           = App.Gson().fromJson(paymentObject, Payment.class);
                SaleToPOIRequest        saleToPOIRequest  = new SaleToPOIRequest();
                MessageHeaderType       messageHeaderType = new MessageHeaderType();
                
                messageHeaderType.setMessageCategory(MessageCategoryEnumeration.PAYMENT.value());
                messageHeaderType.setMessageClass(MessageClassEnumeration.SERVICE.value());
                messageHeaderType.setMessageType(MessageTypeEnumeration.REQUEST.value());
                messageHeaderType.setServiceID(currentServiceId());//newServiceId());
                messageHeaderType.setSaleID(configuration.saleId);
                messageHeaderType.setProtocolVersion("3.0");
                messageHeaderType.setPOIID(configuration.poiId);
                
                saleToPOIRequest.setMessageHeader(messageHeaderType);
                
                PaymentRequestType            paymentRequest            = new PaymentRequestType();
                SaleDataType                  saleData                  = new SaleDataType();
                TransactionIdentificationType transactionIdentification = new TransactionIdentificationType();
                
                transactionIdentification.setTimeStamp(Commons.isoDateTime());
                transactionIdentification.setTransactionID(newTransactionId());
                
                saleData.setSaleTransactionID(transactionIdentification);
                
                PaymentTransactionType    paymentTransaction    = new PaymentTransactionType();
                AmountsReqType            amountsReq            = new AmountsReqType();
                TransactionConditionsType transactionConditions = new TransactionConditionsType();
                
                amountsReq.setCurrency(payment.currency);
                amountsReq.setRequestedAmount(payment.amount);
                
                // HACK for buggy nexoFast app
                //amountsReq.setRcncltnId("530061");
                transactionConditions.setLoyaltyHandling(LoyaltyHandlingEnumeration.FORBIDDEN.value());
                
                paymentTransaction.setAmountsReq(amountsReq);
                paymentTransaction.setTransactionConditions(transactionConditions);
                
                PaymentDataType paymentData = new PaymentDataType();
                paymentData.setPaymentType(PaymentTypeEnumeration.NORMAL.value());
                
                paymentRequest.setSaleData(saleData);
                paymentRequest.setPaymentTransaction(paymentTransaction);
                paymentRequest.setPaymentData(paymentData);
                
                saleToPOIRequest.setPaymentRequest(paymentRequest);
                
                NexoMessage nexoMessage = createNexoMessage(saleToPOIRequest, Constants.PAYMENT);
                messageQueue.add(nexoMessage);
                return nexoMessage.getXml();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            return "";
        }
        
        public void disconnectTerminal()
        {
            // stop thread via poisioning
            messageQueue.add(new NexoMessage("shutdown", 0));
            nexoSocketThread.interrupt();
        }
        
        /*
            <activity android:name="com.girmiti.nexofast.SoftwareUpdateActivity" android:screenOrientation="portrait">
                <intent-filter>
                    <action android:name="android.intent.action.MAIN"/>
                    <category android:name="android.intent.category.LAUNCHER"/>
                </intent-filter>
            </activity>
         */
        public void launchNexoFastApp()
        {
            final Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setClassName("com.girmiti.nexofast", "com.girmiti.nexofast.SoftwareUpdateActivity");
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
            
            uiHandler.postDelayed(() -> startActivity(intent), 350);
        }
        
        /**
         *  <?xml version="1.0" encoding="UTF-8"?>
         *      <SaleToPOIRequest
         *          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         *          xsi:noNamespaceSchemaLocation="NexoSaleToPOIMessages.xsd">
         *      <MessageHeader MessageCategory="Reconciliation"
         *                  MessageClass="Service"
         *                  MessageType="Request"
         *                  POIID="POIServer"
         *                  SaleID="SaleServer"
         *                  ServiceID="498"/>
         *      <ReconciliationRequest ReconciliationType="SaleReconciliation"/>
         *      </SaleToPOIRequest>
         */
        public String reconciliation(@NonNull String saleConfiguration)
        {
            try
            {
                final SaleConfiguration configuration     = App.Gson().fromJson(saleConfiguration, SaleConfiguration.class);
                SaleToPOIRequest        saleToPOIRequest  = new SaleToPOIRequest();
                MessageHeaderType       messageHeaderType = new MessageHeaderType();
                
                messageHeaderType.setMessageCategory(MessageCategoryEnumeration.RECONCILIATION.value());
                messageHeaderType.setMessageClass(MessageClassEnumeration.SERVICE.value());
                messageHeaderType.setMessageType(MessageTypeEnumeration.REQUEST.value());
                messageHeaderType.setServiceID(currentServiceId());//newServiceId());
                messageHeaderType.setSaleID(configuration.saleId);
                messageHeaderType.setProtocolVersion("3.0");
                messageHeaderType.setPOIID(configuration.poiId);
                
                saleToPOIRequest.setMessageHeader(messageHeaderType);
                
                ReconciliationRequestType reconciliationRequest = new ReconciliationRequestType();
                reconciliationRequest.setReconciliationType(ReconciliationTypeEnumeration.SALE_RECONCILIATION.value());
                
                saleToPOIRequest.setReconciliationRequest(reconciliationRequest);
                
                NexoMessage nexoMessage = createNexoMessage(saleToPOIRequest, Constants.RECONCILIATION);
                messageQueue.add(nexoMessage);
                return nexoMessage.getXml();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return "";
        }
        
        public void addCallback(IPaymentServiceCallback callback)
        {
            remoteCallbacks.add(callback);
        }
        
        public void removeCallback(IPaymentServiceCallback callback)
        {
            remoteCallbacks.remove(callback);
        }
    };
    
    public NexoPOIService()
    {
    }
    
    private NexoMessage createNexoMessage(@NonNull SaleToPOIRequest saleToPOIRequest, int type) throws Exception
    {
        //Registry registry = new Registry();
        //registry.bind(SaleTerminalDataType.class, ScaleCapabilitiesConverter.class);
        //registry.bind(DateTime.class, DateTime.class);
        //registry.bind(TimeStamp.class, TimeStamp.class);
        //registry.bind(POITerminalDataType.class, POITerminalDataType.class);
        //registry.bind(ResponseType.class, ResponseType.class);
        //Strategy   strategy   = new RegistryStrategy(registry);
        Serializer serializer = Commons.serializer();//new Persister(strategy, new Format(0, "<?xml version=\"1.0\" encoding= \"UTF-8\" ?>"));
        
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        
        serializer.write(saleToPOIRequest, bao);
        
        return new NexoMessage(bao.toString("UTF-8"), type);
    }
    
    private String currentServiceId()
    {
        return String.format("00%s", prefs.getInt("ServiceId", 0));
    }
    
    private String currentTransactionId()
    {
        return String.format("00%s", prefs.getInt("TransactionID", 0));
    }
    
    private String newServiceId()
    {
        int saleId = prefs.getInt("ServiceId", 0) + 1;
        prefs.edit().putInt("ServiceId", saleId).apply();
        return String.format("00%s", saleId);
    }
    
    private String newTransactionId()
    {
        int transactionID = prefs.getInt("TransactionID", 0) + 1;
        prefs.edit().putInt("TransactionID", transactionID).apply();
        return String.format("00%s", transactionID);
    }
    
    @Override
    public void onCreate()
    {
        super.onCreate();
        prefs = getSharedPreferences("NEXO", Context.MODE_PRIVATE);
    }
    
    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }
    
    @Override
    public IBinder onBind(Intent intent)
    {
        // Return the interface
        return binder;
    }
    
    @Override
    public synchronized void onResponse(@NonNull SaleToPOIResponse saleToPOIResponse, int type)
    {
        try
        {
            switch (type)
            {
                case Constants.LOGIN:
                    LoginResponseType loginResponse = saleToPOIResponse.getLoginResponse();
//                    if(loginResponse != null)
//                    {
//                        loginResponse.getPOISystemData().getPOITerminalData().getPOICapabilities().add(POICapabilitiesEnumeration.CASH_HANDLING.value());
//
//                        POIProfileType profileType =  new POIProfileType();
//                        profileType.setGenericProfile(GenericProfileEnumeration.EXTENDED.value());
//                        profileType.getServiceProfiles().add(ServiceProfilesEnumeration.CardReader.value());
//                        profileType.getServiceProfiles().add(ServiceProfilesEnumeration.PIN.value());
//                        loginResponse.getPOISystemData().getPOITerminalData().setPOIProfile(profileType);
//                    }
                    Log.i("NEXO", String.format("LOGIN %s", loginResponse.getResponse().getResult()));
                    break;
                case Constants.LOGOUT:
                    LogoutResponseType logoutResponse = saleToPOIResponse.getLogoutResponse();
                    Log.i("NEXO", String.format("LOGOUT %s", logoutResponse.getResponse().getResult()));
                    break;
                case Constants.PAYMENT:
                    PaymentResponseType paymentResponse = saleToPOIResponse.getPaymentResponse();
                    Log.i("NEXO", String.format("PAYMENT %s", paymentResponse.getResponse().getResult()));
                    break;
                case Constants.RECONCILIATION:
                    ReconciliationResponseType reconciliationResponse = saleToPOIResponse.getReconciliationResponse();
                    Log.i("NEXO", String.format("RECONCILIATION %s", reconciliationResponse.getResponse().getResult()));
                    break;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try
        {
            Log.i(TAG, String.format("onResponse type is %s", type));
            
            for (IPaymentServiceCallback cb : remoteCallbacks)
            {
                try
                {
                    Log.i(TAG, String.format("onResponse type send to %s", cb));
                    cb.onResponse(Commons.serialize(saleToPOIResponse), type);
                }
                catch (RemoteException e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public synchronized void onSocketConnected(boolean connected)
    {
        try
        {
            Log.i(TAG, String.format("Socket connected is %s", connected));
            
            for (IPaymentServiceCallback cb : remoteCallbacks)
            {
                try
                {
                    Log.i(TAG, String.format("Socket connected send to %s", cb));
                    cb.onSocketConnected(connected);
                }
                catch (RemoteException e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
