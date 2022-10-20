package a.a.a.c.c.e.p.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENK;
import a.a.a.c.c.d.a.QUV;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.p.c.QUD;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherElementPurchase;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class QTV extends QUV<QUD> {
    private InvoiceOtherPurchase RBS;
    private EPB RBT;
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    private QTW fxml_include_invoicePurchaseLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    private Button fxml_generalButtonSave;
    @FXML
    private Button fxml_generalButtonCancel;
    private Boolean RBU = false;

    public QTV(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);

    }

    @FXML
    public void initialize() {

        this.fxml_generalButtonSave.visibleProperty().bind(this.fxml_include_invoicePurchaseLogicController.RBY);
        this.fxml_generalButtonSave.managedProperty().bind(this.fxml_include_invoicePurchaseLogicController.RBY);
        this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_invoicePurchaseLogicController.RCB.and(this.fxml_include_invoicePurchaseLogicController.RBY.and(this.fxml_include_invoicePurchaseLogicController.RCC)).not());

    }

    public boolean HHB() {

        boolean var2;
        try {
            boolean var8;
            if (this.RBU) {
                this.RLV();
                var8 = true;
                return var8;
            } else {
                if (this.fxml_include_invoicePurchaseLogicController.RCC.get()) {
                    FEN var1 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.isDisable(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                    switch (var1) {
                        case ExitAndSave:
                            this.RLW();
                        case ExitWithoutSave:
                            break;
                        case CancelExit:
                        default:
                            this.fxml_parent.requestFocus();
                            var2 = false;
                            return var2;
                    }
                }

                this.RLV();
                var8 = true;
                return var8;
            }
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            var2 = true;
            return var2;
        }
    }

    public void HHC() {
        try {
            this.fxml_include_top_menuController.HHC();
            this.fxml_include_left_barController.HHC();
            this.RBU = false;
            QUD var1 = this.HHG();
            this.fxml_include_invoicePurchaseLogicController.setProcessImplementation(var1);
            if (this.RBT == null) {
                this.RBT = EPB.NEW;
            }

            var1.setMode(this.RBT);
            this.fxml_include_invoicePurchaseLogicController.RBY.set(true);
            this.fxml_include_invoicePurchaseLogicController.RBZ.set(false);
            switch (this.RBT) {
                case NEW:
                    this.RBS = var1.getInvoiceOtherPurchase();
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
                    break;
                case EDIT:
                    var1.setInvoiceOtherPurchase(this.RBS);
                    this.fxml_include_invoicePurchaseLogicController.RBZ.set(true);
                    this.fxml_include_invoicePurchaseLogicController.setInvoiceOtherSubType(this.RBS.getInvoiceOtherSubType());
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
                    break;
                case VIEW:
                    this.fxml_include_invoicePurchaseLogicController.RBY.set(false);
                    this.fxml_include_invoicePurchaseLogicController.setInvoiceOtherSubType(this.RBS.getInvoiceOtherSubType());
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Return_AlternateCancel"));
            }

            this.fxml_include_invoicePurchaseLogicController.setInvoiceOther(this.RBS);
            this.fxml_include_invoicePurchaseLogicController.HHC();
            this.fxml_parent.requestFocus();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            FCT.IGX("", var5);
        }

    }

    @FXML
    public void fxml_handleButton_generalButtonSave(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save] clicked");
            this.RBU = true;
            this.RLW();
            QUD var2 = this.getProcess();
            var2.HHL();
            this.RLZ();
        } catch (FFK | FFO | FFI var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX(this.resources.getString("micro.process.other_purchase_new.Error.SaveInvoice"), var6);
        }

    }

    @FXML
    public void fxml_handleButton_generalButtonCancel(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [cancel] clicked");
        this.RLZ();

    }

    private void RLV() throws FFK, FFO {
        this.fxml_include_invoicePurchaseLogicController.HHB();
        this.fxml_include_left_barController.HHB();
        this.fxml_include_top_menuController.HHB();
        this.RBT = EPB.NEW;
        this.RBS = null;
        this.getProcess().resetAndCleanUpProcess();
    }

    private void RLW() {

        this.RMA();
        this.RBS.setInvoiceOtherSubType(this.fxml_include_invoicePurchaseLogicController.RML());
        if (this.fxml_include_invoicePurchaseLogicController.RCA.get() && this.RBS.RJM() != null) {
            this.RLX(this.RBS.getContractor());
        }

    }

    private void RLX(Contractor var1) {
        try {
            new ArrayList();
            QUD var3 = this.HHG();
            if (var1.DAI().getValue() != null && var1.DAI().getValue().length() != 0 && var1.DAJ().getValue() != null && var1.DAJ().getValue().length() != 0) {
                List var2 = this.RLY(var1);
                Contractor var4;
                if (var2.size() == 0) {
                    var4 = var1.AICD();
                    var3.getModelManager().HJZ(var3.getParentDefinition(), var4);
                } else {
                    var4 = (Contractor) ((EDF) var2.get(0)).getModelBaseElementWithIdObject();
                    var4.setPrivtePerson(var1.AICE());
                    var4.setName(var1.DAI());
                    var4.setNip(var1.DAJ());
                    var4.setAccountNumber(var1.DAL());
                    var4.setRegon(var1.DAK());
                    var4.setAddress(var1.DAM());
                    var4.DAM().setStreet(var1.DAM().DDA());
                    var4.DAM().setHouseNumber(var1.DAM().DDB());
                    var4.DAM().setApartmentNumber(var1.DAM().DDC());
                    var4.DAM().setPostalCode(var1.DAM().DDD());
                    var4.DAM().setCity(var1.DAM().DCZ());
                    var4.DAM().setPostOffice(var1.DAM().DDE());
                    var4.DAM().setCountryCode(var1.DAM().DCV());
                    var4.DAM().setDistrict(var1.DAM().DCX());
                    var4.DAM().setCommunity(var1.DAM().DCY());
                    var4.DAM().setVoivodeship(var1.DAM().DCW());
                    var4.setTelephone(var1.DAN());
                    var4.setEmail(var1.DAO());
                    var4.setRemarks(var1.DAP());
                    var3.getModelManager().HKB(var3.getParentDefinition(), var4);
                }

                var3.getModelManager().HKL(var3.getParentDefinition());
            }
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
        }

    }

    private List<EDF<Contractor>> RLY(Contractor var1) throws FFK, FFO {

        Object var8;
        Object var2 = new ArrayList();
        QUD var3 = this.getProcess();
        if (var1 != null) {
            AGYN var4;
            if (!var1.AICE()) {
                if (var1.getNip() != null && var1.getNip().getValue() != null) {
                    var4 = new AGYN(Contractor.class, var1.getNip().getValue());
                    var2 = var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
                }
            } else if (var1.getName() != null && var1.getName().getValue() != null) {
                var4 = new AGYN(Contractor.class, var1.QON(), null);
                var2 = var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
            }
        }

        var8 = var2;

        return (List) var8;
    }

    private void RLZ() {

        Period var1 = null;
        if (this.RBS != null && this.RBS.getPeriod() != null) {
            var1 = this.RBS.getPeriod();
        }

        Period finalVar = var1;
        this.getApplication().initController(this.getFxmlName(), EOS.OTHER_PURCHASE_LIST.getProcessFxmlFileName(), new Consumer<ENK<?>>() {
            public void accept(ENK<?> var1x) {

                try {
                    var1x.setPeriod(finalVar);
                } catch (FFK var6) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
                    throw new FFI(var6);
                }

            }
        });

    }

    private void RMA() {

        HashMap var1 = new HashMap();
        List var2 = this.RBS.getInvoiceOtherElements();
        Iterator var3 = var2.iterator();

        while (var3.hasNext()) {
            InvoiceOtherElementPurchase var4 = (InvoiceOtherElementPurchase) var3.next();
            if (var1.get(var4.getTaxRate().getValue()) == null) {
                var1.put(var4.getTaxRate().getValue(), new ValueContainer3(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
            }

            ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).setFirstValue(EQY.HRI((BigDecimal) ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).getFirstValue(), var4.getNetPriceForAll().getValue()));
            ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).setSecondValue(EQY.HRI((BigDecimal) ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).getSecondValue(), var4.getTaxValueForAll().getValue()));
            ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).setThirdValue(EQY.HRI((BigDecimal) ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).getThirdValue(), var4.getGrossValueForAll().getValue()));
        }

        this.RBS.getSumOfAmountsDividedByTaxRate().clear();
        this.RBS.getAmountOfTaxDividedByTaxRate().clear();
        this.RBS.getSumOfGrossAmountsDividedByTaxRate().clear();
        var3 = var1.keySet().iterator();

        while (var3.hasNext()) {
            KL var8 = (KL) var3.next();
            this.RBS.getSumOfAmountsDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getFirstValue()));
            this.RBS.getAmountOfTaxDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getSecondValue()));
            this.RBS.getSumOfGrossAmountsDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getThirdValue()));
        }

    }

    public void setInvoice(InvoiceOther<?> var1) throws FFK {
        this.RBS = (InvoiceOtherPurchase) var1;
    }

    public void setContractor(Contractor var1) {
        throw new UnsupportedOperationException();
    }

    public void setMode(EPB var1) {
        this.RBT = var1;
    }
}
