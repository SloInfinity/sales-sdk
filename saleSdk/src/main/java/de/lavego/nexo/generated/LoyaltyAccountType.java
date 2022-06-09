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
 * Definition: Data related to a loyalty account processed in the
 * 				transaction. -- Usage: This data structure conveys the identification of the account
 * 				and the associated loyalty brand.
 *
 * <p>Java-Klasse für LoyaltyAccountType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyAccountID" type="{}LoyaltyAccountIDType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoyaltyBrand" type="{}LoyaltyBrandType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyAccountType {
    @Element(name = "LoyaltyAccountID", required = true)
    protected LoyaltyAccountIDType loyaltyAccountID;
    @Attribute(name = "LoyaltyBrand", required = false)
    protected String loyaltyBrand;
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
     * Ruft den Wert der loyaltyBrand-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoyaltyBrand() {
        return loyaltyBrand;
    }
    /**
     * Legt den Wert der loyaltyBrand-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoyaltyBrand(String value) {
        this.loyaltyBrand = value;
    }
}
