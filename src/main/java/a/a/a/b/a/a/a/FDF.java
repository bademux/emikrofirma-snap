package a.a.a.b.a.a.a;

import a.a.a.b.a.a.d.FDU;
import a.a.a.b.a.a.d.FDY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FDF extends FDH {
   private final List<FDY> HDF;
   private final List<Map<String, FDU<?>>> HDG;

   public FDF(String var1, String var2) {
      this(var1, (String)null, var2);
   }

   public FDF(String var1, String var2, String var3) {
      super(var1, var2, var3);
      this.HDF = new ArrayList();
      this.HDG = new ArrayList();
   }

   public List<FDY> getParameters() {
      return this.HDF;
   }

   public List<Map<String, FDU<?>>> getValues() {
      return this.HDG;
   }

   public void IJL() {
      this.HDG.clear();
   }

   public <_T extends FDY> void IJM(_T var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definition cannot be null!");
      } else {
         this.HDF.add(var1);
      }
   }

   public <_T extends FDY> void IJN(List<_T> var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definitions cannot be null!");
      } else {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            FDY var3 = (FDY)var2.next();
            this.IJM(var3);
         }

      }
   }

   public <_T extends FDU<?>> void IJO(_T[] var1) {
      this.IJO(Arrays.asList(var1));
   }

   public <_T extends FDU<?>> void IJO(List<_T> var1) {
      if (var1 == null) {
         throw new RuntimeException("Column definitions cannot be null!");
      } else {
         HashMap var2 = new HashMap();
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            FDU var4 = (FDU)var3.next();
            var2.put(var4.getName(), var4);
         }

         this.HDG.add(var2);
      }
   }

   public <_T extends FDU<?>> void IJO(Map<String, _T> var1) {
      this.HDG.add((Map<String, FDU<?>>) var1);
   }

   public String toString() {
      return "TableValuesInsert [parameters=" + this.HDF + ", values=" + this.HDG + ", toString()=" + super.toString() + "]";
   }
}
