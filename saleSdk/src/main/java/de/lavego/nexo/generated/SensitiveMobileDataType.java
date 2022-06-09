//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Sensitive information related to the mobile phone. --
 * 				Usage: This data structure could be CMS protected (EnvelopedData). In this case the
 * 				data structure SensitiveMobileData is replaced by the data structure
 * 				ProtectedMobileData of type ContentInformationType. When this data is protected, the
 * 				exact
 *
 * <p>Java-Klasse für SensitiveMobileDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SensitiveMobileDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MSISDN" use="required" type="{}MSISDNType" />
 *       &lt;attribute name="IMSI" type="{}IMSIType" />
 *       &lt;attribute name="IMEI" type="{}IMEIType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SensitiveMobileDataType {
    @Attribute(name = "MSISDN", required = true)
    protected String msisdn;
    @Attribute(name = "IMSI", required = false)
    protected String imsi;
    @Attribute(name = "IMEI", required = false)
    protected String imei;
    /**
     * Ruft den Wert der msisdn-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMSISDN() {
        return msisdn;
    }
    /**
     * Legt den Wert der msisdn-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }
    /**
     * Ruft den Wert der imsi-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMSI() {
        return imsi;
    }
    /**
     * Legt den Wert der imsi-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }
    /**
     * Ruft den Wert der imei-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMEI() {
        return imei;
    }
    /**
     * Legt den Wert der imei-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIMEI(String value) {
        this.imei = value;
    }
}
