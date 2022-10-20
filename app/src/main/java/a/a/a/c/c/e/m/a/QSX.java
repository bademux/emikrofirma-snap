package a.a.a.c.c.e.m.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.d.a.QUW;
import a.a.a.c.c.d.e.EOT;
import a.a.a.c.c.e.m.c.QTB;
import a.a.a.c.d.e.b.QRZ;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.e.HP;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.KM;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.c.c.ComboBoxRequired;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Iterator;

public class QSX extends QUW {
    private QTB QZB;

    public QSX(FXApp var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {
        super.initialize();
        this.fxml_registry_netTotalValue_tableColumn.setCellValueFactory(new PropertyValueFactory("netPriceForAll"));
        this.fxml_registry_vatValue_tableColumn.setCellValueFactory(new PropertyValueFactory("taxValueForAll"));
        this.fxml_registry_deductHalf_tableColumn.setCellValueFactory(new PropertyValueFactory("taxDeduction50P"));
        this.fxml_registry_grossValue_tableColumn.setCellValueFactory(new PropertyValueFactory("grossValueForAll"));
        this.fxml_registry_taxReason_tableColumn.setCellValueFactory(new PropertyValueFactory("taxReason"));
        this.fxml_registry_netTotalValue_tableColumn.setCellFactory(new EOT(this, true));
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

    }

    public void RKB(HR var1) {

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
            this.fxml_summary_values_tableView.refresh();
            this.fxml_registry_invoicePositionTable_tableView.refresh();
        }

        this.RKA();

    }

    @FXML
    protected void fxml_handleButton_registry_addNewAggreagatePosition(ActionEvent var1) {

        try {
            if (this.REZ != null) {
                FXMLLoader var2 = new FXMLLoader();
                var2.setLocation(QSX.class.getResource("/fxml/aggregatePurchaseNewLogic_addNewPosition.fxml"));
                var2.setResources(this.resources);
                AnchorPane var3 = var2.load();
                Stage var4 = new Stage();
                var4.setTitle(this.resources.getString("micro.process.invoice_purchase_addNewPosition.Header"));
                var4.initModality(Modality.WINDOW_MODAL);
                var4.initOwner(this.primaryStage);
                var4.setResizable(false);
                var4.getIcons().add(new Image("/img/app/e_logo.png"));
                Scene var5 = new Scene(var3);
                var4.setScene(var5);
                QSY var6 = var2.getController();
                var6.setDialogStage(var4);
                var6.setupDefaults(this.resources);
                var4.showAndWait();
                if (var6.getResult()) {
                    HP var7 = new HP();
                    var7.setNetPriceForAll(new JR(var6.fxml_include_netValueNumberBox_boxController.fxml_component_main_element.getNumber()));
                    var7.setTaxValueForAll(new JR(var6.fxml_include_taxValueNumberBox_boxController.fxml_component_main_element.getNumber()));
                    var7.setGrossValueForAll(new JR(var6.fxml_include_netValueNumberBox_boxController.fxml_component_main_element.getNumber().add(var6.fxml_include_taxValueNumberBox_boxController.fxml_component_main_element.getNumber())));
                    var7.DBO().setValue(var6.fxml_include_deductHalfLabeledCheckBox_boxController.fxml_component_main_element.isSelected());
                    var7.DBP().setValue((KM) ((ComboBoxRequired) var6.fxml_include_taxReasonRequiredComboBox_boxController.fxml_component_main_element).getValue());
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

        this.fxml_include_nip_boxController.setContractorGetter(this.QZB);
        this.fxml_include_nip_boxController.setContractorSetter(this);
        this.fxml_include_ContractorName_boxController.setContractorGetter(this.QZB);
        this.fxml_include_ContractorName_boxController.setContractorSetter(this);

    }

    public void setProcessImplementation(QTB var1) {

        this.QZB = var1;

    }

    public boolean RJW(JN var1, KE var2, KA var3) {

        boolean var4;
        if (this.QZB == null) {
            var4 = false;
            return var4;
        }

        var4 = this.QZB.RKF(var1, var2, var3);

        return var4;
    }

    public boolean RJX(JN var1) {

        boolean var2;
        if (this.QZB != null) {
            var2 = this.QZB.RKG(var1);
            return var2;
        }

        var2 = false;

        return var2;
    }

    public void RJV(HO var1, HO var2, QSV var3) {

        QRZ var4 = new QRZ();
        var4.RIB(var1, var2);
        this.RFE.set(true);

    }

    protected void RJY() {

        this.RFF.set(false);
        boolean var1 = true;
        if (this.REZ.getInvoiceElements() != null) {
            Iterator var2 = this.REZ.getInvoiceElements().iterator();

            while (var2.hasNext()) {
                HO var3 = (HO) var2.next();
                HP var4 = (HP) var3;
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
            }

            this.RFF.set(var1);
        }

    }
}
