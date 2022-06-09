package de.lavego.zvt.api;

import static de.lavego.zvt.api.Commons.Log;

public class LLLVar
{
    private byte[] data   = null;
    private byte[] length = null;

    public LLLVar()
    {
        zero();
    }

    private void zero()
    {
        this.data   = new byte[0];
        this.length = new byte[]{(byte) 0xf0, (byte) 0xf0, (byte) 0xf0};
    }

    /**
     * data must contain the two length bytes
     * <p>
     * LLVar can contain max 99 bytes of data (F9F9). The total sum including length bytes must not exceed 101 bytes.
     * <p>
     * F9F9 --> 2 bytes plus 99 bytes of data.
     *
     * @param data
     */
    public LLLVar(byte[] data)
            throws Exception
    {
        this(data, true);
    }

    /**
     * If the data contains the two length bytes containsLength must == true.
     * Otherwise the array is considered as a data part.
     * <p>
     * LLVar can contain max 99 bytes of data (F9F9). The total sum including length bytes must not exceed 101 bytes.
     * <p>
     * F9F9 --> 2 bytes plus 99 bytes of data.
     *
     * @param data
     * @param containsLength
     */
    public LLLVar(byte[] data, boolean containsLength)
            throws Exception
    {
        if (data != null)
        {
            //
            if (containsLength && data.length > 2 && data.length <= 1001)
            {
                this.length = new byte[]{data[0], data[1], data[2]};
                this.data   = new byte[data.length - 3];
                System.arraycopy(data, 3, this.data, 0, data.length - 3);
            }
            else if (data.length > 0 && data.length <= 999)
            {
                this.length = length(data.length);
                this.data   = data;
            }
            else { zero(); }
        }
        else { zero(); }
    }

    public byte[] length(int size)
            throws Exception
    {
        //Log("LLL_VAR", String.format("size %s", size));

        StringBuilder sb = new StringBuilder();

        //one digit
        if (size > -1 && size < 10)
        {
            sb.append("F0F0F").append(size);
        }
        // two digits
        else if (size > 9 && size < 100)
        {
            String l = String.valueOf(size);
            sb.append("F0F")
              .append(l.charAt(0))
              .append("F")
              .append(l.charAt(1));
        }
        // three digits
        else if (size > 99 && size < 1000)
        {
            String l = String.valueOf(size);
            sb.append("F")
              .append(l.charAt(0))
              .append("F")
              .append(l.charAt(1))
              .append("F")
              .append(l.charAt(2));
        }
        // error, size do not fit into LLVar
        else { throw new Exception(String.format("LLLVar data size {%s} error! 0-99 bytes!", size)); }

        //Log("LLL_VAR", String.format("hex %s", sb.toString()));

        return Hex.decodeHex(sb.toString().toCharArray());
    }

    public static LLLVar extractLLLVarFromBytes(byte[] bytes)
    {
        LLLVar lllVar = new LLLVar();

        if (isLLLVar(bytes))
        {
            int length = ((bytes[0] & 0x0f) * 100) + ((bytes[1] & 0x0f) * 10) + (bytes[2] & 0x0f);

            Log("LLLVar", String.format("lllvar %s", length));

            byte[] data = new byte[length];
            System.arraycopy(bytes, 3, data, 0, length);

            try
            {
                lllVar.add(data);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return lllVar;
    }

    /**
     * Byte one - three must have a bitmask 0xf0 (1 1 1 1 0 0 0 0).
     * <p>
     * The byte[] may be hold another bitmaps, tags behind
     *
     * @param bytes
     * @return true if byte 1-3 can be interpreted as LLLVar length
     */
    public static boolean isLLLVar(byte[] bytes)
    {
        return bytes.length > 2
                && ((0xf0 & bytes[0]) == 0xf0)
                && ((0xf0 & bytes[1]) == 0xf0)
                && ((0xf0 & bytes[2]) == 0xf0);
    }

    public void add(byte[] data)
            throws Exception
    {
        this.length = length(data.length);
        this.data   = data;
    }

    public static int length(byte[] bytes)
            throws Exception
    {
        return bytes.length > 2 ? ((bytes[0] & 0x0f) * 100) + ((bytes[1] & 0x0f) * 10) + (bytes[2] & 0x0f) : 0;
    }

    public int size()      { return this.data.length; }

    public byte[] data()   { return data; }

    public byte[] length() { return length; }

    public String hex()    { return Hex.encodeHexString(all()); }

    public byte[] all()
    {
        byte[] all = new byte[this.length.length + this.data.length];
        System.arraycopy(this.length, 0, all, 0, this.length.length);
        System.arraycopy(this.data, 0, all, 3, this.data.length);
        return all;
    }
}
