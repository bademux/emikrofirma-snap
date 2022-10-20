package a.a.a.c.c.e.d.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.d.a.QUW;
import a.a.a.c.c.d.e.EOT;
import a.a.a.c.c.e.d.a.g.QTJ;
import a.a.a.c.c.e.d.c.ESX;
import a.a.a.c.d.e.QRX;
import a.a.a.c.d.e.QRY;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.e.HP;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.KM;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.c.c.ComboBoxRequired;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Iterator;

public class ESU extends QUW {
    private ChangeListener<Toggle> RAK;
    @FXML
    public TableColumn<HP, Object> fxml_registry_itemName_tableColumn;
    @FXML
    public TableColumn<HP, Object> fxml_registry_quantity_tableColumn;
    @FXML
    public TableColumn<HP, Object> fxml_registry_measurementUnit_tableColumn;
    @FXML
    public TableColumn<HP, Object> fxml_registry_unitValue_tableColumn;
    @FXML
    public TableColumn<HP, Object> fxml_registry_vatRate_tableColumn;
    @FXML
    public ToggleGroup calculation_method_radio_group;
    @FXML
    public HBox fxml_invoice_purchase_hbox_radio;
    @FXML
    public RadioButton fxml_radio_button_net;
    @FXML
    public RadioButton fxml_radio_button_gross;
    private ESX GFB;

