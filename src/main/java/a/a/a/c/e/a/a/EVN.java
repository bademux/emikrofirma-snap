package a.a.a.c.e.a.a;

import a.a.a.c.e.a.k.a.EXF;

public abstract class EVN extends Thread {
   public EVN() {
   }

   public abstract void HZI();

   public void run() {
      EXF.getInstance().ICO();

      try {
         EVK.getInstance().HZF(this);
         this.HZI();
      } catch (ThreadDeath var5) {
         EXF.getInstance().ICI("ThreadDeath error skipped");
      } finally {
         EVK.getInstance().HZG(this);
         EXF.getInstance().ICP();
      }

   }
}
