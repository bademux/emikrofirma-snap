package a.a.a.c.c.e.i.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.d.b.EPX;
import a.a.a.c.d.b.EQE;
import a.a.a.c.d.b.EQM;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.f.a.d.JPKSchemaType;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import a.a.a.c.g.c.FCZ;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.regex.Matcher;

public class EUB {
    private final EWX GJW;
    private final EQE GJX;
    @FXML
    private ResourceBundle resources;
    private Stage GJY;
    private File GJZ;
    private EUF GKA;
    @FXML
    private Text fxml_text;
    @FXML
    private ProgressBar fxml_progressBar;
    @FXML
    private ProgressIndicator fxml_progressIndicator;
    private File GKB;
    private EVN GKC;

    public EUB() {

        this.GJW = new EWX() {
            public void IBI(long var1, double var3, long var5, long var7, long var9, long var11) {
                EUB.this.setProgress(EUB.this.fxml_progressBar, EUB.this.fxml_progressIndicator, var3);
            }
        };
        this.GJX = new EQE() {
            protected void HPZ() {
                EUB.this.GJY.close();
            }
        };

    }

    private void setProgress(final ProgressBar var1, final ProgressIndicator var2, final Double var3) {

        FEL.IKS(new FEM<Void>() {
            public Void IKT() {
                EUB.this.setProgressInner(var1, var2, var3);
                return null;
            }
        });

    }

    private void setProgressInner(ProgressBar var1, ProgressIndicator var2, Double var3) {

        if (var1 != null && var3 != null) {
            if (var3 < 0.0) {
                var1.setProgress(0.0);
                var1.setDisable(true);
                var2.setProgress(0.0);
                var2.setDisable(true);
            } else {
                var1.setProgress(var3);
                var1.setDisable(false);
                var2.setProgress(var3);
                var2.setDisable(false);
            }
        }

    }

    private void HWO(String var1) {

        this.HWQ(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.dialog.processing.information.title"), var1);

    }

    private void HWP(String var1) {

        this.HWR(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.dialog.processing.exception.title"), var1);

    }

    private void HWQ(String var1, String var2) {

        FCR.IGE(var1, var2, "", false);
        this.GJX.HQA();

    }

    private void HWR(String var1, String var2) {

        FCR.IGK(var1, var2, false);
        this.GJX.HQA();

    }

    public void setDialogStage(Stage var1) {

        this.GJY = var1;
        this.GJY.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent var1) {
                if (WindowEvent.WINDOW_CLOSE_REQUEST.equals(var1.getEventType())) {
                    EUB.this.GKC.stop();
                    if (EUB.this.GKB != null && EUB.this.GKB.exists()) {
                        boolean var2 = EUB.this.GKB.delete();
                        org.slf4j.LoggerFactory.getLogger(getClass()).debug("deleted " + var2);
                    }
                }

            }
        });

    }

    public void setImplementation(EUF var1) throws FFK {

        this.GKA = var1;
        if (this.GJZ == null) {
            this.GJZ = this.GKA.getWorkingDir(this.GJY);
        }

    }

    private void HWS() {

        try {
            JPKSchemaType var1 = JPKSchemaType.AHSV;
            String var2 = var1.getKodFormularza() + " (" + var1.getWariantFormularza() + ") " + var1.getWersjaSchemy();
            this.fxml_text.setText(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.desc").replaceFirst("##SCHEMA##", var2));
            File var3 = this.HWU();
            if (var3 != null) {
                try {
                    JPKSchemaType var4 = (new EQM()).HQN(var3);
                    if (!var1.getKodFormularza().equals(var4.getKodFormularza()) || !var1.getKodSystemowy().equals(var4.getKodSystemowy()) || !var1.getWersjaSchemy().equals(var4.getWersjaSchemy()) || !var1.getWariantFormularza().equals(var4.getWariantFormularza())) {
                        throw FCZ.getInstance().IHX(var4.toString());
                    }

                    this.GKB = this.HWV(var4);
                    if (this.GKB != null) {
                        EPX.HPQ(this.GJW, var3, this.GKB);
                        this.HWO(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.success"));
                    } else {
                        this.HWP(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.output.filenotselected"));
                    }
                } catch (FFO var16) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var16);
                    if (this.GKB != null && this.GKB.exists()) {
                        boolean var5 = this.GKB.delete();
                        org.slf4j.LoggerFactory.getLogger(getClass()).debug("deleted " + var5);
                    }

                    this.HWP(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.error.other").replaceFirst("##ERROR##", Matcher.quoteReplacement(var16.getLocalizedMessage())));
                } finally {
                    EWX.IBJ(this.GJW, 1.0, 0L, 0L);
                }
            } else {
                this.HWP(FCW.getInstance().getMessageForKey("micro.process.declaration_list.selectandconvert.input.filenotselected"));
            }
        } catch (Exception var18) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var18);
            FCT.IGX("", var18);
        }

    }

    public void HWT() {

        this.GKC = new EVN() {
            public void HZI() {

                EUB.this.HWS();

            }
        };
        this.GKC.start();

    }

    private File HWU() {

        File var1;
        var1 = FEL.IKS(new FEM<File>() {
            public File IKT() {
                FileChooser var1 = new FileChooser();
                var1.setTitle(EUB.this.resources.getString("micro.types.csv.fileselect"));
                FileChooser.ExtensionFilter var2 = new FileChooser.ExtensionFilter(EUB.this.resources.getString("micro.types.csv.filetype.xml") + " (*.csv, *.txt)", "*.csv", "*.txt");
                var1.getExtensionFilters().add(var2);
                if (EUB.this.GJZ != null) {
                    var1.setInitialDirectory(EUB.this.GJZ);
                }

                File var3 = var1.showOpenDialog(EUB.this.GJY);
                if (var3 != null) {
                    EUB.this.GJZ = var3.getParentFile();
                }

                return var3;
            }
        });

        return var1;
    }

    private File HWV(final JPKSchemaType var1) {

        File var2;
        var2 = FEL.IKS(new FEM<File>() {
            public File IKT() {
                FileChooser var1x = new FileChooser();
                var1x.setTitle(EUB.this.resources.getString("micro.types.xml.fileselect"));
                FileChooser.ExtensionFilter var2 = new FileChooser.ExtensionFilter(EUB.this.resources.getString("micro.types.xml.filetype.xml") + " (*.xml)", "*.xml");
                var1x.getExtensionFilters().add(var2);
                if (EUB.this.GJZ != null) {
                    var1x.setInitialDirectory(EUB.this.GJZ);
                }

                String var3 = "";
                if (var1 != null) {
                    var3 = var1.getKodFormularza() + "_" + var1.getWariantFormularza() + "_";
                } else {
                    var3 = "JPK_";
                }

                SimpleDateFormat var4 = new SimpleDateFormat("yyyyMMdd'T'HHmmssS");
                String var5 = var3 + var4.format(new Date()) + ".xml";
                var1x.setInitialFileName(var5);
                File var6 = var1x.showSaveDialog(EUB.this.GJY);
                return var6;
            }
        });

        return var2;
    }
}
