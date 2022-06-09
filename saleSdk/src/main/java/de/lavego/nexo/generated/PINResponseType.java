//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the PIN Response message. -- Usage: It contains
 * 				the result of the requested service, with possibly the encrypted
 * 				PIN.
 *
 * <p>Java-Klasse für PINResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PINResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="CardholderPIN" type="{}CardholderPINType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PINResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "CardholderPIN", required = false)
    protected CardholderPINType cardholderPIN;
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
     * Ruft den Wert der cardholderPIN-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CardholderPINType }
     *
     */
    public CardholderPINType getCardholderPIN() {
        return cardholderPIN;
    }
    /**
     * Legt den Wert der cardholderPIN-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CardholderPINType }
     *
     */
    public void setCardholderPIN(CardholderPINType value) {
        this.cardholderPIN = value;
    }
}
