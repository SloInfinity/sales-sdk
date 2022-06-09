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
 * Definition: Content of the Diagnosis Request message. -- Usage: It
 * 				conveys Information related to the target POI for which the diagnosis is
 * 				requested
 *
 * <p>Java-Klasse für DiagnosisRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DiagnosisRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquirerID" type="{}AcquirerIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="POIID" type="{}POIIDType" />
 *       &lt;attribute name="HostDiagnosisFlag" type="{}HostDiagnosisFlagType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class DiagnosisRequestType {
    @Element(name = "AcquirerID", required = false)
    protected List<String> acquirerID;
    @Attribute(name = "POIID", required = false)
    protected String poiid;
    @Attribute(name = "HostDiagnosisFlag", required = false)
    protected Boolean hostDiagnosisFlag;
    /**
     * Gets the value of the acquirerID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquirerID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquirerID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getAcquirerID() {
        if (acquirerID == null) {
            acquirerID = new ArrayList<String>();
        }
        return this.acquirerID;
    }
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
     * Ruft den Wert der hostDiagnosisFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isHostDiagnosisFlag() {
        if (hostDiagnosisFlag == null) {
            return false;
        } else {
            return hostDiagnosisFlag;
        }
    }
    /**
     * Legt den Wert der hostDiagnosisFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHostDiagnosisFlag(Boolean value) {
        this.hostDiagnosisFlag = value;
    }
}
