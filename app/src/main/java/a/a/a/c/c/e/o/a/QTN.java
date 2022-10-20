package a.a.a.c.c.e.o.a;

import a.a.a.b.c.DialogButton;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.ENI;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.d.a.ENO;
import a.a.a.c.c.d.a.QUV;
import a.a.a.c.c.d.d.EOG;
import a.a.a.c.c.d.d.EOK;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.d.QUZ;
import a.a.a.c.c.d.g.EOX;
import a.a.a.c.c.d.g.Mode;
import a.a.a.c.c.d.n.QVB;
import a.a.a.c.c.e.o.c.QTU;
import a.a.a.c.f.a.a.EZG;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.MonthType;
import a.a.a.c.f.b.c.a.InvoiceState;
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
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import java.math.BigDecimal;
import java.util.*;

public class QTN extends ENO<QTU> {
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private ScrollPane fxml_other_purchase_list_scroll_pane;
    @FXML
    private Button fxml_other_purchase_list_button_new_other;
    @FXML
    private ComboBox<MonthType> fxml_other_purchase_list_month;
    @FXML
    private ComboBox<String> fxml_other_purchase_list_year;
    @FXML
    private EZG fxml_other_purchase_list_searchController;
    @FXML
    private ComboBox<String> fxml_other_purchase_list_year_search;
    @FXML
    private Label fxml_other_purchase_list_button_error_label;
    @FXML
    private TableView<QVB<InvoiceOtherPurchase>> fxml_other_purchase_list_table;
    @FXML
    private TableColumn<QVB<InvoiceOtherPurchase>, Date> fxml_other_purchase_list_table_column_invoicing_date;
    @FXML
    private TableColumn<QVB<InvoiceOtherPurchase>, String> fxml_other_purchase_list_table_column_ref_id;
    @FXML
    private TableColumn<QVB<InvoiceOtherPurchase>, InvoiceOtherSubtype> fxml_other_purchase_list_table_column_other_type;
    @FXML
    private TableColumn<QVB<InvoiceOtherPurchase>, BigDecimal> fxml_other_purchase_list_table_column_sum_net;
    @FXML
    private TableColumn<QVB<InvoiceOtherPurchase>, BigDecimal> fxml_other_purchase_list_table_column_sum_tax;
    @FXML
    private TableColumn<QVB<InvoiceOtherPurchase>, BigDecimal> fxml_other_purchase_list_table_column_sum_brut;
    @FXML
    private TableView<EOX<String>> fxml_other_purchase_list_summary_table;
    @FXML
    private TableColumn<EOX<String>, String> fxml_other_purchase_list_summary_table_column_name;
    @FXML
    private TableColumn<EOX<String>, BigDecimal> fxml_other_purchase_list_summary_table_column_sum_net;
    @FXML
    private TableColumn<EOX<String>, BigDecimal> fxml_other_purchase_list_summary_table_column_sum_tax;
    @FXML
    private TableColumn<EOX<String>, BigDecimal> fxml_other_purchase_list_summary_table_column_sum_brut;
    @FXML
    private Pagination fxml_other_purchase_list_pagination;
    @FXML
    private Button fxml_other_purchase_list_button_view;
    @FXML
    private Button fxml_other_purchase_list_button_edit;
    @FXML
    private Button fxml_other_purchase_list_button_delete;
    private SortedMap<String, SortedSet<MonthType>> RBB = null;
    private Period RBC = null;
    private String RBD;
    private MonthType RBE;
    private String RBF;
    private static final int RBG = 50;
    private int RBH = 0;
    private List<QVB<InvoiceOtherPurchase>> RBI;
    private boolean RBJ = true;
    protected final ListProperty<EOX<String>> RBK = new SimpleListProperty(FXCollections.observableArrayList());
    private final QTO RBL = new QTO();
    private final QTP RBM = new QTP();
    private final QTQ RBN = new QTQ();

