package a.a.a.c.c.e.e.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.e.EOU;
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
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KO;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ESZ extends EMD {
   @FXML
   public TableView<HI> fxml_contractorsTable;
   @FXML
   public TableColumn<HI, KO> fxml_contact_name;
   @FXML
   public TableColumn<HI, KA> fxml_contact_nip;
   @FXML
   private TextField fxml_contractor_search;
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
   private CheckBox fxml_contractor_private_person;
   @FXML
   private Button fxml_newContractor;
   @FXML
   private Button fxml_newInvoiceSell;
   @FXML
   private Button fxml_newInvoivePurchase;
   public List<HI> GFJ;
   @FXML
   public Node fxml_inner_parent;
   private ETA GFK;
   private ETE GFL;
   private ETB QGG;

   public ESZ(EMC var1, String var2) {
      super(var1, var2);
   }

   public ResourceBundle getResources() {
      return this.resources;
   }

   public void initialize() {
      this.GFJ = new ArrayList();
      this.fxml_contractor_search.textProperty().addListener(new ChangeListener<String>() {
         public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
            ESZ.this.HUE(var2, var3);
         }
      });
      this.fxml_contact_name.setCellValueFactory(new PropertyValueFactory("name"));
      this.fxml_contact_name.setCellFactory(new EOU());
      this.fxml_contact_nip.setCellValueFactory(new PropertyValueFactory("nip"));
      this.fxml_contact_nip.setCellFactory(new EOU());
      ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).setCellFactory(new EOQ());
      ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).setButtonCell((ListCell)((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getCellFactory().call(null));
      ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getItems().addAll(KN.values());
      this.fxml_contractor_private_person.disableProperty().set(true);
      ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_AccountNumber)this.fxml_include_AccountNumber_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).editableProperty().set(false);
      ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).disableProperty().set(true);
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).editableProperty().set(false);
      ((TextAreaRequired)this.fxml_include_remarks_boxController.fxml_component_main_element).editableProperty().set(false);
      this.fxml_contractorsTable.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<HI>() {
         public void changed(ObservableValue<? extends HI> var1, HI var2, HI var3) {
            if (var2 != null) {
               ESZ.this.HUG(var2);
               ESZ.this.HUH();
            }

            if (var3 != null) {
               ESZ.this.HUF(var3);
            }

         }
      });
      this.fxml_newInvoiceSell.disableProperty().bind(this.fxml_contractorsTable.getSelectionModel().selectedItemProperty().isNull());
      this.fxml_newInvoivePurchase.disableProperty().bind(this.fxml_contractorsTable.getSelectionModel().selectedItemProperty().isNull().or(this.fxml_contractor_private_person.selectedProperty()));
      this.fxml_contractor_private_person.selectedProperty().addListener(new ChangeListener<Boolean>() {
         public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
            if (var3 != null && var3) {
               ((TextFieldValidated_NIP)ESZ.this.fxml_include_nip_boxController.fxml_component_main_element).setText(FCW.getInstance().getMessageForKey("micro.process.general.nip.null"));
            }

         }
      });
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

      try {
         this.HUH();
         this.fxml_contractor_search.setText("");
         this.fxml_contractorsTable.getItems().clear();
         this.GFJ.clear();
         this.GFL = this.GFK.getImplementation();
         this.GFJ = this.GFL.getContractors();
         Collections.sort(this.GFJ);
         this.fxml_contractorsTable.setItems(FXCollections.observableArrayList(this.GFJ));
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public Stage QGO() throws IOException {
      FXMLLoader var1 = new FXMLLoader();
      var1.setLocation(ESZ.class.getResource("/fxml/new_contact.fxml"));
      var1.setResources(this.resources);
      AnchorPane var2 = (AnchorPane)var1.load();
      Stage var3 = new Stage();
      var3.setTitle(this.resources.getString("micro.process.contacts_new.NewContact"));
      var3.initModality(Modality.WINDOW_MODAL);
      var3.initOwner(this.FGW);
      Scene var4 = new Scene(var2);
      var3.setScene(var4);
      var3.getIcons().add(new Image("/img/app/e_logo.png"));
      this.QGG = (ETB)var1.getController();
      this.QGG.setDialogStage(var3);
      this.QGG.setProcessController_ContactsList(this.GFK);
      this.QGG.setResources(this.resources);
      var3.setResizable(false);
      this.QGG.HUJ();
      return var3;
   }

   public void QGP() throws FFO, FFK {
      this.QGG.HUK();
      if (this.QGG.HUO()) {
         HI var1 = new HI();
         var1.setPrivtePerson(this.QGG.fxml_contractor_private_person.isSelected());
         var1.DAI().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_ContractorName_boxController.fxml_component_main_element).getText());
         var1.DAJ().setValue(((TextFieldValidated_NIP)this.QGG.fxml_include_nip_boxController.fxml_component_main_element).getText());
         var1.DAK().setValue(((TextFieldValidated_REGON)this.QGG.fxml_include_regon_boxController.fxml_component_main_element).getText());
         var1.DAL().setValue(((TextFieldValidated_AccountNumber)this.QGG.fxml_include_AccountNumber_boxController.fxml_component_main_element).getText());
         var1.DAM().DDA().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).getText());
         var1.DAM().DDB().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).getText());
         var1.DAM().DDC().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).getText());
         var1.DAM().DDD().setValue(((TextFieldValidated_PostalCode)this.QGG.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).getText());
         var1.DAM().DCZ().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).getText());
         var1.DAM().DDE().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).getText());
         var1.DAM().DCX().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).getText());
         var1.DAM().DCY().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).getText());
         var1.DAM().DCV().setValue(((TextFieldValidated_Text)this.QGG.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).getText());
         var1.DAM().DCW().setValue((KN) ((ComboBoxRequired)this.QGG.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getValue());
         var1.DAN().setValue(((TextFieldValidated_Phone)this.QGG.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).getText());
         var1.DAO().setValue(((TextFieldValidated_Email)this.QGG.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).getText());
         var1.DAP().setValue(((TextAreaRequired)this.QGG.fxml_include_remarks_boxController.fxml_component_main_element).getText());
         this.GFL.HHK();
         this.GFL.setContractor(var1);
         this.GFL.setMode(ETC.NEW);
         this.GFL.HHL();
         this.fxml_contractorsTable.getItems().clear();
         this.GFJ.add(var1);
         Collections.sort(this.GFJ);
         this.fxml_contractorsTable.setItems(FXCollections.observableArrayList(this.GFJ));
         ((TableView.TableViewSelectionModel)this.fxml_contractorsTable.selectionModelProperty().getValue()).select(var1);
      }

      this.QGG = null;
   }

   @FXML
   protected void fxml_handleButton_newContractor(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [new Contractor] clicked");
         Stage var2 = this.QGO();
         var2.showAndWait();
         this.QGP();
      } catch (FFK | FFO | IOException var6) {
         EXF.getInstance().ICA((Throwable)var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HUE(String var1, String var2) {
      ObservableList var3 = FXCollections.observableArrayList();
      if (var2 != null && this.fxml_contractor_search != null && var2.length() >= var1.length()) {
         var2 = var2.toUpperCase();
         Iterator var4 = this.fxml_contractorsTable.getItems().iterator();

         while(true) {
            HI var5;
            String var6;
            String var7;
            do {
               if (!var4.hasNext()) {
                  this.fxml_contractorsTable.setItems(var3);
                  return;
               }

               var5 = (HI)var4.next();
               var6 = (String)var5.getName().getValue();
               var7 = (String)var5.getNip().getValue();
            } while(!var6.toUpperCase().contains(var2) && !var7.toUpperCase().contains(var2));

            var3.add(var5);
         }
      } else {
         this.fxml_contractorsTable.setItems(FXCollections.observableArrayList(this.GFJ));
      }
   }

   public void HUF(HI var1) {
      EXF.getInstance().ICO();

      try {
         if (var1 != null) {
            if (var1.AICE()) {
               this.fxml_contractor_private_person.setSelected(true);
            } else {
               ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAJ().DDG());
            }

            ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAI().DDG());
            ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAK().DDG());
            ((TextFieldValidated_AccountNumber)this.fxml_include_AccountNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAL().DDG());
            JJ var2 = var1.DAM();
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DDA().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DDB().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DDC().DDG());
            ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DDD().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DCZ().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DCX().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DCY().DDG());
            ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().bindBidirectional(var2.DCW().DEI());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DCV().DDG());
            ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).textProperty().bindBidirectional(var2.DDE().DDG());
            ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAO().DDG());
            ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAN().DDG());
            ((TextAreaRequired)this.fxml_include_remarks_boxController.fxml_component_main_element).textProperty().bindBidirectional(var1.DAP().DDG());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HUG(HI var1) {
      if (var1 != null) {
         this.fxml_contractor_private_person.setSelected(false);
         ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAI().DDG());
         ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAJ().DDG());
         ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAK().DDG());
         ((TextFieldValidated_AccountNumber)this.fxml_include_AccountNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAL().DDG());
         JJ var2 = var1.DAM();
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DDA().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DDB().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DDC().DDG());
         ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DDD().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DCZ().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DCX().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DCY().DDG());
         ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var2.DCW().DEI());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DCV().DDG());
         ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var2.DDE().DDG());
         ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAO().DDG());
         ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAN().DDG());
         ((TextAreaRequired)this.fxml_include_remarks_boxController.fxml_component_main_element).textProperty().unbindBidirectional(var1.DAP().DDG());
      }

   }

   protected void HUH() {
      this.fxml_contractor_private_person.setSelected(false);
      ((TextFieldValidated_Text)this.fxml_include_ContractorName_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_REGON)this.fxml_include_regon_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_AccountNumber)this.fxml_include_AccountNumber_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Street_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_HouseNumber_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_PostalCode)this.fxml_include_address_boxController.fxml_include_PostalCode_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_City_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_District_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_Community_boxController.fxml_component_main_element).clear();
      ((ComboBoxRequired)this.fxml_include_address_boxController.fxml_include_Voivodeship_boxController.fxml_component_main_element).getSelectionModel().clearSelection();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_CountryCode_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Text)this.fxml_include_address_boxController.fxml_include_PostOffice_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Email)this.fxml_include_address_boxController.fxml_include_email_boxController.fxml_component_main_element).clear();
      ((TextFieldValidated_Phone)this.fxml_include_address_boxController.fxml_include_telephone_boxController.fxml_component_main_element).clear();
      ((TextAreaRequired)this.fxml_include_remarks_boxController.fxml_component_main_element).clear();
   }

   @FXML
   protected void fxml_handleButton_newInvoiceSell(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  HI var2 = (HI)ESZ.this.fxml_contractorsTable.getSelectionModel().getSelectedItem();
                  var1.setContractor(var2);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_newInvoicePurchase(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_PURCHASE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  HI var2 = (HI)ESZ.this.fxml_contractorsTable.getSelectionModel().getSelectedItem();
                  var1.setContractor(var2);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setProcessController_ContactsList(ETA var1) {
      this.GFK = var1;
   }

   public ETB getControllerNewContractor() {
      return this.QGG;
   }
}
