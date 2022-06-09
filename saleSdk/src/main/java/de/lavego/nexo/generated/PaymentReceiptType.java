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
 * Definition: Customer or Merchant payment receipt. -- Usage: If the
 * 				payment receipts are printed by the Sale system and the POI or the Sale does not
 * 				implement the Print exchange (Basic profile).
 *
 * <p>Java-Klasse für PaymentReceiptType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentReceiptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputContent" type="{}OutputContentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentQualifier" use="required" type="{}DocumentQualifierTypeCode" />
 *       &lt;attribute name="IntegratedPrintFlag" type="{}IntegratedPrintFlagType" default="false" />
 *       &lt;attribute name="RequiredSignatureFlag" type="{}RequiredSignatureFlagType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class PaymentReceiptType {
    @Element(name = "OutputContent", required = true)
    protected OutputContentType outputContent;
    @Attribute(name = "DocumentQualifier", required = true)
    protected String documentQualifier;
    @Attribute(name = "IntegratedPrintFlag", required = false)
    protected Boolean integratedPrintFlag;
    @Attribute(name = "RequiredSignatureFlag", required = false)
    protected Boolean requiredSignatureFlag;
    /**
     * Ruft den Wert der outputContent-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OutputContentType }
     *
     */
    public OutputContentType getOutputContent() {
        return outputContent;
    }
    /**
     * Legt den Wert der outputContent-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OutputContentType }
     *
     */
    public void setOutputContent(OutputContentType value) {
        this.outputContent = value;
    }
    /**
     * Ruft den Wert der documentQualifier-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentQualifier() {
        return documentQualifier;
    }
    /**
     * Legt den Wert der documentQualifier-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentQualifier(String value) {
        this.documentQualifier = value;
    }
    /**
     * Ruft den Wert der integratedPrintFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isIntegratedPrintFlag() {
        if (integratedPrintFlag == null) {
            return false;
        } else {
            return integratedPrintFlag;
        }
    }
    /**
     * Legt den Wert der integratedPrintFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIntegratedPrintFlag(Boolean value) {
        this.integratedPrintFlag = value;
    }
    /**
     * Ruft den Wert der requiredSignatureFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isRequiredSignatureFlag() {
        if (requiredSignatureFlag == null) {
            return false;
        } else {
            return requiredSignatureFlag;
        }
    }
    /**
     * Legt den Wert der requiredSignatureFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRequiredSignatureFlag(Boolean value) {
        this.requiredSignatureFlag = value;
    }
}
