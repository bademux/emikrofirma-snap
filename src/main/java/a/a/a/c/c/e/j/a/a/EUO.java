package a.a.a.c.c.e.j.a.a;

import a.a.a.c.c.e.j.a.EUT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.ComboBoxValidated_NIP;
import a.a.a.c.f.c.c.TextAreaRequired;
import a.a.a.c.g.b.FCW;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class EUO implements ChangeListener<Boolean> {
   private EUT GLB;
   private final String GLC;
   private final String GLD;

   public EUO(EUT var1) {
      this.GLB = var1;
      this.GLC = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
      this.GLD = FCW.getInstance().getMessageForKey("micro.process.invoice_sale_new.NipNullRemarks");
   }

   public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
      if (var3 != null) {
         if (var3) {
            ((ComboBoxValidated_NIP)this.GLB.fxml_sale_contractor_nipController.fxml_component_main_element).getEditor().setText(this.GLC);
         } else if (this.GLC.equalsIgnoreCase(((ComboBoxValidated_NIP)this.GLB.fxml_sale_contractor_nipController.fxml_component_main_element).getEditor().getText())) {
            ((ComboBoxValidated_NIP)this.GLB.fxml_sale_contractor_nipController.fxml_component_main_element).getEditor().setText("");
         }

         boolean var4 = false;
         if (((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).getText() != null && ((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).getText().contains(this.GLD)) {
            var4 = true;
         }

         if (var3 && !var4) {
            String var5 = "";
            if (((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).getText() != null) {
               var5 = ((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).getText();
            }

            ((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).setText(this.GLD + var5);
         } else if (!var3 && var4 && ((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).getText() != null) {
            ((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).setText(((TextAreaRequired)this.GLB.fxml_invoice_sale_remarksController.fxml_component_main_element).getText().replaceAll(this.GLD, ""));
         }

         EXF.getInstance().ICE("Private person checkbox set to " + var3.toString());
      }

   }
}
