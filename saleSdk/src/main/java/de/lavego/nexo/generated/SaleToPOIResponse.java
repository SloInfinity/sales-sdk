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
 *           &lt;element name="BalanceInquiryResponse" type="{}BalanceInquiryResponseType"/>
 *           &lt;element name="BatchResponse" type="{}BatchResponseType"/>
 *           &lt;element name="CardAcquisitionResponse" type="{}CardAcquisitionResponseType"/>
 *           &lt;element name="AdminResponse" type="{}AdminResponseType"/>
 *           &lt;element name="DiagnosisResponse" type="{}DiagnosisResponseType"/>
 *           &lt;element name="DisplayResponse" type="{}DisplayResponseType"/>
 *           &lt;element name="EnableServiceResponse" type="{}EnableServiceResponseType"/>
 *           &lt;element name="GetTotalsResponse" type="{}GetTotalsResponseType"/>
 *           &lt;element name="InputResponse" type="{}InputResponseType"/>
 *           &lt;element name="LoginResponse" type="{}LoginResponseType"/>
 *           &lt;element name="LogoutResponse" type="{}LogoutResponseType"/>
 *           &lt;element name="LoyaltyResponse" type="{}LoyaltyResponseType"/>
 *           &lt;element name="PaymentResponse" type="{}PaymentResponseType"/>
 *           &lt;element name="PINResponse" type="{}PINResponseType"/>
 *           &lt;element name="PrintResponse" type="{}PrintResponseType"/>
 *           &lt;element name="CardReaderInitResponse" type="{}CardReaderInitResponseType"/>
 *           &lt;element name="CardReaderAPDUResponse" type="{}CardReaderAPDUResponseType"/>
 *           &lt;element name="CardReaderPowerOffResponse" type="{}CardReaderPowerOffResponseType"/>
 *           &lt;element name="ReconciliationResponse" type="{}ReconciliationResponseType"/>
 *           &lt;element name="ReversalResponse" type="{}ReversalResponseType"/>
 *           &lt;element name="SoundResponse" type="{}SoundResponseType"/>
 *           &lt;element name="StoredValueResponse" type="{}StoredValueResponseType"/>
 *           &lt;element name="TransactionReportResponse" type="{}TransactionReportResponseType"/>
 *           &lt;element name="TransactionStatusResponse" type="{}TransactionStatusResponseType"/>
 *           &lt;element name="TransmitResponse" type="{}TransmitResponseType"/>
 *         &lt;/choice>
 *         &lt;element name="SecurityTrailer" type="{}ContentInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Root(name = "SaleToPOIResponse", strict = false)
