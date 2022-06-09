//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;

/**
 * <p>Java-Klasse für MenuEntryTagEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MenuEntryTagEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Selectable"/>
 *     &lt;enumeration value="NonSelectable"/>
 *     &lt;enumeration value="SubMenu"/>
 *     &lt;enumeration value="NonSelectableSubMenu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum MenuEntryTagEnumeration {
    /**
     * The Cashier may select this entryof the
     * 						menu
     *
     */
    
    SELECTABLE("Selectable"),
    /**
     * The Cashier cannot select this entryof the
     * 						menu
     *
     */
    
    NON_SELECTABLE("NonSelectable"),
    /**
     * The selection of this entry produces the display of a sub-menu
     * 						(by the sending of another Input Request message containing the entries of
     * 						this sub-menu).
     *
     */
    
    SUB_MENU("SubMenu"),
    /**
     * The menu entry is a submenu, but cannot be
     * 						selected.
     *
     */
    
    NON_SELECTABLE_SUB_MENU("NonSelectableSubMenu");
    private final String value;
    MenuEntryTagEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static MenuEntryTagEnumeration fromValue(String v) {
        for (MenuEntryTagEnumeration c: MenuEntryTagEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
