//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.Element;
/**
 * List of criterias following the OR logic.
 *
 * <p>Java-Klasse für SearchORType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SearchORType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchAND" type="{}SearchANDType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SearchORType {
    @Element(name = "SearchAND", required = true)
    protected List<SearchANDType> searchAND;
    /**
     * Gets the value of the searchAND property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAND property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchAND().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchANDType }
     *
     *
     */
    public List<SearchANDType> getSearchAND() {
        if (searchAND == null) {
            searchAND = new ArrayList<SearchANDType>();
        }
        return this.searchAND;
    }
}
