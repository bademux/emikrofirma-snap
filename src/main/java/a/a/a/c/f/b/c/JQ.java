package a.a.a.c.f.b.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.LL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class JQ extends LL {
   public JQ(String var1) {
      super(var1.trim());
      EXF.getInstance().ICQ();
   }

   public JQ() {
      EXF.getInstance().ICQ();
   }

   public JQ DDP() {
      EXF.getInstance().ICO();

      JQ var2;
      try {
         JQ var1 = new JQ();
         var1.setValue(this.getValue());
         var2 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public String getAccountNumber(String var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var1.substring(0, 2)).append(" ").append(var1.substring(2, 6)).append(" ").append(var1.substring(6, 10)).append(" ").append(var1.substring(10, 14)).append(" ").append(var1.substring(14, 18)).append(" ").append(var1.substring(18, 22)).append(" ").append(var1.substring(22, 26));
      return var2.toString();
   }
}
