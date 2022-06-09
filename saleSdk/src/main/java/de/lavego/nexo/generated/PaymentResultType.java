//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Data related to the result of a processed payment
 * 				transaction. -- Usage: In the Message Response, the result of card payment
 * 				transaction.
 *
 * <p>Java-Klasse für PaymentResultType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentDataType" minOccurs="0"/>
 *         &lt;element name="AmountsResp" type="{}AmountsRespType" minOccurs="0"/>
 *         &lt;element name="Instalment" type="{}InstalmentType" minOccurs="0"/>
 *         &lt;element name="CurrencyConversion" type="{}CurrencyConversionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapturedSignature" type="{}CapturedSignatureType" minOccurs="0"/>
 *         &lt;element name="ProtectedSignature" type="{}ContentInformationType" minOccurs="0"/>
 *         &lt;element name="PaymentAcquirerData" type="{}PaymentAcquirerDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentType" type="{}PaymentTypeTypeCode" default="Normal" />
 *       &lt;attribute name="MerchantOverrideFlag" type="{}MerchantOverrideFlagType" default="false" />
 *       &lt;attribute name="CustomerLanguage" type="{}ISOLanguage2A" />
 *       &lt;attribute name="OnlineFlag" type="{}OnlineFlagType" default="true" />
 *       &lt;attribute name="AuthenticationMethod" type="{}AuthenticationMethodType" />
 *       &lt;attribute name="ValidityDate" type="{}ISODate" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@Root(strict = false)
public class PaymentResultType {
    // HACK: TransactionReference was given by nexoFast. But it'S not allowed
    //@Attribute(name = "TransactionReference", required = false)
    //protected String transactionReference;
    @Element(name = "PaymentInstrumentData", required = false)
    protected PaymentInstrumentDataType paymentInstrumentData;
    @Element(name = "AmountsResp", required = false)
    protected AmountsRespType amountsResp;
    @Element(name = "Instalment", required = false)
    protected InstalmentType instalment;
    @Element(name = "CurrencyConversion", required = false)
    protected List<CurrencyConversionType> currencyConversion;
    @Element(name = "CapturedSignature", required = false)
    protected CapturedSignatureType capturedSignature;
    @Element(name = "ProtectedSignature", required = false)
    protected ContentInformationType protectedSignature;
    @Element(name = "PaymentAcquirerData", required = false)
    protected PaymentAcquirerDataType paymentAcquirerData;
    @Attribute(name = "PaymentType", required = false)
    protected String paymentType;
    @Attribute(name = "MerchantOverrideFlag", required = false)
    protected Boolean merchantOverrideFlag;
    @Attribute(name = "CustomerLanguage", required = false)
    protected String customerLanguage;
    @Attribute(name = "OnlineFlag", required = false)
    protected Boolean onlineFlag;
    @Attribute(name = "AuthenticationMethod", required = false)
    protected List<String> authenticationMethod;
    @Attribute(name = "ValidityDate", required = false)
    protected String validityDate;
    
    //public String getTransactionReference()
    //{
    //    return transactionReference;
    //}
    
    //public void setTransactionReference(String transactionReference)
    //{
    //    this.transactionReference = transactionReference;
    //}
    
    /**
     * Ruft den Wert der paymentInstrumentData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentInstrumentDataType }
     *
     */
    public PaymentInstrumentDataType getPaymentInstrumentData() {
        return paymentInstrumentData;
    }
    /**
     * Legt den Wert der paymentInstrumentData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentDataType }
     *
     */
    public void setPaymentInstrumentData(PaymentInstrumentDataType value) {
        this.paymentInstrumentData = value;
    }
    /**
     * Ruft den Wert der amountsResp-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AmountsRespType }
     *
     */
    public AmountsRespType getAmountsResp() {
        return amountsResp;
    }
    /**
     * Legt den Wert der amountsResp-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AmountsRespType }
     *
     */
    public void setAmountsResp(AmountsRespType value) {
        this.amountsResp = value;
    }
    /**
     * Ruft den Wert der instalment-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InstalmentType }
     *
     */
    public InstalmentType getInstalment() {
        return instalment;
    }
    /**
     * Legt den Wert der instalment-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InstalmentType }
     *
     */
    public void setInstalment(InstalmentType value) {
        this.instalment = value;
    }
    /**
     * Gets the value of the currencyConversion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyConversion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyConversion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyConversionType }
     *
     *
     */
    public List<CurrencyConversionType> getCurrencyConversion() {
        if (currencyConversion == null) {
            currencyConversion = new ArrayList<CurrencyConversionType>();
        }
        return this.currencyConversion;
    }
    /**
     * Ruft den Wert der capturedSignature-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CapturedSignatureType }
     *
     */
    public CapturedSignatureType getCapturedSignature() {
        return capturedSignature;
    }
    /**
     * Legt den Wert der capturedSignature-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CapturedSignatureType }
     *
     */
    public void setCapturedSignature(CapturedSignatureType value) {
        this.capturedSignature = value;
    }
    /**
     * Ruft den Wert der protectedSignature-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ContentInformationType }
     *
     */
    public ContentInformationType getProtectedSignature() {
        return protectedSignature;
    }
    /**
     * Legt den Wert der protectedSignature-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ContentInformationType }
     *
     */
    public void setProtectedSignature(ContentInformationType value) {
        this.protectedSignature = value;
    }
    /**
     * Ruft den Wert der paymentAcquirerData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentAcquirerDataType }
     *
     */
    public PaymentAcquirerDataType getPaymentAcquirerData() {
        return paymentAcquirerData;
    }
    /**
     * Legt den Wert der paymentAcquirerData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentAcquirerDataType }
     *
     */
    public void setPaymentAcquirerData(PaymentAcquirerDataType value) {
        this.paymentAcquirerData = value;
    }
    /**
     * Ruft den Wert der paymentType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentType() {
        if (paymentType == null) {
            return "Normal";
        } else {
            return paymentType;
        }
    }
    /**
     * Legt den Wert der paymentType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }
    /**
     * Ruft den Wert der merchantOverrideFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isMerchantOverrideFlag() {
        if (merchantOverrideFlag == null) {
            return false;
        } else {
            return merchantOverrideFlag;
        }
    }
    /**
     * Legt den Wert der merchantOverrideFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMerchantOverrideFlag(Boolean value) {
        this.merchantOverrideFlag = value;
    }
    /**
     * Ruft den Wert der customerLanguage-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerLanguage() {
        return customerLanguage;
    }
    /**
     * Legt den Wert der customerLanguage-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerLanguage(String value) {
        this.customerLanguage = value;
    }
    /**
     * Ruft den Wert der onlineFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isOnlineFlag() {
        if (onlineFlag == null) {
            return true;
        } else {
            return onlineFlag;
        }
    }
    /**
     * Legt den Wert der onlineFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setOnlineFlag(Boolean value) {
        this.onlineFlag = value;
    }
    /**
     * Gets the value of the authenticationMethod property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenticationMethod property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenticationMethod().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAuthenticationMethod() {
        if (authenticationMethod == null) {
            authenticationMethod = new ArrayList<String>();
        }
        return this.authenticationMethod;
    }
    /**
     * Ruft den Wert der validityDate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValidityDate() {
        return validityDate;
    }
    /**
     * Legt den Wert der validityDate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValidityDate(String value) {
        this.validityDate = value;
    }
}
