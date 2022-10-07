package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import java.time.LocalDate;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUQ implements ChangeListener<LocalDate> {
   private EUT GLG;

   public EUQ(EUT var1) {
      this.GLG = var1;
   }

   public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null) {
            this.GLG.HXO();
            EXF.getInstance().ICE("Payment date changed to " + var3.toString());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
