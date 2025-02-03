package de.lavego.zvt.api;

import static de.lavego.zvt.api.Commons.BCDToString;
import static de.lavego.zvt.api.Commons.Log;
import static de.lavego.zvt.api.Commons.asInt;
import static de.lavego.zvt.api.Commons.isPrintableAs;
import static de.lavego.zvt.api.Commons.toHex;

import androidx.annotation.NonNull;

import org.apache.commons.codec.DecoderException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tag
{
    private final static int UNIVERSAL_CLASS    = 0x00;
    private final static int APPLICATION_CLASS  = 0x01;
    private final static int CONTEXT_SPEC_CLASS = 0x02;
    private final static int PRIVATE_CLASS      = 0x03;
    
    private final ByteArrayOutputStream bao_tag     = new ByteArrayOutputStream();
    private final ByteArrayOutputStream bao_val     = new ByteArrayOutputStream();
    private final ArrayList<Tag>        subTags     = new ArrayList<>();
    private       boolean               isPrimitive = true;
    
    public Tag()
            throws IOException
    {
    }
    
    public Tag(byte tag, byte[] data)
            throws IOException
    {
        this.isPrimitive = ! isContructed(tag);
        this.bao_tag.write(tag);
        this.bao_val.write(data);
        if (! isPrimitive) { subTags.addAll(searchForTags(value())); }
    }
    
    public static boolean isContructed(byte toCheck) { return ((0x20 & toCheck) == 0x20);}
    
    public static List<Tag> searchForTags(byte[] all)
    {
        ByteArrayOutputStream bao_tag = new ByteArrayOutputStream();
        ByteArrayOutputStream bao_val = new ByteArrayOutputStream();
        ByteArrayOutputStream bao_len = new ByteArrayOutputStream();
        ArrayList<Tag>        subs    = new ArrayList<>();
        
        int mode           = 0; // 0 == tag byte; 1 == length byte; 2 == data
        int length         = 0;
        int numLengthBytes = 0;
        Log("TAG", String.format("sub: %s", toHex(all)));
        
        int firstByte = 1;
        
        for (int idx = 0; idx < all.length; ++ idx)
        {
            switch (mode)
            {
                case 0:
                    bao_tag.write(all[idx]);
                    if (firstByte == 1)
                    {
                        firstByte = 0;
                        mode = tagNumberFollows(all[idx]) ? mode : 1;
                        Log("TAG", String.format("tagNumberFollows: %s -> %s", tagNumberFollows(all[idx]), Hex.encodeHexString(new byte[]{all[idx]})));
                    }
                    else
                    {
                        mode = furtherBytesFollows(all[idx]) ? mode : 1;
                        Log("TAG", String.format("furtherBytesFollows: %s -> %s", furtherBytesFollows(all[idx]), Hex.encodeHexString(new byte[]{all[idx]})));
                    }
                    break;
                case 1:
                    numLengthBytes = Tlv.numLengthBytes(all[idx]);
                    Log("TAG", String.format("searchForTags numLengthBytes=%s", numLengthBytes));
                    switch (Tlv.numLengthBytes(all[idx]))
                    {
                        case 1:
                            bao_len.write(all[idx]);
                            length = asInt(all[idx]);
                            break;
                        case 2:
                            bao_len.write(all[idx]);
                            bao_len.write(length = asInt(all[++ idx]));
                            break;
                        case 3:
                            int lo = 0;
                            int hi = 0;
                            bao_len.write(all[idx]);
                            bao_len.write(hi = asInt(all[++ idx]));
                            bao_len.write(lo = asInt(all[++ idx]));
                            length = lo + (hi * 256);
                            break;
                    }
                    mode = 2;
                    
                    if(length == 0)
                    {
                        mode = 0;
                        firstByte = 1;
                    }
                    break;
                default:
                    bao_val.write(all, idx, length);
                    
                    try
                    {
                        Tag tag = new Tag(bao_tag.toByteArray(), bao_val.toByteArray());
                        subs.add(tag);
                        
                        StringBuilder sb = new StringBuilder();
                        
                        sb.append(String.format("tag {%-4s %-6s} size %-4s: "
                                , toHex(bao_tag.toByteArray()).replaceAll(" ", "")
                                , toHex(bao_len.toByteArray()).replaceAll(" ", "")
                                , length));
                        
                        if (tag.isPrimitive)
                        {
                            switch (isPrintableAs(tag))
                            {
                                case Ascii:
                                    sb.append(tag.bao_val.toString(StandardCharsets.UTF_8.name()));
                                    break;
                                case Bcd:
                                    sb.append(BCDToString(tag.bao_val.toByteArray()));
                                    break;
                                case Flag:
                                case Unknown:
                                default:
                                    sb.append(toHex(bao_val.toByteArray()));
                                    break;
                            }
                        }
                        else { sb.append(toHex(bao_val.toByteArray())); }
                        
                        Log("TAG", sb.toString());
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                    idx = idx + length - 1;
                    mode = 0;
                    length = 0;
                    firstByte = 1;
                    //numLengthBytes = 0;
                    bao_tag.reset();
                    bao_len.reset();
                    bao_val.reset();
                    break;
            }
        }
        
        return subs;
    }
    
    public byte[] value() { return this.bao_val.toByteArray(); }
    
    public static boolean tagNumberFollows(byte toCheck) { return ((0x1F & toCheck) == 0x1f);}
    public static boolean furtherBytesFollows(byte toCheck) { return ((toCheck) & (1 << 7)) != 0;}
    
    public Tag(byte tag, byte data)
            throws IOException
    {
        this.isPrimitive = ! isContructed(tag);
        this.bao_tag.write(tag);
        this.bao_val.write(data);
        if (! isPrimitive) { subTags.addAll(searchForTags(value())); }
    }
    
    public Tag(byte tag1, byte tag2, byte[] data)
            throws IOException
    {
        this.isPrimitive = ! isContructed(tag1);
        this.bao_tag.write(tag1);
        this.bao_tag.write(tag2);
        this.bao_val.write(data);
        if (! isPrimitive) { subTags.addAll(searchForTags(value())); }
    }
    
    public Tag(byte[] tag, byte[] data)
            throws IOException
    {
        this.isPrimitive = tag.length <= 0 || ! isContructed(tag[0]);
        this.bao_tag.write(tag);
        this.bao_val.write(data);
        if (! isPrimitive) { subTags.addAll(searchForTags(value())); }
    }
    
    public static Tag fromBytes(String hex)
            throws IOException, DecoderException
    {
        return fromBytes(Hex.decodeHex(hex.replaceAll(" ", "").toCharArray()));
    }
    
    public static Tag fromBytes(byte[] all)
            throws IOException
    {
        ByteArrayOutputStream bao_tag = new ByteArrayOutputStream();
        ByteArrayOutputStream bao_val = new ByteArrayOutputStream();
        ByteArrayOutputStream bao_len = new ByteArrayOutputStream();
        
        int     mode           = 0; // 0 == tag byte; 1 == length byte; 2 == data
        boolean isPrimitive    = true;
        int     tagLength      = 0;
        int     numLengthBytes = 0;
        int firstByte = 1;
        
        Log("TAG", "* ** *** ** * ** *** ** *");
        Log("TAG", String.format("all: %s", toHex(all)));
        
        for (int idx = 0; idx < all.length; ++ idx)
        {
            //Log("TAG", String.format("fromBytes idx=%s mode=%s", idx, mode));
            if (idx == 0)
            {
                isPrimitive = ! isContructed(all[idx]);
            }
            
            switch (mode)
            {
                case 0:
                    bao_tag.write(all[idx]);
                    if (firstByte == 1)
                    {
                        firstByte = 0;
                        mode = tagNumberFollows(all[idx]) ? mode : 1;
                        Log("TAG", String.format("tagNumberFollows: %s -> %s", tagNumberFollows(all[idx]), Hex.encodeHexString(new byte[]{all[idx]})));
                    }
                    else
                    {
                        mode = furtherBytesFollows(all[idx]) ? mode : 1;
                        Log("TAG", String.format("furtherBytesFollows: %s -> %s", furtherBytesFollows(all[idx]), Hex.encodeHexString(new byte[]{all[idx]})));
                    }
                    break;
                case 1:
                    numLengthBytes = Tlv.numLengthBytes(all[idx]);
                    Log("TAG", String.format("fromBytes numLengthBytes=%s", numLengthBytes));
                    switch (numLengthBytes)
                    {
                        case 1:
                            bao_len.write(all[idx]);
                            tagLength = asInt(all[idx]);
                            break;
                        case 2:
                            bao_len.write(all[idx]);
                            bao_len.write(tagLength = asInt(all[++ idx]));
                            break;
                        case 3:
                            int lo = 0;
                            int hi = 0;
                            bao_len.write(all[idx]);
                            bao_len.write(hi = asInt(all[++ idx]));
                            bao_len.write(lo = asInt(all[++ idx]));
                            tagLength = lo + (hi * 256);
                            break;
                    }
                    Log("TAG", String.format("fromBytes length=%s", tagLength));
                    mode = 2;
                    break;
                default:
                    bao_val.write(all, idx, tagLength);
                    // may be we have tags inside this tag
                    // Copy only tagLength
                    if (! isPrimitive)
                    {
                        try
                        {
                            Log("TAG", toHex(bao_val.toByteArray()));
                            Log("TAG", String.format("idx {%s} all.length {%s} tagLength {%s}", idx, all.length, tagLength));
                            
                            //Tag.searchForTags(bao_val.toByteArray());
                            //Tag.fromBytes(bao_val.toByteArray(), true);
                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                            System.err.printf("sub tag err on idx=%s%n", idx);
                        }
                    }
                    mode = 0;
                    idx = idx + tagLength;
                    break;
            }
        }
        
        Log("TAG", String.format("tag: %s isPrimitive=%s tagLength=%s", toHex(bao_tag.toByteArray()), isPrimitive, tagLength));
        Log("TAG", String.format("len: %s", toHex(bao_len.toByteArray())));
        Log("TAG", String.format("val: %s", toHex(bao_val.toByteArray())));
        
        return new Tag(bao_tag.toByteArray(), bao_val.toByteArray());
    }
    
    public static List<Tag> searchForTags(String hex)
            throws DecoderException
    {
        return searchForTags(Hex.decodeHex(hex.replaceAll(" ", "").toCharArray()));
    }
    
    public byte[] all()
            throws IOException
    {
        ByteArrayOutputStream bao_all = new ByteArrayOutputStream();
        bao_all.write(bao_tag.toByteArray());
        bao_all.write(length());
        bao_all.write(bao_val.toByteArray());
        
        return bao_all.toByteArray();
    }
    
    public byte[] length()
    {
        byte[] length = new byte[lengthSize()];
        
        switch (lengthSize())
        {
            case 1:
                length[0] = (byte) this.bao_val.size();
                break;
            case 2:
                length[0] = (byte) 0x81;
                length[1] = (byte) this.bao_val.size();
                break;
            case 3:
                length[0] = (byte) 0x82;
                length[1] = (byte) (this.bao_val.size() / 256);
                length[2] = (byte) (this.bao_val.size() - (asInt(length[1]) * 256));
                break;
            default:
                length[0] = 0x00;
                break;
        }
        
        return length;
    }
    
    private int lengthSize()
    {
        if (this.bao_val.size() < 128) { return 1; }
        else if (this.bao_val.size() < 256) { return 2; }
        else if (this.bao_val.size() <= 65535) { return 3; }
        else { return 0; }
    }
    
    public ArrayList<Tag> find(@NonNull final String hex)
            throws DecoderException
    {
        ArrayList<Tag> ftags = new ArrayList<>();
        
        byte[] search = Hex.decodeHex(hex.replaceAll(" ", "").toCharArray());
        
        if (search.length > 0)
        {
            for (Tag stag : subtags())
            {
                if (Arrays.equals(stag.tag(), search))
                {
                    ftags.add(stag);
                }
                else if (stag.subtags().size() > 0)
                {
                    try
                    {
                        ftags.addAll(stag.find(hex));
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
    
    public boolean isPrimitive() { return this.isPrimitive; }
    
    public ArrayList<Tag> subtags() { return subTags; }
    
    public byte[] tag() { return this.bao_tag.toByteArray(); }
    
    public String tagAsStr()
    {
        return Hex.encodeHexString(this.bao_tag.toByteArray());
    }
    
    public int tagLength() { return this.bao_tag.size() + lengthSize() + this.bao_val.size(); }
}
