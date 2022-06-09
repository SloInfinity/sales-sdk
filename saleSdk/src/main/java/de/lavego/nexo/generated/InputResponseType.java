//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Input Response message. -- Usage: It
 * 				conveys:The result of the outputs, parallel to the message request, except if
 * 				response not required and absent.The result of the input
 *
 * <p>Java-Klasse für InputResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InputResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputResult" type="{}OutputResultType" minOccurs="0"/>
 *         &lt;element name="InputResult" type="{}InputResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class InputResponseType {
    @Element(name = "OutputResult", required = false)
    protected OutputResultType outputResult;
    @Element(name = "InputResult", required = true)
    protected InputResultType inputResult;
    /**
     * Ruft den Wert der outputResult-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OutputResultType }
     *
     */
    public OutputResultType getOutputResult() {
        return outputResult;
    }
    /**
     * Legt den Wert der outputResult-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OutputResultType }
     *
     */
    public void setOutputResult(OutputResultType value) {
        this.outputResult = value;
    }
    /**
     * Ruft den Wert der inputResult-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link InputResultType }
     *
     */
    public InputResultType getInputResult() {
        return inputResult;
    }
    /**
     * Legt den Wert der inputResult-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link InputResultType }
     *
     */
    public void setInputResult(InputResultType value) {
        this.inputResult = value;
    }
}
