package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEP;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDA extends AHCT<Integer> {
   private AHDA() {
      EXF.getInstance().ICQ();
   }

   public AHDA(AHCJ var1, String var2, AHDG var3, AHEP var4) {
      super(var1, var2, var3, var4);
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public EVZ<AHCI, String> AICX(AHDT var1) {
      EXF.getInstance().ICO();

      EVZ var8;
      try {
         EXF.getInstance().ICK("field " + var1);
         EXF.getInstance().ICK("conditionType " + this.AHUF);
         EXF.getInstance().ICK("variable " + this.AHUP);
         String var2 = var1.getValue();
         EXF.getInstance().ICK("fieldValue " + var2);
         String var3 = var2 != null ? var2.trim() : "";
         EXF.getInstance().ICK("fieldValueTrimed " + var3);
         Integer var4 = Integer.valueOf(var3);
         Integer var5 = (Integer)this.AHUP.getValue();
         boolean var6 = false;
         switch (this.AHUF) {
            case EQUALS:
               var6 = var5.equals(var4);
               break;
            case GREATER:
               var6 = var4 > var5;
               break;
            case GREATER_OR_EQUAL:
               var6 = var4 >= var5;
               break;
            case LESSER:
               var6 = var4 < var5;
               break;
            case LESSER_OR_EQUAL:
               var6 = var4 <= var5;
               break;
            default:
               throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
         }

         if (var6) {
            EVZ var12 = new EVZ(AHCI.SUCCESS, null);
            return var12;
         }

         AHCI var7 = null;
         switch (this.AHTY) {
            case WARNING:
               var7 = AHCI.WARNING;
               break;
            case ERROR:
               var7 = AHCI.ERROR;
               break;
            default:
               throw new FFI("Invalid actionType [" + this.AHTY + "]!");
         }

         var8 = new EVZ(var7, this.AIDB("", var1));
      } finally {
         EXF.getInstance().ICP();
      }

      return var8;
   }
}
