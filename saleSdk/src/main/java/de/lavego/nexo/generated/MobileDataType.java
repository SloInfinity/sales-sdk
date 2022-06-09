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
 * Definition: Information related to the mobile for the payment
 * 				transaction. -- Usage: Mobile phone is used as a payment instrument for the
 * 				transaction.
 *
 * <p>Java-Klasse für MobileDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MobileDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileCountryCode" type="{}MobileCountryCodeType" minOccurs="0"/>
 *         &lt;element name="Geolocation" type="{}GeolocationType" minOccurs="0"/>
 *         &lt;element name="ProtectedMobileData" type="{}ContentInformationType" minOccurs="0"/>
 *         &lt;element name="SensitiveMobileData" type="{}SensitiveMobileDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MobileNetworkCode" type="{}MobileNetworkCodeType" />
 *       &lt;attribute name="MaskedMSISDN" type="{}MaskedMSISDNType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class MobileDataType {
    @Element(name = "MobileCountryCode", required = false)
    protected String mobileCountryCode;
    @Element(name = "Geolocation", required = false)
    protected GeolocationType geolocation;
    @Element(name = "ProtectedMobileData", required = false)
    protected ContentInformationType protectedMobileData;
    @Element(name = "SensitiveMobileData", required = false)
    protected SensitiveMobileDataType sensitiveMobileData;
    @Attribute(name = "MobileNetworkCode", required = false)
    protected String mobileNetworkCode;
    @Attribute(name = "MaskedMSISDN", required = false)
    protected String maskedMSISDN;
    /**
     * Ruft den Wert der mobileCountryCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobileCountryCode() {
        return mobileCountryCode;
    }
    /**
     * Legt den Wert der mobileCountryCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobileCountryCode(String value) {
        this.mobileCountryCode = value;
    }
    /**
     * Ruft den Wert der geolocation-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link GeolocationType }
     *
     */
    public GeolocationType getGeolocation() {
        return geolocation;
    }
    /**
     * Legt den Wert der geolocation-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link GeolocationType }
     *
     */
    public void setGeolocation(GeolocationType value) {
        this.geolocation = value;
    }
    /**
     * Ruft den Wert der protectedMobileData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ContentInformationType }
     *
     */
    public ContentInformationType getProtectedMobileData() {
        return protectedMobileData;
    }
    /**
     * Legt den Wert der protectedMobileData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ContentInformationType }
     *
     */
    public void setProtectedMobileData(ContentInformationType value) {
        this.protectedMobileData = value;
    }
    /**
     * Ruft den Wert der sensitiveMobileData-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SensitiveMobileDataType }
     *
     */
    public SensitiveMobileDataType getSensitiveMobileData() {
        return sensitiveMobileData;
    }
    /**
     * Legt den Wert der sensitiveMobileData-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SensitiveMobileDataType }
     *
     */
    public void setSensitiveMobileData(SensitiveMobileDataType value) {
        this.sensitiveMobileData = value;
    }
    /**
     * Ruft den Wert der mobileNetworkCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobileNetworkCode() {
        return mobileNetworkCode;
    }
    /**
     * Legt den Wert der mobileNetworkCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobileNetworkCode(String value) {
        this.mobileNetworkCode = value;
    }
    /**
     * Ruft den Wert der maskedMSISDN-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaskedMSISDN() {
        return maskedMSISDN;
    }
    /**
     * Legt den Wert der maskedMSISDN-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaskedMSISDN(String value) {
        this.maskedMSISDN = value;
    }
}
