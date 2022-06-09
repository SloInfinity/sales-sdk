//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Geographic location specified by geographic or UTM
 * 				coordinates. -- Usage: Identifies the geographic location of a mobile
 * 				phone.
 *
 * <p>Java-Klasse für GeolocationType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GeolocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicCoordinates" type="{}GeographicCoordinatesType" minOccurs="0"/>
 *         &lt;element name="UTMCoordinates" type="{}UTMCoordinatesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class GeolocationType {
    @Element(name = "GeographicCoordinates", required = false)
    protected GeographicCoordinatesType geographicCoordinates;
    @Element(name = "UTMCoordinates", required = false)
    protected UTMCoordinatesType        utmCoordinates;
    /**
     * Ruft den Wert der geographicCoordinates-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link GeographicCoordinatesType }
     *
     */
    public GeographicCoordinatesType getGeographicCoordinates() {
        return geographicCoordinates;
    }
    /**
     * Legt den Wert der geographicCoordinates-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinatesType }
     *
     */
    public void setGeographicCoordinates(GeographicCoordinatesType value) {
        this.geographicCoordinates = value;
    }
    /**
     * Ruft den Wert der utmCoordinates-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link UTMCoordinatesType }
     *
     */
    public UTMCoordinatesType getUTMCoordinates() {
        return utmCoordinates;
    }
    /**
     * Legt den Wert der utmCoordinates-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link UTMCoordinatesType }
     *
     */
    public void setUTMCoordinates(UTMCoordinatesType value) {
        this.utmCoordinates = value;
    }
}
