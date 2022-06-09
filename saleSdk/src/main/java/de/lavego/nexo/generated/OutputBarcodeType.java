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
 * Definition: BarCode content to display or print. -- Usage: Various
 * 				usage of barcode
 *
 * <p>Java-Klasse für OutputBarcodeType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OutputBarcodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BarcodeValue" type="{}BarcodeValueType" minOccurs="0"/>
 *         &lt;element name="QRCodeBinaryValue" type="{}QRCodeBinaryValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BarcodeType" type="{}BarcodeTypeTypeCode" default="EAN13" />
 *       &lt;attribute name="QRCodeVersion" type="{}QRCodeVersionType" />
 *       &lt;attribute name="QRCodeEncodingMode" type="{}QRCodeEncodingModeEnumeration" />
 *       &lt;attribute name="QRCodeErrorCorrection" type="{}QRCodeErrorCorrectionEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class OutputBarcodeType {
    @Element(name = "BarcodeValue", required = false)
    protected String barcodeValue;
    @Element(name = "QRCodeBinaryValue", required = false)
    protected byte[] qrCodeBinaryValue;
    @Attribute(name = "BarcodeType", required = false)
    protected String barcodeType;
    @Attribute(name = "QRCodeVersion", required = false)
    protected String qrCodeVersion;
    @Attribute(name = "QRCodeEncodingMode", required = false)
    protected QRCodeEncodingModeEnumeration qrCodeEncodingMode;
    @Attribute(name = "QRCodeErrorCorrection", required = false)
    protected QRCodeErrorCorrectionEnumeration qrCodeErrorCorrection;
    /**
     * Ruft den Wert der barcodeValue-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBarcodeValue() {
        return barcodeValue;
    }
    /**
     * Legt den Wert der barcodeValue-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBarcodeValue(String value) {
        this.barcodeValue = value;
    }
    /**
     * Ruft den Wert der qrCodeBinaryValue-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQRCodeBinaryValue() {
        return qrCodeBinaryValue;
    }
    /**
     * Legt den Wert der qrCodeBinaryValue-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQRCodeBinaryValue(byte[] value) {
        this.qrCodeBinaryValue = value;
    }
    /**
     * Ruft den Wert der barcodeType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBarcodeType() {
        if (barcodeType == null) {
            return "EAN13";
        } else {
            return barcodeType;
        }
    }
    /**
     * Legt den Wert der barcodeType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBarcodeType(String value) {
        this.barcodeType = value;
    }
    /**
     * Ruft den Wert der qrCodeVersion-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQRCodeVersion() {
        return qrCodeVersion;
    }
    /**
     * Legt den Wert der qrCodeVersion-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQRCodeVersion(String value) {
        this.qrCodeVersion = value;
    }
    /**
     * Ruft den Wert der qrCodeEncodingMode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link QRCodeEncodingModeEnumeration }
     *
     */
    public QRCodeEncodingModeEnumeration getQRCodeEncodingMode() {
        return qrCodeEncodingMode;
    }
    /**
     * Legt den Wert der qrCodeEncodingMode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link QRCodeEncodingModeEnumeration }
     *
     */
    public void setQRCodeEncodingMode(QRCodeEncodingModeEnumeration value) {
        this.qrCodeEncodingMode = value;
    }
    /**
     * Ruft den Wert der qrCodeErrorCorrection-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link QRCodeErrorCorrectionEnumeration }
     *
     */
    public QRCodeErrorCorrectionEnumeration getQRCodeErrorCorrection() {
        return qrCodeErrorCorrection;
    }
    /**
     * Legt den Wert der qrCodeErrorCorrection-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link QRCodeErrorCorrectionEnumeration }
     *
     */
    public void setQRCodeErrorCorrection(QRCodeErrorCorrectionEnumeration value) {
        this.qrCodeErrorCorrection = value;
    }
}
