package a.a.a.c.c.e.c.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.e.c.c.ESJ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.KH;
import a.a.a.c.f.c.c.ComboBoxRequired;
import java.util.Calendar;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;

public class ESF {
   @FXML
   public EZP<Integer> fxml_invoice_settlements_yearController;
   @FXML
   public EZP<KH> fxml_invoice_settlements_monthController;
   @FXML
   public Button fxml_button_save;
   @FXML
   public Button fxml_button_cancel;
   private boolean GBV;
   private ESJ GBW;
   private Stage GBX;
   private ChangeListener<Integer> GBY = new ChangeListener<Integer>() {
      public void changed(ObservableValue<? extends Integer> var1, Integer var2, Integer var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null) {
               ESF.this.HSW(var3);
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   };

   public ESF() {
   }

   public void setImplementation(ESJ var1) {
      this.GBW = var1;
   }

   public void setDialogStage(Stage var1) {
      this.GBX = var1;
   }

   @FXML
   private void initialize() {
      this.fxml_button_save.disableProperty().bind(this.fxml_invoice_settlements_yearController.requiredAndValidProperty().and(this.fxml_invoice_settlements_monthController.requiredAndValidProperty()).not());
      int var1 = Calendar.getInstance().get(1);
      ((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).getItems().add(var1 - 1);
      ((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).getItems().add(var1);
      ((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).getItems().add(var1 + 1);
      ((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).setValue(var1);
      ((ComboBoxRequired)this.fxml_invoice_settlements_monthController.fxml_component_main_element).setCellFactory(new EOQ());
      ((ComboBoxRequired)this.fxml_invoice_settlements_monthController.fxml_component_main_element).setButtonCell((ListCell)((ComboBoxRequired)this.fxml_invoice_settlements_monthController.fxml_component_main_element).getCellFactory().call(null));
      ((ComboBoxRequired)this.fxml_invoice_settlements_monthController.fxml_component_main_element).disableProperty().bind(((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).valueProperty().isNull());
      ((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).valueProperty().addListener(this.GBY);
   }

   @FXML
   protected void fxml_handleButton_save(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("[save] clicked");
         this.GBV = true;
         this.GBX.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_cancel(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("[cancel] clicked");
         this.GBX.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HSU() {
      EXF.getInstance().ICO();

      try {
         if (((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).getValue() != null) {
            this.HSW((Integer)((ComboBoxRequired)this.fxml_invoice_settlements_yearController.fxml_component_main_element).getValue());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HSV() {
      return this.GBV;
   }

   private void HSW(int var1) {
      EXF.getInstance().ICO();

      try {
         ((ComboBoxRequired)this.fxml_invoice_settlements_monthController.fxml_component_main_element).getItems().clear();
         KH[] var2 = KH.values();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            KH var5 = var2[var4];
            JN var6 = new JN(var1, var5.getNumber());
            JG var7 = this.GBW.getSettlementStatus(var6);
            if (var7 == null) {
               ((ComboBoxRequired)this.fxml_invoice_settlements_monthController.fxml_component_main_element).getItems().add(var5);
            }
         }
      } catch (FFO | FFK var11) {
         EXF.getInstance().ICA((Throwable)var11);
         throw new FFI("get SettlementStatus error");
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
