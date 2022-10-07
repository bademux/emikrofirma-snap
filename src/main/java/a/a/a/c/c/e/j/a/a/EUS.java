package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUS implements ChangeListener<String> {
   private EUT GLJ;
   private final String GLK;

   public EUS(EUT var1) {
      this.GLJ = var1;
      this.GLK = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
   }

   public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null) {
            if (var3.equalsIgnoreCase(this.GLK)) {
               this.GLJ.fxml_sale_contractor_private_person.setSelected(true);
            } else {
               this.GLJ.fxml_sale_contractor_private_person.setSelected(false);
            }
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
