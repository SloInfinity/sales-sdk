//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the requested Message Response. -- Usage: Allow
 * 				the knowledge of the last Payment, Loyalty or Reversal
 * 				transaction
 *
 * <p>Java-Klasse für RepeatedMessageResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RepeatedMessageResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{}MessageHeaderType"/>
 *         &lt;choice>
 *           &lt;element name="LoyaltyResponse" type="{}LoyaltyResponseType"/>
 *           &lt;element name="PaymentResponse" type="{}PaymentResponseType"/>
 *           &lt;element name="ReversalResponse" type="{}ReversalResponseType"/>
 *           &lt;element name="StoredValueResponse" type="{}StoredValueResponseType"/>
 *           &lt;element name="CardAcquisitionResponse" type="{}CardAcquisitionResponseType"/>
 *           &lt;element name="CardReaderAPDUResponse" type="{}CardReaderAPDUResponseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class RepeatedMessageResponseType {
    @Element(name = "MessageHeader", required = true)
    protected MessageHeaderType messageHeader;
    @Element(name = "LoyaltyResponse", required = false)
    protected LoyaltyResponseType loyaltyResponse;
    @Element(name = "PaymentResponse", required = false)
    protected PaymentResponseType paymentResponse;
    @Element(name = "ReversalResponse", required = false)
    protected ReversalResponseType reversalResponse;
    @Element(name = "StoredValueResponse", required = false)
    protected StoredValueResponseType storedValueResponse;
    @Element(name = "CardAcquisitionResponse", required = false)
    protected CardAcquisitionResponseType cardAcquisitionResponse;
    @Element(name = "CardReaderAPDUResponse", required = false)
    protected CardReaderAPDUResponseType cardReaderAPDUResponse;
    /**
     * Ruft den Wert der messageHeader-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MessageHeaderType }
     *
     */
    public MessageHeaderType getMessageHeader() {
        return messageHeader;
    }
    /**
     * Legt den Wert der messageHeader-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MessageHeaderType }
     *
     */
    public void setMessageHeader(MessageHeaderType value) {
        this.messageHeader = value;
    }
    /**
     * Ruft den Wert der loyaltyResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyResponseType }
     *
     */
    public LoyaltyResponseType getLoyaltyResponse() {
        return loyaltyResponse;
    }
    /**
     * Legt den Wert der loyaltyResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyResponseType }
     *
     */
    public void setLoyaltyResponse(LoyaltyResponseType value) {
        this.loyaltyResponse = value;
    }
    /**
     * Ruft den Wert der paymentResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentResponseType }
     *
     */
    public PaymentResponseType getPaymentResponse() {
        return paymentResponse;
    }
    /**
     * Legt den Wert der paymentResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentResponseType }
     *
     */
    public void setPaymentResponse(PaymentResponseType value) {
        this.paymentResponse = value;
    }
    /**
     * Ruft den Wert der reversalResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ReversalResponseType }
     *
     */
    public ReversalResponseType getReversalResponse() {
        return reversalResponse;
    }
    /**
     * Legt den Wert der reversalResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ReversalResponseType }
     *
     */
    public void setReversalResponse(ReversalResponseType value) {
        this.reversalResponse = value;
    }
    /**
     * Ruft den Wert der storedValueResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link StoredValueResponseType }
     *
     */
    public StoredValueResponseType getStoredValueResponse() {
        return storedValueResponse;
    }
    /**
     * Legt den Wert der storedValueResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link StoredValueResponseType }
     *
     */
    public void setStoredValueResponse(StoredValueResponseType value) {
        this.storedValueResponse = value;
    }
    /**
     * Ruft den Wert der cardAcquisitionResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CardAcquisitionResponseType }
     *
     */
    public CardAcquisitionResponseType getCardAcquisitionResponse() {
        return cardAcquisitionResponse;
    }
    /**
     * Legt den Wert der cardAcquisitionResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionResponseType }
     *
     */
    public void setCardAcquisitionResponse(CardAcquisitionResponseType value) {
        this.cardAcquisitionResponse = value;
    }
    /**
     * Ruft den Wert der cardReaderAPDUResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CardReaderAPDUResponseType }
     *
     */
    public CardReaderAPDUResponseType getCardReaderAPDUResponse() {
        return cardReaderAPDUResponse;
    }
    /**
     * Legt den Wert der cardReaderAPDUResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CardReaderAPDUResponseType }
     *
     */
    public void setCardReaderAPDUResponse(CardReaderAPDUResponseType value) {
        this.cardReaderAPDUResponse = value;
    }
}
