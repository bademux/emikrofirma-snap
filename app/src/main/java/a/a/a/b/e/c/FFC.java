package a.a.a.b.e.c;

import a.a.a.c.e.a.h.EWY;
import sun.security.pkcs11.wrapper.PKCS11;

import java.security.PrivateKey;
import java.util.Arrays;

public class FFC implements PrivateKey {
    private static final long serialVersionUID = 1L;
    private final PKCS11 HFS;
    private final long HFT;
    private final byte[] HFU;
    private long HFV;
    private long HFW;

    public FFC(PKCS11 var1, long var2, byte[] var4) {
        this.HFS = var1;
        this.HFT = var2;
        this.HFU = EWY.IBK(var4);
        this.HFV = -1L;
        this.HFW = -1L;
    }

    public PKCS11 getPkcs11() {
        return this.HFS;
    }

    public long getSlot() {
        return this.HFT;
    }

    public byte[] getKeyId() {
        return EWY.IBK(this.HFU);
    }

    public long getSessionId() {
        return this.HFV;
    }

    public void setSessionId(long var1) {
        this.HFV = var1;
    }

    public long getObjectId() {
        return this.HFW;
    }

    public void setObjectId(long var1) {
        this.HFW = var1;
    }

    public String getAlgorithm() {
        return "RSA";
    }

    public String getFormat() {
        return null;
    }

    public byte[] getEncoded() {
        return null;
    }

    public String toString() {
        return "NewPrivateKey [pkcs11=" + this.HFS + ", slot=" + this.HFT + ", keyId=" + Arrays.toString(this.HFU) + ", sessionId=" + this.HFV + ", objectId=" + this.HFW + "]";
    }
}
