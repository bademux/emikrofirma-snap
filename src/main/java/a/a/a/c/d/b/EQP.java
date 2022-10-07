package a.a.a.c.d.b;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;

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
        EXF.getInstance().ICO();

        SecretKey var2;
        try {
            KeyGenerator var0 = KeyGenerator.getInstance("AES");
            var0.init(256);
            SecretKey var1 = var0.generateKey();
            EXF.getInstance().ICK("algorithm " + var1.getAlgorithm());
            EXF.getInstance().ICK("format " + var1.getFormat());
            EXF.getInstance().ICK("encoded [base64] " + Base64.getEncoder().encodeToString(var1.getEncoded()));
            var2 = var1;
        } catch (NoSuchAlgorithmException var6) {
            EXF.getInstance().ICA(var6);
            throw new FFK(var6);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public static byte[] HQR(File var0) throws FFK {
        EXF.getInstance().ICO();

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
            EXF.getInstance().ICA(var9);
            throw new FFK(var9);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public static byte[] HQS(byte[] var0) {
        EXF.getInstance().ICO();

        byte[] var1;
        try {
            var1 = Base64.getEncoder().encode(var0);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public static String HQT(byte[] var0) {
        EXF.getInstance().ICO();

        String var1;
        try {
            if (var0 == null) {
                var1 = null;
                return var1;
            }

            var1 = Base64.getEncoder().encodeToString(var0);
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public static List<String> getKeyStoreAliases(KeyStore var0) throws FFK {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("keyStore " + var0);
            ArrayList var1 = new ArrayList();
            Enumeration var2 = var0.aliases();

            while (var2.hasMoreElements()) {
                String var3 = (String) var2.nextElement();
                EXF.getInstance().ICK("alias " + var3);
                var1.add(var3);
            }

            ArrayList var9 = var1;
            return var9;
        } catch (KeyStoreException var7) {
            EXF.getInstance().ICA(var7);
            throw new FFK(var7);
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public static String HQU(byte[] var0, Certificate var1) throws FFK {
        EXF.getInstance().ICO();

        String var3;
        try {
            byte[] var2 = HQV(var0, var1);
            var3 = HQT(var2);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public static byte[] HQV(byte[] var0, Certificate var1) throws FFK {
        EXF.getInstance().ICO();

        byte[] var3;
        try {
            Cipher var2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            var2.init(1, var1.getPublicKey());
            var3 = var2.doFinal(var0);
        } catch (NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException |
                 NoSuchAlgorithmException var7) {
            EXF.getInstance().ICA(var7);
            throw new FFK(var7);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }
}
