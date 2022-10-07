package a.a.a.c.c.e.e.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.e.e.c.ETE;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYM;
import a.a.a.c.f.a.a.EYN;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EZF;
import a.a.a.c.f.a.a.EZK;
import a.a.a.c.f.a.a.EZN;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.c.a.KN;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.f.c.c.TextAreaRequired;
import a.a.a.c.f.c.c.TextFieldValidated_AccountNumber;
import a.a.a.c.f.c.c.TextFieldValidated_Email;
import a.a.a.c.f.c.c.TextFieldValidated_NIP;
import a.a.a.c.f.c.c.TextFieldValidated_Phone;
import a.a.a.c.f.c.c.TextFieldValidated_PostalCode;
import a.a.a.c.f.c.c.TextFieldValidated_REGON;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import a.a.a.c.g.b.FCW;
import a.a.b.a.a.a.a.ESY;
import a.a.b.a.a.a.a.QTE;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.stage.Stage;

public class ETB {
   @FXML
   public EYQ fxml_include_ContractorName_boxController;
   @FXML
   public EZF fxml_include_nip_boxController;
   @FXML
   public EZN fxml_include_regon_boxController;
   @FXML
   public EYM fxml_include_AccountNumber_boxController;
   @FXML
   public EYN<KN> fxml_include_address_boxController;
   @FXML
   public EZK fxml_include_remarks_boxController;
   @FXML
   public CheckBox fxml_contractor_private_person;
   @FXML
   private Button fxml_saveNewContractor;
   @FXML
   private Button fxml_cancelNewContractor;
   public BooleanProperty GFN = new SimpleBooleanProperty(this, "requiredAndValidPropertyHolder", false);
   public BooleanProperty GFO = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
   public BooleanProperty QGH = new SimpleBooleanProperty(this, "validPropertyHolder", false);
   private Stage GFP;
   boolean GFQ = false;
   private HI GFS;
   @FXML
   public Label fxml_contractor_private_person_exist;
   private ETE GFT;
   private ETA GFU;
   private ResourceBundle GFV;

   public ETB() {
   }

   public String getTitle() throws FFK {
      return "Title";
   }

