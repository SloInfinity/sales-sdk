//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Filter to compute the totals. -- Usage: Used for the Get
 * 				Totals, to request totals for a (or a combination of) particular value of the POI
 * 				Terminal, Sale Terminal, Cashier, Shift or TotalsGroupID.
 *
 * <p>Java-Klasse für TotalFilterType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TotalFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="POIID" type="{}POIIDType" />
 *       &lt;attribute name="SaleID" type="{}SaleIDType" />
 *       &lt;attribute name="OperatorID" type="{}OperatorIDType" />
 *       &lt;attribute name="ShiftNumber" type="{}ShiftNumberType" />
 *       &lt;attribute name="TotalsGroupID" type="{}TotalsGroupIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class TotalFilterType {
    @Attribute(name = "POIID", required = false)
    protected String poiid;
    @Attribute(name = "SaleID", required = false)
    protected String saleID;
    @Attribute(name = "OperatorID", required = false)
    protected String operatorID;
    @Attribute(name = "ShiftNumber", required = false)
    protected String shiftNumber;
    @Attribute(name = "TotalsGroupID", required = false)
    protected String totalsGroupID;
    /**
     * Ruft den Wert der poiid-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOIID() {
        return poiid;
    }
    /**
     * Legt den Wert der poiid-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOIID(String value) {
        this.poiid = value;
    }
    /**
     * Ruft den Wert der saleID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaleID() {
        return saleID;
    }
    /**
     * Legt den Wert der saleID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaleID(String value) {
        this.saleID = value;
    }
    /**
     * Ruft den Wert der operatorID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperatorID() {
        return operatorID;
    }
    /**
     * Legt den Wert der operatorID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }
    /**
     * Ruft den Wert der shiftNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShiftNumber() {
        return shiftNumber;
    }
    /**
     * Legt den Wert der shiftNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShiftNumber(String value) {
        this.shiftNumber = value;
    }
    /**
     * Ruft den Wert der totalsGroupID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalsGroupID() {
        return totalsGroupID;
    }
    /**
     * Legt den Wert der totalsGroupID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalsGroupID(String value) {
        this.totalsGroupID = value;
    }
}
