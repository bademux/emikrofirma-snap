package a.a.a.c.c.d.o;

import a.a.a.c.e.a.k.a.EXF;
import java.time.LocalDate;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ROV implements ChangeListener<LocalDate> {
   public ROV() {
   }

   public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null) {
            EXF.getInstance().ICE("Receipt date changed to " + var3.toString());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
