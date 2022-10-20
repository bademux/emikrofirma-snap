package a.a.a.c.c.e.r.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.e.EOT;
import a.a.a.c.c.d.g.Mode;
import a.a.a.c.c.e.r.a.a.QUP;
import a.a.a.c.c.e.r.a.a.QUQ;
import a.a.a.c.c.e.r.a.a.QUR;
import a.a.a.c.c.e.r.a.a.ROT;
import a.a.a.c.c.e.r.c.QUU;
import a.a.a.c.d.e.b.QSC;
import a.a.a.c.d.g.ERF;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.c.TitledContractor;
import a.a.a.c.f.a.n.InvoiceOtherElementSell;
import a.a.a.c.f.a.n.InvoiceOtherSell;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.b.a.Address;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.TaxRate;
import a.a.a.c.f.b.c.a.CalculationMethodType;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.QJZ;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.g.ConfigurationProperty;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class QUN extends BaseFxController implements EMO<InvoiceOtherElementSell>, EYR {
    public QUU RDU;
    ERF RDV = new ERF(false, 2, 2);
    private InvoiceOtherSell RDW;
    @FXML
    private EYQ fxml_other_sale_ref_idController;
    @FXML
    private EZD fxml_other_sale_creation_dateController;
    @FXML
    public EZD fxml_other_sale_invoicing_dateController;
    @FXML
    private EYS fxml_sale_contractor_nameController;
    @FXML
    private EZO fxml_sale_contractor_nipController;
    @FXML
    private EZG fxml_sale_contractor_streetController;
    @FXML
    private EZG fxml_sale_contractor_house_numberController;
    @FXML
    private EZG fxml_sale_contractor_apartment_numberController;
    @FXML
    private EZL fxml_sale_contractor_postal_codeController;
    @FXML
    private EZG fxml_sale_contractor_cityController;
    @FXML
    private EZP<InvoiceOtherSubtype> fxml_other_sale_new_other_element_typeController;
    @FXML
    public TableView<InvoiceOtherElementSell> fxml_other_sale_elements_table;
    @FXML
    public TableColumn<InvoiceOtherElementSell, Object> fxml_other_sale_elements_table_column_tax_type;
    @FXML
    public TableColumn<InvoiceOtherElementSell, Object> fxml_other_sale_elements_table_column_sum_net_price;
    @FXML
    public TableColumn<InvoiceOtherElementSell, Object> fxml_other_sale_elements_table_column_sum_tax;
    @FXML
    public TableColumn<InvoiceOtherElementSell, Object> fxml_other_sale_elements_table_column_sum_brut_price;
    @FXML
    TableView<InvoiceOtherSell> fxml_other_sale_summary_summary_table;
    @FXML
    TableColumn<InvoiceOtherSell, Object> fxml_other_sale_summary_summary_table_column_name;
    @FXML
    TableColumn<InvoiceOtherSell, Object> fxml_other_sale_summary_summary_table_column_sum_netto;
    @FXML
    TableColumn<InvoiceOtherSell, Object> fxml_other_sale_summary_summary_table_column_sum_tax;
    @FXML
    TableColumn<InvoiceOtherSell, Object> fxml_other_sale_summary_summary_table_column_sum_brut;
    @FXML
    private Button fxml_other_sale_button_add_new_other_position;
    @FXML
    private Button fxml_other_sale_button_add_delete_other_position;
    @FXML
    public EZK fxml_other_sale_remarksController;
    @FXML
    Node fxml_inner_parent;
    public BooleanProperty RDX = new SimpleBooleanProperty(false);
    private final BooleanProperty RDY = new SimpleBooleanProperty(false);
    public ObjectProperty<Period> RDZ = new SimpleObjectProperty();
    public BooleanProperty REA = new SimpleBooleanProperty(false);
    public BooleanProperty REB = new SimpleBooleanProperty(false);
    private final BooleanProperty REC = new SimpleBooleanProperty(false);
    public BooleanProperty RED = new SimpleBooleanProperty(false);
    public BooleanProperty REE = new SimpleBooleanProperty(false);
    public BooleanProperty REF = new SimpleBooleanProperty(false);
    public BooleanProperty REG = new SimpleBooleanProperty(false);
    private Mode REH;
    private final ListProperty<InvoiceOtherElementSell> REI = new SimpleListProperty();
    private QUP REJ;

    public QUN(FXApp var1, String var2) {
        super(var1, var2);
    }

    @FXML
    public void initialize() {

        this.fxml_other_sale_ref_idController.fxml_component_main_element.editableProperty().bind(this.REA);
        this.fxml_other_sale_creation_dateController.fxml_component_main_element.disableProperty().bind(this.REA.not());
        this.fxml_other_sale_invoicing_dateController.fxml_component_main_element.disableProperty().bind(this.REA.not());
        this.fxml_sale_contractor_nameController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_sale_contractor_nipController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_sale_contractor_streetController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_sale_contractor_house_numberController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_sale_contractor_cityController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REF));
        this.fxml_other_sale_elements_table.disableProperty().bind(this.REA.not());
        this.fxml_other_sale_remarksController.fxml_component_main_element.editableProperty().bind(this.REA);
        this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element.disableProperty().bind(this.REA.not().or(this.REC));
        this.fxml_other_sale_button_add_new_other_position.disableProperty().bind(((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).valueProperty().isNull().or(this.REA.not()));
        this.fxml_other_sale_button_add_delete_other_position.disableProperty().bind(this.fxml_other_sale_elements_table.getSelectionModel().selectedItemProperty().isNull().or(this.REA.not()));
        this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element.setCellFactory(new EOQ());
        this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getCellFactory().call(null));
        ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.SELL_REASON_1);
        ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.SELL_REASON_2);
        ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.SELL_REASON_3);
        ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getItems().add(InvoiceOtherSubtype.SELL_REASON_4);
        this.fxml_other_sale_elements_table_column_tax_type.setCellValueFactory(new PropertyValueFactory("taxRate"));
        this.fxml_other_sale_elements_table_column_sum_net_price.setCellValueFactory(new PropertyValueFactory("netPriceForAll"));
        this.fxml_other_sale_elements_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("taxValueForAll"));
        this.fxml_other_sale_elements_table_column_sum_brut_price.setCellValueFactory(new PropertyValueFactory("grossValueForAll"));
        LinkedHashSet var1 = new LinkedHashSet();
        var1.add(TaxRate.RATE_23);
        var1.add(TaxRate.RATE_8);
        var1.add(TaxRate.RATE_5);
        var1.add(TaxRate.RATE_4);
        EOT var2 = new EOT(this, true, var1);
        this.fxml_other_sale_elements_table_column_tax_type.setCellFactory(var2);
        this.fxml_other_sale_elements_table_column_sum_net_price.setCellFactory(new EOT(this, true));
        this.fxml_other_sale_elements_table_column_sum_tax.setCellFactory(new EOT(this, true));
        this.fxml_other_sale_elements_table_column_sum_brut_price.setCellFactory(new EOT(this, true));
        this.fxml_other_sale_summary_summary_table_column_sum_netto.setCellValueFactory(new PropertyValueFactory("amountSummaryWithoutTax"));
        this.fxml_other_sale_summary_summary_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("amountTax"));
        this.fxml_other_sale_summary_summary_table_column_sum_brut.setCellValueFactory(new PropertyValueFactory("amountSummaryWithTax"));
        this.fxml_other_sale_summary_summary_table_column_sum_netto.setCellFactory(new EOT(this, false));
        this.fxml_other_sale_summary_summary_table_column_sum_tax.setCellFactory(new EOT(this, false));
        this.fxml_other_sale_summary_summary_table_column_sum_brut.setCellFactory(new EOT(this, false));
        ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).valueProperty().addListener(new QUQ(this));
        BooleanBinding var3 = this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().textProperty().isNotNull().and(this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().textProperty().isNotEqualTo("")).or(this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty().isNotNull().and(this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty().isNotEqualTo("")).or(this.fxml_sale_contractor_streetController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_sale_contractor_streetController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_sale_contractor_house_numberController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_sale_contractor_house_numberController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.textProperty().isNotEqualTo("")).or(this.fxml_sale_contractor_cityController.fxml_component_main_element.textProperty().isNotNull().and(this.fxml_sale_contractor_cityController.fxml_component_main_element.textProperty().isNotEqualTo(""))))))));
        this.fxml_sale_contractor_nameController.fxml_component_root_element.requiredProperty().bind(var3);
        this.fxml_sale_contractor_nipController.fxml_component_root_element.requiredProperty().bind(var3);
        this.fxml_sale_contractor_streetController.fxml_component_root_element.requiredProperty().bind(var3);
        this.fxml_sale_contractor_house_numberController.fxml_component_root_element.requiredProperty().bind(var3);
        this.fxml_sale_contractor_postal_codeController.fxml_component_root_element.requiredProperty().bind(var3);
        this.fxml_sale_contractor_cityController.fxml_component_root_element.requiredProperty().bind(var3);
        BooleanBinding var4 = this.fxml_sale_contractor_nameController.validProperty().and(this.fxml_sale_contractor_nipController.validProperty().and(this.fxml_sale_contractor_streetController.validProperty().and(this.fxml_sale_contractor_house_numberController.validProperty().and(this.fxml_sale_contractor_postal_codeController.validProperty().and(this.fxml_sale_contractor_cityController.validProperty())))));
        this.RDX.bind(var4.or(var3.not()).and(this.fxml_other_sale_invoicing_dateController.requiredAndValidProperty()).and(this.fxml_other_sale_creation_dateController.requiredAndValidProperty().and(this.fxml_other_sale_ref_idController.requiredAndValidProperty().and(this.RDY))));
        this.RED.bind(this.fxml_other_sale_ref_idController.changedProperty().or(this.fxml_other_sale_creation_dateController.changedProperty().or(this.fxml_other_sale_invoicing_dateController.changedProperty().or(this.fxml_sale_contractor_nameController.changedProperty().or(this.fxml_sale_contractor_nipController.changedProperty().or(this.fxml_sale_contractor_streetController.changedProperty().or(this.fxml_sale_contractor_house_numberController.changedProperty().or(this.fxml_sale_contractor_apartment_numberController.changedProperty().or(this.fxml_sale_contractor_postal_codeController.changedProperty().or(this.fxml_sale_contractor_cityController.changedProperty().or(this.fxml_other_sale_new_other_element_typeController.changedProperty().or(this.fxml_other_sale_remarksController.changedProperty().or(this.REE)))))))))))));
        this.REG.bind(this.fxml_sale_contractor_nameController.changedProperty().or(this.fxml_sale_contractor_nipController.changedProperty().or(this.fxml_sale_contractor_streetController.changedProperty().or(this.fxml_sale_contractor_house_numberController.changedProperty().or(this.fxml_sale_contractor_apartment_numberController.changedProperty().or(this.fxml_sale_contractor_postal_codeController.changedProperty().or(this.fxml_sale_contractor_cityController.changedProperty())))))));
        this.fxml_other_sale_invoicing_dateController.fxml_component_main_element.valueProperty().addListener(new QUR(this));
        this.fxml_other_sale_creation_dateController.fxml_component_main_element.valueProperty().addListener(new ROT());
        this.fxml_other_sale_elements_table.setFixedCellSize(32.0);
        this.fxml_other_sale_elements_table.prefHeightProperty().bind(this.fxml_other_sale_elements_table.fixedCellSizeProperty().multiply(Bindings.size(this.REI).add(2.5)));
        this.fxml_other_sale_elements_table.minHeightProperty().bind(this.fxml_other_sale_elements_table.prefHeightProperty());
        this.fxml_other_sale_elements_table.maxHeightProperty().bind(this.fxml_other_sale_elements_table.prefHeightProperty());

    }

    private void RNL() {

        this.fxml_other_sale_ref_idController.fxml_component_main_element.textProperty().bindBidirectional(this.RDW.RIR().DDG());
        this.fxml_other_sale_elements_table.itemsProperty().bindBidirectional(this.RDW.RJR());
        this.REJ = new QUP(this);
        this.fxml_other_sale_elements_table.getItems().addListener(this.REJ);
        this.fxml_other_sale_summary_summary_table.getItems().add(this.RDW);
        this.fxml_other_sale_summary_summary_table.refresh();
        this.fxml_other_sale_creation_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.RDW.RIS().DEC());
        this.fxml_other_sale_invoicing_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.RDW.RJQ().DEC());
        this.RNO();
        this.fxml_other_sale_remarksController.fxml_component_main_element.textProperty().bindBidirectional(this.RDW.RJA().DDG());
        this.RDZ.bindBidirectional(this.RDW.DAF().DDM());
        this.REI.bind(this.fxml_other_sale_elements_table.itemsProperty());
        this.fxml_other_sale_summary_summary_table.refresh();

    }

    private void RNM() {

        this.HHD(this.fxml_other_sale_ref_idController.fxml_component_main_element.textProperty(), this.RDW.RIR().DDG());
        this.fxml_other_sale_elements_table.getItems().removeListener(this.REJ);
        this.REJ = null;
        this.fxml_other_sale_elements_table.itemsProperty().unbindBidirectional(this.RDW.RJR());
        this.fxml_other_sale_elements_table.getItems().clear();
        this.fxml_other_sale_elements_table.refresh();
        this.fxml_other_sale_summary_summary_table.getItems().clear();
        this.fxml_other_sale_creation_dateController.fxml_component_main_element.valueProperty().unbindBidirectional(this.RDW.RIS().DEC());
        this.fxml_other_sale_invoicing_dateController.fxml_component_main_element.valueProperty().unbindBidirectional(this.RDW.RJQ().DEC());
        this.RNN();
        this.HHD(this.fxml_other_sale_remarksController.fxml_component_main_element.textProperty(), this.RDW.RJA().DDG());
        this.RDZ.unbindBidirectional(this.RDW.DAF().DDM());
        this.REI.unbind();

    }

    private void RNN() {

        Contractor var1 = this.RDW.RJS();
        this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().textProperty().unbindBidirectional(var1.DAI().DDG());
        this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty().unbindBidirectional(var1.DAJ().DDG());
        Address var2 = var1.DAM();
        this.fxml_sale_contractor_streetController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDA().DDG());
        this.fxml_sale_contractor_house_numberController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDB().DDG());
        this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDC().DDG());
        this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DDD().DDG());
        this.fxml_sale_contractor_cityController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DCZ().DDG());

    }

    private void RNO() {

        Contractor var1 = this.RDW.RJS();
        this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAI().DDG());
        this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAJ().DDG());
        Address var2 = var1.DAM();
        this.fxml_sale_contractor_streetController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDA().DDG());
        this.fxml_sale_contractor_house_numberController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDB().DDG());
        this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDC().DDG());
        this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.textProperty().bindBidirectional(var2.DDD().DDG());
        this.fxml_sale_contractor_cityController.fxml_component_main_element.textProperty().bindBidirectional(var2.DCZ().DDG());

    }

    private void RNP() {

        this.fxml_other_sale_ref_idController.clearChangedProperty();
        this.fxml_other_sale_creation_dateController.clearChangedProperty();
        this.fxml_other_sale_invoicing_dateController.clearChangedProperty();
        this.fxml_sale_contractor_nameController.clearChangedProperty();
        this.fxml_sale_contractor_nipController.clearChangedProperty();
        this.fxml_sale_contractor_streetController.clearChangedProperty();
        this.fxml_sale_contractor_house_numberController.clearChangedProperty();
        this.fxml_sale_contractor_apartment_numberController.clearChangedProperty();
        this.fxml_sale_contractor_postal_codeController.clearChangedProperty();
        this.fxml_sale_contractor_cityController.clearChangedProperty();
        this.fxml_other_sale_new_other_element_typeController.clearChangedProperty();
        this.fxml_other_sale_remarksController.clearChangedProperty();
        this.REE.set(false);

    }

    public boolean HHB() {

        boolean var1;
        this.RNM();
        this.RNR();
        this.RDW = null;
        var1 = true;

        return var1;
    }

    public void HHC() {

        this.fxml_sale_contractor_nipController.setContractorGetter(this.RDU);
        this.fxml_sale_contractor_nipController.setContractorSetter(this);
        this.fxml_sale_contractor_nameController.setContractorGetter(this.RDU);
        this.fxml_sale_contractor_nameController.setContractorSetter(this);
        this.RNL();
        if (this.REH.equals(Mode.NEW)) {
            this.setDefault();
        }

        if (this.REA.get()) {
            this.RNQ();
        }

        this.RNU();
        this.HJJ();
        this.RNP();

    }

    private void RNQ() {

        this.fxml_other_sale_invoicing_dateController.IFN(this.RDU.getRangesWhereSettled(this.resources.getString("micro.process.other_sale_new.Tooltip.SettledPeriod")));

    }

    private void RNR() {

        this.fxml_sale_contractor_nipController.fxml_component_main_element.getItems().clear();
        this.fxml_sale_contractor_nipController.fxml_component_main_element.setValue(null);
        this.fxml_sale_contractor_nameController.fxml_component_main_element.getItems().clear();
        this.fxml_sale_contractor_nameController.fxml_component_main_element.setValue(null);
        this.fxml_sale_contractor_nameController.HAS = false;
        this.fxml_sale_contractor_nipController.HAS = false;
        this.fxml_other_sale_invoicing_dateController.IFP();

    }

    public void setInvoiceOther(InvoiceOtherSell var1) {
        this.RDW = var1;
    }

    private void setDefault() {

        this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element.setValue(null);
        this.fxml_other_sale_creation_dateController.fxml_component_main_element.setValue(LocalDate.now());
        this.fxml_other_sale_invoicing_dateController.fxml_component_main_element.setValue(LocalDate.now());
        this.REF.set(false);

    }

    public void setProcessImplementation(QUU var1) {

        this.RDU = var1;

    }

    public void RNS(QUO var1) {
        if (var1.RNX()) {
            InvoiceOtherElementSell var2 = new InvoiceOtherElementSell();
            var2.RJH().setValue((TaxRate) ((ComboBoxRequired) var1.fxml_other_sale_new_add_other_element_tax_typeController.fxml_component_main_element).getValue());
            var2.RJE().setValue(var1.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.getNumber());
            var2.RJE().setAllowNegative(var1.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.IFG());
            var2.RJE().setAllowOnlyNegative(var1.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.RHT());
            var2.RJE().setScale(var1.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.getMaxLength());
            var2.RJE().setPresicion(var1.fxml_other_sale_new_add_other_element_netController.fxml_component_main_element.getMaximumFractionDigits());
            var2.RJF().setValue(var1.fxml_other_sale_new_add_other_element_taxController.fxml_component_main_element.getNumber());
            var2.RJF().setAllowOnlyNegative(var1.fxml_other_sale_new_add_other_element_taxController.fxml_component_main_element.RHT());
            var2.RJF().setAllowNegative(var1.fxml_other_sale_new_add_other_element_taxController.fxml_component_main_element.IFG());
            var2.RJF().setScale(var1.fxml_other_sale_new_add_other_element_taxController.fxml_component_main_element.getMaxLength());
            var2.RJF().setPresicion(var1.fxml_other_sale_new_add_other_element_taxController.fxml_component_main_element.getMaximumFractionDigits());
            String var3 = null;

            try {
                ConfigurationProperties var4 = EMB.getInstance().HHU();
                var3 = (String) var4.getConfigurationPropertyOrDefault(ConfigurationProperty.CalculationMethod).DEY().getValue();
            } catch (FFK var5) {
                var3 = (String) QJZ.getDefaultConfigurationProperty(ConfigurationProperty.CalculationMethod).DEY().getValue();
            }

            this.RJV(null, var2, CalculationMethodType.valueOf(var3));
            this.fxml_other_sale_elements_table.getItems().add(var2);
            this.fxml_other_sale_elements_table.refresh();
            this.HJJ();
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Added new invoice element, current number of elements: " + this.fxml_other_sale_elements_table.getItems().size());
        }

    }

    @FXML
    public void fxml_handleButton_other_sale_new_add_new_element(ActionEvent var1) {

        try {
            FXMLLoader var2 = new FXMLLoader();
            var2.setLocation(QUM.class.getResource("/fxml/sale_new_add_element.fxml"));
            var2.setResources(this.resources);
            AnchorPane var3 = var2.load();
            Stage var4 = new Stage();
            var4.setTitle(this.resources.getString("micro.process.invoice_sale_new.DialogAddNewInvoiceElement.DialogName"));
            var4.initModality(Modality.WINDOW_MODAL);
            var4.initOwner(this.primaryStage);
            var4.setResizable(false);
            Scene var5 = new Scene(var3);
            var4.setScene(var5);
            QUO var6 = var2.getController();
            var6.setDialogStage(var4);
            var6.setResources(this.resources);
            var6.setOtherType((InvoiceOtherSubtype) ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getValue());
            var6.RNW();
            var6.getDialogStage().getIcons().add(new Image("/img/app/e_logo.png"));
            var6.getDialogStage().showAndWait();
            this.RNS(var6);
        } catch (IOException var10) {
            var10.printStackTrace();
        }

    }

    @FXML
    private void fxml_handleButton_other_sale_new_delete_element(ActionEvent var1) {

        int var2 = this.fxml_other_sale_elements_table.getSelectionModel().getSelectedIndex();
        if (var2 >= 0) {
            this.fxml_other_sale_elements_table.getItems().remove(var2);
            this.fxml_other_sale_elements_table.refresh();
            this.REE.set(true);
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Deleted invoice element, current number of elements: " + this.fxml_other_sale_elements_table.getItems().size());
        }

    }

    public void HJJ() {

        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;
        this.REE.set(true);
        Iterator var4 = this.RDW.getInvoiceOtherElements().iterator();

        while (var4.hasNext()) {
            InvoiceOtherElementSell var5 = (InvoiceOtherElementSell) var4.next();
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

        this.RDW.RIU().setValue(var1);
        this.RDW.RIV().setValue(var2);
        this.RDW.RIT().setValue(var3);
        this.fxml_other_sale_summary_summary_table.refresh();
    }

    public void setContractorFromAutocomplete(TitledContractor var1) {

        if (var1 != null) {
            Contractor var2 = var1.getContractor().AICD();
            this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().setText(var2.getNip().getValue());
            this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().positionCaret(this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().getText().length());
            this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().setText(var2.getName().getValue());
            this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().positionCaret(this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().getText().length());
            Address var3 = var2.DAM();
            this.fxml_sale_contractor_streetController.fxml_component_main_element.setText(var3.getStreet().getValue());
            this.fxml_sale_contractor_house_numberController.fxml_component_main_element.setText(var3.getHouseNumber().getValue());
            this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.setText(var3.getApartmentNumber().getValue());
            this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.setText(var3.getPostalCode().getValue());
            this.fxml_sale_contractor_cityController.fxml_component_main_element.setText(var3.getCity().getValue());
        }

    }

    public void HJK() {
    }

    public void setModeChangeDisable(boolean var1) {

        this.REC.set(var1);

    }

    public void RNT() {

        if (((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getValue() != null) {
            switch ((InvoiceOtherSubtype) ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getValue()) {
                case SELL_REASON_1:
                case SELL_REASON_2:
                    this.fxml_other_sale_elements_table_column_tax_type.setEditable(true);
                    this.fxml_other_sale_elements_table_column_sum_net_price.setEditable(true);
                    this.fxml_other_sale_elements_table_column_sum_tax.setEditable(true);
                    this.fxml_other_sale_elements_table_column_sum_brut_price.setEditable(true);
                    this.fxml_other_sale_creation_dateController.fxml_component_root_element.setRequired(true);
                    this.REF.set(false);
                    break;
                case SELL_REASON_3:
                case SELL_REASON_4:
                    this.fxml_other_sale_elements_table_column_tax_type.setEditable(false);
                    this.fxml_other_sale_elements_table_column_sum_net_price.setEditable(false);
                    this.fxml_other_sale_elements_table_column_sum_tax.setEditable(true);
                    this.fxml_other_sale_elements_table_column_sum_brut_price.setEditable(false);
                    this.fxml_other_sale_creation_dateController.fxml_component_root_element.setRequired(false);
                    this.fxml_sale_contractor_nipController.fxml_component_main_element.getItems().clear();
                    this.fxml_sale_contractor_nameController.fxml_component_main_element.getItems().clear();
                    this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().setText(null);
                    this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().setText(null);
                    this.fxml_sale_contractor_streetController.fxml_component_main_element.setText(null);
                    this.fxml_sale_contractor_house_numberController.fxml_component_main_element.setText(null);
                    this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.setText(null);
                    this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.setText(null);
                    this.fxml_sale_contractor_cityController.fxml_component_main_element.setText(null);
                    this.REF.set(true);
            }
        }

    }

    public void RNU() {

        if (this.fxml_other_sale_elements_table.getItems().size() > 0) {
            this.RDY.set(true);
            this.setModeChangeDisable(true);
        } else {
            this.RDY.set(false);
            this.setModeChangeDisable(false);
        }

    }

    public void RJV(InvoiceOtherElementSell var1, InvoiceOtherElementSell var2, CalculationMethodType var3) {

        if (var2.getNetPriceForAll().getValue() != null && var2.getTaxRate().getValue() != null) {
            QSC var4 = new QSC();
            var4.RIB(var1, var2);
        }

        this.REE.set(true);
        this.fxml_other_sale_elements_table.refresh();

    }

    public InvoiceOtherSubtype RNV() {
        return (InvoiceOtherSubtype) ((ComboBoxRequired) this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element).getValue();
    }

    public void setInvoiceOtherSubType(InvoiceOtherSubtype var1) {
        this.fxml_other_sale_new_other_element_typeController.fxml_component_main_element.setValue(var1);
    }

    public void setMode(Mode var1) {
        this.REH = var1;
    }
}
