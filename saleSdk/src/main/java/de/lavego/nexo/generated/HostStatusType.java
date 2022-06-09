//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
/**
 * Definition: State of a Host. -- Usage: Indicate the reachability of
 * 				the host by the POI Terminal.
 *
 * <p>Java-Klasse für HostStatusType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="HostStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AcquirerID" use="required" type="{}AcquirerIDType" />
 *       &lt;attribute name="IsReachableFlag" type="{}IsReachableFlagType" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class HostStatusType {
    @Attribute(name = "AcquirerID", required = true)
    protected String acquirerID;
    @Attribute(name = "IsReachableFlag", required = false)
    protected Boolean isReachableFlag;
    /**
     * Ruft den Wert der acquirerID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcquirerID() {
        return acquirerID;
    }
    /**
     * Legt den Wert der acquirerID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcquirerID(String value) {
        this.acquirerID = value;
    }
    /**
     * Ruft den Wert der isReachableFlag-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isIsReachableFlag() {
        if (isReachableFlag == null) {
            return true;
        } else {
            return isReachableFlag;
        }
    }
    /**
     * Legt den Wert der isReachableFlag-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsReachableFlag(Boolean value) {
        this.isReachableFlag = value;
    }
}
