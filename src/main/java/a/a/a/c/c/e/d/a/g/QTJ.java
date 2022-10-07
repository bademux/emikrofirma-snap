package a.a.a.c.c.e.d.a.g;

import a.a.a.c.c.e.d.a.ESU;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.a.QSV;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Toggle;

public class QTJ implements ChangeListener<Toggle> {
   private ESU RAM;

   public QTJ(ESU var1) {
      this.RAM = var1;
   }

   public void changed(ObservableValue<? extends Toggle> var1, Toggle var2, Toggle var3) {
      if (var3 != null) {
         String var4 = var3.getUserData().toString();
         this.RAM.getCurrentPurchase().RIE().setValue(QSV.valueOf(var4));
         this.RAM.RKS(var4);
         this.RAM.RKR(var4);
         EXF.getInstance().ICE("Calculation method changed to " + var4);
      }

   }
}
