package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.c.AHDV;
import a.a.a.c.f.a.c.a.f.AHEM;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEA extends AHDZ<BigDecimal> {
   public AHEA() {
      EXF.getInstance().ICQ();
   }

   public AHEA(AHEF var1, AHEM var2) {
      super(var1, var2);
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public void AIDR(AHDV var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICK("selectedField " + var1);
         EXF.getInstance().ICK("operationType " + this.AHWI);
         EXF.getInstance().ICK("variable " + this.AHWJ);
         BigDecimal var2 = (BigDecimal)this.AHWJ.getValue();
         EXF.getInstance().ICK("variableValue " + var2);
         String var3 = var1.getValue();
         EXF.getInstance().ICK("selectedFieldValue " + var3);
         String var4 = var3 != null ? var3.trim() : "";
         EXF.getInstance().ICK("selectedFieldValueTrimed " + var4);
         BigDecimal var5 = new BigDecimal(var4);
         EXF.getInstance().ICK("selectedFieldValueParsed " + var5);
         switch (this.AHWI) {
            case ADD:
               this.AHWJ.setValue(var2.add(var5));
               break;
            case SUBTRACT:
               this.AHWJ.setValue(var2.subtract(var5));
               break;
            case DIVIDE:
               this.AHWJ.setValue(var2.divide(var5));
               break;
            case MULTIPLY:
               this.AHWJ.setValue(var2.multiply(var5));
               break;
            default:
               throw new FFI("Invalid operationType [" + this.AHWI + "]!");
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
