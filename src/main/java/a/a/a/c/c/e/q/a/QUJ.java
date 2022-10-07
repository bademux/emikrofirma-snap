package a.a.a.c.c.e.q.a;

import java.math.BigDecimal;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class QUJ {
   private final ObjectProperty<BigDecimal> RDN;
   private final ObjectProperty<BigDecimal> RDO;
   private final ObjectProperty<BigDecimal> RDP;

   public QUJ(BigDecimal var1, BigDecimal var2, BigDecimal var3) {
      this.RDN = new SimpleObjectProperty(var1);
      this.RDO = new SimpleObjectProperty(var2);
      this.RDP = new SimpleObjectProperty(var3);
   }

   public ObjectProperty<BigDecimal> getSumNet() {
      return this.RDN;
   }

   public ObjectProperty<BigDecimal> getSumTax() {
      return this.RDO;
   }

   public ObjectProperty<BigDecimal> getSumBrut() {
      return this.RDP;
   }
}
