package a.a.a.c.c.e.k.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENL;
import a.a.a.c.c.d.d.b.EOB;
import a.a.a.c.c.d.e.EOT;
import a.a.a.c.c.e.k.c.EVC;
import a.a.a.c.d.e.QRX;
import a.a.a.c.d.e.QRY;
import a.a.a.c.f.a.a.EYO;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.a.EYV;
import a.a.a.c.f.a.a.EYX;
import a.a.a.c.f.a.f.a.IN;
import a.a.a.c.f.a.f.a.IP;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;

public class EUZ extends ENL<EVC> implements EMO<IP> {
    private static final int GMZ = 32;
    private ENL.ENM GNA;
    private IR GNB;
    @FXML
    public EYQ fxml_data_refIdController;
    @FXML
    public EYO fxml_include_date_boxController;
    @FXML
    private EYX fxml_include_period_boxController;
    @FXML
    private TableView<IP> fxml_cash_register_items;
    @FXML
    private TableView<IN> fxml_cash_register_summary;
    @FXML
    private TableColumn<IP, Object> fxml_cash_register_items_net;
    @FXML
    private TableColumn<IP, Object> fxml_cash_register_items_vat_amount;
    @FXML
    private TableColumn<IP, Object> fxml_cash_register_items_gross;
    @FXML
    public TableColumn<IN, String> fxml_cash_register_summary_summary;
    @FXML
    private TableColumn<IN, JR> fxml_cash_register_summary_net;
    @FXML
    private TableColumn<IN, JR> fxml_cash_register_summary_vat_amount;
    @FXML
    private TableColumn<IN, JR> fxml_cash_register_summary_gross;
    @FXML
    private TableColumn<IP, Object> fxml_cash_register_items_vat_rate;
    @FXML
    private Button fxml_cashRegister_cancelButton;
    @FXML
    private Button fxml_cashRegister_saveButton;
    @FXML
    private Button fxml_cash_register_deleteRowButton;
    @FXML
    private Button fxml_cash_register_addRowButton;
    @FXML
    private EYV fxml_include_bd_boxController;
    @FXML
    public VBox fxml_inner_parent;
    @FXML
    public VBox fxml_cash_register_new_information_container;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    private ObservableList<IN> GNC;
    private ObservableList<IP> GND;
    private boolean GNE;
    private final BooleanProperty GNF;
    public BooleanProperty GNG;
    public BooleanProperty GNH;
    private boolean GNI;
    private EVC GNJ;

    public EUZ(EMC var1, EMT var2, String var3, String var4) {
        super(var1, var2, var3, var4);
        this.GNA = ENL.ENM.NEW;
        this.GNE = false;
        this.GNF = new SimpleBooleanProperty(true);
        this.GNG = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
        this.GNH = new SimpleBooleanProperty(this, "itemsChangeProperty", false);

    }

    public void setReceiptRecordVat(IR var1) throws FFK {
        this.GNB = var1;
    }

    public void setMode(ENL.ENM var1) {
        this.GNA = var1;
    }

