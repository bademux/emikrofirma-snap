package a.a.a.c.e.a.j;

import a.a.a.c.e.a.k.a.EXF;
import java.util.Locale;
import java.util.ResourceBundle;

public class EXC {
   private static volatile EXC GSS;
   private Locale GST;

   public static EXC getInstance() {
      if (GSS == null) {
         Class var0 = EXC.class;
         synchronized(EXC.class) {
            if (GSS == null) {
               GSS = new EXC();
            }
         }
      }

      return GSS;
   }

   public EXC() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public Locale getCurrentLocale() {
      if (this.GST == null) {
         ResourceBundle.getBundle("messages/launcher_messages", getInstance().getCurrentLocaleOrDefault(), new EXD());
      }

      return this.GST;
   }

   public Locale getCurrentLocaleOrDefault() {
      return this.GST != null ? this.GST : Locale.getDefault();
   }

   public void setCurrentLocale(Locale var1) {
      if (this.GST != null) {
         if (!this.GST.equals(var1)) {
            throw new RuntimeException("Locale cannot be changed [" + this.GST + " ][ " + var1 + "]!");
         }
      } else {
         this.GST = var1;
         Locale.setDefault(this.GST);
      }

   }
}
