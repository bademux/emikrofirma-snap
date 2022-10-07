package a.a.a.c.c.e.p.a.a;

import a.a.a.c.c.e.p.a.QTW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.n.QSQ;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QTZ implements ChangeListener<QSQ> {
   private QTW RCO;

   public QTZ(QTW var1) {
      this.RCO = var1;
   }

   public void changed(ObservableValue<? extends QSQ> var1, QSQ var2, QSQ var3) {
      if (var3 != null) {
         this.RCO.RMK();
         EXF.getInstance().ICE("Elements type changed");
      }

   }
}
