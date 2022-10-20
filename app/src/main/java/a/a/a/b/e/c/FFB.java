package a.a.a.b.e.c;

import a.a.a.b.e.c.a.FFD;
import lombok.extern.slf4j.Slf4j;
import sun.security.pkcs11.wrapper.CK_MECHANISM;
import sun.security.pkcs11.wrapper.PKCS11Exception;
import sun.security.rsa.RSASignature;
import sun.security.x509.AlgorithmId;

import java.io.IOException;
import java.security.*;

@Slf4j
public class FFB extends Signature {
    private final MessageDigest HFQ;
    private NewPrivateKey HFR;

    public FFB() throws NoSuchAlgorithmException {
        super("SHA256withRSA");

        this.HFQ = MessageDigest.getInstance("SHA-256");

    }

    protected void engineInitVerify(PublicKey var1) throws InvalidKeyException {
        throw new FFD(0L, "NOT implemented!");
    }

    protected void engineInitSign(PrivateKey var1) throws InvalidKeyException {

        this.HFQ.reset();
        this.HFR = (NewPrivateKey) var1;
        CK_MECHANISM var2 = new CK_MECHANISM(1L);

        try {
            this.HFR.getPkcs11().C_SignInit(this.HFR.getSessionId(), var2, this.HFR.getObjectId());
        } catch (PKCS11Exception e) {
            log.error("Something bad happened", e);
            throw new FFD(e.getErrorCode(), e);
        }
    }

    protected void engineUpdate(byte var1) throws SignatureException {

        this.HFQ.update(var1);

    }

    protected void engineUpdate(byte[] var1, int var2, int var3) throws SignatureException {

        this.HFQ.update(var1, var2, var3);

    }

    protected byte[] engineSign() throws SignatureException {
        byte[] var3;
            byte[] var1 = this.HFQ.digest();

            try {
                byte[] var2 = RSASignature.encodeSignature(AlgorithmId.SHA256_oid, var1);
                var3 = this.HFR.getPkcs11().C_Sign(this.HFR.getSessionId(), var2);
            } catch (PKCS11Exception e) {
                log.error("Something bad happened", e);
                throw new FFD(e.getErrorCode(), e);
            } catch (IOException e) {
                log.error("Something bad happened", e);
                throw new FFD(0L, e);
            }

        return var3;
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