    public ESU(EMC var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {

        super.initialize();
        this.fxml_registry_itemName_tableColumn.setCellValueFactory(new PropertyValueFactory("name"));
        this.fxml_registry_quantity_tableColumn.setCellValueFactory(new PropertyValueFactory("quantity"));
        this.fxml_registry_measurementUnit_tableColumn.setCellValueFactory(new PropertyValueFactory("unit"));
        this.fxml_registry_netTotalValue_tableColumn.setCellValueFactory(new PropertyValueFactory("netPriceForAll"));
        this.fxml_registry_vatRate_tableColumn.setCellValueFactory(new PropertyValueFactory("taxRate"));
        this.fxml_registry_vatValue_tableColumn.setCellValueFactory(new PropertyValueFactory("taxValueForAll"));
        this.fxml_registry_deductHalf_tableColumn.setCellValueFactory(new PropertyValueFactory("taxDeduction50P"));
        this.fxml_registry_grossValue_tableColumn.setCellValueFactory(new PropertyValueFactory("grossValueForAll"));
        this.fxml_registry_taxReason_tableColumn.setCellValueFactory(new PropertyValueFactory("taxReason"));
        this.fxml_registry_itemName_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_quantity_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_measurementUnit_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_unitValue_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_netTotalValue_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_vatRate_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_vatValue_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_deductHalf_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_grossValue_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_registry_taxReason_tableColumn.setCellFactory(new EOT(this, true));
        this.fxml_summary_totalNetValue_tableColumn.setCellValueFactory(new PropertyValueFactory("amountSummaryWithoutTax"));
        this.fxml_summary_totalVatValue_tableColumn.setCellValueFactory(new PropertyValueFactory("amountTax"));
        this.fxml_summary_totalGrossValue_tableColumn.setCellValueFactory(new PropertyValueFactory("amountSummaryWithTax"));
        this.fxml_summary_totalNetValue_tableColumn.setCellFactory(new EOT(this, false));
        this.fxml_summary_totalVatValue_tableColumn.setCellFactory(new EOT(this, false));
        this.fxml_summary_totalGrossValue_tableColumn.setCellFactory(new EOT(this, false));
        this.calculation_method_radio_group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> var1, Toggle var2, Toggle var3) {
                if (ESU.this.calculation_method_radio_group.getSelectedToggle() != null) {
                    String var4 = ESU.this.calculation_method_radio_group.getSelectedToggle().getUserData().toString();
                    ESU.this.REZ.RIE().setValue(QSV.valueOf(var4));
                    ESU.this.RKR(var4);
                }

            }
        });
        this.fxml_invoice_purchase_hbox_radio.disableProperty().bind(this.RFA);

    }

    public void HTV(HR var1) {

        this.REZ = var1;
        if (var1 != null) {
            this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DAS().DDG());
            this.fxml_include_eventDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(var1.DAU().DEC());
            this.fxml_include_issueDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(var1.DAT().DEC());
            this.fxml_include_receiptDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(var1.DBR().DEC());
            this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(var1.DAF().DDL());
            this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(var1.DBS().DEC());
            HI var2 = var1.DBQ();
            this.fxml_include_ContractorName_boxController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var2.DAI().DDG());
            this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAR().DDG());
            this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var2.DAJ().DDG());
            JJ var3 = var2.DAM();
            this.fxml_include_Street_boxController.fxml_component_main_element.textProperty().bindBidirectional(var3.DDA().DDG());
            this.fxml_include_HouseNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(var3.DDB().DDG());
            this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(var3.DDC().DDG());
            this.fxml_include_PostalCode_boxController.fxml_component_main_element.textProperty().bindBidirectional(var3.DDD().DDG());
            this.fxml_include_City_boxController.fxml_component_main_element.textProperty().bindBidirectional(var3.DCZ().DDG());
            this.fxml_summary_values_tableView.getItems().add(var1);
            this.fxml_registry_invoicePositionTable_tableView.itemsProperty().bindBidirectional(var1.DBT());
            this.RFG = new QUW.QUX();
            this.fxml_registry_invoicePositionTable_tableView.getItems().addListener(this.RFG);
            this.RFD.bind(this.fxml_registry_invoicePositionTable_tableView.itemsProperty());
            if (var1.RIE().getValue() == null) {
                var1.RIE().setValue(QSV.NET);
            }

            String var4 = var1.RIE().getValue().toString();
            if (this.fxml_registry_unitValue_tableColumn != null) {
                if (var4.equals("NET")) {
                    this.fxml_registry_unitValue_tableColumn.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
                } else if (var4.equals("GROSS")) {
                    this.fxml_registry_unitValue_tableColumn.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
                }

                this.fxml_registry_unitValue_tableColumn.setText(this.resources.getString("micro.process.invoice_purchase_new.RegistryTable_unitValue_" + var4));
                this.RKQ(this.calculation_method_radio_group, var4);
            }

            this.RAK = new QTJ(this);
            this.calculation_method_radio_group.selectedToggleProperty().addListener(this.RAK);
            this.fxml_summary_values_tableView.refresh();
            this.fxml_registry_invoicePositionTable_tableView.refresh();
        }

        this.RKA();

    }

    public void RKP() {

        this.calculation_method_radio_group.selectedToggleProperty().removeListener(this.RAK);
        this.RAK = null;

    }

    private void RKQ(ToggleGroup var1, String var2) {
        Iterator var3 = var1.getToggles().iterator();

        while (var3.hasNext()) {
            Toggle var4 = (Toggle) var3.next();
            if (((RadioButton) var4).getUserData().toString().equals(var2)) {
                var4.setSelected(true);
            }
        }

    }

    public void RKR(String var1) {
        if (var1.equals("NET")) {
            this.fxml_registry_unitValue_tableColumn.setCellValueFactory(null);
            this.fxml_registry_unitValue_tableColumn.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
        } else if (var1.equals("GROSS")) {
            this.fxml_registry_unitValue_tableColumn.setCellValueFactory(null);
            this.fxml_registry_unitValue_tableColumn.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
        }

        this.fxml_registry_unitValue_tableColumn.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementPrice_" + var1));
        this.fxml_summary_values_tableView.refresh();
        this.fxml_registry_invoicePositionTable_tableView.refresh();
    }

    public void RKS(String var1) {
        HP var3;
        for (Iterator var2 = this.REZ.getInvoiceElements().iterator(); var2.hasNext(); this.RJV(null, var3, null)) {
            var3 = (HP) var2.next();
            if (var1.equals("NET")) {
                var3.DBI().setValue(var3.RIF().getValue());
            } else if (var1.equals("GROSS")) {
                var3.RIF().setValue(var3.DBI().getValue());
            }
        }

        this.HJJ();
    }

    @FXML
    protected void fxml_handleButton_registry_addNewInvoicePosition(ActionEvent var1) {

        try {
            if (this.REZ != null) {
                FXMLLoader var2 = new FXMLLoader();
                var2.setLocation(ESU.class.getResource("/fxml/invoicePurchaseNewLogic_addNewPosition.fxml"));
                var2.setResources(this.resources);
                AnchorPane var3 = var2.load();
                Stage var4 = new Stage();
                var4.setTitle(this.resources.getString("micro.process.invoice_purchase_addNewPosition.Header"));
                var4.initModality(Modality.WINDOW_MODAL);
                var4.initOwner(this.FGW);
                var4.setResizable(false);
                var4.getIcons().add(new Image("/img/app/e_logo.png"));
                Scene var5 = new Scene(var3);
                var4.setScene(var5);
                ESM var6 = var2.getController();
                var6.setDialogStage(var4);
                var6.setCalculationMethod(this.calculation_method_radio_group.getSelectedToggle().getUserData().toString());
                var6.setupDefaults(this.resources);
                var6.setProductAutocomplete(this.GFB);
                var4.showAndWait();
                if (var6.getResult()) {
                    HP var7 = new HP();
                    var7.DBE().setValue((String) ((ComboBoxRequired) var6.fxml_include_itemNameRequiredTextBox_boxController.fxml_component_main_element).getValue());
                    var7.DBE().setMaxLength(var6.fxml_include_itemNameRequiredTextBox_boxController.fxml_component_root_element.getMaxLength());
                    var7.DBG().setValue(var6.fxml_include_quantityNumberBox_boxController.fxml_component_main_element.getNumber());
                    var7.DBG().setAllowNegative(var6.fxml_include_quantityNumberBox_boxController.fxml_component_main_element.IFG());
                    var7.DBG().setScale(var6.fxml_include_quantityNumberBox_boxController.fxml_component_main_element.getMaxLength());
                    var7.DBG().setPresicion(var6.fxml_include_quantityNumberBox_boxController.fxml_component_main_element.getMaximumFractionDigits());
                    var7.DBH().setValue(var6.fxml_include_measurementUnitRequiredTextBox_boxController.fxml_component_main_element.getText());
                    var7.DBH().setMaxLength(var6.fxml_include_measurementUnitRequiredTextBox_boxController.fxml_component_root_element.getMaxLength());
                    var7.DBN().setValue((KL) ((ComboBoxRequired) var6.fxml_include_taxRateRequiredComboBox_boxController.fxml_component_main_element).getValue());
                    var7.DBI().setValue(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.getNumber());
                    var7.DBI().setAllowNegative(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.IFG());
                    var7.DBI().setScale(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.getMaxLength());
                    var7.DBI().setPresicion(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.getMaximumFractionDigits());
                    var7.RIF().setValue(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.getNumber());
                    var7.RIF().setAllowNegative(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.IFG());
                    var7.RIF().setScale(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.getMaxLength());
                    var7.RIF().setPresicion(var6.fxml_include_netUnitValueNumberBox_boxController.fxml_component_main_element.getMaximumFractionDigits());
                    var7.DBO().setValue(var6.fxml_include_deductHalfLabeledCheckBox_boxController.fxml_component_main_element.isSelected());
                    var7.DBP().setValue((KM) ((ComboBoxRequired) var6.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getValue());
                    this.RJV(null, var7, null);
                    this.fxml_registry_invoicePositionTable_tableView.getItems().add(var7);
                    this.fxml_registry_invoicePositionTable_tableView.refresh();
                    org.slf4j.LoggerFactory.getLogger(getClass()).info("Added new invoice element, current number of elements: " + this.fxml_registry_invoicePositionTable_tableView.getItems().size());
                }
            }
        } catch (IOException var11) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
            throw new FFI(var11);
        }

    }

    public void HHC() {

        this.fxml_include_nip_boxController.setContractorGetter(this.GFB);
        this.fxml_include_nip_boxController.setContractorSetter(this);
        this.fxml_include_ContractorName_boxController.setContractorGetter(this.GFB);
        this.fxml_include_ContractorName_boxController.setContractorSetter(this);

    }

    public boolean HHB() {

        boolean var1;
        this.fxml_include_invoicingDate_boxController.IFP();
        this.fxml_include_nip_boxController.fxml_component_main_element.getItems().clear();
        this.fxml_include_nip_boxController.fxml_component_main_element.setValue(null);
        this.fxml_include_ContractorName_boxController.fxml_component_main_element.getItems().clear();
        this.fxml_include_ContractorName_boxController.fxml_component_main_element.setValue(null);
        this.fxml_include_ContractorName_boxController.HAS = false;
        this.fxml_include_nip_boxController.HAS = false;
        this.RKP();
        var1 = true;

        return var1;
    }

    public void setProcessImplementation(ESX var1) {

        this.GFB = var1;

    }

    public boolean RJW(JN var1, KE var2, KA var3) {

        boolean var4;
        if (this.GFB == null) {
            var4 = false;
            return var4;
        }

        var4 = this.GFB.HUC(var1, var2, var3);

        return var4;
    }

    public boolean RJX(JN var1) {

        boolean var2;
        if (this.GFB == null) {
            var2 = false;
            return var2;
        }

        var2 = this.GFB.HUD(var1);

        return var2;
    }

    public void RJV(HO var1, HO var2, QSV var3) {

        var3 = QSV.valueOf(this.calculation_method_radio_group.getSelectedToggle().getUserData().toString());
        QRX var4 = QRY.getInvoiceCalculationMethod(var3, false);
        var4.RIB(var1, var2);
        this.RFE.set(true);
        this.fxml_summary_values_tableView.refresh();
        this.fxml_registry_invoicePositionTable_tableView.refresh();

    }

    protected void RJY() {

        this.RFF.set(false);
        boolean var1 = true;
        if (this.REZ.getInvoiceElements() != null) {
            Iterator var2 = this.REZ.getInvoiceElements().iterator();

            while (var2.hasNext()) {
                HO var3 = (HO) var2.next();
                HP var4 = (HP) var3;
                if (var4.DBE().getValue() != null && var4.DBE().getValue().trim().length() != 0) {
                    if (var4.DBH().getValue() != null && var4.DBH().getValue().trim().length() != 0) {
                        if (var4.DBG().getValue() == null) {
                            var1 = false;
                            break;
                        }

                        if (var4.DBN().getValue() == null) {
                            var1 = false;
                            break;
                        }

                        if (var4.DBI().getValue() == null) {
                            var1 = false;
                            break;
                        }

                        if (var4.DBK().getValue() == null) {
                            var1 = false;
                            break;
                        }

                        if (var4.DBM().getValue() == null) {
                            var1 = false;
                            break;
                        }

                        if (var4.DBL().getValue() == null) {
                            var1 = false;
                            break;
                        }

                        if (var4.DBP().getValue() == null) {
                            var1 = false;
                            break;
                        }
                        continue;
                    }

                    var1 = false;
                    break;
                }

                var1 = false;
                break;
            }

            this.RFF.set(var1);
        }

    }
}