    public void HHE() throws FFK {

        try {
            super.HHE();
            this.GNJ = this.getProcess();
            this.fxml_include_period_boxController.initialize(false);
            this.fxml_include_period_boxController.setListener(new ChangeListener<Integer>() {
                public void changed(ObservableValue<? extends Integer> var1, Integer var2, Integer var3) {
                    EUZ.this.HYF();
                }
            });
            this.fxml_cash_register_deleteRowButton.disableProperty().bind(Bindings.isEmpty(this.fxml_cash_register_items.getSelectionModel().getSelectedItems()).or(this.GNF.not()));
            this.fxml_cash_register_addRowButton.disableProperty().bind(this.GNF.not());
            this.fxml_include_period_boxController.disableProperty().bind(this.GNF.not());
            this.fxml_data_refIdController.fxml_component_main_element.disableProperty().bind(this.GNF.not());
            this.fxml_cash_register_items.disableProperty().bind(this.GNF.not());
            this.fxml_cash_register_summary.disableProperty().bind(this.GNF.not());
            this.fxml_include_date_boxController.fxml_component_main_element.setDisable(true);
            this.fxml_include_date_boxController.validationWhenDisabledProperty().bind(this.GNF);
            this.fxml_cash_register_summary_summary.minWidthProperty().bind(this.fxml_cash_register_items_vat_rate.widthProperty());
            this.fxml_cash_register_summary_net.minWidthProperty().bind(this.fxml_cash_register_items_net.widthProperty());
            this.fxml_cash_register_summary_vat_amount.minWidthProperty().bind(this.fxml_cash_register_items_vat_amount.widthProperty());
            this.fxml_cash_register_summary_gross.minWidthProperty().bind(this.fxml_cash_register_items_gross.widthProperty());
            this.fxml_cash_register_summary_summary.maxWidthProperty().bind(this.fxml_cash_register_items_vat_rate.widthProperty());
            this.fxml_cash_register_summary_net.maxWidthProperty().bind(this.fxml_cash_register_items_net.widthProperty());
            this.fxml_cash_register_summary_vat_amount.maxWidthProperty().bind(this.fxml_cash_register_items_vat_amount.widthProperty());
            this.fxml_cash_register_summary_gross.maxWidthProperty().bind(this.fxml_cash_register_items_gross.widthProperty());
            this.HYD();
            this.HYE();
            this.GND = FXCollections.observableArrayList();
            this.fxml_cash_register_items.setItems(this.GND);
            this.fxml_cash_register_items.refresh();
            this.fxml_cash_register_items.setFixedCellSize(32.0);
            this.fxml_cash_register_items.prefHeightProperty().bind(this.fxml_cash_register_items.fixedCellSizeProperty().multiply(Bindings.size(this.fxml_cash_register_items.getItems()).add(1)));
            this.fxml_cash_register_items.maxHeightProperty().bind(this.fxml_cash_register_items.prefHeightProperty());
        } catch (FFO var5) {
            FCT.IGX("", var5);
        }

    }

