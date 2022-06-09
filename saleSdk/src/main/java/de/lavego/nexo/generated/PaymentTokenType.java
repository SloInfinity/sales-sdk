//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import javax.xml.datatype.XMLGregorianCalendar;
/**
 * Definition: Surrogate of the PAN (Primary Account Number) of the
 * 				payment card to identify the payment mean of the customer. -- Usage: It allows, for
 * 				a merchant, to identify the customer.
 *
 * <p>Java-Klasse für PaymentTokenType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TokenRequestedType" use="required" type="{}TokenRequestedTypeTypeCode" />
 *       &lt;attribute name="TokenValue" use="required" type="{}TokenValueType" />
 *       &lt;attribute name="ExpiryDateTime" type="{}ExpiryDateTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentTokenType {
    @Attribute(name = "TokenRequestedType", required = true)
    protected String tokenRequestedType;
    @Attribute(name = "TokenValue", required = true)
    protected String tokenValue;
    @Attribute(name = "ExpiryDateTime", required = false)
    protected XMLGregorianCalendar expiryDateTime;
    /**
     * Ruft den Wert der tokenRequestedType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTokenRequestedType() {
        return tokenRequestedType;
    }
    /**
     * Legt den Wert der tokenRequestedType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTokenRequestedType(String value) {
        this.tokenRequestedType = value;
    }
    /**
     * Ruft den Wert der tokenValue-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTokenValue() {
        return tokenValue;
    }
    /**
     * Legt den Wert der tokenValue-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTokenValue(String value) {
        this.tokenValue = value;
    }
    /**
     * Ruft den Wert der expiryDateTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpiryDateTime() {
        return expiryDateTime;
    }
    /**
     * Legt den Wert der expiryDateTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpiryDateTime(XMLGregorianCalendar value) {
        this.expiryDateTime = value;
    }
}
