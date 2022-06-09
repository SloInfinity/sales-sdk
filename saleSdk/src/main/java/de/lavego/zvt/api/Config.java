package de.lavego.zvt.api;

public class Config
{
    private int    configByteRegisterDefault        = 0x98;
    private int    serviceByteRegisterDefault       = 0x00;
    private int    serviceByteStatusEnquiryDefault  = 0x04;
    private int    languageByteStatusEnquiryDefault = 0xfe;
    private int    paymentTypeDefault               = 0x44;
    private String isoCurrencyRegister              = "0978";
    
    public byte configByteRegister() { return (byte) configByteRegisterDefault; }
    
    public void configByteRegister(byte config) { configByteRegisterDefault = config; }
    
    public String isoCurrencyRegister() { return isoCurrencyRegister; }
    
    public void isoCurrencyRegister(String currency) { isoCurrencyRegister = currency; }
    
    public byte languageByteStatusEnquiry() { return (byte) languageByteStatusEnquiryDefault; }
    
    public void languageByteStatusEnquiry(byte lang) { languageByteStatusEnquiryDefault = lang; }
    
    public byte paymentType() { return (byte) paymentTypeDefault; }
    
    public void paymentType(byte payment) { paymentTypeDefault = payment; }
    
    public byte serviceByteRegister() { return (byte) serviceByteRegisterDefault; }
    
    public void serviceByteRegister(byte service) { serviceByteRegisterDefault = service; }
    
    public byte serviceByteStatusEnquiry() { return (byte) serviceByteStatusEnquiryDefault; }
    
    public void serviceByteStatusEnquiry(byte service) { serviceByteStatusEnquiryDefault = service; }
}
