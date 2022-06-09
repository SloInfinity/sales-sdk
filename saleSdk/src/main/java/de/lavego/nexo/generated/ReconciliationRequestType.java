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
 * Definition: Content of the Reconciliation Request message. -- Usage:
 * 				It conveys Information related to the Reconciliation requested by the Sale System:
 * 				Type of reconciliation (with or without closure of the reconciliation time period)
 * 				The Acquirers identification if they are involved and could be
 * 				selected
 *
 * <p>Java-Klasse für ReconciliationRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ReconciliationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcquirerID" type="{}AcquirerIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReconciliationType" use="required" type="{}ReconciliationTypeTypeCode" />
 *       &lt;attribute name="POIReconciliationID" type="{}POIReconciliationIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class ReconciliationRequestType {
    @Element(name = "AcquirerID", required = false)
    protected List<String> acquirerID;
    @Attribute(name = "ReconciliationType", required = true)
    protected String reconciliationType;
    @Attribute(name = "POIReconciliationID", required = false)
    protected String poiReconciliationID;
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
     * Ruft den Wert der reconciliationType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReconciliationType() {
        return reconciliationType;
    }
    /**
     * Legt den Wert der reconciliationType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReconciliationType(String value) {
        this.reconciliationType = value;
    }
    /**
     * Ruft den Wert der poiReconciliationID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOIReconciliationID() {
        return poiReconciliationID;
    }
    /**
     * Legt den Wert der poiReconciliationID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOIReconciliationID(String value) {
        this.poiReconciliationID = value;
    }
}
