package de.lavego.zvt.cmds;

import android.util.Log;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import de.lavego.utils.ByteUtils;
import de.lavego.zvt.api.Apdu;

public class PrintLine extends Apdu {
    private byte attribute = 0x00;
    private final StringBuilder text = new StringBuilder();
    private boolean lastLine = false;

    public PrintLine(Apdu apdu)
            throws Exception {
        super(apdu);

        if (this.data().length > 0) {

            BigInteger attr = BigInteger.valueOf(this.attribute = this.data()[0]);

            byte[] d = new byte[this.data().length - 1];

            System.arraycopy(this.data(), 1, d, 0, d.length);

            // nomral text, centered erc ...
            if (!attr.testBit(7)) {
                text.append(new String(d, StandardCharsets.UTF_8));
            } else if ((attribute & 0xFF) == 0xFF) {
                if (d.length > 0) {
                    int linefeeds = d[0] & 0xFF;
                    for (int sidx = 0; sidx < linefeeds; ++sidx)
                        text.append("\n");
                } else text.append("\n");
            } else if ((attribute & 0xFF) == 0x80) {
                // RFU
                text.append("");
            } else if (attr.testBit(7)) {
                lastLine = true;
                text.append(new String(d, StandardCharsets.UTF_8));
                Log.i("ZVT", "This is the last line. May be another receipt is following!");
            } else {
                Log.w("ZVT", String.format("Attributte setting is not implemented! Check 06D1 command in SDK! {%s}", ByteUtils.toHex(apdu.apdu())));
            }

            Log.i("ZVT", String.format("attr={%2s}, lastLine={%-5s}, length={%2s}, data={%-30s}", ByteUtils.toHex(new byte[]{this.attribute}),lastLine,d.length, new String(d,StandardCharsets.UTF_8)));
        } else {
            Log.v("ZVT", "No data for PrintLine");
        }
    }

    public String text() {
        return text.toString();
    }

    public boolean isLastLine() {
        return lastLine;
    }
}
