//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Location on the Earth specified by two numbers
 * 				representing vertical and horizontal position. -- Usage: Identifies the geographic
 * 				location of a mobile phone.
 *
 * <p>Java-Klasse für GeographicCoordinatesType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeographicCoordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Latitude" type="{}LatitudeType"/>
 *         &lt;element name="Longitude" type="{}LongitudeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class GeographicCoordinatesType {
    @Element(name = "Latitude", required = true)
    protected String latitude;
    @Element(name = "Longitude", required = true)
    protected String longitude;
    /**
     * Ruft den Wert der latitude-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLatitude() {
        return latitude;
    }
    /**
     * Legt den Wert der latitude-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }
    /**
     * Ruft den Wert der longitude-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLongitude() {
        return longitude;
    }
    /**
     * Legt den Wert der longitude-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }
}
