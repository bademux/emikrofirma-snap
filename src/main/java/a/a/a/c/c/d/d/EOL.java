package a.a.a.c.c.d.d;

import a.a.a.c.f.b.c.a.KL;
import java.math.BigDecimal;

public class EOL {
   public EOL() {
   }

   public KL HNO(BigDecimal var1) {
      KL[] var2 = KL.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         KL var5 = var2[var4];
         if (var5.getRate().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public BigDecimal HNP(KL var1) {
      return null == var1.getRate() ? BigDecimal.ZERO : var1.getRate();
   }
}
