package a.a.a.c.c.b;

import a.a.a.c.e.a.k.a.EXF;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EMY {
   private static volatile EMY FIX;
   private final List<File> FIY;

   public static EMY getInstance() {
      if (FIX == null) {
         Class var0 = EMY.class;
         synchronized(EMY.class) {
            if (FIX == null) {
               FIX = new EMY();
            }
         }
      }

      return FIX;
   }

   private EMY() {
      EXF.getInstance().ICO();

      try {
         this.FIY = new ArrayList();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HMY() {
      EXF.getInstance().ICO();

      try {
         Iterator var1 = this.FIY.iterator();

         while(var1.hasNext()) {
            File var2 = (File)var1.next();

            try {
               Files.delete(var2.toPath());
            } catch (Exception var8) {
               EXF.getInstance().ICA((Throwable)var8);
            }
         }
      } catch (Exception var9) {
         EXF.getInstance().ICA((Throwable)var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HMZ(File var1) {
      EXF.getInstance().ICO();

      try {
         this.FIY.add(var1);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
