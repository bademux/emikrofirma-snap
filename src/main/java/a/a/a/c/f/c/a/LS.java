package a.a.a.c.f.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.KO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LS extends LQ<KO, String> {
   public LS(KO var1, KO var2) {
      super(var1, var2);
      EXF.getInstance().ICQ();
   }

   public LS(String var1, String var2) {
      this(new KO(var1), new KO(var2));
      EXF.getInstance().ICQ();
   }

   public LS(String var1) {
      this((String)var1, (String)null);
      EXF.getInstance().ICQ();
   }

   public LS() {
      this((String)null);
      EXF.getInstance().ICQ();
   }

   public KO DEY() {
      if (this.AQH == null) {
         this.AQH = new KO();
      }

      return (KO)this.AQH;
   }
}
