package a.a.a.c.e.a.a;

import a.a.a.c.e.a.k.a.EXF;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EVK {
   private static volatile EVK GPI;
   private final Set<Thread> GPJ;

   public static EVK getInstance() {
      if (GPI == null) {
         Class var0 = EVK.class;
         synchronized(EVK.class) {
            if (GPI == null) {
               GPI = new EVK();
            }
         }
      }

      return GPI;
   }

   public EVK() {
      EXF.getInstance().ICO();

      try {
         this.GPJ = new HashSet();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HZF(Thread var1) {
      EXF.getInstance().ICO();

      try {
         synchronized(this.GPJ) {
            if (!this.GPJ.add(var1)) {
               throw new RuntimeException("Cannot register thread twice!");
            }
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HZG(Thread var1) {
      EXF.getInstance().ICO();

      try {
         synchronized(this.GPJ) {
            if (!this.GPJ.remove(var1)) {
               throw new RuntimeException("Cannot deRegister not registered thread!");
            }
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HZH() {
      EXF.getInstance().ICO();

      try {
         synchronized(this.GPJ) {
            Iterator var2 = this.GPJ.iterator();

            while(var2.hasNext()) {
               Thread var3 = (Thread)var2.next();
               EXF.getInstance().ICK("killing thread " + var3.getName() + " (" + var3.getId() + ")");

               try {
                  var3.stop();
               } catch (Throwable var10) {
                  EXF.getInstance().ICA(var10);
               }
            }
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
