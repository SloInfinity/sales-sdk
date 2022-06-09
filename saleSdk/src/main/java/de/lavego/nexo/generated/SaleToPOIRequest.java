//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{}MessageHeaderType"/>
 *         &lt;choice>
 *           &lt;element name="AbortRequest" type="{}AbortRequestType"/>
 *           &lt;element name="BalanceInquiryRequest" type="{}BalanceInquiryRequestType"/>
 *           &lt;element name="BatchRequest" type="{}BatchRequestType"/>
 *           &lt;element name="CardAcquisitionRequest" type="{}CardAcquisitionRequestType"/>
 *           &lt;element name="AdminRequest" type="{}AdminRequestType"/>
 *           &lt;element name="DiagnosisRequest" type="{}DiagnosisRequestType"/>
 *           &lt;element name="DisplayRequest" type="{}DisplayRequestType"/>
 *           &lt;element name="EnableServiceRequest" type="{}EnableServiceRequestType"/>
 *           &lt;element name="EventNotification" type="{}EventNotificationType"/>
 *           &lt;element name="GetTotalsRequest" type="{}GetTotalsRequestType"/>
 *           &lt;element name="InputRequest" type="{}InputRequestType"/>
 *           &lt;element name="InputUpdate" type="{}InputUpdateType"/>
 *           &lt;element name="LoginRequest" type="{}LoginRequestType"/>
 *           &lt;element name="LogoutRequest" type="{}LogoutRequestType"/>
 *           &lt;element name="LoyaltyRequest" type="{}LoyaltyRequestType"/>
 *           &lt;element name="PaymentRequest" type="{}PaymentRequestType"/>
 *           &lt;element name="PINRequest" type="{}PINRequestType"/>
 *           &lt;element name="PrintRequest" type="{}PrintRequestType"/>
 *           &lt;element name="CardReaderInitRequest" type="{}CardReaderInitRequestType"/>
 *           &lt;element name="CardReaderAPDURequest" type="{}CardReaderAPDURequestType"/>
 *           &lt;element name="CardReaderPowerOffRequest" type="{}CardReaderPowerOffRequestType"/>
 *           &lt;element name="ReconciliationRequest" type="{}ReconciliationRequestType"/>
 *           &lt;element name="ReversalRequest" type="{}ReversalRequestType"/>
 *           &lt;element name="SoundRequest" type="{}SoundRequestType"/>
 *           &lt;element name="StoredValueRequest" type="{}StoredValueRequestType"/>
 *           &lt;element name="TransactionReportRequest" type="{}TransactionReportRequestType"/>
 *           &lt;element name="TransactionStatusRequest" type="{}TransactionStatusRequestType"/>
 *           &lt;element name="TransmitRequest" type="{}TransmitRequestType"/>
 *         &lt;/choice>
 *         &lt;element name="SecurityTrailer" type="{}ContentInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
