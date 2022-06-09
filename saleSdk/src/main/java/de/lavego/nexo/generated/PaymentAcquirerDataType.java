//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Definition: Data related to the response from the payment
 * 				Acquirer.
 *
 * <p>Java-Klasse für PaymentAcquirerDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentAcquirerDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquirerTransactionID" type="{}TransactionIdentificationType" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{}ApprovalCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AcquirerID" type="{}AcquirerIDType" />
 *       &lt;attribute name="MerchantID" use="required" type="{}MerchantIDType" />
 *       &lt;attribute name="AcquirerPOIID" use="required" type="{}AcquirerPOIIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@Root(strict = false)
public class PaymentAcquirerDataType {
    @Element(name = "AcquirerTransactionID", required = false)
    protected TransactionIdentificationType acquirerTransactionID;
    @Element(name = "ApprovalCode", required = false)
    protected String approvalCode;
    @Attribute(name = "AcquirerID", required = false)
    protected String acquirerID;
    // HACK for nexoFast app, must TRUE
    @Attribute(name = "MerchantID", required = false)
    protected String merchantID;
    @Attribute(name = "AcquirerPOIID", required = true)
    protected String acquirerPOIID;
    /**
     * Ruft den Wert der acquirerTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getAcquirerTransactionID() {
        return acquirerTransactionID;
    }
    /**
     * Legt den Wert der acquirerTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setAcquirerTransactionID(TransactionIdentificationType value) {
        this.acquirerTransactionID = value;
    }
    /**
     * Ruft den Wert der approvalCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApprovalCode() {
        return approvalCode;
    }
    /**
     * Legt den Wert der approvalCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }
    /**
     * Ruft den Wert der acquirerID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcquirerID() {
        return acquirerID;
    }
    /**
     * Legt den Wert der acquirerID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcquirerID(String value) {
        this.acquirerID = value;
    }
    /**
     * Ruft den Wert der merchantID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantID() {
        return merchantID;
    }
    /**
     * Legt den Wert der merchantID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }
    /**
     * Ruft den Wert der acquirerPOIID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcquirerPOIID() {
        return acquirerPOIID;
    }
    /**
     * Legt den Wert der acquirerPOIID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcquirerPOIID(String value) {
        this.acquirerPOIID = value;
    }
}
