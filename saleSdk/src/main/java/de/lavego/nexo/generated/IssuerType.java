//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;

import java.util.ArrayList;
import java.util.List;
/**
 * Definition: Certificate issuer name (see X.501-88) -- Reference: RFC 3880: Internet X.509 Public Key Infrastructure Certificate and Certificate -- Usage: The Issuer field identifies the entity that has signed and issued the certificate.  It contains hierarchical name composed of attributes, such as country, organization, organizational-unit, common name.
 *
 * <p>Java-Klasse für IssuerType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="IssuerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelativeDistinguishedName" type="{}RelativeDistinguishedNameType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class IssuerType {
    @Element(name = "RelativeDistinguishedName", required = true)
    protected List<RelativeDistinguishedNameType> relativeDistinguishedName;
    /**
     * Gets the value of the relativeDistinguishedName property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeDistinguishedName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeDistinguishedName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishedNameType }
     *
     *
     */
    public List<RelativeDistinguishedNameType> getRelativeDistinguishedName() {
        if (relativeDistinguishedName == null) {
            relativeDistinguishedName = new ArrayList<RelativeDistinguishedNameType>();
        }
        return this.relativeDistinguishedName;
    }
}
