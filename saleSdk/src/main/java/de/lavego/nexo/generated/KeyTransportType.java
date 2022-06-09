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
 * Definition: Encryption key using previously distributed asymmetric key -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (v0)  the recipient identifier  the key encryption algorithm  the encrypted key
 *
 * <p>Java-Klasse für KeyTransportType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="KeyTransportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientIdentifier" type="{}RecipientIdentifierType"/>
 *         &lt;element name="KeyEncryptionAlgorithm" type="{}AlgorithmIdentifier"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionTypeCode" default="v0" />
 *       &lt;attribute name="EncryptedKey" use="required" type="{}EncryptedKeyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class KeyTransportType {
    @Element(name = "RecipientIdentifier", required = true)
    protected RecipientIdentifierType recipientIdentifier;
    @Element(name = "KeyEncryptionAlgorithm", required = true)
    protected AlgorithmIdentifier keyEncryptionAlgorithm;
    @Attribute(name = "Version", required = false)
    protected String version;
    @Attribute(name = "EncryptedKey", required = true)
    protected byte[] encryptedKey;
    /**
     * Ruft den Wert der recipientIdentifier-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RecipientIdentifierType }
     *
     */
    public RecipientIdentifierType getRecipientIdentifier() {
        return recipientIdentifier;
    }
    /**
     * Legt den Wert der recipientIdentifier-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RecipientIdentifierType }
     *
     */
    public void setRecipientIdentifier(RecipientIdentifierType value) {
        this.recipientIdentifier = value;
    }
    /**
     * Ruft den Wert der keyEncryptionAlgorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return keyEncryptionAlgorithm;
    }
    /**
     * Legt den Wert der keyEncryptionAlgorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public void setKeyEncryptionAlgorithm(AlgorithmIdentifier value) {
        this.keyEncryptionAlgorithm = value;
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
    /**
     * Ruft den Wert der encryptedKey-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedKey() {
        return encryptedKey;
    }
    /**
     * Legt den Wert der encryptedKey-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedKey(byte[] value) {
        this.encryptedKey = value;
    }
}
