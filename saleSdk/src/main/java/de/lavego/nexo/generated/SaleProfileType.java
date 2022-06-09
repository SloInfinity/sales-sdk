//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Functional profile of the Sale Terminal. -- Usage: Sent in
 * 				the Login Request to identify the functions that might be requested by the Sale
 * 				Terminal during the session. The value of this data element contains: One of the
 * 				generic profile: Basic, Standard or Extended, A list (possibly
 *
 * <p>Java-Klasse für SaleProfileType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SaleProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceProfiles" type="{}ServiceProfilesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GenericProfile" type="{}GenericProfileTypeCode" default="Standard" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SaleProfileType {
    @ElementList(name = "ServiceProfiles", required = false)
    protected List<String> serviceProfiles;
    @Attribute(name = "GenericProfile", required = false)
    protected String genericProfile;
    /**
     * Gets the value of the serviceProfiles property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProfiles property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProfiles().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getServiceProfiles() {
        if (serviceProfiles == null) {
            serviceProfiles = new ArrayList<String>();
        }
        return this.serviceProfiles;
    }
    /**
     * Ruft den Wert der genericProfile-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGenericProfile() {
        if (genericProfile == null) {
            return "Standard";
        } else {
            return genericProfile;
        }
    }
    /**
     * Legt den Wert der genericProfile-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGenericProfile(String value) {
        this.genericProfile = value;
    }
}
