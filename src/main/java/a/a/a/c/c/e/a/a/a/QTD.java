package a.a.a.c.c.e.a.a.a;

import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.c.a.LS;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QTD implements ChangeListener<QSV> {
   private LS QZZ;

   public QTD(LS var1) {
      this.QZZ = var1;
   }

   public void changed(ObservableValue<? extends QSV> var1, QSV var2, QSV var3) {
      this.QZZ.DEY().setValue(var3.name());
   }
}
