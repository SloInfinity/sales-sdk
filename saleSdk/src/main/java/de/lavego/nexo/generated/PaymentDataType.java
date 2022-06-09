//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the payment transaction. -- Usage:
 * 				Elements requested by the Sale System that are related to the payment
 * 				only.
 *
 * <p>Java-Klasse für PaymentDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardAcquisitionReference" type="{}TransactionIdentificationType" minOccurs="0"/>
 *         &lt;element name="RequestedValidityDate" type="{}ISODate" minOccurs="0"/>
 *         &lt;element name="Instalment" type="{}InstalmentType" minOccurs="0"/>
 *         &lt;element name="CustomerOrder" type="{}CustomerOrderType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PaymentType" type="{}PaymentTypeTypeCode" default="Normal" />
 *       &lt;attribute name="SplitPaymentFlag" type="{}SplitPaymentFlagType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentDataType {
    @Element(name = "CardAcquisitionReference", required = false)
    protected TransactionIdentificationType cardAcquisitionReference;
    @Element(name = "RequestedValidityDate", required = false)
    protected String requestedValidityDate;
    @Element(name = "Instalment", required = false)
    protected InstalmentType instalment;
    @Element(name = "CustomerOrder", required = false)
    protected CustomerOrderType customerOrder;
    @Element(name = "PaymentInstrumentData", required = false)
    protected PaymentInstrumentDataType paymentInstrumentData;
    @Attribute(name = "PaymentType", required = false)
    protected String paymentType;
    @Attribute(name = "SplitPaymentFlag", required = false)
    protected Boolean splitPaymentFlag;
    /**
     * Ruft den Wert der cardAcquisitionReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getCardAcquisitionReference() {
        return cardAcquisitionReference;
    }
    /**
     * Legt den Wert der cardAcquisitionReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setCardAcquisitionReference(TransactionIdentificationType value) {
        this.cardAcquisitionReference = value;
    }
    /**
     * Ruft den Wert der requestedValidityDate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestedValidityDate() {
        return requestedValidityDate;
    }
    /**
     * Legt den Wert der requestedValidityDate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestedValidityDate(String value) {
        this.requestedValidityDate = value;
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
     * Ruft den Wert der customerOrder-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CustomerOrderType }
     *
     */
    public CustomerOrderType getCustomerOrder() {
        return customerOrder;
    }
    /**
     * Legt den Wert der customerOrder-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CustomerOrderType }
     *
     */
    public void setCustomerOrder(CustomerOrderType value) {
        this.customerOrder = value;
    }
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
     * Ruft den Wert der splitPaymentFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isSplitPaymentFlag() {
        if (splitPaymentFlag == null) {
            return false;
        } else {
            return splitPaymentFlag;
        }
    }
    /**
     * Legt den Wert der splitPaymentFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSplitPaymentFlag(Boolean value) {
        this.splitPaymentFlag = value;
    }
}
