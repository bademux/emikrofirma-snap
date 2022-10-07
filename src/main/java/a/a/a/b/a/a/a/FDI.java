package a.a.a.b.a.a.a;

import a.a.a.b.a.a.b.FDJ;
import a.a.a.b.a.a.d.FDP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class FDI extends FDH {
   protected final List<FDP> HDL = new ArrayList();
   protected final List<FDJ> HDM = new ArrayList();

   public FDI(String var1, String var2, String var3) {
      super(var1, var2, var3);
   }

   public List<FDP> getKeys() {
      return this.HDL;
   }

   public List<FDJ> getExpressions() {
      return this.HDM;
   }

   public <_T extends FDP> void IJA(_T var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definition cannot be null!");
      } else {
         this.HDL.add(var1);
      }
   }

   public <_T extends FDJ> void IJB(_T var1) {
      if (var1 == null) {
         throw new RuntimeException("Expression definition cannot be null!");
      } else {
         this.HDM.add(var1);
      }
   }

   public <_T extends FDP> void IJC(_T[] var1) {
      this.IJC(Arrays.asList(var1));
   }

   public <_T extends FDP> void IJC(List<_T> var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definitions cannot be null!");
      } else {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            FDP var3 = (FDP)var2.next();
            this.IJA(var3);
         }

      }
   }

   public <_T extends FDJ> void IJD(_T[] var1) {
      this.IJD(Arrays.asList(var1));
   }

   public <_T extends FDJ> void IJD(List<_T> var1) {
      if (var1 == null) {
         throw new RuntimeException("Expression definitions cannot be null!");
      } else {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            FDJ var3 = (FDJ)var2.next();
            this.IJB(var3);
         }

      }
   }

   public String toString() {
      return "TableValuesQuery [keys=" + this.HDL + ", expressions=" + this.HDM + ", toString()=" + super.toString() + "]";
   }
}
