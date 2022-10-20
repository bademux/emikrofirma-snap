package a.a.a.c.c.d.a;

import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.d.o.*;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.e.InvoiceElement;
import a.a.a.c.f.a.e.InvoiceElementPurchase;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.RefId;
import com.github.bademux.emk.app.FXApp;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.ResourceBundle;

public abstract class QUW extends BaseFxController implements EMO<InvoiceElement>, EYR {
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
    public TableView<InvoiceElementPurchase> fxml_registry_invoicePositionTable_tableView;
    @FXML
    public TableColumn<InvoiceElementPurchase, Object> fxml_registry_netTotalValue_tableColumn;
    @FXML
    public TableColumn<InvoiceElementPurchase, Object> fxml_registry_vatValue_tableColumn;
    @FXML
    public TableColumn<InvoiceElementPurchase, Object> fxml_registry_deductHalf_tableColumn;
    @FXML
    public TableColumn<InvoiceElementPurchase, Object> fxml_registry_grossValue_tableColumn;
    @FXML
    public TableColumn<InvoiceElementPurchase, Object> fxml_registry_taxReason_tableColumn;
    @FXML
    protected TableView<InvoicePurchase> fxml_summary_values_tableView;
    @FXML
    protected TableColumn<InvoicePurchase, Object> fxml_summary_totalNetValue_tableColumn;
    @FXML
    protected TableColumn<InvoicePurchase, Object> fxml_summary_totalVatValue_tableColumn;
    @FXML
    protected TableColumn<InvoicePurchase, Object> fxml_summary_totalGrossValue_tableColumn;
    @FXML
    public Button fxml_registry_addRowButton;
    @FXML
    public Button fxml_registry_deleteRowButton;
    protected InvoicePurchase REZ;
    @FXML
    public Node fxml_inner_parent;
    public BooleanProperty RFA = new SimpleBooleanProperty(this, "readOnlyPropertyHolder", false);
    public BooleanProperty RFB = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
    public BooleanProperty RFC = new SimpleBooleanProperty(this, "requiredAndValidPropertyHolder", false);
    protected ListProperty<InvoiceElementPurchase> RFD = new SimpleListProperty();
    public BooleanProperty RFE = new SimpleBooleanProperty(this, "invoicePositionTableChangedPropertyHolder", false);
    public BooleanProperty RFF = new SimpleBooleanProperty(false);
    protected QUX RFG;
    @FXML
    Hyperlink fxml_hyperlink_nipCheckPage;

    public QUW(FXApp var1, String var2) {
        super(var1, var2);
    }

    public abstract boolean RJW(Period var1, RefId var2, KA var3);

    public abstract boolean RJX(Period var1);

    public InvoicePurchase getCurrentPurchase() {
        return this.REZ;
    }

    public ResourceBundle getResources() {
        return this.resources;
    }

    public void HJK() {
        this.fxml_inner_parent.requestFocus();
    }

    public void setContractorFromAutocomplete(QJW var1) {

        if (var1 != null) {
            Contractor var2 = var1.getContractor().AICD();
            String var3 = this.resources.getString("micro.process.general.nip.null");
            if (!var3.equalsIgnoreCase(var2.DAJ().getValue())) {
                this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().setText(var2.getNip().getValue());
                this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().positionCaret(this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().getText().length());
            } else {
                this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().setText("");
            }

            this.fxml_include_ContractorName_boxController.fxml_component_main_element.getEditor().setText(var2.getName().getValue());
            this.fxml_include_ContractorName_boxController.fxml_component_main_element.getEditor().positionCaret(this.fxml_include_ContractorName_boxController.fxml_component_main_element.getEditor().getText().length());
            JJ var4 = var2.DAM();
            this.fxml_include_Street_boxController.fxml_component_main_element.setText(var4.getStreet().getValue());
            this.fxml_include_HouseNumber_boxController.fxml_component_main_element.setText(var4.getHouseNumber().getValue());
            this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.setText(var4.getApartmentNumber().getValue());
            this.fxml_include_PostalCode_boxController.fxml_component_main_element.setText(var4.getPostalCode().getValue());
            this.fxml_include_City_boxController.fxml_component_main_element.setText(var4.getCity().getValue());
        }

    }

