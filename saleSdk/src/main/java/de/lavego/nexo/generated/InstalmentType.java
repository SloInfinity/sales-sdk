//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Information related an instalment transaction. -- Usage:
 * 				To request an instalment to the issuer, or to make individual instalments of a
 * 				payment transaction.
 *
 * <p>Java-Klasse für InstalmentType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InstalmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstalmentType" type="{}InstalmentTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SequenceNumber" type="{}SequenceNumberType" />
 *       &lt;attribute name="PlanID" type="{}PlanIDType" />
 *       &lt;attribute name="Period" type="{}PeriodType" />
 *       &lt;attribute name="PeriodUnit" type="{}PeriodUnitTypeCode" />
 *       &lt;attribute name="FirstPaymentDate" type="{}ISODate" />
 *       &lt;attribute name="TotalNbOfPayments" type="{}TotalNbOfPaymentsType" />
 *       &lt;attribute name="CumulativeAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="FirstAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="Charges" type="{}SimpleAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class InstalmentType {
    @ElementList(name = "InstalmentType", required = false)
    protected List<String> instalmentType;
    @Attribute(name = "SequenceNumber", required = false)
    protected BigInteger sequenceNumber;
    @Attribute(name = "PlanID", required = false)
    protected String planID;
    @Attribute(name = "Period", required = false)
    protected BigInteger period;
    @Attribute(name = "PeriodUnit", required = false)
    protected String periodUnit;
    @Attribute(name = "FirstPaymentDate", required = false)
    protected String firstPaymentDate;
    @Attribute(name = "TotalNbOfPayments", required = false)
    protected BigInteger totalNbOfPayments;
    @Attribute(name = "CumulativeAmount", required = false)
    protected BigDecimal cumulativeAmount;
    @Attribute(name = "FirstAmount", required = false)
    protected BigDecimal firstAmount;
    @Attribute(name = "Charges", required = false)
    protected BigDecimal charges;
    /**
     * Gets the value of the instalmentType property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instalmentType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstalmentType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getInstalmentType() {
        if (instalmentType == null) {
            instalmentType = new ArrayList<String>();
        }
        return this.instalmentType;
    }
    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }
    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }
    /**
     * Ruft den Wert der planID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlanID() {
        return planID;
    }
    /**
     * Legt den Wert der planID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlanID(String value) {
        this.planID = value;
    }
    /**
     * Ruft den Wert der period-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPeriod() {
        return period;
    }
    /**
     * Legt den Wert der period-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPeriod(BigInteger value) {
        this.period = value;
    }
    /**
     * Ruft den Wert der periodUnit-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPeriodUnit() {
        return periodUnit;
    }
    /**
     * Legt den Wert der periodUnit-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPeriodUnit(String value) {
        this.periodUnit = value;
    }
    /**
     * Ruft den Wert der firstPaymentDate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstPaymentDate() {
        return firstPaymentDate;
    }
    /**
     * Legt den Wert der firstPaymentDate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstPaymentDate(String value) {
        this.firstPaymentDate = value;
    }
    /**
     * Ruft den Wert der totalNbOfPayments-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getTotalNbOfPayments() {
        return totalNbOfPayments;
    }
    /**
     * Legt den Wert der totalNbOfPayments-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setTotalNbOfPayments(BigInteger value) {
        this.totalNbOfPayments = value;
    }
    /**
     * Ruft den Wert der cumulativeAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCumulativeAmount() {
        return cumulativeAmount;
    }
    /**
     * Legt den Wert der cumulativeAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCumulativeAmount(BigDecimal value) {
        this.cumulativeAmount = value;
    }
    /**
     * Ruft den Wert der firstAmount-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getFirstAmount() {
        return firstAmount;
    }
    /**
     * Legt den Wert der firstAmount-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setFirstAmount(BigDecimal value) {
        this.firstAmount = value;
    }
    /**
     * Ruft den Wert der charges-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCharges() {
        return charges;
    }
    /**
     * Legt den Wert der charges-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCharges(BigDecimal value) {
        this.charges = value;
    }
}
