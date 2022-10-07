package a.a.a.b.e;

import a.a.a.b.b.FEJ;
import a.a.a.b.e.b.FEZ;
import a.a.a.c.e.a.h.EWY;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class FFF {
   private final char[] HFZ;
   private final byte[] HGA;
   private final byte[] HGB;
   private final FEZ HGC;
   private final Cipher HGD;
   private final IvParameterSpec HGE;
   private final SecretKey HGF;
   private final Map<String, SecretKey> HGG;

   public FFF(char[] var1) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         this.HGC = new FEZ();
         this.HFZ = EWY.IBL(var1);
         this.HGA = this.HGC.ILE();
         this.HGB = this.HGC.ILD();
         this.HGD = this.HGC.getCipher();
         this.HGE = new IvParameterSpec(this.HGA);
         this.HGF = this.HGC.getKey(this.HFZ, this.HGB);
         this.HGG = new HashMap();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public FFF(char[] var1, byte[] var2, byte[] var3) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         this.HGC = new FEZ();
         this.HFZ = EWY.IBL(var1);
         this.HGA = EWY.IBK(var2);
         this.HGB = EWY.IBK(var3);
         this.HGD = this.HGC.getCipher();
         this.HGE = new IvParameterSpec(this.HGA);
         this.HGF = this.HGC.getKey(this.HFZ, this.HGB);
         this.HGG = new HashMap();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public byte[] getInitialisationVector() {
      synchronized(this.HGA) {
         return EWY.IBK(this.HGA);
      }
   }

   public byte[] getSalt() {
      synchronized(this.HGB) {
         return EWY.IBK(this.HGB);
      }
   }

   public byte[] ILG(byte[] var1) throws InvalidKeyException, InvalidAlgorithmParameterException, IOException {
      EXF.getInstance().ICO();

      try {
         synchronized(this.HGD) {
            this.HGD.init(1, this.HGF, this.HGE);
            ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
            CipherInputStream var4 = new CipherInputStream(var3, this.HGD);
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            byte[] var6 = new byte[1048576];

            int var7;
            while((var7 = var4.read(var6)) != -1) {
               var5.write(var6, 0, var7);
               var5.flush();
            }

            var4.close();
            var5.flush();
            var5.close();
            byte[] var8 = ((ByteArrayOutputStream)var5).toByteArray();
            byte[] var9 = var8;
            return var9;
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public byte[] ILH(byte[] var1) throws InvalidKeyException, InvalidAlgorithmParameterException, IOException {
      EXF.getInstance().ICO();

      try {
         synchronized(this.HGD) {
            this.HGD.init(2, this.HGF, this.HGE);
            ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
            CipherInputStream var4 = new CipherInputStream(var3, this.HGD);
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            byte[] var6 = new byte[1048576];

            int var7;
            while((var7 = var4.read(var6)) != -1) {
               var5.write(var6, 0, var7);
               var5.flush();
            }

            var4.close();
            var5.flush();
            var5.close();
            byte[] var8 = ((ByteArrayOutputStream)var5).toByteArray();
            byte[] var9 = var8;
            return var9;
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public byte[] ILI(byte[] var1, byte[] var2, byte[] var3) throws InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         synchronized(this.HGD) {
            IvParameterSpec var5 = new IvParameterSpec(var1);
            String var6 = FEJ.IKI(var2);
            if (!this.HGG.containsKey(var6)) {
               this.HGG.put(var6, this.HGC.getKey(this.HFZ, var2));
            }

            SecretKey var7 = (SecretKey)this.HGG.get(var6);
            this.HGD.init(2, var7, var5);
            ByteArrayInputStream var8 = new ByteArrayInputStream(var3);
            CipherInputStream var9 = new CipherInputStream(var8, this.HGD);
            ByteArrayOutputStream var10 = new ByteArrayOutputStream();
            byte[] var11 = new byte[1048576];

            int var12;
            while((var12 = var9.read(var11)) != -1) {
               var10.write(var11, 0, var12);
               var10.flush();
            }

            var9.close();
            var10.flush();
            var10.close();
            byte[] var13 = ((ByteArrayOutputStream)var10).toByteArray();
            byte[] var14 = var13;
            return var14;
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }
}
