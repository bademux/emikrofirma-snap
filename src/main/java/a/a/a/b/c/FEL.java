package a.a.a.b.c;

import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import com.sun.javafx.tk.Toolkit;
import java.util.concurrent.Semaphore;
import javafx.application.Platform;

public class FEL {
   public FEL() {
   }

   public static <_A> _A IKS(final FEM<_A> var0) {
      EXF.getInstance().ICO();

      final Semaphore var2;
      try {
         if (Toolkit.getToolkit().isFxUserThread()) {
            Object var9 = var0.IKT();
            return (_A) var9;
         }

         final EWD var1 = new EWD();
         var2 = new Semaphore(1);
         var2.acquire();
         Platform.runLater(new Runnable() {
            public void run() {
               var1.setFirstValue(var0.IKT());
               var2.release();
            }
         });
         var2.acquire();
         Object var3 = var1.getFirstValue();
         return (_A) var3;
      } catch (InterruptedException var7) {
         EXF.getInstance().ICA((Throwable)var7);
         return null;
      } finally {
         EXF.getInstance().ICP();
      }
   }
}
