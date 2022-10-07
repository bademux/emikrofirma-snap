package a.a.a.b.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FFN extends Exception implements FFG {
   private static final long serialVersionUID = 1L;
   private List<Throwable> HGL;

   public FFN() {
      this.HGL = new ArrayList();
   }

   public FFN(List<Throwable> var1) {
      this();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Throwable var3 = (Throwable)var2.next();
         this.HGL.add(new FFK(var3));
      }

   }

   public List<Throwable> getTechnicalExceptionList() {
      return this.HGL;
   }
}
