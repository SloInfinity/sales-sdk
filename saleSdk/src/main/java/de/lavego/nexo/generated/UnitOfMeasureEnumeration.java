//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für UnitOfMeasureEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasureEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Case"/>
 *     &lt;enumeration value="Foot"/>
 *     &lt;enumeration value="UKGallon"/>
 *     &lt;enumeration value="USGallon"/>
 *     &lt;enumeration value="Gram"/>
 *     &lt;enumeration value="Inch"/>
 *     &lt;enumeration value="Kilogram"/>
 *     &lt;enumeration value="Pound"/>
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="Centimetre"/>
 *     &lt;enumeration value="Litre"/>
 *     &lt;enumeration value="Centilitre"/>
 *     &lt;enumeration value="Ounce"/>
 *     &lt;enumeration value="Quart"/>
 *     &lt;enumeration value="Pint"/>
 *     &lt;enumeration value="Mile"/>
 *     &lt;enumeration value="Kilometre"/>
 *     &lt;enumeration value="Yard"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum UnitOfMeasureEnumeration {
    /**
     * Case or Carton
     *
     */
    
    CASE("Case"),
    /**
     * Foot
     *
     */
    
    FOOT("Foot"),
    /**
     * Gallon (UK)
     *
     */
    
    UK_GALLON("UKGallon"),
    /**
     * Gallon (US)
     *
     */
    
    US_GALLON("USGallon"),
    /**
     * Gram
     *
     */
    
    GRAM("Gram"),
    /**
     * Inch
     *
     */
    
    INCH("Inch"),
    /**
     * Kilogram
     *
     */
    
    KILOGRAM("Kilogram"),
    /**
     * Pound
     *
     */
    
    POUND("Pound"),
    /**
     * Meter
     *
     */
    
    METER("Meter"),
    /**
     * Centimetre
     *
     */
    
    CENTIMETRE("Centimetre"),
    /**
     * Litre
     *
     */
    
    LITRE("Litre"),
    /**
     * Centilitre
     *
     */
    
    CENTILITRE("Centilitre"),
    /**
     * Ounce
     *
     */
    
    OUNCE("Ounce"),
    /**
     * Quart
     *
     */
    
    QUART("Quart"),
    /**
     * Pint
     *
     */
    
    PINT("Pint"),
    /**
     * Mile
     *
     */
    
    MILE("Mile"),
    /**
     * Kilometre
     *
     */
    
    KILOMETRE("Kilometre"),
    /**
     * Yard
     *
     */
    
    YARD("Yard"),
    /**
     * Other unit than the previous one
     *
     */
    
    OTHER("Other");
    private final String value;
    UnitOfMeasureEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static UnitOfMeasureEnumeration fromValue(String v) {
        for (UnitOfMeasureEnumeration c: UnitOfMeasureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
