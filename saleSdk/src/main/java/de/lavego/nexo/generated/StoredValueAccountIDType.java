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
 * Definition: Identification of the stored value account or the stored
 * 				value card -- Usage: It contains the identifications of the stored value account or
 * 				the stored value card, and the associated product sold by the Sale System for stored
 * 				value requests.
 *
 * <p>Java-Klasse für StoredValueAccountIDType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StoredValueAccountIDType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>TextString">
 *       &lt;attribute name="StoredValueAccountType" use="required" type="{}StoredValueAccountTypeTypeCode" />
 *       &lt;attribute name="StoredValueProvider" type="{}StoredValueProviderType" />
 *       &lt;attribute name="OwnerName" type="{}OwnerNameType" />
 *       &lt;attribute name="ExpiryDate" type="{}ExpiryDateType" />
 *       &lt;attribute name="EntryMode" use="required" type="{}EntryModeType" />
 *       &lt;attribute name="IdentificationType" use="required" type="{}IdentificationTypeTypeCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class StoredValueAccountIDType {
    @Element
    protected String value;
    @Attribute(name = "StoredValueAccountType", required = true)
    protected String storedValueAccountType;
    @Attribute(name = "StoredValueProvider", required = false)
    protected String storedValueProvider;
    @Attribute(name = "OwnerName", required = false)
    protected String ownerName;
    @Attribute(name = "ExpiryDate", required = false)
    protected String expiryDate;
    @Attribute(name = "EntryMode", required = true)
    protected List<String> entryMode;
    @Attribute(name = "IdentificationType", required = true)
    protected String identificationType;
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
     * Ruft den Wert der storedValueAccountType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStoredValueAccountType() {
        return storedValueAccountType;
    }
    /**
     * Legt den Wert der storedValueAccountType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStoredValueAccountType(String value) {
        this.storedValueAccountType = value;
    }
    /**
     * Ruft den Wert der storedValueProvider-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStoredValueProvider() {
        return storedValueProvider;
    }
    /**
     * Legt den Wert der storedValueProvider-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStoredValueProvider(String value) {
        this.storedValueProvider = value;
    }
    /**
     * Ruft den Wert der ownerName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * Legt den Wert der ownerName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }
    /**
     * Ruft den Wert der expiryDate-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpiryDate() {
        return expiryDate;
    }
    /**
     * Legt den Wert der expiryDate-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
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
}
