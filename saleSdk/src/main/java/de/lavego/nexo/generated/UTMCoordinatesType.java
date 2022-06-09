//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;

/**
 * Definition: Location on the Earth specified by the Universal
 * Transverse Mercator coordinate system. -- Usage: Identifies the geographic location
 * of a mobile phone by GPS using the WGS84 ellipsoid spatial reference
 * system.
 *
 * <p>Java-Klasse für UTMCoordinatesType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="UTMCoordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UTMZone" type="{}UTMZoneType"/>
 *         &lt;element name="UTMEastward" type="{}UTMEastwardType"/>
 *         &lt;element name="UTMNorthward" type="{}UTMNorthwardType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class UTMCoordinatesType
{
    @Element(name = "UTMZone", required = true)
    protected String utmZone;
    @Element(name = "UTMEastward", required = true)
    protected String utmEastward;
    @Element(name = "UTMNorthward", required = true)
    protected String utmNorthward;

    /**
     * Ruft den Wert der utmZone-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUTMZone()
    {
        return utmZone;
    }

    /**
     * Legt den Wert der utmZone-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUTMZone(String value)
    {
        this.utmZone = value;
    }

    /**
     * Ruft den Wert der utmEastward-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUTMEastward()
    {
        return utmEastward;
    }

    /**
     * Legt den Wert der utmEastward-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUTMEastward(String value)
    {
        this.utmEastward = value;
    }

    /**
     * Ruft den Wert der utmNorthward-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUTMNorthward()
    {
        return utmNorthward;
    }

    /**
     * Legt den Wert der utmNorthward-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUTMNorthward(String value)
    {
        this.utmNorthward = value;
    }
}
