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
 * Definition: Content of the PIN Request message. -- Usage: It contains
 * 				the type of request related to the PIN, and the associated
 * 				parameters.
 *
 * <p>Java-Klasse für PINRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PINRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardholderPIN" type="{}CardholderPINType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PINRequestType" use="required" type="{}PINRequestTypeTypeCode" />
 *       &lt;attribute name="PINVerifMethod" type="{}PINVerifMethodType" />
 *       &lt;attribute name="AdditionalInput" type="{}AdditionalInputType" />
 *       &lt;attribute name="PINEncAlgorithm" type="{}PINEncAlgorithmType" />
 *       &lt;attribute name="PINFormat" type="{}PINFormatTypeCode" />
 *       &lt;attribute name="KeyReference" type="{}KeyReferenceType" />
 *       &lt;attribute name="MaxWaitingTime" type="{}MaxWaitingTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PINRequestType {
    @Element(name = "CardholderPIN", required = false)
    protected CardholderPINType cardholderPIN;
    @Attribute(name = "PINRequestType", required = true)
    protected String pinRequestType;
    @Attribute(name = "PINVerifMethod", required = false)
    protected String pinVerifMethod;
    @Attribute(name = "AdditionalInput", required = false)
    protected String additionalInput;
    @Attribute(name = "PINEncAlgorithm", required = false)
    protected String pinEncAlgorithm;
    @Attribute(name = "PINFormat", required = false)
    protected String pinFormat;
    @Attribute(name = "KeyReference", required = false)
    protected String keyReference;
    @Attribute(name = "MaxWaitingTime", required = false)
    protected BigInteger maxWaitingTime;
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
    /**
     * Ruft den Wert der pinRequestType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPINRequestType() {
        return pinRequestType;
    }
    /**
     * Legt den Wert der pinRequestType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPINRequestType(String value) {
        this.pinRequestType = value;
    }
    /**
     * Ruft den Wert der pinVerifMethod-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPINVerifMethod() {
        return pinVerifMethod;
    }
    /**
     * Legt den Wert der pinVerifMethod-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPINVerifMethod(String value) {
        this.pinVerifMethod = value;
    }
    /**
     * Ruft den Wert der additionalInput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalInput() {
        return additionalInput;
    }
    /**
     * Legt den Wert der additionalInput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalInput(String value) {
        this.additionalInput = value;
    }
    /**
     * Ruft den Wert der pinEncAlgorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPINEncAlgorithm() {
        return pinEncAlgorithm;
    }
    /**
     * Legt den Wert der pinEncAlgorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPINEncAlgorithm(String value) {
        this.pinEncAlgorithm = value;
    }
    /**
     * Ruft den Wert der pinFormat-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPINFormat() {
        return pinFormat;
    }
    /**
     * Legt den Wert der pinFormat-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPINFormat(String value) {
        this.pinFormat = value;
    }
    /**
     * Ruft den Wert der keyReference-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyReference() {
        return keyReference;
    }
    /**
     * Legt den Wert der keyReference-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyReference(String value) {
        this.keyReference = value;
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
