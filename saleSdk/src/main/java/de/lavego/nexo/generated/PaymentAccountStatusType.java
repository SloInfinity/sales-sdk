//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the result of a Balance Inquiry
 * 				request.
 *
 * <p>Java-Klasse für PaymentAccountStatusType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentAccountStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentDataType" minOccurs="0"/>
 *         &lt;element name="PaymentAcquirerData" type="{}PaymentAcquirerDataType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAccountStatus" type="{}LoyaltyAccountStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Currency" type="{}ISOCurrency3A" />
 *       &lt;attribute name="CurrentBalance" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentAccountStatusType {
    @Element(name = "PaymentInstrumentData", required = false)
    protected PaymentInstrumentDataType paymentInstrumentData;
    @Element(name = "PaymentAcquirerData", required = false)
    protected PaymentAcquirerDataType paymentAcquirerData;
    @Element(name = "LoyaltyAccountStatus", required = false)
    protected LoyaltyAccountStatusType loyaltyAccountStatus;
    @Attribute(name = "Currency", required = false)
    protected String currency;
    @Attribute(name = "CurrentBalance", required = false)
    protected BigDecimal currentBalance;
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
     * Ruft den Wert der loyaltyAccountStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAccountStatusType }
     *
     */
    public LoyaltyAccountStatusType getLoyaltyAccountStatus() {
        return loyaltyAccountStatus;
    }
    /**
     * Legt den Wert der loyaltyAccountStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountStatusType }
     *
     */
    public void setLoyaltyAccountStatus(LoyaltyAccountStatusType value) {
        this.loyaltyAccountStatus = value;
    }
    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrency() {
        return currency;
    }
    /**
     * Legt den Wert der currency-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrency(String value) {
        this.currency = value;
    }
    /**
     * Ruft den Wert der currentBalance-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }
    /**
     * Legt den Wert der currentBalance-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }
}
