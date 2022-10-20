package a.a.a.c.e.a.i.a;

import a.a.a.c.e.a.k.a.EXF;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

public class EWZ {
    public static final String GSG = "SHA1PRNG";
    private final Integer GSH;
    private final SecretKeyFactory GSI;
    private final SecureRandom GSJ;
    private final EXA GSK;

    public EWZ(EXA var1, String var2) throws NoSuchAlgorithmException {
        this.GSH = 65536;
        EXF.getInstance().ICO();

        try {
            this.GSK = var1;
            this.GSI = SecretKeyFactory.getInstance(this.GSK.getSecretKeyAlgorithmName());
            this.GSJ = SecureRandom.getInstance(var2);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EWZ(EXA var1) throws NoSuchAlgorithmException {
        this(var1, "SHA1PRNG");
    }

    public EWZ() throws NoSuchAlgorithmException {
        this(EWZ.EXA.AES_CBC_PKCS5Padding_AES, "SHA1PRNG");
    }

    public SecretKey getKey(char[] var1, byte[] var2, Integer var3, Integer var4, String var5) throws NoSuchAlgorithmException, InvalidKeySpecException {
        EXF.getInstance().ICO();

        SecretKeySpec var8;
        try {
            PBEKeySpec var6 = new PBEKeySpec(var1, var2, var3, var4);
            SecretKey var7 = this.GSI.generateSecret(var6);
            var8 = new SecretKeySpec(var7.getEncoded(), var5);
        } finally {
            EXF.getInstance().ICP();
        }

        return var8;
    }

    public SecretKey getKey(char[] var1, byte[] var2) throws NoSuchAlgorithmException, InvalidKeySpecException {
        EXF.getInstance().ICO();

        SecretKey var3;
        try {
            var3 = this.getKey(var1, var2, this.GSH, this.GSK.getKeyLength(), this.GSK.getKeyAlgorithmName());
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        EXF.getInstance().ICO();

        Cipher var1;
        try {
            var1 = Cipher.getInstance(this.GSK.getCipherAlgorithmName());
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public byte[] IBO() throws NoSuchAlgorithmException {
        EXF.getInstance().ICO();

        byte[] var2;
        try {
            byte[] var1 = new byte[256];
            this.GSJ.nextBytes(var1);
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public byte[] IBP() throws NoSuchAlgorithmException {
        EXF.getInstance().ICO();

        byte[] var2;
        try {
            byte[] var1 = new byte[this.GSK.getInitialisationVectorSize()];
            this.GSJ.nextBytes(var1);
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public IvParameterSpec IBQ() throws NoSuchAlgorithmException {
        EXF.getInstance().ICO();

        IvParameterSpec var1;
        try {
            var1 = new IvParameterSpec(this.IBP());
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public enum EXA {
        AES_CBC_PKCS5Padding_AES("PBKDF2WithHmacSHA256", "AES/CBC/PKCS5Padding", "AES", 256, 16),
        AES_CBC_PKCS5Padding_Rijndael("PBKDF2WithHmacSHA256", "AES/CBC/PKCS5Padding", "Rijndael", 256, 16),
        DES_CBC_PKCS5Padding_DES("PBKDF2WithHmacSHA256", "DES/CBC/PKCS5Padding", "DES", 64, 8),
        DESede_CBC_PKCS5Padding_DESede("PBKDF2WithHmacSHA256", "DESede/CBC/PKCS5Padding", "DESede", 192, 8),
        DESede_CBC_PKCS5Padding_TripleDES("PBKDF2WithHmacSHA256", "DESede/CBC/PKCS5Padding", "TripleDES", 192, 8);

        private final String GSB;
        private final String GSC;
        private final String GSD;
        private final int GSE;
        private final int GSF;

        EXA(String var3, String var4, String var5, int var6, int var7) {
            this.GSB = var3;
            this.GSC = var4;
            this.GSD = var5;
            this.GSE = var6;
            this.GSF = var7;
        }

        public String getSecretKeyAlgorithmName() {
            return this.GSB;
        }

        public String getCipherAlgorithmName() {
            return this.GSC;
        }

        public String getKeyAlgorithmName() {
            return this.GSD;
        }

        public int getKeyLength() {
            return this.GSE;
        }

        public int getInitialisationVectorSize() {
            return this.GSF;
        }
    }
}
