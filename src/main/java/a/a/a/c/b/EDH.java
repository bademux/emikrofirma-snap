package a.a.a.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;

public class EDH<_T extends HN<?>> {
   private final EDF<_T> FFY;

   public EDH(EDF<_T> var1) {
      this.FFY = var1;
   }

   public JN getPeriod() {
      EXF.getInstance().ICO();

      JN var3;
      try {
         Integer var1 = (Integer)this.FFY.getValue("business_periodYear");
         Integer var2 = (Integer)this.FFY.getValue("business_periodMonth");
         var3 = new JN(var1, var2);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public KE getRefId() {
      EXF.getInstance().ICO();

      KE var2;
      try {
         String var1 = (String)this.FFY.getValue("business_refid");
         var2 = new KE(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public KA getIssuerNumber() {
      EXF.getInstance().ICO();

      KA var2;
      try {
         String var1 = (String)this.FFY.getValue("business_issuer_number");
         var2 = new KA(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }
}
