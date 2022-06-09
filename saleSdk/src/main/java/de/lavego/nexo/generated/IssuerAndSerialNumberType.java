//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigInteger;

import org.simpleframework.xml.Element;
/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing the issuer name and certificate serial number  -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the issuer name (see X.501-88)  the certificate serial number (see X.509-97) This the value of input parameter sid.
 *
 * <p>Java-Klasse für IssuerAndSerialNumberType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="IssuerAndSerialNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Issuer" type="{}IssuerType"/>
 *         &lt;element name="SerialNumber" type="{}SerialNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class IssuerAndSerialNumberType {
    @Element(name = "Issuer", required = true)
    protected IssuerType issuer;
    @Element(name = "SerialNumber", required = true)
    protected BigInteger serialNumber;
    /**
     * Ruft den Wert der issuer-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link IssuerType }
     *
     */
    public IssuerType getIssuer() {
        return issuer;
    }
    /**
     * Legt den Wert der issuer-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link IssuerType }
     *
     */
    public void setIssuer(IssuerType value) {
        this.issuer = value;
    }
    /**
     * Ruft den Wert der serialNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getSerialNumber() {
        return serialNumber;
    }
    /**
     * Legt den Wert der serialNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setSerialNumber(BigInteger value) {
        this.serialNumber = value;
    }
}
