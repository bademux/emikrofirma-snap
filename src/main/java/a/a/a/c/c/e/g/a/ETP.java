package a.a.a.c.c.e.g.a;

import java.math.BigDecimal;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ETP {
   private final ObjectProperty<BigDecimal> GII;
   private final ObjectProperty<BigDecimal> GIJ;
   private final ObjectProperty<BigDecimal> GIK;

   public ETP(BigDecimal var1, BigDecimal var2, BigDecimal var3) {
      this.GII = new SimpleObjectProperty(var1);
      this.GIJ = new SimpleObjectProperty(var2);
      this.GIK = new SimpleObjectProperty(var3);
   }

   public ObjectProperty<BigDecimal> getSumNet() {
      return this.GII;
   }

   public ObjectProperty<BigDecimal> getSumTax() {
      return this.GIJ;
   }

   public ObjectProperty<BigDecimal> getSumBrut() {
      return this.GIK;
   }
}
