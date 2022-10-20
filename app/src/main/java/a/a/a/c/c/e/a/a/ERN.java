package a.a.a.c.c.e.a.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMU;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.c.e.a.c.ERU;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.c.a.AILX;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.c.TextFieldValidated_RefIdPattern;
import a.a.a.c.g.FCQ;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;

import java.util.Date;
import java.util.Map;

public class ERN extends BaseProgressFxController<ERU> {
    private ConfigurationProperties GAD;
    private LS GAE;
    private LS GAF;
    private AILX GAG;
    private LS GAH;
    private LS GAI;
    private final BooleanProperty GAJ = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
    private final BooleanProperty RAA = new SimpleBooleanProperty(this, "innerChangedPropertyHolder", false);
    private ERO GAK;
    private ERO GAL;
    private boolean GAN;
    @FXML
    private Button fxml_generalButtonCancel;
    @FXML
    private Button fxml_generalButtonSave;
    @FXML
    private ScrollPane fxml_include_container;
    @FXML
    private ERS fxml_include_configurationLogicController;
    @FXML
    private EMP fxml_include_left_barController;
    @FXML
    private EMR fxml_include_top_menuController;

    private void HSB(EMU var1, ERS var2, TextFieldValidated_RefIdPattern var3, TextField var4) throws FFK {
        if (var3.IET()) {
            Date var5 = new Date();
            Button var10000 = var2.fxml_config_f_default0;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "FA/#%yyyy%#/#%MM%#/#%dd%#/#%sequence1%#", false));
            var10000 = var2.fxml_config_f_default1;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "FV/#%yyyy%#/#%MM%#/#%dd%#-#%sequence1%#", false));
            var10000 = var2.fxml_config_f_default2;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "#%sequence1%#/F/#%yyyy%#/#%MM%#", false));
            var10000 = var2.fxml_config_f_default3;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "FV_#%sequence1%#/#%MM%#/#%yyyy%#", false));
            var10000 = var2.fxml_config_f_default4;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "F_VAT-#%yyyy%#-#%MM%#-#%dd%#/#%sequence1%#", false));
            var10000 = var2.fxml_config_c_default0;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "FK/#%yyyy%#/#%MM%#/#%dd%#/#%sequence2%#", false));
            var10000 = var2.fxml_config_c_default1;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "FK/#%yyyy%#/#%MM%#/#%dd%#-#%sequence2%#", false));
            var10000 = var2.fxml_config_c_default2;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "#%sequence2%#/KOR/#%yyyy%#/#%MM%#", false));
            var10000 = var2.fxml_config_c_default3;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "FK_#%sequence2%#/#%MM%#/#%yyyy%#", false));
            var10000 = var2.fxml_config_c_default4;
            var2.getClass();
            var10000.setText(var1.ROI(var5, "F_KOR-#%yyyy%#-#%MM%#-#%dd%#/#%sequence2%#", false));
            var4.setText(var1.ROI(var5, var3.getText(), false));
        } else {
            var4.setText("");
        }

    }

    public ERN(FXApp var1, EMW var2, String var3, String var4) {
        super(var1, var2, var3, var4);
    }

    public void init() throws FFK {

        try {
            super.init();
            this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.config.label"));
            this.GAJ.bind(this.fxml_include_configurationLogicController.fxml_include_propertyWorkingDir_boxController.changedProperty().or(this.fxml_include_configurationLogicController.fxml_include_propertyPkcs11LibraryFile_boxController.changedProperty().or(this.fxml_include_configurationLogicController.fxml_include_performVerificationLabeledCheckBox_boxController.changedProperty().or(this.fxml_include_configurationLogicController.GAV.changedProperty().or(this.fxml_include_configurationLogicController.GAW.changedProperty().or(this.RAA))))));
            this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_configurationLogicController.fxml_include_propertyWorkingDir_boxController.requiredAndValidProperty().and(this.fxml_include_configurationLogicController.fxml_include_propertyPkcs11LibraryFile_boxController.requiredAndValidProperty().and(this.fxml_include_configurationLogicController.GAV.IFE().and(this.fxml_include_configurationLogicController.GAW.IFE()))).and(this.fxml_include_configurationLogicController.fxml_include_propertyWorkingDir_boxController.changedProperty().or(this.fxml_include_configurationLogicController.fxml_include_propertyPkcs11LibraryFile_boxController.changedProperty().or(this.fxml_include_configurationLogicController.fxml_include_performVerificationLabeledCheckBox_boxController.changedProperty().or(this.fxml_include_configurationLogicController.GAV.changedProperty().or(this.fxml_include_configurationLogicController.GAW.changedProperty().or(this.RAA)))))).not());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public boolean HHB() {

        boolean var2;
        try {
            boolean var1 = true;
            if (!this.GAN && (this.fxml_include_configurationLogicController == null || !this.fxml_include_configurationLogicController.QOT())) {
                if (this.GAJ.get()) {
                    FEN var8 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.disableProperty().get(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
                    switch (var8) {
                        case ExitAndSave:
                            this.getProcessAndFinish();
                            var1 = true;
                            break;
                        case ExitWithoutSave:
                            this.getProcessAndReset();
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

            if (!var1) {
                var2 = false;
                return var2;
            }

            this.HSC();
            if (this.fxml_include_configurationLogicController == null || !this.fxml_include_configurationLogicController.QOT()) {
                this.getProcessAndReset();
            }

            if (this.fxml_include_configurationLogicController != null) {
                this.fxml_include_configurationLogicController.HHB();
            }

            this.fxml_include_left_barController.HHB();
            this.fxml_include_top_menuController.HHB();
            var2 = true;
            return var2;
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
            var2 = true;
        }

        return var2;
    }

    public void HHC() {

        try {
            this.fxml_include_container.setVvalue(0.0);
            this.GAN = false;
            this.RAA.set(false);
            final ERU var1 = this.HHG();
            this.GAD = var1.getConfigurationProperties();
            this.GAE = (LS) this.GAD.getConfigurationPropertyOrDefault(FCQ.WorkingDir);
            this.GAF = (LS) this.GAD.getConfigurationPropertyOrDefault(FCQ.Pkcs11LibraryFile);
            this.GAG = (AILX) this.GAD.getConfigurationPropertyOrDefault(FCQ.PerformVerification);
            this.GAH = (LS) this.GAD.getConfigurationPropertyOrDefault(FCQ.SellRefIdPattern);
            this.GAI = (LS) this.GAD.getConfigurationPropertyOrDefault(FCQ.SellCorrectionRefIdPattern);
            this.fxml_include_configurationLogicController.HSI(this.GAE, this.GAF, this.GAG, this.GAH, this.GAI);
            if (this.GAK == null) {
                this.GAK = new ERO(var1.getModelManager(), this.fxml_include_configurationLogicController, this.fxml_include_configurationLogicController.GAV, this.fxml_include_configurationLogicController.fxml_config_f_preview);
                this.fxml_include_configurationLogicController.GAV.textProperty().addListener(this.GAK);
            }

            if (this.GAL == null) {
                this.GAL = new ERO(var1.getModelManager(), this.fxml_include_configurationLogicController, this.fxml_include_configurationLogicController.GAW, this.fxml_include_configurationLogicController.fxml_config_c_preview);
                this.fxml_include_configurationLogicController.GAW.textProperty().addListener(this.GAL);
            }

            final Map var2 = var1.getModelManager().getSequences();
            this.fxml_include_configurationLogicController.setSequences(var2);
            this.fxml_include_configurationLogicController.setSequenceUpdater(new ERS.QTC() {
                public void RKK(String var1x, Period var2x, Integer var3, Integer var4) {
                    try {
                        if (var1x != null && var1x.length() > 0 && var2x != null && var2x.DDJ().getValue() != null && var2x.DDK().getValue() != null && var3 != null && var4 != null) {
                            Map var5 = (Map) var2.get(var1x);
                            if (var5 != null) {
                                Integer var6 = (Integer) var5.get(var2x);
                                if (var6 != null && var6.equals(var3)) {
                                    var5.put(var2x, var4);
                                    var1.getModelManager().ROJ(var2x, var1x, var3, var4);
                                    ERN.this.RAA.set(true);
                                }
                            }
                        }
                    } catch (Exception var7) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                    }

                }
            });
            this.fxml_include_configurationLogicController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_include_top_menuController.HHC();
            this.HSB(var1.getModelManager(), this.fxml_include_configurationLogicController, this.fxml_include_configurationLogicController.GAV, this.fxml_include_configurationLogicController.fxml_config_f_preview);
            this.HSB(var1.getModelManager(), this.fxml_include_configurationLogicController, this.fxml_include_configurationLogicController.GAW, this.fxml_include_configurationLogicController.fxml_config_c_preview);
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    public void initialize() {

    }

    private void getProcessAndReset() throws Exception {

        ERU var1 = this.getProcess();
        var1.resetAndCleanUpProcess();

    }

    private void getProcessAndFinish() throws Exception {

        ERU var1 = this.getProcess();
        var1.HHL();

    }

    @FXML
    protected void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [cancel] clicked");
        this.GAN = true;
        this.getProcessAndReset();
        this.getApplication().initController(this.getFxmlName(), "main.fxml", null);

    }

    @FXML
    protected void fxml_handleButton_generalButtonSave(ActionEvent var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [save] clicked");
            this.GAN = true;
            this.getProcessAndFinish();
            this.getApplication().initController(this.getFxmlName(), "main.fxml", null);
        } catch (Exception var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
        }

    }

    private void HSC() {

        this.fxml_include_configurationLogicController.HSJ(this.GAE, this.GAF, this.GAG, this.GAH, this.GAI);
        this.GAD = null;
        this.GAE = null;
        this.GAF = null;
        this.GAG = null;
        this.GAH = null;
        this.GAI = null;

    }

    private class ERO implements ChangeListener<String> {
        private final EMU FZZ;
        private final ERS GAA;
        private final TextFieldValidated_RefIdPattern GAB;
        private final TextField GAC;

        public ERO(EMU var2, ERS var3, TextFieldValidated_RefIdPattern var4, TextField var5) {

            this.FZZ = var2;
            this.GAA = var3;
            this.GAB = var4;
            this.GAC = var5;

        }

        public void changed(ObservableValue<? extends String> var1, String var2, String var3) {

            try {
                ERN.this.HSB(this.FZZ, this.GAA, this.GAB, this.GAC);
            } catch (FFK var8) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                throw new FFI(var8);
            }

        }
    }
}
