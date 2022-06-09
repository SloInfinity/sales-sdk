//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für InputCommandEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InputCommandEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GetAnyKey"/>
 *     &lt;enumeration value="GetConfirmation"/>
 *     &lt;enumeration value="SiteManager"/>
 *     &lt;enumeration value="TextString"/>
 *     &lt;enumeration value="DigitString"/>
 *     &lt;enumeration value="DecimalString"/>
 *     &lt;enumeration value="GetFunctionKey"/>
 *     &lt;enumeration value="GetMenuEntry"/>
 *     &lt;enumeration value="Password"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum InputCommandEnumeration {
    /**
     * Wait for a key pressed on the Terminal, to be able to read the
     * 						message displayed on the Terminal.
     *
     */
    
    GET_ANY_KEY("GetAnyKey"),
    /**
     * Wait for a confirmation Yes (Y) or No (N) on the Sale
     * 						Terminal. Wait for a confirmation (Valid or Cancel button) on the POI
     * 						Terminal. The result of the command
     *
     */
    
    GET_CONFIRMATION("GetConfirmation"),
    /**
     * Wait for a confirmation Yes (Y) or No (N) of the Site Manager
     * 						on the Sale Terminal.
     *
     */
    
    SITE_MANAGER("SiteManager"),
    /**
     * Wait for a string of alphanumeric characters, the length range
     * 						could be specified.
     *
     */
    
    TEXT_STRING("TextString"),
    /**
     * Wait for a string of digit characters, the length range could
     * 						be specified.
     *
     */
    
    DIGIT_STRING("DigitString"),
    /**
     * Wait for a string of digit characters with a decimal point,
     * 						the length range could be specified.
     *
     */
    
    DECIMAL_STRING("DecimalString"),
    /**
     * Wait for a function key pressed on the Terminal: From POI,
     * 						Valid, Clear, Correct, Generic Function key number. From Sale, Generic
     * 						Function key.
     *
     */
    
    GET_FUNCTION_KEY("GetFunctionKey"),
    /**
     * To choose an entry among a list of entrys (all of them are not
     * 						necessary selectable). The OutputFormat has to be
     * 						MenuEntry.
     *
     */
    
    GET_MENU_ENTRY("GetMenuEntry"),
    /**
     * Request to enter a password with masked characters while
     * 						typing the password.
     *
     */
    
    PASSWORD("Password");
    private final String value;
    InputCommandEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static InputCommandEnumeration fromValue(String v) {
        for (InputCommandEnumeration c: InputCommandEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
