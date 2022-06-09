//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Certificate distinguished name (DN) -- Reference: RFC 3880: Internet X.509 Public Key Infrastructure Certificate and Certificate -- Usage: Identifies the issuer or the subject of a X.509 certificate.
 *
 * <p>Java-Klasse für RelativeDistinguishedNameType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RelativeDistinguishedNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeType" type="{}AttributeTypeTypeCode"/>
 *         &lt;element name="AttributeValue" type="{}AttributeValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class RelativeDistinguishedNameType {
    @Element(name = "AttributeType", required = true)
    protected String attributeType;
    @Element(name = "AttributeValue", required = true)
    protected String attributeValue;
    /**
     * Ruft den Wert der attributeType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeType() {
        return attributeType;
    }
    /**
     * Legt den Wert der attributeType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeType(String value) {
        this.attributeType = value;
    }
    /**
     * Ruft den Wert der attributeValue-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    /**
     * Legt den Wert der attributeValue-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeValue(String value) {
        this.attributeValue = value;
    }
}
