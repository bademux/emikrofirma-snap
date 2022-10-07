package a.a.a.c.d.c.a;

import a.a.a.c.d.c.EQS;
import a.a.a.c.e.a.k.a.EXF;

public class EQV implements EQS<String> {
   public static final transient int FXP = 11;
   private static final transient int FXQ = 10;

   public EQV() {
   }

   public boolean HRC(String var1) {
      EXF.getInstance().ICO();

      boolean var2;
      try {
         var2 = HRF(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public static boolean HRF(String var0) {
      EXF.getInstance().ICO();

      boolean var1;
      try {
         if (var0 == null) {
            var1 = false;
            return var1;
         }

         if (var0.length() == 11) {
            try {
               Long.parseLong(var0);
            } catch (NumberFormatException var9) {
               boolean var2 = false;
               return var2;
            }

            int[] var11 = new int[]{9, 7, 3, 1, 9, 7, 3, 1, 9, 7};
            int var12 = 0;

            int var3;
            for(var3 = 0; var3 < 10; ++var3) {
               int var4 = Character.getNumericValue(var0.charAt(var3));
               var12 += var4 * var11[var3];
            }

            var3 = var12 % 10;
            boolean var13 = var3 == Character.getNumericValue(var0.charAt(10));
            boolean var5 = var13;
            return var5;
         }

         var1 = false;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }
}
