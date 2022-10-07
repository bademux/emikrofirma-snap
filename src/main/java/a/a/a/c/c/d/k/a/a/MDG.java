package a.a.a.c.c.d.k.a.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMB;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZF;
import a.a.a.c.f.a.a.EZI;
import a.a.a.c.f.a.a.EZJ;
import a.a.a.c.f.a.a.EZQ;
import a.a.a.c.f.a.a.MOV;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.f.c.c.TextFieldValidated_Email_KD;
import a.a.a.c.f.c.c.TextFieldValidated_NIP;
import a.a.a.c.f.c.c.TextFieldValidated_PESEL;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import a.a.a.c.g.b.FCW;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MDG {
   @FXML
   public EZQ fxml_include_nipOrPeselController;
   @FXML
   public EZF fxml_include_nipController;
   @FXML
   public EZJ fxml_include_peselController;
   @FXML
   public EYQ fxml_include_firstNameController;
   @FXML
   public EYQ fxml_include_lastNameController;
   @FXML
   public EZD fxml_include_birthDateController;
   @FXML
   public EZI fxml_include_taxAmountController;
   @FXML
   public MOV fxml_include_emailController;
   @FXML
   private Button fxml_button_save;
   @FXML
   private Button fxml_button_cancel;
   @FXML
   private Button fxml_button_info;
   private Stage MWE;
   Boolean MWF = false;

   public MDG() {
   }

   @FXML
   private void initialize() {
      EXF.getInstance().ICO();

      try {
         ((TextFieldValidated_NIP)this.fxml_include_nipController.fxml_component_main_element).IFC().bind(this.fxml_include_nipOrPeselController.fxml_component_main_element.selectedProperty().not());
         ((TextFieldValidated_PESEL)this.fxml_include_peselController.fxml_component_main_element).IFC().bind(this.fxml_include_nipOrPeselController.fxml_component_main_element.selectedProperty());
         ((TextFieldValidated_NIP)this.fxml_include_nipController.fxml_component_main_element).disableProperty().bind(this.fxml_include_nipController.requiredProperty().not());
         ((TextFieldValidated_PESEL)this.fxml_include_peselController.fxml_component_main_element).disableProperty().bind(this.fxml_include_peselController.requiredProperty().not());
         Image var1 = new Image(MDG.class.getResourceAsStream("/img/info-20.png"));
         this.fxml_button_info.setGraphic(new ImageView(var1));
         final Tooltip var2 = new Tooltip(FCW.getInstance().getMessageForKey("micro.jpk.sendout.signature.method.kd.dialog.declarationTaxValue.tooltip"));
         this.fxml_button_info.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
               var2.show(MDG.this.MWE);
            }
         });
         this.fxml_button_info.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
               var2.hide();
            }
         });
         this.fxml_button_save.disableProperty().bind(this.fxml_include_nipController.requiredAndValidProperty().or(((TextFieldValidated_NIP)this.fxml_include_nipController.fxml_component_main_element).disabledProperty()).and(this.fxml_include_peselController.requiredAndValidProperty().or(((TextFieldValidated_PESEL)this.fxml_include_peselController.fxml_component_main_element).disabledProperty()).and(this.fxml_include_firstNameController.requiredAndValidProperty().and(this.fxml_include_lastNameController.requiredAndValidProperty().and(this.fxml_include_birthDateController.requiredAndValidProperty().and(this.fxml_include_taxAmountController.requiredAndValidProperty().and(this.fxml_include_emailController.requiredAndValidProperty())))))).not());
         ((TextFieldValidated_PESEL)this.fxml_include_peselController.fxml_component_main_element).focusedProperty().addListener(new MDH(this.fxml_include_peselController, this.fxml_include_birthDateController));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setupDefaults() {
      EXF.getInstance().ICO();

      try {
         LY var1 = EMB.getInstance().HHV();
         ((TextFieldValidated_NIP)this.fxml_include_nipController.fxml_component_main_element).setText((String)var1.DFF().getValue());
         ((TextFieldValidated_Text)this.fxml_include_firstNameController.fxml_component_main_element).setText((String)var1.DFI().getValue());
         ((TextFieldValidated_Text)this.fxml_include_lastNameController.fxml_component_main_element).setText((String)var1.DFJ().getValue());
         ((TextFieldValidated_Email_KD)this.fxml_include_emailController.fxml_component_main_element).setText((String)var1.DFL().getValue());
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setDialogStage(Stage var1) {
      EXF.getInstance().ICO();

      try {
         this.MWE = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public Boolean getResult() {
      return this.MWF;
   }

   @FXML
   private void fxml_handleButton_save(ActionEvent var1) throws FFO, FFK {
      EXF.getInstance().ICO();

      try {
         this.MWF = true;
         this.MWE.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleButton_cancel(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.MWF = false;
         this.MWE.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
