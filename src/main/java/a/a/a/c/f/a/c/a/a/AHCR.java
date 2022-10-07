package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.AHDH;
import a.a.a.c.f.a.c.a.c.AHDT;
import java.io.IOException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCR extends AHCS<String> {
   private AHCR() throws IOException {
      EXF.getInstance().ICQ();
   }

   public AHCR(AHCJ var1, String var2, Class<? extends AHCB<String>> var3, AHDH... var4) throws IOException {
      super(var1, var2, AHDG.MATCHES, var3, var4);
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public EVZ<AHCI, String> AICX(AHDT var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICK("field " + var1);
         EXF.getInstance().ICK("conditionType " + this.AHUF);
         AHCB var2 = null;
         String var3 = var1.getValue();
         boolean var4 = false;
         switch (this.AHUF) {
            case MATCHES:
               var2 = this.getCustomAction();
               var4 = var2.AIBY(var3);
               if (var4) {
                  EVZ var11 = new EVZ(AHCI.SUCCESS, null);
                  return var11;
               } else {
                  AHCI var5 = null;
                  switch (this.AHTY) {
                     case WARNING:
                        var5 = AHCI.WARNING;
                        break;
                     case ERROR:
                        var5 = AHCI.ERROR;
                        break;
                     default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                  }

                  String var6 = var2.getContextString(var3);
                  EVZ var7 = new EVZ(var5, this.AIDB(var6, var1));
                  return var7;
               }
            default:
               throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }
}