    public QTN(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);

    }

    @FXML
    public void initialize() {

        this.RBF = this.resources.getString("micro.process.other_purchase_list.SearchAll");
        this.fxml_other_purchase_list_table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<QVB<InvoiceOtherPurchase>>() {
            public void changed(ObservableValue<? extends QVB<InvoiceOtherPurchase>> var1, QVB<InvoiceOtherPurchase> var2, QVB<InvoiceOtherPurchase> var3) {
                if (var3 != null) {
                    QTN.this.RLN();
                } else {
                    QTN.this.setAllDisabled();
                }

            }
        });
        this.fxml_other_purchase_list_table_column_invoicing_date.setCellValueFactory(new PropertyValueFactory("invoicingDate"));
        this.fxml_other_purchase_list_table_column_ref_id.setCellValueFactory(new PropertyValueFactory("refId"));
        this.fxml_other_purchase_list_table_column_other_type.setCellValueFactory(new PropertyValueFactory("invoiceOtherSubType"));
        this.fxml_other_purchase_list_table_column_sum_net.setCellValueFactory(new PropertyValueFactory("sumNet"));
        this.fxml_other_purchase_list_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("sumTax"));
        this.fxml_other_purchase_list_table_column_sum_brut.setCellValueFactory(new PropertyValueFactory("sumBrut"));
        this.fxml_other_purchase_list_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
        this.fxml_other_purchase_list_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
        this.fxml_other_purchase_list_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
        this.fxml_other_purchase_list_month.setCellFactory(new EOQ());
        this.fxml_other_purchase_list_month.setButtonCell(this.fxml_other_purchase_list_month.getCellFactory().call(null));
        this.fxml_other_purchase_list_table.setFixedCellSize(30.0);
        this.fxml_other_purchase_list_table.setMinHeight(this.fxml_other_purchase_list_table.getFixedCellSize() * 2.0);
        this.fxml_other_purchase_list_table_column_other_type.setCellFactory(new EOG());
        this.fxml_other_purchase_list_table_column_invoicing_date.setCellFactory(new QUZ());
        this.fxml_other_purchase_list_summary_table_column_sum_net.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
                return ((EOX) var1.getValue()).getSumNet();
            }
        });
        this.fxml_other_purchase_list_summary_table_column_sum_tax.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
                return ((EOX) var1.getValue()).getSumTax();
            }
        });
        this.fxml_other_purchase_list_summary_table_column_sum_brut.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
                return ((EOX) var1.getValue()).getSumBrut();
            }
        });
        this.fxml_other_purchase_list_summary_table_column_name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<EOX<String>, String> var1) {
                return ((EOX) var1.getValue()).getTaxRate();
            }
        });
        this.fxml_other_purchase_list_summary_table.setItems(this.RBK);
        this.fxml_other_purchase_list_summary_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
        this.fxml_other_purchase_list_summary_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
        this.fxml_other_purchase_list_summary_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
        this.fxml_other_purchase_list_summary_table_column_name.minWidthProperty().bind(this.fxml_other_purchase_list_table_column_invoicing_date.widthProperty().add(this.fxml_other_purchase_list_table_column_ref_id.widthProperty()).add(this.fxml_other_purchase_list_table_column_other_type.widthProperty()));
        this.fxml_other_purchase_list_summary_table_column_name.maxWidthProperty().bind(this.fxml_other_purchase_list_table_column_invoicing_date.widthProperty().add(this.fxml_other_purchase_list_table_column_ref_id.widthProperty()).add(this.fxml_other_purchase_list_table_column_other_type.widthProperty()));
        this.fxml_other_purchase_list_summary_table_column_sum_net.minWidthProperty().bind(this.fxml_other_purchase_list_table_column_sum_net.widthProperty());
        this.fxml_other_purchase_list_summary_table_column_sum_net.maxWidthProperty().bind(this.fxml_other_purchase_list_table_column_sum_net.widthProperty());
        this.fxml_other_purchase_list_summary_table_column_sum_tax.minWidthProperty().bind(this.fxml_other_purchase_list_table_column_sum_tax.widthProperty());
        this.fxml_other_purchase_list_summary_table_column_sum_tax.maxWidthProperty().bind(this.fxml_other_purchase_list_table_column_sum_tax.widthProperty());
        this.fxml_other_purchase_list_summary_table_column_sum_brut.minWidthProperty().bind(this.fxml_other_purchase_list_table_column_sum_brut.widthProperty());
        this.fxml_other_purchase_list_summary_table_column_sum_brut.maxWidthProperty().bind(this.fxml_other_purchase_list_table_column_sum_brut.widthProperty());
        this.fxml_other_purchase_list_month.valueProperty().addListener(this.RBL);
        this.fxml_other_purchase_list_year.valueProperty().addListener(this.RBM);
        this.fxml_other_purchase_list_searchController.fxml_component_main_element.textProperty().addListener(this.RBN);

    }

    public void init() {

        try {
            super.init();
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public boolean HHB() {

        boolean var1;
        this.fxml_include_top_menuController.HHB();
        this.fxml_include_left_barController.HHB();
        var1 = true;

        return var1;
    }

    public void HHC() {

        try {
            this.fxml_include_top_menuController.HHC();
            this.fxml_include_left_barController.HHC();
            this.HHG();
            this.RLK(this.RBC == null);

            this.RBM.RLF();
            this.RBL.RLD();
            if (this.RBC != null && this.RBC.getYear() != null && this.RBC.getYear().getValue() != null && this.RBC.getMonth() != null && this.RBC.getMonth().getValue() != null) {
                org.slf4j.LoggerFactory.getLogger(getClass()).info("Initial period " + this.RBC);
                if (this.RBB.get(String.valueOf(this.RBC.DDJ().getValue())) != null && this.RBB.get(String.valueOf(this.RBC.DDJ().getValue())).contains(MonthType.getMonthByNumber(this.RBC.DDK().getValue()))) {
                    this.fxml_other_purchase_list_year.getSelectionModel().select(String.valueOf(this.RBC.DDJ().getValue()));
                    this.fxml_other_purchase_list_month.getSelectionModel().select(MonthType.getMonthByNumber(this.RBC.DDK().getValue()));
                } else {
                    this.fxml_other_purchase_list_year.getSelectionModel().select(this.RBD);
                    this.fxml_other_purchase_list_month.getSelectionModel().select(this.RBE);
                }
            }

            this.RBM.RLG();
            this.RBL.RLE();
            this.fxml_other_purchase_list_year.setDisable(false);
            this.getInvoicesByPeriod(false);
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public void setOnlyEmptyPeriod() {
    }

    public void setPeriod(Period var1) throws FFK {

        this.RBC = var1;

    }

    private void RLK(boolean var1) {

        try {
            this.RBM.RLF();
            this.RBL.RLD();
            this.RBN.RLH();
            QTU var2 = this.getProcess();
            this.RBB = var2.getPossibleDates();
            Calendar var3 = Calendar.getInstance();
            int var4 = var3.get(1);
            int var5 = var3.get(2);
            this.RBE = MonthType.getMonthByNumber(var5 + 1);
            this.RBD = String.valueOf(var4);
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Actual year: " + this.RBD + " Actual month: " + (var5 + 1));
            if (this.RBB.get(this.RBD) == null) {
                this.RBB.put(this.RBD, new TreeSet());
            }

            this.RBB.get(this.RBD).add(this.RBE);

            this.fxml_other_purchase_list_pagination.setPageCount(1);
            this.fxml_other_purchase_list_year_search.getItems().clear();
            this.fxml_other_purchase_list_year.getItems().clear();
            if (this.RBB.keySet().size() > 0) {
                this.fxml_other_purchase_list_year.getItems().addAll(this.RBB.keySet());
                this.fxml_other_purchase_list_year.setValue(this.RBD);
                this.fxml_other_purchase_list_year_search.getItems().addAll(this.RBB.keySet());
                this.fxml_other_purchase_list_year_search.getItems().add(this.RBF);
                this.fxml_other_purchase_list_year_search.setValue(this.RBF);
                this.setPossibleMonths(this.RBD, true);
            }

            this.RBM.RLG();
            this.RBL.RLE();
            this.RBN.RLI();
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.GetPossibleDatesError"), var9);
        }

    }

    protected void getInvoicesByPeriod(final boolean var1) {

        try {
            final Callback<Integer, Node> var2 = this::RLL;
            final MTI var3 = new MTI(null);
            MSX var4 = new MSX(this.primaryStage, this.fxml_parent.disableProperty()) {
                public void MXI() {
                    try {
                        QTN.this.RBI = QTN.this.getProcess().getInvoicesOtherPurchase(Integer.valueOf(QTN.this.fxml_other_purchase_list_year.getValue()), Integer.valueOf(QTN.this.fxml_other_purchase_list_month.getValue().getMonthNumberString()), null, InvoiceState.ACTIVE);
                    } catch (FFK | FFO | NumberFormatException var5) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
                        var3.setObject(var5);
                    }

                }

                public void MXJ() {
                    if (var3.getObject() == null) {
                        if (QTN.this.RBI.size() % 50 > 0) {
                            QTN.this.fxml_other_purchase_list_pagination.setPageCount(QTN.this.RBI.size() / 50 + 1);
                        } else {
                            QTN.this.fxml_other_purchase_list_pagination.setPageCount(QTN.this.RBI.size() / 50);
                        }

                        QTN.this.fxml_other_purchase_list_pagination.setPageFactory(var2);
                        QTN.this.fxml_other_purchase_list_pagination.setCurrentPageIndex(0);
                        if (var1) {
                            QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.requestFocus();
                            if (QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText() != null) {
                                QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.selectPositionCaret(QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText().length());
                            }
                        } else {
                            QTN.this.fxml_parent.requestFocus();
                        }

                        QTN.this.RLT();
                        QTN.this.RBJ = false;
                        if (var1) {
                            QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.requestFocus();
                            if (QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText() != null) {
                                QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.selectPositionCaret(QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText().length());
                            }
                        } else {
                            QTN.this.fxml_parent.requestFocus();
                        }
                    } else {
                        FCT.IGX(QTN.this.resources.getString("micro.process.other_purchase_list.Error.GetInvoicesError"), (Exception) var3.getObject());
                    }

                }
            };
            var4.MXH();
        } catch (FFK var8) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoicesError"), var8);
        }

    }

    private void getInvoicesBySearch() {

        try {
            String var1 = this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText();
            if (var1 == null || var1.trim().length() < 3) {
                if (this.RBJ) {
                    this.fxml_other_purchase_list_month.setDisable(false);
                    this.fxml_other_purchase_list_year.setDisable(false);
                    this.getInvoicesByPeriod(true);
                }

                return;
            }

            final String var2 = var1.trim();
            this.fxml_other_purchase_list_month.setDisable(true);
            this.fxml_other_purchase_list_year.setDisable(true);
            final Callback<Integer, Node> var3 = this::RLL;
            final MTI var4 = new MTI(null);
            MSX var5 = new MSX(this.primaryStage, this.fxml_parent.disableProperty()) {
                public void MXI() {

                    try {
                        if (QTN.this.fxml_other_purchase_list_year_search.getValue().equals(QTN.this.RBF)) {
                            QTN.this.RBI = QTN.this.getProcess().getInvoicesOtherPurchase(null, null, var2, null);
                        } else {
                            QTN.this.RBI = QTN.this.getProcess().getInvoicesOtherPurchase(Integer.valueOf(QTN.this.fxml_other_purchase_list_year.getValue()), null, var2, null);
                        }
                    } catch (Exception var5) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
                        var4.setObject(var5);
                    }

                }

                public void MXJ() {
                    if (QTN.this.RBI.size() % 50 > 0) {
                        QTN.this.fxml_other_purchase_list_pagination.setPageCount(QTN.this.RBI.size() / 50 + 1);
                    } else {
                        QTN.this.fxml_other_purchase_list_pagination.setPageCount(QTN.this.RBI.size() / 50);
                    }

                    QTN.this.fxml_other_purchase_list_pagination.setPageFactory(var3);
                    QTN.this.fxml_other_purchase_list_pagination.setCurrentPageIndex(0);
                    QTN.this.RBJ = true;
                    QTN.this.RLT();
                    QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.requestFocus();
                    if (QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText() != null) {
                        QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.selectPositionCaret(QTN.this.fxml_other_purchase_list_searchController.fxml_component_main_element.getText().length());
                    }

                }
            };
            var5.MXH();
        } catch (FFK | NumberFormatException var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            FCT.IGX(this.resources.getString("micro.process.other_purchase_list.Error.GetInvoicesError"), var9);
        }

    }

    private void setPossibleMonths(String var1, boolean var2) {

        boolean var3 = this.RBL.isDisabled();
        this.RBL.RLD();
        this.fxml_other_purchase_list_month.getItems().clear();
        if (this.RBB.get(var1) != null) {
            this.fxml_other_purchase_list_month.getItems().addAll(this.RBB.get(var1));
        }

        if (this.RBD.equals(var1) && var2) {
            this.fxml_other_purchase_list_month.setValue(this.RBE);
        } else if (this.RBB.get(var1) != null && this.RBB.get(var1).size() > 0) {
            this.fxml_other_purchase_list_month.setValue((MonthType) ((SortedSet) this.RBB.get(var1)).last());
        }

        if (!var3) {
            this.RBL.RLE();
        }

    }

    private Node RLL(int var1) {

        VBox var3;
        this.RBH = var1;
        this.RLM();
        this.setTableHeight();
        VBox var2 = new VBox(this.fxml_other_purchase_list_table, this.fxml_other_purchase_list_summary_table);
        var3 = var2;

        return var3;
    }

    private void setTableHeight() {

        this.fxml_other_purchase_list_table.setPrefHeight(this.fxml_other_purchase_list_table.getFixedCellSize() * ((double) this.fxml_other_purchase_list_table.getItems().size() + 1.2));

    }

    private void RLM() {

        if (this.RBI == null) {
            return;
        }

        int var1 = this.RBH * 50;
        int var2 = Math.min(var1 + 50, this.RBI.size());
        List var3 = this.RBI.subList(var1, var2);
        this.fxml_other_purchase_list_table.setItems(FXCollections.observableArrayList(var3));
        this.fxml_other_purchase_list_table.refresh();

    }

    private void RLN() {

        if (this.fxml_other_purchase_list_table.getSelectionModel().getSelectedIndex() == -1) {
            this.setAllDisabled();
            return;
        }

        QVB var1 = this.fxml_other_purchase_list_table.getSelectionModel().getSelectedItem();
        if (var1 == null) {
            this.setAllDisabled();
            return;
        }

        QTR var2 = this.RLO(var1);
        if (var2.RLJ()) {
            this.setEditDisable(false, null);
        } else {
            this.setEditDisable(true, var2.getText());
        }

        var2 = this.RLP(var1);
        if (var2.RLJ()) {
            this.setViewDisable(false, null);
        } else {
            this.setViewDisable(true, var2.getText());
        }

        var2 = this.RLQ(var1);
        if (var2.RLJ()) {
            this.setDeleteDisable(false, null);
        } else {
            this.setDeleteDisable(true, var2.getText());
        }

    }

    private void setAllDisabled() {

        this.setEditDisable(true, null);
        this.setViewDisable(true, null);
        this.setDeleteDisable(true, null);

    }

    private void setEditDisable(boolean var1, String var2) {

        this.fxml_other_purchase_list_button_edit.setDisable(var1);
        this.fxml_other_purchase_list_button_error_label.setText(var2);

    }

    private void setViewDisable(boolean var1, String var2) {

        this.fxml_other_purchase_list_button_view.setDisable(var1);
        this.fxml_other_purchase_list_button_error_label.setText(var2);

    }

    private void setDeleteDisable(boolean var1, String var2) {

        this.fxml_other_purchase_list_button_delete.setDisable(var1);
        this.fxml_other_purchase_list_button_error_label.setText(var2);

    }

    private QTR RLO(QVB<InvoiceOtherPurchase> var1) {

        if (var1.getState().equals(InvoiceState.CANCELED)) {
            QTR var10 = new QTR(false, null);
            return var10;
        } else {
            boolean var2 = false;

            try {
                var2 = this.RLR(var1);
            } catch (FFO | FFK var8) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                FCT.IGX(this.resources.getString("micro.process.other_purchase_list.Error.GetInvoiceSettlement"), var8);
                QTR var4 = new QTR(false, this.resources.getString("micro.process.other_purchase_list.Error.GetInvoiceSettlement"));
                return var4;
            }

            QTR var3;
            if (var2) {
                var3 = new QTR(false, this.resources.getString("micro.process.other_purchase_list.PossibleResult.SettlementSetted"));
                return var3;
            } else {
                var3 = new QTR(true, null);
                return var3;
            }
        }
    }

    private QTR RLP(QVB<InvoiceOtherPurchase> var1) {

        QTR var2;
        var2 = new QTR(true, null);

        return var2;
    }

    private QTR RLQ(QVB<InvoiceOtherPurchase> var1) {

        QTR var3;
        boolean var2 = false;

        try {
            var2 = this.RLR(var1);
        } catch (FFO | FFK var8) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
            FCT.IGX(this.resources.getString("micro.process.other_purchase_list.Error.GetInvoiceSettlement"), var8);
            QTR var4 = new QTR(false, this.resources.getString("micro.process.other_purchase_list.Error.GetInvoiceSettlement"));
            return var4;
        }

        if (var2) {
            var3 = new QTR(false, this.resources.getString("micro.process.other_purchase_list.PossibleResult.SettlementSetted"));
            return var3;
        }

        if (!var1.getState().equals(InvoiceState.CANCELED)) {
            var3 = new QTR(true, null);
            return var3;
        }

        var3 = new QTR(false, this.resources.getString("micro.process.other_purchase_list.error.CantCancelCanceledInvoice"));

        return var3;
    }

    public boolean RLR(QVB<InvoiceOtherPurchase> var1) throws FFK, FFO {

        boolean var3;
        boolean var2 = this.RLS(var1.getPeriod());
        var3 = var2;

        return var3;
    }

    public boolean RLS(Period var1) throws FFK, FFO {

        boolean var4;
        QTU var2 = this.getProcess();
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

    private void RLT() {

        BigDecimal var1 = new BigDecimal(0);
        BigDecimal var2 = new BigDecimal(0);
        BigDecimal var3 = new BigDecimal(0);
        QVB var5;
        if (this.RBI != null) {
            for (Iterator var4 = this.RBI.iterator(); var4.hasNext(); var3 = var3.add(var5.getSumTax())) {
                var5 = (QVB) var4.next();
                var1 = var1.add(var5.getSumNet());
                var2 = var2.add(var5.getSumBrut());
            }
        }

        this.RBK.get().clear();
        EOX var9 = new EOX(this.resources.getString("micro.process.other_purchase_list.SummaryTaxRow"), var1, var3, var2);
        this.RBK.add(var9);

    }

    @FXML
    private void fxml_handleButton_other_purchase_list_view() {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [view] clicked");
        this.HHB();
        this.getApplication().initController(this.getFxmlName(), Stage.OTHER_PURCHASE_NEW.getProcessFxmlFileName(), new Consumer<QUV<?>>() {
            public void accept(QUV<?> var1) {

                try {
                    var1.setInvoice(((QVB) QTN.this.fxml_other_purchase_list_table.getSelectionModel().getSelectedItem()).getRealInvoice());
                    var1.setMode(Mode.VIEW);
                } catch (FFK var6) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    throw new FFI(var6);
                }

            }
        });

    }

    @FXML
    private void fxml_handleButton_other_purchase_list_edit() {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [edit] clicked");
        this.HHB();
        this.getApplication().initController(this.getFxmlName(), Stage.OTHER_PURCHASE_NEW.getProcessFxmlFileName(), new Consumer<QUV<?>>() {
            public void accept(QUV<?> var1) {

                try {
                    var1.setInvoice(((QVB) QTN.this.fxml_other_purchase_list_table.getSelectionModel().getSelectedItem()).getRealInvoice());
                    var1.setMode(Mode.EDIT);
                } catch (FFK var6) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    throw new FFI(var6);
                }

            }
        });

    }

    @FXML
    private void fxml_handleButton_other_purchase_list_delete() {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [delete] clicked");
            DialogButton var1 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.invoice_purchase_list.Dialog.deleteAreYouSure.title"), null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.other_purchase_list.Dialog.deleteAreYouSure.header"));
            switch (var1) {
                case Confirm:
                    this.getProcess().RLU((InvoiceOtherPurchase) ((QVB) this.fxml_other_purchase_list_table.getSelectionModel().getSelectedItem()).getRealInvoice());
                    if (this.RBJ) {
                        this.getInvoicesBySearch();
                    } else {
                        this.getInvoicesByPeriod(false);
                    }

                    org.slf4j.LoggerFactory.getLogger(getClass()).info("Invoice deleted");
                case Reject:
                case CancelExit:
            }
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    @FXML
    private void fxml_other_purchase_list_button_new_other_purchase() {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [PURCHASE_NEW_OTHER] clicked");
        this.getApplication().initController(this.getFxmlName(), Stage.OTHER_PURCHASE_NEW.getProcessFxmlFileName(), null);

    }

    private class QTR {
        private final boolean RAZ;
        private final String RBA;

        public QTR(boolean var2, String var3) {
            this.RAZ = var2;
            this.RBA = var3;
        }

        public boolean RLJ() {
            return this.RAZ;
        }

        public String getText() {
            return this.RBA;
        }
    }

    private class QTQ implements ChangeListener<String> {
        protected boolean RAY;

        private QTQ() {
        }

        public void RLH() {
            this.RAY = true;
        }

        public void RLI() {
            this.RAY = false;
        }

        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

            if (var3 != null && !this.RAY) {
                QTN.this.getInvoicesBySearch();
            }

        }
    }

    private class QTP implements ChangeListener<String> {
        protected boolean RAX;

        private QTP() {
        }

        public void RLF() {
            this.RAX = true;
        }

        public void RLG() {
            this.RAX = false;
        }

        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

            if (var3 != null && !this.RAX) {
                QTN.this.setPossibleMonths(var3, false);
                QTN.this.getInvoicesByPeriod(false);
            }

        }
    }

    private class QTO implements ChangeListener<MonthType> {
        protected boolean RAW;

        private QTO() {
        }

        public void RLD() {
            this.RAW = true;
        }

        public void RLE() {
            this.RAW = false;
        }

        public boolean isDisabled() {
            return this.RAW;
        }

        public void changed(ObservableValue<? extends MonthType> var1, MonthType var2, MonthType var3) {

            if (var3 != null && !this.RAW) {
                QTN.this.getInvoicesByPeriod(false);
            }

        }
    }
}
