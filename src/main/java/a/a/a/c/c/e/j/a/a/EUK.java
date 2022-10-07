package a.a.a.c.c.e.j.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUK implements ChangeListener<JN> {
   private EUT GKW;

   public EUK(EUT var1) {
      this.GKW = var1;
   }

   public void changed(ObservableValue<? extends JN> var1, JN var2, JN var3) {
      if (var3 != null) {
         this.GKW.GLW.set(true);
         if (this.GKW.GLM.getFieldsEditable()) {
            ((TextFieldValidated_Text)this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element).IEW().set(true);
            boolean var4 = true;

            try {
               var4 = this.GKW.GLL.HYB(var3, ((TextFieldValidated_Text)this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element).getText());
            } catch (FFO | FFK var6) {
               EXF.getInstance().ICA((Throwable)var6);
            }

            if (this.GKW.GLM != EPB.EDIT && this.GKW.GLM != EPB.EDIT_CORRECTION && !var4) {
               ((TextFieldValidated_Text)this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element).IEW().set(false);
            } else if ((this.GKW.GLM == EPB.EDIT || this.GKW.GLM == EPB.EDIT_CORRECTION) && !var4 && this.GKW.GMG != null && this.GKW.GMG.compareTo(((TextFieldValidated_Text)this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element).getText()) != 0) {
               ((TextFieldValidated_Text)this.GKW.fxml_invoice_sale_ref_idController.fxml_component_main_element).IEW().set(false);
            }

            EXF.getInstance().ICE("Period changed to " + var3.toString());
         }
      } else {
         this.GKW.GLW.set(false);
      }

   }
}
