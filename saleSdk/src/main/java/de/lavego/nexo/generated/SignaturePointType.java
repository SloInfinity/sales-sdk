//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Coordinates of a point where the pen changes direction or
 * 				lift. -- Usage: Contain the Coordinates of a point of the written signature where
 * 				the pen changes direction or lift where (X and Y).When the signer lifts the pen,
 * 				both X and Y have the value "FFFF".
 *
 * <p>Java-Klasse für SignaturePointType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SignaturePointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="X" use="required" type="{}XType" />
 *       &lt;attribute name="Y" use="required" type="{}YType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SignaturePointType {
    @Attribute(name = "X", required = true)
    protected String x;
    @Attribute(name = "Y", required = true)
    protected String y;
    /**
     * Ruft den Wert der x-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getX() {
        return x;
    }
    /**
     * Legt den Wert der x-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setX(String value) {
        this.x = value;
    }
    /**
     * Ruft den Wert der y-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getY() {
        return y;
    }
    /**
     * Legt den Wert der y-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setY(String value) {
        this.y = value;
    }
}
