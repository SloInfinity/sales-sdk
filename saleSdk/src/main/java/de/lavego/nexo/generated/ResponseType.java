//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

import android.util.Log;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import de.lavego.nexo.Commons;

/**
 * Definition: Result of a message request processing. -- Usage: If
 * Result is Success, ErrorCondition is absent or not used in the processing of the
 * message. In the other cases, the ErrorCondition has to be present and can refine the
 * processing of the message response. AdditionalResponse gives more
 *
 * <p>Java-Klasse für ResponseType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalResponse" type="{}AdditionalResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Result" use="required" type="{}ResultTypeCode" />
 *       &lt;attribute name="ErrorCondition" type="{}ErrorConditionTypeCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class ResponseType implements Converter<ResponseType>
{
    @Element(name = "AdditionalResponse", required = false)
    protected String additionalResponse;
    @Attribute(name = "Result", required = true)
    protected String result;
    @Attribute(name = "ErrorCondition", required = false)
    protected String errorCondition;
    
    @Override
    public ResponseType read(InputNode node) throws Exception
    {
        ResponseType response = new ResponseType();
        
        Log.w("NEXO", String.format("ResponseType::read %s", node.getName()));
        
        final InputNode result = node.getAttribute("Result");
        
        if (node.getAttribute("Result") != null)
        {
            response.setResult(ResultEnumeration.fromValue(node.getAttribute("Result").getValue()).value());
        }
        if (node.getAttribute("ErrorCondition") != null)
        {
            response.setErrorCondition(ErrorConditionEnumeration.fromValue(node.getAttribute("ErrorCondition").getValue()).value());
        }
        
        if (! node.isEmpty())
        {
            InputNode in = node.getNext();
    
            if (in != null) { response.setAdditionalResponse(in.getValue()); }
        }
        
        return response;
    }
    
    @Override
    public void write(OutputNode node, ResponseType value) throws Exception
    {
        Log.w("NEXO", String.format("ResponseType::write %s", node.getName()));
        node.setAttribute("Result", value.getResult());
        
        if (value.getErrorCondition() != null && ! value.getErrorCondition().isEmpty())
        {
            node.setAttribute("ErrorCondition", value.getErrorCondition());
        }
        
        if (value.getAdditionalResponse() != null && ! value.getAdditionalResponse().isEmpty())
        {
            node.getChild("AdditionalResponse").setValue(value.getAdditionalResponse());
        }
    }
    
    /**
     * Ruft den Wert der result-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResult()
    {
        return Commons.fixItFelixEnumerationValue(result);
    }
    
    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getErrorCondition()
    {
        return errorCondition;
    }
    
    /**
     * Ruft den Wert der additionalResponse-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdditionalResponse()
    {
        return additionalResponse;
    }
    
    /**
     * Legt den Wert der additionalResponse-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdditionalResponse(String value)
    {
        this.additionalResponse = value;
    }
    
    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setErrorCondition(String value)
    {
        this.errorCondition = value;
    }
    
    /**
     * Legt den Wert der result-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResult(String value)
    {
        this.result = Commons.fixItFelixEnumerationValue(value);
    }
}
