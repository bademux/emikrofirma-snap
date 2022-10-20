package a.a.a.c.d.b;

import a.a.a.b.f.FFK;
import lombok.extern.slf4j.Slf4j;

import javax.crypto.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.List;

@Slf4j
public class EQP {
    private static volatile EQP FXF;
    public static final String FXG = "mfkeystore";
    public static final String FXH = "mfcertalias";

    public static EQP getInstance() {
        if (FXF == null) {
            Class var0 = EQP.class;
            synchronized (EQP.class) {
                if (FXF == null) {
                    FXF = new EQP();
                }
            }
        }

        return FXF;
    }

    public EQP() {
    }

    public static SecretKey HQQ() throws FFK {

        SecretKey var2;
        try {
            KeyGenerator var0 = KeyGenerator.getInstance("AES");
            var0.init(256);
            SecretKey var1 = var0.generateKey();
            log.debug("algorithm " + var1.getAlgorithm());
            log.debug("format " + var1.getFormat());
            log.debug("encoded [base64] " + Base64.getEncoder().encodeToString(var1.getEncoded()));
            var2 = var1;
        } catch (NoSuchAlgorithmException var6) {
            log.error("Something bad happened", var6);
            throw new FFK(var6);
        }

        return var2;
    }

    public static byte[] HQR(File var0) throws FFK {

        try {
            MessageDigest var1 = MessageDigest.getInstance("SHA-256");
            DigestInputStream var2 = new DigestInputStream(new FileInputStream(var0), var1);
            byte[] var3 = new byte[1048576];

            while (var2.read(var3) != -1) {
            }

            var2.close();
            byte[] var4 = var1.digest();
            byte[] var5 = var4;
            return var5;
        } catch (IOException | NoSuchAlgorithmException var9) {
            log.error("Something bad happened", var9);
            throw new FFK(var9);
        }
    }

    public static byte[] HQS(byte[] var0) {

        byte[] var1;
        var1 = Base64.getEncoder().encode(var0);

        return var1;
    }

    public static String HQT(byte[] var0) {

        String var1;
        if (var0 == null) {
            var1 = null;
            return var1;
        }

        var1 = Base64.getEncoder().encodeToString(var0);

        return var1;
    }

    public static List<String> getKeyStoreAliases(KeyStore var0) throws FFK {

        try {
            log.debug("keyStore " + var0);
            ArrayList var1 = new ArrayList();
            Enumeration var2 = var0.aliases();

            while (var2.hasMoreElements()) {
                String var3 = (String) var2.nextElement();
                log.debug("alias " + var3);
                var1.add(var3);
            }

            ArrayList var9 = var1;
            return var9;
        } catch (KeyStoreException var7) {
            log.error("Something bad happened", var7);
            throw new FFK(var7);
        }
    }

    public static String HQU(byte[] var0, Certificate var1) throws FFK {

        String var3;
        byte[] var2 = HQV(var0, var1);
        var3 = HQT(var2);

        return var3;
    }

    public static byte[] HQV(byte[] var0, Certificate var1) throws FFK {

        byte[] var3;
        try {
            Cipher var2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            var2.init(1, var1.getPublicKey());
            var3 = var2.doFinal(var0);
        } catch (NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException |
                 NoSuchAlgorithmException var7) {
            log.error("Something bad happened", var7);
            throw new FFK(var7);
        }

        return var3;
    }
}
