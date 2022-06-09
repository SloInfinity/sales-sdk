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
 * Definition: Data related to the loyalty Acquirer during a loyalty
 * 				transaction. -- Usage: Information allowing the Sale System to characterise the
 * 				transaction on the loyalty Acquirer host.
 *
 * <p>Java-Klasse für LoyaltyAcquirerDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyAcquirerDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApprovalCode" type="{}ApprovalCodeType" minOccurs="0"/>
 *         &lt;element name="LoyaltyTransactionID" type="{}TransactionIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LoyaltyAcquirerID" type="{}LoyaltyAcquirerIDType" />
 *       &lt;attribute name="HostReconciliationID" type="{}HostReconciliationIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyAcquirerDataType {
    @Element(name = "ApprovalCode", required = false)
    protected String approvalCode;
    @Element(name = "LoyaltyTransactionID", required = false)
    protected TransactionIdentificationType loyaltyTransactionID;
    @Attribute(name = "LoyaltyAcquirerID", required = false)
    protected String loyaltyAcquirerID;
    @Attribute(name = "HostReconciliationID", required = false)
    protected String hostReconciliationID;
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
     * Ruft den Wert der loyaltyTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getLoyaltyTransactionID() {
        return loyaltyTransactionID;
    }
    /**
     * Legt den Wert der loyaltyTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setLoyaltyTransactionID(TransactionIdentificationType value) {
        this.loyaltyTransactionID = value;
    }
    /**
     * Ruft den Wert der loyaltyAcquirerID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoyaltyAcquirerID() {
        return loyaltyAcquirerID;
    }
    /**
     * Legt den Wert der loyaltyAcquirerID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoyaltyAcquirerID(String value) {
        this.loyaltyAcquirerID = value;
    }
    /**
     * Ruft den Wert der hostReconciliationID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHostReconciliationID() {
        return hostReconciliationID;
    }
    /**
     * Legt den Wert der hostReconciliationID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHostReconciliationID(String value) {
        this.hostReconciliationID = value;
    }
}
