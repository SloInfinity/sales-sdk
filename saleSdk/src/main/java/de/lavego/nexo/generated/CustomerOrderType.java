//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Definition: Customer order attached to a card, recorded in the POI
 * system. -- Usage: Allows the management of customer orders by the POI, for instance
 * in a multi-channel or a click and collect sale transaction.
 *
 * <p>Java-Klasse für CustomerOrderType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CustomerOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalInformation" type="{}AdditionalInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CustomerOrderID" type="{}CustomerOrderIDType" />
 *       &lt;attribute name="OpenOrderState" type="{}OpenOrderStateType" default="false" />
 *       &lt;attribute name="StartDate" use="required" type="{}StartDateType" />
 *       &lt;attribute name="EndDate" type="{}EndDateType" />
 *       &lt;attribute name="ForecastedAmount" use="required" type="{}SimpleAmountType" />
 *       &lt;attribute name="CurrentAmount" type="{}SimpleAmountType" />
 *       &lt;attribute name="Currency" type="{}ISOCurrency3A" />
 *       &lt;attribute name="AccessedBy" type="{}AccessedByType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class CustomerOrderType
{
    @Element(name = "AdditionalInformation", required = false)
    protected String               additionalInformation;
    @Attribute(name = "CustomerOrderID", required = false)
    protected String               customerOrderID;
    @Attribute(name = "OpenOrderState", required = false)
    protected Boolean              openOrderState;
    @Attribute(name = "StartDate", required = true)
    protected XMLGregorianCalendar startDate;
    @Attribute(name = "EndDate", required = false)
    protected XMLGregorianCalendar endDate;
    @Attribute(name = "ForecastedAmount", required = true)
    protected BigDecimal           forecastedAmount;
    @Attribute(name = "CurrentAmount", required = false)
    protected BigDecimal           currentAmount;
    @Attribute(name = "Currency", required = false)
    protected String               currency;
    @Attribute(name = "AccessedBy", required = false)
    protected String               accessedBy;
    
    /**
     * Ruft den Wert der accessedBy-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAccessedBy()
    {
        return accessedBy;
    }
    
    /**
     * Legt den Wert der accessedBy-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccessedBy(String value)
    {
        this.accessedBy = value;
    }
    
    /**
     * Ruft den Wert der additionalInformation-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdditionalInformation()
    {
        return additionalInformation;
    }
    
    /**
     * Legt den Wert der additionalInformation-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdditionalInformation(String value)
    {
        this.additionalInformation = value;
    }
    
    /**
     * Ruft den Wert der currency-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrency()
    {
        return currency;
    }
    
    /**
     * Legt den Wert der currency-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrency(String value)
    {
        this.currency = value;
    }
    
    /**
     * Ruft den Wert der currentAmount-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getCurrentAmount()
    {
        return currentAmount;
    }
    
    /**
     * Legt den Wert der currentAmount-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setCurrentAmount(BigDecimal value)
    {
        this.currentAmount = value;
    }
    
    /**
     * Ruft den Wert der customerOrderID-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomerOrderID()
    {
        return customerOrderID;
    }
    
    /**
     * Legt den Wert der customerOrderID-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomerOrderID(String value)
    {
        this.customerOrderID = value;
    }
    
    /**
     * Ruft den Wert der endDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEndDate()
    {
        return endDate;
    }
    
    /**
     * Legt den Wert der endDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEndDate(XMLGregorianCalendar value)
    {
        this.endDate = value;
    }
    
    /**
     * Ruft den Wert der forecastedAmount-Eigenschaft ab.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getForecastedAmount()
    {
        return forecastedAmount;
    }
    
    /**
     * Legt den Wert der forecastedAmount-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setForecastedAmount(BigDecimal value)
    {
        this.forecastedAmount = value;
    }
    
    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartDate()
    {
        return startDate;
    }
    
    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStartDate(XMLGregorianCalendar value)
    {
        this.startDate = value;
    }
    
    /**
     * Ruft den Wert der openOrderState-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isOpenOrderState()
    {
        if (openOrderState == null)
        {
            return false;
        }
        else
        {
            return openOrderState;
        }
    }
    
    /**
     * Legt den Wert der openOrderState-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setOpenOrderState(Boolean value)
    {
        this.openOrderState = value;
    }
}
