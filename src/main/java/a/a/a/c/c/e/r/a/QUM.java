package a.a.a.c.c.e.r.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENK;
import a.a.a.c.c.d.a.QUV;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.r.c.QUU;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSJ;
import a.a.a.c.f.a.n.QSN;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class QUM extends QUV<QUU> {
    private QSN RDR;
    private EPB RDS;
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    public QUN fxml_include_invoiceSaleLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    public Button fxml_generalButtonSave;
    @FXML
    public Button fxml_generalButtonCancel;
    private boolean RDT = false;

    public QUM(EMC var1, EMT var2, String var3, String var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    @FXML
    public void initialize() {
        EXF.getInstance().ICO();

        try {
            this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_invoiceSaleLogicController.RDX.not());
            this.fxml_generalButtonSave.visibleProperty().bind(this.fxml_include_invoiceSaleLogicController.REA);
            this.fxml_generalButtonSave.managedProperty().bind(this.fxml_include_invoiceSaleLogicController.REA);
            this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_invoiceSaleLogicController.RDX.and(this.fxml_include_invoiceSaleLogicController.REA.and(this.fxml_include_invoiceSaleLogicController.RED)).not());
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HHE() {
        EXF.getInstance().ICO();

        try {
            super.HHE();
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            FCT.IGX("", var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean HHB() {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            if (!this.fxml_include_invoiceSaleLogicController.RED.get()) {
                this.RDT = true;
            }

            boolean var1 = true;
            if (!this.RDT) {
                this.RDT = false;
                FEN var8 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.isDisable(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                switch (var8) {
                    case ExitAndSave:
                        var1 = true;
                        this.RNG();
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
            this.RDS = EPB.NEW;
            this.RDR = null;
            this.getProcess().resetAndCleanUpProcess();
            var2 = true;
        } catch (FFO | FFK var6) {
            EXF.getInstance().ICA(var6);
            var2 = true;
            return var2;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public void HHC() {
        EXF.getInstance().ICO();

        try {
            this.RDT = false;
            this.fxml_include_top_menuController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_include_container.setVvalue(this.fxml_include_container.getVmin());
            QUU var1 = this.HHG();
            this.fxml_include_invoiceSaleLogicController.setProcessImplementation(var1);
            if (this.RDS == null) {
                this.RDS = EPB.NEW;
            }

            this.fxml_include_invoiceSaleLogicController.setMode(this.RDS);
            var1.setMode(this.RDS);
            this.fxml_include_invoiceSaleLogicController.REA.set(true);
            this.fxml_include_invoiceSaleLogicController.REB.set(false);
            switch (this.RDS) {
                case NEW:
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.other_sale_new.title.NewName"));
                    this.RDR = var1.getInvoiceOtherSell();
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
                    break;
                case EDIT:
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.other_sale_new.title.EditName"));
                    var1.setInvoiceOtherSell(this.RDR);
                    this.fxml_include_invoiceSaleLogicController.REB.set(true);
                    this.fxml_include_invoiceSaleLogicController.setInvoiceOtherSubType(this.RDR.getInvoiceOtherSubType());
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
                    break;
                case VIEW:
                    this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.other_sale_new.title.ViewName"));
                    this.fxml_include_invoiceSaleLogicController.REA.set(false);
                    this.fxml_include_invoiceSaleLogicController.setInvoiceOtherSubType(this.RDR.getInvoiceOtherSubType());
                    this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Return_AlternateCancel"));
            }

            this.fxml_include_invoiceSaleLogicController.setInvoiceOther(this.RDR);
            this.fxml_include_invoiceSaleLogicController.HHC();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var5) {
            EXF.getInstance().ICA(var5);
            FCT.IGX("", var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    public void fxml_handleButton_back(ActionEvent var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    @FXML
    public void fxml_handleButton_generalButtonCancel(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [cancel] clicked");
            this.RDT = true;
            this.RNK();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    public void fxml_handleButton_generalButtonSave(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [save] clicked");
            this.RDT = true;
            this.RNG();
            this.RNK();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void RNG() {
        EXF.getInstance().ICO();

        try {
            this.RNJ();
            this.RDR.setInvoiceOtherSubType(this.fxml_include_invoiceSaleLogicController.RNV());
            QUU var1 = this.getProcess();
            var1.HHL();
            if (this.fxml_include_invoiceSaleLogicController.REG.get() && this.RDR.RJS() != null) {
                this.RNH(this.RDR.getContractor());
            }
        } catch (FFO | FFI | FFK var8) {
            EXF.getInstance().ICA(var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Error.SaveInvoice"), var8);

            try {
                this.getProcess().resetAndCleanUpProcess();
            } catch (FFO | FFK var7) {
                EXF.getInstance().ICA(var8);
                FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Error.SaveInvoice"), var8);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void RNH(HI var1) {
        try {
            new ArrayList();
            QUU var3 = this.HHG();
            if (var1.DAI().getValue() != null && var1.DAI().getValue().length() != 0 && var1.DAJ().getValue() != null && var1.DAJ().getValue().length() != 0) {
                List var2 = this.RNI(var1);
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
            }
        } catch (FFO | FFK var5) {
            EXF.getInstance().ICA(var5);
        }

    }

    private List<EDF<HI>> RNI(HI var1) throws FFK, FFO {
        EXF.getInstance().ICO();

        Object var8;
        try {
            Object var2 = new ArrayList();
            QUU var3 = this.getProcess();
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
        } finally {
            EXF.getInstance().ICP();
        }

        return (List) var8;
    }

    private void RNJ() {
        EXF.getInstance().ICO();

        try {
            HashMap var1 = new HashMap();
            List var2 = this.RDR.getInvoiceOtherElements();
            Iterator var3 = var2.iterator();

            while (var3.hasNext()) {
                QSJ var4 = (QSJ) var3.next();
                if (var1.get(var4.getTaxRate().getValue()) == null) {
                    var1.put(var4.getTaxRate().getValue(), new EWC(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
                }

                ((EWC) var1.get(var4.getTaxRate().getValue())).setFirstValue(EQY.HRI((BigDecimal) ((EWC) var1.get(var4.getTaxRate().getValue())).getFirstValue(), var4.getNetPriceForAll().getValue()));
                ((EWC) var1.get(var4.getTaxRate().getValue())).setSecondValue(EQY.HRI((BigDecimal) ((EWC) var1.get(var4.getTaxRate().getValue())).getSecondValue(), var4.getTaxValueForAll().getValue()));
                ((EWC) var1.get(var4.getTaxRate().getValue())).setThirdValue(EQY.HRI((BigDecimal) ((EWC) var1.get(var4.getTaxRate().getValue())).getThirdValue(), var4.getGrossValueForAll().getValue()));
            }

            this.RDR.getSumOfAmountsDividedByTaxRate().clear();
            this.RDR.getAmountOfTaxDividedByTaxRate().clear();
            this.RDR.getSumOfGrossAmountsDividedByTaxRate().clear();
            var3 = var1.keySet().iterator();

            while (var3.hasNext()) {
                KL var8 = (KL) var3.next();
                this.RDR.getSumOfAmountsDividedByTaxRate().add(new EVZ(var8, ((EWC) var1.get(var8)).getFirstValue()));
                this.RDR.getAmountOfTaxDividedByTaxRate().add(new EVZ(var8, ((EWC) var1.get(var8)).getSecondValue()));
                this.RDR.getSumOfGrossAmountsDividedByTaxRate().add(new EVZ(var8, ((EWC) var1.get(var8)).getThirdValue()));
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void RNK() {
        EXF.getInstance().ICO();

        try {
            JN var1 = null;
            if (this.RDR != null && this.RDR.getPeriod() != null) {
                var1 = this.RDR.getPeriod();
            }

            JN finalVar = var1;
            this.getApplication().HJE(this.getFxmlName(), EOS.OTHER_SALE_LIST.getProcessFxmlFileName(), new ENB<ENK<?>>() {
                public void HNE(ENK<?> var1x) {
                    EXF.getInstance().ICO();

                    try {
                        var1x.setPeriod(finalVar);
                    } catch (FFK var6) {
                        EXF.getInstance().ICA(var6);
                        throw new FFI(var6);
                    } finally {
                        EXF.getInstance().ICP();
                    }

                }
            });
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setInvoice(QSG<?> var1) throws FFK {
        this.RDR = (QSN) var1;
    }

    public void setContractor(HI var1) {
    }

    public void setMode(EPB var1) {
        this.RDS = var1;
    }
}
