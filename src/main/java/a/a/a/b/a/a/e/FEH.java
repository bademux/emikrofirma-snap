package a.a.a.b.a.a.e;

import a.a.a.b.a.a.d.FDW;
import a.a.a.b.a.a.d.FDY;
import java.util.ArrayList;
import java.util.List;

public abstract class FEH implements FEF {
   protected final FEG HEQ;
   protected final List<String> HER;

   public FEH(FEG var1, String... var2) {
      this(var1);
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         this.HER.add(var6);
      }

   }

   public FEH(FEG var1, FDY... var2) {
      this(var1);
      FDY[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         FDY var6 = var3[var5];
         if (var6 instanceof FDW) {
            FDW var7 = (FDW)var6;
            String var8 = var6.getName() + " " + var7.getOrder().getKeyWord();
            this.HER.add(var8);
         } else {
            this.HER.add(var6.getName());
         }
      }

   }

   public FEH(FEG var1, List<String> var2) {
      this.HEQ = var1;
      this.HER = var2;
   }

   public FEH(FEG var1) {
      this.HEQ = var1;
      this.HER = new ArrayList();
   }

   public FEG getConstraintType() {
      return this.HEQ;
   }

   public List<String> getColumns() {
      return this.HER;
   }

   public String toString() {
      return "ConstraintBase [constraintType=" + this.HEQ + ", columns=" + this.HER + ", toString()=" + super.toString() + "]";
   }

   public int hashCode() {
      int var2 = 1;
      var2 = 31 * var2 + (this.HEQ == null ? 0 : this.HEQ.hashCode());
      var2 = 31 * var2 + (this.HER == null ? 0 : this.HER.hashCode());
      return var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         FEH var2 = (FEH)var1;
         if (this.HEQ != var2.HEQ) {
            return false;
         } else {
            if (this.HER == null) {
               if (var2.HER != null) {
                  return false;
               }
            } else if (!this.HER.equals(var2.HER)) {
               return false;
            }

            return true;
         }
      }
   }
}
