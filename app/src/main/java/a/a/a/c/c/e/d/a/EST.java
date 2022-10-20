package a.a.a.c.c.e.d.a;

import a.a.a.b.a.a.FDO;
import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENK;
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.d.c.ESX;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

public class EST extends ENN<ESX> {
    private InvoicePurchase GEM;
    private final BooleanProperty GEN = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
    private final BooleanProperty GEO = new SimpleBooleanProperty(this, "readOnlyPropertyHolder", false);
    private boolean GEP;
    @FXML
    private Button fxml_generalButtonCancel;
    @FXML
    private Button fxml_generalButtonSave;
    @FXML
    protected ScrollPane fxml_include_container;
    @FXML
    protected ESU fxml_include_invoicePurchaseNewLogicController;
    @FXML
    protected EMP fxml_include_left_barController;
    @FXML
    protected EMR fxml_include_top_menuController;
    private InvoicePurchase GEQ = null;
    private EPB GER;
    private Contractor GES;

    public EST(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
        this.GER = EPB.NEW;
    }

    public void init() throws FFK {

        try {
            super.init();
            this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_purchase_new.Title"));
            this.GEN.bind(this.fxml_include_invoicePurchaseNewLogicController.RFB);
            this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_invoicePurchaseNewLogicController.RFC.and(this.fxml_include_invoicePurchaseNewLogicController.RFB.and(this.GEO.not())).not());
            this.fxml_include_invoicePurchaseNewLogicController.RFA.bind(this.GEO);
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public boolean HHB() {

        boolean var2;
        try {
            boolean var1 = true;
            if (this.GEP) {
                var1 = true;
            } else if (this.GEN.get()) {
                FEN var9 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.disableProperty().get(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                ESX var3;
                switch (var9) {
                    case ExitAndSave:
                        var3 = this.getProcess();
                        var3.HHL();
                        var1 = true;
                        break;
                    case ExitWithoutSave:
                        var3 = this.getProcess();
                        var3.resetAndCleanUpProcess();
                        var1 = true;
                        break;
                    case CancelExit:
                    default:
                        var1 = false;
                }
            } else {
                ESX var10 = this.getProcess();
                var10.resetAndCleanUpProcess();
                var1 = true;
            }

            if (var1) {
                this.HTU();
                this.fxml_include_invoicePurchaseNewLogicController.HHB();
                this.fxml_include_left_barController.HHB();
                this.fxml_include_top_menuController.HHB();
                var2 = true;
                return var2;
            }

            this.fxml_parent.requestFocus();
            var2 = false;
            return var2;
        } catch (Exception var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            FCT.IGX("", var7);
            var2 = true;
        }

        return var2;
    }

    public void HHC() {

        try {
            this.fxml_include_container.setVvalue(0.0);
            this.GEP = false;
            ESX var1 = this.HHG();
            if (this.GER != null && !EPB.NEW.equals(this.GER)) {
                if (EPB.VIEW.equals(this.GER)) {
                    this.GEO.set(true);
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_purchase_new.View"));
                    this.GER = EPB.NEW;
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Return_AlternateCancel"));
                    var1.setInvoicePurchase(this.GEQ);
                    var1.setActionType(FDO.select);
                    var1.setInvoicePurchaseEditKey(null);
                } else {
                    if (!EPB.EDIT.equals(this.GER)) {
                        throw new FFK("Invalid mode [" + this.GER + "]!");
                    }

                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_purchase_new.Edit"));
                    this.GEO.set(false);
                    this.GER = EPB.NEW;
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
                    this.fxml_include_invoicePurchaseNewLogicController.fxml_include_invoicingDate_boxController.IFN(var1.getRangesWhereSettled(this.resources.getString("micro.process.invoice_purchase_new.Tooltip.SettledPeriod")));
                    this.GEQ.setPreviousPeriod(this.GEQ.getPeriod().DDN());
                    var1.setInvoicePurchase(this.GEQ);
                    var1.setActionType(FDO.update);
                    Period var2 = this.GEQ.getPeriod() != null ? this.GEQ.getPeriod().DDN() : null;
                    RefId var3 = this.GEQ.getRefId() != null ? this.GEQ.getRefId().DEL() : null;
                    KA var4 = this.GEQ.getIssuerNumber() != null ? this.GEQ.getIssuerNumber().DEJ() : null;
                    var1.setInvoicePurchaseEditKey(new ValueContainer3(var2, var3, var4));
                }
            } else {
                this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_purchase_new.Title"));
                this.GEO.set(false);
                this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
                this.fxml_include_invoicePurchaseNewLogicController.fxml_include_invoicingDate_boxController.IFN(var1.getRangesWhereSettled(this.resources.getString("micro.process.invoice_purchase_new.Tooltip.SettledPeriod")));
                var1.setActionType(FDO.insert);
                var1.setInvoicePurchaseEditKey(null);
            }

            this.GEM = var1.getInvoicePurchase(this.GES);
            this.GES = null;
            this.fxml_include_invoicePurchaseNewLogicController.setProcessImplementation(var1);
            this.fxml_include_invoicePurchaseNewLogicController.HTV(this.GEM);
            this.fxml_include_invoicePurchaseNewLogicController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_include_top_menuController.HHC();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var8) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
            throw new FFI(var8);
        }

    }

    public void initialize() {

    }

    @FXML
    protected void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [cancel] clicked");
        this.GEP = true;
        Period var2 = null;
        if (this.GEM != null && this.GEM.getPeriod() != null) {
            var2 = this.GEM.getPeriod();
        }

        ESX var4 = this.getProcess();
        var4.resetAndCleanUpProcess();
        Period finalVar = var2;
        this.getApplication().initController(this.getFxmlName(), EOS.INVOICE_PURCHASE_LIST.getProcessFxmlFileName(), new Consumer<ENK<?>>() {
            public void accept(ENK<?> var1) {

                try {
                    var1.setPeriod(finalVar);
                } catch (FFK var6) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    throw new FFI(var6);
                }

            }
        });

    }

    @FXML
    protected void fxml_handleButton_generalButtonSave(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save] clicked");
            this.GEP = true;
            Period var2 = null;
            if (this.GEM != null && this.GEM.getPeriod() != null) {
                var2 = this.GEM.getPeriod();
            }

            ESX var4 = this.getProcess();
            var4.HHL();
            Period finalVar = var2;
            this.getApplication().initController(this.getFxmlName(), EOS.INVOICE_PURCHASE_LIST.getProcessFxmlFileName(), new Consumer<ENK<?>>() {
                public void accept(ENK<?> var1) {

                    try {
                        var1.setPeriod(finalVar);
                    } catch (FFK var6) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                        throw new FFI(var6);
                    }

                }
            });
        } catch (Exception var8) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
            FCT.IGX("", var8);
        }

    }

    private void HTU() {

        this.fxml_include_invoicePurchaseNewLogicController.RJZ(this.GEM);
        this.GEM = null;

    }

    public void setInvoice(Invoice<?> var1) throws FFK {
        this.GEQ = (InvoicePurchase) var1;
    }

    public void setMode(EPB var1) {
        this.GER = var1;
    }

    public void setContractor(Contractor var1) {
        this.GER = EPB.NEW;
        this.GES = var1;
    }
}
