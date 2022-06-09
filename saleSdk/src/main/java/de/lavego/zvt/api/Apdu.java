package de.lavego.zvt.api;

import org.apache.commons.codec.DecoderException;

import static de.lavego.zvt.api.Commons.*;

public class Apdu
{
    private byte   ccrc = 0x00;
    private byte   aprc = 0x00;
    private byte[] data = new byte[0];
    
    public Apdu(int ccrc, int aprc)
    {
        this(ccrc, aprc, new byte[]{});
    }
    
    public Apdu(int ccrc, int aprc, byte[] data)
    {
        this.ccrc = (byte) (ccrc & 0xff);
        this.aprc = (byte) (aprc & 0xff);
        data(data);
    }
    
    public void data(byte[] data) { this.data = data != null ? data : new byte[0]; }
    
    public Apdu(Apdu apdu)
    {
        this(apdu.apdu());
    }
    
    public Apdu(byte[] bytes)
    {
        if (bytes.length > 2)
        {
            this.ccrc(bytes[0]);
            this.aprc(bytes[1]);
            
            int length = asInt(bytes[2]);
            
            if (length == 0)
            {
                data(new byte[0]);
            }
            else if (length <= 254)
            {
                data(new byte[length]);
                System.arraycopy(bytes, 3, data(), 0, bytes.length - 3);
            }
            else
            {
                if (bytes.length > 4)
                {
                    length = asInt(bytes[3]) + (asInt(bytes[4]) * 256);
                    data(new byte[length]);
                    System.arraycopy(bytes, 5, data(), 0, bytes.length - 5);
                }
                else { Log("APDU", "Two length size has not enough data to calculate lo/hi length"); }
            }
            
            //Log("APDU", String.format("%s %s %s",length, data.length, toHex(data())));
        }
    }
    
    public byte[] apdu()
    {
        try
        {
            byte[] control = new byte[]{
                    ccrc(),
                    aprc()
            };
            byte[] length  = lengthAsArray();
            byte[] apdu    = new byte[control.length + length.length + data.length];
            
            System.arraycopy(control, 0, apdu, 0, control.length);
            System.arraycopy(length, 0, apdu, control.length, length.length);
            System.arraycopy(data, 0, apdu, control.length + length.length, data.length);
            
            return apdu;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return new byte[]{
                ccrc(),
                aprc(),
                0x00
        };
    }
    
    public void ccrc(byte ccrc) { this.ccrc = ccrc; }
    
    public void aprc(byte aprc) { this.aprc = aprc; }
    
    public byte[] data() { return this.data; }
    
    public byte ccrc() { return this.ccrc; }
    
    public byte aprc() { return this.aprc; }
    
    /**
     * Calculates the size in APDU format (one byte or extended three-byte)
     * <p>
     * Examples
     * <p>
     * 255 - 65535:
     * 310/256			= 1  (HI) --> 0x01
     * 310-(1*256)		= 54 (LO) --> 0x36
     * <p>
     * vector { FF, 36, 01 }
     * <p>
     * 0 - 254:
     * 111             = 0x6F
     * <p>
     * vector { 6F }
     * <p>
     * Errors:
     * 1243534345      = vector.size() is 0
     * -1              = vector.size() is 0
     * <p>
     * return vector with size does not fit ZVT APDU (0-254 or 255 - 65535)
     */
    public byte[] lengthAsArray()
    {
        if (length() > 0 && length() <= 254)
        {
            return new byte[]{(byte) length()};
        }
        else if (length() > 254 && length() <= 65535)
        {
            
            int hi = length() / 256;
            int lo = length() - (hi * 256);
            
            return new byte[]{
                    (byte) 0xff,
                    (byte) lo,
                    (byte) hi
            };
        }
        else { return new byte[]{0x00}; }
    }
    
    public int length() { return data.length; }
    
    public Apdu(String hex)
            throws DecoderException
    {
        this(Hex.decodeHex(hex.replaceAll(" ", "").toCharArray()));
    }
    
    public Apdu(Command command) { this(command, new byte[]{}); }
    
    public Apdu(Command command, byte[] data) { this(Commons.controlFields(command)[0], Commons.controlFields(command)[1], data); }
    
    /**
     * Expects the complete APDU buffer (CCRC + APRC + LENGTH (1-byte or 3-byte).
     * Remaining bytes are ignored.
     *
     * @param bytes
     *
     * @return length
     */
    public static int getLengthFromBytes(byte[] bytes)
    {
        int length = 0;
        
        if (bytes.length > 2)
        {
            // the third bytes is the length (smaller 0xff)
            if (asInt(bytes[2]) < 0xff) { length = asInt(bytes[2]) + 3; }
            // we have a 3-byte length, read two more bytes (lo + hi)
            else if (bytes.length > 4) { length = asInt(bytes[3]) + (asInt(bytes[4]) * 256) + 5; }
            else { Log("TLV", String.format("3-byte length expected but the array has not enough data! {%s}", toHex(bytes))); }
        }
        return length;
    }
    
    public Apdu add(byte[] bmp)
    {
        byte[] newData = new byte[data.length + bmp.length];
        
        System.arraycopy(data, 0, newData, 0, data.length);
        System.arraycopy(bmp, 0, newData, data.length, bmp.length);
        data(newData);
        
        return this;
    }
    
    public Apdu add(Bmp bmp)
    {
        byte[] newData = new byte[data.length + bmp.bitmap().length];
        
        System.arraycopy(data, 0, newData, 0, data.length);
        System.arraycopy(bmp.bitmap(), 0, newData, data.length, bmp.bitmap().length);
        data(newData);
        
        return this;
    }
    
    public Apdu add(String hex)
    {
        try
        {
            byte[] bmp     = Hex.decodeHex(hex.toCharArray());
            byte[] newData = new byte[data.length + bmp.length];
            
            System.arraycopy(data, 0, newData, 0, data.length);
            System.arraycopy(bmp, 0, newData, data.length, bmp.length);
            data(newData);
        }
        catch (DecoderException e)
        {
            e.printStackTrace();
        }
        
        return this;
    }
    
    public Apdu add(byte bmp)
    {
        byte[] newData = new byte[data.length + 1];
        
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[newData.length - 1] = bmp;
        data(newData);
        
        return this;
    }
    
    public Apdu add(int bmp)
    {
        byte[] newData = new byte[data.length + 1];
        
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[newData.length - 1] = (byte) (bmp & 0xff);
        data(newData);
        
        return this;
    }
    
    public void aprc(int aprc) { this.aprc = (byte) (aprc & 0xff); }
    
    public void ccrc(int ccrc) { this.ccrc = (byte) (ccrc & 0xff); }
}
