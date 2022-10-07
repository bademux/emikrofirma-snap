package a.a.a.c.f.b.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.KY;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class JR extends KY implements Cloneable {
   public JR(BigDecimal var1) {
      super(var1);
      EXF.getInstance().ICQ();
   }

   public JR() {
      EXF.getInstance().ICQ();
   }

   public Object clone() {
      JR var1 = new JR((BigDecimal)this.getValue());
      var1.setAllowNegative(this.DDQ());
      var1.setAllowOnlyNegative(this.RJU());
      var1.setPresicion(this.getPresicion());
      var1.setScale(this.getScale());
      return var1;
   }
}
