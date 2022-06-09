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
 * Definition: Encrypted PIN and related information -- Usage: To request
 * 				PIN Verify to the POI, or to get the encrypted PIN block.
 *
 * <p>Java-Klasse für CardholderPINType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardholderPINType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncrPINBlock" type="{}ContentInformationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PINFormat" use="required" type="{}PINFormatTypeCode" />
 *       &lt;attribute name="AdditionalInput" type="{}AdditionalInputType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardholderPINType {
    @Element(name = "EncrPINBlock", required = true)
    protected ContentInformationType encrPINBlock;
    @Attribute(name = "PINFormat", required = true)
    protected String pinFormat;
    @Attribute(name = "AdditionalInput", required = false)
    protected String additionalInput;
    /**
     * Ruft den Wert der encrPINBlock-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ContentInformationType }
     *
     */
    public ContentInformationType getEncrPINBlock() {
        return encrPINBlock;
    }
    /**
     * Legt den Wert der encrPINBlock-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ContentInformationType }
     *
     */
    public void setEncrPINBlock(ContentInformationType value) {
        this.encrPINBlock = value;
    }
    /**
     * Ruft den Wert der pinFormat-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPINFormat() {
        return pinFormat;
    }
    /**
     * Legt den Wert der pinFormat-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPINFormat(String value) {
        this.pinFormat = value;
    }
    /**
     * Ruft den Wert der additionalInput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalInput() {
        return additionalInput;
    }
    /**
     * Legt den Wert der additionalInput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalInput(String value) {
        this.additionalInput = value;
    }
}
