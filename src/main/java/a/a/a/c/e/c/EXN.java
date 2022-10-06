package a.a.a.c.e.c;

import a.a.a.c.e.a.j.EXC;
import a.a.a.c.e.a.j.EXD;
import a.a.a.c.e.a.k.a.EXF;
import java.util.ResourceBundle;

public class EXN {
   private static volatile EXN GUQ;
   private final ResourceBundle GUR;

   public static EXN getInstance() {
      if (GUQ == null) {
         Class var0 = EXN.class;
         synchronized(EXN.class) {
            if (GUQ == null) {
               GUQ = new EXN();
            }
         }
      }

      return GUQ;
   }

   public EXN() {
      EXF.getInstance().ICO();

      try {
         this.GUR = ResourceBundle.getBundle("messages/launcher_messages", EXC.getInstance().getCurrentLocaleOrDefault(), new EXD());
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public String getMessageForKey(String var1) {
      return this.GUR.getString(var1);
   }
}
