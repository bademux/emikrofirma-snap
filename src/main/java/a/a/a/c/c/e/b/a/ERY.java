package a.a.a.c.c.e.b.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.e.b.c.ESC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

public class ERY extends ELU<ESC> {
    private LY GBN;
    private final BooleanProperty GBO = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
    private boolean GBP;
    @FXML
    private Button fxml_generalButtonCancel;
    @FXML
    private Button fxml_generalButtonSave;
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    public ERV fxml_include_userLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;

    public ERY(EMC var1, EMT var2, String var3, String var4) {
        super(var1, var2, var3, var4);
    }

    public void HHE() throws FFK {
        EXF.getInstance().ICO();

        try {
            super.HHE();
            this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.user.label"));
            this.GBO.bind(this.fxml_include_userLogicController.GBK);
            this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_userLogicController.GBL.and(this.fxml_include_userLogicController.GBK).not());
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean HHB() {
        EXF.getInstance().ICO();

        boolean var2;
        try {
            boolean var1 = true;
            if (this.GBP) {
                var1 = true;
            } else if (this.GBO.get()) {
                FEN var9 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.disableProperty().get(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                switch (var9) {
                    case CancelExit:
                    default:
                        var1 = false;
                        break;
                    case ExitAndSave:
                        FEN var3 = FCR.getConfirmDataDialog(this.resources.getString("micro.user.save.confirm.title"), null, this.resources.getString("micro.user.save.ok"), this.resources.getString("micro.user.save.cancel"), 500.0, 100.0, this.resources.getString("micro.user.save.info"));
                        switch (var3) {
                            case Confirm:
                                this.GBP = true;
                                this.getProcessAndFinish();
                                this.getApplication().HJD(this.getFxmlName(), "main.fxml");
                                break;
                            case Reject:
                                this.GBP = false;
                                break;
                            case CancelExit:
                            default:
                                this.GBP = false;
                        }

                        var1 = true;
                        break;
                    case ExitWithoutSave:
                        this.getProcessAndReset();
                        var1 = true;
                }
            }

            if (var1) {
                this.HSR();
                this.getProcessAndReset();
                this.fxml_include_userLogicController.HHB();
                this.fxml_include_left_barController.HHB();
                this.fxml_include_top_menuController.HHB();
                var2 = true;
                return var2;
            }

            var2 = false;
        } catch (Exception var7) {
            EXF.getInstance().ICA(var7);
            FCT.IGX("", var7);
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
            this.fxml_include_container.setVvalue(0.0);
            this.GBP = false;
            ESC var1 = this.HHG();
            this.GBN = var1.getUserData();
            this.fxml_include_userLogicController.HSO(this.GBN);
            this.fxml_include_userLogicController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_include_top_menuController.HHC();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void initialize() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    private void getProcessAndReset() throws Exception {
        EXF.getInstance().ICO();

        try {
            ESC var1 = this.getProcess();
            var1.resetAndCleanUpProcess();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void getProcessAndFinish() throws Exception {
        EXF.getInstance().ICO();

        try {
            ESC var1 = this.getProcess();
            var1.HHL();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    public void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [cancel] clicked");
            this.GBP = true;
            this.getProcessAndReset();
            this.getApplication().HJD(this.getFxmlName(), "main.fxml");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    @FXML
    public void fxml_handleButton_generalButtonSave(ActionEvent var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICE("Button [save] clicked");
            this.GBP = true;
            FEN var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.user.save.confirm.title"), null, this.resources.getString("micro.user.save.ok"), this.resources.getString("micro.user.save.cancel"), 500.0, 100.0, this.resources.getString("micro.user.save.info"));
            switch (var2) {
                case Confirm:
                    this.GBP = true;
                    this.getProcessAndFinish();
                    this.getApplication().HJD(this.getFxmlName(), "main.fxml");
                    break;
                case Reject:
                    this.GBP = false;
                    break;
                case CancelExit:
                default:
                    this.GBP = false;
            }
        } catch (Exception var6) {
            EXF.getInstance().ICA(var6);
            FCT.IGX("", var6);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HSR() {
        EXF.getInstance().ICO();

        try {
            this.fxml_include_userLogicController.HSP(this.GBN);
            this.GBN = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
