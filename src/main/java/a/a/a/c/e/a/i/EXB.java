package a.a.a.c.e.a.i;

import a.a.a.c.e.a.h.EWY;
import a.a.a.c.e.a.i.a.EWZ;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class EXB {
   private final char[] GSL;
   private final byte[] GSM;
   private final byte[] GSN;
   private final EWZ GSO;
   private final Cipher GSP;
   private final IvParameterSpec GSQ;
   private final SecretKey GSR;

   public EXB(char[] var1) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         this.GSO = new EWZ();
         this.GSL = EWY.IBL(var1);
         this.GSM = this.GSO.IBP();
         this.GSN = this.GSO.IBO();
         this.GSP = this.GSO.getCipher();
         this.GSQ = new IvParameterSpec(this.GSM);
         this.GSR = this.GSO.getKey(this.GSL, this.GSN);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public EXB(char[] var1, byte[] var2, byte[] var3) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         this.GSO = new EWZ();
         this.GSL = EWY.IBL(var1);
         this.GSM = EWY.IBK(var2);
         this.GSN = EWY.IBK(var3);
         this.GSP = this.GSO.getCipher();
         this.GSQ = new IvParameterSpec(this.GSM);
         this.GSR = this.GSO.getKey(this.GSL, this.GSN);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public byte[] getInitialisationVector() {
      return EWY.IBK(this.GSM);
   }

   public byte[] getSalt() {
      return EWY.IBK(this.GSN);
   }

   public byte[] IBR(byte[] var1) throws InvalidKeyException, InvalidAlgorithmParameterException, IOException {
      EXF.getInstance().ICO();

      try {
         this.GSP.init(1, this.GSR, this.GSQ);
         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
         CipherInputStream var3 = new CipherInputStream(var2, this.GSP);
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         byte[] var5 = new byte[1048576];

         int var6;
         while((var6 = var3.read(var5)) != -1) {
            var4.write(var5, 0, var6);
            var4.flush();
         }

         var3.close();
         var4.flush();
         var4.close();
         byte[] var7 = ((ByteArrayOutputStream)var4).toByteArray();
         byte[] var8 = var7;
         return var8;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public byte[] IBS(byte[] var1) throws InvalidKeyException, InvalidAlgorithmParameterException, IOException {
      EXF.getInstance().ICO();

      try {
         this.GSP.init(2, this.GSR, this.GSQ);
         ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
         CipherInputStream var3 = new CipherInputStream(var2, this.GSP);
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         byte[] var5 = new byte[1048576];

         int var6;
         while((var6 = var3.read(var5)) != -1) {
            var4.write(var5, 0, var6);
            var4.flush();
         }

         var3.close();
         var4.flush();
         var4.close();
         byte[] var7 = ((ByteArrayOutputStream)var4).toByteArray();
         byte[] var8 = var7;
         return var8;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public byte[] IBT(byte[] var1, byte[] var2, byte[] var3) throws InvalidKeyException, InvalidAlgorithmParameterException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      try {
         IvParameterSpec var4 = new IvParameterSpec(var1);
         SecretKey var5 = this.GSO.getKey(this.GSL, var2);
         this.GSP.init(2, var5, var4);
         ByteArrayInputStream var6 = new ByteArrayInputStream(var3);
         CipherInputStream var7 = new CipherInputStream(var6, this.GSP);
         ByteArrayOutputStream var8 = new ByteArrayOutputStream();
         byte[] var9 = new byte[1048576];

         int var10;
         while((var10 = var7.read(var9)) != -1) {
            var8.write(var9, 0, var10);
            var8.flush();
         }

         var7.close();
         var8.flush();
         var8.close();
         byte[] var11 = ((ByteArrayOutputStream)var8).toByteArray();
         byte[] var12 = var11;
         return var12;
      } finally {
         EXF.getInstance().ICP();
      }
   }
}
