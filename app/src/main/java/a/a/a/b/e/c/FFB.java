package a.a.a.b.e.c;

import a.a.a.b.e.c.a.FFD;

import java.security.*;

public class FFB extends Signature {
    private final MessageDigest HFQ;
    private FFC HFR;

    public FFB() throws NoSuchAlgorithmException {
        super("SHA256withRSA");

        this.HFQ = MessageDigest.getInstance("SHA-256");

    }

    protected void engineInitVerify(PublicKey var1) throws InvalidKeyException {
        throw new FFD(0L, "NOT implemented!");
    }

    protected void engineInitSign(PrivateKey var1) throws InvalidKeyException {
        throw new UnsupportedOperationException("reimplement without sun.security");
    }

    protected void engineUpdate(byte var1) throws SignatureException {

        this.HFQ.update(var1);

    }

    protected void engineUpdate(byte[] var1, int var2, int var3) throws SignatureException {

        this.HFQ.update(var1, var2, var3);

    }

    protected byte[] engineSign() throws SignatureException {
        throw new UnsupportedOperationException("reimplement without sun.security");
    }

    protected boolean engineVerify(byte[] var1) throws SignatureException {
        throw new FFD(0L, "NOT implemented!");
    }

    protected void engineSetParameter(String var1, Object var2) throws InvalidParameterException {
        throw new FFD(0L, "NOT implemented!");
    }

    protected Object engineGetParameter(String var1) throws InvalidParameterException {
        throw new FFD(0L, "NOT implemented!");
    }
}
