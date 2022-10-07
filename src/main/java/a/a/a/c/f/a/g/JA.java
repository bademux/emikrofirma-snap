package a.a.a.c.f.a.g;

import a.a.a.b.a.a.FDL;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.KU;

public abstract class JA<_T extends KU> {
   private Class<_T> ANE;
   private FDL ANF;
   private Integer ANG;
   private Integer ANH;

   public JA(Class<_T> var1, FDL var2, Integer var3, Integer var4) {
      EXF.getInstance().ICO();

      try {
         this.ANE = var1;
         this.ANF = var2;
         this.ANG = var3;
         this.ANH = var4;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public JA(Class<_T> var1, FDL var2) {
      this(var1, var2, (Integer)null, (Integer)null);
      EXF.getInstance().ICQ();
   }

   public JA(Class<_T> var1) {
      this(var1, FDL.ASC);
      EXF.getInstance().ICQ();
   }

   public Class<_T> getTypeClass() {
      return this.ANE;
   }

   public FDL getOrderType() {
      return this.ANF;
   }

   public Integer getPageSize() {
      return this.ANG;
   }

   public Integer getPageOffset() {
      return this.ANH;
   }
}
