//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigInteger;
/**
 * Definition: Content of the Transmit Request message. -- Usage: It
 * 				contains a message to transmit.
 *
 * <p>Java-Klasse für TransmitRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransmitRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{}MessageType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WaitResponseFlag" type="{}WaitResponseFlagType" default="false" />
 *       &lt;attribute name="MaximumTransmitTime" use="required" type="{}MaximumTransmitTimeType" />
 *       &lt;attribute name="DestinationAddress" use="required" type="{}DestinationAddressType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TransmitRequestType {
    @Element(name = "Message", required = true)
    protected byte[] message;
    @Attribute(name = "WaitResponseFlag", required = false)
    protected Boolean waitResponseFlag;
    @Attribute(name = "MaximumTransmitTime", required = true)
    protected BigInteger maximumTransmitTime;
    @Attribute(name = "DestinationAddress", required = true)
    protected String destinationAddress;
    /**
     * Ruft den Wert der message-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMessage() {
        return message;
    }
    /**
     * Legt den Wert der message-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMessage(byte[] value) {
        this.message = value;
    }
    /**
     * Ruft den Wert der waitResponseFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isWaitResponseFlag() {
        if (waitResponseFlag == null) {
            return false;
        } else {
            return waitResponseFlag;
        }
    }
    /**
     * Legt den Wert der waitResponseFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWaitResponseFlag(Boolean value) {
        this.waitResponseFlag = value;
    }
    /**
     * Ruft den Wert der maximumTransmitTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaximumTransmitTime() {
        return maximumTransmitTime;
    }
    /**
     * Legt den Wert der maximumTransmitTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaximumTransmitTime(BigInteger value) {
        this.maximumTransmitTime = value;
    }
    /**
     * Ruft den Wert der destinationAddress-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationAddress() {
        return destinationAddress;
    }
    /**
     * Legt den Wert der destinationAddress-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationAddress(String value) {
        this.destinationAddress = value;
    }
}
