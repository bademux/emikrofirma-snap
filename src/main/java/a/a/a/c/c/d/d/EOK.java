package a.a.a.c.c.d.d;

import a.a.a.c.e.a.k.a.EXF;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import javafx.util.StringConverter;

public class EOK extends StringConverter<BigDecimal> {
   private DecimalFormat FNN;
   private int FNO;

   public EOK(DecimalFormat var1, int var2) {
      this.FNN = var1;
      this.FNO = var2;
      var1.setParseBigDecimal(true);
   }

   public String toString(BigDecimal var1) {
      return this.FNN.format(var1.setScale(this.FNO, 4));
   }

   public BigDecimal fromString(String var1) {
      try {
         return ((BigDecimal)this.FNN.parse(var1)).setScale(this.FNO, 4);
      } catch (ParseException var3) {
         EXF.getInstance().ICA((Throwable)var3);
         return BigDecimal.ZERO;
      }
   }
}
