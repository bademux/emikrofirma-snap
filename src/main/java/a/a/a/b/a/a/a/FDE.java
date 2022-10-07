package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.FDT;
import a.a.a.b.a.a.d.FDU;
import a.a.a.b.a.a.d.FDX;
import a.a.a.b.a.a.d.FEA;
import a.a.a.c.e.a.d.EVZ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FDE extends FDI {
   private EVZ<String, Set<FDT>> HDB;
   private final List<FDX> HDC;
   private final List<FEA> HDD;
   private final List<Map<String, FDU<?>>> HDE;

   public FDE(String var1, String var2, String var3) {
      super(var1, var2, var3);
      this.HDB = null;
      this.HDC = new ArrayList();
      this.HDD = new ArrayList();
      this.HDE = new ArrayList();
   }

   public FDE(String var1, String var2) {
      this(var1, (String)null, var2);
   }

   public EVZ<String, Set<FDT>> getJoins() {
      return this.HDB;
   }

   public List<FDX> getParameters() {
      return this.HDC;
   }

   public List<FEA> getOrder() {
      return this.HDD;
   }

   public List<Map<String, FDU<?>>> getResults() {
      return this.HDE;
   }

   public <_T extends FDX> void IJH(_T var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definition cannot be null!");
      } else {
         this.HDC.add(var1);
      }
   }

   public <_T extends FDX> void IJI(List<_T> var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definitions cannot be null!");
      } else {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            FDX var3 = (FDX)var2.next();
            this.IJH(var3);
         }

      }
   }

   public <_T extends FEA> void IJJ(_T var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definition cannot be null!");
      } else {
         this.HDD.add(var1);
      }
   }

   public <_T extends FEA> void IJK(List<_T> var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definitions cannot be null!");
      } else {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            FEA var3 = (FEA)var2.next();
            this.IJJ(var3);
         }

      }
   }

   public void setJoin(String var1, FDT... var2) {
      if (var1 != null && var1.length() != 0 && var2.length != 0) {
         HashSet var3 = new HashSet(Arrays.asList(var2));
         this.HDB = new EVZ(var1, var3);
      } else {
         throw new RuntimeException("Join definition cannot be empty!");
      }
   }

   public String toString() {
      return "TableValuesSelect [joins=" + this.HDB + ", parameters=" + this.HDC + ", order=" + this.HDD + ", results=" + this.HDE + ", toString()=" + super.toString() + "]";
   }
}