    public boolean HHB() {

        boolean var2;
        try {
            boolean var1 = true;
            if (!this.GNI && !ENL.ENM.VIEW.equals(this.GNA)) {
                if (this.GNG.get()) {
                    FEN var8 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_cashRegister_saveButton.disableProperty().get(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                    org.slf4j.LoggerFactory.getLogger(getClass()).debug("dialogResult " + var8);
                    switch (var8) {
                        case ExitAndSave:
                            this.HYC();
                            this.GNJ.HHL();
                            break;
                        case ExitWithoutSave:
                            this.GNJ.resetAndCleanUpProcess();
                            var1 = true;
                            break;
                        case CancelExit:
                        default:
                            var1 = false;
                    }
                }
            } else {
                var1 = true;
            }

            if (var1) {
                this.GNB = null;
                this.GNA = ENL.ENM.NEW;
                this.GND.clear();
                this.fxml_cash_register_items.refresh();
                this.fxml_include_top_menuController.HHB();
                this.fxml_include_left_barController.HHB();
                var2 = true;
                return var2;
            }

            var2 = false;
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
            var2 = true;
            return var2;
        }

        return var2;
    }

    public void HHC() {

        try {
            this.GNI = false;
            this.GNE = true;
            EVC var1 = this.HHG();
            if (ENL.ENM.EDIT.equals(this.GNA)) {
                this.GNB.setPreviousPeriod(this.GNB.getPeriod().DDN());
            }

            if (ENL.ENM.VIEW.equals(this.GNA)) {
                this.GNF.set(false);
                this.fxml_cashRegister_cancelButton.setText(this.resources.getString("micro.process.button.Return_AlternateCancel"));
            } else {
                this.GNF.set(true);
                this.fxml_cashRegister_cancelButton.setText(this.resources.getString("micro.process.button.Cancel"));
            }

            if (this.GNB != null) {
                var1.setReceiptRecord(this.GNB);
            }

            this.HYF();
            if (!ENL.ENM.EDIT.equals(this.GNA) && !ENL.ENM.VIEW.equals(this.GNA)) {
                this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.cash_register_new.Title_new"));
            } else {
                this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.cash_register_new.Title"));
            }

            IR var2 = var1.getReceiptRecord();
            this.fxml_data_refIdController.fxml_component_main_element.textProperty().bindBidirectional(var2.getRefId().DDG());
            this.fxml_include_period_boxController.setPeriod(var2.getPeriod());
            this.GND.addAll(var2.DCM());
            this.fxml_cash_register_items.refresh();
            this.fxml_cash_register_items.setEditable(true);
            this.GNC = FXCollections.singletonObservableList(var1.getReceiptRecord());
            this.fxml_cash_register_summary.setItems(this.GNC);
            this.fxml_cashRegister_saveButton.disableProperty().bind(Bindings.size(this.GND).isEqualTo(0).or(this.fxml_include_period_boxController.validProperty().not()).or(this.fxml_data_refIdController.validProperty().not()).or(this.GNF.not()).or(this.GNG.not()));
            this.GNG.bind(this.fxml_data_refIdController.changedProperty().or(this.fxml_include_date_boxController.changedProperty()).or(this.fxml_data_refIdController.changedProperty()).or(this.GNH));
            this.fxml_parent.requestFocus();
            this.fxml_data_refIdController.clearChangedProperty();
            this.fxml_include_date_boxController.clearChangedProperty();
            this.GNH.setValue(false);
            this.fxml_include_top_menuController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_parent.requestFocus();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("implementation " + var1);
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
        }

    }

    @FXML
    protected void fxml_handleButton_back(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [back] clicked");
        this.getApplication().HJD(this.getFxmlName(), "main.fxml");

    }

    @FXML
    protected void fxml_handleCash_register_addRowButton(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [Add new cash receiptRecordVat item] has been clicked");
            FXMLLoader var2 = new FXMLLoader();
            var2.setLocation(EUZ.class.getResource("/fxml/cash_register_new_item.fxml"));
            var2.setResources(this.resources);
            AnchorPane var3 = var2.load();
            Stage var4 = new Stage();
            var4.setTitle(this.resources.getString("micro.process.cash_register_new.AddItemDialogTitle"));
            var4.initModality(Modality.WINDOW_MODAL);
            var4.initOwner(this.FGW);
            Scene var5 = new Scene(var3);
            var4.setScene(var5);
            var4.setResizable(false);
            var4.getIcons().add(new Image("/img/app/e_logo.png"));
            EVA var6 = var2.getController();
            var6.setDialogStage(var4);
            IP var7 = new IP();
            var7.DCF().setAllowNegative(true);
            var7.DCG().setAllowNegative(true);
            var6.setRecordElementVat(var7);
            var4.showAndWait();
            if (var6.HYI()) {
                org.slf4j.LoggerFactory.getLogger(getClass()).info("CashRegisterElement added");
                this.GNJ.HYL(var7);
                this.GND.add(var7);
                this.fxml_cash_register_items.refresh();
                this.GNH.setValue(true);
                this.fxml_cash_register_summary.refresh();
            }
        } catch (Exception var11) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
            FCT.IGX("", var11);
        }

    }

    @FXML
    protected void fxml_handleCash_register_RemoveRowButton(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [Delete selected cash receiptRecordVat item] has been clicked");
            IP var2 = this.fxml_cash_register_items.getSelectionModel().getSelectedItem();
            if (var2 != null) {
                this.GNJ.HYM(var2);
                this.GND.remove(var2);
                this.fxml_cash_register_items.refresh();
                this.GNH.setValue(true);
                this.fxml_cash_register_summary.refresh();
            } else {
                FCR.IGM(this.resources.getString("micro.process.cash_register_new.Error"), this.resources.getString("micro.process.cash_register_new.DeleteErrorTitle"), this.resources.getString("micro.process.cash_register_new.DeleteErrorMessage"), false);
            }
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
        }

    }

    private void HYC() throws FFO, FFK {
        this.GNI = true;
        IR var1 = this.GNJ.getReceiptRecord();
        var1.setPeriod(this.fxml_include_period_boxController.getPeriod());
        var1.setCreationDate(new JV(this.fxml_include_date_boxController.fxml_component_main_element.getValue()));
        var1.setRefId(new KE(this.fxml_data_refIdController.fxml_component_main_element.getText()));
        this.GNJ.setMode(this.GNA);
    }

    @FXML
    public void fxml_handleButton_generalButtonSave(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save] clicked");
            this.HYC();
            this.GNJ.HHL();
            this.getApplication().HJD(this.getFxmlName(), EOS.CASH_REGISTER_LIST.getProcessFxmlFileName());
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
        }

    }

    @FXML
    private void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [cancel] clicked");
        this.GNI = true;
        EVC var2 = this.getProcess();
        var2.resetAndCleanUpProcess();
        this.getApplication().HJD(this.getFxmlName(), EOS.CASH_REGISTER_LIST.getProcessFxmlFileName());

    }

    private void HYD() {
        this.fxml_cash_register_items_net.setCellValueFactory(new PropertyValueFactory("net"));
        this.fxml_cash_register_items_net.setCellFactory(new EOT(this, true));
        this.fxml_cash_register_items_vat_rate.setCellFactory(new EOT(this, true));
        this.fxml_cash_register_items_vat_rate.setCellValueFactory(new PropertyValueFactory("taxRate"));
        this.fxml_cash_register_items_vat_amount.setCellValueFactory(new PropertyValueFactory("vat"));
        this.fxml_cash_register_items_vat_amount.setCellFactory(new EOT(this, true));
        this.fxml_cash_register_items_gross.setCellValueFactory(new PropertyValueFactory("gross"));
        this.fxml_cash_register_items_gross.setCellFactory(new EOT(this, true));
    }

    private void HYE() throws FFK, FFO {
        this.fxml_cash_register_summary_net.setCellValueFactory(new PropertyValueFactory("net"));
        this.fxml_cash_register_summary_net.setCellFactory(new EOB());
        this.fxml_cash_register_summary_vat_amount.setCellValueFactory(new PropertyValueFactory("vat"));
        this.fxml_cash_register_summary_vat_amount.setCellFactory(new EOB());
        this.fxml_cash_register_summary_gross.setCellValueFactory(new PropertyValueFactory("gross"));
        this.fxml_cash_register_summary_gross.setCellFactory(new EOB());
        this.fxml_cash_register_summary.getItems().clear();
    }

    private void HYF() {
        if (this.GNE) {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Period changed");
            Integer var1 = this.fxml_include_period_boxController.getYear();
            Integer var2 = this.fxml_include_period_boxController.getMonth();
            if (var1 != null && var2 != null) {
                LocalDate var3 = LocalDate.of(var1, var2, 1);
                LocalDate var4 = var3.withDayOfMonth(var3.lengthOfMonth());
                this.fxml_include_date_boxController.fxml_component_main_element.setValue(var4);
            }

            try {
                JN var7 = this.fxml_include_period_boxController.getPeriod();
                if (var7 != null) {
                    boolean var8 = this.getProcess().HYK(var7);
                    IR var5 = this.getProcess().getReceiptRecord(var7);
                    if (var8) {
                        this.fxml_include_period_boxController.setValid(false, this.resources.getString("micro.process.cash_register_new.Error.SettlementSettled"));
                    } else if (var5 != null && !var5.equals(this.GNJ.getReceiptRecord())) {
                        this.fxml_include_period_boxController.setValid(false, this.resources.getString("micro.process.cash_register_new.Error.cash_register_exists"));
                    } else {
                        this.fxml_include_period_boxController.setValid(true, null);
                    }

                    if (this.fxml_include_date_boxController.fxml_component_main_element.getValue().isAfter(LocalDate.now())) {
                        this.fxml_include_date_boxController.fxml_component_main_element.IEY().set(true);
                        this.fxml_include_date_boxController.fxml_component_warning_element.setText(this.resources.getString("micro.process.cash_register_new.Warn.FutureDate"));
                    } else {
                        this.fxml_include_date_boxController.fxml_component_main_element.IEY().set(false);
                        this.fxml_include_date_boxController.fxml_component_warning_element.setText("");
                    }
                }
            } catch (FFO | FFK var6) {
                FCT.IGX("", var6);
            }
        }

    }

    public boolean HYG() {
        return this.GNF.get();
    }

    public BooleanProperty HYH() {
        return this.GNF;
    }

    public void setEditableProperty(boolean var1) {
        this.GNF.set(var1);
    }

    public void RJV(IP var1, IP var2, QSV var3) {

        QRX var4 = QRY.getReceiptCalculationMethod(var3);
        var4.RIB(var1, var2);
        this.GNJ.HYJ();
        this.GNH.setValue(true);
        this.fxml_cash_register_items.refresh();

    }

    public void HJJ() {

        this.fxml_cash_register_summary.refresh();

    }

    public void HJK() {

        this.fxml_inner_parent.requestFocus();

    }
}
