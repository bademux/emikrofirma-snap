package a.a.a.c.c.e.p.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.e.EOT;
import a.a.a.c.c.e.p.a.a.QTY;
import a.a.a.c.c.e.p.a.a.QTZ;
import a.a.a.c.c.e.p.a.a.QUA;
import a.a.a.c.c.e.p.a.a.ROS;
import a.a.a.c.c.e.p.c.QUD;
import a.a.a.c.d.e.b.QSC;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.TitledContractor;
import a.a.a.c.f.a.n.InvoiceOtherElementPurchase;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.b.a.Address;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.TaxRate;
import a.a.a.c.f.b.c.a.CalculationMethodType;
import a.a.a.c.f.c.c.ComboBoxRequired;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class QTW extends BaseFxController implements EMO<InvoiceOtherElementPurchase>, EYR {
    public QUD RBV;
    private InvoiceOtherPurchase RBW;
    @FXML
    private EYQ fxml_include_invoiceRefNumber_boxController;
    @FXML
    private EZD fxml_include_issueDate_boxController;
    @FXML
    public EZD fxml_include_invoicingDate_boxController;
    @FXML
    private Hyperlink fxml_hyperlink_nipCheckPage;
    @FXML
    private EYS fxml_purchase_contractor_nameController;
    @FXML
    private EZO fxml_purchase_contractor_nipController;
    @FXML
    private EZG fxml_purchase_contractor_streetController;
    @FXML
    private EZG fxml_purchase_contractor_house_numberController;
    @FXML
    private EZG fxml_purchase_contractor_apartment_numberController;
    @FXML
    private EZL fxml_purchase_contractor_postal_codeController;
    @FXML
    private EZG fxml_purchase_contractor_cityController;
    @FXML
    private EZP<InvoiceOtherSubtype> fxml_other_purchase_new_other_element_typeController;
    @FXML
    private Label fxml_other_purchase_other_elements_name;
    @FXML
    private TableView<InvoiceOtherElementPurchase> fxml_other_purchase_elements_table;
    @FXML
    private TableColumn<InvoiceOtherElementPurchase, Object> fxml_other_purchase_elements_table_column_tax_type;
    @FXML
    private TableColumn<InvoiceOtherElementPurchase, Object> fxml_other_purchase_elements_table_column_sum_net_price;
    @FXML
    private TableColumn<InvoiceOtherElementPurchase, Object> fxml_other_purchase_elements_table_column_sum_tax;
    @FXML
    private TableColumn<InvoiceOtherElementPurchase, Object> fxml_other_purchase_elements_table_column_sum_brut_price;
    @FXML
    private TableView<InvoiceOtherPurchase> fxml_other_purchase_summary_summary_table;
    @FXML
    private TableColumn<InvoiceOtherPurchase, Object> fxml_other_purchase_summary_summary_table_column_name;
    @FXML
    private TableColumn<InvoiceOtherPurchase, Object> fxml_other_purchase_summary_summary_table_column_sum_netto;
    @FXML
    private TableColumn<InvoiceOtherPurchase, Object> fxml_other_purchase_summary_summary_table_column_sum_tax;
    @FXML
    private TableColumn<InvoiceOtherPurchase, Object> fxml_other_purchase_summary_summary_table_column_sum_brut;
    @FXML
    private Button fxml_other_purchase_button_add_new_other_position;
    @FXML
    private Button fxml_other_purchase_button_add_delete_other_position;
    @FXML
    private EZK fxml_other_purchase_remarksController;
    @FXML
    private Node fxml_inner_parent;
    public ObjectProperty<Period> RBX = new SimpleObjectProperty();
    public BooleanProperty RBY = new SimpleBooleanProperty(false);
    public BooleanProperty RBZ = new SimpleBooleanProperty(false);
    public BooleanProperty RCA = new SimpleBooleanProperty(false);
    BooleanProperty RCB = new SimpleBooleanProperty(false);
    BooleanProperty RCC = new SimpleBooleanProperty(false);
    private final BooleanProperty RCD = new SimpleBooleanProperty(false);
    private final BooleanProperty RCE = new SimpleBooleanProperty(false);
    private final BooleanProperty RCF = new SimpleBooleanProperty(false);
    private final ListProperty<InvoiceOtherElementPurchase> RCG = new SimpleListProperty();
    private final BooleanProperty RCH = new SimpleBooleanProperty(false);
    private final BooleanProperty RCI = new SimpleBooleanProperty(false);
    private QTY RCJ;

    public QTW(FXApp var1, String var2) {
        super(var1, var2);
    }

    @FXML
    public void initialize() {

        this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.editableProperty().bind(this.RBY);
        this.fxml_include_issueDate_boxController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_nameController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_nipController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_streetController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_house_numberController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_apartment_numberController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_postal_codeController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_purchase_contractor_cityController.fxml_component_main_element.disableProperty().bind(this.RBY.not());
        this.fxml_other_purchase_elements_table.disableProperty().bind(this.RBY.not());
        this.fxml_other_purchase_remarksController.fxml_component_main_element.editableProperty().bind(this.RBY);
        this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element.disableProperty().bind(this.RBY.not().or(this.RCD));
        this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element.setCellFactory(new EOQ());
        this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getCellFactory().call(null));
        ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.PURCHASE_REASON_1);
        ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.PURCHASE_REASON_2);
        ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.PURCHASE_REASON_3);
        ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.PURCHASE_REASON_4);
        this.fxml_other_purchase_button_add_new_other_position.disableProperty().bind(((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).valueProperty().isNull().or(this.RBY.not()));
        this.fxml_other_purchase_button_add_delete_other_position.disableProperty().bind(this.fxml_other_purchase_elements_table.getSelectionModel().selectedItemProperty().isNull().or(this.RBY.not()));
        this.fxml_other_purchase_elements_table_column_tax_type.setCellValueFactory(new PropertyValueFactory("taxRate"));
        this.fxml_other_purchase_elements_table_column_sum_net_price.setCellValueFactory(new PropertyValueFactory("netPriceForAll"));
        this.fxml_other_purchase_elements_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("taxValueForAll"));
        this.fxml_other_purchase_elements_table_column_sum_brut_price.setCellValueFactory(new PropertyValueFactory("grossValueForAll"));
        LinkedHashSet var1 = new LinkedHashSet();
        var1.add(TaxRate.RATE_23);
        var1.add(TaxRate.RATE_8);
        var1.add(TaxRate.RATE_5);
        var1.add(TaxRate.RATE_4);
        EOT var2 = new EOT(this, true, var1);
        this.fxml_other_purchase_elements_table_column_tax_type.setCellFactory(var2);
        this.fxml_other_purchase_elements_table_column_sum_net_price.setCellFactory(new EOT(this, true));
        this.fxml_other_purchase_elements_table_column_sum_tax.setCellFactory(new EOT(this, true));
        this.fxml_other_purchase_elements_table_column_sum_brut_price.setCellFactory(new EOT(this, true));
        this.fxml_other_purchase_summary_summary_table_column_sum_netto.setCellValueFactory(new PropertyValueFactory("amountSummaryWithoutTax"));
        this.fxml_other_purchase_summary_summary_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("amountTax"));
        this.fxml_other_purchase_summary_summary_table_column_sum_brut.setCellValueFactory(new PropertyValueFactory("amountSummaryWithTax"));
        this.fxml_other_purchase_summary_summary_table_column_sum_netto.setCellFactory(new EOT(this, false));
        this.fxml_other_purchase_summary_summary_table_column_sum_tax.setCellFactory(new EOT(this, false));
        this.fxml_other_purchase_summary_summary_table_column_sum_brut.setCellFactory(new EOT(this, false));
        ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).valueProperty().addListener(new QTZ(this));
        this.RCH.bind(this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().textProperty().isNotNull().and(this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().textProperty().isNotEqualTo("")).or(this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().textProperty().isNotNull().and(this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().textProperty().isNotEqualTo("")).or(this.fxml_purchase_contractor_streetController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_purchase_contractor_streetController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_purchase_contractor_house_numberController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_purchase_contractor_house_numberController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_purchase_contractor_apartment_numberController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_purchase_contractor_apartment_numberController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_purchase_contractor_postal_codeController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_purchase_contractor_postal_codeController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_purchase_contractor_cityController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_purchase_contractor_cityController.fxml_component_main_element.textProperty().isNotEqualTo("")))))))));
        this.fxml_purchase_contractor_nameController.fxml_component_root_element.requiredProperty().bind(this.RCH);
        this.fxml_purchase_contractor_nipController.fxml_component_root_element.requiredProperty().bind(this.RCH);
        this.fxml_purchase_contractor_streetController.fxml_component_root_element.requiredProperty().bind(this.RCH);
        this.fxml_purchase_contractor_house_numberController.fxml_component_root_element.requiredProperty().bind(this.RCH);
        this.fxml_purchase_contractor_postal_codeController.fxml_component_root_element.requiredProperty().bind(this.RCH);
        this.fxml_purchase_contractor_cityController.fxml_component_root_element.requiredProperty().bind(this.RCH);
        this.RCI.bind(this.fxml_purchase_contractor_nameController.validProperty().and(this.fxml_purchase_contractor_nipController.validProperty().and(this.fxml_purchase_contractor_streetController.validProperty().and(this.fxml_purchase_contractor_house_numberController.validProperty().and(this.fxml_purchase_contractor_postal_codeController.validProperty().and(this.fxml_purchase_contractor_cityController.validProperty()))))));
        this.RCA.bind(this.fxml_purchase_contractor_nameController.changedProperty().or(this.fxml_purchase_contractor_nipController.changedProperty().or(this.fxml_purchase_contractor_streetController.changedProperty().or(this.fxml_purchase_contractor_house_numberController.changedProperty().or(this.fxml_purchase_contractor_apartment_numberController.changedProperty().or(this.fxml_purchase_contractor_postal_codeController.changedProperty().or(this.fxml_purchase_contractor_cityController.changedProperty())))))));
        this.RCB.bind(this.RCI.or(this.RCH.not()).and(this.fxml_include_invoiceRefNumber_boxController.requiredAndValidProperty()).and(this.fxml_include_issueDate_boxController.requiredAndValidProperty().and(this.fxml_include_invoicingDate_boxController.requiredAndValidProperty().and(this.RCF))));
        this.RCC.bind(this.fxml_include_invoiceRefNumber_boxController.changedProperty().or(this.fxml_include_issueDate_boxController.changedProperty().or(this.fxml_include_invoicingDate_boxController.changedProperty().or(this.fxml_purchase_contractor_nameController.changedProperty().or(this.fxml_purchase_contractor_nipController.changedProperty().or(this.fxml_purchase_contractor_streetController.changedProperty().or(this.fxml_purchase_contractor_house_numberController.changedProperty().or(this.fxml_purchase_contractor_apartment_numberController.changedProperty().or(this.fxml_purchase_contractor_postal_codeController.changedProperty().or(this.fxml_purchase_contractor_cityController.changedProperty().or(this.fxml_other_purchase_new_other_element_typeController.changedProperty().or(this.fxml_other_purchase_remarksController.changedProperty().or(this.RCE)))))))))))));
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().addListener(new QUA(this));
        this.fxml_include_issueDate_boxController.fxml_component_main_element.valueProperty().addListener(new ROS());
        this.fxml_other_purchase_elements_table.setFixedCellSize(32.0);
        this.fxml_other_purchase_elements_table.prefHeightProperty().bind(this.fxml_other_purchase_elements_table.fixedCellSizeProperty().multiply(Bindings.size(this.RCG).add(2.5)));
        this.fxml_other_purchase_elements_table.minHeightProperty().bind(this.fxml_other_purchase_elements_table.prefHeightProperty());
        this.fxml_other_purchase_elements_table.maxHeightProperty().bind(this.fxml_other_purchase_elements_table.prefHeightProperty());

    }

    private void RMB() {

        this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.textProperty().bindBidirectional(this.RBW.RIR().DDG());
        this.fxml_other_purchase_elements_table.itemsProperty().bindBidirectional(this.RBW.RJP());
        this.fxml_other_purchase_summary_summary_table.getItems().add(this.RBW);
        this.fxml_other_purchase_summary_summary_table.refresh();
        this.RCJ = new QTY(this);
        this.fxml_other_purchase_elements_table.getItems().addListener(this.RCJ);
        this.RMD();
        this.fxml_include_issueDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(this.RBW.RIS().DEC());
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().bindBidirectional(this.RBW.RJO().DEC());
        this.fxml_other_purchase_remarksController.fxml_component_main_element.textProperty().bindBidirectional(this.RBW.RJA().DDG());
        this.RBX.bindBidirectional(this.RBW.DAF().DDM());
        this.RCG.bind(this.fxml_other_purchase_elements_table.itemsProperty());
        this.fxml_other_purchase_summary_summary_table.refresh();

    }

    private void RMC() {

        this.fxml_other_purchase_elements_table.getItems().removeListener(this.RCJ);
        this.RCJ = null;
        this.HHD(this.fxml_include_invoiceRefNumber_boxController.fxml_component_main_element.textProperty(), this.RBW.RIR().DDG());
        this.fxml_other_purchase_elements_table.itemsProperty().unbindBidirectional(this.RBW.RJP());
        this.fxml_other_purchase_elements_table.getItems().clear();
        this.fxml_other_purchase_summary_summary_table.getItems().clear();
        this.fxml_other_purchase_elements_table.refresh();
        this.RME();
        this.fxml_include_issueDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(this.RBW.RIS().DEC());
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.valueProperty().unbindBidirectional(this.RBW.RJO().DEC());
        this.HHD(this.fxml_other_purchase_remarksController.fxml_component_main_element.textProperty(), this.RBW.RJA().DDG());
        this.RBX.unbindBidirectional(this.RBW.DAF().DDM());
        this.RCG.unbind();

    }

    private void RMD() {

        Contractor var1 = this.RBW.RJM();
        this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAI().DDG());
        this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAJ().DDG());
        Address var2 = var1.DAM();
        this.fxml_purchase_contractor_streetController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDA().DDG());
        this.fxml_purchase_contractor_house_numberController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDB().DDG());
        this.fxml_purchase_contractor_apartment_numberController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDC().DDG());
        this.fxml_purchase_contractor_postal_codeController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDD().DDG());
        this.fxml_purchase_contractor_cityController.fxml_component_main_element.textProperty().bindBidirectional(var2.DCZ().DDG());

    }

    private void RME() {

        Contractor var1 = this.RBW.RJM();
        this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().textProperty().unbindBidirectional(var1.DAI().DDG());
        this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().textProperty().unbindBidirectional(var1.DAJ().DDG());
        Address var2 = var1.DAM();
        this.fxml_purchase_contractor_streetController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDA().DDG());
        this.fxml_purchase_contractor_house_numberController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDB().DDG());
        this.fxml_purchase_contractor_apartment_numberController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDC().DDG());
        this.fxml_purchase_contractor_postal_codeController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDD().DDG());
        this.fxml_purchase_contractor_cityController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DCZ().DDG());

    }

    private void RMF() {

        this.fxml_include_invoiceRefNumber_boxController.clearChangedProperty();
        this.fxml_include_issueDate_boxController.clearChangedProperty();
        this.fxml_include_invoicingDate_boxController.clearChangedProperty();
        this.fxml_purchase_contractor_nameController.clearChangedProperty();
        this.fxml_purchase_contractor_nipController.clearChangedProperty();
        this.fxml_purchase_contractor_streetController.clearChangedProperty();
        this.fxml_purchase_contractor_house_numberController.clearChangedProperty();
        this.fxml_purchase_contractor_apartment_numberController.clearChangedProperty();
        this.fxml_purchase_contractor_postal_codeController.clearChangedProperty();
        this.fxml_purchase_contractor_cityController.clearChangedProperty();
        this.fxml_other_purchase_new_other_element_typeController.clearChangedProperty();
        this.fxml_other_purchase_remarksController.clearChangedProperty();
        this.RCE.set(false);

    }

    public boolean HHB() {
        this.RMC();
        this.RMH();
        this.RBW = null;
        return true;
    }

    public void HHC() {
        this.fxml_purchase_contractor_nipController.setContractorGetter(this.RBV);
        this.fxml_purchase_contractor_nipController.setContractorSetter(this);
        this.fxml_purchase_contractor_nameController.setContractorGetter(this.RBV);
        this.fxml_purchase_contractor_nameController.setContractorSetter(this);
        this.RMB();
        if (!this.RBZ.get() && this.RBY.get()) {
            this.setDefault();
        }

        if (this.RBY.get()) {
            this.RMG();
        }

        this.RMI();
        this.RMF();
    }

    private void RMG() {

        this.fxml_include_invoicingDate_boxController.IFN(this.RBV.getRangesWhereSettled(this.resources.getString("micro.process.other_purchase_new.Tooltip.SettledPeriod")));

    }

    private void RMH() {

        this.fxml_purchase_contractor_nipController.fxml_component_main_element.getItems().clear();
        this.fxml_purchase_contractor_nipController.fxml_component_main_element.setValue(null);
        this.fxml_purchase_contractor_nameController.fxml_component_main_element.getItems().clear();
        this.fxml_purchase_contractor_nameController.fxml_component_main_element.setValue(null);
        this.fxml_purchase_contractor_nameController.HAS = false;
        this.fxml_purchase_contractor_nipController.HAS = false;
        this.fxml_include_invoicingDate_boxController.IFP();

    }

    private void setDefault() {

        this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element.setValue(null);
        this.fxml_include_issueDate_boxController.fxml_component_main_element.setValue(LocalDate.now());
        this.fxml_include_invoicingDate_boxController.fxml_component_main_element.setValue(LocalDate.now());

    }

    public void setInvoiceOther(InvoiceOtherPurchase var1) {
        this.RBW = var1;
    }

    public void setContractorFromAutocomplete(TitledContractor var1) {

        if (var1 != null) {
            Contractor var2 = var1.getContractor().AICD();
            String var3 = this.resources.getString("micro.process.general.nip.null");
            if (!var3.equalsIgnoreCase(var2.DAJ().getValue())) {
                this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().setText(var2.getNip().getValue());
                this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().positionCaret(this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().getText().length());
            } else {
                this.fxml_purchase_contractor_nipController.fxml_component_main_element.getEditor().setText("");
            }

            this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().setText(var2.getName().getValue());
            this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().positionCaret(this.fxml_purchase_contractor_nameController.fxml_component_main_element.getEditor().getText().length());
            Address var4 = var2.DAM();
            this.fxml_purchase_contractor_streetController.fxml_component_main_element.setText(var4.getStreet().getValue());
            this.fxml_purchase_contractor_house_numberController.fxml_component_main_element.setText(var4.getHouseNumber().getValue());
            this.fxml_purchase_contractor_apartment_numberController.fxml_component_main_element.setText(var4.getApartmentNumber().getValue());
            this.fxml_purchase_contractor_postal_codeController.fxml_component_main_element.setText(var4.getPostalCode().getValue());
            this.fxml_purchase_contractor_cityController.fxml_component_main_element.setText(var4.getCity().getValue());
        }

    }

    public void RMI() {

        if (this.fxml_other_purchase_elements_table.getItems().size() > 0) {
            this.RCF.set(true);
            this.setModeChangeDisable(true);
        } else {
            this.RCF.set(false);
            this.setModeChangeDisable(false);
        }

    }

    public void setModeChangeDisable(boolean var1) {

        this.RCD.set(var1);

    }

    public void RJV(InvoiceOtherElementPurchase var1, InvoiceOtherElementPurchase var2, CalculationMethodType var3) {
        if (var2.getNetPriceForAll().getValue() != null && var2.getTaxRate().getValue() != null) {
            QSC var4 = new QSC();
            var4.RIB(var1, var2);
        }

        this.RCE.set(true);
        this.fxml_other_purchase_elements_table.refresh();
    }

    public void HJJ() {

        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;
        this.RCE.set(true);
        Iterator var4 = this.RBW.getInvoiceOtherElements().iterator();

        while (var4.hasNext()) {
            InvoiceOtherElementPurchase var5 = (InvoiceOtherElementPurchase) var4.next();
            if (var5.RJE().getValue() != null) {
                var1 = var1.add(var5.RJE().getValue());
            }

            if (var5.RJF().getValue() != null) {
                var2 = var2.add(var5.RJF().getValue());
            }

            if (var5.RJG().getValue() != null) {
                var3 = var3.add(var5.RJG().getValue());
            }
        }

        this.RBW.RIU().setValue(var1);
        this.RBW.RIV().setValue(var2);
        this.RBW.RIT().setValue(var3);
        this.fxml_other_purchase_summary_summary_table.refresh();
    }

    public void HJK() {
        this.fxml_inner_parent.requestFocus();
    }

    @FXML
    private void fxml_handleButton_other_purchase_new_add_new_element(ActionEvent var1) {

        try {
            FXMLLoader var2 = new FXMLLoader();
            var2.setLocation(QTV.class.getResource("/fxml/invoice_other_purchase_new_add_element.fxml"));
            var2.setResources(this.resources);
            AnchorPane var3 = var2.load();
            Stage var4 = new Stage();
            var4.setTitle(this.resources.getString("micro.process.other_purchase_new.DialogAddNewOtherElement.DialogName"));
            var4.initModality(Modality.WINDOW_MODAL);
            var4.initOwner(this.primaryStage);
            var4.setResizable(false);
            Scene var5 = new Scene(var3);
            var4.setScene(var5);
            QTX var6 = var2.getController();
            var6.setDialogStage(var4);
            var6.setOtherType((InvoiceOtherSubtype) ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getValue());
            var6.RMM();
            var6.getDialogStage().getIcons().add(new Image("/img/app/e_logo.png"));
            var6.getDialogStage().showAndWait();
            this.RMJ(var6);
        } catch (IOException var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            throw new FFI(var10);
        }

    }

    @FXML
    private void fxml_handleButton_other_purchase_new_delete_element(ActionEvent var1) {

        int var2 = this.fxml_other_purchase_elements_table.getSelectionModel().getSelectedIndex();
        if (var2 >= 0) {
            this.fxml_other_purchase_elements_table.getItems().remove(var2);
            this.fxml_other_purchase_elements_table.refresh();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Deleted invoice element, current number of elements: " + this.fxml_other_purchase_elements_table.getItems().size());
        }

    }

    @FXML
    protected void fxml_handleHyperlink_NIPcheck(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Hypelink clicked");
            (new EVN() {
                public void HZI() {

                    try {
                        Desktop.getDesktop().browse(new URI(QTW.this.fxml_hyperlink_nipCheckPage.getText()));
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

    public void RMJ(QTX var1) {
        if (var1.RMN()) {
            InvoiceOtherElementPurchase var2 = new InvoiceOtherElementPurchase();
            var2.RJE().setValue(var1.fxml_other_purchase_new_add_other_element_netController.fxml_component_main_element.getNumber());
            var2.RJE().setAllowNegative(var1.fxml_other_purchase_new_add_other_element_netController.fxml_component_main_element.IFG());
            var2.RJE().setAllowOnlyNegative(var1.fxml_other_purchase_new_add_other_element_netController.fxml_component_main_element.RHT());
            var2.RJE().setScale(var1.fxml_other_purchase_new_add_other_element_netController.fxml_component_main_element.getMaxLength());
            var2.RJE().setPresicion(var1.fxml_other_purchase_new_add_other_element_netController.fxml_component_main_element.getMaximumFractionDigits());
            var2.RJH().setValue((TaxRate) ((ComboBoxRequired) var1.fxml_other_purchase_new_add_other_element_tax_typeController.fxml_component_main_element).getValue());
            var2.RJF().setValue(var1.fxml_other_purchase_new_add_other_element_taxController.fxml_component_main_element.getNumber());
            var2.RJF().setAllowOnlyNegative(var1.fxml_other_purchase_new_add_other_element_taxController.fxml_component_main_element.RHT());
            var2.RJF().setAllowNegative(var1.fxml_other_purchase_new_add_other_element_taxController.fxml_component_main_element.IFG());
            var2.RJF().setScale(var1.fxml_other_purchase_new_add_other_element_taxController.fxml_component_main_element.getMaxLength());
            var2.RJF().setPresicion(var1.fxml_other_purchase_new_add_other_element_taxController.fxml_component_main_element.getMaximumFractionDigits());
            this.RJV(null, var2, CalculationMethodType.NET);
            this.fxml_other_purchase_elements_table.getItems().add(var2);
            this.fxml_other_purchase_elements_table.refresh();
            this.HJJ();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Added new invoice element, current number of elements: " + this.fxml_other_purchase_elements_table.getItems().size());
        }

    }

    public void setProcessImplementation(QUD var1) {

        this.RBV = var1;

    }

    public void RMK() {

        if (((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getValue() != null) {
            switch ((InvoiceOtherSubtype) ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getValue()) {
                case PURCHASE_REASON_1:
                case PURCHASE_REASON_2:
                    this.fxml_include_issueDate_boxController.fxml_component_root_element.setRequired(true);
                    this.fxml_other_purchase_elements_table_column_tax_type.setEditable(false);
                    this.fxml_other_purchase_elements_table_column_sum_net_price.setEditable(false);
                    this.fxml_other_purchase_elements_table_column_sum_tax.setEditable(true);
                    this.fxml_other_purchase_elements_table_column_sum_brut_price.setEditable(false);
                    break;
                case PURCHASE_REASON_3:
                case PURCHASE_REASON_4:
                    this.fxml_include_issueDate_boxController.fxml_component_root_element.setRequired(false);
                    this.fxml_other_purchase_elements_table_column_tax_type.setEditable(false);
                    this.fxml_other_purchase_elements_table_column_sum_net_price.setEditable(false);
                    this.fxml_other_purchase_elements_table_column_sum_tax.setEditable(true);
                    this.fxml_other_purchase_elements_table_column_sum_brut_price.setEditable(false);
            }
        }

    }

    public InvoiceOtherSubtype RML() {
        return (InvoiceOtherSubtype) ((ComboBoxRequired) this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element).getValue();
    }

    public void setInvoiceOtherSubType(InvoiceOtherSubtype var1) {
        this.fxml_other_purchase_new_other_element_typeController.fxml_component_main_element.setValue(var1);
    }
}
