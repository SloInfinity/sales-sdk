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
 * Definition: Content of the Card Reader APDU Response message. --
 * 				Usage: It contains the result of the requested service, APDU response sent by the
 * 				chip of the card in response to the APDU request.
 *
 * <p>Java-Klasse für CardReaderAPDUResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardReaderAPDUResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="APDUData" type="{}APDUDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CardStatusWords" use="required" type="{}CardStatusWordsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardReaderAPDUResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "APDUData", required = false)
    protected byte[] apduData;
    @Attribute(name = "CardStatusWords", required = true)
    protected byte[] cardStatusWords;
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
     * Ruft den Wert der apduData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAPDUData() {
        return apduData;
    }
    /**
     * Legt den Wert der apduData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAPDUData(byte[] value) {
        this.apduData = value;
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
