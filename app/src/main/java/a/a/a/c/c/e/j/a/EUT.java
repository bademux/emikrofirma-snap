package a.a.a.c.c.e.j.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.e.EOT;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.j.a.a.*;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.d.e.EQY;
import a.a.a.c.d.e.QRX;
import a.a.a.c.d.e.QRY;
import a.a.a.c.d.g.ERF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.*;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.b.EZT;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.KI;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.c.c.*;
import a.a.a.c.g.b.FCW;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;

public class EUT extends EMD implements EMO<HO>, EYR {
    public EUY GLL;
    public EPB GLM;
    public HY GLN;
    public HU GLO;
    public HY GLP;
    ERF GLQ = new ERF(false, 2, 2);
    public BooleanProperty GLR = new SimpleBooleanProperty(false);
    public BooleanProperty GLS = new SimpleBooleanProperty(false);
    public BooleanProperty GLT = new SimpleBooleanProperty(false);
    public BooleanProperty QNH = new SimpleBooleanProperty(false);
    public BooleanProperty GLU = new SimpleBooleanProperty(false);
    public BooleanProperty GLV = new SimpleBooleanProperty(false);
    public BooleanProperty GLW = new SimpleBooleanProperty(false);
    public ObjectProperty<JN> GLX = new SimpleObjectProperty();
    @FXML
    Node fxml_inner_parent;
    @FXML
    public Label fxml_invoice_sale_invoice_fields_group_name;
    @FXML
    public EYQ fxml_invoice_sale_ref_idController;
    @FXML
    public CheckBox fxml_invoice_sale_is_mpp;
    @FXML
    public EZD fxml_invoice_sale_creation_dateController;
    @FXML
    public GridPane fxml_invoice_sale_grid_pane_invoice_data_only_for_correction;
    @FXML
    public EZD fxml_invoice_sale_invoicing_dateController;
    @FXML
    public EYQ fxml_invoice_sale_correct_ref_idController;
    @FXML
    public EZD fxml_invoice_sale_correct_creation_dateController;
    @FXML
    public EYQ fxml_invoice_sale_creation_placeController;
    @FXML
    public EZD fxml_invoice_sale_transaction_dateController;
    @FXML
    public ToggleGroup calculation_method_radio_group;
    @FXML
    public ToggleGroup calculation_method_correction_radio_group;
    @FXML
    public HBox fxml_invoice_sale_hbox_radio;
    @FXML
    public HBox fxml_invoice_sale_hbox_radio_correct;
    @FXML
    public CheckBox fxml_sale_contractor_private_person;
    @FXML
    public EYS fxml_sale_contractor_nameController;
    @FXML
    public EZO fxml_sale_contractor_nipController;
    @FXML
    public EZG fxml_sale_contractor_streetController;
    @FXML
    public EZG fxml_sale_contractor_house_numberController;
    @FXML
    public EZG fxml_sale_contractor_apartment_numberController;
    @FXML
    public EZL fxml_sale_contractor_postal_codeController;
    @FXML
    public EZG fxml_sale_contractor_cityController;
    @FXML
    public Label fxml_invoice_sale_invoice_elements_name;
    @FXML
    public TableView<HQ> fxml_invoice_sale_elements_table;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_name;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_description;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_price;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_amount;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_unit;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_tax_type;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_sum_net_price;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_sum_tax;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_sum_brut_price;
    @FXML
    public Button fxml_invoice_sale_button_add_new_invoice_position;
    @FXML
    public Button fxml_invoice_sale_button_add_delete_invoice_position;
    @FXML
    public Label fxml_invoice_sale_invoice_elements_table_error_label;
    private final ListProperty<HQ> GLY = new SimpleListProperty();
    private final ListProperty<HQ> GLZ = new SimpleListProperty();
    public BooleanProperty GMA = new SimpleBooleanProperty(false);
    public BooleanProperty GMB = new SimpleBooleanProperty(false);
    public BooleanProperty GMC = new SimpleBooleanProperty(false);
    private EUU GMD;
    private ChangeListener<Toggle> RAT;
    @FXML
    TableView<HY> fxml_invoice_sale_summary_summary_table;
    @FXML
    TableColumn<HY, Object> fxml_invoice_sale_summary_summary_table_column_sum_netto;
    @FXML
    TableColumn<HY, Object> fxml_invoice_sale_summary_summary_table_column_sum_tax;
    @FXML
    TableColumn<HY, Object> fxml_invoice_sale_summary_summary_table_column_sum_brut;
    @FXML
    Label fxml_invoice_sale_to_pay_name_label;
    @FXML
    Label fxml_invoice_sale_to_pay;
    @FXML
    public EZP<KI> fxml_invoice_sale_payment_typeController;
    @FXML
    public EZI fxml_invoice_sale_paymentdatedaysController;
    @FXML
    public EZD fxml_invoice_sale_paymentdateController;
    @FXML
    public EZQ fxml_invoice_sale_payedController;
    @FXML
    public EZQ fxml_invoice_sale_paymentdatebydealController;
    @FXML
    public EZK fxml_invoice_sale_remarksController;
    @FXML
    public EZK fxml_invoice_sale_exempt_reasonController;
    @FXML
    public Label fxml_invoice_sale_exempt_reason_label;
    @FXML
    public Label fxml_invoice_sale_exempt_reason_label_star;
    @FXML
    public Label fxml_invoice_sale_label_before_correct;
    @FXML
    public TableView<HQ> fxml_invoice_sale_elements_table_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_name_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_description_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_price_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_amount_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_unit_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_tax_type_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_sum_net_price_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_sum_tax_before_correct;
    @FXML
    public TableColumn<HQ, Object> fxml_invoice_sale_elements_table_column_sum_brut_price_before_correct;
    @FXML
    TableView<HY> fxml_invoice_sale_elements_table_before_correct_summary;
    @FXML
    TableColumn<HY, Object> fxml_invoice_sale_elements_table_column_sum_net_price_before_correct_summary;
    @FXML
    TableColumn<HY, Object> fxml_invoice_sale_elements_table_column_sum_tax_before_correct_summary;
    @FXML
    TableColumn<HY, Object> fxml_invoice_sale_elements_table_column_sum_brut_price_before_correct_summary;
    @FXML
    TableView<HV> fxml_invoice_sale_table_correct_difference_summary;
    @FXML
    TableColumn<HV, Object> fxml_invoice_sale_table_correct_difference_summary_diff_net;
    @FXML
    TableColumn<HV, Object> fxml_invoice_sale_table_correct_difference_summary_diff_tax;
    @FXML
    TableColumn<HV, Object> fxml_invoice_sale_table_correct_difference_summary_diff_brut;
    @FXML
    public EZK fxml_invoice_sale_correct_reasonController;
    @FXML
    public GridPane fxml_invoice_sale_grid_pane_correction_reason_and_summary;
    public static final String GME = "7";
    public EZT GMF;
    public String GMG;
    public JN QGI;
    public LocalDate GMH;
    private String GMI;
    private HI GMJ;

    public EUT(EMC var1, String var2) {
        super(var1, var2);
    }

