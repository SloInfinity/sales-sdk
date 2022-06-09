//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Print Request message. -- Usage: It conveys
 * 				the data to print and the way to process the print. It contains the complete content
 * 				to print.
 *
 * <p>Java-Klasse für PrintRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PrintRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrintOutput" type="{}PrintOutputType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PrintRequestType {
    @Element(name = "PrintOutput", required = true)
    protected PrintOutputType printOutput;
    /**
     * Ruft den Wert der printOutput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PrintOutputType }
     *
     */
    public PrintOutputType getPrintOutput() {
        return printOutput;
    }
    /**
     * Legt den Wert der printOutput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PrintOutputType }
     *
     */
    public void setPrintOutput(PrintOutputType value) {
        this.printOutput = value;
    }
}
