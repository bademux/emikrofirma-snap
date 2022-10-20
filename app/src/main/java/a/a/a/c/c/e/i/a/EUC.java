package a.a.a.c.c.e.i.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.f.FFK;
import a.a.a.b.f.QGU;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.d.l.MDP;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.d.b.EPW;
import a.a.a.c.d.b.EQM;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Bytes;
import a.a.a.c.f.b.c.Nip;
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
import javafx.stage.WindowEvent;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

@Slf4j
public class EUC {
    @FXML
    private ResourceBundle resources;
    private javafx.stage.Stage GKD;
    private EUF GKE;
    private FXApp QHW;
    private String QHX;
    @FXML
    private TextArea fxml_textArea_log;
    @FXML
    private VBox fxml_vBox_progress;
    private JpkFaGenerateSettings QMC;
    private boolean QMD = false;
    private EVN GKF;
    @FXML
    private Button fxml_button_close;

    public EUC() {

    }

    public void setDialogStage(javafx.stage.Stage var1) {

        this.GKD = var1;
        this.GKD.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent var1) {
                if (WindowEvent.WINDOW_CLOSE_REQUEST.equals(var1.getEventType())) {
                    EUC.this.GKF.stop();
                }

            }
        });

    }

    public void setImplementation(EUF var1) {

        this.GKE = var1;

    }

    public void setApplication(FXApp var1) {
        this.QHW = var1;
    }

    public void setFxmlParentName(String var1) {
        this.QHX = var1;
    }

    private void HWW() {

        MDP var1 = null;

        try {
            String var2 = this.GKE.getPkcs11LibraryFilePath();
            var1 = new MDP(this.resources, this.fxml_textArea_log, this.fxml_vBox_progress, var2);
            File var3 = this.HWY();
            if (var3 != null) {
                EQM var4 = new EQM();
                if (var4.HQL(var3)) {
                    ValueContainer2 var5 = var4.HQO(var3);
                    JPKSchemaType var6 = (JPKSchemaType) var5.getFirstValue();
                    Integer var7 = 0;

                    try {
                        var7 = Integer.parseInt((String) var5.getSecondValue());
                    } catch (NumberFormatException | NullPointerException e) {
                        log.warn("Something bad happened", e);
                    }

                    String[] var8 = var6.getKodFormularza().split("_");
                    DeclarationType var9 = DeclarationType.valueOf(var8[0]);
                    DeclarationSubtype var10 = DeclarationSubtype.valueOf(var8[1]);
                    Period var11 = Period.AOE;
                    Integer var12 = this.GKE.HXA(var11, var9, var10);
                    File var13 = this.GKE.getWorkingDir(this.GKD);
                    var1.getProgressBarContainer().setFirstValue(var1.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.md5.checksum")));
                    boolean var14 = this.GKE.MXD();
                    if (var9 == DeclarationType.JPK) {
                        Object var15 = null;
                        switch (var10) {
                            case VAT:
                                var15 = new DeclarationJPK_VAT(var7, var3, var6, var14);
                                break;
                            case PKPIR:
                                var15 = new DeclarationJPK_PKPIR(var7, var3, var6);
                                break;
                            case EWP:
                                var15 = new DeclarationJPK_EWP(var7, var3, var6);
                                break;
                            case FA:
                                var15 = new DeclarationJPK_FA(var7, var3, var6);
                                break;
                            case KR:
                                var15 = new DeclarationJPK_KR(var7, var3, var6);
                                break;
                            case MAG:
                                var15 = new DeclarationJPK_MAG(var7, var3, var6);
                                break;
                            case WB:
                                var15 = new DeclarationJPK_WB(var7, var3, var6);
                                break;
                            default:
                                var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.invaliddeclaration.type").replaceFirst("##DECLARATIONTYPE##", var10.name()));
                        }

                        if (var15 != null) {
                            byte[] var16 = EPW.HOX(var1.getProgressReporter(), var3);
                            ((DeclarationJPK) var15).setDeclarationFileCheckSumMD5(new Bytes(var16));
                            File var17 = new File(var13, "tmp_" + System.nanoTime());
                            var17.mkdirs();
                            ((DeclarationJPK) var15).setContextDir(var17);
                            ((DeclarationJPK) var15).FJI().setValue(var12);
                            ((DeclarationJPK) var15).setDeclarationStatus(DeclarationStatus.NEW);
                            ((DeclarationJPK) var15).setPeriod(var11);
                            DeclarationJPK var18 = var1.HQF((DeclarationJPK) var15);
                            if (var18 != null) {
                                var18.setDeclarationStatus(DeclarationStatus.SENT);
                                this.GKE.HXB(var18);
                            }
                        }
                    } else {
                        var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.invaliddeclaration.subtype").replaceFirst("##DECLARATIONSUBTYPE##", var9.name()));
                    }
                } else {
                    var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.input.invalidfilename"));
                }
            } else {
                var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.input.filenotselected"));
            }
        } catch (QGU var25) {
            if (var25.getReturnedValue() == 1) {
                Platform.runLater(new Runnable() {
                    public void run() {
                        EUC.this.GKD.close();
                        EUC.this.QHW.initController(EUC.this.QHX, Stage.CONFIG.getProcessFxmlFileName(), null);
                    }
                });
            } else {
                log.error("Something bad happened", var25);
                FCT.IGX("", var25);
            }
        } catch (Exception var26) {
            log.error("Something bad happened", var26);
            FCT.IGX("", var26);
        }

    }

    private File QOU(final LocalDate var1, final LocalDate var2, final int var3, final String var4) {

        File var5;
        var5 = FEL.IKS(new FEM<File>() {
            public File IKT() {
                try {
                    FileChooser var1x = new FileChooser();
                    var1x.setTitle(EUC.this.resources.getString("micro.types.xml.fileselect"));
                    FileChooser.ExtensionFilter var2x = new FileChooser.ExtensionFilter(EUC.this.resources.getString("micro.types.xml.filetype.xml") + " (*.xml)", "*.xml");
                    var1x.getExtensionFilters().add(var2x);
                    File var3x = EUC.this.GKE.getWorkingDir(EUC.this.GKD);
                    var1x.setInitialDirectory(var3x);
                    String var4x = null;
                    Nip var5 = EUC.this.GKE.QOX();
                    if (var5 != null && var5.getValue() != null) {
                        var4x = var5.getValue() + "_";
                    } else {
                        var4x = "";
                    }

                    String var6 = var4 + "_" + var4x + var1.toString() + "__" + var2.toString() + "_" + var3 + ".xml";
                    var1x.setInitialFileName(var6);
                    File var7 = var1x.showSaveDialog(EUC.this.GKD);
                    return var7;
                } catch (FFK var8) {
                    log.error("Something bad happened", var8);
                    return null;
                }
            }
        });

        return var5;
    }

    public void setjJkFaGenerateSettings(JpkFaGenerateSettings var1) {
        this.QMC = var1;
    }

    private void QOV() {

        MDP var1 = null;

        try {
            String var2 = this.GKE.getPkcs11LibraryFilePath();
            var1 = new MDP(this.resources, this.fxml_textArea_log, this.fxml_vBox_progress, var2);
            File var3 = this.QOU(this.QMC.getDateFrom(), this.QMC.getDateTo(), 1, "JPK_FA_3");
            if (var3 != null) {
                List var4 = this.GKE.getInvoicesByDateAndNip(this.QMC.getPossibleDateTypeForSearch(), this.QMC.getDateFrom(), this.QMC.getDateTo(), this.QMC.getNip());
                if (var4 != null && var4.size() > 0) {
                    File var5 = this.GKE.getWorkingDir(this.GKD);
                    UserData var6 = this.GKE.getUserData();
                    var1.getProgressBarContainer().setFirstValue(var1.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.init_JPK_FA")));
                    byte[] var7 = EPW.QOL(var1.getProgressReporter(), var3, this.QMC.getDateFrom(), this.QMC.getDateTo(), var6, var4);
                    String var8 = DeclarationType.JPK.name() + "_" + DeclarationSubtype.FA.name();
                    List var9 = (new EQM()).HQP(var8);
                    if (var9.size() != 1) {
                        throw new FFK("Invalid number of schema types for [" + var8 + "]");
                    }

                    JPKSchemaType var10 = (JPKSchemaType) var9.get(0);
                    DeclarationJPK_FA var11 = new DeclarationJPK_FA(1, var3, var10);
                    var11.setDeclarationFileCheckSumMD5(new Bytes(var7));
                    File var12 = new File(var5, "tmp_" + System.nanoTime());
                    var12.mkdirs();
                    var11.setContextDir(var12);
                    Period var13 = Period.AOE;
                    Integer var14 = this.GKE.HXA(var13, DeclarationType.JPK, DeclarationSubtype.FA);
                    var11.setPeriod(var13);
                    var11.FJI().setValue(var14);
                    var11.setDeclarationStatus(DeclarationStatus.NEW);
                    DeclarationJPK var15 = var1.HQF(var11);
                    if (var15 != null) {
                        var15.setDeclarationStatus(DeclarationStatus.SENT);
                        this.GKE.HXB(var15);
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
                        EUC.this.GKD.close();
                        EUC.this.QHW.initController(EUC.this.QHX, Stage.CONFIG.getProcessFxmlFileName(), null);
                    }
                });
            } else {
                log.error("Something bad happened", var20);
                FCT.IGX("", var20);
            }
        } catch (Exception var21) {
            log.error("Something bad happened", var21);
            FCT.IGX("", var21);
        }

    }

    public void setGenerateFA(boolean var1) {
        this.QMD = var1;
    }

    public void HWX() {

        this.GKF = new EVN() {
            public void HZI() {

                if (EUC.this.QMD) {
                    EUC.this.QOV();
                } else {
                    EUC.this.HWW();
                }

            }
        };
        this.GKF.start();

    }

    private File HWY() {

        File var1;
        var1 = FEL.IKS(new FEM<File>() {
            public File IKT() {
                try {
                    FileChooser var1 = new FileChooser();
                    var1.setTitle(EUC.this.resources.getString("micro.types.xml.fileselect"));
                    FileChooser.ExtensionFilter var2 = new FileChooser.ExtensionFilter(EUC.this.resources.getString("micro.types.xml.filetype.xml") + " (*.xml)", "*.xml");
                    var1.getExtensionFilters().add(var2);
                    File var3 = EUC.this.GKE.getWorkingDir(EUC.this.GKD);
                    var1.setInitialDirectory(var3);
                    File var4 = var1.showOpenDialog(EUC.this.GKD);
                    return var4;
                } catch (FFK var5) {
                    log.error("Something bad happened", var5);
                    return null;
                }
            }
        });

        return var1;
    }

    @FXML
    private void fxml_handleButton_close(ActionEvent var1) {

        this.GKD.close();

    }
}
