//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigInteger;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Card Reader Power-Off Request message. --
 * 				Usage: It contains a possible invitation message to display on the CashierInterface
 * 				or the CustomerInterface, for removing the card.
 *
 * <p>Java-Klasse für CardReaderPowerOffRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardReaderPowerOffRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayOutput" type="{}DisplayOutputType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxWaitingTime" type="{}MaxWaitingTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardReaderPowerOffRequestType {
    @Element(name = "DisplayOutput", required = false)
    protected DisplayOutputType displayOutput;
    @Attribute(name = "MaxWaitingTime", required = false)
    protected BigInteger maxWaitingTime;
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
     * Ruft den Wert der maxWaitingTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxWaitingTime() {
        return maxWaitingTime;
    }
    /**
     * Legt den Wert der maxWaitingTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxWaitingTime(BigInteger value) {
        this.maxWaitingTime = value;
    }
}
