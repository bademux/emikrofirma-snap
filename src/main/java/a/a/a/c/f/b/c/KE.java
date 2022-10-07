package a.a.a.c.f.b.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.LL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class KE extends LL {
   public KE(String var1) {
      super(var1);
      EXF.getInstance().ICQ();
   }

   public KE() {
      EXF.getInstance().ICQ();
   }

   public KE(KE var1) {
      this(var1 != null ? (String)var1.getValue() : null);
      EXF.getInstance().ICQ();
   }

   public KE DEL() {
      EXF.getInstance().ICO();

      KE var2;
      try {
         KE var1 = new KE();
         var1.setValue(this.getValue());
         var2 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public String toString() {
      return "RefId [" + super.toString() + "]";
   }
}
