//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
/**
 * Definition: Rebate form to an award;
 *
 * <p>Java-Klasse für RebatesType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RebatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalRebate" type="{}SimpleAmountType" minOccurs="0"/>
 *         &lt;element name="RebateLabel" type="{}RebateLabelType" minOccurs="0"/>
 *         &lt;element name="SaleItemRebate" type="{}SaleItemRebateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class RebatesType {
    @Element(name = "TotalRebate", required = false)
    protected BigDecimal totalRebate;
    @Element(name = "RebateLabel", required = false)
    protected String rebateLabel;
    @Element(name = "SaleItemRebate", required = false)
    protected List<SaleItemRebateType> saleItemRebate;
    /**
     * Ruft den Wert der totalRebate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalRebate() {
        return totalRebate;
    }
    /**
     * Legt den Wert der totalRebate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalRebate(BigDecimal value) {
        this.totalRebate = value;
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
     * Gets the value of the saleItemRebate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleItemRebate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItemRebate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItemRebateType }
     *
     *
     */
    public List<SaleItemRebateType> getSaleItemRebate() {
        if (saleItemRebate == null) {
            saleItemRebate = new ArrayList<SaleItemRebateType>();
        }
        return this.saleItemRebate;
    }
}
