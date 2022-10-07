package a.a.a.c.f.a.f.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum IQ implements JM {
   VAT(FCW.getInstance().getMessageForKey("micro.model.type.recordtype.vat"));

   private final String AMR;

   private IQ(String var3) {
      EXF.getInstance().ICO();

      try {
         this.AMR = var3;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String getDescription() {
      return this.AMR;
   }

   public int DAQ(JM var1) {
      return this.compareTo((IQ)var1);
   }

   public JM[] getEnumTypeValues() {
      return values();
   }
}
