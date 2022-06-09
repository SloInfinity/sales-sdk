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
 * Definition: Information related to the result the output (display,
 * 				print, input). -- Usage: In the message response, it contains the result of the
 * 				output, if required in the message request.
 *
 * <p>Java-Klasse für OutputResultType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OutputResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Device" use="required" type="{}DeviceTypeCode" />
 *       &lt;attribute name="InfoQualify" use="required" type="{}InfoQualifyTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class OutputResultType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Attribute(name = "Device", required = true)
    protected String device;
    @Attribute(name = "InfoQualify", required = true)
    protected String infoQualify;
    /**
     * Ruft den Wert der response-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ResponseType }
     *
     */
    public ResponseType getResponse() {
        return response;
    }
    /**
     * Legt den Wert der response-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }
    /**
     * Ruft den Wert der device-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDevice() {
        return device;
    }
    /**
     * Legt den Wert der device-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDevice(String value) {
        this.device = value;
    }
    /**
     * Ruft den Wert der infoQualify-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfoQualify() {
        return infoQualify;
    }
    /**
     * Legt den Wert der infoQualify-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfoQualify(String value) {
        this.infoQualify = value;
    }
}