    protected void initialize() {

        this.RFB.bind(this.fxml_include_invoiceRefNumber_boxController.changedProperty().or(this.fxml_include_eventDate_boxController.changedProperty().or(this.fxml_include_issueDate_boxController.changedProperty().or(this.fxml_include_receiptDate_boxController.changedProperty().or(this.fxml_include_ContractorName_boxController.changedProperty().or(this.fxml_include_nip_boxController.changedProperty().or(this.fxml_include_Street_boxController.changedProperty().or(this.fxml_include_HouseNumber_boxController.changedProperty().or(this.fxml_include_ApartmentNumber_boxController.changedProperty().or(this.fxml_include_PostalCode_boxController.changedProperty().or(this.fxml_include_City_boxController.changedProperty().or(this.fxml_include_invoicingDate_boxController.changedProperty().or(this.RFE)))))))))))));
        this.RFC.bind(this.fxml_include_invoiceRefNumber_boxController.requiredAndValidProperty().and(this.fxml_include_eventDate_boxController.requiredAndValidProperty().and(this.fxml_include_issueDate_boxController.requiredAndValidProperty().and(this.fxml_include_receiptDate_boxController.requiredAndValidProperty().and(this.fxml_include_ContractorName_boxController.requiredAndValidProperty().and(this.fxml_include_nip_boxController.requiredAndValidProperty().and(this.fxml_include_Street_boxController.requiredAndValidProperty().and(this.fxml_include_HouseNumber_boxController.requiredAndValidProperty().and(this.fxml_include_ApartmentNumber_boxController.requiredAndValidProperty().and(this.fxml_include_PostalCode_boxController.requiredAndValidProperty().and(this.fxml_include_City_boxController.requiredAndValidProperty().and(this.fxml_include_invoicingDate_boxController.requiredAndValidProperty().and(this.RFD.emptyProperty().not().and(this.RFF))))))))))))));
        this.fxml_include_eventDate_boxController.fxml_component_main_element.editableProperty().set(false);
        this.fxml_include_issueDate_boxController.fxml_component_main_element.editableProperty().set(false);
        this.fxml_include_receiptDate_boxController.fxml_component_main_element.editableProperty().set(false);
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.editableProperty().set(false);
        this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.editableProperty().bind(this.RFA.not());
        this.fxml_include_eventDate_boxController.fxml_component_main_element.disableProperty().bind(this.RFA);
        this.fxml_include_issueDate_boxController.fxml_component_main_element.disableProperty().bind(this.RFA);
        this.fxml_include_receiptDate_boxController.fxml_component_main_element.disableProperty().bind(this.RFA);
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.disableProperty().bind(this.RFA);
        this.fxml_include_ContractorName_boxController.fxml_component_main_element.disableProperty().bind(this.RFA);
        this.fxml_include_nip_boxController.fxml_component_main_element.disableProperty().bind(this.RFA);
        this.fxml_include_Street_boxController.fxml_component_main_element.editableProperty().bind(this.RFA.not());
        this.fxml_include_HouseNumber_boxController.fxml_component_main_element.editableProperty().bind(this.RFA.not());
        this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.editableProperty().bind(this.RFA.not());
        this.fxml_include_PostalCode_boxController.fxml_component_main_element.editableProperty().bind(this.RFA.not());
        this.fxml_include_City_boxController.fxml_component_main_element.editableProperty().bind(this.RFA.not());
        this.fxml_summary_values_tableView.editableProperty().bind(this.RFA.not());
        this.fxml_registry_invoicePositionTable_tableView.editableProperty().bind(this.RFA.not());
        this.fxml_registry_addRowButton.disableProperty().bind(this.RFA);
        this.fxml_registry_deleteRowButton.disableProperty().bind(this.RFA.or(this.fxml_registry_invoicePositionTable_tableView.getSelectionModel().selectedItemProperty().isNull()));
        this.fxml_registry_invoicePositionTable_tableView.setFixedCellSize(32.0);
        this.fxml_registry_invoicePositionTable_tableView.prefHeightProperty().bind(this.fxml_registry_invoicePositionTable_tableView.fixedCellSizeProperty().multiply(Bindings.size(this.RFD).add(2.5)));
        this.fxml_registry_invoicePositionTable_tableView.minHeightProperty().bind(this.fxml_registry_invoicePositionTable_tableView.prefHeightProperty());
        this.fxml_registry_invoicePositionTable_tableView.maxHeightProperty().bind(this.fxml_registry_invoicePositionTable_tableView.prefHeightProperty());
        this.fxml_include_invoiceRefNumber_boxController.fxml_component_validation_element_external.setText(this.getResources().getString("micro.process.invoice_purchase_new.refid.duplicate"));
        this.fxml_include_issueDate_boxController.fxml_component_main_element.valueProperty().addListener(new QVD(this.RFA, this.fxml_include_eventDate_boxController.fxml_component_main_element, this.fxml_include_receiptDate_boxController.fxml_component_main_element, this.fxml_include_invoicingDate_boxController.fxml_component_main_element));
        this.fxml_include_eventDate_boxController.fxml_component_main_element.valueProperty().addListener(new ROU());
        this.fxml_include_receiptDate_boxController.fxml_component_main_element.valueProperty().addListener(new ROV());
        this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.textProperty().addListener(new QVG(this, this.RFA, this.fxml_include_invoiceRefNumber_boxController, this.fxml_include_invoicingDate_boxController, this.fxml_include_nip_boxController));
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().addListener(new QVF(this, this.RFA, this.fxml_include_invoiceRefNumber_boxController, this.fxml_include_invoicingDate_boxController, this.fxml_include_nip_boxController));
        this.fxml_include_nip_boxController.fxml_component_main_element.IEU().addListener(new QVE(this, this.RFA, this.fxml_include_invoiceRefNumber_boxController, this.fxml_include_invoicingDate_boxController, this.fxml_include_nip_boxController));

    }

