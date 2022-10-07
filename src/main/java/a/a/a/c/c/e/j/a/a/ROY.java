package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.TextAreaRequired;
import a.a.a.c.g.b.FCW;
import java.util.regex.Pattern;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ROY implements ChangeListener<Boolean> {
   private EUT RPA;
   private final String RPB;

   public ROY(EUT var1) {
      this.RPA = var1;
      this.RPB = FCW.getInstance().getMessageForKey("micro.process.invoice_sale_new.MppRemarks");
   }

   public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
      if (var3 != null) {
         boolean var4 = false;
         if (((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).getText() != null && ((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).getText().contains(this.RPB)) {
            var4 = true;
         }

         if (var3 && !var4) {
            String var5 = "";
            if (((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).getText() != null) {
               var5 = ((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).getText();
            }

            ((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).setText(this.RPB + var5);
         } else if (!var3 && var4 && ((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).getText() != null) {
            ((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).setText(((TextAreaRequired)this.RPA.fxml_invoice_sale_remarksController.fxml_component_main_element).getText().replaceAll(Pattern.quote(this.RPB), ""));
         }

         EXF.getInstance().ICE("Mpp checkbox set to " + var3.toString());
      }

   }
}
