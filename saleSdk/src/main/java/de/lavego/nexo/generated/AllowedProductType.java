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
 * Definition: Product that are payable by the payment card. -- Usage:
 * 				Restriction of product payable by a card.
 *
 * <p>Java-Klasse für AllowedProductType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AllowedProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductLabel" type="{}ProductLabelType" minOccurs="0"/>
 *         &lt;element name="AdditionalProductInfo" type="{}AdditionalProductInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProductCode" use="required" type="{}ProductCodeType" />
 *       &lt;attribute name="EanUpc" type="{}EanUpcType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class AllowedProductType {
    @Element(name = "ProductLabel", required = false)
    protected String productLabel;
    @Element(name = "AdditionalProductInfo", required = false)
    protected String additionalProductInfo;
    @Attribute(name = "ProductCode", required = true)
    protected String productCode;
    @Attribute(name = "EanUpc", required = false)
    protected String eanUpc;
    /**
     * Ruft den Wert der productLabel-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductLabel() {
        return productLabel;
    }
    /**
     * Legt den Wert der productLabel-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductLabel(String value) {
        this.productLabel = value;
    }
    /**
     * Ruft den Wert der additionalProductInfo-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalProductInfo() {
        return additionalProductInfo;
    }
    /**
     * Legt den Wert der additionalProductInfo-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalProductInfo(String value) {
        this.additionalProductInfo = value;
    }
    /**
     * Ruft den Wert der productCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductCode() {
        return productCode;
    }
    /**
     * Legt den Wert der productCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }
    /**
     * Ruft den Wert der eanUpc-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEanUpc() {
        return eanUpc;
    }
    /**
     * Legt den Wert der eanUpc-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEanUpc(String value) {
        this.eanUpc = value;
    }
}
