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
 * Definition: Data related to the stored value card. -- Usage: It
 * 				contains: - the identification of the stored value accounts or the stored value
 * 				cards, if provided by the Sale System, and - the associated products sold by the
 * 				Sale System..
 *
 * <p>Java-Klasse für StoredValueDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StoredValueDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredValueAccountID" type="{}StoredValueAccountIDType" minOccurs="0"/>
 *         &lt;element name="OriginalPOITransaction" type="{}OriginalPOITransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StoredValueProvider" type="{}StoredValueProviderType" />
 *       &lt;attribute name="StoredValueTransactionType" use="required" type="{}StoredValueTransactionTypeTypeCode" />
 *       &lt;attribute name="ProductCode" type="{}ProductCodeType" />
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
public class StoredValueDataType {
    @Element(name = "StoredValueAccountID", required = false)
    protected StoredValueAccountIDType storedValueAccountID;
    @Element(name = "OriginalPOITransaction", required = false)
    protected OriginalPOITransactionType originalPOITransaction;
    @Attribute(name = "StoredValueProvider", required = false)
    protected String storedValueProvider;
    @Attribute(name = "StoredValueTransactionType", required = true)
    protected String storedValueTransactionType;
    @Attribute(name = "ProductCode", required = false)
    protected String productCode;
    @Attribute(name = "EanUpc", required = false)
    protected String eanUpc;
    @Attribute(name = "ItemAmount", required = true)
    protected BigDecimal itemAmount;
    @Attribute(name = "Currency", required = true)
    protected String currency;
    /**
     * Ruft den Wert der storedValueAccountID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link StoredValueAccountIDType }
     *
     */
    public StoredValueAccountIDType getStoredValueAccountID() {
        return storedValueAccountID;
    }
    /**
     * Legt den Wert der storedValueAccountID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link StoredValueAccountIDType }
     *
     */
    public void setStoredValueAccountID(StoredValueAccountIDType value) {
        this.storedValueAccountID = value;
    }
    /**
     * Ruft den Wert der originalPOITransaction-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OriginalPOITransactionType }
     *
     */
    public OriginalPOITransactionType getOriginalPOITransaction() {
        return originalPOITransaction;
    }
    /**
     * Legt den Wert der originalPOITransaction-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OriginalPOITransactionType }
     *
     */
    public void setOriginalPOITransaction(OriginalPOITransactionType value) {
        this.originalPOITransaction = value;
    }
    /**
     * Ruft den Wert der storedValueProvider-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStoredValueProvider() {
        return storedValueProvider;
    }
    /**
     * Legt den Wert der storedValueProvider-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStoredValueProvider(String value) {
        this.storedValueProvider = value;
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
