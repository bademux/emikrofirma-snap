package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDL;

public class FDS<_T> extends FDW<_T> {
   protected final String HEA;

   public FDS(String var1, FDV var2, Boolean var3, Boolean var4, _T var5, FDL var6, String var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.HEA = var7;
   }

   public FDS(FDR var1, Boolean var2, Boolean var3, _T var4, FDL var5, String var6) {
      this(var1.HEL, var1.HDZ, var2, var3, var4, var5, var6);
   }

   public FDS(String var1, FDV var2, Boolean var3, Boolean var4, FDL var5, String var6) {
      this(var1, var2, var3, var4, null, var5, var6);
   }

   public FDS(FDR var1, Boolean var2, Boolean var3, FDL var4, String var5) {
      this(var1.HEL, var1.HDZ, var2, var3, null, var4, var5);
   }

   public FDS(String var1, FDV var2, Boolean var3, Boolean var4, _T var5, String var6) {
      this(var1, var2, var3, var4, var5, FDL.NONE, var6);
   }

   public FDS(FDR var1, Boolean var2, Boolean var3, _T var4, String var5) {
      this(var1, var2, var3, var4, FDL.NONE, var5);
   }

   public FDS(String var1, FDV var2, Boolean var3, Boolean var4, String var5) {
      this(var1, var2, var3, var4, null, FDL.NONE, var5);
   }

   public FDS(FDR var1, Boolean var2, Boolean var3, String var4) {
      this((FDR)var1, (Boolean)var2, var3, null, (FDL)FDL.NONE, var4);
   }

   public FDS(String var1, FDV var2, String var3) {
      this(var1, var2, (Boolean)null, (Boolean)null, null, FDL.NONE, var3);
   }

   public FDS(FDR var1, String var2) {
      this((FDR)var1, (Boolean)null, (Boolean)null, null, (FDL)FDL.NONE, var2);
   }

   public String getInitScript() {
      return this.HEA;
   }

   public FDZ IJV() {
      FDS var1 = new FDS(this.HEL, this.HDZ, this.HEF, this.HEG, this.HEH, this.HEI, this.HEA);
      return var1;
   }
}
