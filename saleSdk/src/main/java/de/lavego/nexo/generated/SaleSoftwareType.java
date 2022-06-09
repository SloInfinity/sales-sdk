//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
/**
 * Definition: Information related to the software of the Sale System
 * 				which manages the Sale to POI protocol. -- Usage: Allows in a session to identify
 * 				the product features of a Sale System.
 *
 * <p>Java-Klasse für SaleSoftwareType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SaleSoftwareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProviderIdentification" use="required" type="{}ProviderIdentificationType" />
 *       &lt;attribute name="ApplicationName" use="required" type="{}ApplicationNameType" />
 *       &lt;attribute name="SoftwareVersion" use="required" type="{}SoftwareVersionType" />
 *       &lt;attribute name="CertificationCode" type="{}CertificationCodeType" />
 *       &lt;attribute name="ComponentDescription" type="{}ComponentDescriptionType" />
 *       &lt;attribute name="ComponentType" type="{}ComponentTypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SaleSoftwareType {
    @Attribute(name = "ProviderIdentification", required = true)
    protected String providerIdentification;
    @Attribute(name = "ApplicationName", required = true)
    protected String applicationName;
    @Attribute(name = "SoftwareVersion", required = true)
    protected String softwareVersion;
    @Attribute(name = "CertificationCode", required = false)
    protected String certificationCode;
    @Attribute(name = "ComponentDescription", required = false)
    protected String componentDescription;
    @Attribute(name = "ComponentType", required = false)
    protected String componentType;
    /**
     * Ruft den Wert der providerIdentification-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProviderIdentification() {
        return providerIdentification;
    }
    /**
     * Legt den Wert der providerIdentification-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProviderIdentification(String value) {
        this.providerIdentification = value;
    }
    /**
     * Ruft den Wert der applicationName-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplicationName() {
        return applicationName;
    }
    /**
     * Legt den Wert der applicationName-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }
    /**
     * Ruft den Wert der softwareVersion-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }
    /**
     * Legt den Wert der softwareVersion-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }
    /**
     * Ruft den Wert der certificationCode-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertificationCode() {
        return certificationCode;
    }
    /**
     * Legt den Wert der certificationCode-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCertificationCode(String value) {
        this.certificationCode = value;
    }
    /**
     * Ruft den Wert der componentDescription-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComponentDescription() {
        return componentDescription;
    }
    /**
     * Legt den Wert der componentDescription-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComponentDescription(String value) {
        this.componentDescription = value;
    }
    /**
     * Ruft den Wert der componentType-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComponentType() {
        return componentType;
    }
    /**
     * Legt den Wert der componentType-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }
}
