//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
/**
 * Definition: Identification of a cryptographic algorithm -- Reference: RFC 3880: Internet X.509 Public Key Infrastructure Certificate and Certificate -- Usage: This data structure contains:  the algorithm identifier  associated parameters
 *
 * <p>Java-Klasse für AlgorithmIdentifier complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AlgorithmIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameter" type="{}ParameterType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Algorithm" use="required" type="{}AlgorithmTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
public class AlgorithmIdentifier {
    @Element(name = "Parameter", required = false)
    protected ParameterType parameter;
    @Attribute(name = "Algorithm", required = true)
    protected String algorithm;
    /**
     * Ruft den Wert der parameter-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ParameterType }
     *
     */
    public ParameterType getParameter() {
        return parameter;
    }
    /**
     * Legt den Wert der parameter-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ParameterType }
     *
     */
    public void setParameter(ParameterType value) {
        this.parameter = value;
    }
    /**
     * Ruft den Wert der algorithm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlgorithm() {
        return algorithm;
    }
    /**
     * Legt den Wert der algorithm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }
}
