package a.a.a.c.c.e.r.a.a;

import a.a.a.c.c.e.r.a.QUN;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.n.QSJ;
import javafx.collections.ListChangeListener;

public class QUP implements ListChangeListener<QSJ> {
   private final QUN REO;

   public QUP(QUN var1) {
      this.REO = var1;
   }

   public void onChanged(ListChangeListener.Change<? extends QSJ> var1) {
      EXF.getInstance().ICO();

      try {
         this.REO.RNU();
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