    @FXML
    protected void fxml_handleButton_registry_deleteInvoicePosition(ActionEvent var1) {

        int var2 = this.fxml_registry_invoicePositionTable_tableView.getSelectionModel().getSelectedIndex();
        if (var2 >= 0) {
            this.fxml_registry_invoicePositionTable_tableView.getItems().remove(var2);
            this.fxml_registry_invoicePositionTable_tableView.refresh();
            this.RFE.set(true);
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Deleted invoice element, current number of elements: " + this.fxml_registry_invoicePositionTable_tableView.getItems().size());
        }

    }

    @FXML
    protected void fxml_handleHyperlink_NIPcheck(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Hypelink clicked");
            (new EVN() {
                public void HZI() {

                    try {
                        Desktop.getDesktop().browse(new URI(QUW.this.fxml_hyperlink_nipCheckPage.getText()));
                    } catch (IOException var6) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    } catch (URISyntaxException var7) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                    }

                }
            }).start();
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
        }

    }

    @FXML
    protected void fxml_handleButton_goToEditScreenButton(ActionEvent var1) {

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
        var1 = true;

        return var1;
    }

    public void HJJ() {

        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;
        Iterator var4 = this.REZ.getInvoiceElements().iterator();

        while (var4.hasNext()) {
            InvoiceElementPurchase var5 = (InvoiceElementPurchase) var4.next();
            if (var5.DBK().getValue() != null) {
                var1 = var1.add(var5.DBK().getValue());
            }

            if (var5.DBL().getValue() != null) {
                var2 = var2.add(var5.DBL().getValue());
            }

            if (var5.DBM().getValue() != null) {
                var3 = var3.add(var5.DBM().getValue());
            }
        }

        this.REZ.DAW().setValue(var1);
        this.REZ.DAX().setValue(var2);
        this.REZ.DAV().setValue(var3);
        this.RJY();
        this.fxml_summary_values_tableView.refresh();
    }

    protected abstract void RJY();

    public void RJZ(InvoicePurchase var1) {

        if (var1 != null) {
            this.HHD(this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.textProperty(), var1.DAS().DDG());
            this.fxml_include_eventDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(var1.DAU().DEC());
            this.fxml_include_issueDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(var1.DAT().DEC());
            this.fxml_include_receiptDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(var1.DBR().DEC());
            this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(var1.DAF().DDL());
            this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(var1.DBS().DEC());
            Contractor var2 = var1.DBQ();
            this.HHD(this.fxml_include_ContractorName_boxController.fxml_component_main_element.getEditor().textProperty(), var2.DAI().DDG());
            this.HHD(this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().textProperty(), var2.DAJ().DDG());
            this.HHD(this.fxml_include_nip_boxController.fxml_component_main_element.getEditor().textProperty(), var1.DAR().DDG());
            JJ var3 = var2.DAM();
            this.HHD(this.fxml_include_Street_boxController.fxml_component_main_element.textProperty(), var3.DDA().DDG());
            this.HHD(this.fxml_include_HouseNumber_boxController.fxml_component_main_element.textProperty(), var3.DDB().DDG());
            this.HHD(this.fxml_include_ApartmentNumber_boxController.fxml_component_main_element.textProperty(), var3.DDC().DDG());
            this.HHD(this.fxml_include_PostalCode_boxController.fxml_component_main_element.textProperty(), var3.DDD().DDG());
            this.HHD(this.fxml_include_City_boxController.fxml_component_main_element.textProperty(), var3.DCZ().DDG());
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

    protected class QUX implements ListChangeListener<InvoiceElementPurchase> {
        public QUX() {
        }

        public void onChanged(ListChangeListener.Change<? extends InvoiceElementPurchase> var1) {

            if (var1 != null) {
                QUW.this.HJJ();
            }

        }
    }
}
