package a.a.a.c.c.e.r.a.a;

import a.a.a.c.c.e.r.a.QUN;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.n.QSQ;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QUQ implements ChangeListener<QSQ> {
   private QUN REP;

   public QUQ(QUN var1) {
      this.REP = var1;
   }

   public void changed(ObservableValue<? extends QSQ> var1, QSQ var2, QSQ var3) {
      if (var3 != null) {
         this.REP.RNT();
         EXF.getInstance().ICE("Elements type changed");
      }

   }
}
