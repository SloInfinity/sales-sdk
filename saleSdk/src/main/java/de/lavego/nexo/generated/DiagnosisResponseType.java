//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
/**
 * Definition: Content of the Diagnosis Response message. -- Usage: It
 * 				conveys the result of the requested diagnosis and a possible message to display on a
 * 				logical device.
 *
 * <p>Java-Klasse für DiagnosisResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DiagnosisResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="LoggedSaleID" type="{}LoggedSaleIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POIStatus" type="{}POIStatusType" minOccurs="0"/>
 *         &lt;element name="HostStatus" type="{}HostStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class DiagnosisResponseType {
    @Element(name = "Response", required = true)
    protected ResponseType response;
    @Element(name = "LoggedSaleID", required = false)
    protected List<String> loggedSaleID;
    @Element(name = "POIStatus", required = false)
    protected POIStatusType poiStatus;
    @Element(name = "HostStatus", required = false)
    protected List<HostStatusType> hostStatus;
    /**
     * Ruft den Wert der response-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ResponseType }
     *
     */
    public ResponseType getResponse() {
        return response;
    }
    /**
     * Legt den Wert der response-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }
    /**
     * Gets the value of the loggedSaleID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loggedSaleID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoggedSaleID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getLoggedSaleID() {
        if (loggedSaleID == null) {
            loggedSaleID = new ArrayList<String>();
        }
        return this.loggedSaleID;
    }
    /**
     * Ruft den Wert der poiStatus-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link POIStatusType }
     *
     */
    public POIStatusType getPOIStatus() {
        return poiStatus;
    }
    /**
     * Legt den Wert der poiStatus-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link POIStatusType }
     *
     */
    public void setPOIStatus(POIStatusType value) {
        this.poiStatus = value;
    }
    /**
     * Gets the value of the hostStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStatusType }
     *
     *
     */
    public List<HostStatusType> getHostStatus() {
        if (hostStatus == null) {
            hostStatus = new ArrayList<HostStatusType>();
        }
        return this.hostStatus;
    }
}