//<SaleToPOIRequest xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="nexoSaleToPOIMessages.xsd">
@Root(name = "SaleToPOIRequest", strict = false)
//@Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")
@Order(elements = {"MessageHeader"})
@NamespaceList({@Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")})
public class SaleToPOIRequest
{
    @Attribute(name = "noNamespaceSchemaLocation")
    @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")
    protected String                        schemaLocation;
    
    @Element(name = "MessageHeader", required = true)
    protected MessageHeaderType             messageHeader;
    @Element(name = "AbortRequest", required = false)
    protected AbortRequestType              abortRequest;
    @Element(name = "BalanceInquiryRequest", required = false)
    protected BalanceInquiryRequestType     balanceInquiryRequest;
    @Element(name = "BatchRequest", required = false)
    protected BatchRequestType              batchRequest;
    @Element(name = "CardAcquisitionRequest", required = false)
    protected CardAcquisitionRequestType    cardAcquisitionRequest;
    @Element(name = "AdminRequest", required = false)
    protected AdminRequestType              adminRequest;
    @Element(name = "DiagnosisRequest", required = false)
    protected DiagnosisRequestType          diagnosisRequest;
    @Element(name = "DisplayRequest", required = false)
    protected DisplayRequestType            displayRequest;
    @Element(name = "EnableServiceRequest", required = false)
    protected EnableServiceRequestType      enableServiceRequest;
    @Element(name = "EventNotification", required = false)
    protected EventNotificationType         eventNotification;
    @Element(name = "GetTotalsRequest", required = false)
    protected GetTotalsRequestType          getTotalsRequest;
    @Element(name = "InputRequest", required = false)
    protected InputRequestType              inputRequest;
    @Element(name = "InputUpdate", required = false)
    protected InputUpdateType               inputUpdate;
    @Element(name = "LoginRequest", required = false)
    protected LoginRequestType              loginRequest;
    @Element(name = "LogoutRequest", required = false)
    protected LogoutRequestType             logoutRequest;
    @Element(name = "LoyaltyRequest", required = false)
    protected LoyaltyRequestType            loyaltyRequest;
    @Element(name = "PaymentRequest", required = false)
    protected PaymentRequestType            paymentRequest;
    @Element(name = "PINRequest", required = false)
    protected PINRequestType                pinRequest;
    @Element(name = "PrintRequest", required = false)
    protected PrintRequestType              printRequest;
    @Element(name = "CardReaderInitRequest", required = false)
    protected CardReaderInitRequestType     cardReaderInitRequest;
    @Element(name = "CardReaderAPDURequest", required = false)
    protected CardReaderAPDURequestType     cardReaderAPDURequest;
    @Element(name = "CardReaderPowerOffRequest", required = false)
    protected CardReaderPowerOffRequestType cardReaderPowerOffRequest;
    @Element(name = "ReconciliationRequest", required = false)
    protected ReconciliationRequestType     reconciliationRequest;
    @Element(name = "ReversalRequest", required = false)
    protected ReversalRequestType           reversalRequest;
    @Element(name = "SoundRequest", required = false)
    protected SoundRequestType              soundRequest;
    @Element(name = "StoredValueRequest", required = false)
    protected StoredValueRequestType        storedValueRequest;
    @Element(name = "TransactionReportRequest", required = false)
    protected TransactionReportRequestType  transactionReportRequest;
    @Element(name = "TransactionStatusRequest", required = false)
    protected TransactionStatusRequestType  transactionStatusRequest;
    @Element(name = "TransmitRequest", required = false)
    protected TransmitRequestType           transmitRequest;
    @Element(name = "SecurityTrailer", required = false)
    protected ContentInformationType        securityTrailer;
    
    public SaleToPOIRequest()
    {
        setSchemaLocation("nexoSaleToPOIMessages.xsd");
    }
    
    public String getSchemaLocation()
    {
        return schemaLocation;
    }
    
    public void setSchemaLocation(String schemaLocation)
    {
        this.schemaLocation = schemaLocation;
    }
    
    /**
     * Ruft den Wert der abortRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link AbortRequestType }
     */
    public AbortRequestType getAbortRequest()
    {
        return abortRequest;
    }
    
    /**
     * Legt den Wert der abortRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link AbortRequestType }
     */
    public void setAbortRequest(AbortRequestType value)
    {
        this.abortRequest = value;
    }
    
    /**
     * Ruft den Wert der adminRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link AdminRequestType }
     */
    public AdminRequestType getAdminRequest()
    {
        return adminRequest;
    }
    
    /**
     * Legt den Wert der adminRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link AdminRequestType }
     */
    public void setAdminRequest(AdminRequestType value)
    {
        this.adminRequest = value;
    }
    
    /**
     * Ruft den Wert der balanceInquiryRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BalanceInquiryRequestType }
     */
    public BalanceInquiryRequestType getBalanceInquiryRequest()
    {
        return balanceInquiryRequest;
    }
    
    /**
     * Legt den Wert der balanceInquiryRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BalanceInquiryRequestType }
     */
    public void setBalanceInquiryRequest(BalanceInquiryRequestType value)
    {
        this.balanceInquiryRequest = value;
    }
    
    /**
     * Ruft den Wert der batchRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BatchRequestType }
     */
    public BatchRequestType getBatchRequest()
    {
        return batchRequest;
    }
    
    /**
     * Legt den Wert der batchRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BatchRequestType }
     */
    public void setBatchRequest(BatchRequestType value)
    {
        this.batchRequest = value;
    }
    
    /**
     * Ruft den Wert der cardAcquisitionRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardAcquisitionRequestType }
     */
    public CardAcquisitionRequestType getCardAcquisitionRequest()
    {
        return cardAcquisitionRequest;
    }
    
    /**
     * Legt den Wert der cardAcquisitionRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardAcquisitionRequestType }
     */
    public void setCardAcquisitionRequest(CardAcquisitionRequestType value)
    {
        this.cardAcquisitionRequest = value;
    }
    
    /**
     * Ruft den Wert der cardReaderAPDURequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardReaderAPDURequestType }
     */
    public CardReaderAPDURequestType getCardReaderAPDURequest()
    {
        return cardReaderAPDURequest;
    }
    
    /**
     * Legt den Wert der cardReaderAPDURequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardReaderAPDURequestType }
     */
    public void setCardReaderAPDURequest(CardReaderAPDURequestType value)
    {
        this.cardReaderAPDURequest = value;
    }
    
    /**
     * Ruft den Wert der cardReaderInitRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardReaderInitRequestType }
     */
    public CardReaderInitRequestType getCardReaderInitRequest()
    {
        return cardReaderInitRequest;
    }
    
    /**
     * Legt den Wert der cardReaderInitRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardReaderInitRequestType }
     */
    public void setCardReaderInitRequest(CardReaderInitRequestType value)
    {
        this.cardReaderInitRequest = value;
    }
    
    /**
     * Ruft den Wert der cardReaderPowerOffRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardReaderPowerOffRequestType }
     */
    public CardReaderPowerOffRequestType getCardReaderPowerOffRequest()
    {
        return cardReaderPowerOffRequest;
    }
    
    /**
     * Legt den Wert der cardReaderPowerOffRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardReaderPowerOffRequestType }
     */
    public void setCardReaderPowerOffRequest(CardReaderPowerOffRequestType value)
    {
        this.cardReaderPowerOffRequest = value;
    }
    
    /**
     * Ruft den Wert der diagnosisRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DiagnosisRequestType }
     */
    public DiagnosisRequestType getDiagnosisRequest()
    {
        return diagnosisRequest;
    }
    
    /**
     * Legt den Wert der diagnosisRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DiagnosisRequestType }
     */
    public void setDiagnosisRequest(DiagnosisRequestType value)
    {
        this.diagnosisRequest = value;
    }
    
    /**
     * Ruft den Wert der displayRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DisplayRequestType }
     */
    public DisplayRequestType getDisplayRequest()
    {
        return displayRequest;
    }
    
    /**
     * Legt den Wert der displayRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DisplayRequestType }
     */
    public void setDisplayRequest(DisplayRequestType value)
    {
        this.displayRequest = value;
    }
    
    /**
     * Ruft den Wert der enableServiceRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link EnableServiceRequestType }
     */
    public EnableServiceRequestType getEnableServiceRequest()
    {
        return enableServiceRequest;
    }
    
    /**
     * Legt den Wert der enableServiceRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link EnableServiceRequestType }
     */
    public void setEnableServiceRequest(EnableServiceRequestType value)
    {
        this.enableServiceRequest = value;
    }
    
    /**
     * Ruft den Wert der eventNotification-Eigenschaft ab.
     *
     * @return possible object is
     * {@link EventNotificationType }
     */
    public EventNotificationType getEventNotification()
    {
        return eventNotification;
    }
    
    /**
     * Legt den Wert der eventNotification-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link EventNotificationType }
     */
    public void setEventNotification(EventNotificationType value)
    {
        this.eventNotification = value;
    }
    
    /**
     * Ruft den Wert der getTotalsRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GetTotalsRequestType }
     */
    public GetTotalsRequestType getGetTotalsRequest()
    {
        return getTotalsRequest;
    }
    
    /**
     * Legt den Wert der getTotalsRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GetTotalsRequestType }
     */
    public void setGetTotalsRequest(GetTotalsRequestType value)
    {
        this.getTotalsRequest = value;
    }
    
    /**
     * Ruft den Wert der inputRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link InputRequestType }
     */
    public InputRequestType getInputRequest()
    {
        return inputRequest;
    }
    
    /**
     * Legt den Wert der inputRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link InputRequestType }
     */
    public void setInputRequest(InputRequestType value)
    {
        this.inputRequest = value;
    }
    
    /**
     * Ruft den Wert der inputUpdate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link InputUpdateType }
     */
    public InputUpdateType getInputUpdate()
    {
        return inputUpdate;
    }
    
    /**
     * Legt den Wert der inputUpdate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link InputUpdateType }
     */
    public void setInputUpdate(InputUpdateType value)
    {
        this.inputUpdate = value;
    }
    
    /**
     * Ruft den Wert der loginRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LoginRequestType }
     */
    public LoginRequestType getLoginRequest()
    {
        return loginRequest;
    }
    
    /**
     * Legt den Wert der loginRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LoginRequestType }
     */
    public void setLoginRequest(LoginRequestType value)
    {
        this.loginRequest = value;
    }
    
    /**
     * Ruft den Wert der logoutRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LogoutRequestType }
     */
    public LogoutRequestType getLogoutRequest()
    {
        return logoutRequest;
    }
    
    /**
     * Legt den Wert der logoutRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LogoutRequestType }
     */
    public void setLogoutRequest(LogoutRequestType value)
    {
        this.logoutRequest = value;
    }
    
    /**
     * Ruft den Wert der loyaltyRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LoyaltyRequestType }
     */
    public LoyaltyRequestType getLoyaltyRequest()
    {
        return loyaltyRequest;
    }
    
    /**
     * Legt den Wert der loyaltyRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LoyaltyRequestType }
     */
    public void setLoyaltyRequest(LoyaltyRequestType value)
    {
        this.loyaltyRequest = value;
    }
    
    /**
     * Ruft den Wert der messageHeader-Eigenschaft ab.
     *
     * @return possible object is
     * {@link MessageHeaderType }
     */
    public MessageHeaderType getMessageHeader()
    {
        return messageHeader;
    }
    
    /**
     * Legt den Wert der messageHeader-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link MessageHeaderType }
     */
    public void setMessageHeader(MessageHeaderType value)
    {
        this.messageHeader = value;
    }
    
    /**
     * Ruft den Wert der pinRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PINRequestType }
     */
    public PINRequestType getPINRequest()
    {
        return pinRequest;
    }
    
    /**
     * Legt den Wert der pinRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PINRequestType }
     */
    public void setPINRequest(PINRequestType value)
    {
        this.pinRequest = value;
    }
    
    /**
     * Ruft den Wert der paymentRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PaymentRequestType }
     */
    public PaymentRequestType getPaymentRequest()
    {
        return paymentRequest;
    }
    
    /**
     * Legt den Wert der paymentRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PaymentRequestType }
     */
    public void setPaymentRequest(PaymentRequestType value)
    {
        this.paymentRequest = value;
    }
    
    public PINRequestType getPinRequest()
    {
        return pinRequest;
    }
    
    public void setPinRequest(PINRequestType pinRequest)
    {
        this.pinRequest = pinRequest;
    }
    
    /**
     * Ruft den Wert der printRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PrintRequestType }
     */
    public PrintRequestType getPrintRequest()
    {
        return printRequest;
    }
    
    /**
     * Legt den Wert der printRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PrintRequestType }
     */
    public void setPrintRequest(PrintRequestType value)
    {
        this.printRequest = value;
    }
    
    /**
     * Ruft den Wert der reconciliationRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ReconciliationRequestType }
     */
    public ReconciliationRequestType getReconciliationRequest()
    {
        return reconciliationRequest;
    }
    
    /**
     * Legt den Wert der reconciliationRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ReconciliationRequestType }
     */
    public void setReconciliationRequest(ReconciliationRequestType value)
    {
        this.reconciliationRequest = value;
    }
    
    /**
     * Ruft den Wert der reversalRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ReversalRequestType }
     */
    public ReversalRequestType getReversalRequest()
    {
        return reversalRequest;
    }
    
    /**
     * Legt den Wert der reversalRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ReversalRequestType }
     */
    public void setReversalRequest(ReversalRequestType value)
    {
        this.reversalRequest = value;
    }
    
    /**
     * Ruft den Wert der securityTrailer-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ContentInformationType }
     */
    public ContentInformationType getSecurityTrailer()
    {
        return securityTrailer;
    }
    
    /**
     * Legt den Wert der securityTrailer-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ContentInformationType }
     */
    public void setSecurityTrailer(ContentInformationType value)
    {
        this.securityTrailer = value;
    }
    
    /**
     * Ruft den Wert der soundRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link SoundRequestType }
     */
    public SoundRequestType getSoundRequest()
    {
        return soundRequest;
    }
    
    /**
     * Legt den Wert der soundRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link SoundRequestType }
     */
    public void setSoundRequest(SoundRequestType value)
    {
        this.soundRequest = value;
    }
    
    /**
     * Ruft den Wert der storedValueRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link StoredValueRequestType }
     */
    public StoredValueRequestType getStoredValueRequest()
    {
        return storedValueRequest;
    }
    
    /**
     * Legt den Wert der storedValueRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link StoredValueRequestType }
     */
    public void setStoredValueRequest(StoredValueRequestType value)
    {
        this.storedValueRequest = value;
    }
    
    /**
     * Ruft den Wert der transactionReportRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TransactionReportRequestType }
     */
    public TransactionReportRequestType getTransactionReportRequest()
    {
        return transactionReportRequest;
    }
    
    /**
     * Legt den Wert der transactionReportRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TransactionReportRequestType }
     */
    public void setTransactionReportRequest(TransactionReportRequestType value)
    {
        this.transactionReportRequest = value;
    }
    
    /**
     * Ruft den Wert der transactionStatusRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TransactionStatusRequestType }
     */
    public TransactionStatusRequestType getTransactionStatusRequest()
    {
        return transactionStatusRequest;
    }
    
    /**
     * Legt den Wert der transactionStatusRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TransactionStatusRequestType }
     */
    public void setTransactionStatusRequest(TransactionStatusRequestType value)
    {
        this.transactionStatusRequest = value;
    }
    
    /**
     * Ruft den Wert der transmitRequest-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TransmitRequestType }
     */
    public TransmitRequestType getTransmitRequest()
    {
        return transmitRequest;
    }
    
    /**
     * Legt den Wert der transmitRequest-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TransmitRequestType }
     */
    public void setTransmitRequest(TransmitRequestType value)
    {
        this.transmitRequest = value;
    }
}