    @FXML
    public void initialize() {
        EXF.getInstance().ICO();

        try {
            this.GMI = this.resources.getString("micro.process.invoice_sale_new.NipNullRemarks");
            this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.setEditable(false);
            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.setEditable(false);
            this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.setEditable(false);
            this.fxml_invoice_sale_grid_pane_invoice_data_only_for_correction.visibleProperty().bind(this.GLR);
            this.fxml_invoice_sale_grid_pane_invoice_data_only_for_correction.managedProperty().bind(this.GLR);
            this.fxml_invoice_sale_label_before_correct.visibleProperty().bind(this.GLR);
            this.fxml_invoice_sale_label_before_correct.managedProperty().bind(this.GLR);
            this.fxml_invoice_sale_elements_table_before_correct.visibleProperty().bind(this.GLR);
            this.fxml_invoice_sale_elements_table_before_correct.managedProperty().bind(this.GLR);
            this.fxml_invoice_sale_elements_table_before_correct_summary.visibleProperty().bind(this.GLR);
            this.fxml_invoice_sale_elements_table_before_correct_summary.managedProperty().bind(this.GLR);
            this.fxml_invoice_sale_grid_pane_correction_reason_and_summary.visibleProperty().bind(this.GLR);
            this.fxml_invoice_sale_grid_pane_correction_reason_and_summary.managedProperty().bind(this.GLR);
            this.fxml_invoice_sale_hbox_radio_correct.visibleProperty().bind(this.GLR);
            this.fxml_invoice_sale_hbox_radio_correct.managedProperty().bind(this.GLR);
            this.fxml_invoice_sale_correct_ref_idController.fxml_component_main_element.setEditable(false);
            this.fxml_invoice_sale_correct_creation_dateController.fxml_component_main_element.setDisable(true);
            this.fxml_invoice_sale_ref_idController.fxml_component_main_element.editableProperty().bind(this.GLT.and(this.QNH.not()));
            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.disableProperty().bind(this.GLT.not().or(this.QNH));
            this.fxml_invoice_sale_creation_placeController.fxml_component_main_element.editableProperty().bind(this.GLR.not().and(this.GLT));
            this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.disableProperty().bind(this.GLR.or(this.GLT.not()));
            this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.disableProperty().bind(this.GLT.not());
            this.fxml_sale_contractor_nameController.fxml_component_main_element.disableProperty().bind(this.GLR.not().and(this.GLT).not());
            this.fxml_sale_contractor_nipController.fxml_component_main_element.disableProperty().bind(this.GLR.not().and(this.GLT).not());
            this.fxml_sale_contractor_streetController.fxml_component_main_element.editableProperty().bind(this.GLR.not().and(this.GLT));
            this.fxml_sale_contractor_house_numberController.fxml_component_main_element.editableProperty().bind(this.GLR.not().and(this.GLT));
            this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.editableProperty().bind(this.GLR.not().and(this.GLT));
            this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.editableProperty().bind(this.GLR.not().and(this.GLT));
            this.fxml_sale_contractor_cityController.fxml_component_main_element.editableProperty().bind(this.GLR.not().and(this.GLT));
            this.fxml_invoice_sale_elements_table.editableProperty().bind(this.GLT);
            this.fxml_invoice_sale_payment_typeController.fxml_component_main_element.disableProperty().bind(this.GLT.not());
            this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.disableProperty().bind(this.GLT.not().or(this.fxml_invoice_sale_creation_dateController.requiredAndValidProperty().not()));
            this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.disableProperty().bind(this.GLT.not().or(this.fxml_invoice_sale_creation_dateController.requiredAndValidProperty().not()));
            this.fxml_invoice_sale_payedController.fxml_component_main_element.disableProperty().bind(this.GLT.not());
            this.fxml_invoice_sale_paymentdatebydealController.fxml_component_main_element.disableProperty().bind(this.GLT.not());
            this.fxml_invoice_sale_correct_reasonController.fxml_component_main_element.editableProperty().bind(this.GLT);
            this.fxml_invoice_sale_button_add_new_invoice_position.disableProperty().bind(this.GLT.not().or(this.GLR));
            this.fxml_invoice_sale_button_add_delete_invoice_position.disableProperty().bind(this.GLT.not().or(this.GLR).or(this.fxml_invoice_sale_elements_table.getSelectionModel().selectedItemProperty().isNull()));
            this.fxml_invoice_sale_remarksController.fxml_component_main_element.editableProperty().bind(this.GLT);
            this.fxml_invoice_sale_exempt_reasonController.fxml_component_main_element.editableProperty().bind(this.GLT);
            this.fxml_invoice_sale_elements_table_column_name.editableProperty().bind(this.GLR.not());
            this.fxml_invoice_sale_elements_table_column_description.editableProperty().bind(this.GLR.not());
            this.fxml_sale_contractor_private_person.disableProperty().bind(this.GLT.not().or(this.GLR));
            this.fxml_invoice_sale_hbox_radio_correct.disableProperty().bind(this.GLT.not().or(this.GLR));
            this.fxml_invoice_sale_hbox_radio.disableProperty().bind(this.GLT.not());
            this.fxml_invoice_sale_is_mpp.disableProperty().bind(this.GLT.not());
            this.fxml_invoice_sale_paymentdatedaysController.fxml_component_root_element.visibleProperty().bind(this.fxml_invoice_sale_payedController.fxml_component_main_element.selectedProperty().not().and(this.fxml_invoice_sale_paymentdatebydealController.fxml_component_main_element.selectedProperty().not()));
            this.fxml_invoice_sale_paymentdateController.fxml_component_root_element.visibleProperty().bind(this.fxml_invoice_sale_payedController.fxml_component_main_element.selectedProperty().not().and(this.fxml_invoice_sale_paymentdatebydealController.fxml_component_main_element.selectedProperty().not()));
            this.GLS.bind(this.fxml_invoice_sale_ref_idController.requiredAndValidProperty().and(this.fxml_invoice_sale_creation_dateController.requiredAndValidProperty().and(this.fxml_invoice_sale_creation_placeController.requiredAndValidProperty().and(this.fxml_invoice_sale_transaction_dateController.requiredAndValidProperty().and(this.fxml_invoice_sale_invoicing_dateController.requiredAndValidProperty().and(this.fxml_sale_contractor_nameController.requiredAndValidProperty().and(this.fxml_sale_contractor_nipController.requiredAndValidProperty().and(this.fxml_sale_contractor_streetController.requiredAndValidProperty().and(this.fxml_sale_contractor_house_numberController.requiredAndValidProperty().and(this.fxml_sale_contractor_apartment_numberController.requiredAndValidProperty().and(this.fxml_sale_contractor_postal_codeController.requiredAndValidProperty().and(this.fxml_sale_contractor_cityController.requiredAndValidProperty().and(this.GLY.emptyProperty().not().and(this.fxml_invoice_sale_payment_typeController.requiredAndValidProperty().and(this.fxml_invoice_sale_paymentdatedaysController.requiredAndValidProperty().and(this.fxml_invoice_sale_paymentdateController.requiredAndValidProperty().and(this.fxml_invoice_sale_remarksController.requiredAndValidProperty().and(this.GLW.and(this.fxml_invoice_sale_correct_reasonController.requiredAndValidProperty().and(this.GMB.or(this.GLR.not()).and(this.GMC.and(this.fxml_invoice_sale_exempt_reasonController.requiredAndValidProperty()))))))))))))))))))))));
            this.GLU.bind(this.fxml_invoice_sale_ref_idController.changedProperty().or(this.fxml_invoice_sale_creation_dateController.changedProperty().or(this.fxml_invoice_sale_creation_placeController.changedProperty().or(this.fxml_invoice_sale_transaction_dateController.changedProperty().or(this.fxml_invoice_sale_invoicing_dateController.changedProperty().or(this.fxml_sale_contractor_nameController.changedProperty().or(this.fxml_sale_contractor_nipController.changedProperty().or(this.fxml_sale_contractor_streetController.changedProperty().or(this.fxml_sale_contractor_house_numberController.changedProperty().or(this.fxml_sale_contractor_apartment_numberController.changedProperty().or(this.fxml_sale_contractor_postal_codeController.changedProperty().or(this.fxml_sale_contractor_cityController.changedProperty().or(this.GMA.or(this.fxml_invoice_sale_payment_typeController.changedProperty().or(this.fxml_invoice_sale_paymentdatedaysController.changedProperty().or(this.fxml_invoice_sale_paymentdateController.changedProperty().or(this.fxml_invoice_sale_payedController.changedProperty().or(this.fxml_invoice_sale_paymentdatebydealController.changedProperty().or(this.fxml_invoice_sale_remarksController.changedProperty().or(this.fxml_invoice_sale_correct_reasonController.changedProperty().or(this.fxml_invoice_sale_exempt_reasonController.changedProperty())))))))))))))))))))));
            this.GLV.bind(this.fxml_sale_contractor_nameController.changedProperty().or(this.fxml_sale_contractor_nipController.changedProperty().or(this.fxml_sale_contractor_streetController.changedProperty().or(this.fxml_sale_contractor_house_numberController.changedProperty().or(this.fxml_sale_contractor_apartment_numberController.changedProperty().or(this.fxml_sale_contractor_postal_codeController.changedProperty().or(this.fxml_sale_contractor_cityController.changedProperty())))))));
            this.fxml_invoice_sale_elements_table_column_name_before_correct.setCellValueFactory(new PropertyValueFactory("name"));
            this.fxml_invoice_sale_elements_table_column_description_before_correct.setCellValueFactory(new PropertyValueFactory("description"));
            this.fxml_invoice_sale_elements_table_column_amount_before_correct.setCellValueFactory(new PropertyValueFactory("quantity"));
            this.fxml_invoice_sale_elements_table_column_unit_before_correct.setCellValueFactory(new PropertyValueFactory("unit"));
            this.fxml_invoice_sale_elements_table_column_tax_type_before_correct.setCellValueFactory(new PropertyValueFactory("taxRate"));
            this.fxml_invoice_sale_elements_table_column_sum_net_price_before_correct.setCellValueFactory(new PropertyValueFactory("netPriceForAll"));
            this.fxml_invoice_sale_elements_table_column_sum_tax_before_correct.setCellValueFactory(new PropertyValueFactory("taxValueForAll"));
            this.fxml_invoice_sale_elements_table_column_sum_brut_price_before_correct.setCellValueFactory(new PropertyValueFactory("grossValueForAll"));
            this.fxml_invoice_sale_elements_table_column_name_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_description_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_price_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_amount_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_unit_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_tax_type_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_net_price_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_tax_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_brut_price_before_correct.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_net_price_before_correct_summary.setCellValueFactory(new PropertyValueFactory("amountSummaryWithoutTax"));
            this.fxml_invoice_sale_elements_table_column_sum_tax_before_correct_summary.setCellValueFactory(new PropertyValueFactory("amountTax"));
            this.fxml_invoice_sale_elements_table_column_sum_brut_price_before_correct_summary.setCellValueFactory(new PropertyValueFactory("amountSummaryWithTax"));
            this.fxml_invoice_sale_elements_table_column_sum_net_price_before_correct_summary.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_elements_table_column_sum_tax_before_correct_summary.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_elements_table_column_sum_brut_price_before_correct_summary.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_elements_table_column_name.setCellValueFactory(new PropertyValueFactory("name"));
            this.fxml_invoice_sale_elements_table_column_description.setCellValueFactory(new PropertyValueFactory("description"));
            this.fxml_invoice_sale_elements_table_column_amount.setCellValueFactory(new PropertyValueFactory("quantity"));
            this.fxml_invoice_sale_elements_table_column_unit.setCellValueFactory(new PropertyValueFactory("unit"));
            this.fxml_invoice_sale_elements_table_column_tax_type.setCellValueFactory(new PropertyValueFactory("taxRate"));
            this.fxml_invoice_sale_elements_table_column_sum_net_price.setCellValueFactory(new PropertyValueFactory("netPriceForAll"));
            this.fxml_invoice_sale_elements_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("taxValueForAll"));
            this.fxml_invoice_sale_elements_table_column_sum_brut_price.setCellValueFactory(new PropertyValueFactory("grossValueForAll"));
            this.fxml_invoice_sale_elements_table_column_name.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_description.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_price.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_amount.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_unit.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_tax_type.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_net_price.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_tax.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_elements_table_column_sum_brut_price.setCellFactory(new EOT(this, true));
            this.fxml_invoice_sale_summary_summary_table_column_sum_netto.setCellValueFactory(new PropertyValueFactory("amountSummaryWithoutTax"));
            this.fxml_invoice_sale_summary_summary_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("amountTax"));
            this.fxml_invoice_sale_summary_summary_table_column_sum_brut.setCellValueFactory(new PropertyValueFactory("amountSummaryWithTax"));
            this.fxml_invoice_sale_summary_summary_table_column_sum_netto.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_summary_summary_table_column_sum_tax.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_summary_summary_table_column_sum_brut.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_table_correct_difference_summary_diff_net.setCellValueFactory(new PropertyValueFactory("differenceAmountSummaryWithoutTax"));
            this.fxml_invoice_sale_table_correct_difference_summary_diff_tax.setCellValueFactory(new PropertyValueFactory("differenceAmountTax"));
            this.fxml_invoice_sale_table_correct_difference_summary_diff_brut.setCellValueFactory(new PropertyValueFactory("differenceAmountSummaryWithTax"));
            this.fxml_invoice_sale_table_correct_difference_summary_diff_net.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_table_correct_difference_summary_diff_tax.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_table_correct_difference_summary_diff_brut.setCellFactory(new EOT(this, false));
            this.fxml_invoice_sale_elements_table.setFixedCellSize(32.0);
            this.fxml_invoice_sale_elements_table.prefHeightProperty().bind(this.fxml_invoice_sale_elements_table.fixedCellSizeProperty().multiply(Bindings.size(this.GLY).add(2.5)));
            this.fxml_invoice_sale_elements_table.minHeightProperty().bind(this.fxml_invoice_sale_elements_table.prefHeightProperty());
            this.fxml_invoice_sale_elements_table.maxHeightProperty().bind(this.fxml_invoice_sale_elements_table.prefHeightProperty());
            this.fxml_invoice_sale_elements_table_before_correct.setFixedCellSize(32.0);
            this.fxml_invoice_sale_elements_table_before_correct.prefHeightProperty().bind(this.fxml_invoice_sale_elements_table_before_correct.fixedCellSizeProperty().multiply(Bindings.size(this.GLZ).add(2.5)));
            this.fxml_invoice_sale_elements_table_before_correct.minHeightProperty().bind(this.fxml_invoice_sale_elements_table_before_correct.prefHeightProperty());
            this.fxml_invoice_sale_elements_table_before_correct.maxHeightProperty().bind(this.fxml_invoice_sale_elements_table_before_correct.prefHeightProperty());
            this.fxml_invoice_sale_summary_summary_table.widthProperty().addListener(new ChangeListener<Number>() {
                public void changed(ObservableValue<? extends Number> var1, Number var2, Number var3) {
                    Pane var4 = (Pane) EUT.this.fxml_invoice_sale_summary_summary_table.lookup("TableHeaderRow");
                    if (var4 != null && var4.isVisible()) {
                        var4.setMaxHeight(0.0);
                        var4.setMinHeight(0.0);
                        var4.setPrefHeight(0.0);
                        var4.setVisible(false);
                        var4.setManaged(false);
                    }

                }
            });
            this.fxml_invoice_sale_summary_summary_table.refresh();
            this.fxml_invoice_sale_elements_table_before_correct_summary.widthProperty().addListener(new ChangeListener<Number>() {
                public void changed(ObservableValue<? extends Number> var1, Number var2, Number var3) {
                    Pane var4 = (Pane) EUT.this.fxml_invoice_sale_elements_table_before_correct_summary.lookup("TableHeaderRow");
                    if (var4 != null && var4.isVisible()) {
                        var4.setMaxHeight(0.0);
                        var4.setMinHeight(0.0);
                        var4.setPrefHeight(0.0);
                        var4.setVisible(false);
                        var4.setManaged(false);
                    }

                }
            });
            this.fxml_invoice_sale_summary_summary_table.refresh();
            this.fxml_invoice_sale_payment_typeController.fxml_component_main_element.setCellFactory(new EOQ());
            this.fxml_invoice_sale_payment_typeController.fxml_component_main_element.setButtonCell((ListCell) ((ComboBoxRequired) this.fxml_invoice_sale_payment_typeController.fxml_component_main_element).getCellFactory().call(null));
            ((ComboBoxRequired) this.fxml_invoice_sale_payment_typeController.fxml_component_main_element).getItems().addAll(KI.values());
            this.fxml_invoice_sale_payment_typeController.fxml_component_main_element.setEditable(false);
            this.GLX.addListener(new EUK(this));
            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.valueProperty().addListener(new EUM(this, this.resources));
            this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.valueProperty().addListener(new EUQ(this));
            this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.textProperty().addListener(new EUI(this));
            this.fxml_invoice_sale_payedController.fxml_component_main_element.selectedProperty().addListener(new EUL(this));
            this.fxml_invoice_sale_paymentdatebydealController.fxml_component_main_element.selectedProperty().addListener(new QKJ(this));
            this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.valueProperty().addListener(new EUR(this, this.resources));
            this.fxml_invoice_sale_ref_idController.fxml_component_main_element.textProperty().addListener(new EUN(this));
            this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.valueProperty().addListener(new EUJ(this, this.resources));
            this.GMB.addListener(new EUP(this, this.resources));
            this.fxml_invoice_sale_ref_idController.fxml_component_validation_element_external.setText(this.resources.getString("micro.process.invoice_sale_new.Error.RefIdNotunique"));
            this.fxml_invoice_sale_creation_dateController.fxml_component_validation_element.setText(this.resources.getString("micro.process.invoice_sale_new.Error.SettlementSetted"));
            this.fxml_sale_contractor_private_person.selectedProperty().addListener(new EUO(this));
            this.fxml_invoice_sale_is_mpp.selectedProperty().addListener(new ROY(this));
            this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty().addListener(new EUS(this));
            this.fxml_invoice_sale_paymentdatedaysController.fxml_component_value_restriction_message.setManaged(false);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXD() {
        EXF.getInstance().ICO();

        try {
            this.fxml_invoice_sale_ref_idController.fxml_component_main_element.textProperty().bindBidirectional(this.GLN.DAS().DDG());
            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.GLN.DAT().DEC());
            this.fxml_invoice_sale_elements_table.itemsProperty().bindBidirectional(this.GLN.DBU());
            this.GMD = new EUU();
            this.fxml_invoice_sale_elements_table.getItems().addListener(this.GMD);
            this.GLY.bind(this.fxml_invoice_sale_elements_table.itemsProperty());
            this.fxml_invoice_sale_elements_table.refresh();
            this.fxml_invoice_sale_summary_summary_table.getItems().add(this.GLN);
            this.fxml_invoice_sale_summary_summary_table.refresh();
            this.fxml_invoice_sale_elements_table_before_correct.getItems().clear();
            this.fxml_invoice_sale_elements_table_before_correct.refresh();
            this.fxml_invoice_sale_elements_table_before_correct_summary.getItems().clear();
            this.fxml_invoice_sale_elements_table_before_correct_summary.refresh();
            ((ComboBoxRequired) this.fxml_invoice_sale_payment_typeController.fxml_component_main_element).valueProperty().bindBidirectional(this.GLN.DAY().DEI());
            this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.valueProperty().bindBidirectional(this.GLN.DAZ().DEC());
            this.fxml_invoice_sale_payedController.fxml_component_main_element.selectedProperty().bindBidirectional(this.GLN.DBA().DDS());
            this.fxml_invoice_sale_paymentdatebydealController.fxml_component_main_element.selectedProperty().bindBidirectional(this.GLN.QOP().DDS());
            this.fxml_invoice_sale_remarksController.fxml_component_main_element.textProperty().bindBidirectional(this.GLN.DBB().DDG());
            this.fxml_invoice_sale_exempt_reasonController.fxml_component_main_element.textProperty().bindBidirectional(this.GLN.QOQ().DDG());
            this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.GLN.IYZ().DEC());
            this.GLX.bindBidirectional(this.GLN.DAF().DDM());
            Iterator var1;
            if (!this.GLR.get()) {
                HU var8 = (HU) this.GLN;
                this.fxml_invoice_sale_creation_placeController.fxml_component_main_element.textProperty().bindBidirectional(var8.DBW().DDG());
                this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.valueProperty().bindBidirectional(var8.DAU().DEC());
            } else {
                this.fxml_invoice_sale_elements_table_before_correct.itemsProperty().bindBidirectional(this.GLP.DBU());
                this.GLZ.bind(this.fxml_invoice_sale_elements_table_before_correct.itemsProperty());
                this.fxml_invoice_sale_elements_table_before_correct_summary.getItems().add(this.GLP);
                if (this.GLM == EPB.CORRECT) {
                    this.GLN.setMpp(this.GLP.getMpp().getValue());
                    EXF.getInstance().ICE(this.GLN.getMpp().getValueAsString());
                    var1 = this.GLP.getInvoiceElements().iterator();

                    while (var1.hasNext()) {
                        HQ var2 = (HQ) var1.next();
                        this.fxml_invoice_sale_elements_table.getItems().add((HQ) var2.RIH());
                    }

                    if (this.GLP.getMpp().getValue()) {
                        String var6 = FCW.getInstance().getMessageForKey("micro.process.invoice_sale_new.MppRemarks");
                        if (this.fxml_invoice_sale_remarksController != null && this.fxml_invoice_sale_remarksController.fxml_component_main_element != null) {
                            this.fxml_invoice_sale_remarksController.fxml_component_main_element.setText(var6);
                        }
                    }
                }

                HV var7 = (HV) this.GLN;
                this.fxml_invoice_sale_table_correct_difference_summary.getItems().add(var7);
                this.fxml_invoice_sale_correct_reasonController.fxml_component_main_element.textProperty().bindBidirectional(var7.DBX().DDG());
                this.fxml_invoice_sale_correct_ref_idController.fxml_component_main_element.textProperty().bindBidirectional(this.GLO.DAS().DDG());
                this.fxml_invoice_sale_correct_creation_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.GLO.DAT().DEC());
                this.fxml_invoice_sale_creation_placeController.fxml_component_main_element.textProperty().bindBidirectional(this.GLO.DBW().DDG());
                this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.GLO.DAU().DEC());
            }

            this.fxml_invoice_sale_is_mpp.selectedProperty().bindBidirectional(this.GLN.getMpp().DDS());
            Toggle var9;
            if (this.GLM != EPB.CORRECT && this.GLM != EPB.EDIT_CORRECTION && this.GLM != EPB.VIEW_CORRECTION) {
                var1 = this.calculation_method_radio_group.getToggles().iterator();

                while (var1.hasNext()) {
                    var9 = (Toggle) var1.next();
                    ((RadioButton) var9).setDisable(false);
                }
            } else {
                var1 = this.calculation_method_radio_group.getToggles().iterator();

                while (var1.hasNext()) {
                    var9 = (Toggle) var1.next();
                    ((RadioButton) var9).setDisable(true);
                }
            }

            this.initializeCalculationMethod();
            this.RAT = new QTM(this);
            this.calculation_method_radio_group.selectedToggleProperty().addListener(this.RAT);
            this.calculation_method_correction_radio_group.selectedToggleProperty().addListener(this.RAT);
            this.HXG();
            this.HXH();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void initializeCalculationMethod() {
        if (this.GLM == EPB.NEW) {
            this.RLB("NET");
            this.RLA(this.calculation_method_radio_group, "NET");
            this.RLA(this.calculation_method_correction_radio_group, "NET");
        } else {
            String var1;
            if (this.GLM != EPB.CORRECT && this.GLM != EPB.EDIT_CORRECTION && this.GLM != EPB.VIEW_CORRECTION) {
                if (this.GLN.RIE().getValue() == null) {
                    this.GLN.RIE().setValue(QSV.NET);
                }

                var1 = this.GLN.RIE().getValue().toString();
                if (var1.equals("NET")) {
                    this.fxml_invoice_sale_elements_table_column_price_before_correct.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
                    this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
                } else if (var1.equals("GROSS")) {
                    this.fxml_invoice_sale_elements_table_column_price_before_correct.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
                    this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
                }

                this.fxml_invoice_sale_elements_table_column_price_before_correct.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementPrice_" + var1));
                this.fxml_invoice_sale_elements_table_column_price.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementPrice_" + var1));
                this.RLA(this.calculation_method_radio_group, var1);
                this.RLA(this.calculation_method_correction_radio_group, var1);
            } else {
                if (this.GLO.RIE().getValue() == null) {
                    this.GLO.RIE().setValue(QSV.NET);
                }

                var1 = this.GLO.RIE().getValue().toString();
                if (var1.equals("NET")) {
                    this.fxml_invoice_sale_elements_table_column_price_before_correct.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
                } else if (var1.equals("GROSS")) {
                    this.fxml_invoice_sale_elements_table_column_price_before_correct.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
                }

                this.fxml_invoice_sale_elements_table_column_price_before_correct.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementPrice_" + var1));
                this.RLA(this.calculation_method_correction_radio_group, var1);
                if (this.GLN.RIE().getValue() == null) {
                    this.GLN.RIE().setValue(QSV.NET);
                }

                var1 = this.GLN.RIE().getValue().toString();
                if (var1.equals("NET")) {
                    this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
                } else if (var1.equals("GROSS")) {
                    this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
                }

                this.fxml_invoice_sale_elements_table_column_price.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementPrice_" + var1));
                this.RLA(this.calculation_method_radio_group, var1);
            }
        }

    }

    private void RLA(ToggleGroup var1, String var2) {
        Iterator var3 = var1.getToggles().iterator();

        while (var3.hasNext()) {
            Toggle var4 = (Toggle) var3.next();
            if (((RadioButton) var4).getUserData().toString().equals(var2)) {
                var4.setSelected(true);
            }
        }

    }

    public void RLB(String var1) {
        if (var1.equals("NET")) {
            this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(null);
            this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(new PropertyValueFactory("netPriceForUnit"));
        } else if (var1.equals("GROSS")) {
            this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(null);
            this.fxml_invoice_sale_elements_table_column_price.setCellValueFactory(new PropertyValueFactory("grossPriceForUnit"));
        }

        this.fxml_invoice_sale_elements_table_column_price.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementPrice_" + var1));
        this.fxml_invoice_sale_elements_table.refresh();
    }

    public void RLC(String var1) {
        HQ var3;
        for (Iterator var2 = this.fxml_invoice_sale_elements_table.getItems().iterator(); var2.hasNext(); this.RJV(null, var3, null)) {
            var3 = (HQ) var2.next();
            if (var1.equals("NET")) {
                var3.DBI().setValue(var3.RIF().getValue());
            } else if (var1.equals("GROSS")) {
                var3.RIF().setValue(var3.DBI().getValue());
            }
        }

        this.HJJ();
    }

    private void HXE() {
        EXF.getInstance().ICO();

        try {
            this.HHD(this.fxml_invoice_sale_ref_idController.fxml_component_main_element.textProperty(), this.GLN.DAS().DDG());
            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.valueProperty().unbindBidirectional(this.GLN.DAT().DEC());
            this.fxml_invoice_sale_elements_table.itemsProperty().unbindBidirectional(this.GLN.DBU());
            if (this.GMD != null) {
                this.fxml_invoice_sale_elements_table.getItems().removeListener(this.GMD);
                this.GMD = null;
            }

            this.GLY.unbind();
            this.fxml_invoice_sale_elements_table.getItems().clear();
            this.fxml_invoice_sale_summary_summary_table.getItems().clear();
            ((ComboBoxRequired) this.fxml_invoice_sale_payment_typeController.fxml_component_main_element).valueProperty().unbindBidirectional(this.GLN.DAY().DEI());
            this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.valueProperty().unbindBidirectional(this.GLN.DAZ().DEC());
            this.fxml_invoice_sale_payedController.fxml_component_main_element.selectedProperty().unbindBidirectional(this.GLN.DBA().DDS());
            this.fxml_invoice_sale_paymentdatebydealController.fxml_component_main_element.selectedProperty().unbindBidirectional(this.GLN.QOP().DDS());
            this.HHD(this.fxml_invoice_sale_remarksController.fxml_component_main_element.textProperty(), this.GLN.DBB().DDG());
            this.HHD(this.fxml_invoice_sale_exempt_reasonController.fxml_component_main_element.textProperty(), this.GLN.QOQ().DDG());
            this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.valueProperty().bindBidirectional(this.GLN.IYZ().DEC());
            this.GLX.unbindBidirectional(this.GLN.DAF().DDM());
            if (!this.GLR.get()) {
                HU var1 = (HU) this.GLN;
                this.HHD(this.fxml_invoice_sale_creation_placeController.fxml_component_main_element.textProperty(), var1.DBW().DDG());
            } else {
                this.fxml_invoice_sale_elements_table_before_correct.itemsProperty().unbindBidirectional(this.GLP.DBU());
                this.fxml_invoice_sale_elements_table_before_correct.getItems().clear();
                this.GLZ.unbind();
                this.fxml_invoice_sale_summary_summary_table.getItems().clear();
                HV var5 = (HV) this.GLN;
                this.fxml_invoice_sale_table_correct_difference_summary.getItems().clear();
                this.HHD(this.fxml_invoice_sale_correct_reasonController.fxml_component_main_element.textProperty(), var5.DBX().DDG());
                this.HHD(this.fxml_invoice_sale_correct_ref_idController.fxml_component_main_element.textProperty(), this.GLO.DAS().DDG());
                this.fxml_invoice_sale_correct_creation_dateController.fxml_component_main_element.valueProperty().unbindBidirectional(this.GLO.DAT().DEC());
                this.HHD(this.fxml_invoice_sale_creation_placeController.fxml_component_main_element.textProperty(), this.GLO.DBW().DDG());
                this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.valueProperty().unbindBidirectional(this.GLO.DAU().DEC());
            }

            this.calculation_method_radio_group.selectedToggleProperty().removeListener(this.RAT);
            this.calculation_method_correction_radio_group.selectedToggleProperty().removeListener(this.RAT);
            this.HXF();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXF() {
        EXF.getInstance().ICO();

        try {
            HI var1 = null;
            if (!this.GLR.get()) {
                HU var2 = (HU) this.GLN;
                var1 = var2.DBV();
            } else {
                var1 = this.GLO.DBV();
            }

            this.HHD(this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().textProperty(), var1.DAI().DDG());
            this.HHD(this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty(), var1.DAJ().DDG());
            JJ var6 = var1.DAM();
            this.HHD(this.fxml_sale_contractor_streetController.fxml_component_main_element.textProperty(), var6.DDA().DDG());
            this.HHD(this.fxml_sale_contractor_house_numberController.fxml_component_main_element.textProperty(), var6.DDB().DDG());
            this.HHD(this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.textProperty(), var6.DDC().DDG());
            this.HHD(this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.textProperty(), var6.DDD().DDG());
            this.HHD(this.fxml_sale_contractor_cityController.fxml_component_main_element.textProperty(), var6.DCZ().DDG());
            this.fxml_sale_contractor_private_person.selectedProperty().unbindBidirectional(var1.getPrivatePerson().DDS());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXG() {
        EXF.getInstance().ICO();

        try {
            HI var1 = null;
            if (!this.GLR.get()) {
                HU var2 = (HU) this.GLN;
                var1 = var2.DBV();
            } else {
                var1 = this.GLO.DBV();
            }

            this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAI().DDG());
            this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().textProperty().bindBidirectional(var1.DAJ().DDG());
            JJ var6 = var1.DAM();
            this.fxml_sale_contractor_streetController.fxml_component_main_element.textProperty().bindBidirectional(var6.DDA().DDG());
            this.fxml_sale_contractor_house_numberController.fxml_component_main_element.textProperty().bindBidirectional(var6.DDB().DDG());
            this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.textProperty().bindBidirectional(var6.DDC().DDG());
            this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.textProperty().bindBidirectional(var6.DDD().DDG());
            this.fxml_sale_contractor_cityController.fxml_component_main_element.textProperty().bindBidirectional(var6.DCZ().DDG());
            this.fxml_sale_contractor_private_person.selectedProperty().bindBidirectional(var1.getPrivatePerson().DDS());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXH() {
        EXF.getInstance().ICO();

        try {
            this.fxml_invoice_sale_ref_idController.clearChangedProperty();
            this.fxml_invoice_sale_creation_dateController.clearChangedProperty();
            this.fxml_invoice_sale_creation_placeController.clearChangedProperty();
            this.fxml_invoice_sale_transaction_dateController.clearChangedProperty();
            this.fxml_invoice_sale_invoicing_dateController.clearChangedProperty();
            this.fxml_sale_contractor_nameController.clearChangedProperty();
            this.fxml_sale_contractor_nipController.clearChangedProperty();
            this.fxml_sale_contractor_streetController.clearChangedProperty();
            this.fxml_sale_contractor_house_numberController.clearChangedProperty();
            this.fxml_sale_contractor_apartment_numberController.clearChangedProperty();
            this.fxml_sale_contractor_postal_codeController.clearChangedProperty();
            this.fxml_sale_contractor_cityController.clearChangedProperty();
            this.GMA.set(false);
            this.fxml_invoice_sale_payment_typeController.clearChangedProperty();
            this.fxml_invoice_sale_paymentdatedaysController.clearChangedProperty();
            this.fxml_invoice_sale_paymentdateController.clearChangedProperty();
            this.fxml_invoice_sale_paymentdatebydealController.clearChangedProperty();
            this.fxml_invoice_sale_payedController.clearChangedProperty();
            this.fxml_invoice_sale_remarksController.clearChangedProperty();
            this.fxml_invoice_sale_correct_reasonController.clearChangedProperty();
            this.fxml_invoice_sale_exempt_reasonController.clearChangedProperty();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean HHB() {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            this.HXE();
            this.HXJ();
            this.GLN = null;
            this.GLO = null;
            this.GLP = null;
            var1 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public void HHC() {
        EXF.getInstance().ICO();

        try {
            this.fxml_sale_contractor_nipController.setContractorGetter(this.GLL);
            this.fxml_sale_contractor_nipController.setContractorSetter(this);
            this.fxml_sale_contractor_nameController.setContractorGetter(this.GLL);
            this.fxml_sale_contractor_nameController.setContractorSetter(this);
            if (this.GLM == EPB.EDIT || this.GLM == EPB.EDIT_CORRECTION) {
                this.GMG = this.GLN.DAS().getValueAsString();
                this.GMH = this.GLN.DAT().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                this.QGI = this.GLN.DAF().DDN();
            }

            this.fxml_invoice_sale_invoice_elements_table_error_label.setText("");
            this.setRequiredExceptions();
            this.setNamesExceptions();
            this.HXD();
            this.HJJ();
            if (this.GLT.get()) {
                this.HXI();
            }

            if (this.GLM == EPB.NEW) {
                HU var1 = (HU) this.GLN;
                if (var1.getContractor() != null && this.GMI.equals(var1.getContractor().DAJ().getValue())) {
                    this.fxml_sale_contractor_private_person.setSelected(true);
                }

                this.setDefault();
            }

            if (this.GLM == EPB.CORRECT) {
                this.setDefaultCorrection();
            }

            this.HXQ();
            this.HXH();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setDefault() {
        EXF.getInstance().ICO();

        try {
            boolean var1 = false;

            try {
                JG var2 = this.GLL.getSettlementStatus(LocalDate.now());
                if (var2 != null && var2.equals(JG.SETTLED)) {
                    var1 = true;
                }
            } catch (FFO | FFK var6) {
                EXF.getInstance().ICA(var6);
            }

            if (!var1) {
                this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.setValue(LocalDate.now());
            }

            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.setValue(LocalDate.now());
            this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.setValue(LocalDate.now());
            this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.setText("7");
            this.fxml_invoice_sale_creation_placeController.fxml_component_main_element.setText(this.GLL.getUserData().DFN().DCZ().getValue());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setDefaultCorrection() {
        EXF.getInstance().ICO();

        try {
            boolean var1 = false;

            try {
                JG var2 = this.GLL.getSettlementStatus(LocalDate.now());
                if (var2 != null && var2.equals(JG.SETTLED)) {
                    var1 = true;
                }
            } catch (FFO | FFK var8) {
                EXF.getInstance().ICA(var8);
            }

            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.setValue(LocalDate.now());
            this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.setText("7");
            this.fxml_invoice_sale_invoice_elements_table_error_label.setText(this.resources.getString("micro.process.invoice_sale_new.Error.ErrorTableInvoiceElementsCorrection"));
            boolean var10 = false;
            Iterator var3 = this.fxml_invoice_sale_elements_table.getItems().iterator();

            while (true) {
                if (!var3.hasNext()) {
                    if (var10 && this.GLP.QOQ().getValue() != null && this.GLP.QOQ().getValue().length() > 0) {
                        this.fxml_invoice_sale_exempt_reasonController.fxml_component_main_element.setText(this.GLP.QOQ().getValue());
                    }
                    break;
                }

                HQ var4 = (HQ) var3.next();
                if (var4.getTaxRate().getValue().equals(KL.ZW)) {
                    var10 = true;
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXI() {
        EXF.getInstance().ICO();

        try {
            this.fxml_invoice_sale_invoicing_dateController.IFN(this.GLL.getRangesWhereSettled(this.resources.getString("micro.process.invoice_sale_new.Tooltip.SettledPeriod")));
            if (this.GLM.getCorrectFields()) {
                String var1;
                if (this.GLO == this.GLP) {
                    var1 = this.resources.getString("micro.process.invoice_sale_new.Error.ErrorCorrectionCrationDateBeforeParentCreationDateIfOnlyOneParent");
                } else {
                    var1 = this.resources.getString("micro.process.invoice_sale_new.Error.ErrorCorrectionCrationDateBeforeParentCreationDate");
                }

                EZT var2 = new EZT(LocalDate.of(0, 1, 1), this.GLP.getCreationDate().getValueDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().minusDays(1L), var1, false);
                this.fxml_invoice_sale_creation_dateController.IFM(var2);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXJ() {
        EXF.getInstance().ICO();

        try {
            this.fxml_invoice_sale_creation_dateController.IFP();
            this.fxml_invoice_sale_invoicing_dateController.IFP();
            this.fxml_invoice_sale_paymentdateController.IFP();
            this.GMF = null;
            this.GMG = null;
            this.GMH = null;
            this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.setValue(null);
            this.fxml_invoice_sale_transaction_dateController.fxml_component_main_element.setValue(null);
            this.fxml_invoice_sale_ref_idController.fxml_component_main_element.setText(null);
            this.fxml_sale_contractor_private_person.setSelected(false);
            this.fxml_sale_contractor_nipController.fxml_component_main_element.getItems().clear();
            this.fxml_sale_contractor_nipController.fxml_component_main_element.setValue(null);
            this.fxml_sale_contractor_nameController.fxml_component_main_element.getItems().clear();
            this.fxml_sale_contractor_nameController.fxml_component_main_element.setValue(null);
            this.fxml_sale_contractor_nameController.HAS = false;
            this.fxml_sale_contractor_nipController.HAS = false;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setRequiredExceptions() {
        EXF.getInstance().ICO();

        try {
            if (this.GLR.get()) {
                this.fxml_invoice_sale_correct_reasonController.fxml_component_root_element.setRequired(true);
                this.fxml_invoice_sale_invoicing_dateController.fxml_component_root_element.setRequired(false);
            } else {
                this.fxml_invoice_sale_correct_reasonController.fxml_component_root_element.setRequired(false);
                this.fxml_invoice_sale_invoicing_dateController.fxml_component_root_element.setRequired(true);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setNamesExceptions() {
        EXF.getInstance().ICO();

        try {
            if (this.GLR.get()) {
                this.fxml_invoice_sale_invoice_elements_name.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElementsCorrection"));
                this.fxml_invoice_sale_invoice_fields_group_name.setText(this.resources.getString("micro.process.invoice_sale_new.CorrectionInvoiceFieldsName"));
            } else {
                this.fxml_invoice_sale_invoice_elements_name.setText(this.resources.getString("micro.process.invoice_sale_new.InvoiceElements"));
                this.fxml_invoice_sale_invoice_fields_group_name.setText(this.resources.getString("micro.process.invoice_sale_new.NormalInvoiceFieldsName"));
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setProcessImplementation(EUY var1) {
        EXF.getInstance().ICO();

        try {
            this.GLL = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setMode(EPB var1) {
        EXF.getInstance().ICO();

        try {
            this.GLM = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setInvoiceMain(HY var1) {
        this.GLN = var1;
    }

    public void setInvoicePrevoiusParent(HY var1) {
        this.GLP = var1;
    }

    public void setInvoiceFirstParent(HU var1) {
        this.GLO = var1;
    }

    public EUG HXK() throws IOException {
        EXF.getInstance().ICO();

        EUG var6;
        try {
            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(EUV.class.getResource("/fxml/invoice_sale_new_add_invoice_element.fxml"));
            var1.setResources(this.resources);
            AnchorPane var2 = var1.load();
            Stage var3 = new Stage();
            var3.setTitle(this.resources.getString("micro.process.invoice_sale_new.DialogAddNewInvoiceElement.DialogName"));
            var3.initModality(Modality.WINDOW_MODAL);
            var3.initOwner(this.FGW);
            var3.setResizable(false);
            Scene var4 = new Scene(var2);
            var3.setScene(var4);
            EUG var5 = var1.getController();
            var5.setDialogStage(var3);
            var5.setResources(this.resources);
            var5.setCalculationMethod(this.calculation_method_radio_group.getSelectedToggle().getUserData().toString());
            var5.setDefault();
            var5.setProductAutocomplete(this.GLL);
            var6 = var5;
        } finally {
            EXF.getInstance().ICP();
        }

        return var6;
    }

    public void HXL(EUG var1) {
        if (var1.HXC()) {
            HQ var2 = new HQ();
            var2.DBE().setValue((String) ((ComboBoxRequired) var1.fxml_invoice_sale_new_add_invoice_element_nameController.fxml_component_main_element).getValue());
            var2.DBE().setMaxLength(var1.fxml_invoice_sale_new_add_invoice_element_nameController.fxml_component_root_element.getMaxLength());
            var2.DBF().setValue(var1.fxml_invoice_sale_new_add_invoice_element_descriptionController.fxml_component_main_element.getText());
            var2.DBF().setMaxLength(var1.fxml_invoice_sale_new_add_invoice_element_descriptionController.fxml_component_root_element.getMaxLength());
            var2.DBI().setValue(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.getNumber());
            var2.DBI().setAllowNegative(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.IFG());
            var2.DBI().setScale(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.getMaxLength());
            var2.DBI().setPresicion(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.getMaximumFractionDigits());
            var2.DBN().setValue((KL) ((ComboBoxRequired) var1.fxml_invoice_sale_new_add_invoice_element_tax_typeController.fxml_component_main_element).getValue());
            var2.RIF().setValue(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.getNumber());
            var2.RIF().setAllowNegative(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.IFG());
            var2.RIF().setScale(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.getMaxLength());
            var2.RIF().setPresicion(var1.fxml_invoice_sale_new_add_invoice_element_netpriceController.fxml_component_main_element.getMaximumFractionDigits());
            var2.DBG().setValue(var1.fxml_invoice_sale_new_add_invoice_element_amountController.fxml_component_main_element.getNumber());
            var2.DBG().setAllowNegative(var1.fxml_invoice_sale_new_add_invoice_element_amountController.fxml_component_main_element.IFG());
            var2.DBG().setScale(var1.fxml_invoice_sale_new_add_invoice_element_amountController.fxml_component_main_element.getMaxLength());
            var2.DBG().setPresicion(var1.fxml_invoice_sale_new_add_invoice_element_amountController.fxml_component_main_element.getMaximumFractionDigits());
            var2.DBH().setValue(var1.fxml_invoice_sale_new_add_invoice_element_unitController.fxml_component_main_element.getText());
            var2.DBH().setMaxLength(var1.fxml_invoice_sale_new_add_invoice_element_unitController.fxml_component_root_element.getMaxLength());
            this.RJV(null, var2, null);
            this.HJJ();
            this.fxml_invoice_sale_elements_table.getItems().add(var2);
            this.fxml_invoice_sale_elements_table.refresh();
        }

    }

    @FXML
    public void fxml_handleButton_invoice_sale_new_add_new_element(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            if (this.GLN != null) {
                EUG var2 = this.HXK();
                var2.getDialogStage().getIcons().add(new Image("/img/app/e_logo.png"));
                var2.getDialogStage().showAndWait();
                this.HXL(var2);
                EXF.getInstance().ICE("Added new invoice element, current number of elements: " + this.fxml_invoice_sale_elements_table.getItems().size());
            }
        } catch (IOException var6) {
            EXF.getInstance().ICA(var6);
            throw new FFI(var6);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    private void fxml_handleButton_invoice_sale_new_delete_element(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            int var2 = this.fxml_invoice_sale_elements_table.getSelectionModel().getSelectedIndex();
            if (var2 >= 0) {
                this.fxml_invoice_sale_elements_table.getItems().remove(var2);
                this.fxml_invoice_sale_elements_table.refresh();
                this.GMA.set(true);
                EXF.getInstance().ICE("Deleted invoice element, current number of elements: " + this.fxml_invoice_sale_elements_table.getItems().size());
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void RJV(HO var1, HO var2, QSV var3) {
        EXF.getInstance().ICO();

        try {
            var3 = QSV.valueOf(this.calculation_method_radio_group.getSelectedToggle().getUserData().toString());
            QRX var4 = QRY.getInvoiceCalculationMethod(var3, true);
            var4.RIB(var1, var2);
            this.GMA.set(true);
            this.fxml_invoice_sale_elements_table.refresh();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void QPI() {
        EXF.getInstance().ICO();

        try {
            boolean var1 = false;
            Iterator var2 = this.fxml_invoice_sale_elements_table.getItems().iterator();

            while (var2.hasNext()) {
                HQ var3 = (HQ) var2.next();
                if (var3.getTaxRate().getValue().equals(KL.ZW)) {
                    var1 = true;
                }
            }

            if (var1) {
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_root_element.setRequired(true);
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_root_element.setVisible(true);
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_root_element.setManaged(true);
                this.fxml_invoice_sale_exempt_reason_label.setVisible(true);
                this.fxml_invoice_sale_exempt_reason_label.setManaged(true);
                this.fxml_invoice_sale_exempt_reason_label_star.setVisible(true);
                this.fxml_invoice_sale_exempt_reason_label_star.setManaged(true);
            } else {
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_root_element.setRequired(false);
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_main_element.setText(null);
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_root_element.setVisible(false);
                this.fxml_invoice_sale_exempt_reasonController.fxml_component_root_element.setManaged(false);
                this.fxml_invoice_sale_exempt_reason_label.setVisible(false);
                this.fxml_invoice_sale_exempt_reason_label.setManaged(false);
                this.fxml_invoice_sale_exempt_reason_label_star.setVisible(false);
                this.fxml_invoice_sale_exempt_reason_label_star.setManaged(false);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXM() {
        EXF.getInstance().ICO();

        try {
            this.GMC.set(false);
            boolean var1 = true;
            if (this.GLN.getInvoiceElements() != null) {
                Iterator var2 = this.GLN.getInvoiceElements().iterator();

                while (var2.hasNext()) {
                    HO var3 = (HO) var2.next();
                    HQ var4 = (HQ) var3;
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
                            continue;
                        }

                        var1 = false;
                        break;
                    }

                    var1 = false;
                    break;
                }

                this.GMC.set(var1);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HJJ() {
        EXF.getInstance().ICO();

        try {
            BigDecimal var1 = BigDecimal.ZERO;
            BigDecimal var2 = BigDecimal.ZERO;
            BigDecimal var3 = BigDecimal.ZERO;
            Iterator var4 = this.GLN.getInvoiceElements().iterator();

            while (var4.hasNext()) {
                HQ var5 = (HQ) var4.next();
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

            this.GLN.DAW().setValue(var1);
            this.GLN.DAX().setValue(var2);
            this.GLN.DAV().setValue(var3);
            this.fxml_invoice_sale_summary_summary_table.refresh();
            if (this.GLM.getCorrectFields()) {
                BigDecimal var11 = BigDecimal.ZERO;
                BigDecimal var12 = BigDecimal.ZERO;
                BigDecimal var6 = BigDecimal.ZERO;
                var11 = EQY.HRJ(var1, this.GLP.getAmountSummaryWithoutTax().getValue());
                var12 = EQY.HRJ(var2, this.GLP.getAmountTax().getValue());
                var6 = EQY.HRJ(var3, this.GLP.getAmountSummaryWithTax().getValue());
                HV var7 = (HV) this.GLN;
                var7.DCA().setValue(var11);
                var7.DCB().setValue(var12);
                var7.DBZ().setValue(var6);
                this.fxml_invoice_sale_table_correct_difference_summary.refresh();
                if (var6.compareTo(BigDecimal.ZERO) >= 0) {
                    this.fxml_invoice_sale_to_pay_name_label.setText(this.resources.getString("micro.process.invoice_sale_new.ToPay"));
                } else {
                    this.fxml_invoice_sale_to_pay_name_label.setText(this.resources.getString("micro.process.invoice_sale_new.ToPayMinus"));
                }

                this.fxml_invoice_sale_to_pay.setText(this.GLQ.HRW(var6.abs()));
            } else {
                this.fxml_invoice_sale_to_pay_name_label.setText(this.resources.getString("micro.process.invoice_sale_new.ToPay"));
                this.fxml_invoice_sale_to_pay.setText(this.GLQ.HRW(var3));
            }

            if (this.GLM.getCorrectFields()) {
                this.HXT();
            }

            this.HXN();
            this.HXM();
            this.fxml_invoice_sale_summary_summary_table.refresh();
            this.QPI();
        } finally {
            EXF.getInstance().ICP();
        }
    }

    private void HXN() {
        EXF.getInstance().ICO();

        try {
            boolean var1 = false;
            Iterator var2 = this.GLN.getInvoiceElements().iterator();

            while (var2.hasNext()) {
                HQ var3 = (HQ) var2.next();
                if (var3.getTaxRate().getValue().DEQ()) {
                    var1 = true;
                    break;
                }
            }

            boolean var7 = this.fxml_invoice_sale_remarksController.fxml_component_main_element.getText() != null && this.fxml_invoice_sale_remarksController.fxml_component_main_element.getText().contains(this.resources.getString("micro.process.invoice_sale_new.Remarks.Inverse"));

           if (var1 && !var7) {
                String var8 = "";
                if (this.fxml_invoice_sale_remarksController.fxml_component_main_element.getText() != null) {
                    var8 = this.fxml_invoice_sale_remarksController.fxml_component_main_element.getText();
                }

                this.fxml_invoice_sale_remarksController.fxml_component_main_element.setText(this.resources.getString("micro.process.invoice_sale_new.Remarks.Inverse") + var8);
            } else if (!var1 && var7 && this.fxml_invoice_sale_remarksController.fxml_component_main_element.getText() != null) {
                this.fxml_invoice_sale_remarksController.fxml_component_main_element.setText(this.fxml_invoice_sale_remarksController.fxml_component_main_element.getText().replaceAll(this.resources.getString("micro.process.invoice_sale_new.Remarks.Inverse"), ""));
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HXO() {
        EXF.getInstance().ICO();

        try {
            if (this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.getValue() != null && this.fxml_invoice_sale_creation_dateController.requiredAndValidProperty().get() && this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.getValue() != null) {
                long var1 = this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.getValue().toEpochDay() - this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.getValue().toEpochDay();
                this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.setText(String.valueOf(var1));
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HXP() {
        EXF.getInstance().ICO();

        try {
            Integer var1 = null;
            if (this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.getText() != null) {
                try {
                    var1 = Integer.valueOf(this.fxml_invoice_sale_paymentdatedaysController.fxml_component_main_element.getText().replace(String.valueOf(this.GLQ.getGroupingSep()), ""));
                } catch (NumberFormatException var6) {
                    var1 = null;
                }
            }

            if (var1 != null) {
                if (this.fxml_invoice_sale_creation_dateController.requiredAndValidProperty().get() && this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.getValue() != null) {
                    this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.setValue(this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.getValue().plusDays((long) var1));
                }
            } else {
                this.fxml_invoice_sale_paymentdateController.fxml_component_main_element.setValue(null);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HXQ() {
        EXF.getInstance().ICO();

        try {
            this.HXR();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXR() {
        EXF.getInstance().ICO();

        try {
            if (this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.getValue() != null && this.fxml_invoice_sale_invoicing_dateController.requiredAndValidProperty().get()) {
                this.GLX.set(new JN(Date.from(this.fxml_invoice_sale_invoicing_dateController.fxml_component_main_element.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant())));
            } else if (this.GLM.getCorrectFields()) {
                this.GLX.set(JN.AOE);
            }
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HXS() {
        EXF.getInstance().ICO();

        try {
            if (this.GLL != null) {
                this.GLL.HYA();
            }

            if (this.GLL != null && this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.getValue() != null && this.fxml_invoice_sale_creation_dateController.requiredAndValidProperty().get()) {
                String var1 = this.GLL.getRefId(this.fxml_invoice_sale_creation_dateController.fxml_component_main_element.getValue());
                this.fxml_invoice_sale_ref_idController.fxml_component_main_element.setText(var1);
            }
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HXT() {
        EXF.getInstance().ICO();

        try {
            boolean var1 = true;
            int var2 = 0;

            while (true) {
                if (var2 < this.GLN.getInvoiceElements().size()) {
                    if (this.GLP.getInvoiceElements().get(var2).DBH().compareTo(this.GLN.getInvoiceElements().get(var2).DBH()) != 0) {
                        var1 = false;
                    } else if (!ERF.HSA(this.GLP.getInvoiceElements().get(var2).DBI(), this.GLN.getInvoiceElements().get(var2).DBI())) {
                        var1 = false;
                    } else if (!ERF.HSA(this.GLP.getInvoiceElements().get(var2).DBG(), this.GLN.getInvoiceElements().get(var2).DBG())) {
                        var1 = false;
                    } else if (this.GLP.getInvoiceElements().get(var2).DBN().getValue() != this.GLN.getInvoiceElements().get(var2).DBN().getValue()) {
                        var1 = false;
                    } else if (this.GLP.getInvoiceElements().get(var2).DBK().compareTo(this.GLN.getInvoiceElements().get(var2).DBK()) != 0) {
                        var1 = false;
                    } else if (!ERF.HSA(this.GLP.getInvoiceElements().get(var2).DBL(), this.GLN.getInvoiceElements().get(var2).DBL())) {
                        var1 = false;
                    } else {
                        if (ERF.HSA(this.GLP.getInvoiceElements().get(var2).DBM(), this.GLN.getInvoiceElements().get(var2).DBM())) {
                            ++var2;
                            continue;
                        }

                        var1 = false;
                    }
                }

                this.GMB.set(!var1);
                return;
            }
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public void HJK() {
        EXF.getInstance().ICO();

        try {
            this.fxml_inner_parent.requestFocus();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setContractor(HI var1) {
        this.GMJ = var1;
    }

    public void setContractorFromAutocomplete(QJW var1) {
        EXF.getInstance().ICO();

        try {
            if (var1 != null) {
                HI var2 = var1.getContractor().AICD();
                this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().setText(var2.getNip().getValue());
                this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().positionCaret(this.fxml_sale_contractor_nipController.fxml_component_main_element.getEditor().getText().length());
                this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().setText(var2.getName().getValue());
                this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().positionCaret(this.fxml_sale_contractor_nameController.fxml_component_main_element.getEditor().getText().length());
                JJ var3 = var2.DAM();
                this.fxml_sale_contractor_streetController.fxml_component_main_element.setText(var3.getStreet().getValue());
                this.fxml_sale_contractor_house_numberController.fxml_component_main_element.setText(var3.getHouseNumber().getValue());
                this.fxml_sale_contractor_apartment_numberController.fxml_component_main_element.setText(var3.getApartmentNumber().getValue());
                this.fxml_sale_contractor_postal_codeController.fxml_component_main_element.setText(var3.getPostalCode().getValue());
                this.fxml_sale_contractor_cityController.fxml_component_main_element.setText(var3.getCity().getValue());
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void QGQ(String var1) {
        EXF.getInstance().ICO();

        try {
            if (var1 == null) {
                var1 = this.fxml_invoice_sale_ref_idController.fxml_component_main_element.getText();
            }

            this.fxml_invoice_sale_ref_idController.fxml_component_main_element.IEW().set(true);
            boolean var2 = this.QGI != null && this.GLX.get() != null && !this.QGI.equals(this.GLX.get());

           boolean var3 = true;

            try {
                var3 = this.GLL.HYB(this.GLX.get(), this.fxml_invoice_sale_ref_idController.fxml_component_main_element.getText());
            } catch (FFO | FFK var8) {
                EXF.getInstance().ICA(var8);
            }

            if (this.GLM != EPB.EDIT && this.GLM != EPB.EDIT_CORRECTION && !var3) {
                this.fxml_invoice_sale_ref_idController.fxml_component_main_element.IEW().set(false);
            } else if ((this.GLM == EPB.EDIT || this.GLM == EPB.EDIT_CORRECTION) && !var3 && this.GMG != null && (this.GMG.compareTo(var1) != 0 || var2)) {
                this.fxml_invoice_sale_ref_idController.fxml_component_main_element.IEW().set(false);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private class EUU implements ListChangeListener<HQ> {
        private EUU() {
        }

        public void onChanged(ListChangeListener.Change<? extends HQ> var1) {
            EXF.getInstance().ICO();

            try {
                if (var1 != null) {
                    EUT.this.HJJ();
                }
            } finally {
                EXF.getInstance().ICP();
            }

        }
    }
}
