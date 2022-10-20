package a.a.a.c.c.e.j.a;

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
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.d.h.EPE;
import a.a.a.c.c.d.h.EPI;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.e.a.d.ThreeValueBox;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class EUV extends ENN<EUY> {
    private EPB GMK;
    private HY GML;
    private HV GMM;
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    public EUT fxml_include_invoiceSaleLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    public Button fxml_generalButtonSave;
    @FXML
    public Button fxml_generalButtonCancel;
    @FXML
    public Button fxml_generalButtonSaveAndPrint;
    private boolean GMN;
    private HI GMO;

    public EUV(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
        this.GMK = EPB.NEW;
        this.GMN = false;

    }

    public void setMode(EPB var1) {

        this.GMK = var1;

    }

    @FXML
    public void initialize() {

    }

    public void init() {

        try {
            super.init();
            this.fxml_generalButtonSave.visibleProperty().bind(this.fxml_include_invoiceSaleLogicController.GLT);
            this.fxml_generalButtonSave.managedProperty().bind(this.fxml_include_invoiceSaleLogicController.GLT);
            this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_invoiceSaleLogicController.GLS.and(this.fxml_include_invoiceSaleLogicController.GLT.and(this.fxml_include_invoiceSaleLogicController.GLU)).not());
            this.fxml_generalButtonSaveAndPrint.disableProperty().bind(this.fxml_include_invoiceSaleLogicController.GLS.and(this.fxml_include_invoiceSaleLogicController.GLU).or(this.fxml_include_invoiceSaleLogicController.GLT.not()).not());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            FCT.IGX("", var5);
        }

    }

    public boolean HHB() {

        boolean var2;
        try {
            if (!this.fxml_include_invoiceSaleLogicController.GLU.get()) {
                this.GMN = true;
            }

            boolean var1 = true;
            if (!this.GMN) {
                this.GMN = false;
                FEN var8 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.isDisable(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                switch (var8) {
                    case ExitAndSave:
                        var1 = true;
                        this.HXU();
                        break;
                    case ExitWithoutSave:
                        var1 = true;
                        break;
                    case CancelExit:
                    default:
                        var1 = false;
                }
            }

            if (!var1) {
                this.fxml_parent.requestFocus();
                var2 = false;
                return var2;
            }

            this.fxml_include_invoiceSaleLogicController.HHB();
            this.fxml_include_left_barController.HHB();
            this.fxml_include_top_menuController.HHB();
            this.GMK = EPB.NEW;
            this.GML = null;
            this.GMM = null;
            this.GMO = null;
            this.getProcess().resetAndCleanUpProcess();
            var2 = true;
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            var2 = true;
            return var2;
        }

        return var2;
    }

    public void HHC() {

        try {
            this.GMN = false;
            this.fxml_include_container.setVvalue(this.fxml_include_container.getVmin());
            this.setNameExceptions();
            EUY var1 = this.HHG();
            this.fxml_include_invoiceSaleLogicController.setProcessImplementation(var1);
            var1.setMode(this.GMK);
            this.fxml_include_invoiceSaleLogicController.QNH.set(false);
            switch (this.GMK) {
                case NEW:
                    this.GML = var1.getInvoiceSell(this.GMO);
                    this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.NewName"));
                    break;
                case EDIT:
                    this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
                    var1.setInvoiceSell((HU) this.GML);
                    this.GML.setPreviousPeriod(this.GML.getPeriod().DDN());
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.EditName"));
                    this.fxml_include_invoiceSaleLogicController.QNH.set(true);
                    break;
                case CORRECT:
                    this.GMM = var1.getInvoiceSellCorrection();
                    HY var2 = this.getPrevoiusInvoiceFromHierarchyForNewCorrectionToGetElements(this.GML);
                    HY var3 = this.getPrevoiusInvoiceFromHierarchyForNewCorrectionToSetHierarchy(this.GML);
                    this.GMM.RIE().setValue(var2.RIE().getValue());
                    this.GMM.setParentInvoice(var3);
                    this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GMM);
                    this.fxml_include_invoiceSaleLogicController.setInvoicePrevoiusParent(var2);
                    this.fxml_include_invoiceSaleLogicController.setInvoiceFirstParent(getInvoiceFirstParent(this.GML));
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.CorrectName"));
                    break;
                case VIEW:
                    this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.ViewName"));
                    break;
                case VIEW_CORRECTION:
                    this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
                    this.fxml_include_invoiceSaleLogicController.setInvoicePrevoiusParent(this.getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(this.GML));
                    this.fxml_include_invoiceSaleLogicController.setInvoiceFirstParent(getInvoiceFirstParent(this.GML));
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.CorrectionViewName"));
                    break;
                case EDIT_CORRECTION:
                    this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
                    this.fxml_include_invoiceSaleLogicController.setInvoicePrevoiusParent(this.getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(this.GML));
                    this.fxml_include_invoiceSaleLogicController.setInvoiceFirstParent(getInvoiceFirstParent(this.GML));
                    var1.setInvoiceSellCorrection((HV) this.GML);
                    this.GML.setPreviousPeriod(this.GML.getPeriod().DDN());
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.CorrectionEditName"));
                    this.fxml_include_invoiceSaleLogicController.QNH.set(true);
            }

            this.fxml_include_invoiceSaleLogicController.setProcessImplementation(var1);
            this.fxml_include_invoiceSaleLogicController.setMode(this.GMK);
            this.fxml_include_invoiceSaleLogicController.GLR.set(this.GMK.getCorrectFields());
            this.fxml_include_invoiceSaleLogicController.GLT.set(this.GMK.getFieldsEditable());
            this.fxml_include_invoiceSaleLogicController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_include_top_menuController.HHC();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            FCT.IGX("", var7);
        }

    }

    private HY getPrevoiusInvoiceFromHierarchyForNewCorrectionToGetElements(HY var1) {

        HY var2;
        for (var2 = var1; var2.getChildInvoiceOnlyActive() != null; var2 = (HY) var2.getChildInvoiceOnlyActive()) {
        }

        HY var3 = var2;
        return var3;
    }

    private HY getPrevoiusInvoiceFromHierarchyForNewCorrectionToSetHierarchy(HY var1) {

        HY var2;
        for (var2 = var1; var2.getChildInvoiceWithCanceled() != null; var2 = (HY) var2.getChildInvoiceWithCanceled()) {
        }

        HY var3 = var2;
        return var3;
    }

    private HY getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(HY var1) {

        HY var2;
        var2 = (HY) var1.getParentInvoiceOnlyActive();

        return var2;
    }

    private static HU getInvoiceFirstParent(HY var0) {

        HY var1;
        for (var1 = var0; var1.getParentInvoiceWithCanceled() != null; var1 = (HY) var1.getParentInvoiceWithCanceled()) {
        }

        HU var2 = (HU) var1;
        return var2;
    }

    private void setNameExceptions() {

        if (this.GMK.getFieldsEditable()) {
            this.fxml_generalButtonCancel.setText(this.resources.getString("micro.process.button.Cancel"));
            this.fxml_generalButtonSaveAndPrint.setText(this.resources.getString("micro.process.button.SaveAndPrint"));
        } else {
            this.fxml_generalButtonCancel.setText(this.resources.getString("micro.process.button.Return_AlternateCancel"));
            this.fxml_generalButtonSaveAndPrint.setText(this.resources.getString("micro.process.button.Print"));
        }

    }

    public void setInvoice(HN<?> var1) throws FFK {

        this.GML = (HY) var1;

    }

    @FXML
    public void fxml_handleButton_back(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [back] clicked");
        this.HXY();

    }

    @FXML
    public void fxml_handleButton_generalButtonCancel(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [cancel] clicked");
        this.GMN = true;
        this.HXY();

    }

    @FXML
    public void fxml_handleButton_generalButtonSave(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save] clicked");
        this.GMN = true;
        this.HXU();
        this.HXY();

    }

    @FXML
    public void fxml_handleButton_generalButtonSaveAndPrint(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save_and_print] clicked");
        this.GMN = true;
        if (this.GMK.getFieldsEditable()) {
            this.HXU();
        }

        this.HXZ();
        this.HXY();

    }

    private void HXU() {

        try {
            this.HXX();
            if (this.GMK.equals(EPB.CORRECT)) {
                this.GMM.setUsingInvoicingDate(new JS(true));
            } else {
                this.GML.setUsingInvoicingDate(new JS(true));
            }

            EUY var1 = this.getProcess();
            var1.HHL();
            if (this.fxml_include_invoiceSaleLogicController.GLV.get()) {
                HU var2 = (HU) this.GML;
                this.HXV(var2.getContractor());
            }
        } catch (FFO | FFI | FFK var8) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Error.SaveInvoice"), var8);

            try {
                this.getProcess().resetAndCleanUpProcess();
            } catch (FFO | FFK var7) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Error.SaveInvoice"), var8);
            }
        }

    }

    private void HXV(HI var1) {
        try {
            new ArrayList();
            EUY var3 = this.HHG();
            List var2 = this.HXW(var1);
            HI var4;
            if (var2.size() == 0) {
                var4 = var1.AICD();
                var3.getModelManager().HJZ(var3.getParentDefinition(), var4);
            } else {
                var4 = (HI) ((EDF) var2.get(0)).getModelBaseElementWithIdObject();
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
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
        }

    }

    private List<EDF<HI>> HXW(HI var1) throws FFK, FFO {

        Object var8;
        Object var2 = new ArrayList();
        EUY var3 = this.getProcess();
        if (var1 != null) {
            AGYN var4;
            if (!var1.AICE()) {
                if (var1.getNip() != null && var1.getNip().getValue() != null) {
                    var4 = new AGYN(HI.class, var1.getNip().getValue());
                    var2 = var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
                }
            } else if (var1.getName() != null && var1.getName().getValue() != null) {
                var4 = new AGYN(HI.class, var1.QON(), null);
                var2 = var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
            }
        }

        var8 = var2;

        return (List) var8;
    }

    private void HXX() {

        HashMap var1 = new HashMap();
        List var2;
        if (this.GMK.equals(EPB.CORRECT)) {
            var2 = this.GMM.getInvoiceElements();
        } else {
            var2 = this.GML.getInvoiceElements();
        }

        Iterator var3 = var2.iterator();

        while (var3.hasNext()) {
            HQ var4 = (HQ) var3.next();
            if (var1.get(var4.getTaxRate().getValue()) == null) {
                var1.put(var4.getTaxRate().getValue(), new ThreeValueBox(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
            }

            ((ThreeValueBox) var1.get(var4.getTaxRate().getValue())).setFirstValue(EQY.HRI((BigDecimal) ((ThreeValueBox) var1.get(var4.getTaxRate().getValue())).getFirstValue(), var4.getNetPriceForAll().getValue()));
            ((ThreeValueBox) var1.get(var4.getTaxRate().getValue())).setSecondValue(EQY.HRI((BigDecimal) ((ThreeValueBox) var1.get(var4.getTaxRate().getValue())).getSecondValue(), var4.getTaxValueForAll().getValue()));
            ((ThreeValueBox) var1.get(var4.getTaxRate().getValue())).setThirdValue(EQY.HRI((BigDecimal) ((ThreeValueBox) var1.get(var4.getTaxRate().getValue())).getThirdValue(), var4.getGrossValueForAll().getValue()));
        }

        if (this.GMK.equals(EPB.CORRECT)) {
            this.GMM.getSumOfAmountsDividedByTaxRate().clear();
            this.GMM.getAmountOfTaxDividedByTaxRate().clear();
            this.GMM.getSumOfGrossAmountsDividedByTaxRate().clear();
        } else {
            this.GML.getSumOfAmountsDividedByTaxRate().clear();
            this.GML.getAmountOfTaxDividedByTaxRate().clear();
            this.GML.getSumOfGrossAmountsDividedByTaxRate().clear();
        }

        var3 = var1.keySet().iterator();

        while (var3.hasNext()) {
            KL var8 = (KL) var3.next();
            if (this.GMK.equals(EPB.CORRECT)) {
                this.GMM.getSumOfAmountsDividedByTaxRate().add(new TwoValueBox(var8, ((ThreeValueBox) var1.get(var8)).getFirstValue()));
                this.GMM.getAmountOfTaxDividedByTaxRate().add(new TwoValueBox(var8, ((ThreeValueBox) var1.get(var8)).getSecondValue()));
                this.GMM.getSumOfGrossAmountsDividedByTaxRate().add(new TwoValueBox(var8, ((ThreeValueBox) var1.get(var8)).getThirdValue()));
            } else {
                this.GML.getSumOfAmountsDividedByTaxRate().add(new TwoValueBox(var8, ((ThreeValueBox) var1.get(var8)).getFirstValue()));
                this.GML.getAmountOfTaxDividedByTaxRate().add(new TwoValueBox(var8, ((ThreeValueBox) var1.get(var8)).getSecondValue()));
                this.GML.getSumOfGrossAmountsDividedByTaxRate().add(new TwoValueBox(var8, ((ThreeValueBox) var1.get(var8)).getThirdValue()));
            }
        }

    }

    private void HXY() {

        JN var1 = null;
        if (this.fxml_include_invoiceSaleLogicController.GLN != null && this.fxml_include_invoiceSaleLogicController.GLN.getPeriod() != null) {
            var1 = this.fxml_include_invoiceSaleLogicController.GLN.getPeriod();
        }

        JN finalVar = var1;
        this.getApplication().initController(this.getFxmlName(), EOS.INVOICE_SALE_LIST.getProcessFxmlFileName(), new Consumer<ENK<?>>() {
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

    private void HXZ() {

        try {
            EUY var1 = this.getProcess();
            File var2 = var1.getTempFile("pdf");
            LY var3 = var1.getUserDataForInvoice(this.GML);
            switch (this.GMK) {
                case NEW:
                case EDIT:
                case VIEW:
                    EPE var4 = new EPE(this.resources, (HU) this.GML, var3, var2);
                    var4.HOE();
                    break;
                case CORRECT:
                    EPI var5 = new EPI(this.resources, this.GMM, var3, var2);
                    var5.HOE();
                    break;
                case VIEW_CORRECTION:
                case EDIT_CORRECTION:
                    EPI var6 = new EPI(this.resources, (HV) this.GML, var3, var2);
                    var6.HOE();
            }
        } catch (FFO | FFK var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Print.Error"), var10);
        }

    }

    public void setContractor(HI var1) {
        this.GMK = EPB.NEW;
        this.GMO = var1;
    }
}
