package de.lavego.zvt.cmds;

import de.lavego.zvt.api.Apdu;
import de.lavego.zvt.api.Bmp;
import de.lavego.zvt.api.Commons;
import de.lavego.zvt.api.Tlv;

public class DefaultRegister extends Apdu
{
    public DefaultRegister()
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD("010203", 3));
        add(0x9e);
        add("0978");
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(String password)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD(password, 3));
        add(0x9e);
        add("0978");
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(byte config)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD("010203", 3));
        add(config);
        add("0978");
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(String password, byte config)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD(password, 3));
        add(config);
        add("0978");
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(String password, byte config, byte service)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD(password, 3));
        add(config);
        add("0978");
        add(new Bmp(0x03, service));
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(String password, byte config, String isoCurrency, byte service)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD(password, 3));
        add(config);
        add(isoCurrency);
        add(new Bmp(0x03, service));
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(byte config, String isoCurrency)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD("010203", 3));
        add(config);
        add(isoCurrency);
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(String password, byte config, String isoCurrency)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD(password, 3));
        add(config);
        add(isoCurrency);
        add(new Bmp("06 0C 12 01 30 27 03 14 01 FE 40 02 B0 B0"));
    }
    
    public DefaultRegister(String password, byte config, String isoCurrency, Tlv tlvContainer)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD(password, 3));
        add(config);
        add(isoCurrency);
        add(new Bmp(tlvContainer.bitmap()));
    }
    
    public DefaultRegister(byte config, String isoCurrency, Tlv tlvContainer)
            throws Exception
    {
        super(Commons.Command.CMD_0600);
        add(Commons.StringNumberToBCD("010203", 3));
        add(config);
        add(isoCurrency);
        add(new Bmp(tlvContainer.bitmap()));
    }
}
