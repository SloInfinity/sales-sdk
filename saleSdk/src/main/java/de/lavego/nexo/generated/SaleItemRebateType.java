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
 * Definition: The awarded amount that is attached to an item as a
 * 				rebate. -- Usage: To be differentiated from the award which is the amount or
 * 				quantity earned on the loyalty account.
 *
 * <p>Java-Klasse für SaleItemRebateType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SaleItemRebateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitOfMeasure" type="{}UnitOfMeasureTypeCode" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{}QuantityType" minOccurs="0"/>
 *         &lt;element name="RebateLabel" type="{}RebateLabelType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ItemID" use="required" type="{}ItemIDType" />
 *       &lt;attribute name="ProductCode" use="required" type="{}ProductCodeType" />
 *       &lt;attribute name="EanUpc" type="{}EanUpcType" />
 *       &lt;attribute name="ItemAmount" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SaleItemRebateType {
    @Element(name = "UnitOfMeasure", required = false)
    protected String unitOfMeasure;
    @Element(name = "Quantity", required = false)
    protected BigDecimal quantity;
    @Element(name = "RebateLabel", required = false)
    protected String rebateLabel;
    @Attribute(name = "ItemID", required = true)
    protected BigInteger itemID;
    @Attribute(name = "ProductCode", required = true)
    protected String productCode;
    @Attribute(name = "EanUpc", required = false)
    protected String eanUpc;
    @Attribute(name = "ItemAmount", required = false)
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
     * Ruft den Wert der rebateLabel-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRebateLabel() {
        return rebateLabel;
    }
    /**
     * Legt den Wert der rebateLabel-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRebateLabel(String value) {
        this.rebateLabel = value;
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
