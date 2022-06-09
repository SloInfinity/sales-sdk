//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;

/**
 * Definition: handwritten signature captured on the POI by a signature
 * capture device. -- Usage: Contain the value of a handwritten signature, e.g. the
 * signature of a cardholder on the merchant payment receipt. Only one format of the
 * signature is allowed, it contains: The size of the pad area where the signature is
 * written, given
 *
 * <p>Java-Klasse für CapturedSignatureType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CapturedSignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RawSignature" type="{}RawSignatureType" minOccurs="0"/>
 *         &lt;element name="SignatureImage" type="{}SignatureImageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class CapturedSignatureType
{
    @Element(name = "RawSignature", required = false)
    protected RawSignatureType   rawSignature;
    @Element(name = "SignatureImage", required = false)
    protected SignatureImageType signatureImage;

    /**
     * Ruft den Wert der rawSignature-Eigenschaft ab.
     *
     * @return possible object is
     * {@link RawSignatureType }
     */
    public RawSignatureType getRawSignature()
    {
        return rawSignature;
    }

    /**
     * Legt den Wert der rawSignature-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link RawSignatureType }
     */
    public void setRawSignature(RawSignatureType value)
    {
        this.rawSignature = value;
    }

    /**
     * Ruft den Wert der signatureImage-Eigenschaft ab.
     *
     * @return possible object is
     * {@link SignatureImageType }
     */
    public SignatureImageType getSignatureImage()
    {
        return signatureImage;
    }

    /**
     * Legt den Wert der signatureImage-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link SignatureImageType }
     */
    public void setSignatureImage(SignatureImageType value)
    {
        this.signatureImage = value;
    }
}
