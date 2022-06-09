//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Parameters associated to a cryptographic algorithm -- Reference: RFC 3880: Internet X.509 Public Key Infrastructure Certificate and Certificate
 *
 * <p>Java-Klasse für ParameterType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="InitialisationVector" type="{}InitialisationVectorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class ParameterType {
    @Attribute(name = "InitialisationVector", required = false)
    protected byte[] initialisationVector;
    /**
     * Ruft den Wert der initialisationVector-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInitialisationVector() {
        return initialisationVector;
    }
    /**
     * Legt den Wert der initialisationVector-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInitialisationVector(byte[] value) {
        this.initialisationVector = value;
    }
}
