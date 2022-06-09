//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import javax.xml.datatype.XMLGregorianCalendar;
/**
 * Definition: Content of the EventNotification message. -- Usage: It
 * 				conveys Information related to the event, and possible action (maintenance, message
 * 				to display).
 *
 * <p>Java-Klasse für EventNotificationType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EventNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDetails" type="{}EventDetailsType" minOccurs="0"/>
 *         &lt;element name="RejectedMessage" type="{}RejectedMessageType" minOccurs="0"/>
 *         &lt;element name="DisplayOutput" type="{}DisplayOutputType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeStamp" use="required" type="{}TimeStampType" />
 *       &lt;attribute name="EventToNotify" use="required" type="{}EventToNotifyTypeCode" />
 *       &lt;attribute name="MaintenanceRequiredFlag" type="{}MaintenanceRequiredFlagType" default="false" />
 *       &lt;attribute name="CustomerLanguage" type="{}ISOLanguage2A" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class EventNotificationType {
    @Element(name = "EventDetails", required = false)
    protected String eventDetails;
    @Element(name = "RejectedMessage", required = false)
    protected byte[] rejectedMessage;
    @Element(name = "DisplayOutput", required = false)
    protected DisplayOutputType displayOutput;
    @Attribute(name = "TimeStamp", required = true)
    protected XMLGregorianCalendar timeStamp;
    @Attribute(name = "EventToNotify", required = true)
    protected String eventToNotify;
    @Attribute(name = "MaintenanceRequiredFlag", required = false)
    protected Boolean maintenanceRequiredFlag;
    @Attribute(name = "CustomerLanguage", required = false)
    protected String customerLanguage;
    /**
     * Ruft den Wert der eventDetails-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEventDetails() {
        return eventDetails;
    }
    /**
     * Legt den Wert der eventDetails-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEventDetails(String value) {
        this.eventDetails = value;
    }
    /**
     * Ruft den Wert der rejectedMessage-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRejectedMessage() {
        return rejectedMessage;
    }
    /**
     * Legt den Wert der rejectedMessage-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRejectedMessage(byte[] value) {
        this.rejectedMessage = value;
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
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }
    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }
    /**
     * Ruft den Wert der eventToNotify-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEventToNotify() {
        return eventToNotify;
    }
    /**
     * Legt den Wert der eventToNotify-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEventToNotify(String value) {
        this.eventToNotify = value;
    }
    /**
     * Ruft den Wert der maintenanceRequiredFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isMaintenanceRequiredFlag() {
        if (maintenanceRequiredFlag == null) {
            return false;
        } else {
            return maintenanceRequiredFlag;
        }
    }
    /**
     * Legt den Wert der maintenanceRequiredFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMaintenanceRequiredFlag(Boolean value) {
        this.maintenanceRequiredFlag = value;
    }
    /**
     * Ruft den Wert der customerLanguage-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerLanguage() {
        return customerLanguage;
    }
    /**
     * Legt den Wert der customerLanguage-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerLanguage(String value) {
        this.customerLanguage = value;
    }
}
