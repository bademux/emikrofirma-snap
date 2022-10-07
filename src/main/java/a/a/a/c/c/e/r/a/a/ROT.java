package a.a.a.c.c.e.r.a.a;

import a.a.a.c.e.a.k.a.EXF;
import java.time.LocalDate;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ROT implements ChangeListener<LocalDate> {
   public ROT() {
   }

   public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null) {
            EXF.getInstance().ICE("Creation date changed to " + var3.toString());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
