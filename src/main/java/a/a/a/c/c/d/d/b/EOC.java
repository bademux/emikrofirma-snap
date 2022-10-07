package a.a.a.c.c.d.d.b;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class EOC {
   private static final DecimalFormat FNM = new DecimalFormat("#,##0.00");

   public EOC() {
   }

   public static String HNN(BigDecimal var0) {
      return FNM.format(var0);
   }
}
