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
 * Definition: Data related to the result of a loyalty Balance Inquiry.
 * 				-- Usage: In the Message Response, the result of each loyalty brand
 * 				transaction.
 *
 * <p>Java-Klasse für LoyaltyAccountStatusType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyAccountStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyAccount" type="{}LoyaltyAccountType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CurrentBalance" type="{}SimpleAmountType" />
 *       &lt;attribute name="LoyaltyUnit" type="{}LoyaltyUnitTypeCode" default="Point" />
 *       &lt;attribute name="Currency" type="{}ISOCurrency3A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyAccountStatusType {
    @Element(name = "LoyaltyAccount", required = true)
    protected LoyaltyAccountType loyaltyAccount;
    @Attribute(name = "CurrentBalance", required = false)
    protected BigDecimal currentBalance;
    @Attribute(name = "LoyaltyUnit", required = false)
    protected String loyaltyUnit;
    @Attribute(name = "Currency", required = false)
    protected String currency;
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
    /**
     * Ruft den Wert der loyaltyUnit-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoyaltyUnit() {
        if (loyaltyUnit == null) {
            return "Point";
        } else {
            return loyaltyUnit;
        }
    }
    /**
     * Legt den Wert der loyaltyUnit-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoyaltyUnit(String value) {
        this.loyaltyUnit = value;
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
}
