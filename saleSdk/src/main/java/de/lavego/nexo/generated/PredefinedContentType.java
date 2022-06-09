//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Reference of a predefined message to display or print. --
 * 				Usage: It conveys Information related to the predefined message
 *
 * <p>Java-Klasse für PredefinedContentType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PredefinedContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReferenceID" use="required" type="{}ReferenceIDType" />
 *       &lt;attribute name="Language" type="{}ISOLanguage2A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PredefinedContentType {
    @Attribute(name = "ReferenceID", required = true)
    protected String referenceID;
    @Attribute(name = "Language", required = false)
    protected String language;
    /**
     * Ruft den Wert der referenceID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferenceID() {
        return referenceID;
    }
    /**
     * Legt den Wert der referenceID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }
    /**
     * Ruft den Wert der language-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }
    /**
     * Legt den Wert der language-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }
}
