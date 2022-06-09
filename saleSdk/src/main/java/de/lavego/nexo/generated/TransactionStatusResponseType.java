//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
/**
 * Definition: Content of the TransactionStatus Response message. --
 * 				Usage: It conveys Information related to the status of the last or current Payment,
 * 				Loyalty or Reversal transaction.
 *
 * <p>Java-Klasse für TransactionStatusResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransactionStatusResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="MessageReference" type="{}MessageReferenceType" minOccurs="0"/>
 *         &lt;element name="RepeatedMessageResponse" type="{}RepeatedMessageResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransactionStatusResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "MessageReference", required = false)
    protected MessageReferenceType messageReference;
    @Element(name = "RepeatedMessageResponse", required = false)
    protected RepeatedMessageResponseType repeatedMessageResponse;
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
     * Ruft den Wert der messageReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MessageReferenceType }
     *
     */
    public MessageReferenceType getMessageReference() {
        return messageReference;
    }
    /**
     * Legt den Wert der messageReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MessageReferenceType }
     *
     */
    public void setMessageReference(MessageReferenceType value) {
        this.messageReference = value;
    }
    /**
     * Ruft den Wert der repeatedMessageResponse-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RepeatedMessageResponseType }
     *
     */
    public RepeatedMessageResponseType getRepeatedMessageResponse() {
        return repeatedMessageResponse;
    }
    /**
     * Legt den Wert der repeatedMessageResponse-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RepeatedMessageResponseType }
     *
     */
    public void setRepeatedMessageResponse(RepeatedMessageResponseType value) {
        this.repeatedMessageResponse = value;
    }
}
