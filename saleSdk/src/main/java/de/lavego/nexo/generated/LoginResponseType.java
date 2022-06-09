//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;

/**
 * Definition: Content of the Login Response message. -- Usage: It
 * conveys Information related to the Login to process
 *
 * <p>Java-Klasse für LoginResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LoginResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{}ResponseType"/>
 *         &lt;element name="POISystemData" type="{}POISystemDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Order(elements = {"Response"})
public class LoginResponseType
{
    @Element(name = "Response", required = true)
    protected ResponseType      response;
    @Element(name = "POISystemData", required = false)
    protected POISystemDataType poiSystemData;
    
    /**
     * Ruft den Wert der poiSystemData-Eigenschaft ab.
     *
     * @return possible object is
     * {@link POISystemDataType }
     */
    public POISystemDataType getPOISystemData()
    {
        return poiSystemData;
    }
    
    /**
     * Legt den Wert der poiSystemData-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link POISystemDataType }
     */
    public void setPOISystemData(POISystemDataType value)
    {
        this.poiSystemData = value;
    }
    
    /**
     * Ruft den Wert der response-Eigenschaft ab.
     *
     * @return possible object is
     * {@link ResponseType }
     */
    public ResponseType getResponse()
    {
        return response;
    }
    
    /**
     * Legt den Wert der response-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link ResponseType }
     */
    public void setResponse(ResponseType value)
    {
        this.response = value;
    }
}
