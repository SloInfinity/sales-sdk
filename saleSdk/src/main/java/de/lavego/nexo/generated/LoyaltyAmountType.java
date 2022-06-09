//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

/**
 * Definition: Amount of a loyalty account. -- Usage: An awarded amount
 * 				or an amount to redeem to the loyalty account might be sent in the Payment request
 * 				message. The amount to apply on the requested loyalty service, if not computed from
 * 				the TotalAmount of the Loyalty request message. The
 *
 * <p>Java-Klasse für LoyaltyAmountType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyAmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>Decimal">
 *       &lt;attribute name="LoyaltyUnit" type="{}LoyaltyUnitTypeCode" default="Point" />
 *       &lt;attribute name="Currency" type="{}ISOCurrency3A" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyAmountType {
    @Element
    protected BigDecimal value;
    @Attribute(name = "LoyaltyUnit", required = false)
    protected String loyaltyUnit;
    @Attribute(name = "Currency", required = false)
    protected String currency;
    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValue() {
        return value;
    }
    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
