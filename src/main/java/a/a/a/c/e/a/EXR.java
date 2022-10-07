package a.a.a.c.e.a;

import a.a.a.c.e.a.k.a.EXF;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.util.Base64;

public class EXR {
    public EXR() {
    }

    public static byte[] IEP(byte[] var0) {
        EXF.getInstance().ICO();

        byte[] var1;
        try {
            var1 = Base64.getEncoder().encode(var0);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public static String IEQ(byte[] var0) {
        EXF.getInstance().ICO();

        String var1;
        try {
            if (var0 != null) {
                var1 = Base64.getEncoder().encodeToString(var0);
                return var1;
            }

            var1 = null;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public static byte[] IER(byte[] var0, Certificate var1) throws Exception {
        EXF.getInstance().ICO();

        byte[] var3;
        try {
            Cipher var2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            var2.init(1, var1.getPublicKey());
            var3 = var2.doFinal(var0);
        } catch (NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException |
                 NoSuchAlgorithmException var7) {
            EXF.getInstance().ICA(var7);
            throw new Exception(var7);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }
}
