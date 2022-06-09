//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Merchant using the payment services of a payment
 * 				facilitator, acting as a card acceptor. -- Usage: Identifies the merchant purchasing
 * 				items, using the payment facilitator to perform the payment of the
 * 				items.
 *
 * <p>Java-Klasse für SponsoredMerchantType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SponsoredMerchantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CommonName" use="required" type="{}CommonNameType" />
 *       &lt;attribute name="Address" type="{}AddressType" />
 *       &lt;attribute name="CountryCode" use="required" type="{}CountryCodeType" />
 *       &lt;attribute name="MerchantCategoryCode" use="required" type="{}MerchantCategoryCodeType" />
 *       &lt;attribute name="RegisteredIdentifier" use="required" type="{}RegisteredIdentifierType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SponsoredMerchantType {
    @Attribute(name = "CommonName", required = true)
    protected String commonName;
    @Attribute(name = "Address", required = false)
    protected String address;
    @Attribute(name = "CountryCode", required = true)
    protected String countryCode;
    @Attribute(name = "MerchantCategoryCode", required = true)
    protected String merchantCategoryCode;
    @Attribute(name = "RegisteredIdentifier", required = true)
    protected String registeredIdentifier;
    /**
     * Ruft den Wert der commonName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommonName() {
        return commonName;
    }
    /**
     * Legt den Wert der commonName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommonName(String value) {
        this.commonName = value;
    }
    /**
     * Ruft den Wert der address-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress() {
        return address;
    }
    /**
     * Legt den Wert der address-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress(String value) {
        this.address = value;
    }
    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }
    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }
    /**
     * Ruft den Wert der merchantCategoryCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }
    /**
     * Legt den Wert der merchantCategoryCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantCategoryCode(String value) {
        this.merchantCategoryCode = value;
    }
    /**
     * Ruft den Wert der registeredIdentifier-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegisteredIdentifier() {
        return registeredIdentifier;
    }
    /**
     * Legt den Wert der registeredIdentifier-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegisteredIdentifier(String value) {
        this.registeredIdentifier = value;
    }
}
