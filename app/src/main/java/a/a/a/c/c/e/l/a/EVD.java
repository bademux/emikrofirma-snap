package a.a.a.c.c.e.l.a;

import a.a.a.b.c.DialogButton;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.ENI;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.a.ENO;
import a.a.a.c.c.d.b.InvoiceFilteringType;
import a.a.a.c.c.d.d.EOK;
import a.a.a.c.c.d.d.EOM;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.g.EOX;
import a.a.a.c.c.d.g.EOZ;
import a.a.a.c.c.d.g.EPA;
import a.a.a.c.c.d.g.Mode;
import a.a.a.c.c.d.h.EPE;
import a.a.a.c.c.d.h.EPI;
import a.a.a.c.c.e.l.c.EVJ;
import a.a.a.c.f.a.a.EZG;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceSell;
import a.a.a.c.f.a.e.InvoiceSellCorrection;
import a.a.a.c.f.a.e.BaseInvoiceSell;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.b.c.a.MonthType;
import a.a.a.c.f.b.c.a.InvoiceState;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.c.FCZ;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.util.Callback;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Slf4j
public class EVD extends ENO<EVJ> {
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    private static final int GNT = 50;
    @FXML
    private Pagination fxml_invoice_sale_list_pagination;
    @FXML
    private Button fxml_invoice_sale_list_button_edit;
    @FXML
    private Button fxml_invoice_sale_list_button_correct;
    @FXML
    private Button fxml_invoice_sale_list_button_view;
    @FXML
    private Button fxml_invoice_sale_list_button_set_receive_date;
    @FXML
    private Button fxml_invoice_sale_list_button_print;
    @FXML
    private Button fxml_invoice_sale_list_button_new_invoice;
    @FXML
    private Button fxml_invoice_sale_list_button_cancel;
    @FXML
    private Label fxml_invoice_sale_list_button_edit_error_label;
    @FXML
    private Label fxml_invoice_sale_list_button_correct_error_label;
    @FXML
    private Label fxml_invoice_sale_list_button_view_error_label;
    @FXML
    private Label fxml_invoice_sale_list_button_set_receive_date_error_label;
    @FXML
    private TreeTableView<EVG> fxml_invoice_sale_list_table_tree;
    @FXML
    private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_invoice_type;
    @FXML
    private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_ref_id;
    @FXML
    private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_parent_ref_id;
    @FXML
    private TreeTableColumn<EVG, LocalDate> fxml_invoice_sale_list_tree_table_column_invoicing_date;
    @FXML
    private TreeTableColumn<EVG, String> fxml_invoice_sale_new_elements_tree_table_contractor_name;
    @FXML
    private TreeTableColumn<EVG, String> fxml_invoice_sale_new_elements_tree_table_contractor_nip;
    @FXML
    private TreeTableColumn<EVG, BigDecimal> fxml_invoice_sale_list_tree_table_column_sum_net;
    @FXML
    private TreeTableColumn<EVG, BigDecimal> fxml_invoice_sale_list_tree_table_column_sum_tax;
    @FXML
    private TreeTableColumn<EVG, BigDecimal> fxml_invoice_sale_list_tree_table_column_sum_brut;
    @FXML
    private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_canceled;
    @FXML
    private ComboBox<MonthType> fxml_invoice_sale_list_month;
    @FXML
    private ComboBox<String> fxml_invoice_sale_list_year;
    @FXML
    private EZG fxml_invoice_sale_list_searchController;
    @FXML
    private ComboBox<String> fxml_invoice_sale_list_year_search;
    @FXML
    private CheckBox fxml_invoice_sale_list_only_empty_period;
    @FXML
    private CheckBox fxml_invoice_sale_list_canceled_invoices;
    @FXML
    private TableView<EOX<String>> fxml_invoice_sale_list_summary_table;
    @FXML
    private TableColumn<EOX<String>, String> fxml_invoice_sale_list_summary_table_column_name;
    @FXML
    private TableColumn<EOX<String>, BigDecimal> fxml_invoice_sale_list_summary_table_column_sum_net;
    @FXML
    private TableColumn<EOX<String>, BigDecimal> fxml_invoice_sale_list_summary_table_column_sum_tax;
    @FXML
    private TableColumn<EOX<String>, BigDecimal> fxml_invoice_sale_list_summary_table_column_sum_brut;
    @FXML
    private CheckBox fxml_invoice_sale_list_extended_view;
    @FXML
    private ScrollPane fxml_invoice_sale_list_scroll_pane;
    private SortedMap<String, SortedSet<MonthType>> GNU;
    private final DecimalFormat GNV = ENI.get();
    private boolean GNW = false;
    private int GNX = 0;
    private boolean GNY = true;
    private String GNZ;
    private String GOA;
    private MonthType GOB;
    protected final ListProperty<EOX<String>> GOC = new SimpleListProperty(FXCollections.observableArrayList());
    private List<EPA<BaseInvoiceSell>> GOD;
    private final ChangeListener<Boolean> GOE = new ChangeListener<Boolean>() {
        public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {

            EVD.this.setExtendedView(var3);
            log.info("Extended view checkbox set to " + var3);

        }
    };
    private final QHB GOF = new QHB();
    private final QHC GOG = new QHC();
    private final QHD QIL = new QHD();
    private final QHE QIM = new QHE();
    private final QTK RAP = new QTK();
    private final ChangeListener<Boolean> GOH = new ChangeListener<Boolean>() {
        public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
            EVD.this.setTableHeight();
        }
    };
    private Period GOI = null;

    public EVD(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);

    }

    @FXML
    public void initialize() {

        this.GNZ = this.resources.getString("micro.process.invoice_sale_list.SearchAll");

    }

    public void init() {

        try {
            super.init();
            this.fxml_invoice_sale_list_searchController.fxml_component_main_element.setPromptText(this.resources.getString("micro.process.invoice_sale_list.Find"));
            this.fxml_invoice_sale_list_table_tree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<EVG>>() {
                public void changed(ObservableValue<? extends TreeItem<EVG>> var1, TreeItem<EVG> var2, TreeItem<EVG> var3) {
                    if (var3 != null) {
                        EVD.this.HYS();
                    } else {
                        EVD.this.setAllDisabled();
                    }

                }
            });
            this.fxml_invoice_sale_list_table_tree.setShowRoot(false);
            this.fxml_invoice_sale_list_table_tree.setRowFactory(new EOM());
            this.fxml_invoice_sale_list_tree_table_column_sum_net.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn(new EOK(this.GNV, 2)));
            this.fxml_invoice_sale_list_tree_table_column_sum_tax.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn(new EOK(this.GNV, 2)));
            this.fxml_invoice_sale_list_tree_table_column_sum_brut.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn(new EOK(this.GNV, 2)));
            this.fxml_invoice_sale_list_tree_table_column_invoice_type.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
                    return var1.getValue().getValue().getInvoicetype();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_ref_id.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
                    return var1.getValue().getValue().getRefId();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_parent_ref_id.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
                    return var1.getValue().getValue().getParentRefId();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_invoicing_date.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, LocalDate>, ObservableValue<LocalDate>>() {
                public ObservableValue<LocalDate> call(TreeTableColumn.CellDataFeatures<EVG, LocalDate> var1) {
                    return var1.getValue().getValue().getInvoicingDate();
                }
            });
            this.fxml_invoice_sale_new_elements_tree_table_contractor_name.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
                    return var1.getValue().getValue().getContractorName();
                }
            });
            this.fxml_invoice_sale_new_elements_tree_table_contractor_nip.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
                    return var1.getValue().getValue().getContractorNip();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_sum_net.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, BigDecimal>, ObservableValue<BigDecimal>>() {
                public ObservableValue<BigDecimal> call(TreeTableColumn.CellDataFeatures<EVG, BigDecimal> var1) {
                    return var1.getValue().getValue().getSumNet();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_sum_tax.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, BigDecimal>, ObservableValue<BigDecimal>>() {
                public ObservableValue<BigDecimal> call(TreeTableColumn.CellDataFeatures<EVG, BigDecimal> var1) {
                    return var1.getValue().getValue().getSumTax();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_sum_brut.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, BigDecimal>, ObservableValue<BigDecimal>>() {
                public ObservableValue<BigDecimal> call(TreeTableColumn.CellDataFeatures<EVG, BigDecimal> var1) {
                    return var1.getValue().getValue().getSumBrut();
                }
            });
            this.fxml_invoice_sale_list_tree_table_column_canceled.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
                    return var1.getValue().getValue().getCanceled();
                }
            });
            this.fxml_invoice_sale_list_month.setCellFactory(new EOQ());
            this.fxml_invoice_sale_list_month.setButtonCell(this.fxml_invoice_sale_list_month.getCellFactory().call(null));
            this.fxml_invoice_sale_list_year.valueProperty().addListener(this.GOG);
            this.fxml_invoice_sale_list_month.valueProperty().addListener(this.GOF);
            this.fxml_invoice_sale_list_year_search.valueProperty().addListener(this.QIL);
            this.fxml_invoice_sale_list_searchController.fxml_component_main_element.textProperty().addListener(this.QIL);
            this.fxml_invoice_sale_list_summary_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GNV, 2)));
            this.fxml_invoice_sale_list_summary_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GNV, 2)));
            this.fxml_invoice_sale_list_summary_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GNV, 2)));
            this.fxml_invoice_sale_list_summary_table_column_sum_net.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
                public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
                    return ((EOX) var1.getValue()).getSumNet();
                }
            });
            this.fxml_invoice_sale_list_summary_table_column_sum_tax.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
                public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
                    return ((EOX) var1.getValue()).getSumTax();
                }
            });
            this.fxml_invoice_sale_list_summary_table_column_sum_brut.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
                public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
                    return ((EOX) var1.getValue()).getSumBrut();
                }
            });
            this.fxml_invoice_sale_list_summary_table_column_name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TableColumn.CellDataFeatures<EOX<String>, String> var1) {
                    return ((EOX) var1.getValue()).getTaxRate();
                }
            });
            this.fxml_invoice_sale_list_summary_table.setItems(this.GOC);
            this.fxml_invoice_sale_list_table_tree.setFixedCellSize(30.0);
            this.fxml_invoice_sale_list_table_tree.setMinHeight(this.fxml_invoice_sale_list_table_tree.getFixedCellSize() * 2.0);
            this.fxml_invoice_sale_list_table_tree.maxHeightProperty().bind(this.fxml_invoice_sale_list_table_tree.prefHeightProperty());
            this.fxml_invoice_sale_list_summary_table_column_name.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_invoice_type.widthProperty().add(this.fxml_invoice_sale_list_tree_table_column_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_parent_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_invoicing_date.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_name.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_nip.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_canceled.widthProperty()));
            this.fxml_invoice_sale_list_summary_table_column_name.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_invoice_type.widthProperty().add(this.fxml_invoice_sale_list_tree_table_column_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_parent_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_invoicing_date.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_name.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_nip.widthProperty().add(this.fxml_invoice_sale_list_tree_table_column_canceled.widthProperty())));
            this.fxml_invoice_sale_list_summary_table_column_sum_net.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_net.widthProperty());
            this.fxml_invoice_sale_list_summary_table_column_sum_net.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_net.widthProperty());
            this.fxml_invoice_sale_list_summary_table_column_sum_tax.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_tax.widthProperty());
            this.fxml_invoice_sale_list_summary_table_column_sum_tax.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_tax.widthProperty());
            this.fxml_invoice_sale_list_summary_table_column_sum_brut.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_brut.widthProperty());
            this.fxml_invoice_sale_list_summary_table_column_sum_brut.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_brut.widthProperty());
            this.fxml_invoice_sale_list_only_empty_period.selectedProperty().addListener(this.QIM);
            this.fxml_invoice_sale_list_canceled_invoices.selectedProperty().addListener(this.RAP);
        } catch (FFK var5) {
            log.error("Something bad happened", var5);
            FCT.IGX("", var5);
        }

    }

    public boolean HHB() {

        boolean var1;
        this.fxml_invoice_sale_list_extended_view.selectedProperty().removeListener(this.GOE);
        this.GOI = null;
        this.fxml_include_left_barController.HHB();
        this.fxml_include_top_menuController.HHB();
        this.QIM.QJN();
        this.fxml_invoice_sale_list_only_empty_period.setSelected(false);
        this.QIM.QJO();
        this.RAP.RKT();
        this.fxml_invoice_sale_list_canceled_invoices.setSelected(false);
        this.RAP.RKU();
        var1 = true;

        return var1;
    }

    private void HYO(boolean var1) {

        try {
            this.GOG.QJI();
            this.GOF.QJG();
            this.QIL.QJL();
            EVJ var2 = this.getProcess();
            this.GNU = var2.getPossibleDates();
            Calendar var3 = Calendar.getInstance();
            int var4 = var3.get(1);
            int var5 = var3.get(2);
            this.GOB = MonthType.getMonthByNumber(var5 + 1);
            this.GOA = String.valueOf(var4);
            if (this.GNU != null && this.GNU.get(this.GOA) == null) {
                this.GNU.put(this.GOA, new TreeSet());
            }

            if (this.GNU != null) {
                this.GNU.get(this.GOA).add(this.GOB);
            }

            this.fxml_invoice_sale_list_pagination.setPageCount(1);
            if (this.GNU != null) {
                this.fxml_invoice_sale_list_year_search.getItems().clear();
                this.fxml_invoice_sale_list_year.getItems().clear();
                if (this.GNU.keySet().size() > 0) {
                    this.fxml_invoice_sale_list_year.getItems().addAll(this.GNU.keySet());
                    this.fxml_invoice_sale_list_year.setValue(this.GOA);
                    this.fxml_invoice_sale_list_year_search.getItems().addAll(this.GNU.keySet());
                    this.fxml_invoice_sale_list_year_search.getItems().add(this.GNZ);
                    this.fxml_invoice_sale_list_year_search.setValue(this.GNZ);
                    this.setPossibleMonths(this.GOA, true);
                } else {
                    this.fxml_invoice_sale_list_pagination.setPageCount(1);
                }
            }

            this.fxml_invoice_sale_list_only_empty_period.setDisable(false);
            this.GOG.QJJ();
            this.GOF.QJH();
            this.QIL.QJM();
        } catch (FFO | FFK var9) {
            log.error("Something bad happened", var9);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetPossibleDatesError"), var9);
        }

    }

    private void setPossibleMonths(String var1, boolean var2) {

        boolean var3 = this.GOF.isDisabled();
        this.GOF.QJG();
        this.fxml_invoice_sale_list_month.getItems().clear();
        if (this.GNU.get(var1) != null) {
            this.fxml_invoice_sale_list_month.getItems().addAll(this.GNU.get(var1));
        }

        if (this.GOA.equals(var1) && var2) {
            this.fxml_invoice_sale_list_month.setValue(this.GOB);
        } else if (this.GNU.get(var1) != null && this.GNU.get(var1).size() > 0) {
            this.fxml_invoice_sale_list_month.setValue((MonthType) ((SortedSet) this.GNU.get(var1)).last());
        }

        if (!var3) {
            this.GOF.QJH();
        }

    }

    public void HHC() {

        try {
            this.fxml_include_left_barController.HHC();
            this.fxml_include_top_menuController.HHC();
            this.QIL.QJL();
            this.fxml_invoice_sale_list_searchController.fxml_component_main_element.setText("");
            this.QIL.QJM();
            this.HHG();
            this.HYO(this.GOI == null);

            this.fxml_invoice_sale_list_extended_view.selectedProperty().addListener(this.GOE);
            this.fxml_invoice_sale_list_scroll_pane.setVvalue(this.fxml_invoice_sale_list_scroll_pane.getVmin());
            this.GOG.setDontLoad(true);
            this.GOF.QJG();
            if (this.GOI != null && this.GOI.getYear() != null && this.GOI.getYear().getValue() != null && this.GOI.getMonth() != null && this.GOI.getMonth().getValue() != null) {
                if (this.GNU.get(String.valueOf(this.GOI.DDJ().getValue())) != null && this.GNU.get(String.valueOf(this.GOI.DDJ().getValue())).contains(MonthType.getMonthByNumber(this.GOI.DDK().getValue()))) {
                    this.fxml_invoice_sale_list_year.getSelectionModel().select(String.valueOf(this.GOI.DDJ().getValue()));
                    this.fxml_invoice_sale_list_month.getSelectionModel().select(MonthType.getMonthByNumber(this.GOI.DDK().getValue()));
                } else {
                    this.fxml_invoice_sale_list_year.getSelectionModel().select(this.GOA);
                    this.fxml_invoice_sale_list_month.getSelectionModel().select(this.GOB);
                }
            }

            this.GOG.setDontLoad(false);
            this.GOF.QJH();
            this.getInvoicesByPeriod();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var5) {
            log.error("Something bad happened", var5);
            FCT.IGX("", var5);
            this.HZB();
        } finally {
            this.HYS();

        }

    }

    public void setOnlyEmptyPeriod() {

        this.QIM.QJN();
        this.fxml_invoice_sale_list_only_empty_period.setSelected(true);
        this.QIM.QJO();

    }

    protected void getInvoicesByPeriod() {
        this.getInvoicesByPeriod(false);
    }

    protected void getInvoicesByPeriod(final boolean var1) {

        try {
            final MTI var2 = new MTI(null);
            this.fxml_invoice_sale_list_pagination.setPageCount(1);
            final Callback<Integer, Node> var3 = this::HYP;
            MSX var4 = new MSX(this.primaryStage, this.fxml_parent.disableProperty()) {
                public void MXI() {

                    try {
                        EVJ var1x = EVD.this.getProcess();
                        if (EVD.this.fxml_invoice_sale_list_only_empty_period.isSelected()) {
                            EVD.this.GOD = var1x.getInvoices(InvoiceFilteringType.ONLY_EMPTY, null, null, null, null);
                            return;
                        }

                        if (EVD.this.fxml_invoice_sale_list_canceled_invoices.isSelected()) {
                            EVD.this.GOD = var1x.getInvoices(InvoiceFilteringType.ONLY_CANCELED, null, null, null, null);
                            return;
                        }

                        if (EVD.this.fxml_invoice_sale_list_year.getValue() != null && EVD.this.fxml_invoice_sale_list_month.getValue() != null) {
                            EVD.this.GOD = var1x.getInvoices(InvoiceFilteringType.WITHOUT_EMPTY, Integer.valueOf(EVD.this.fxml_invoice_sale_list_year.getValue()), Integer.valueOf(EVD.this.fxml_invoice_sale_list_month.getValue().getMonthNumberString()), null, null);
                        }
                    } catch (FFO | FFK var6) {
                        log.error("Something bad happened", var6);
                        var2.setObject(var6);
                    } catch (Exception var7) {
                        log.error("Something bad happened", var7);
                        var2.setObject(var7);
                    }

                }

                public void MXJ() {
                    if (var2.getObject() == null) {
                        if (EVD.this.GOD.size() % 50 > 0) {
                            EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50 + 1);
                        } else {
                            EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50);
                        }

                        EVD.this.fxml_invoice_sale_list_pagination.setPageFactory(var3);
                        EVD.this.fxml_invoice_sale_list_pagination.setCurrentPageIndex(0);
                        EVD.this.HYR();
                        EVD.this.GNY = false;
                        if (var1) {
                            EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.requestFocus();
                            if (EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.getText() != null) {
                                EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.selectPositionCaret(EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.getText().length());
                            }
                        } else {
                            EVD.this.fxml_parent.requestFocus();
                        }
                    } else {
                        FCT.IGX(EVD.this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), (Exception) var2.getObject());
                    }

                }
            };
            var4.MXH();
        } catch (FFK var8) {
            log.error("Something bad happened", var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), var8);
        }

    }

    protected void getInvoicesBySearch() {

        try {
            String var1 = this.fxml_invoice_sale_list_searchController.fxml_component_main_element.getText();
            if (var1 == null || var1.trim().length() < 3) {
                if (this.GNY) {
                    this.fxml_invoice_sale_list_month.setDisable(false);
                    this.fxml_invoice_sale_list_year.setDisable(false);
                    this.fxml_invoice_sale_list_only_empty_period.setDisable(false);
                    this.fxml_invoice_sale_list_canceled_invoices.setDisable(false);
                    this.getInvoicesByPeriod(true);
                }

                return;
            }

            final String var2 = var1.trim();
            this.fxml_invoice_sale_list_month.setDisable(true);
            this.fxml_invoice_sale_list_year.setDisable(true);
            this.fxml_invoice_sale_list_only_empty_period.setDisable(true);
            this.fxml_invoice_sale_list_canceled_invoices.setDisable(true);
            final Callback<Integer, Node> var3 = this::HYP;
            final MTI var4 = new MTI(null);
            MSX var5 = new MSX(this.primaryStage, this.fxml_parent.disableProperty()) {
                public void MXI() {

                    try {
                        EVJ var1 = EVD.this.getProcess();
                        if (EVD.this.fxml_invoice_sale_list_year_search.getValue().equals(EVD.this.GNZ)) {
                            EVD.this.GOD = var1.getInvoices(InvoiceFilteringType.ALL, null, null, var2, null);
                        } else {
                            EVD.this.GOD = var1.getInvoices(InvoiceFilteringType.WITHOUT_EMPTY, Integer.valueOf(EVD.this.fxml_invoice_sale_list_year_search.getValue()), null, var2, null);
                        }
                    } catch (FFK | FFO | NumberFormatException var6) {
                        log.error("Something bad happened", var6);
                        var4.setObject(var6);
                    } catch (Exception var7) {
                        log.error("Something bad happened", var7);
                        var4.setObject(var7);
                    }

                }

                public void MXJ() {
                    if (var4.getObject() == null) {
                        if (EVD.this.GOD.size() % 50 > 0) {
                            EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50 + 1);
                        } else {
                            EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50);
                        }

                        EVD.this.fxml_invoice_sale_list_pagination.setPageFactory(var3);
                        EVD.this.fxml_invoice_sale_list_pagination.setCurrentPageIndex(0);
                        EVD.this.HYR();
                        EVD.this.GNY = true;
                        EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.requestFocus();
                        if (EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.getText() != null) {
                            EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.selectPositionCaret(EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element.getText().length());
                        }
                    } else {
                        log.error("Something bad happened", (Throwable) var4.getObject());
                        FCT.IGX(EVD.this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), (Exception) var4.getObject());
                    }

                }
            };
            var5.MXH();
        } catch (FFK var9) {
            log.error("Something bad happened", var9);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), var9);
        }

    }

    private Node HYP(int var1) {

        VBox var3;
        this.GNX = var1;
        this.HYQ();
        this.setTableHeight();
        VBox var2 = new VBox(this.fxml_invoice_sale_list_table_tree, this.fxml_invoice_sale_list_summary_table);
        var3 = var2;

        return var3;
    }

    protected void HYQ() {
        if (this.GOD != null) {
            int var1 = this.GNX * 50;
            int var2 = Math.min(var1 + 50, this.GOD.size());
            TreeItem var3 = new TreeItem(new EVG(0, null, "Faktury", null, null, null, null, null, null, null, null, false, false));
            List var4 = this.GOD.subList(var1, var2);
            Iterator var5 = var4.iterator();

            while (true) {
                while (var5.hasNext()) {
                    EPA var6 = (EPA) var5.next();
                    String var7;
                    if (EOZ.HOD(var6)) {
                        var7 = this.resources.getString("micro.process.common.invoices.InvoiceSellCorrection");
                    } else {
                        var7 = this.resources.getString("micro.process.common.invoices.InvoiceSell");
                    }

                    LocalDate var8 = null;
                    if (var6.getInvoicingDate() != null) {
                        var8 = var6.getInvoicingDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    }

                    EVG var9 = new EVG(var6.getNr(), var8, var6.getRefId(), var6.getParentRefId(), var6.getContractorName(), var6.getContractorNip(), var6.getSumNet(), var6.getSumTax(), var6.getSumBrut(), var6.getInvoiceWrapper(), var7, false, false);
                    TreeItem var10 = new TreeItem(var9);
                    EDF var11 = var6.getInvoiceWrapper();
                    ArrayList var12 = new ArrayList();
                    var12.add(var6.getInvoiceWrapper());
                    if (!this.GNW) {
                        var3.getChildren().add(var10);
                    } else {
                        while ((var11 = (EDF) var11.getParentWrapperWithCanceledState()) != null) {
                            var12.add(0, var11);
                        }

                        var11 = var6.getInvoiceWrapper();

                        while ((var11 = (EDF) var11.getChildWrapperWithCanceledState()) != null) {
                            var12.add(var11);
                        }

                        if (var12.size() > 1) {
                            int var13 = 0;
                            Iterator var14 = var12.iterator();

                            while (var14.hasNext()) {
                                EDF var15 = (EDF) var14.next();
                                ++var13;
                                Date var16 = (Date) var15.getValue("business_invoicingDate");
                                LocalDate var17 = null;
                                if (var16 != null) {
                                    var17 = var16.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                }

                                String var18 = (String) var15.getValue("business_refid");
                                String var19 = (String) var15.getValue("business_contractorName");
                                String var20 = (String) var15.getValue("business_contractorNIP");
                                BigDecimal var21 = (BigDecimal) var15.getValue("business_netValue");
                                BigDecimal var22 = (BigDecimal) var15.getValue("business_grossValue");
                                BigDecimal var23 = var22.subtract(var21);
                                if (EOZ.HOD(var15)) {
                                    var7 = this.resources.getString("micro.process.common.invoices.InvoiceSellCorrection");
                                } else {
                                    var7 = this.resources.getString("micro.process.common.invoices.InvoiceSell");
                                }

                                EDF var24;
                                for (var24 = var15; var24.getParentWrapperWithCanceledState() != null; var24 = (EDF) var24.getParentWrapperWithCanceledState()) {
                                }

                                String var25 = null;
                                if (var24 != var15) {
                                    var25 = (String) var24.getValue("business_refid");
                                }

                                boolean var26 = var15 == var6.getInvoiceWrapper();

                                EVG var27 = new EVG(var13, var17, var18, var25, var19, var20, var21, var23, var22, var15, var7, var26, true);
                                TreeItem var28 = new TreeItem(var27);
                                var10.expandedProperty().addListener(this.GOH);
                                var10.getChildren().add(var28);
                            }
                        }

                        var3.getChildren().add(var10);
                    }
                }

                this.fxml_invoice_sale_list_table_tree.setRoot(var3);
                return;
            }
        }
    }

    private void setTableHeight() {
        this.fxml_invoice_sale_list_table_tree.setPrefHeight(this.fxml_invoice_sale_list_table_tree.getFixedCellSize() * ((double) this.fxml_invoice_sale_list_table_tree.getExpandedItemCount() + 1.2));
    }

    @FXML
    protected void fxml_handleButton_back(ActionEvent var1) {

        log.info("Button [back] clicked");
        this.getApplication().initController(this.getFxmlName(), "main.fxml", null);

    }

    @FXML
    protected void fxml_handleButton_invoice_sale_list_edit(ActionEvent var1) {

        try {
            log.info("Button [invoice_edit] clicked");
            final Invoice var2 = ((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
            this.getApplication().initController(this.getFxmlName(), Stage.INVOICE_SALE_NEW.getProcessFxmlFileName(), new Consumer<ENN<?>>() {
                public void accept(ENN<?> var1) {

                    try {
                        if (EOZ.HOD(var2)) {
                            var1.setInvoice(var2);
                            var1.setMode(Mode.EDIT_CORRECTION);
                        } else {
                            var1.setInvoice(var2);
                            var1.setMode(Mode.EDIT);
                        }
                    } catch (FFK var6) {
                        log.error("Something bad happened", var6);
                        throw new FFI(var6);
                    }

                }
            });
        } catch (FFK var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    @FXML
    protected void fxml_handleButton_invoice_sale_list_correct(ActionEvent var1) {

        try {
            log.info("Button [invoice_correct] clicked");
            final InvoiceSell var2 = (InvoiceSell) ((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
            this.getApplication().initController(this.getFxmlName(), Stage.INVOICE_SALE_NEW.getProcessFxmlFileName(), new Consumer<ENN<?>>() {
                public void accept(ENN<?> var1) {

                    try {
                        var1.setInvoice(var2);
                        var1.setMode(Mode.CORRECT);
                    } catch (FFK var6) {
                        log.error("Something bad happened", var6);
                        throw new FFI(var6);
                    }

                }
            });
        } catch (FFK var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    @FXML
    protected void fxml_handleButton_invoice_sale_list_view(ActionEvent var1) {

        try {
            log.info("Button [invoice_view] clicked");
            final Invoice var2 = ((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
            this.getApplication().initController(this.getFxmlName(), Stage.INVOICE_SALE_NEW.getProcessFxmlFileName(), new Consumer<ENN<?>>() {
                public void accept(ENN<?> var1) {

                    try {
                        if (EOZ.HOD(var2)) {
                            var1.setInvoice(var2);
                            var1.setMode(Mode.VIEW_CORRECTION);
                        } else {
                            var1.setInvoice(var2);
                            var1.setMode(Mode.VIEW);
                        }
                    } catch (FFK var6) {
                        log.error("Something bad happened", var6);
                        throw new FFI(var6);
                    }

                }
            });
        } catch (FFK var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    @FXML
    protected void fxml_handleButton_invoice_sale_list_set_receive_date(ActionEvent var1) {

        try {
            log.info("Button [TODO_set_receive_date] clicked");
            FXMLLoader var2 = new FXMLLoader();
            var2.setLocation(EVD.class.getResource("/fxml/invoice_sale_list_set_receive_date.fxml"));
            var2.setResources(this.resources);
            AnchorPane var3 = null;

            try {
                var3 = var2.load();
            } catch (IOException var15) {
                log.error("Something bad happened", var15);
                throw FCZ.getInstance().IHI(new File("/fxml/invoice_sale_list_set_receive_date.fxml"));
            }

            javafx.stage.Stage var4 = new javafx.stage.Stage();
            var4.setTitle(this.resources.getString("micro.process.invoice_sale_list.SetInvoicingDate.title"));
            var4.initModality(Modality.WINDOW_MODAL);
            var4.initOwner(this.primaryStage);
            Scene var5 = new Scene(var3);
            var4.setScene(var5);
            var4.setResizable(false);
            var4.getIcons().add(new Image("/img/app/e_logo.png"));
            EVH var6 = var2.getController();
            var6.setDialogStage(var4);
            var6.setResources(this.resources);
            var6.setParentController(this);
            var6.setImplematation(this.getProcess());
            InvoiceSellCorrection var7 = (InvoiceSellCorrection) ((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
            var7.setPreviousPeriod(var7.getPeriod().DDN());
            var6.setInvoiceSellCorrection(var7);
            var6.HZC();
            var4.showAndWait();
            if (var6.HZD() && var6.fxml_invoicing_date_dateController.fxml_component_main_element.getValue() != null) {
                Date var8 = Date.from(var6.fxml_invoicing_date_dateController.fxml_component_main_element.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                var7.setInvoicingDate(new InvoicingDate(var8));
                Period var9 = new Period(var8);
                var7.setPeriod(var9);
                var7.setUsingInvoicingDate(new PrivtePerson(true));
                EVJ var10 = this.getProcess();
                if (var10 == null) {
                    throw FCZ.getInstance().IHJ();
                }

                var10.HZE(var7);
            }

            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var16) {
            log.error("Something bad happened", var16);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.InvoiceSetInvoicingDate"), var16);
        } finally {
            this.HYO(true);
            this.HYS();
            this.getInvoicesByPeriod();

        }

    }

    @FXML
    protected void fxml_invoice_sale_list_button_print(ActionEvent var1) {

        try {
            log.info("Button [print] clicked");
            Invoice var2 = null;

            try {
                var2 = ((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
            } catch (FFK var11) {
                log.error("Something bad happened", var11);
                FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.InvoiceLoading"), var11);
            }

            if (var2 != null) {
                EVJ var3;
                File var4;
                UserData var5;
                if (EOZ.HOD(var2)) {
                    var3 = this.getProcess();
                    var4 = var3.getTempFile("pdf");
                    var5 = var3.getUserDataForInvoice(var2);
                    EPI var6 = new EPI(this.resources, (InvoiceSellCorrection) var2, var5, var4);
                    var6.HOE();
                } else {
                    var3 = this.getProcess();
                    var4 = var3.getTempFile("pdf");
                    var5 = var3.getUserDataForInvoice(var2);
                    EPE var14 = new EPE(this.resources, (InvoiceSell) var2, var5, var4);
                    var14.HOE();
                }
            }
        } catch (FFO | FFK var12) {
            log.error("Something bad happened", var12);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.PrintError"), var12);
        }

    }

    @FXML
    protected void fxml_invoice_sale_list_button_cancel(ActionEvent var1) {

        try {
            log.info("Button [cancel] clicked");
            DialogButton var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.invoice_sale_list.Dialog.deleteAreYouSure.title"), null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.invoice_sale_list.Dialog.deleteAreYouSure.header"));
            switch (var2) {
                case Confirm:
                    this.getProcess().RKY(((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice());
                    log.info("Invoice cancelled");
                    if (this.GNY) {
                        this.getInvoicesBySearch();
                    } else {
                        this.getInvoicesByPeriod();
                    }
                case Reject:
                case CancelExit:
            }
        } catch (FFO | FFK var6) {
            log.error("Something bad happened", var6);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.error.cancel"), var6);
        }

    }

    @FXML
    protected void fxml_invoice_sale_list_button_new_invoice(ActionEvent var1) {

        log.info("Button [new_invoice] clicked");
        this.getApplication().initController(this.getFxmlName(), Stage.INVOICE_SALE_NEW.getProcessFxmlFileName(), new Consumer<ENN<?>>() {
            public void accept(ENN<?> var1) {

                var1.setMode(Mode.NEW);

            }
        });

    }

    private void HYR() {

        BigDecimal var1 = new BigDecimal(0);
        BigDecimal var2 = new BigDecimal(0);
        BigDecimal var3 = new BigDecimal(0);
        EPA var5;
        if (this.GOD != null) {
            for (Iterator var4 = this.GOD.iterator(); var4.hasNext(); var3 = var3.add(var5.getSumTax())) {
                var5 = (EPA) var4.next();
                var1 = var1.add(var5.getSumNet());
                var2 = var2.add(var5.getSumBrut());
            }
        }

        this.GOC.get().clear();
        EOX var9 = new EOX(this.resources.getString("micro.process.invoice_sale_new.SummaryTaxRow"), var1, var3, var2);
        this.GOC.add(var9);

    }

    private void setEditDisable(boolean var1, String var2) {

        this.fxml_invoice_sale_list_button_edit.setDisable(var1);
        this.fxml_invoice_sale_list_button_edit_error_label.setText(var2);

    }

    private void setViewDisable(boolean var1, String var2) {

        this.fxml_invoice_sale_list_button_view.setDisable(var1);
        this.fxml_invoice_sale_list_button_view_error_label.setText(var2);

    }

    private void setCorrectDisable(boolean var1, String var2) {

        this.fxml_invoice_sale_list_button_correct.setDisable(var1);
        this.fxml_invoice_sale_list_button_correct_error_label.setText(var2);

    }

    private void setChangeReceiveDateDisable(boolean var1, String var2) {

        this.fxml_invoice_sale_list_button_set_receive_date.setVisible(!var1);
        this.fxml_invoice_sale_list_button_set_receive_date_error_label.setVisible(!var1);
        this.fxml_invoice_sale_list_button_set_receive_date_error_label.setText(var2);

    }

    private void setPrintDisable(boolean var1) {

        this.fxml_invoice_sale_list_button_print.setDisable(var1);

    }

    private void setCancelDisable(boolean var1) {

        this.fxml_invoice_sale_list_button_cancel.setDisable(var1);

    }

    private void HYS() {

        if (this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedIndex() != -1) {
            EDF var1 = ((EVG) ((TreeItem) this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice();
            if (var1 == null) {
                this.setAllDisabled();
                return;
            }

            EVE var2 = this.HYV(var1);
            if (var2.HYN()) {
                this.setCorrectDisable(false, null);
            } else {
                this.setCorrectDisable(true, var2.getText());
            }

            var2 = this.HYT(var1);
            if (var2.HYN()) {
                this.setEditDisable(false, null);
            } else {
                this.setEditDisable(true, var2.getText());
            }

            var2 = this.HYU(var1);
            if (var2.HYN()) {
                this.setViewDisable(false, null);
            } else {
                this.setViewDisable(true, var2.getText());
            }

            var2 = this.HYW(var1);
            if (var2.HYN()) {
                this.setChangeReceiveDateDisable(false, null);
            } else {
                this.setChangeReceiveDateDisable(true, var2.getText());
            }

            var2 = this.HYX(var1);
            this.setPrintDisable(!var2.HYN());

            var2 = this.RKX(var1);
            this.setCancelDisable(!var2.HYN());

            return;
        }

        this.setAllDisabled();

    }

    private void setAllDisabled() {
        this.setCorrectDisable(true, null);
        this.setEditDisable(true, null);
        this.setViewDisable(true, null);
        this.setChangeReceiveDateDisable(true, null);
        this.setPrintDisable(true);
        this.setCancelDisable(true);
    }

    private EVE HYT(EDF<BaseInvoiceSell> var1) {

        EVE var3;
        if (var1.getState().equals(InvoiceState.CANCELED)) {
            EVE var10 = new EVE(false, null);
            return var10;
        }

        boolean var2 = false;

        try {
            var2 = this.HYY(var1);
        } catch (FFO | FFK var8) {
            log.error("Something bad happened", var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"), var8);
            EVE var4 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"));
            return var4;
        }

        if (!var2) {
            if (var1.getChildWrapperOnlyActiveState() == null) {
                var3 = new EVE(true, null);
                return var3;
            }

            var3 = new EVE(false, null);
            return var3;
        }

        var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.PossibleResult.SettlementSetted"));

        return var3;
    }

    private EVE RKX(EDF<BaseInvoiceSell> var1) {

        EVE var3;
        boolean var2 = false;

        try {
            var2 = this.HYY(var1);
        } catch (FFO | FFK var8) {
            log.error("Something bad happened", var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"), var8);
            EVE var4 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"));
            return var4;
        }

        if (var2) {
            var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.error.CantCancelSettledInvoice"));
            return var3;
        }

        if (!var1.getState().equals(InvoiceState.CANCELED)) {
            if (var1.getChildWrapperOnlyActiveState() != null) {
                var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.error.CantCancelInvoiceWithChildren"));
                return var3;
            }

            var3 = new EVE(true, null);
            return var3;
        }

        var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.error.CantCancelCanceledInvoice"));

        return var3;
    }

    private EVE HYU(EDF<BaseInvoiceSell> var1) {

        EVE var2;
        if (!var1.getState().equals(InvoiceState.CANCELED) || !EOZ.HOD(var1) || var1.getParentWrapperOnlyActiveState() != null) {
            var2 = new EVE(true, null);
            return var2;
        }

        var2 = new EVE(false, null);

        return var2;
    }

    private EVE HYV(EDF<BaseInvoiceSell> var1) {

        EVE var2;
        if (!var1.getState().equals(InvoiceState.CANCELED)) {
            if (EOZ.HOD(var1)) {
                var2 = new EVE(false, null);
                return var2;
            }

            var2 = new EVE(true, null);
            return var2;
        }

        var2 = new EVE(false, null);

        return var2;
    }

    private EVE HYW(EDF<BaseInvoiceSell> var1) {

        EVE var2;
        if (var1.getState().equals(InvoiceState.CANCELED)) {
            var2 = new EVE(false, null);
            return var2;
        }

        if (!var1.getPeriod().equals(Period.AOE)) {
            var2 = new EVE(false, null);
            return var2;
        }

        var2 = new EVE(true, null);

        return var2;
    }

    private EVE HYX(EDF<BaseInvoiceSell> var1) {

        EVE var2;
        var2 = new EVE(true, null);

        return var2;
    }

    public boolean HYY(EDF<BaseInvoiceSell> var1) throws FFK, FFO {

        boolean var3;
        boolean var2 = this.HYZ(var1.getPeriod());
        var3 = var2;

        return var3;
    }

    public boolean HYZ(Period var1) throws FFK, FFO {

        boolean var4;
        EVJ var2 = this.getProcess();
        if (var2 == null) {
            throw FCZ.getInstance().IHJ();
        }

        SettlementStatus var3 = var2.getSettlementStatus(var1);
        if (var3 != SettlementStatus.SETTLED) {
            var4 = false;
            return var4;
        }

        var4 = true;

        return var4;
    }

    public boolean HZA(LocalDate var1) throws FFK, FFO {

        boolean var4;
        EVJ var2 = this.getProcess();
        if (var2 == null) {
            throw FCZ.getInstance().IHJ();
        }

        SettlementStatus var3 = var2.getSettlementStatus(var1);
        if (var3 != SettlementStatus.SETTLED) {
            var4 = false;
            return var4;
        }

        var4 = true;

        return var4;
    }

    private void HZB() {

        this.getApplication().initController(this.getFxmlName(), "main.fxml", null);

    }

    public void setExtendedView(boolean var1) {
        this.GNW = var1;
        this.HYQ();
        this.setTableHeight();
    }

    public void setPeriod(Period var1) throws FFK {

        this.GOI = var1;

    }

    public abstract class QTL<_T> implements ChangeListener<_T> {
        protected boolean RAO;

        public QTL() {
        }

        public void RKV() {
            this.RAO = true;
        }

        public void RKW() {
            this.RAO = false;
        }

        public boolean isDisabled() {
            return this.RAO;
        }
    }

    private class QTK implements ChangeListener<Boolean> {
        protected boolean RAN;

        private QTK() {
        }

        public void RKT() {
            this.RAN = true;
        }

        public void RKU() {
            this.RAN = false;
        }

        public boolean isDisabled() {
            return this.RAN;
        }

        public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {

            if (var3) {
                EVD.this.QIM.QJN();
                EVD.this.fxml_invoice_sale_list_only_empty_period.setSelected(false);
                EVD.this.QIM.QJO();
                EVD.this.fxml_invoice_sale_list_month.setDisable(true);
                EVD.this.fxml_invoice_sale_list_year.setDisable(true);
                if (!this.RAN) {
                    EVD.this.getInvoicesByPeriod();
                }
            } else {
                EVD.this.fxml_invoice_sale_list_month.setDisable(false);
                EVD.this.fxml_invoice_sale_list_year.setDisable(false);
                if (!this.RAN) {
                    EVD.this.getInvoicesByPeriod();
                }
            }

            log.info("Cancelled checkbox changed to " + var3);

        }
    }

    private class QHE implements ChangeListener<Boolean> {
        protected boolean QIK;

        private QHE() {
        }

        public void QJN() {
            this.QIK = true;
        }

        public void QJO() {
            this.QIK = false;
        }

        public boolean isDisabled() {
            return this.QIK;
        }

        public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {

            if (var3) {
                EVD.this.RAP.RKT();
                EVD.this.fxml_invoice_sale_list_canceled_invoices.setSelected(false);
                EVD.this.RAP.RKU();
                EVD.this.fxml_invoice_sale_list_month.setDisable(true);
                EVD.this.fxml_invoice_sale_list_year.setDisable(true);
                if (!this.QIK) {
                    EVD.this.getInvoicesByPeriod();
                }
            } else {
                EVD.this.fxml_invoice_sale_list_month.setDisable(false);
                EVD.this.fxml_invoice_sale_list_year.setDisable(false);
                if (!this.QIK) {
                    EVD.this.getInvoicesByPeriod();
                }
            }

            log.info("Unsettled checkbox changed to " + var3);

        }
    }

    private class QHD implements ChangeListener<String> {
        protected boolean QIJ;

        private QHD() {
        }

        public void QJL() {
            this.QIJ = true;
        }

        public void QJM() {
            this.QIJ = false;
        }

        public boolean isDisabled() {
            return this.QIJ;
        }

        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

            if (var3 != null && !this.QIJ) {
                EVD.this.getInvoicesBySearch();
            }

        }
    }

    private class QHC implements ChangeListener<String> {
        protected boolean QII;
        private boolean QIH;

        private QHC() {
            this.QIH = false;
        }

        public void QJI() {
            this.QII = true;
        }

        public void QJJ() {
            this.QII = false;
        }

        public boolean isDisabled() {
            return this.QII;
        }

        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

            if (var3 != null && !this.QII) {
                EVD.this.setPossibleMonths(var3, false);
                if (!this.QIH) {
                    EVD.this.getInvoicesByPeriod();
                }
            }

        }

        public void setDontLoad(boolean var1) {
            this.QIH = var1;
        }
    }

    private class QHB implements ChangeListener<MonthType> {
        protected boolean QIG;

        private QHB() {
        }

        public void QJG() {
            this.QIG = true;
        }

        public void QJH() {
            this.QIG = false;
        }

        public boolean isDisabled() {
            return this.QIG;
        }

        public void changed(ObservableValue<? extends MonthType> var1, MonthType var2, MonthType var3) {

            if (var3 != null && !this.QIG) {
                EVD.this.getInvoicesByPeriod();
            }

        }
    }

    private class EVE {
        private final boolean GNR;
        private final String GNS;

        public EVE(boolean var2, String var3) {
            this.GNR = var2;
            this.GNS = var3;
        }

        public boolean HYN() {
            return this.GNR;
        }

        public String getText() {
            return this.GNS;
        }
    }
}
