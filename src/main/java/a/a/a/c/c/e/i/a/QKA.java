package a.a.a.c.c.e.i.a;

import a.a.a.c.c.d.m.QKL;
import a.a.a.c.c.d.m.QKN;
import a.a.a.c.c.d.m.QKO;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZM;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.QJX;
import a.a.a.c.f.a.d.QJY;
import a.a.a.c.f.b.EZT;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.a.KK;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.f.c.c.TextFieldValidated_NIP;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class QKA {
   @FXML
   private EZP<KK> fxml_jpk_dialog_fa_settings_combo_box_tax_officeController;
   @FXML
   private Label fxml_jpk_dialog_fa_settings_tax_office_code;
   @FXML
   private CheckBox fxml_jpk_dialog_fa_settings_checkbox_date_chooser_creation_date;
   @FXML
   private CheckBox fxml_jpk_dialog_fa_settings_checkbox_date_chooser_transaction_date;
   @FXML
   private EZD fxml_jpk_dialog_fa_settings_date_picker_date_fromController;
   @FXML
   private EZD fxml_jpk_dialog_fa_settings_date_picker_date_toController;
   @FXML
   private CheckBox fxml_jpk_dialog_fa_settings_checkbox_use_nip_filter;
   @FXML
   private Label fxml_jpk_dialog_fa_settings_label_contractor_name;
   @FXML
   private Button fxml_jpk_dialog_fa_settings_button_cancel;
   @FXML
   private Button fxml_jpk_dialog_fa_settings_button_generate_and_send;
   @FXML
   private EZM fxml_jpk_dialog_fa_settings_text_field_nipController;
   private BooleanProperty QME = new SimpleBooleanProperty(false);
   private EUF QMF;
   private ResourceBundle QMG;
   private QJY QMH;
   private Stage QMI;
   private QJX QMJ;
   private QKB QMK = new QKB();
   private QKC QML = new QKC();
   QKD QMM = new QKD();
   private QKE QMN = new QKE();
   private QKF QMO = new QKF();
   private QKG QMP = new QKG();

   public QKA() {
   }

   @FXML
   private void initialize() {
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).setConverter(new QKL((ComboBox)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element));
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).getItems().addAll(KK.DEN());
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).editableProperty().set(true);
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).setOnKeyReleased(new QKN());
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).showingProperty().addListener(new QKO((ComboBox)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element));
      this.fxml_jpk_dialog_fa_settings_button_generate_and_send.disableProperty().bind(this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.requiredAndValidProperty().and(this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.requiredAndValidProperty()).and(this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.requiredAndValidProperty()).and(this.fxml_jpk_dialog_fa_settings_checkbox_use_nip_filter.selectedProperty().not().or(this.fxml_jpk_dialog_fa_settings_text_field_nipController.requiredAndValidProperty())).and(this.QME).not());
      ((TextFieldValidated_NIP)this.fxml_jpk_dialog_fa_settings_text_field_nipController.fxml_component_main_element).disableProperty().bind(this.fxml_jpk_dialog_fa_settings_checkbox_use_nip_filter.selectedProperty().not());
      ((DatePickerRequired)this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.fxml_component_main_element).valueProperty().addListener(this.QMK);
      ((DatePickerRequired)this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.fxml_component_main_element).valueProperty().addListener(this.QML);
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).valueProperty().addListener(this.QMM);
      ((TextFieldValidated_NIP)this.fxml_jpk_dialog_fa_settings_text_field_nipController.fxml_component_main_element).textProperty().addListener(this.QMN);
      this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_creation_date.setSelected(true);
      this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_transaction_date.setSelected(false);
      this.QMH = QJY.CREATION_DATE;
      this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_creation_date.selectedProperty().addListener(this.QMO);
      this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_transaction_date.selectedProperty().addListener(this.QMP);
      this.RPD();
   }

   private void RPD() {
      EZT var1 = new EZT(LocalDate.of(1, 1, 1), LocalDate.of(2016, 6, 30), (String)null, true);
      EZT var2 = new EZT(LocalDate.of(2030, 1, 2), LocalDate.of(2999, 1, 1), (String)null, true);
      this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.IFM(var1);
      this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.IFM(var2);
      this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.IFM(var1);
      this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.IFM(var2);
   }

   public void setImplementation(EUF var1) {
      this.QMF = var1;
   }

   public void setResource(ResourceBundle var1) {
      this.QMG = var1;
   }

   public void setDialogStage(Stage var1) {
      this.QMI = var1;
   }

   public QJX getJpkFaGenerateSettings() {
      return this.QMJ;
   }

   public void QOW() {
      LY var1 = this.QMF.getUserData();
      KK var2 = (KK)var1.DFQ().getValue();
      ((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).setValue(var2);
   }

   @FXML
   public void fxml_jpk_dialog_fa_settings_button_generate_and_send_clicked(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         KA var2 = null;
         if (this.fxml_jpk_dialog_fa_settings_checkbox_use_nip_filter.isSelected()) {
            var2 = new KA(((TextFieldValidated_NIP)this.fxml_jpk_dialog_fa_settings_text_field_nipController.fxml_component_main_element).getText());
         }

         this.QMJ = new QJX(this.QMH, (LocalDate)((DatePickerRequired)this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.fxml_component_main_element).getValue(), (LocalDate)((DatePickerRequired)this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.fxml_component_main_element).getValue(), this.fxml_jpk_dialog_fa_settings_checkbox_use_nip_filter.isSelected(), var2, (KK)((ComboBoxRequired)this.fxml_jpk_dialog_fa_settings_combo_box_tax_officeController.fxml_component_main_element).getValue());
         this.QMI.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_jpk_dialog_fa_settings_button_cancel_clicked(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.QMI.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private class QKG implements ChangeListener<Boolean> {
      private QKG() {
      }

      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         if (var3) {
            QKA.this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_creation_date.setSelected(false);
            QKA.this.QMH = QJY.TRANSACTION_DATE;
         } else {
            QKA.this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_creation_date.setSelected(true);
         }

      }
   }

   private class QKF implements ChangeListener<Boolean> {
      private QKF() {
      }

      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         if (var3) {
            QKA.this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_transaction_date.setSelected(false);
            QKA.this.QMH = QJY.CREATION_DATE;
         } else {
            QKA.this.fxml_jpk_dialog_fa_settings_checkbox_date_chooser_transaction_date.setSelected(true);
         }

      }
   }

   private class QKE implements ChangeListener<String> {
      private QKE() {
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         if (QKA.this.fxml_jpk_dialog_fa_settings_text_field_nipController.isRequiredAndValid()) {
            HI var4 = QKA.this.QMF.getContractorByNip(var3);
            if (var4 != null) {
               QKA.this.fxml_jpk_dialog_fa_settings_label_contractor_name.setText((String)var4.DAI().getValue());
            } else {
               QKA.this.fxml_jpk_dialog_fa_settings_label_contractor_name.setText("");
            }
         } else {
            QKA.this.fxml_jpk_dialog_fa_settings_label_contractor_name.setText("");
         }

      }
   }

   private class QKD implements ChangeListener<KK> {
      private QKD() {
      }

      public void changed(ObservableValue<? extends KK> var1, KK var2, KK var3) {
         if (var3 != null) {
            QKA.this.fxml_jpk_dialog_fa_settings_tax_office_code.setText(QKA.this.QMG.getString("micro.process.jpk_list.dialog_fa_settings.taxOfficeCode") + var3.getKey());
         }

      }
   }

   private class QKC implements ChangeListener<LocalDate> {
      private QKC() {
      }

      public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
         if (var3 != null) {
            EZT var4 = new EZT(var3.plusDays(1L), LocalDate.MAX.minusDays(1L), "", true);
            QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.IFP();
            QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.IFM(var4);
         }

         if (var3 != null && ((DatePickerRequired)QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.fxml_component_main_element).getValue() != null) {
            if (var3.isBefore((ChronoLocalDate)((DatePickerRequired)QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_fromController.fxml_component_main_element).getValue())) {
               QKA.this.QME.set(false);
            } else {
               QKA.this.QME.set(true);
            }
         }

      }
   }

   private class QKB implements ChangeListener<LocalDate> {
      private QKB() {
      }

      public void changed(ObservableValue<? extends LocalDate> var1, LocalDate var2, LocalDate var3) {
         if (var3 != null) {
            EZT var4 = new EZT(LocalDate.MIN.plusDays(1L), var3.minusDays(1L), "", true);
            QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.IFP();
            QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.IFM(var4);
            QKA.this.RPD();
         }

         if (var3 != null && ((DatePickerRequired)QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.fxml_component_main_element).getValue() != null) {
            if (var3.isAfter((ChronoLocalDate)((DatePickerRequired)QKA.this.fxml_jpk_dialog_fa_settings_date_picker_date_toController.fxml_component_main_element).getValue())) {
               QKA.this.QME.set(false);
            } else {
               QKA.this.QME.set(true);
            }
         }

      }
   }
}
