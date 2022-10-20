package a.a.a.c.c.e.h.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.a.BaseProgressFxController;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENL;
import a.a.a.c.c.d.d.ENZ;
import a.a.a.c.c.d.d.b.EOB;
import a.a.a.c.c.e.h.c.ETV;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.KH;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import javafx.util.StringConverter;

import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

public class ETT extends BaseProgressFxController<ETV> {
    private static final int GIX = 12;
    private static final int GIY = 32;
    @FXML
    TableView<IR> fxml_cash_register_list;
    @FXML
    TableColumn<IR, Period> fxml_cash_register_list_period;
    @FXML
    TableColumn<IR, RefId> fxml_cash_register_list_ref_id;
    @FXML
    TableColumn<IR, JR> fxml_cash_register_list_net;
    @FXML
    TableColumn<IR, JR> fxml_cash_register_list_vat_amount;
    @FXML
    TableColumn<IR, JR> fxml_cash_register_list_gross;
    @FXML
    Button fxml_cash_register_list_button_view;
    @FXML
    Button fxml_cash_register_list_button_edit;
    @FXML
    Button fxml_cash_register_list_button_remove;
    @FXML
    private Pagination fxml_cash_register_list_pagination;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    private ComboBox<Integer> fxml_invoice_sale_list_month;
    @FXML
    private ComboBox<String> fxml_invoice_sale_list_year;
    @FXML
    private Label fxml_cash_register_list_button_edit_error_label;
    SimpleIntegerProperty GIZ = new SimpleIntegerProperty();
    private final BooleanProperty GJA = new SimpleBooleanProperty(false);
    ObservableList<IR> GJB;
    private int GJC = 0;
    private SortedMap<String, SortedSet<KH>> GJD;
    private Period GJF;
    private final ChangeListener<String> GJG = new ChangeListener<String>() {
        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
            ETT.this.setPossibleMonths(var3);
            ETT.this.HWG();
            ETT.this.HWD(0);
        }
    };
    private final ChangeListener<Integer> GJH = new ChangeListener<Integer>() {
        public void changed(ObservableValue<? extends Integer> var1, Integer var2, Integer var3) {
            ETT.this.HWG();
            ETT.this.HWD(0);
        }
    };
    Integer GJI = 0;

    public ETT(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);

    }

    public void init() throws FFK {

        super.init();
        this.GJB = FXCollections.observableArrayList();
        this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.cash_register_list.Title"));
        this.fxml_cash_register_list_button_view.disableProperty().bind(Bindings.isEmpty(this.fxml_cash_register_list.getSelectionModel().getSelectedItems()));
        this.fxml_cash_register_list_button_edit.disableProperty().bind(Bindings.isEmpty(this.fxml_cash_register_list.getSelectionModel().getSelectedItems()).or(this.GJA.not()));
        this.fxml_cash_register_list_button_remove.disableProperty().bind(Bindings.isEmpty(this.fxml_cash_register_list.getSelectionModel().getSelectedItems()).or(this.GJA.not()));
        this.fxml_cash_register_list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<IR>() {
            public void changed(ObservableValue<? extends IR> var1, IR var2, IR var3) {
                try {
                    if (var3 != null) {
                        boolean var4 = ETT.this.getProcess().HWH(var3.getCreationDate().getValueDate());
                        ETT.this.GJA.set(!var4);
                        if (var4) {
                            ETT.this.fxml_cash_register_list_button_edit_error_label.setText(ETT.this.resources.getString("micro.process.cash_register_list.Error.isSettled"));
                        } else {
                            ETT.this.fxml_cash_register_list_button_edit_error_label.setText("");
                        }
                    } else {
                        ETT.this.GJA.set(false);
                        ETT.this.fxml_cash_register_list_button_edit_error_label.setText("");
                    }
                } catch (FFO | FFK var5) {
                    FCT.IGX("", var5);
                }

            }
        });
        this.fxml_cash_register_list_period.setCellValueFactory(new PropertyValueFactory("period"));
        this.fxml_cash_register_list_period.setCellFactory(new ENZ());
        this.fxml_cash_register_list_ref_id.setCellValueFactory(new PropertyValueFactory("refId"));
        this.fxml_cash_register_list_ref_id.setCellFactory(new Callback<TableColumn<IR, RefId>, TableCell<IR, RefId>>() {
            public TableCell<IR, RefId> call(TableColumn<IR, RefId> var1) {
                return new TableCell<IR, RefId>() {
                    protected void updateItem(RefId var1, boolean var2) {
                        super.updateItem(var1, var2);
                        if (!var2 && var1 != null) {
                            this.setText(var1.getValue());
                        } else {
                            this.setText(null);
                        }

                    }
                };
            }
        });
        this.fxml_cash_register_list_net.setCellValueFactory(new PropertyValueFactory("net"));
        this.fxml_cash_register_list_net.setCellFactory(new EOB());
        this.fxml_cash_register_list_vat_amount.setCellValueFactory(new PropertyValueFactory("vat"));
        this.fxml_cash_register_list_vat_amount.setCellFactory(new EOB());
        this.fxml_cash_register_list_gross.setCellValueFactory(new PropertyValueFactory("gross"));
        this.fxml_cash_register_list_gross.setCellFactory(new EOB());
        this.fxml_cash_register_list.setItems(this.GJB);
        this.fxml_cash_register_list.setFixedCellSize(32.0);
        this.fxml_cash_register_list.prefHeightProperty().bind(this.fxml_cash_register_list.fixedCellSizeProperty().multiply(Bindings.size(this.fxml_cash_register_list.getItems()).add(1)));
        this.fxml_cash_register_list.maxHeightProperty().bind(this.fxml_cash_register_list.prefHeightProperty());
        this.fxml_cash_register_list_pagination.pageCountProperty().bind(this.GIZ);
        this.fxml_invoice_sale_list_month.setConverter(new StringConverter<Integer>() {
            public String toString(Integer var1) {
                if (var1 != null) {
                    return var1.equals(ETT.this.GJI) ? "-" : var1.toString();
                } else {
                    return "-";
                }
            }

            public Integer fromString(String var1) {
                throw new UnsupportedOperationException();
            }
        });
        this.fxml_cash_register_list_pagination.setPageFactory(new Callback<Integer, Node>() {
            public Node call(Integer var1) {
                return ETT.this.HWE(var1);
            }
        });

    }

    public boolean HHB() {

        boolean var1;
        this.GJB.clear();
        this.GJC = 0;
        this.fxml_include_top_menuController.HHB();
        this.fxml_include_left_barController.HHB();
        this.GJF = null;
        this.fxml_invoice_sale_list_year.valueProperty().removeListener(this.GJG);
        this.fxml_invoice_sale_list_month.valueProperty().removeListener(this.GJH);
        var1 = true;

        return var1;
    }

    public void HHC() {

        try {
            ETV var1 = this.HHG();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("implementation " + var1);
            this.HWD(this.GJC);
            this.fxml_parent.requestFocus();
            this.fxml_include_top_menuController.HHC();
            this.fxml_include_left_barController.HHC();
            this.HWF();
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            FCT.IGX("", var5);
        }

    }

    private void HWD(int var1) {

        try {
            this.GJC = var1;
            this.GJB.clear();
            int var2 = 12 * this.GJC;
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("currentPage " + this.GJC);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("pageOffset " + var2);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("RECORDS_PER_PAGE 12");
            ValueContainer2 var3 = this.getProcess().getReceiptRecords(12, var2, this.GJF);
            if (var3 != null) {
                Iterator var4 = ((List) var3.getSecondValue()).iterator();

                while (var4.hasNext()) {
                    EDF var5 = (EDF) var4.next();
                    this.GJB.add((IR) var5.getModelBaseElementWithIdObject());
                }
            }

            this.fxml_cash_register_list_pagination.setCurrentPageIndex(this.GJC);
            if (var3 != null && var3.getFirstValue() != null) {
                this.GIZ.set((int) Math.ceil((float) (Integer) var3.getFirstValue() / 12.0F));
            } else {
                this.GIZ.set(0);
            }

            this.fxml_cash_register_list_pagination.setCurrentPageIndex(this.GJC);
        } catch (FFO | FFK var9) {
            FCT.IGX("", var9);
        }

    }

    private Node HWE(int var1) {
        this.HWD(var1);
        return new VBox(this.fxml_cash_register_list);
    }

    @FXML
    protected void fxml_handleButton_cash_register_list_view(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [view] clicked");
        final IR var2 = this.fxml_cash_register_list.getSelectionModel().getSelectedItem();
        this.HHB();
        this.getApplication().initController(this.getFxmlName(), EOS.CASH_REGISTER_NEW.getProcessFxmlFileName(), new Consumer<ENL<?>>() {
            public void accept(ENL<?> var1) {

                try {
                    var1.setMode(ENL.ENM.VIEW);
                    var1.setReceiptRecordVat(var2);
                } catch (FFK var6) {
                    FCT.IGX("", var6);
                }

            }
        });

    }

    @FXML
    protected void fxml_handleButton_cash_register_list_edit(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [edit] clicked");
        final IR var2 = this.fxml_cash_register_list.getSelectionModel().getSelectedItem();
        this.HHB();
        this.getApplication().initController(this.getFxmlName(), EOS.CASH_REGISTER_NEW.getProcessFxmlFileName(), new Consumer<ENL<?>>() {
            public void accept(ENL<?> var1) {

                try {
                    var1.setMode(ENL.ENM.EDIT);
                    var1.setReceiptRecordVat(var2);
                } catch (FFK var6) {
                    FCT.IGX("", var6);
                }

            }
        });

    }

    @FXML
    protected void fxml_handleButton_cash_register_list_remove(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [remove] clicked");
            FEN var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.cash_register_list.Dialog.deleteAreYouSure.title"), null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.cash_register_list.Dialog.deleteAreYouSure.header"));
            switch (var2) {
                case Confirm:
                    this.getProcess().QOS(this.fxml_cash_register_list.getSelectionModel().getSelectedItem());
                    this.HWD(this.GJC);
                    org.slf4j.LoggerFactory.getLogger(getClass()).info("Element removed");
                case Reject:
                case CancelExit:
                default:
                    this.fxml_parent.requestFocus();
            }
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX(this.resources.getString("micro.process.cash_register_list.Error.Delete"), var6);
        }

    }

    @FXML
    protected void fxml_cash_register_list_button_new_register(ActionEvent var1) {

        this.HHB();
        this.getApplication().initController(this.getFxmlName(), EOS.CASH_REGISTER_NEW.getProcessFxmlFileName(), new Consumer<ENL<?>>() {
            public void accept(ENL<?> var1) {

                var1.setMode(ENL.ENM.NEW);

            }
        });

    }

    private void HWF() {

        try {
            ETV var1 = this.getProcess();
            this.GJD = var1.getPossibleDates();
            if (this.GJD != null) {
                this.fxml_invoice_sale_list_year.getItems().clear();
                this.fxml_invoice_sale_list_year.getItems().add("-");
                this.fxml_invoice_sale_list_year.setValue(this.fxml_invoice_sale_list_year.getItems().get(0));
                if (this.GJD.keySet().size() > 0) {
                    this.fxml_invoice_sale_list_year.getItems().addAll(this.GJD.keySet());
                    this.fxml_invoice_sale_list_year.setValue(this.fxml_invoice_sale_list_year.getItems().get(0));
                }

                this.setPossibleMonths(null);
            }

            this.fxml_invoice_sale_list_year.valueProperty().addListener(this.GJG);
            this.fxml_invoice_sale_list_month.valueProperty().addListener(this.GJH);
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetPossibleDatesError"), var5);
        }

    }

    private void HWG() {
        String var1 = this.fxml_invoice_sale_list_year.getValue();
        Integer var2 = null;

        try {
            var2 = Integer.valueOf(var1);
        } catch (NumberFormatException var4) {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("NumberFormatException for string" + var1);
        }

        Integer var3 = null;
        if (this.fxml_invoice_sale_list_month.getValue() != null) {
            var3 = this.fxml_invoice_sale_list_month.getValue();
            if (var3 != null && var3.equals(this.GJI)) {
                var3 = null;
            }
        }

        this.GJF = new Period(var2, var3);
    }

    private void setPossibleMonths(String var1) {

        this.fxml_invoice_sale_list_month.getItems().clear();
        this.fxml_invoice_sale_list_month.getItems().add(this.GJI);
        if (var1 != null && this.GJD.get(var1) != null) {
            Iterator var2 = ((SortedSet) this.GJD.get(var1)).iterator();

            while (var2.hasNext()) {
                KH var3 = (KH) var2.next();
                this.fxml_invoice_sale_list_month.getItems().add(var3.getNumber());
            }
        }

        this.fxml_invoice_sale_list_month.setValue(this.GJI);

    }
}
