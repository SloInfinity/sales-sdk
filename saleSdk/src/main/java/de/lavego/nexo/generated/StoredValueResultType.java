//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Result of loading/reloading a stored value card.. --
 * 				Usage: For each stored value card loaded or reloaded, in the StoredValue response
 * 				message
 *
 * <p>Java-Klasse für StoredValueResultType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StoredValueResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredValueAccountStatus" type="{}StoredValueAccountStatusType"/>
 *         &lt;element name="HostTransactionID" type="{}TransactionIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StoredValueTransactionType" use="required" type="{}StoredValueTransactionTypeTypeCode" />
 *       &lt;attribute name="ProductCode" use="required" type="{}ProductCodeType" />
 *       &lt;attribute name="EanUpc" type="{}EanUpcType" />
 *       &lt;attribute name="ItemAmount" use="required" type="{}SimpleAmountType" />
 *       &lt;attribute name="Currency" use="required" type="{}ISOCurrency3A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class StoredValueResultType {
    @Element(name = "StoredValueAccountStatus", required = true)
    protected StoredValueAccountStatusType storedValueAccountStatus;
    @Element(name = "HostTransactionID", required = false)
    protected TransactionIdentificationType hostTransactionID;
    @Attribute(name = "StoredValueTransactionType", required = true)
    protected String storedValueTransactionType;
    @Attribute(name = "ProductCode", required = true)
    protected String productCode;
    @Attribute(name = "EanUpc", required = false)
    protected String eanUpc;
    @Attribute(name = "ItemAmount", required = true)
    protected BigDecimal itemAmount;
    @Attribute(name = "Currency", required = true)
    protected String currency;
    /**
     * Ruft den Wert der storedValueAccountStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link StoredValueAccountStatusType }
     *
     */
    public StoredValueAccountStatusType getStoredValueAccountStatus() {
        return storedValueAccountStatus;
    }
    /**
     * Legt den Wert der storedValueAccountStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link StoredValueAccountStatusType }
     *
     */
    public void setStoredValueAccountStatus(StoredValueAccountStatusType value) {
        this.storedValueAccountStatus = value;
    }
    /**
     * Ruft den Wert der hostTransactionID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdentificationType }
     *
     */
    public TransactionIdentificationType getHostTransactionID() {
        return hostTransactionID;
    }
    /**
     * Legt den Wert der hostTransactionID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdentificationType }
     *
     */
    public void setHostTransactionID(TransactionIdentificationType value) {
        this.hostTransactionID = value;
    }
    /**
     * Ruft den Wert der storedValueTransactionType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStoredValueTransactionType() {
        return storedValueTransactionType;
    }
    /**
     * Legt den Wert der storedValueTransactionType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStoredValueTransactionType(String value) {
        this.storedValueTransactionType = value;
    }
    /**
     * Ruft den Wert der productCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductCode() {
        return productCode;
    }
    /**
     * Legt den Wert der productCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }
    /**
     * Ruft den Wert der eanUpc-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEanUpc() {
        return eanUpc;
    }
    /**
     * Legt den Wert der eanUpc-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEanUpc(String value) {
        this.eanUpc = value;
    }
    /**
     * Ruft den Wert der itemAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getItemAmount() {
        return itemAmount;
    }
    /**
     * Legt den Wert der itemAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setItemAmount(BigDecimal value) {
        this.itemAmount = value;
    }
    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrency() {
        return currency;
    }
    /**
     * Legt den Wert der currency-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrency(String value) {
        this.currency = value;
    }
}
