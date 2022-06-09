package de.lavego.utils;

import android.util.Log;

public class ByteUtils
{
    public static void printData(byte[] data)
    {
        StringBuilder sb = new StringBuilder();
        
        for (int idx = 0; idx < data.length; ++ idx)
        {
            sb.append(String.format((idx == data.length - 1 ? "%02X" : "%02X "), data[idx]));
        }
        
        try
        {
            Log.d("printData", String.format("data in hex => %s", toHex(data)));
        }
        catch (Exception e)
        {
            Log.e("printData", "ERROR convert byte[] to String HEX format", e);
        }
    }
    
    public static String toHex(byte[] data)
    {
        StringBuilder sb = new StringBuilder();
        
        if (data != null)
        {
            for (int idx = 0; idx < data.length; ++ idx)
            {
                sb.append(String.format((idx == data.length - 1 ? "%02X" : "%02X "), data[idx]));
            }
        }
        
        return sb.toString();
    }
    
    public static void printData(String tag, String prefix, byte[] data)
    {
        StringBuilder sb = new StringBuilder();
        
        for (int idx = 0; idx < data.length; ++ idx)
        {
            sb.append(String.format((idx == data.length - 1 ? "%02X" : "%02X "), data[idx]));
        }
        
        try
        {
            Log.d(tag, String.format("%s%s", prefix, toHex(data)));
        }
        catch (Exception e)
        {
            Log.e(tag, "ERROR convert byte[] to String HEX format", e);
        }
    }
    
    public static void printData(String tag, byte[] data)
    {
        StringBuilder sb = new StringBuilder();
        
        if (data != null)
        {
            for (final byte datum : data)
            {
                sb.append(String.format("%02X ", datum));
            }
            
            Log.d("pd(" + data.length + ")", String.format("%s => %s", tag, sb.toString()));
        }
    }
    
    public static void printData(String tag, byte data)
    {
        Log.d(tag, String.format("%s => %02X", tag, data));
    }
}
