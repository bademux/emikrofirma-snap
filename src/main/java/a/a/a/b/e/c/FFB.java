package a.a.a.b.e.c;

import a.a.a.b.e.c.a.FFD;
import a.a.a.c.e.a.k.a.EXF;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import sun.security.pkcs11.wrapper.CK_MECHANISM;
import sun.security.pkcs11.wrapper.PKCS11Exception;
import sun.security.rsa.RSASignature;
import sun.security.x509.AlgorithmId;

public class FFB extends Signature {
   private final MessageDigest HFQ;
   private FFC HFR;

   public FFB() throws NoSuchAlgorithmException {
      super("SHA256withRSA");
      EXF.getInstance().ICO();

      try {
         this.HFQ = MessageDigest.getInstance("SHA-256");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void engineInitVerify(PublicKey var1) throws InvalidKeyException {
      throw new FFD(0L, "NOT implemented!");
   }

   protected void engineInitSign(PrivateKey var1) throws InvalidKeyException {
      EXF.getInstance().ICO();

      try {
         this.HFQ.reset();
         this.HFR = (FFC)var1;
         CK_MECHANISM var2 = new CK_MECHANISM(1L);

         try {
            this.HFR.getPkcs11().C_SignInit(this.HFR.getSessionId(), var2, this.HFR.getObjectId());
         } catch (PKCS11Exception var7) {
            EXF.getInstance().ICA((Throwable)var7);
            throw new FFD(var7.getErrorCode(), var7);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void engineUpdate(byte var1) throws SignatureException {
      EXF.getInstance().ICO();

      try {
         this.HFQ.update(var1);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void engineUpdate(byte[] var1, int var2, int var3) throws SignatureException {
      EXF.getInstance().ICO();

      try {
         this.HFQ.update(var1, var2, var3);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected byte[] engineSign() throws SignatureException {
      EXF.getInstance().ICO();

      byte[] var3;
      try {
         byte[] var1 = this.HFQ.digest();

         try {
            byte[] var2 = RSASignature.encodeSignature(AlgorithmId.SHA256_oid, var1);
            var3 = this.HFR.getPkcs11().C_Sign(this.HFR.getSessionId(), var2);
         } catch (PKCS11Exception var8) {
            EXF.getInstance().ICA((Throwable)var8);
            throw new FFD(var8.getErrorCode(), var8);
         } catch (IOException var9) {
            EXF.getInstance().ICA((Throwable)var9);
            throw new FFD(0L, var9);
         }
      } finally {
         EXF.getInstance().ICP();
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
