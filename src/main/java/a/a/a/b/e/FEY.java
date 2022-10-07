package a.a.a.b.e;

import a.a.a.c.e.a.i.a.EWZ;
import a.a.a.c.e.a.k.a.EXF;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class FEY {
   private static volatile FEY HFE;
   private final EWZ HFF;

   public static FEY getInstance() throws NoSuchAlgorithmException {
      if (HFE == null) {
         Class var0 = FEY.class;
         synchronized(FEY.class) {
            if (HFE == null) {
               HFE = new FEY();
            }
         }
      }

      return HFE;
   }

   private FEY() throws NoSuchAlgorithmException {
      EXF.getInstance().ICO();

      try {
         this.HFF = new EWZ();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean ILA(byte[] var1, char[] var2, byte[] var3) throws NoSuchAlgorithmException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      boolean var5;
      try {
         SecretKey var4 = this.HFF.getKey(var2, var3);
         var5 = Arrays.equals(var1, var4.getEncoded());
      } finally {
         EXF.getInstance().ICP();
      }

      return var5;
   }

   public byte[] ILB() throws NoSuchAlgorithmException {
      EXF.getInstance().ICO();

      byte[] var1;
      try {
         var1 = this.HFF.IBO();
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public byte[] ILC(char[] var1, byte[] var2) throws NoSuchAlgorithmException, InvalidKeySpecException {
      EXF.getInstance().ICO();

      byte[] var3;
      try {
         var3 = this.HFF.getKey(var1, var2).getEncoded();
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }
}
