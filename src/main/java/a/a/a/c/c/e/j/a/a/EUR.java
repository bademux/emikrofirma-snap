package a.a.a.c.c.e.j.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.c.c.DatePickerRequired;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUR implements ChangeListener<LocalDate> {
   private EUT GLH;
   private ResourceBundle GLI;

   public EUR(EUT var1, ResourceBundle var2) {
      this.GLH = var1;
      this.GLI = var2;
   }

   public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
      EXF.getInstance().ICO();

      try {
         ((DatePickerRequired)this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element).IEY().set(false);
         ((DatePickerRequired)this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element).setValidExternal(true);
         this.GLH.HXQ();
         if (var3 != null && this.GLH.GLM.getFieldsEditable()) {
            if (var3.isAfter(LocalDate.now())) {
               ((DatePickerRequired)this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element).IEY().set(true);
               this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_warning_element.setText(this.GLI.getString("micro.process.invoice_sale_new.Warn.FutureDate"));
            } else {
               ((DatePickerRequired)this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element).IEY().set(false);
            }

            boolean var4 = false;

            try {
               JG var5 = this.GLH.GLL.getSettlementStatus(var3);
               if (var5 == JG.SETTLED) {
                  var4 = true;
               }
            } catch (FFO | FFK var9) {
               EXF.getInstance().ICA((Throwable)var9);
            }

            if (var4) {
               ((DatePickerRequired)this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element).setValidExternal(false);
               this.GLH.fxml_invoice_sale_invoicing_dateController.fxml_component_validation_element_external.setText(this.GLI.getString("micro.process.invoice_sale_new.Error.SettlementSetted"));
            }

            this.GLH.QGQ((String)null);
            EXF.getInstance().ICE("Invoicing date changed to " + var3.toString());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
