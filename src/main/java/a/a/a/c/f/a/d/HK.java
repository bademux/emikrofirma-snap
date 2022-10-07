package a.a.a.c.f.a.d;

import a.a.a.c.e.a.k.a.EXF;
import java.io.File;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
   name = "declarationJPK_VAT"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class HK extends AGWN {
   private transient boolean AHSS;

   public HK() {
      super(AGWW.VAT, 0);
      EXF.getInstance().ICQ();
   }

   public HK(Integer var1, File var2, AGXA var3) {
      this(var1, var2, var3, true);
      EXF.getInstance().ICQ();
   }

   public HK(Integer var1, File var2, AGXA var3, boolean var4) {
      super(AGWW.VAT, var1, var2, var3);
      EXF.getInstance().ICO();

      try {
         this.AHSS = var4;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean AICF() {
      return this.AHSS;
   }

   public void setPerformVerification(boolean var1) {
      this.AHSS = var1;
   }
}
