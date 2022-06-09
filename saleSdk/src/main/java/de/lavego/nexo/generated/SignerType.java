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
 * Definition: Cryptographic Message Syntax (CMS) data structure containing signer information  -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (which is v1 in nexo protocol context)  the identifiers of the message digest algorithms  the encapsulated content  the information about the signer
 *
 * <p>Java-Klasse für SignerType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SignerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignerIdentifier" type="{}SignerIdentifierType"/>
 *         &lt;element name="DigestAlgorithm" type="{}AlgorithmIdentifier"/>
 *         &lt;element name="SignatureAlgorithm" type="{}AlgorithmIdentifier"/>
 *         &lt;element name="Signature" type="{}SignatureType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{}VersionTypeCode" default="v1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SignerType {
    @Element(name = "SignerIdentifier", required = true)
    protected SignerIdentifierType signerIdentifier;
    @Element(name = "DigestAlgorithm", required = true)
    protected AlgorithmIdentifier digestAlgorithm;
    @Element(name = "SignatureAlgorithm", required = true)
    protected AlgorithmIdentifier signatureAlgorithm;
    @Element(name = "Signature", required = true)
    protected byte[] signature;
    @Attribute(name = "Version", required = false)
    protected String version;
    /**
     * Ruft den Wert der signerIdentifier-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SignerIdentifierType }
     *
     */
    public SignerIdentifierType getSignerIdentifier() {
        return signerIdentifier;
    }
    /**
     * Legt den Wert der signerIdentifier-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SignerIdentifierType }
     *
     */
    public void setSignerIdentifier(SignerIdentifierType value) {
        this.signerIdentifier = value;
    }
    /**
     * Ruft den Wert der digestAlgorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public AlgorithmIdentifier getDigestAlgorithm() {
        return digestAlgorithm;
    }
    /**
     * Legt den Wert der digestAlgorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public void setDigestAlgorithm(AlgorithmIdentifier value) {
        this.digestAlgorithm = value;
    }
    /**
     * Ruft den Wert der signatureAlgorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return signatureAlgorithm;
    }
    /**
     * Legt den Wert der signatureAlgorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *
     */
    public void setSignatureAlgorithm(AlgorithmIdentifier value) {
        this.signatureAlgorithm = value;
    }
    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }
    /**
     * Legt den Wert der signature-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
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
            return "v1";
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
