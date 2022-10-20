package a.a.a.c.c.e.c.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.QGU;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.l.MDP;
import a.a.a.c.c.e.c.c.ESJ;
import a.a.a.c.d.b.EPW;
import a.a.a.c.d.b.EQM;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.JT;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.app.FXApp;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.util.List;
import java.util.ResourceBundle;

public class QKI {
    private AGWW QMU;
    @FXML
    private ResourceBundle resources;
    private Stage QMV;
    private ESJ QMW;
    private Settlement QMX;
    private FXApp QMY;
    private String QMZ;
    @FXML
    private TextArea fxml_textArea_log;
    @FXML
    private VBox fxml_vBox_progress;
    private EVN QNA;
    @FXML
    private Button fxml_button_close;

    public QKI() {

    }

    public void setDeclarationSubType(AGWW var1) {
        this.QMU = var1;
    }

    public void setDialogStage(Stage var1) {

        this.QMV = var1;
        this.QMV.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent var1) {
                if (WindowEvent.WINDOW_CLOSE_REQUEST.equals(var1.getEventType())) {
                    QKI.this.QNA.stop();
                }

            }
        });

    }

    public void setImplementation(ESJ var1) {

        this.QMW = var1;

    }

    public void setSettlement(Settlement var1) {

        this.QMX = var1;

    }

    public void setApplication(FXApp var1) {
        this.QMY = var1;
    }

    public void setFxmlParentName(String var1) {
        this.QMZ = var1;
    }

    private void QPB() throws QGU {

        MDP var1 = null;

        try {
            String var2 = this.QMW.getPkcs11LibraryFilePath();
            var1 = new MDP(this.resources, this.fxml_textArea_log, this.fxml_vBox_progress, var2);
            Period var3 = this.QMX.getPeriod();
            Integer var4 = this.QMW.HTQ(var3, HM.JPK, AGWW.VAT);
            if (var4 == null) {
                var4 = 0;
            }

            File var5 = this.QPD(var3, var4, "JPK_VAT_3");
            if (var5 != null) {
                List var6 = this.QMW.HTO(var3);
                if (var6 != null) {
                    File var7 = this.QMW.getWorkingDir(this.QMV);
                    UserData var8 = this.QMW.getUserData();
                    var1.getProgressBarContainer().setFirstValue(var1.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.init_JPK_VAT")));
                    byte[] var9 = EPW.HOW(var1.getProgressReporter(), var5, var3, var4, var8, var6);
                    String var10 = HM.JPK.name() + "_" + AGWW.VAT.name();
                    List var11 = (new EQM()).HQP(var10);
                    if (var11.size() != 1) {
                        throw new FFK("Invalid number of schema types for [" + var10 + "]");
                    }

                    JPKSchemaType var12 = (JPKSchemaType) var11.get(0);
                    HK var13 = new HK(var4, var5, var12);
                    var13.setDeclarationFileCheckSumMD5(new JT(var9));
                    File var14 = new File(var7, "tmp_" + System.nanoTime());
                    var14.mkdirs();
                    var13.setContextDir(var14);
                    var13.FJI().setValue(var4);
                    var13.setDeclarationStatus(HL.NEW);
                    var13.setPeriod(var3);
                    DeclarationJPK var15 = var1.HQF(var13);
                    if (var15 != null) {
                        var15.setDeclarationStatus(HL.SENT);
                        this.QMW.HTR(var15, this.QMX);
                    }
                } else {
                    var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.missingdbresult"));
                }
            } else {
                var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.filenotselected"));
            }
        } catch (QGU var20) {
            if (var20.getReturnedValue() == 1) {
                Platform.runLater(new Runnable() {
                    public void run() {
                        QKI.this.QMV.close();
                        QKI.this.QMY.initController(QKI.this.QMZ, EOS.CONFIG.getProcessFxmlFileName(), null);
                    }
                });
            } else {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var20);
                FCT.IGX("", var20);
            }
        } catch (Exception var21) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var21);
            FCT.IGX("", var21);
        }

    }

    public void QPC() {

        this.QNA = new EVN() {
            public void HZI() {

                try {
                    if (QKI.this.QMU == AGWW.VAT) {
                        QKI.this.QPB();
                    } else {
                        throw new FFI("JPK subtype not supported");
                    }
                } catch (QGU var5) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
                }

            }
        };
        this.QNA.start();

    }

    private File QPD(final Period var1, final int var2, final String var3) {

        File var4;
        var4 = FEL.IKS(new FEM<File>() {
            public File IKT() {
                try {
                    FileChooser var1x = new FileChooser();
                    var1x.setTitle(QKI.this.resources.getString("micro.types.xml.fileselect"));
                    FileChooser.ExtensionFilter var2x = new FileChooser.ExtensionFilter(QKI.this.resources.getString("micro.types.xml.filetype.xml") + " (*.xml)", "*.xml");
                    var1x.getExtensionFilters().add(var2x);
                    File var3x = QKI.this.QMW.getWorkingDir(QKI.this.QMV);
                    var1x.setInitialDirectory(var3x);
                    String var4 = null;
                    KA var5 = QKI.this.QMW.QOX();
                    if (var5 != null && var5.getValue() != null) {
                        var4 = var5.getValue() + "_";
                    } else {
                        var4 = "";
                    }

                    String var6 = var3 + "_" + var4 + var1.getYear().getValue() + "_" + var1.getMonth().getValue() + "_" + var2 + ".xml";
                    var1x.setInitialFileName(var6);
                    File var7 = var1x.showSaveDialog(QKI.this.QMV);
                    return var7;
                } catch (FFK var8) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                    return null;
                }
            }
        });

        return var4;
    }

    @FXML
    private void fxml_handleButton_close(ActionEvent var1) {

        this.QMV.close();

    }
}
