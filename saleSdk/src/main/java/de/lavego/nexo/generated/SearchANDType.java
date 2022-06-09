//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Element;
/**
 * List of criterias following the AND logic: transactions matching at
 * 				least one of these criterias are eligible for inclusion in report
 * 				response.
 *
 * <p>Java-Klasse für SearchANDType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SearchANDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Target" type="{}TextString"/>
 *         &lt;element name="Operator" type="{}OperatorEnumeration"/>
 *         &lt;element name="Value" type="{}TextString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class SearchANDType {
    @Element(name = "Target", required = true)
    protected String target;
    @Element(name = "Operator", required = true)
    protected OperatorEnumeration operator;
    @Element(name = "Value", required = true)
    protected String value;
    /**
     * Ruft den Wert der target-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTarget() {
        return target;
    }
    /**
     * Legt den Wert der target-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTarget(String value) {
        this.target = value;
    }
    /**
     * Ruft den Wert der operator-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OperatorEnumeration }
     *
     */
    public OperatorEnumeration getOperator() {
        return operator;
    }
    /**
     * Legt den Wert der operator-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OperatorEnumeration }
     *
     */
    public void setOperator(OperatorEnumeration value) {
        this.operator = value;
    }
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
}
