//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren.
// Generiert: 2021.01.11 um 01:16:00 PM CET
//
package de.lavego.nexo.generated;
/**
 * <p>Java-Klasse für AuthenticationMethodEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bypass"/>
 *     &lt;enumeration value="ManualVerification"/>
 *     &lt;enumeration value="MerchantAuthentication"/>
 *     &lt;enumeration value="OfflinePIN"/>
 *     &lt;enumeration value="OnLinePIN"/>
 *     &lt;enumeration value="PaperSignature"/>
 *     &lt;enumeration value="SecuredChannel"/>
 *     &lt;enumeration value="SecureCertificate"/>
 *     &lt;enumeration value="SecureNoCertificate"/>
 *     &lt;enumeration value="SignatureCapture"/>
 *     &lt;enumeration value="UnknownMethod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
public enum AuthenticationMethodEnumeration {
    /**
     * Authentication bypassed by the merchant.
     *
     */
    
    BYPASS("Bypass"),
    /**
     * Manual verification, for example passport or drivers
     * 						license.
     *
     */
    
    MANUAL_VERIFICATION("ManualVerification"),
    /**
     * Merchant-related authentication.
     *
     */
    
    MERCHANT_AUTHENTICATION("MerchantAuthentication"),
    /**
     * Off-line PIN authentication (Personal Identification
     * 						Number).
     *
     */
    
    OFFLINE_PIN("OfflinePIN"),
    /**
     * On-line PIN authentication (Personal Identification
     * 						Number).
     *
     */
    
    ON_LINE_PIN("OnLinePIN"),
    /**
     * Handwritten paper signature.
     *
     */
    
    PAPER_SIGNATURE("PaperSignature"),
    /**
     * Channel-encrypted transaction.
     *
     */
    
    SECURED_CHANNEL("SecuredChannel"),
    /**
     * Secure electronic transaction with cardholder X.509
     * 						certificate.
     *
     */
    
    SECURE_CERTIFICATE("SecureCertificate"),
    /**
     * Secure electronic transaction without cardholder
     * 						certificate.
     *
     */
    
    SECURE_NO_CERTIFICATE("SecureNoCertificate"),
    /**
     * Electronic signature capture (handwritten
     * 						signature).
     *
     */
    
    SIGNATURE_CAPTURE("SignatureCapture"),
    /**
     * Authentication method is performed unknown.
     *
     */
    
    UNKNOWN_METHOD("UnknownMethod");
    private final String value;
    AuthenticationMethodEnumeration(String v) {
        value = v;
    }
    public String value() {
        return value;
    }
    public static AuthenticationMethodEnumeration fromValue(String v) {
        for (AuthenticationMethodEnumeration c: AuthenticationMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
