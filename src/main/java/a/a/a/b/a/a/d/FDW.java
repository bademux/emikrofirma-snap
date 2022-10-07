package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDL;

public class FDW<_T> extends FDR {
   protected final Boolean HEF;
   protected final Boolean HEG;
   protected final _T HEH;
   protected final FDL HEI;

   public FDW(String var1, FDV var2, Boolean var3, Boolean var4, _T var5, FDL var6) {
      super(var1, var2);
      this.HEF = var3;
      this.HEG = var4;
      this.HEH = var5;
      this.HEI = var6;
   }

   public FDW(FDR var1, Boolean var2, Boolean var3, _T var4, FDL var5) {
      this(var1.HEL, var1.HDZ, var2, var3, var4, var5);
   }

   public FDW(String var1, FDV var2, Boolean var3, Boolean var4, FDL var5) {
      this(var1, var2, var3, var4, null, var5);
   }

   public FDW(FDR var1, Boolean var2, Boolean var3, FDL var4) {
      this(var1.HEL, var1.HDZ, var2, var3, null, var4);
   }

   public FDW(String var1, FDV var2, Boolean var3, Boolean var4, _T var5) {
      this(var1, var2, var3, var4, var5, FDL.NONE);
   }

   public FDW(FDR var1, Boolean var2, Boolean var3, _T var4) {
      this(var1, var2, var3, var4, FDL.NONE);
   }

   public FDW(String var1, FDV var2, Boolean var3, Boolean var4) {
      this(var1, var2, var3, var4, null, FDL.NONE);
   }

   public FDW(FDR var1, Boolean var2, Boolean var3) {
      this((FDR)var1, (Boolean)var2, var3, null, (FDL)FDL.NONE);
   }

   public FDW(String var1, FDV var2) {
      this(var1, var2, (Boolean)null, (Boolean)null, null, FDL.NONE);
   }

   public FDW(FDR var1) {
      this((FDR)var1, (Boolean)null, (Boolean)null, null, (FDL)FDL.NONE);
   }

   public Boolean getNullable() {
      return this.HEF;
   }

   public Boolean getUnique() {
      return this.HEG;
   }

   public _T getDefault_() {
      return this.HEH;
   }

   public FDL getOrder() {
      return this.HEI;
   }

   public boolean IJW() {
      return this.HEF != null ? this.HEF : false;
   }

   public boolean IJX() {
      return this.HEG != null ? this.HEG : false;
   }

   public boolean IJY() {
      return this.HEH != null;
   }

   public String toString() {
      return "CellDef [nullable=" + this.HEF + ", unique=" + this.HEG + ", order=" + this.HEI + ", toString()=" + super.toString() + "]";
   }

   public FDZ IJV() {
      FDW var1 = new FDW(this.HEL, this.HDZ, this.HEF, this.HEG, this.HEH, this.HEI);
      return var1;
   }
}
