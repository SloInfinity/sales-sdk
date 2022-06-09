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
 * Definition: Information related to the paper check used for the
 * 				transaction. -- Usage: Allows the check information to be provided by the Sale
 * 				System before requesting the payment, or stored by the Sale System after processing
 * 				of the payment.
 *
 * <p>Java-Klasse für CheckDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CheckDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankID" type="{}BankIDType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="CheckNumber" type="{}CheckNumberType" minOccurs="0"/>
 *         &lt;element name="TrackData" type="{}TrackDataType" minOccurs="0"/>
 *         &lt;element name="CheckCardNumber" type="{}CheckCardNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TypeCode" type="{}CheckTypeCodeTypeCode" default="Personal" />
 *       &lt;attribute name="Country" type="{}ISOCountry3A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CheckDataType {
    @Element(name = "BankID", required = false)
    protected String bankID;
    @Element(name = "AccountNumber", required = false)
    protected String accountNumber;
    @Element(name = "CheckNumber", required = false)
    protected String checkNumber;
    @Element(name = "TrackData", required = false)
    protected TrackDataType trackData;
    @Element(name = "CheckCardNumber", required = false)
    protected String checkCardNumber;
    @Attribute(name = "TypeCode", required = false)
    protected String typeCode;
    @Attribute(name = "Country", required = false)
    protected String country;
    /**
     * Ruft den Wert der bankID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBankID() {
        return bankID;
    }
    /**
     * Legt den Wert der bankID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBankID(String value) {
        this.bankID = value;
    }
    /**
     * Ruft den Wert der accountNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * Legt den Wert der accountNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }
    /**
     * Ruft den Wert der checkNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheckNumber() {
        return checkNumber;
    }
    /**
     * Legt den Wert der checkNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }
    /**
     * Ruft den Wert der trackData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TrackDataType }
     *
     */
    public TrackDataType getTrackData() {
        return trackData;
    }
    /**
     * Legt den Wert der trackData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TrackDataType }
     *
     */
    public void setTrackData(TrackDataType value) {
        this.trackData = value;
    }
    /**
     * Ruft den Wert der checkCardNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheckCardNumber() {
        return checkCardNumber;
    }
    /**
     * Legt den Wert der checkCardNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheckCardNumber(String value) {
        this.checkCardNumber = value;
    }
    /**
     * Ruft den Wert der typeCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeCode() {
        if (typeCode == null) {
            return "Personal";
        } else {
            return typeCode;
        }
    }
    /**
     * Legt den Wert der typeCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }
    /**
     * Ruft den Wert der country-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }
    /**
     * Legt den Wert der country-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }
}
