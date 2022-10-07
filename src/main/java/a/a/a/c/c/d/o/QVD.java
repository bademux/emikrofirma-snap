package a.a.a.c.c.d.o;

import a.a.a.c.e.a.k.a.EXF;
import java.time.LocalDate;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.DatePicker;

public class QVD implements ChangeListener<LocalDate> {
   private final BooleanProperty RFX;
   private final DatePicker RFY;
   private final DatePicker RFZ;
   private final DatePicker RGA;

   public QVD(BooleanProperty var1, DatePicker var2, DatePicker var3, DatePicker var4) {
      this.RFX = var1;
      this.RFY = var2;
      this.RFZ = var3;
      this.RGA = var4;
   }

   public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
      if (var3 != null && this.RFX.not().getValue()) {
         this.RFY.setValue(var3);
         this.RFZ.setValue(var3);
         this.RGA.setValue(var3);
         EXF.getInstance().ICE("Issue date changed to " + var3.toString());
      }

   }
}
