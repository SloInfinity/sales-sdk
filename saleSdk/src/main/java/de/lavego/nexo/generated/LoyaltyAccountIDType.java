//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Identification of a Loyalty account. -- Usage: In the
 * 				Payment or the Loyalty Request message, it allows to identify the loyalty account by
 * 				the Sale Terminal instead of the POI Terminal (e.g. because the account
 * 				identification is a bar-code read by the Cashier on a scanner device).
 * 				In
 *
 * <p>Java-Klasse für LoyaltyAccountIDType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoyaltyAccountIDType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>TextString">
 *       &lt;attribute name="EntryMode" use="required" type="{}EntryModeType" />
 *       &lt;attribute name="IdentificationType" use="required" type="{}IdentificationTypeTypeCode" />
 *       &lt;attribute name="IdentificationSupport" type="{}IdentificationSupportTypeCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LoyaltyAccountIDType {
    @Element
    protected String value;
    @Attribute(name = "EntryMode", required = true)
    protected List<String> entryMode;
    @Attribute(name = "IdentificationType", required = true)
    protected String identificationType;
    @Attribute(name = "IdentificationSupport", required = false)
    protected String identificationSupport;
    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }
    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * Gets the value of the entryMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getEntryMode() {
        if (entryMode == null) {
            entryMode = new ArrayList<String>();
        }
        return this.entryMode;
    }
    /**
     * Ruft den Wert der identificationType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificationType() {
        return identificationType;
    }
    /**
     * Legt den Wert der identificationType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificationType(String value) {
        this.identificationType = value;
    }
    /**
     * Ruft den Wert der identificationSupport-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentificationSupport() {
        return identificationSupport;
    }
    /**
     * Legt den Wert der identificationSupport-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentificationSupport(String value) {
        this.identificationSupport = value;
    }
}
