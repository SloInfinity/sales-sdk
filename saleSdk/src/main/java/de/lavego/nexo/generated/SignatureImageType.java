//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Image of the captured handwritten signature. -- Usage:
 * 				Contain data, or reference to data, of a numeric image of captured
 * 				signature.
 *
 * <p>Java-Klasse für SignatureImageType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SignatureImageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageFormat" type="{}ImageFormatType" minOccurs="0"/>
 *         &lt;element name="ImageData" type="{}ImageDataType" minOccurs="0"/>
 *         &lt;element name="ImageReference" type="{}ImageReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SignatureImageType {
    @Element(name = "ImageFormat", required = false)
    protected String imageFormat;
    @Element(name = "ImageData", required = false)
    protected byte[] imageData;
    @Element(name = "ImageReference", required = false)
    protected String imageReference;
    /**
     * Ruft den Wert der imageFormat-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageFormat() {
        return imageFormat;
    }
    /**
     * Legt den Wert der imageFormat-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageFormat(String value) {
        this.imageFormat = value;
    }
    /**
     * Ruft den Wert der imageData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageData() {
        return imageData;
    }
    /**
     * Legt den Wert der imageData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageData(byte[] value) {
        this.imageData = value;
    }
    /**
     * Ruft den Wert der imageReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageReference() {
        return imageReference;
    }
    /**
     * Legt den Wert der imageReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageReference(String value) {
        this.imageReference = value;
    }
}
