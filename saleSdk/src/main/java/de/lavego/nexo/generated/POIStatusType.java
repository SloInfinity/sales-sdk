//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: State of a POI Terminal. -- Usage: Indicate the
 * 				availability of the POI Terminal components. The data element is absent if the
 * 				component is not part of the POI Terminal.
 *
 * <p>Java-Klasse für POIStatusType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="POIStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashHandlingDevice" type="{}CashHandlingDeviceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GlobalStatus" use="required" type="{}GlobalStatusTypeCode" />
 *       &lt;attribute name="SecurityOKFlag" type="{}SecurityOKFlagType" />
 *       &lt;attribute name="PEDOKFlag" type="{}PEDOKFlagType" />
 *       &lt;attribute name="CardReaderOKFlag" type="{}CardReaderOKFlagType" />
 *       &lt;attribute name="PrinterStatus" type="{}PrinterStatusTypeCode" />
 *       &lt;attribute name="CommunicationOKFlag" type="{}CommunicationOKFlagType" />
 *       &lt;attribute name="FraudPreventionFlag" type="{}FraudPreventionFlagType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class POIStatusType {
    @Element(name = "CashHandlingDevice", required = false)
    protected List<CashHandlingDeviceType> cashHandlingDevice;
    @Attribute(name = "GlobalStatus", required = true)
    protected String globalStatus;
    @Attribute(name = "SecurityOKFlag", required = false)
    protected Boolean securityOKFlag;
    @Attribute(name = "PEDOKFlag", required = false)
    protected Boolean pedokFlag;
    @Attribute(name = "CardReaderOKFlag", required = false)
    protected Boolean cardReaderOKFlag;
    @Attribute(name = "PrinterStatus", required = false)
    protected String printerStatus;
    @Attribute(name = "CommunicationOKFlag", required = false)
    protected Boolean communicationOKFlag;
    @Attribute(name = "FraudPreventionFlag", required = false)
    protected Boolean fraudPreventionFlag;
    /**
     * Gets the value of the cashHandlingDevice property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashHandlingDevice property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashHandlingDevice().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashHandlingDeviceType }
     *
     *
     */
    public List<CashHandlingDeviceType> getCashHandlingDevice() {
        if (cashHandlingDevice == null) {
            cashHandlingDevice = new ArrayList<CashHandlingDeviceType>();
        }
        return this.cashHandlingDevice;
    }
    /**
     * Ruft den Wert der globalStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGlobalStatus() {
        return globalStatus;
    }
    /**
     * Legt den Wert der globalStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGlobalStatus(String value) {
        this.globalStatus = value;
    }
    /**
     * Ruft den Wert der securityOKFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSecurityOKFlag() {
        return securityOKFlag;
    }
    /**
     * Legt den Wert der securityOKFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSecurityOKFlag(Boolean value) {
        this.securityOKFlag = value;
    }
    /**
     * Ruft den Wert der pedokFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPEDOKFlag() {
        return pedokFlag;
    }
    /**
     * Legt den Wert der pedokFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPEDOKFlag(Boolean value) {
        this.pedokFlag = value;
    }
    /**
     * Ruft den Wert der cardReaderOKFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCardReaderOKFlag() {
        return cardReaderOKFlag;
    }
    /**
     * Legt den Wert der cardReaderOKFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCardReaderOKFlag(Boolean value) {
        this.cardReaderOKFlag = value;
    }
    /**
     * Ruft den Wert der printerStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrinterStatus() {
        return printerStatus;
    }
    /**
     * Legt den Wert der printerStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrinterStatus(String value) {
        this.printerStatus = value;
    }
    /**
     * Ruft den Wert der communicationOKFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCommunicationOKFlag() {
        return communicationOKFlag;
    }
    /**
     * Legt den Wert der communicationOKFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCommunicationOKFlag(Boolean value) {
        this.communicationOKFlag = value;
    }
    /**
     * Ruft den Wert der fraudPreventionFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFraudPreventionFlag() {
        return fraudPreventionFlag;
    }
    /**
     * Legt den Wert der fraudPreventionFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFraudPreventionFlag(Boolean value) {
        this.fraudPreventionFlag = value;
    }
}
