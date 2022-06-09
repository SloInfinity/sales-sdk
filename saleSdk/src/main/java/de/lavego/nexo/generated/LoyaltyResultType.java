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
 * Definition: Data related to the result of a processed loyalty
 * 				transaction. -- Usage: In the Message Response, the result of each loyalty brand
 * 				transaction.
 *
 * <p>Java-Klasse für LoyaltyResultType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyAccount" type="{}LoyaltyAccountType"/>
 *         &lt;element name="LoyaltyAmount" type="{}LoyaltyAmountType" minOccurs="0"/>
 *         &lt;element name="LoyaltyAcquirerData" type="{}LoyaltyAcquirerDataType" minOccurs="0"/>
 *         &lt;element name="Rebates" type="{}RebatesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrentBalance" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyResultType {
    @Element(name = "LoyaltyAccount", required = true)
    protected LoyaltyAccountType loyaltyAccount;
    @Element(name = "LoyaltyAmount", required = false)
    protected LoyaltyAmountType loyaltyAmount;
    @Element(name = "LoyaltyAcquirerData", required = false)
    protected LoyaltyAcquirerDataType loyaltyAcquirerData;
    @Element(name = "Rebates", required = false)
    protected RebatesType rebates;
    @Attribute(name = "CurrentBalance", required = false)
    protected BigDecimal currentBalance;
    /**
     * Ruft den Wert der loyaltyAccount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAccountType }
     *
     */
    public LoyaltyAccountType getLoyaltyAccount() {
        return loyaltyAccount;
    }
    /**
     * Legt den Wert der loyaltyAccount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountType }
     *
     */
    public void setLoyaltyAccount(LoyaltyAccountType value) {
        this.loyaltyAccount = value;
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
    /**
     * Ruft den Wert der loyaltyAcquirerData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link LoyaltyAcquirerDataType }
     *
     */
    public LoyaltyAcquirerDataType getLoyaltyAcquirerData() {
        return loyaltyAcquirerData;
    }
    /**
     * Legt den Wert der loyaltyAcquirerData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link LoyaltyAcquirerDataType }
     *
     */
    public void setLoyaltyAcquirerData(LoyaltyAcquirerDataType value) {
        this.loyaltyAcquirerData = value;
    }
    /**
     * Ruft den Wert der rebates-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RebatesType }
     *
     */
    public RebatesType getRebates() {
        return rebates;
    }
    /**
     * Legt den Wert der rebates-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RebatesType }
     *
     */
    public void setRebates(RebatesType value) {
        this.rebates = value;
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
