package a.a.a.c.d.f;

import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.b.c.JR;
import java.math.BigDecimal;

public class ERD {
   public ERD() {
   }

   public static EVZ<JR, JR> HRV(EVZ<JR, JR> var0, EVZ<JR, JR> var1) {
      BigDecimal var2 = BigDecimal.ZERO;
      BigDecimal var3 = BigDecimal.ZERO;
      BigDecimal var4 = BigDecimal.ZERO;
      BigDecimal var5 = BigDecimal.ZERO;
      if (var0 != null) {
         if (var0.getFirstValue() != null && ((JR)var0.getFirstValue()).getValue() != null) {
            var2 = (BigDecimal)((JR)var0.getFirstValue()).getValue();
         }

         if (var0.getSecondValue() != null && ((JR)var0.getSecondValue()).getValue() != null) {
            var3 = (BigDecimal)((JR)var0.getSecondValue()).getValue();
         }
      }

      if (var1 != null) {
         if (var1.getFirstValue() != null && ((JR)var1.getFirstValue()).getValue() != null) {
            var4 = (BigDecimal)((JR)var1.getFirstValue()).getValue();
         }

         if (var1.getSecondValue() != null && ((JR)var1.getSecondValue()).getValue() != null) {
            var5 = (BigDecimal)((JR)var1.getSecondValue()).getValue();
         }
      }

      return new EVZ(new JR(var2.add(var4)), new JR(var3.add(var5)));
   }
}
