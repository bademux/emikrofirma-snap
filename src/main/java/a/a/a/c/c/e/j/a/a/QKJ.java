package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.f.c.c.TextFieldValidated_Number;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class QKJ implements ChangeListener<Boolean> {
   private EUT QNI;

   public QKJ(EUT var1) {
      this.QNI = var1;
   }

   public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
      EXF.getInstance().ICO();

      try {
         if (var3 != null) {
            if (var3) {
               ((TextFieldValidated_Number)this.QNI.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element).setText("");
               this.QNI.fxml_invoice_sale_paymentdatedaysController.fxml_component_root_element.setRequired(false);
               ((DatePickerRequired)this.QNI.fxml_invoice_sale_paymentdateController.fxml_component_main_element).setValue(null);
               this.QNI.fxml_invoice_sale_paymentdateController.fxml_component_root_element.setRequired(false);
            } else {
               this.QNI.fxml_invoice_sale_paymentdatedaysController.fxml_component_root_element.setRequired(true);
               ((TextFieldValidated_Number)this.QNI.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element).setText("7");
               this.QNI.fxml_invoice_sale_paymentdateController.fxml_component_root_element.setRequired(true);
            }

            EXF.getInstance().ICE("Payment by deal changed to " + var3.toString());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
