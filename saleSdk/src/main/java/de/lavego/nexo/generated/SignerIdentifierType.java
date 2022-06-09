//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing the Signer Identifier -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the issuer name (see X.501-88)  the certificate serial number (see X.509-97)
 *
 * <p>Java-Klasse für SignerIdentifierType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SignerIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuerAndSerialNumber" type="{}IssuerAndSerialNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SignerIdentifierType {
    @Element(name = "IssuerAndSerialNumber", required = true)
    protected IssuerAndSerialNumberType issuerAndSerialNumber;
    /**
     * Ruft den Wert der issuerAndSerialNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumberType }
     *
     */
    public IssuerAndSerialNumberType getIssuerAndSerialNumber() {
        return issuerAndSerialNumber;
    }
    /**
     * Legt den Wert der issuerAndSerialNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumberType }
     *
     */
    public void setIssuerAndSerialNumber(IssuerAndSerialNumberType value) {
        this.issuerAndSerialNumber = value;
    }
}
