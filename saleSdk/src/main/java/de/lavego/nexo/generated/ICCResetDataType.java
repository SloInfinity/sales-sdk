//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
/**
 * Definition: Data of a Chip Card related to the reset of the chip. --
 * 				Usage: Card reader device request
 *
 * <p>Java-Klasse für ICCResetDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ICCResetDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ATRValue" type="{}ATRValueType" />
 *       &lt;attribute name="CardStatusWords" type="{}CardStatusWordsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class ICCResetDataType {
    @Attribute(name = "ATRValue", required = false)
    protected byte[] atrValue;
    @Attribute(name = "CardStatusWords", required = false)
    protected byte[] cardStatusWords;
    /**
     * Ruft den Wert der atrValue-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getATRValue() {
        return atrValue;
    }
    /**
     * Legt den Wert der atrValue-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setATRValue(byte[] value) {
        this.atrValue = value;
    }
    /**
     * Ruft den Wert der cardStatusWords-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardStatusWords() {
        return cardStatusWords;
    }
    /**
     * Legt den Wert der cardStatusWords-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCardStatusWords(byte[] value) {
        this.cardStatusWords = value;
    }
}
