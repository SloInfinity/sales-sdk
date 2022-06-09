package de.lavego.zvt.api;

import androidx.annotation.NonNull;

import org.apache.commons.codec.DecoderException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import de.lavego.utils.ByteUtils;

import static de.lavego.zvt.api.Commons.Log;
import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.toHex;

/*
    example:

    completion from 0501 status message

    06 0F       FF F6 02    length --> F6 + (02*256) --> 246 + (2*256) --> 758
    sw version  F0 F3 F9    LLLVar 39 bytes

                            4F 50 50 2D 43 36 30 53 2E 53
                            45 43 43 56 44 2E 70 30 32 2E
                            30 30 35 39 2E 35 31 2E 30 31
                            2E 32 30 32 30 30 39 30 39
   pt status    1-byte
                            00
   tlv cont     06 82 02 C7 1F 44 04 52 50 02 35 1F 54 01 5C 1F 55 02 00 00 1F 56 01 63 E4 27 1F 40 08 4F 50 50 2D 43 36 30 53 1F 41 0E 70 30 32 2E 30 30 35 39 2E 35 31 2E 30 31 1F 42 04 17 06 62 22 1F 43 01 00 E4 82 01 09 1F 40 07 53 43 52 2D 43 36 32 1F 41 81 F0 53 43 52 2D 43 36 32 2D 4F 53 3A 49 64 65 6E 74 69 76 65 2E 43 4F 52 2E 4F 53 49 44 45 4E 2E 76 30 31 2E 30 30 30 31 2E 33 39 2E 30 30 3B 53 43 52 2D 43 36 32 2D 41 50 50 3A 49 64 65 6E 74 69 76 65 2E 43 4F 52 2E 41 50 49 44 45 4E 2E 76 30 31 2E 30 30 30 31 2E 33 39 2E 30 30 3B 53 43 52 2D 43 36 32 2D 4D 53 50 3A 49 64 65 6E 74 69 76 65 2E 4D 53 50 2E 53 43 43 43 56 44 2E 76 30 30 2E 30 30 30 30 2E 32 33 2E 32 37 3B 53 43 52 2D 43 36 32 2D 45 4D 56 4C 31 3A 49 64 65 6E 74 69 76 65 2E 45 4D 56 2E 4C 31 49 44 45 4E 2E 76 30 31 2E 30 30 30 33 2E 30 30 2E 30 30 3B 53 43 52 2D 43 36 32 2D 43 52 59 50 54 4F 48 45 41 44 3A 44 44 4D 5F 48 4F 50 54 5F 53 43 48 55 4C 45 52 2E 56 30 35 2E 31 30 5F 32 30 31 34 30 38 30 31 1F 42 04 86 03 59 33 1F 43 01 00 E4 81 D5 1F 40 07 43 4F 52 2D 41 32 30 1F 41 81 BC 43 4F 52 2D 41 32 30 2D 4F 53 3A 49 64 65 6E 74 69 76 65 2E 43 4F 52 2E 4F 53 49 44 45 4E 2E 76 30 31 2E 30 30 30 31 2E 33 39 2E 30 30 3B 43 4F 52 2D 41 32 30 2D 41 50 50 3A 49 64 65 6E 74 69 76 65 2E 43 4F 52 2E 41 50 49 44 45 4E 2E 76 30 31 2E 30 30 30 31 2E 33 39 2E 30 30 3B 43 4F 52 2D 41 32 30 2D 4D 53 50 3A 49 64 65 6E 74 69 76 65 2E 4D 53 50 2E 53 43 43 43 56 44 2E 76 30 30 2E 30 30 30 31 2E 31 34 2E 30 38 3B 43 4F 52 2D 41 32 30 2D 45 4D 56 4C 31 3A 49 64 65 6E 74 69 76 65 2E 45 4D 56 2E 4C 31 49 44 45 4E 2E 76 30 31 2E 30 30 30 33 2E 30 30 2E 30 30 1F 42 04 81 20 42 81 1F 43 01 00 1F 59 14 41 30 30 30 30 30 30 33 35 39 31 30 31 30 30 32 38 30 30 31 1F 59 0E 41 30 30 30 30 30 30 30 30 34 31 30 31 30 1F 59 0C 41 30 30 30 30 30 30 30 32 35 30 31 1F 59 0E 41 30 30 30 30 30 30 30 30 33 31 30 31 30 1F 59 0E 41 30 30 30 30 30 30 30 30 34 33 30 36 30 1F 59 0E 41 30 30 30 30 30 30 30 30 33 32 30 32 30 1F 59 0E 41 30 30 30 30 30 30 30 30 33 32 30 31 30 1F 59 04 30 30 30 30 1F 59 04 30 30 30 31 1F 59 04 30 30 30 32 1F 59 04 30 30 30 33 1F 59 04 30 30 31 35 1F 59 04 30 30 41 38"
*/
public class Tlv extends Bmp
{
    public final static int ONE_BYTE_LENGTH   = 2;   // 0-127        byte   06 00        (00-7F)
    public final static int TWO_BYTE_LENGTH   = 3;   // 128-255      byte   06 81 81     (81-FF)
    public final static int THREE_BYTE_LENGTH = 4; // 256-65535    byte   06 82 00 01  (hi+lo) 00+(01*256) --> 256 until FF+(FF*256) --> 65535
    
    private int            length = 0;
    private int            offset = ONE_BYTE_LENGTH;
    private ArrayList<Tag> tags   = new ArrayList<>();
    
    public Tlv()
    {
        zero();
    }
    
