package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.a.QSV;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Toggle;

public class QTM implements ChangeListener<Toggle> {
   private EUT RAV;

   public QTM(EUT var1) {
      this.RAV = var1;
   }

   public void changed(ObservableValue<? extends Toggle> var1, Toggle var2, Toggle var3) {
      if (var3 != null) {
         String var4 = var3.getUserData().toString();
         this.RAV.GLN.RIE().setValue(QSV.valueOf(var4));
         this.RAV.RLC(var4);
         this.RAV.RLB(var4);
         this.RAV.fxml_invoice_sale_elements_table.refresh();
         EXF.getInstance().ICE("Calculation method changed to " + var4);
      }

   }
}
