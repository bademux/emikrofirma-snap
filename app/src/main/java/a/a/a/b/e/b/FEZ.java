package a.a.a.b.e.b;

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

public class FEZ {
    public static final String HFL = "SHA1PRNG";
    private final Integer HFM;
    private final SecretKeyFactory HFN;
    private final SecureRandom HFO;
    private final EncType HFP;

    public FEZ(EncType var1, String var2) throws NoSuchAlgorithmException {
        this.HFM = 65536;

        this.HFP = var1;
        this.HFN = SecretKeyFactory.getInstance(this.HFP.getSecretKeyAlgorithmName());
        this.HFO = SecureRandom.getInstance(var2);

    }

    public FEZ(EncType var1) throws NoSuchAlgorithmException {
        this(var1, "SHA1PRNG");
    }

    public FEZ() throws NoSuchAlgorithmException {
        this(EncType.AES_CBC_PKCS5Padding_AES, "SHA1PRNG");
    }

    public SecretKey getKey(char[] var1, byte[] var2, Integer var3, Integer var4, String var5) throws NoSuchAlgorithmException, InvalidKeySpecException {

        SecretKeySpec var8;
        PBEKeySpec var6 = new PBEKeySpec(var1, var2, var3, var4);
        SecretKey var7 = this.HFN.generateSecret(var6);
        var8 = new SecretKeySpec(var7.getEncoded(), var5);

        return var8;
    }

    public SecretKey getKey(char[] var1, byte[] var2) throws NoSuchAlgorithmException, InvalidKeySpecException {

        SecretKey var3;
        var3 = this.getKey(var1, var2, this.HFM, this.HFP.getKeyLength(), this.HFP.getKeyAlgorithmName());

        return var3;
    }

    public Cipher getCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {

        Cipher var1;
        var1 = Cipher.getInstance(this.HFP.getCipherAlgorithmName());

        return var1;
    }

    public byte[] ILD() throws NoSuchAlgorithmException {

        byte[] var2;
        byte[] var1 = new byte[256];
        this.HFO.nextBytes(var1);
        var2 = var1;

        return var2;
    }

    public byte[] ILE() throws NoSuchAlgorithmException {

        byte[] var2;
        byte[] var1 = new byte[this.HFP.getInitialisationVectorSize()];
        this.HFO.nextBytes(var1);
        var2 = var1;

        return var2;
    }

    public IvParameterSpec ILF() throws NoSuchAlgorithmException {

        IvParameterSpec var1;
        var1 = new IvParameterSpec(this.ILE());

        return var1;
    }

    public enum EncType {
        AES_CBC_PKCS5Padding_AES("PBKDF2WithHmacSHA256", "AES/CBC/PKCS5Padding", "AES", 256, 16),
        AES_CBC_PKCS5Padding_Rijndael("PBKDF2WithHmacSHA256", "AES/CBC/PKCS5Padding", "Rijndael", 256, 16),
        DES_CBC_PKCS5Padding_DES("PBKDF2WithHmacSHA256", "DES/CBC/PKCS5Padding", "DES", 64, 8),
        DESede_CBC_PKCS5Padding_DESede("PBKDF2WithHmacSHA256", "DESede/CBC/PKCS5Padding", "DESede", 192, 8),
        DESede_CBC_PKCS5Padding_TripleDES("PBKDF2WithHmacSHA256", "DESede/CBC/PKCS5Padding", "TripleDES", 192, 8);

        private final String HFG;
        private final String HFH;
        private final String HFI;
        private final int HFJ;
        private final int HFK;

        EncType(String var3, String var4, String var5, int var6, int var7) {
            this.HFG = var3;
            this.HFH = var4;
            this.HFI = var5;
            this.HFJ = var6;
            this.HFK = var7;
        }

        public String getSecretKeyAlgorithmName() {
            return this.HFG;
        }

        public String getCipherAlgorithmName() {
            return this.HFH;
        }

        public String getKeyAlgorithmName() {
            return this.HFI;
        }

        public int getKeyLength() {
            return this.HFJ;
        }

        public int getInitialisationVectorSize() {
            return this.HFK;
        }
    }
}
