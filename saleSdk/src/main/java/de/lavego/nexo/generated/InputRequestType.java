//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Input Request message. -- Usage: It conveys
 * 				data to display and the way to process the display, and contains the complete
 * 				content to display. In addition to the display on the Input Device, it might contain
 * 				an operation (the DisplayOutput element) per Display Device type.
 *
 * <p>Java-Klasse für InputRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InputRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayOutput" type="{}DisplayOutputType" minOccurs="0"/>
 *         &lt;element name="InputData" type="{}InputDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class InputRequestType {
    @Element(name = "DisplayOutput", required = false)
    protected DisplayOutputType displayOutput;
    @Element(name = "InputData", required = true)
    protected InputDataType inputData;
    /**
     * Ruft den Wert der displayOutput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link DisplayOutputType }
     *
     */
    public DisplayOutputType getDisplayOutput() {
        return displayOutput;
    }
    /**
     * Legt den Wert der displayOutput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link DisplayOutputType }
     *
     */
    public void setDisplayOutput(DisplayOutputType value) {
        this.displayOutput = value;
    }
    /**
     * Ruft den Wert der inputData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InputDataType }
     *
     */
    public InputDataType getInputData() {
        return inputData;
    }
    /**
     * Legt den Wert der inputData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InputDataType }
     *
     */
    public void setInputData(InputDataType value) {
        this.inputData = value;
    }
}
