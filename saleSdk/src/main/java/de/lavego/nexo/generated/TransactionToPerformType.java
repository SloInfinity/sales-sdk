//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Data related to the batch of transactions to
 * 				perform.
 *
 * <p>Java-Klasse für TransactionToPerformType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionToPerformType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PaymentRequest" type="{}PaymentRequestType" minOccurs="0"/>
 *         &lt;element name="LoyaltyRequest" type="{}LoyaltyRequestType" minOccurs="0"/>
 *         &lt;element name="ReversalRequest" type="{}ReversalRequestType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransactionToPerformType {
    @Element(name = "PaymentRequest", required = false)
    protected PaymentRequestType paymentRequest;
    @Element(name = "LoyaltyRequest", required = false)
    protected LoyaltyRequestType loyaltyRequest;
    @Element(name = "ReversalRequest", required = false)
    protected ReversalRequestType reversalRequest;
    /**
     * Ruft den Wert der paymentRequest-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentRequestType }
     *
     */
    public PaymentRequestType getPaymentRequest() {
        return paymentRequest;
    }
    /**
     * Legt den Wert der paymentRequest-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentRequestType }
     *
     */
    public void setPaymentRequest(PaymentRequestType value) {
        this.paymentRequest = value;
    }
    /**
     * Ruft den Wert der loyaltyRequest-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyRequestType }
     *
     */
    public LoyaltyRequestType getLoyaltyRequest() {
        return loyaltyRequest;
    }
    /**
     * Legt den Wert der loyaltyRequest-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequestType }
     *
     */
    public void setLoyaltyRequest(LoyaltyRequestType value) {
        this.loyaltyRequest = value;
    }
    /**
     * Ruft den Wert der reversalRequest-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ReversalRequestType }
     *
     */
    public ReversalRequestType getReversalRequest() {
        return reversalRequest;
    }
    /**
     * Legt den Wert der reversalRequest-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ReversalRequestType }
     *
     */
    public void setReversalRequest(ReversalRequestType value) {
        this.reversalRequest = value;
    }
}
