package a.a.a.c.c.d.a;

import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.d.o.QVD;
import a.a.a.c.c.d.o.QVE;
import a.a.a.c.c.d.o.QVF;
import a.a.a.c.c.d.o.QVG;
import a.a.a.c.c.d.o.ROU;
import a.a.a.c.c.d.o.ROV;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EYR;
import a.a.a.c.f.a.a.EYS;
import a.a.a.c.f.a.a.EZD;
import a.a.a.c.f.a.a.EZG;
import a.a.a.c.f.a.a.EZL;
import a.a.a.c.f.a.a.EZO;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.e.HP;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.c.c.ComboBoxValidated_ContractorName;
import a.a.a.c.f.c.c.ComboBoxValidated_NIP;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.f.c.c.TextFieldValidated_PostalCode;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import java.awt.Desktop;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public abstract class QUW extends EMD implements EMO<HO>, EYR {
   @FXML
   public EYQ fxml_include_invoiceRefNumber_boxController;
   @FXML
   public EZD fxml_include_eventDate_boxController;
   @FXML
   public EZD fxml_include_issueDate_boxController;
   @FXML
   public EZD fxml_include_receiptDate_boxController;
   @FXML
   public EYS fxml_include_ContractorName_boxController;
   @FXML
   public EZO fxml_include_nip_boxController;
   @FXML
   public EZG fxml_include_Street_boxController;
   @FXML
   public EZG fxml_include_HouseNumber_boxController;
   @FXML
   public EZG fxml_include_ApartmentNumber_boxController;
   @FXML
   public EZL fxml_include_PostalCode_boxController;
   @FXML
   public EZG fxml_include_City_boxController;
   @FXML
   public EZD fxml_include_invoicingDate_boxController;
   @FXML
   public TableView<HP> fxml_registry_invoicePositionTable_tableView;
   @FXML
   public TableColumn<HP, Object> fxml_registry_netTotalValue_tableColumn;
   @FXML
   public TableColumn<HP, Object> fxml_registry_vatValue_tableColumn;
   @FXML
   public TableColumn<HP, Object> fxml_registry_deductHalf_tableColumn;
   @FXML
   public TableColumn<HP, Object> fxml_registry_grossValue_tableColumn;
   @FXML
   public TableColumn<HP, Object> fxml_registry_taxReason_tableColumn;
   @FXML
   protected TableView<HR> fxml_summary_values_tableView;
   @FXML
   protected TableColumn<HR, Object> fxml_summary_totalNetValue_tableColumn;
   @FXML
   protected TableColumn<HR, Object> fxml_summary_totalVatValue_tableColumn;
   @FXML
   protected TableColumn<HR, Object> fxml_summary_totalGrossValue_tableColumn;
   @FXML
   public Button fxml_registry_addRowButton;
   @FXML
   public Button fxml_registry_deleteRowButton;
   protected HR REZ;
   @FXML
   public Node fxml_inner_parent;
   public BooleanProperty RFA = new SimpleBooleanProperty(this, "readOnlyPropertyHolder", false);
   public BooleanProperty RFB = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
   public BooleanProperty RFC = new SimpleBooleanProperty(this, "requiredAndValidPropertyHolder", false);
   protected ListProperty<HP> RFD = new SimpleListProperty();
   public BooleanProperty RFE = new SimpleBooleanProperty(this, "invoicePositionTableChangedPropertyHolder", false);
   public BooleanProperty RFF = new SimpleBooleanProperty(false);
   protected QUX RFG;
   @FXML
   Hyperlink fxml_hyperlink_nipCheckPage;

   public QUW(EMC var1, String var2) {
      super(var1, var2);
   }

   public abstract boolean RJW(JN var1, KE var2, KA var3);

   public abstract boolean RJX(JN var1);

   public HR getCurrentPurchase() {
      return this.REZ;
   }

   public ResourceBundle getResources() {
      return this.resources;
   }

   public void HJK() {
      this.fxml_inner_parent.requestFocus();
   }

   public void setContractorFromAutocomplete(QJW var1) {
      EXF.getInstance().ICO();

      try {
         if (var1 != null) {
            HI var2 = var1.getContractor().AICD();
            String var3 = this.resources.getString("micro.process.general.nip.null");
            if (!var3.equalsIgnoreCase((String)var2.DAJ().getValue())) {
               ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getEditor().setText((String)var2.getNip().getValue());
               ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getEditor().positionCaret(((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getEditor().getText().length());
            } else {
               ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getEditor().setText("");
            }

            ((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).getEditor().setText((String)var2.getName().getValue());
            ((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).getEditor().positionCaret(((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).getEditor().getText().length());
            JJ var4 = var2.DAM();
            ((TextFieldValidated_Text)this.fxml_include_Street_boxController.fxml_component_main_element).setText((String)var4.getStreet().getValue());
            ((TextFieldValidated_Text)this.fxml_include_HouseNumber_boxController.fxml_component_main_element).setText((String)var4.getHouseNumber().getValue());
            ((TextFieldValidated_Text)this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).setText((String)var4.getApartmentNumber().getValue());
            ((TextFieldValidated_PostalCode)this.fxml_include_PostalCode_boxController.fxml_component_main_element).setText((String)var4.getPostalCode().getValue());
            ((TextFieldValidated_Text)this.fxml_include_City_boxController.fxml_component_main_element).setText((String)var4.getCity().getValue());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void initialize() {
      EXF.getInstance().ICO();

      try {
         this.RFB.bind(this.fxml_include_invoiceRefNumber_boxController.changedProperty().or(this.fxml_include_eventDate_boxController.changedProperty().or(this.fxml_include_issueDate_boxController.changedProperty().or(this.fxml_include_receiptDate_boxController.changedProperty().or(this.fxml_include_ContractorName_boxController.changedProperty().or(this.fxml_include_nip_boxController.changedProperty().or(this.fxml_include_Street_boxController.changedProperty().or(this.fxml_include_HouseNumber_boxController.changedProperty().or(this.fxml_include_ApartmentNumber_boxController.changedProperty().or(this.fxml_include_PostalCode_boxController.changedProperty().or(this.fxml_include_City_boxController.changedProperty().or(this.fxml_include_invoicingDate_boxController.changedProperty().or(this.RFE)))))))))))));
         this.RFC.bind(this.fxml_include_invoiceRefNumber_boxController.requiredAndValidProperty().and(this.fxml_include_eventDate_boxController.requiredAndValidProperty().and(this.fxml_include_issueDate_boxController.requiredAndValidProperty().and(this.fxml_include_receiptDate_boxController.requiredAndValidProperty().and(this.fxml_include_ContractorName_boxController.requiredAndValidProperty().and(this.fxml_include_nip_boxController.requiredAndValidProperty().and(this.fxml_include_Street_boxController.requiredAndValidProperty().and(this.fxml_include_HouseNumber_boxController.requiredAndValidProperty().and(this.fxml_include_ApartmentNumber_boxController.requiredAndValidProperty().and(this.fxml_include_PostalCode_boxController.requiredAndValidProperty().and(this.fxml_include_City_boxController.requiredAndValidProperty().and(this.fxml_include_invoicingDate_boxController.requiredAndValidProperty().and(this.RFD.emptyProperty().not().and(this.RFF))))))))))))));
         ((DatePickerRequired)this.fxml_include_eventDate_boxController.fxml_component_main_element).editableProperty().set(false);
         ((DatePickerRequired)this.fxml_include_issueDate_boxController.fxml_component_main_element).editableProperty().set(false);
         ((DatePickerRequired)this.fxml_include_receiptDate_boxController.fxml_component_main_element).editableProperty().set(false);
         ((DatePickerRequired)this.fxml_include_invoicingDate_boxController.fxml_component_main_element).editableProperty().set(false);
         ((TextFieldValidated_Text)this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element).editableProperty().bind(this.RFA.not());
         ((DatePickerRequired)this.fxml_include_eventDate_boxController.fxml_component_main_element).disableProperty().bind(this.RFA);
         ((DatePickerRequired)this.fxml_include_issueDate_boxController.fxml_component_main_element).disableProperty().bind(this.RFA);
         ((DatePickerRequired)this.fxml_include_receiptDate_boxController.fxml_component_main_element).disableProperty().bind(this.RFA);
         ((DatePickerRequired)this.fxml_include_invoicingDate_boxController.fxml_component_main_element).disableProperty().bind(this.RFA);
         ((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).disableProperty().bind(this.RFA);
         ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).disableProperty().bind(this.RFA);
         ((TextFieldValidated_Text)this.fxml_include_Street_boxController.fxml_component_main_element).editableProperty().bind(this.RFA.not());
         ((TextFieldValidated_Text)this.fxml_include_HouseNumber_boxController.fxml_component_main_element).editableProperty().bind(this.RFA.not());
         ((TextFieldValidated_Text)this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).editableProperty().bind(this.RFA.not());
         ((TextFieldValidated_PostalCode)this.fxml_include_PostalCode_boxController.fxml_component_main_element).editableProperty().bind(this.RFA.not());
         ((TextFieldValidated_Text)this.fxml_include_City_boxController.fxml_component_main_element).editableProperty().bind(this.RFA.not());
         this.fxml_summary_values_tableView.editableProperty().bind(this.RFA.not());
         this.fxml_registry_invoicePositionTable_tableView.editableProperty().bind(this.RFA.not());
         this.fxml_registry_addRowButton.disableProperty().bind(this.RFA);
         this.fxml_registry_deleteRowButton.disableProperty().bind(this.RFA.or(this.fxml_registry_invoicePositionTable_tableView.getSelectionModel().selectedItemProperty().isNull()));
         this.fxml_registry_invoicePositionTable_tableView.setFixedCellSize(32.0);
         this.fxml_registry_invoicePositionTable_tableView.prefHeightProperty().bind(this.fxml_registry_invoicePositionTable_tableView.fixedCellSizeProperty().multiply(Bindings.size(this.RFD).add(2.5)));
         this.fxml_registry_invoicePositionTable_tableView.minHeightProperty().bind(this.fxml_registry_invoicePositionTable_tableView.prefHeightProperty());
         this.fxml_registry_invoicePositionTable_tableView.maxHeightProperty().bind(this.fxml_registry_invoicePositionTable_tableView.prefHeightProperty());
         this.fxml_include_invoiceRefNumber_boxController.fxml_component_validation_element_external.setText(this.getResources().getString("micro.process.invoice_purchase_new.refid.duplicate"));
         ((DatePickerRequired)this.fxml_include_issueDate_boxController.fxml_component_main_element).valueProperty().addListener(new QVD(this.RFA, (DatePicker)this.fxml_include_eventDate_boxController.fxml_component_main_element, (DatePicker)this.fxml_include_receiptDate_boxController.fxml_component_main_element, (DatePicker)this.fxml_include_invoicingDate_boxController.fxml_component_main_element));
         ((DatePickerRequired)this.fxml_include_eventDate_boxController.fxml_component_main_element).valueProperty().addListener(new ROU());
         ((DatePickerRequired)this.fxml_include_receiptDate_boxController.fxml_component_main_element).valueProperty().addListener(new ROV());
         ((TextFieldValidated_Text)this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element).textProperty().addListener(new QVG(this, this.RFA, this.fxml_include_invoiceRefNumber_boxController, this.fxml_include_invoicingDate_boxController, this.fxml_include_nip_boxController));
         ((DatePickerRequired)this.fxml_include_invoicingDate_boxController.fxml_component_main_element).valueProperty().addListener(new QVF(this, this.RFA, this.fxml_include_invoiceRefNumber_boxController, this.fxml_include_invoicingDate_boxController, this.fxml_include_nip_boxController));
         ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).IEU().addListener(new QVE(this, this.RFA, this.fxml_include_invoiceRefNumber_boxController, this.fxml_include_invoicingDate_boxController, this.fxml_include_nip_boxController));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_registry_deleteInvoicePosition(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         int var2 = this.fxml_registry_invoicePositionTable_tableView.getSelectionModel().getSelectedIndex();
         if (var2 >= 0) {
            this.fxml_registry_invoicePositionTable_tableView.getItems().remove(var2);
            this.fxml_registry_invoicePositionTable_tableView.refresh();
            this.RFE.set(true);
            EXF.getInstance().ICE("Deleted invoice element, current number of elements: " + this.fxml_registry_invoicePositionTable_tableView.getItems().size());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleHyperlink_NIPcheck(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Hypelink clicked");
         (new EVN() {
            public void HZI() {
               EXF.getInstance().ICO();

               try {
                  Desktop.getDesktop().browse(new URI(QUW.this.fxml_hyperlink_nipCheckPage.getText()));
               } catch (IOException var6) {
                  EXF.getInstance().ICA((Throwable)var6);
               } catch (URISyntaxException var7) {
                  EXF.getInstance().ICA((Throwable)var7);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         }).start();
      } catch (Exception var6) {
         EXF.getInstance().ICA((Throwable)var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_goToEditScreenButton(ActionEvent var1) {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var1;
      try {
         this.fxml_include_invoicingDate_boxController.IFP();
         ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getItems().clear();
         ((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).setValue(null);
         ((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).getItems().clear();
         ((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).setValue(null);
         this.fxml_include_ContractorName_boxController.HAS = false;
         this.fxml_include_nip_boxController.HAS = false;
         var1 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public void HJJ() {
      EXF.getInstance().ICO();

      try {
         BigDecimal var1 = BigDecimal.ZERO;
         BigDecimal var2 = BigDecimal.ZERO;
         BigDecimal var3 = BigDecimal.ZERO;
         Iterator var4 = this.REZ.getInvoiceElements().iterator();

         while(var4.hasNext()) {
            HP var5 = (HP)var4.next();
            if (var5.DBK().getValue() != null) {
               var1 = var1.add((BigDecimal)var5.DBK().getValue());
            }

            if (var5.DBL().getValue() != null) {
               var2 = var2.add((BigDecimal)var5.DBL().getValue());
            }

            if (var5.DBM().getValue() != null) {
               var3 = var3.add((BigDecimal)var5.DBM().getValue());
            }
         }

         this.REZ.DAW().setValue(var1);
         this.REZ.DAX().setValue(var2);
         this.REZ.DAV().setValue(var3);
         this.RJY();
         this.fxml_summary_values_tableView.refresh();
      } finally {
         EXF.getInstance().ICP();
      }
   }

   protected abstract void RJY();

   public void RJZ(HR var1) {
      EXF.getInstance().ICO();

      try {
         if (var1 != null) {
            this.HHD(((TextFieldValidated_Text)this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element).textProperty(), var1.DAS().DDG());
            ((DatePickerRequired)this.fxml_include_eventDate_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DAU().DEC());
            ((DatePickerRequired)this.fxml_include_issueDate_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DAT().DEC());
            ((DatePickerRequired)this.fxml_include_receiptDate_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DBR().DEC());
            ((DatePickerRequired)this.fxml_include_invoicingDate_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DAF().DDL());
            ((DatePickerRequired)this.fxml_include_invoicingDate_boxController.fxml_component_main_element).valueProperty().unbindBidirectional(var1.DBS().DEC());
            HI var2 = var1.DBQ();
            this.HHD(((ComboBoxValidated_ContractorName)this.fxml_include_ContractorName_boxController.fxml_component_main_element).getEditor().textProperty(), var2.DAI().DDG());
            this.HHD(((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getEditor().textProperty(), var2.DAJ().DDG());
            this.HHD(((ComboBoxValidated_NIP)this.fxml_include_nip_boxController.fxml_component_main_element).getEditor().textProperty(), var1.DAR().DDG());
            JJ var3 = var2.DAM();
            this.HHD(((TextFieldValidated_Text)this.fxml_include_Street_boxController.fxml_component_main_element).textProperty(), var3.DDA().DDG());
            this.HHD(((TextFieldValidated_Text)this.fxml_include_HouseNumber_boxController.fxml_component_main_element).textProperty(), var3.DDB().DDG());
            this.HHD(((TextFieldValidated_Text)this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element).textProperty(), var3.DDC().DDG());
            this.HHD(((TextFieldValidated_PostalCode)this.fxml_include_PostalCode_boxController.fxml_component_main_element).textProperty(), var3.DDD().DDG());
            this.HHD(((TextFieldValidated_Text)this.fxml_include_City_boxController.fxml_component_main_element).textProperty(), var3.DCZ().DDG());
            if (this.RFG != null) {
               this.fxml_registry_invoicePositionTable_tableView.getItems().removeListener(this.RFG);
               this.RFG = null;
            }

            this.fxml_registry_invoicePositionTable_tableView.itemsProperty().unbindBidirectional(var1.DBT());
            this.fxml_registry_invoicePositionTable_tableView.getItems().clear();
            this.fxml_summary_values_tableView.getItems().clear();
            this.RFD.unbind();
            this.fxml_registry_invoicePositionTable_tableView.refresh();
            this.fxml_summary_values_tableView.refresh();
         }

         this.REZ = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void RKA() {
      this.fxml_include_invoiceRefNumber_boxController.clearChangedProperty();
      this.fxml_include_eventDate_boxController.clearChangedProperty();
      this.fxml_include_issueDate_boxController.clearChangedProperty();
      this.fxml_include_receiptDate_boxController.clearChangedProperty();
      this.fxml_include_ContractorName_boxController.clearChangedProperty();
      this.fxml_include_nip_boxController.clearChangedProperty();
      this.fxml_include_Street_boxController.clearChangedProperty();
      this.fxml_include_HouseNumber_boxController.clearChangedProperty();
      this.fxml_include_ApartmentNumber_boxController.clearChangedProperty();
      this.fxml_include_PostalCode_boxController.clearChangedProperty();
      this.fxml_include_City_boxController.clearChangedProperty();
      this.fxml_include_invoicingDate_boxController.clearChangedProperty();
      this.RFE.set(false);
   }

   protected class QUX implements ListChangeListener<HP> {
      public QUX() {
      }

      public void onChanged(ListChangeListener.Change<? extends HP> var1) {
         EXF.getInstance().ICO();

         try {
            if (var1 != null) {
               QUW.this.HJJ();
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }
}
