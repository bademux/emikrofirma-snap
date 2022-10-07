package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMY;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.k.a.EXF;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

public abstract class EPF {
   protected final File FPP;
   protected final ResourceBundle FPQ;

   public EPF(ResourceBundle var1, File var2) {
      EXF.getInstance().ICO();

      try {
         this.FPQ = var1;
         EPH.setResources(var1);
         this.FPP = var2;
         EMY.getInstance().HMZ(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public final void HOE() throws FFK {
      EXF.getInstance().ICO();

      try {
         this.HOF();
         this.HOH();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public abstract void HOF() throws FFK;

   protected abstract void HOG() throws FFK;

   public final void HOH() {
      EXF.getInstance().ICO();

      try {
         if (Desktop.isDesktopSupported()) {
            (new EVN() {
               public void HZI() {
                  try {
                     Desktop.getDesktop().open(EPF.this.FPP);
                  } catch (IOException var2) {
                     EXF.getInstance().ICA((Throwable)var2);
                  }

               }
            }).start();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
