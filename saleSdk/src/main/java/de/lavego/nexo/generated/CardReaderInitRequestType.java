//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Content of the Card Reader Init Request message. -- Usage:
 * 				It contains possible restrictions for the type of card reader to use, and a possible
 * 				invitation message to display on the CashierInterface or the
 * 				CustomerInterface.
 *
 * <p>Java-Klasse für CardReaderInitRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CardReaderInitRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForceEntryMode" type="{}ForceEntryModeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplayOutput" type="{}DisplayOutputType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WarmResetFlag" type="{}WarmResetFlagType" />
 *       &lt;attribute name="LeaveCardFlag" type="{}LeaveCardFlagType" default="true" />
 *       &lt;attribute name="MaxWaitingTime" type="{}MaxWaitingTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class CardReaderInitRequestType {
    @Element(name = "ForceEntryMode",required = false)
    protected List<String> forceEntryMode;
    @Element(name = "DisplayOutput", required = false)
    protected DisplayOutputType displayOutput;
    @Attribute(name = "WarmResetFlag", required = false)
    protected Boolean warmResetFlag;
    @Attribute(name = "LeaveCardFlag", required = false)
    protected Boolean leaveCardFlag;
    @Attribute(name = "MaxWaitingTime", required = false)
    protected BigInteger maxWaitingTime;
    /**
     * Gets the value of the forceEntryMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forceEntryMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForceEntryMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     *
     */
    public List<String> getForceEntryMode() {
        if (forceEntryMode == null) {
            forceEntryMode = new ArrayList<String>();
        }
        return this.forceEntryMode;
    }
    /**
     * Ruft den Wert der displayOutput-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link DisplayOutputType }
     *
     */
    public DisplayOutputType getDisplayOutput() {
        return displayOutput;
    }
    /**
     * Legt den Wert der displayOutput-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link DisplayOutputType }
     *
     */
    public void setDisplayOutput(DisplayOutputType value) {
        this.displayOutput = value;
    }
    /**
     * Ruft den Wert der warmResetFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWarmResetFlag() {
        return warmResetFlag;
    }
    /**
     * Legt den Wert der warmResetFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWarmResetFlag(Boolean value) {
        this.warmResetFlag = value;
    }
    /**
     * Ruft den Wert der leaveCardFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isLeaveCardFlag() {
        if (leaveCardFlag == null) {
            return true;
        } else {
            return leaveCardFlag;
        }
    }
    /**
     * Legt den Wert der leaveCardFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setLeaveCardFlag(Boolean value) {
        this.leaveCardFlag = value;
    }
    /**
     * Ruft den Wert der maxWaitingTime-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMaxWaitingTime() {
        return maxWaitingTime;
    }
    /**
     * Legt den Wert der maxWaitingTime-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMaxWaitingTime(BigInteger value) {
        this.maxWaitingTime = value;
    }
}
