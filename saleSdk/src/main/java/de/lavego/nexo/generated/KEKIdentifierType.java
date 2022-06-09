//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Identification of a key encryption key (key management using previously distributed symmetric key) -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the identification of the key  the date of the key
 *
 * <p>Java-Klasse für KEKIdentifierType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="KEKIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="KeyIdentifier" use="required" type="{}KeyIdentifierType" />
 *       &lt;attribute name="KeyVersion" use="required" type="{}KeyVersionType" />
 *       &lt;attribute name="DerivationIdentifier" type="{}DerivationIdentifierType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class KEKIdentifierType {
    @Attribute(name = "KeyIdentifier", required = true)
    protected String keyIdentifier;
    @Attribute(name = "KeyVersion", required = true)
    protected String keyVersion;
    @Attribute(name = "DerivationIdentifier", required = false)
    protected byte[] derivationIdentifier;
    /**
     * Ruft den Wert der keyIdentifier-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyIdentifier() {
        return keyIdentifier;
    }
    /**
     * Legt den Wert der keyIdentifier-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyIdentifier(String value) {
        this.keyIdentifier = value;
    }
    /**
     * Ruft den Wert der keyVersion-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyVersion() {
        return keyVersion;
    }
    /**
     * Legt den Wert der keyVersion-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyVersion(String value) {
        this.keyVersion = value;
    }
    /**
     * Ruft den Wert der derivationIdentifier-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDerivationIdentifier() {
        return derivationIdentifier;
    }
    /**
     * Legt den Wert der derivationIdentifier-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDerivationIdentifier(byte[] value) {
        this.derivationIdentifier = value;
    }
}
