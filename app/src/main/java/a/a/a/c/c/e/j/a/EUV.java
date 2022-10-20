package a.a.a.c.c.e.j.a;

import a.a.a.b.c.DialogButton;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.d.a.ENK;
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.g.Mode;
import a.a.a.c.c.d.h.EPE;
import a.a.a.c.c.d.h.EPI;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.d.ValueContainer3;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.g.ContractorModelCriteria;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.a.TaxRate;
import a.a.a.c.f.c.b.UserData;
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
    private Mode GMK;
    private BaseInvoiceSell GML;
    private InvoiceSellCorrection GMM;
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
    private Contractor GMO;

    public EUV(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
        this.GMK = Mode.NEW;
        this.GMN = false;

    }

    public void setMode(Mode var1) {

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
                DialogButton var8 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.isDisable(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
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
            this.GMK = Mode.NEW;
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
                    var1.setInvoiceSell((InvoiceSell) this.GML);
                    this.GML.setPreviousPeriod(this.GML.getPeriod().DDN());
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.EditName"));
                    this.fxml_include_invoiceSaleLogicController.QNH.set(true);
                    break;
                case CORRECT:
                    this.GMM = var1.getInvoiceSellCorrection();
                    BaseInvoiceSell var2 = this.getPrevoiusInvoiceFromHierarchyForNewCorrectionToGetElements(this.GML);
                    BaseInvoiceSell var3 = this.getPrevoiusInvoiceFromHierarchyForNewCorrectionToSetHierarchy(this.GML);
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
                    var1.setInvoiceSellCorrection((InvoiceSellCorrection) this.GML);
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

    private BaseInvoiceSell getPrevoiusInvoiceFromHierarchyForNewCorrectionToGetElements(BaseInvoiceSell var1) {

        BaseInvoiceSell var2;
        for (var2 = var1; var2.getChildInvoiceOnlyActive() != null; var2 = (BaseInvoiceSell) var2.getChildInvoiceOnlyActive()) {
        }

        BaseInvoiceSell var3 = var2;
        return var3;
    }

    private BaseInvoiceSell getPrevoiusInvoiceFromHierarchyForNewCorrectionToSetHierarchy(BaseInvoiceSell var1) {

        BaseInvoiceSell var2;
        for (var2 = var1; var2.getChildInvoiceWithCanceled() != null; var2 = (BaseInvoiceSell) var2.getChildInvoiceWithCanceled()) {
        }

        BaseInvoiceSell var3 = var2;
        return var3;
    }

    private BaseInvoiceSell getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(BaseInvoiceSell var1) {

        BaseInvoiceSell var2;
        var2 = (BaseInvoiceSell) var1.getParentInvoiceOnlyActive();

        return var2;
    }

    private static InvoiceSell getInvoiceFirstParent(BaseInvoiceSell var0) {

        BaseInvoiceSell var1;
        for (var1 = var0; var1.getParentInvoiceWithCanceled() != null; var1 = (BaseInvoiceSell) var1.getParentInvoiceWithCanceled()) {
        }

        InvoiceSell var2 = (InvoiceSell) var1;
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

    public void setInvoice(Invoice<?> var1) throws FFK {

        this.GML = (BaseInvoiceSell) var1;

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
            if (this.GMK.equals(Mode.CORRECT)) {
                this.GMM.setUsingInvoicingDate(new PrivtePerson(true));
            } else {
                this.GML.setUsingInvoicingDate(new PrivtePerson(true));
            }

            EUY var1 = this.getProcess();
            var1.HHL();
            if (this.fxml_include_invoiceSaleLogicController.GLV.get()) {
                InvoiceSell var2 = (InvoiceSell) this.GML;
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

    private void HXV(Contractor var1) {
        try {
            new ArrayList();
            EUY var3 = this.HHG();
            List var2 = this.HXW(var1);
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
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
        }

    }

    private List<EDF<Contractor>> HXW(Contractor var1) throws FFK, FFO {

        Object var8;
        Object var2 = new ArrayList();
        EUY var3 = this.getProcess();
        if (var1 != null) {
            ContractorModelCriteria var4;
            if (!var1.AICE()) {
                if (var1.getNip() != null && var1.getNip().getValue() != null) {
                    var4 = new ContractorModelCriteria(Contractor.class, var1.getNip().getValue());
                    var2 = var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
                }
            } else if (var1.getName() != null && var1.getName().getValue() != null) {
                var4 = new ContractorModelCriteria(Contractor.class, var1.QON(), null);
                var2 = var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
            }
        }

        var8 = var2;

        return (List) var8;
    }

    private void HXX() {

        HashMap var1 = new HashMap();
        List var2;
        if (this.GMK.equals(Mode.CORRECT)) {
            var2 = this.GMM.getInvoiceElements();
        } else {
            var2 = this.GML.getInvoiceElements();
        }

        Iterator var3 = var2.iterator();

        while (var3.hasNext()) {
            InvoiceElementSell var4 = (InvoiceElementSell) var3.next();
            if (var1.get(var4.getTaxRate().getValue()) == null) {
                var1.put(var4.getTaxRate().getValue(), new ValueContainer3(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
            }

            ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).setFirstValue(EQY.HRI((BigDecimal) ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).getFirstValue(), var4.getNetPriceForAll().getValue()));
            ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).setSecondValue(EQY.HRI((BigDecimal) ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).getSecondValue(), var4.getTaxValueForAll().getValue()));
            ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).setThirdValue(EQY.HRI((BigDecimal) ((ValueContainer3) var1.get(var4.getTaxRate().getValue())).getThirdValue(), var4.getGrossValueForAll().getValue()));
        }

        if (this.GMK.equals(Mode.CORRECT)) {
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
            TaxRate var8 = (TaxRate) var3.next();
            if (this.GMK.equals(Mode.CORRECT)) {
                this.GMM.getSumOfAmountsDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getFirstValue()));
                this.GMM.getAmountOfTaxDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getSecondValue()));
                this.GMM.getSumOfGrossAmountsDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getThirdValue()));
            } else {
                this.GML.getSumOfAmountsDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getFirstValue()));
                this.GML.getAmountOfTaxDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getSecondValue()));
                this.GML.getSumOfGrossAmountsDividedByTaxRate().add(new ValueContainer2(var8, ((ValueContainer3) var1.get(var8)).getThirdValue()));
            }
        }

    }

    private void HXY() {

        Period var1 = null;
        if (this.fxml_include_invoiceSaleLogicController.GLN != null && this.fxml_include_invoiceSaleLogicController.GLN.getPeriod() != null) {
            var1 = this.fxml_include_invoiceSaleLogicController.GLN.getPeriod();
        }

        Period finalVar = var1;
        this.getApplication().initController(this.getFxmlName(), Stage.INVOICE_SALE_LIST.getProcessFxmlFileName(), new Consumer<ENK<?>>() {
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
            UserData var3 = var1.getUserDataForInvoice(this.GML);
            switch (this.GMK) {
                case NEW:
                case EDIT:
                case VIEW:
                    EPE var4 = new EPE(this.resources, (InvoiceSell) this.GML, var3, var2);
                    var4.HOE();
                    break;
                case CORRECT:
                    EPI var5 = new EPI(this.resources, this.GMM, var3, var2);
                    var5.HOE();
                    break;
                case VIEW_CORRECTION:
                case EDIT_CORRECTION:
                    EPI var6 = new EPI(this.resources, (InvoiceSellCorrection) this.GML, var3, var2);
                    var6.HOE();
            }
        } catch (FFO | FFK var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Print.Error"), var10);
        }

    }

    public void setContractor(Contractor var1) {
        this.GMK = Mode.NEW;
        this.GMO = var1;
    }
}
