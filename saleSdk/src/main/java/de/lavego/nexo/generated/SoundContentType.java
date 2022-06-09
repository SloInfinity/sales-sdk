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
 * Definition: Content of the Sound to play.
 *
 * <p>Java-Klasse für SoundContentType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SoundContentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>TextString">
 *       &lt;attribute name="SoundFormat" type="{}SoundFormatTypeCode" />
 *       &lt;attribute name="Language" type="{}ISOLanguage2A" />
 *       &lt;attribute name="ReferenceID" type="{}ReferenceIDType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SoundContentType {
    @Element
    protected String value;
    @Attribute(name = "SoundFormat", required = false)
    protected String soundFormat;
    @Attribute(name = "Language", required = false)
    protected String language;
    @Attribute(name = "ReferenceID", required = false)
    protected String referenceID;
    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }
    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * Ruft den Wert der soundFormat-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSoundFormat() {
        return soundFormat;
    }
    /**
     * Legt den Wert der soundFormat-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSoundFormat(String value) {
        this.soundFormat = value;
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
}
