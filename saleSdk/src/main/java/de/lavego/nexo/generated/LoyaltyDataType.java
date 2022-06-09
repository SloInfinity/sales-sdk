//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Data related to a Loyalty program or account. -- Usage: In
 * 				the Payment, Loyalty or Balance Inquiry Request message, it allows the Sale Terminal
 * 				to send the identification of the loyalty account or an awarded amount or an amount
 * 				to redeem to the loyalty account.
 *
 * <p>Java-Klasse für LoyaltyDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardAcquisitionReference" type="{}TransactionIdentificationType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAccountID" type="{}LoyaltyAccountIDType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAmount" type="{}LoyaltyAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyDataType {
    @Element(name = "CardAcquisitionReference", required = false)
    protected TransactionIdentificationType cardAcquisitionReference;
    @Element(name = "LoyaltyAccountID", required = false)
    protected LoyaltyAccountIDType loyaltyAccountID;
    @Element(name = "LoyaltyAmount", required = false)
    protected LoyaltyAmountType loyaltyAmount;
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
     * Ruft den Wert der loyaltyAccountID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAccountIDType }
     *
     */
    public LoyaltyAccountIDType getLoyaltyAccountID() {
        return loyaltyAccountID;
    }
    /**
     * Legt den Wert der loyaltyAccountID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountIDType }
     *
     */
    public void setLoyaltyAccountID(LoyaltyAccountIDType value) {
        this.loyaltyAccountID = value;
    }
    /**
     * Ruft den Wert der loyaltyAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAmountType }
     *
     */
    public LoyaltyAmountType getLoyaltyAmount() {
        return loyaltyAmount;
    }
    /**
     * Legt den Wert der loyaltyAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAmountType }
     *
     */
    public void setLoyaltyAmount(LoyaltyAmountType value) {
        this.loyaltyAmount = value;
    }
}
