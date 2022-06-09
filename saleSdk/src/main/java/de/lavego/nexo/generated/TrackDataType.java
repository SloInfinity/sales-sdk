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
 * Definition: Magnetic track or magnetic ink characters line. --
 * 				Reference: ISO 7813 - ISO 4909 -- Usage: Generic data structure for a card track,
 * 				used when the magstripe card reader is located on the Sale Terminal, or for
 * 				magstripe Card Reader device request. The data structure is also used to store the
 * 				line at the bottom of a bank check
 *
 * <p>Java-Klasse für TrackDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TrackDataType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>TextString">
 *       &lt;attribute name="TrackNumb" type="{}TrackNumbType" default="2" />
 *       &lt;attribute name="TrackFormat" type="{}TrackFormatTypeCode" default="ISO" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TrackDataType {
    @Element
    protected String value;
    @Attribute(name = "TrackNumb", required = false)
    protected Integer trackNumb;
    @Attribute(name = "TrackFormat", required = false)
    protected String trackFormat;
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
     * Ruft den Wert der trackNumb-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public int getTrackNumb() {
        if (trackNumb == null) {
            return  2;
        } else {
            return trackNumb;
        }
    }
    /**
     * Legt den Wert der trackNumb-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTrackNumb(Integer value) {
        this.trackNumb = value;
    }
    /**
     * Ruft den Wert der trackFormat-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrackFormat() {
        if (trackFormat == null) {
            return "ISO";
        } else {
            return trackFormat;
        }
    }
    /**
     * Legt den Wert der trackFormat-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrackFormat(String value) {
        this.trackFormat = value;
    }
}
