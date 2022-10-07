package a.a.a.c.f.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.JT;
import a.a.a.c.f.b.c.KO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LR extends LQ<JT, byte[]> {
   public LR(KO var1, JT var2) {
      super(var1, var2);
      EXF.getInstance().ICQ();
   }

   public LR(String var1, byte[] var2) {
      this(new KO(var1), new JT(var2));
      EXF.getInstance().ICQ();
   }

   public LR(String var1) {
      this((String)var1, (byte[])null);
      EXF.getInstance().ICQ();
   }

   public LR() {
      this((String)null);
      EXF.getInstance().ICQ();
   }

   public JT DEY() {
      if (this.AQH == null) {
         this.AQH = new JT();
      }

      return (JT)this.AQH;
   }
}
