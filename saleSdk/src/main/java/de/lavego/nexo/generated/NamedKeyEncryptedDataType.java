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
 * Definition: Cryptographic Message Syntax (CMS) data structure containing encrypted data and integrated optional data filed keyName. -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (which is v0 in nexo protocol context)  the keyName  the encrypred content info including the encrypted data
 *
 * <p>Java-Klasse für NamedKeyEncryptedDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="NamedKeyEncryptedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyName" type="{}KeyNameType" minOccurs="0"/>
 *         &lt;element name="EncryptedContent" type="{}EncryptedContentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionTypeCode" default="v0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class NamedKeyEncryptedDataType {
    @Element(name = "KeyName", required = false)
    protected String keyName;
    @Element(name = "EncryptedContent", required = true)
    protected EncryptedContentType encryptedContent;
    @Attribute(name = "Version", required = false)
    protected String version;
    /**
     * Ruft den Wert der keyName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyName() {
        return keyName;
    }
    /**
     * Legt den Wert der keyName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }
    /**
     * Ruft den Wert der encryptedContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link EncryptedContentType }
     *
     */
    public EncryptedContentType getEncryptedContent() {
        return encryptedContent;
    }
    /**
     * Legt den Wert der encryptedContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link EncryptedContentType }
     *
     */
    public void setEncryptedContent(EncryptedContentType value) {
        this.encryptedContent = value;
    }
    /**
     * Ruft den Wert der version-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "v0";
        } else {
            return version;
        }
    }
    /**
     * Legt den Wert der version-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }
}
