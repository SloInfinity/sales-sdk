//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Sale items of a transaction. -- Usage: In loyalty or value
 * 				added payment card transaction, the items of the sale are entering in the processing
 * 				of the transaction. The sum of the item amount could be more than the Requested
 * 				amount in case of split payment without split of the
 *
 * <p>Java-Klasse für SaleItemType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SaleItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitOfMeasure" type="{}UnitOfMeasureTypeCode" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{}QuantityType" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{}SimpleAmountType" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{}TaxCodeType" minOccurs="0"/>
 *         &lt;element name="SaleChannel" type="{}SaleChannelType" minOccurs="0"/>
 *         &lt;element name="ProductLabel" type="{}ProductLabelType" minOccurs="0"/>
 *         &lt;element name="AdditionalProductInfo" type="{}AdditionalProductInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ItemID" use="required" type="{}ItemIDType" />
 *       &lt;attribute name="ProductCode" use="required" type="{}ProductCodeType" />
 *       &lt;attribute name="EanUpc" type="{}EanUpcType" />
 *       &lt;attribute name="ItemAmount" use="required" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SaleItemType {
    @Element(name = "UnitOfMeasure", required = false)
    protected String unitOfMeasure;
    @Element(name = "Quantity", required = false)
    protected BigDecimal quantity;
    @Element(name = "UnitPrice", required = false)
    protected BigDecimal unitPrice;
    @Element(name = "TaxCode", required = false)
    protected String taxCode;
    @Element(name = "SaleChannel", required = false)
    protected String saleChannel;
    @Element(name = "ProductLabel", required = false)
    protected String productLabel;
    @Element(name = "AdditionalProductInfo", required = false)
    protected String additionalProductInfo;
    @Attribute(name = "ItemID", required = true)
    protected BigInteger itemID;
    @Attribute(name = "ProductCode", required = true)
    protected String productCode;
    @Attribute(name = "EanUpc", required = false)
    protected String eanUpc;
    @Attribute(name = "ItemAmount", required = true)
    protected BigDecimal itemAmount;
    /**
     * Ruft den Wert der unitOfMeasure-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }
    /**
     * Legt den Wert der unitOfMeasure-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }
    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantity() {
        return quantity;
    }
    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }
    /**
     * Ruft den Wert der unitPrice-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
    /**
     * Legt den Wert der unitPrice-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }
    /**
     * Ruft den Wert der taxCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxCode() {
        return taxCode;
    }
    /**
     * Legt den Wert der taxCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }
    /**
     * Ruft den Wert der saleChannel-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleChannel() {
        return saleChannel;
    }
    /**
     * Legt den Wert der saleChannel-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleChannel(String value) {
        this.saleChannel = value;
    }
    /**
     * Ruft den Wert der productLabel-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductLabel() {
        return productLabel;
    }
    /**
     * Legt den Wert der productLabel-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductLabel(String value) {
        this.productLabel = value;
    }
    /**
     * Ruft den Wert der additionalProductInfo-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalProductInfo() {
        return additionalProductInfo;
    }
    /**
     * Legt den Wert der additionalProductInfo-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalProductInfo(String value) {
        this.additionalProductInfo = value;
    }
    /**
     * Ruft den Wert der itemID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getItemID() {
        return itemID;
    }
    /**
     * Legt den Wert der itemID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setItemID(BigInteger value) {
        this.itemID = value;
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
}
