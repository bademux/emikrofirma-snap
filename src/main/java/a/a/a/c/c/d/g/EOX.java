package a.a.a.c.c.d.g;

import java.math.BigDecimal;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class EOX<_T> {
   private final ObjectProperty<_T> FOC;
   private final ObjectProperty<BigDecimal> FOD;
   private final ObjectProperty<BigDecimal> FOE;
   private final ObjectProperty<BigDecimal> FOF;

   public EOX(_T var1, BigDecimal var2, BigDecimal var3, BigDecimal var4) {
      this.FOC = new SimpleObjectProperty(var1);
      this.FOD = new SimpleObjectProperty(var2);
      this.FOE = new SimpleObjectProperty(var3);
      this.FOF = new SimpleObjectProperty(var4);
   }

   public EOX(ObjectProperty<_T> var1, ObjectProperty<BigDecimal> var2, ObjectProperty<BigDecimal> var3, ObjectProperty<BigDecimal> var4) {
      this.FOC = var1;
      this.FOD = var2;
      this.FOE = var3;
      this.FOF = var4;
   }

   public ObjectProperty<_T> getTaxRate() {
      return this.FOC;
   }

   public ObjectProperty<BigDecimal> getSumNet() {
      return this.FOD;
   }

   public ObjectProperty<BigDecimal> getSumTax() {
      return this.FOE;
   }

   public ObjectProperty<BigDecimal> getSumBrut() {
      return this.FOF;
   }
}
