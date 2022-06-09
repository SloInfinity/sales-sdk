//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Information related to the software and hardware feature
 * 				of the Sale Terminal. -- Usage: In the Login Request, if a Sale Terminal is involved
 * 				in the login. In other messages, when a logical device is out of order
 * 				(SaleCapabilites), or when the other data have changed since or were not in the
 * 				Login.
 *
 * <p>Java-Klasse für SaleTerminalDataType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SaleTerminalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleCapabilities" type="{}SaleCapabilitiesType" minOccurs="0"/>
 *         &lt;element name="SaleProfile" type="{}SaleProfileType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TerminalEnvironment" type="{}TerminalEnvironmentTypeCode" />
 *       &lt;attribute name="TotalsGroupID" type="{}TotalsGroupIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SaleTerminalDataType {
    @ElementList(name = "SaleCapabilities", required = false)
    protected List<String> saleCapabilities;
    @Element(name = "SaleProfile", required = false)
    protected SaleProfileType saleProfile;
    @Attribute(name = "TerminalEnvironment", required = false)
    protected String terminalEnvironment;
    @Attribute(name = "TotalsGroupID", required = false)
    protected String totalsGroupID;
    /**
     * Gets the value of the saleCapabilities property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleCapabilities property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleCapabilities().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getSaleCapabilities() {
        if (saleCapabilities == null) {
            saleCapabilities = new ArrayList<String>();
        }
        return this.saleCapabilities;
    }
    /**
     * Ruft den Wert der saleProfile-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link SaleProfileType }
     *
     */
    public SaleProfileType getSaleProfile() {
        return saleProfile;
    }
    /**
     * Legt den Wert der saleProfile-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link SaleProfileType }
     *
     */
    public void setSaleProfile(SaleProfileType value) {
        this.saleProfile = value;
    }
    /**
     * Ruft den Wert der terminalEnvironment-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTerminalEnvironment() {
        return terminalEnvironment;
    }
    /**
     * Legt den Wert der terminalEnvironment-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTerminalEnvironment(String value) {
        this.terminalEnvironment = value;
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
