package a.a.a.c.c.e.j.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.d.h.QKK;
import a.a.a.c.c.d.f.EOV;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EYZ;
import a.a.a.c.f.a.a.EZI;
import a.a.a.c.f.a.a.EZK;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.f.c.c.TextAreaRequired;
import a.a.a.c.f.c.c.TextFieldValidated_Number;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class EUG {
   private static final int GKN = 256;
   @FXML
   public EYZ fxml_invoice_sale_new_add_invoice_element_nameController;
   @FXML
   public EZI fxml_invoice_sale_new_add_invoice_element_netpriceController;
   @FXML
   public EZI fxml_invoice_sale_new_add_invoice_element_amountController;
   @FXML
   public EYQ fxml_invoice_sale_new_add_invoice_element_unitController;
   @FXML
   public EZP<KL> fxml_invoice_sale_new_add_invoice_element_tax_typeController;
   @FXML
   public EZK fxml_invoice_sale_new_add_invoice_element_descriptionController;
   @FXML
   public Button fxml_button_save;
   @FXML
   public Button fxml_button_cancel;
   boolean GKO = false;
   private Stage GKP;
   private ResourceBundle GKQ;
   private String RAU;
   private EOV GKR;

   public EUG() {
   }

   @FXML
   private void initialize() {
      ((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).setCellFactory(new EOQ());
      ((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).setButtonCell((ListCell)((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).getCellFactory().call(null));
      ((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).getItems().addAll(KL.values());
      this.fxml_button_save.disableProperty().bind(this.fxml_invoice_sale_new_add_invoice_element_nameController.requiredAndValidProperty().and(this.fxml_invoice_sale_new_add_invoice_element_netpriceController.requiredAndValidProperty().and(this.fxml_invoice_sale_new_add_invoice_element_amountController.requiredAndValidProperty().and(this.fxml_invoice_sale_new_add_invoice_element_unitController.requiredAndValidProperty().and(this.fxml_invoice_sale_new_add_invoice_element_tax_typeController.requiredAndValidProperty().and(this.fxml_invoice_sale_new_add_invoice_element_descriptionController.requiredAndValidProperty()))))).not());
      this.fxml_invoice_sale_new_add_invoice_element_nameController.setValueMaxLength(256);
      ((TextAreaRequired)this.fxml_invoice_sale_new_add_invoice_element_descriptionController.fxml_component_main_element).setOnKeyPressed(new EventHandler<KeyEvent>() {
         public void handle(KeyEvent var1) {
            switch (var1.getCode()) {
               case TAB:
                  ((TextFieldValidated_Number)EUG.this.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element).requestFocus();
                  var1.consume();
               default:
            }
         }
      });
   }

   public void setDialogStage(Stage var1) {
      this.GKP = var1;
      this.fxml_invoice_sale_new_add_invoice_element_nameController.setDialogStage(var1);
   }

   public Stage getDialogStage() {
      return this.GKP;
   }

   public void setResources(ResourceBundle var1) {
      this.GKQ = var1;
   }

   public void setCalculationMethod(String var1) {
      this.RAU = var1;
   }

   public void setDefault() {
      try {
         ((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).getSelectionModel().select(KL.RATE_23);
         ((TextFieldValidated_Text)this.fxml_invoice_sale_new_add_invoice_element_unitController.fxml_component_main_element).setText(this.GKQ.getString("micro.process.invoice_sale_new.Error.DefaultUnit"));
         String var1 = this.RAU;
         this.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_root_element.setLabel(this.GKQ.getString("micro.process.invoice_sale_new.DialogAddNewInvoiceElement.UnitValue_" + var1));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setProductAutocomplete(EUY var1) {
      this.GKR = new EUH(new EUW(var1), this);
      ((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_nameController.fxml_component_main_element).setOnKeyReleased(new QKK(this.GKR));
   }

   @FXML
   public void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {
      this.GKO = true;
      this.GKR.HNS((String)((ComboBoxRequired)this.fxml_invoice_sale_new_add_invoice_element_nameController.fxml_component_main_element).getValue());
      this.GKP.close();
   }

   @FXML
   public void fxml_handleButton_cancel(ActionEvent var1) {
      this.GKP.close();
   }

   public boolean HXC() {
      return this.GKO;
   }
}