   @FXML
   private void initialize() {
      EXF.getInstance().ICO();

      try {
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).setCellFactory(new EOQ());
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).setButtonCell((ListCell)((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getCellFactory().call(null));
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getItems().addAll(KN.values());
         this.GFN.bind(this.fxml_include_ContractorName_boxController.requiredAndValidProperty().and(this.fxml_include_nip_boxController.requiredAndValidProperty().and(this.fxml_include_AccountNumber_boxController.requiredAndValidProperty().and(this.fxml_include_regon_boxController.requiredAndValidProperty().and(this.fxml_include_address_boxController.requiredAndValidProperty().and(this.fxml_include_remarks_boxController.requiredAndValidProperty().and(this.fxml_contractor_private_person_exist.visibleProperty().not())))))));
         this.GFO.bind(this.fxml_include_ContractorName_boxController.changedProperty().or(this.fxml_include_nip_boxController.changedProperty().or(this.fxml_include_regon_boxController.changedProperty().or(this.fxml_include_AccountNumber_boxController.changedProperty().or(this.fxml_include_address_boxController.changedProperty().or(this.fxml_include_remarks_boxController.changedProperty()))))));
         ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).editableProperty().bind(this.fxml_contractor_private_person.selectedProperty().not());
         this.fxml_contractor_private_person.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
               if (var3 != null) {
                  if (var3) {
                     ((TextFieldValidated_NIP)ETB.this.fxml_include_nip_boxController.fxml_component_main_element).setText(FCW.getInstance().getMessageForKey("micro.process.general.nip.null"));
                  } else {
                     ((TextFieldValidated_NIP)ETB.this.fxml_include_nip_boxController.fxml_component_main_element).setText("");
                  }
               }

            }
         });
         this.fxml_saveNewContractor.disableProperty().bind(this.GFN.and(this.GFO).not());
         this.fxml_cancelNewContractor.setDisable(false);
         this.fxml_contractor_private_person_exist.setVisible(false);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setDialogStage(Stage var1) {
      EXF.getInstance().ICO();

      try {
         this.GFP = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_save(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.GFQ = true;
         this.GFP.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_cancel(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.GFQ = false;
         this.GFP.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HUJ() {
      EXF.getInstance().ICO();

      try {
         this.HUL();
         this.RKL();
         ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().addListener(new ESY(this, this.fxml_include_nip_boxController));
         this.fxml_contractor_private_person.selectedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
               ETB.this.fxml_contractor_private_person_exist.setVisible(false);
               if (var3 != null && var3 && ETB.this.fxml_include_ContractorName_boxController.isRequiredAndValid() && ETB.this.fxml_include_nip_boxController.isRequiredAndValid() && ETB.this.fxml_include_address_boxController.fxml_include_Street_boxController.isRequiredAndValid() && ETB.this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.isRequiredAndValid() && ETB.this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.isRequiredAndValid() && ETB.this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.isRequiredAndValid() && ETB.this.fxml_include_address_boxController.fxml_include_City_boxController.isRequiredAndValid() && !ETB.this.RKM(ETB.this.GFS)) {
                  ETB.this.fxml_contractor_private_person_exist.setVisible(true);
               }

            }
         });
         ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).textProperty().addListener(new QTE(this, this.fxml_contractor_private_person_exist, this.fxml_contractor_private_person, this.fxml_include_ContractorName_boxController, this.fxml_include_nip_boxController, this.fxml_include_address_boxController));
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().addListener(new QTE(this, this.fxml_contractor_private_person_exist, this.fxml_contractor_private_person, this.fxml_include_ContractorName_boxController, this.fxml_include_nip_boxController, this.fxml_include_address_boxController));
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().addListener(new QTE(this, this.fxml_contractor_private_person_exist, this.fxml_contractor_private_person, this.fxml_include_ContractorName_boxController, this.fxml_include_nip_boxController, this.fxml_include_address_boxController));
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().addListener(new QTE(this, this.fxml_contractor_private_person_exist, this.fxml_contractor_private_person, this.fxml_include_ContractorName_boxController, this.fxml_include_nip_boxController, this.fxml_include_address_boxController));
         ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().addListener(new QTE(this, this.fxml_contractor_private_person_exist, this.fxml_contractor_private_person, this.fxml_include_ContractorName_boxController, this.fxml_include_nip_boxController, this.fxml_include_address_boxController));
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().addListener(new QTE(this, this.fxml_contractor_private_person_exist, this.fxml_contractor_private_person, this.fxml_include_ContractorName_boxController, this.fxml_include_nip_boxController, this.fxml_include_address_boxController));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RKL() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_ContractorName_boxController.clearChangedProperty();
         this.fxml_include_nip_boxController.clearChangedProperty();
         this.fxml_include_AccountNumber_boxController.clearChangedProperty();
         this.fxml_include_regon_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_Street_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_City_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_District_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_Community_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_telephone_boxController.clearChangedProperty();
         this.fxml_include_address_boxController.fxml_include_email_boxController.clearChangedProperty();
         this.fxml_include_remarks_boxController.clearChangedProperty();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean RKM(HI var1) {
      try {
         this.GFT = (ETE)this.GFU.getProcess();
         if (this.GFT != null) {
            return this.GFT.RKN(var1);
         }
      } catch (FFO | FFK var3) {
         EXF.getInstance().ICA((Throwable)var3);
      }

      return false;
   }

   public void HUK() {
      EXF.getInstance().ICO();

      try {
         this.HUM();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setContractor(HI var1) {
      EXF.getInstance().ICO();

      try {
         this.GFS = var1.AICD();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public HI getContractor() {
      return this.GFS;
   }

   private void HUL() {
      EXF.getInstance().ICO();

      try {
         if (this.GFS == null) {
            this.GFS = new HI();
         }

         this.fxml_contractor_private_person.selectedProperty().bindBidirectional(this.GFS.getPrivatePerson().DDS());
         ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAI().DDG());
         ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAJ().DDG());
         ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAK().DDG());
         ((TextFieldValidated_AccountNumber)this.fxml_include_AccountNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAL().DDG());
         JJ var1 = this.GFS.DAM();
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DDA().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DDB().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DDC().DDG());
         ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DDD().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DCZ().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DCX().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DCY().DDG());
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().bindBidirectional(var1.DCW().DEI());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DCV().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DDE().DDG());
         ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAO().DDG());
         ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAN().DDG());
         ((TextAreaRequired)this.fxml_include_remarks_boxController.fxml_component_main_element).textProperty().bindBidirectional(this.GFS.DAP().DDG());
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HUM() {
      EXF.getInstance().ICO();

      try {
         if (this.GFS != null) {
            this.fxml_contractor_private_person.selectedProperty().unbindBidirectional(this.GFS.getPrivatePerson().DDS());
            ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAI().DDG());
            ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAJ().DDG());
            ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAK().DDG());
            ((TextFieldValidated_AccountNumber)this.fxml_include_AccountNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAL().DDG());
            JJ var1 = this.GFS.DAM();
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DDA().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DDB().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DDC().DDG());
            ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DDD().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DCZ().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DCX().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DCY().DDG());
            ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DCW().DEI());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DCV().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DDE().DDG());
            ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAO().DDG());
            ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAN().DDG());
            ((TextAreaRequired)this.fxml_include_remarks_boxController.fxml_component_main_element).textProperty().unbindBidirectional(this.GFS.DAP().DDG());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HUO() {
      return this.GFQ;
   }

   public void setImplementation(ETE var1) {
      this.GFT = var1;
   }

   public void setProcessController_ContactsList(ETA var1) {
      this.GFU = var1;
   }

   public boolean HUP(String var1) {
      try {
         this.GFT = (ETE)this.GFU.getProcess();
         if (this.GFT != null) {
            return this.GFT.HUR(var1);
         }
      } catch (FFO | FFK var3) {
         EXF.getInstance().ICA((Throwable)var3);
      }

      return false;
   }

   public void setResources(ResourceBundle var1) {
      this.GFV = var1;
   }
}