    public void zero()
    {
        this.bmp = 0x06;
        this.bitmap = new byte[]{
                this.bmp,
                0x00
        };
        this.format = Format.Tlv_Encoded;
    }
    
    public Tlv(String hex)
            throws Exception
    {
        this(Hex.decodeHex(hex.replaceAll(" ", "").toCharArray()));
    }
    
    public Tlv(byte[] bytes)
            throws Exception
    {
        this.bmp = 0x06;
        this.format = Format.Tlv_Encoded;
        
        if (bytes != null && bytes.length > 1 && bytes[0] == 0x06)
        {
            if (asInt(bytes[1]) > - 1 && asInt(bytes[1]) < 128)
            {
                length = asInt(bytes[1]);
            }
            else if (asInt(bytes[1]) == 0x81 && bytes.length > 2)
            {
                this.length = asInt(bytes[2]);
                this.offset = TWO_BYTE_LENGTH;
            }
            else if (asInt(bytes[1]) == 0x82 && bytes.length > 3)
            {
                this.length = asInt(bytes[3]) + (asInt(bytes[2]) * 256);
                this.offset = THREE_BYTE_LENGTH;
            }
            // for 0x80 (128) 'case invalid' we set 0
            else { length = 0; }
            
            Log("TLV", String.format("length {%s} offset {%s} bytes.length {%s}", this.length, this.offset, bytes.length));
            if (this.length > 0 && bytes.length == (this.length + this.offset)) { this.bitmap = bytes; }
            else
            {
                this.bitmap = new byte[]{
                        this.bmp,
                        0x00
                };
            }
            
            tags.addAll(Tag.searchForTags(value()));
        }
        else
        {
            Log("TLV", String.format("This is not a TLV container. Byte array is zero or has wrong format.%n{%s}%nReturning a zero length TLV 0600!", toHex(bytes)));
            zero();
        }
    }
    
    public static int numLengthBytes(byte firstLengthByte)
    {
        if (asInt(firstLengthByte) == 0x81) { return 2; }
        else if (asInt(firstLengthByte) == 0x82) { return 3; }
        else { return 1; }
    }
    
    public void add(@NonNull Tag tag) throws IOException
    {
        android.util.Log.v("TLV", String.format("bitmap.length=%s, length=%s, offset=%s", this.bitmap().length, this.length, this.offset));
        
        ByteUtils.printData(bitmap());
        ByteUtils.printData(tag.all());
        
        // strip of BMP byte and all length bytes.
        // Note, the TLV container is a Tag itself!
        byte[] old = Tag.fromBytes(bitmap).value();
        // data length without BMP+LENGTH bytes
        this.length += tag.tagLength();
        byte[] newSizeBytes = caculateSize(length());
        byte[] data         = new byte[1 + newSizeBytes.length + length()];
        
        ByteUtils.printData(newSizeBytes);
        
        switch (newSizeBytes.length)
        {
            case 1:
                this.offset = ONE_BYTE_LENGTH;
                break;
            case 2:
                this.offset = TWO_BYTE_LENGTH;
                break;
            case 3:
                this.offset = THREE_BYTE_LENGTH;
                break;
            default:
                this.offset = ONE_BYTE_LENGTH;
                this.length = 0;
                break;
        }
        
        if (length() > 0)
        {
            data[0] = 0x06;
            System.arraycopy(newSizeBytes, 0, data, 1, newSizeBytes.length);
            
            ByteUtils.printData(data);
            
            //note 0x06 0x00 if zero
            if (old.length > 0)
            {
                System.arraycopy(old, 0, data, offset(), old.length);
            }
            
            System.arraycopy(tag.all(), 0, data, bitmap().length, tag.all().length);
            this.tags.add(tag);
        }
        else
        {
            this.bitmap = new byte[]{
                    0x06,
                    0x00
            };
        }
        
        ByteUtils.printData(data);
        this.bitmap = data;
    }
    
    public static byte[] caculateSize(int size)
    {
        if (size >= 0 && size <= 127)
        {
            return new byte[]{(byte) size};
        }
        else if (size > 127 && size <= 255)
        {
            return new byte[]{
                    (byte) 0x81,
                    (byte) size
            };
        }
        else if (size > 255 && size <= 65535)
        {
            byte hi = (byte) (size / 256);
            byte lo = (byte) (size - (asInt(hi) * 256));
            
            return new byte[]{
                    (byte) 0x82,
                    hi,
                    lo
            };
        }
        else { return new byte[0]; }
    }
    
    public int length()
    {
        return length;
    }
    
    public int offset()
    {
        return offset;
    }
    
    public ArrayList<Tag> find(@NonNull final String hex)
            throws DecoderException
    {
        ArrayList<Tag> ftags = new ArrayList<>();
        
        byte[] search = Hex.decodeHex(hex.replaceAll(" ", "").toCharArray());
        
        if (search.length > 0)
        {
            for (Tag tag : tags())
            {
                if (Arrays.equals(tag.tag(), search))
                {
                    ftags.add(tag);
                }
                else if (tag.subtags().size() > 0)
                {
                    try
                    {
                        ftags.addAll(tag.find(hex));
                    }
                    catch (DecoderException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
        
        return ftags;
    }
    
    public ArrayList<Tag> tags() { return tags; }
    
    @Override
    public String valueAsString()
            throws Exception
    {
        return Hex.encodeHexString(value());
    }
    
    @Override
    public byte[] value()
    {
        byte[] value = new byte[this.length];
        System.arraycopy(bitmap(), offset, value, 0, this.length);
        return value;
    }
}
