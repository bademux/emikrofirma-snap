package a.a.a.c.c.e.b.a;

import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.m.QKL;
import a.a.a.c.c.d.m.QKN;
import a.a.a.c.c.d.m.QKO;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYM;
import a.a.a.c.f.a.a.EYN;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EYY;
import a.a.a.c.f.a.a.EZF;
import a.a.a.c.f.a.a.EZN;
import a.a.a.c.f.a.a.EZP;
import a.a.a.c.f.b.c.a.KK;
import a.a.a.c.f.b.c.a.KN;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.f.c.c.TextFieldValidated_AccountNumber;
import a.a.a.c.f.c.c.TextFieldValidated_Email;
import a.a.a.c.f.c.c.TextFieldValidated_NIP;
import a.a.a.c.f.c.c.TextFieldValidated_Phone;
import a.a.a.c.f.c.c.TextFieldValidated_PostalCode;
import a.a.a.c.f.c.c.TextFieldValidated_REGON;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;

public class ERV extends EMD {
   public BooleanProperty GBK = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
   public BooleanProperty GBL = new SimpleBooleanProperty(this, "requiredAndValidPropertyHolder", false);
   @FXML
   public EZF fxml_include_nip_boxController;
   @FXML
   public EZN fxml_include_regon_boxController;
   @FXML
   public EYQ fxml_include_companyName_boxController;
   @FXML
   public EYQ fxml_include_firstName_boxController;
   @FXML
   public EYQ fxml_include_surname_boxController;
   @FXML
   public EYY fxml_include_logoImg_boxController;
   @FXML
   public EYN<KN> fxml_include_address_boxController;
   @FXML
   public EYM fxml_include_accountNumber_boxController;
   @FXML
   public EZP<KK> fxml_include_taxOffice_boxController;

   public ERV(EMC var1, String var2) {
      super(var1, var2);
   }

   public void initialize() {
      EXF.getInstance().ICO();

      try {
         this.GBK.bind(this.fxml_include_nip_boxController.changedProperty().or(this.fxml_include_regon_boxController.changedProperty().or(this.fxml_include_companyName_boxController.changedProperty().or(this.fxml_include_firstName_boxController.changedProperty().or(this.fxml_include_surname_boxController.changedProperty().or(this.fxml_include_logoImg_boxController.changedProperty().or(this.fxml_include_address_boxController.changedProperty().or(this.fxml_include_accountNumber_boxController.changedProperty().or(this.fxml_include_taxOffice_boxController.changedProperty())))))))));
         this.GBL.bind(this.fxml_include_nip_boxController.requiredAndValidProperty().and(this.fxml_include_regon_boxController.requiredAndValidProperty().and(this.fxml_include_companyName_boxController.requiredAndValidProperty().and(this.fxml_include_firstName_boxController.requiredAndValidProperty().and(this.fxml_include_surname_boxController.requiredAndValidProperty().and(this.fxml_include_logoImg_boxController.requiredAndValidProperty().and(this.fxml_include_address_boxController.requiredAndValidProperty().and(this.fxml_include_accountNumber_boxController.requiredAndValidProperty().and(this.fxml_include_taxOffice_boxController.requiredAndValidProperty())))))))));
         ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).editableProperty().set(false);
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).setCellFactory(new EOQ());
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).setButtonCell((ListCell)((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getCellFactory().call(null));
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getItems().addAll(KN.values());
         ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).setConverter(new QKL((ComboBox)this.fxml_include_taxOffice_boxController.fxml_component_main_element));
         ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).getItems().addAll(KK.DEN());
         ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).editableProperty().set(true);
         ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).setOnKeyReleased(new QKN());
         ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).showingProperty().addListener(new QKO((ComboBox)this.fxml_include_taxOffice_boxController.fxml_component_main_element));
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).setEditable(false);
         this.fxml_include_accountNumber_boxController.QOD(this.resources.getString("micro.types.accountNumber.Tooltip"));
         this.fxml_include_address_boxController.fxml_include_telephone_boxController.QOE(this.resources.getString("micro.types.phone.Tooltip"));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HSO(LY var1) {
      EXF.getInstance().ICO();

      try {
         if (var1 != null) {
            ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFF().DDG());
            ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFG().DDG());
            ((TextFieldValidated_Text)this.fxml_include_companyName_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFH().DDG());
            ((TextFieldValidated_Text)this.fxml_include_firstName_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFI().DDG());
            ((TextFieldValidated_Text)this.fxml_include_surname_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFJ().DDG());
            this.fxml_include_logoImg_boxController.fxml_component_main_element.imageProperty().bindBidirectional(var1.DFM().DDU());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DCV().DDG());
            ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().bindBidirectional(var1.DFN().DCW().DEI());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DCX().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DCY().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DCZ().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DDA().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DDB().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DDC().DDG());
            ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DDD().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFN().DDE().DDG());
            ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFK().DDG());
            ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFL().DDG());
            ((TextFieldValidated_AccountNumber)this.fxml_include_accountNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DFO().DDG());
            ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).valueProperty().bindBidirectional(var1.DFQ().DEI());
            ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getSelectionModel().select(var1.DFN().DCW().getValue());
            ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).getSelectionModel().select(var1.DFQ().getValue());
            this.HSQ();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HSP(LY var1) {
      EXF.getInstance().ICO();

      try {
         if (var1 != null) {
            ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFF().DDG());
            ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFG().DDG());
            ((TextFieldValidated_Text)this.fxml_include_companyName_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFH().DDG());
            ((TextFieldValidated_Text)this.fxml_include_firstName_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFI().DDG());
            ((TextFieldValidated_Text)this.fxml_include_surname_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFJ().DDG());
            this.fxml_include_logoImg_boxController.fxml_component_main_element.imageProperty().unbindBidirectional(var1.DFM().DDU());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DCV().DDG());
            ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DFN().DCW().DEI());
            ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getSelectionModel().clearSelection();
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DCX().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DCY().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DCZ().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DDA().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DDB().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DDC().DDG());
            ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DDD().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFN().DDE().DDG());
            ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFK().DDG());
            ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFL().DDG());
            ((TextFieldValidated_AccountNumber)this.fxml_include_accountNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DFO().DDG());
            ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DFQ().DEI());
            ((ComboBoxRequired)this.fxml_include_taxOffice_boxController.fxml_component_main_element).getSelectionModel().clearSelection();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HSQ() {
      this.fxml_include_nip_boxController.clearChangedProperty();
      this.fxml_include_regon_boxController.clearChangedProperty();
      this.fxml_include_companyName_boxController.clearChangedProperty();
      this.fxml_include_firstName_boxController.clearChangedProperty();
      this.fxml_include_surname_boxController.clearChangedProperty();
      this.fxml_include_logoImg_boxController.clearChangedProperty();
      this.fxml_include_address_boxController.clearChangedProperty();
      this.fxml_include_accountNumber_boxController.clearChangedProperty();
      this.fxml_include_taxOffice_boxController.clearChangedProperty();
   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var1;
      try {
         var1 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public void HHC() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }
}
