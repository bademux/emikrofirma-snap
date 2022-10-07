package a.a.a.c.e.a.a;

import a.a.a.c.e.a.k.a.EXF;

public abstract class EVL extends EVN {
   private boolean GPK;
   private final EVL GPL;

   public EVL(boolean var1, EVL var2) {
      EXF.getInstance().ICO();

      try {
         this.GPK = var1;
         this.GPL = var2;
         if (this.GPL != null) {
            this.GPL.start();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HZJ() {
      return this.GPK;
   }

   public void setCanStart(boolean var1) {
      this.GPK = var1;
   }

   public abstract void HZK();

   public void HZI() {
      EXF.getInstance().ICO();

      try {
         this.HZL();
         this.HZK();
         if (this.GPL != null) {
            this.HZM(this.GPL);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HZL() {
      EXF.getInstance().ICO();

      try {
         synchronized(this) {
            while(!this.GPK) {
               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HZM(EVL var1) {
      EXF.getInstance().ICO();

      try {
         synchronized(var1) {
            var1.setCanStart(true);
            var1.notify();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
