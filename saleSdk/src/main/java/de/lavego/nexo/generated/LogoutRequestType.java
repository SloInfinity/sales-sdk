//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Attribute;
/**
 * Definition: Content of the Logout Request message. -- Usage:
 * 				Empty
 *
 * <p>Java-Klasse für LogoutRequestType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LogoutRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MaintenanceAllowed" type="{}MaintenanceAllowedType" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class LogoutRequestType {
    @Attribute(name = "MaintenanceAllowed", required = false)
    protected Boolean maintenanceAllowed;
    /**
     * Ruft den Wert der maintenanceAllowed-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public boolean isMaintenanceAllowed() {
        if (maintenanceAllowed == null) {
            return false;
        } else {
            return maintenanceAllowed;
        }
    }
    /**
     * Legt den Wert der maintenanceAllowed-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMaintenanceAllowed(Boolean value) {
        this.maintenanceAllowed = value;
    }
}
