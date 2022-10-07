package a.a.a.b.a.a.d;

import a.a.a.b.a.a.FDK;

public class FDP extends FDR {
   protected final FDK HDY;

   public FDP(String var1, FDV var2, FDK var3) {
      super(var1, var2);
      this.HDY = var3;
   }

   public FDP(FDR var1, FDK var2) {
      super(var1);
      this.HDY = var2;
   }

   public FDP(String var1, FDK var2) {
      this(var1, FDV.NULL, var2);
   }

   public FDK getCondition() {
      return this.HDY;
   }

   public String toString() {
      return "CellConditioned [condition=" + this.HDY + ", toString()=" + super.toString() + "]";
   }
}