@Order(elements = {"MessageHeader"})
@NamespaceList({@Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")})
public class SaleToPOIResponse
{
    // HACK for nexoFast app, should required=true
    @Attribute(name = "noNamespaceSchemaLocation",required = false)
    @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")
    protected String                         schemaLocation;
    
    @Element(name = "MessageHeader", required = true)
    protected MessageHeaderType              messageHeader;
    @Element(name = "BalanceInquiryResponse", required = false)
    protected BalanceInquiryResponseType     balanceInquiryResponse;
    @Element(name = "BatchResponse", required = false)
    protected BatchResponseType              batchResponse;
    @Element(name = "CardAcquisitionResponse", required = false)
    protected CardAcquisitionResponseType    cardAcquisitionResponse;
    @Element(name = "AdminResponse", required = false)
    protected AdminResponseType              adminResponse;
    @Element(name = "DiagnosisResponse", required = false)
    protected DiagnosisResponseType          diagnosisResponse;
    @Element(name = "DisplayResponse", required = false)
    protected DisplayResponseType            displayResponse;
    @Element(name = "EnableServiceResponse", required = false)
    protected EnableServiceResponseType      enableServiceResponse;
    @Element(name = "GetTotalsResponse", required = false)
    protected GetTotalsResponseType          getTotalsResponse;
    @Element(name = "InputResponse", required = false)
    protected InputResponseType              inputResponse;
    @Element(name = "LoginResponse", required = false)
    protected LoginResponseType              loginResponse;
    @Element(name = "LogoutResponse", required = false)
    protected LogoutResponseType             logoutResponse;
    @Element(name = "LoyaltyResponse", required = false)
    protected LoyaltyResponseType            loyaltyResponse;
    @Element(name = "PaymentResponse", required = false)
    protected PaymentResponseType            paymentResponse;
    @Element(name = "PINResponse", required = false)
    protected PINResponseType                pinResponse;
    @Element(name = "PrintResponse", required = false)
    protected PrintResponseType              printResponse;
    @Element(name = "CardReaderInitResponse", required = false)
    protected CardReaderInitResponseType     cardReaderInitResponse;
    @Element(name = "CardReaderAPDUResponse", required = false)
    protected CardReaderAPDUResponseType     cardReaderAPDUResponse;
    @Element(name = "CardReaderPowerOffResponse", required = false)
    protected CardReaderPowerOffResponseType cardReaderPowerOffResponse;
    @Element(name = "ReconciliationResponse", required = false)
    protected ReconciliationResponseType     reconciliationResponse;
    @Element(name = "ReversalResponse", required = false)
    protected ReversalResponseType           reversalResponse;
    @Element(name = "SoundResponse", required = false)
    protected SoundResponseType              soundResponse;
    @Element(name = "StoredValueResponse", required = false)
    protected StoredValueResponseType        storedValueResponse;
    @Element(name = "TransactionReportResponse", required = false)
    protected TransactionReportResponseType  transactionReportResponse;
    @Element(name = "TransactionStatusResponse", required = false)
    protected TransactionStatusResponseType  transactionStatusResponse;
    @Element(name = "TransmitResponse", required = false)
    protected TransmitResponseType           transmitResponse;
    @Element(name = "SecurityTrailer", required = false)
    protected ContentInformationType         securityTrailer;
    
    public SaleToPOIResponse()
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
     * Ruft den Wert der adminResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link AdminResponseType }
     */
    public AdminResponseType getAdminResponse()
    {
        return adminResponse;
    }
    
    /**
     * Legt den Wert der adminResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link AdminResponseType }
     */
    public void setAdminResponse(AdminResponseType value)
    {
        this.adminResponse = value;
    }
    
    /**
     * Ruft den Wert der balanceInquiryResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BalanceInquiryResponseType }
     */
    public BalanceInquiryResponseType getBalanceInquiryResponse()
    {
        return balanceInquiryResponse;
    }
    
    /**
     * Legt den Wert der balanceInquiryResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BalanceInquiryResponseType }
     */
    public void setBalanceInquiryResponse(BalanceInquiryResponseType value)
    {
        this.balanceInquiryResponse = value;
    }
    
    /**
     * Ruft den Wert der batchResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BatchResponseType }
     */
    public BatchResponseType getBatchResponse()
    {
        return batchResponse;
    }
    
    /**
     * Legt den Wert der batchResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BatchResponseType }
     */
    public void setBatchResponse(BatchResponseType value)
    {
        this.batchResponse = value;
    }
    
    /**
     * Ruft den Wert der cardAcquisitionResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardAcquisitionResponseType }
     */
    public CardAcquisitionResponseType getCardAcquisitionResponse()
    {
        return cardAcquisitionResponse;
    }
    
    /**
     * Legt den Wert der cardAcquisitionResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardAcquisitionResponseType }
     */
    public void setCardAcquisitionResponse(CardAcquisitionResponseType value)
    {
        this.cardAcquisitionResponse = value;
    }
    
    /**
     * Ruft den Wert der cardReaderAPDUResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardReaderAPDUResponseType }
     */
    public CardReaderAPDUResponseType getCardReaderAPDUResponse()
    {
        return cardReaderAPDUResponse;
    }
    
    /**
     * Legt den Wert der cardReaderAPDUResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardReaderAPDUResponseType }
     */
    public void setCardReaderAPDUResponse(CardReaderAPDUResponseType value)
    {
        this.cardReaderAPDUResponse = value;
    }
    
    /**
     * Ruft den Wert der cardReaderInitResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardReaderInitResponseType }
     */
    public CardReaderInitResponseType getCardReaderInitResponse()
    {
        return cardReaderInitResponse;
    }
    
    /**
     * Legt den Wert der cardReaderInitResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardReaderInitResponseType }
     */
    public void setCardReaderInitResponse(CardReaderInitResponseType value)
    {
        this.cardReaderInitResponse = value;
    }
    
    /**
     * Ruft den Wert der cardReaderPowerOffResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link CardReaderPowerOffResponseType }
     */
    public CardReaderPowerOffResponseType getCardReaderPowerOffResponse()
    {
        return cardReaderPowerOffResponse;
    }
    
    /**
     * Legt den Wert der cardReaderPowerOffResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link CardReaderPowerOffResponseType }
     */
    public void setCardReaderPowerOffResponse(CardReaderPowerOffResponseType value)
    {
        this.cardReaderPowerOffResponse = value;
    }
    
    /**
     * Ruft den Wert der diagnosisResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DiagnosisResponseType }
     */
    public DiagnosisResponseType getDiagnosisResponse()
    {
        return diagnosisResponse;
    }
    
    /**
     * Legt den Wert der diagnosisResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DiagnosisResponseType }
     */
    public void setDiagnosisResponse(DiagnosisResponseType value)
    {
        this.diagnosisResponse = value;
    }
    
    /**
     * Ruft den Wert der displayResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link DisplayResponseType }
     */
    public DisplayResponseType getDisplayResponse()
    {
        return displayResponse;
    }
    
    /**
     * Legt den Wert der displayResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link DisplayResponseType }
     */
    public void setDisplayResponse(DisplayResponseType value)
    {
        this.displayResponse = value;
    }
    
    /**
     * Ruft den Wert der enableServiceResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link EnableServiceResponseType }
     */
    public EnableServiceResponseType getEnableServiceResponse()
    {
        return enableServiceResponse;
    }
    
    /**
     * Legt den Wert der enableServiceResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link EnableServiceResponseType }
     */
    public void setEnableServiceResponse(EnableServiceResponseType value)
    {
        this.enableServiceResponse = value;
    }
    
    /**
     * Ruft den Wert der getTotalsResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link GetTotalsResponseType }
     */
    public GetTotalsResponseType getGetTotalsResponse()
    {
        return getTotalsResponse;
    }
    
    /**
     * Legt den Wert der getTotalsResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link GetTotalsResponseType }
     */
    public void setGetTotalsResponse(GetTotalsResponseType value)
    {
        this.getTotalsResponse = value;
    }
    
    /**
     * Ruft den Wert der inputResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link InputResponseType }
     */
    public InputResponseType getInputResponse()
    {
        return inputResponse;
    }
    
    /**
     * Legt den Wert der inputResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link InputResponseType }
     */
    public void setInputResponse(InputResponseType value)
    {
        this.inputResponse = value;
    }
    
    /**
     * Ruft den Wert der loginResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LoginResponseType }
     */
    public LoginResponseType getLoginResponse()
    {
        return loginResponse;
    }
    
    /**
     * Legt den Wert der loginResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LoginResponseType }
     */
    public void setLoginResponse(LoginResponseType value)
    {
        this.loginResponse = value;
    }
    
    /**
     * Ruft den Wert der logoutResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LogoutResponseType }
     */
    public LogoutResponseType getLogoutResponse()
    {
        return logoutResponse;
    }
    
    /**
     * Legt den Wert der logoutResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LogoutResponseType }
     */
    public void setLogoutResponse(LogoutResponseType value)
    {
        this.logoutResponse = value;
    }
    
    /**
     * Ruft den Wert der loyaltyResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link LoyaltyResponseType }
     */
    public LoyaltyResponseType getLoyaltyResponse()
    {
        return loyaltyResponse;
    }
    
    /**
     * Legt den Wert der loyaltyResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link LoyaltyResponseType }
     */
    public void setLoyaltyResponse(LoyaltyResponseType value)
    {
        this.loyaltyResponse = value;
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
     * Ruft den Wert der pinResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PINResponseType }
     */
    public PINResponseType getPINResponse()
    {
        return pinResponse;
    }
    
    /**
     * Legt den Wert der pinResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PINResponseType }
     */
    public void setPINResponse(PINResponseType value)
    {
        this.pinResponse = value;
    }
    
    /**
     * Ruft den Wert der paymentResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PaymentResponseType }
     */
    public PaymentResponseType getPaymentResponse()
    {
        return paymentResponse;
    }
    
    /**
     * Legt den Wert der paymentResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PaymentResponseType }
     */
    public void setPaymentResponse(PaymentResponseType value)
    {
        this.paymentResponse = value;
    }
    
    /**
     * Ruft den Wert der printResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link PrintResponseType }
     */
    public PrintResponseType getPrintResponse()
    {
        return printResponse;
    }
    
    /**
     * Legt den Wert der printResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link PrintResponseType }
     */
    public void setPrintResponse(PrintResponseType value)
    {
        this.printResponse = value;
    }
    
    /**
     * Ruft den Wert der reconciliationResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ReconciliationResponseType }
     */
    public ReconciliationResponseType getReconciliationResponse()
    {
        return reconciliationResponse;
    }
    
    /**
     * Legt den Wert der reconciliationResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ReconciliationResponseType }
     */
    public void setReconciliationResponse(ReconciliationResponseType value)
    {
        this.reconciliationResponse = value;
    }
    
    /**
     * Ruft den Wert der reversalResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ReversalResponseType }
     */
    public ReversalResponseType getReversalResponse()
    {
        return reversalResponse;
    }
    
    /**
     * Legt den Wert der reversalResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ReversalResponseType }
     */
    public void setReversalResponse(ReversalResponseType value)
    {
        this.reversalResponse = value;
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
     * Ruft den Wert der soundResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link SoundResponseType }
     */
    public SoundResponseType getSoundResponse()
    {
        return soundResponse;
    }
    
    /**
     * Legt den Wert der soundResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link SoundResponseType }
     */
    public void setSoundResponse(SoundResponseType value)
    {
        this.soundResponse = value;
    }
    
    /**
     * Ruft den Wert der storedValueResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link StoredValueResponseType }
     */
    public StoredValueResponseType getStoredValueResponse()
    {
        return storedValueResponse;
    }
    
    /**
     * Legt den Wert der storedValueResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link StoredValueResponseType }
     */
    public void setStoredValueResponse(StoredValueResponseType value)
    {
        this.storedValueResponse = value;
    }
    
    /**
     * Ruft den Wert der transactionReportResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TransactionReportResponseType }
     */
    public TransactionReportResponseType getTransactionReportResponse()
    {
        return transactionReportResponse;
    }
    
    /**
     * Legt den Wert der transactionReportResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TransactionReportResponseType }
     */
    public void setTransactionReportResponse(TransactionReportResponseType value)
    {
        this.transactionReportResponse = value;
    }
    
    /**
     * Ruft den Wert der transactionStatusResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TransactionStatusResponseType }
     */
    public TransactionStatusResponseType getTransactionStatusResponse()
    {
        return transactionStatusResponse;
    }
    
    /**
     * Legt den Wert der transactionStatusResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TransactionStatusResponseType }
     */
    public void setTransactionStatusResponse(TransactionStatusResponseType value)
    {
        this.transactionStatusResponse = value;
    }
    
    /**
     * Ruft den Wert der transmitResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link TransmitResponseType }
     */
    public TransmitResponseType getTransmitResponse()
    {
        return transmitResponse;
    }
    
    /**
     * Legt den Wert der transmitResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link TransmitResponseType }
     */
    public void setTransmitResponse(TransmitResponseType value)
    {
        this.transmitResponse = value;
    }
}
