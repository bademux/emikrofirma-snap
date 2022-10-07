package a.a.a.c.c.e.i.a;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.f.FFK;
import a.a.a.b.f.QGU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.l.MDP;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.d.b.EPW;
import a.a.a.c.d.b.EQM;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.f.a.d.AGWO;
import a.a.a.c.f.a.d.AGWP;
import a.a.a.c.f.a.d.AGWQ;
import a.a.a.c.f.a.d.AGWR;
import a.a.a.c.f.a.d.AGWS;
import a.a.a.c.f.a.d.AGWU;
import a.a.a.c.f.a.d.AGWW;
import a.a.a.c.f.a.d.AGXA;
import a.a.a.c.f.a.d.HK;
import a.a.a.c.f.a.d.HL;
import a.a.a.c.f.a.d.HM;
import a.a.a.c.f.a.d.QJX;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JT;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
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

public class EUC {
   @FXML
   private ResourceBundle resources;
   private Stage GKD;
   private EUF GKE;
   private EMC QHW;
   private String QHX;
   @FXML
   private TextArea fxml_textArea_log;
   @FXML
   private VBox fxml_vBox_progress;
   private QJX QMC;
   private boolean QMD = false;
   private EVN GKF;
   @FXML
   private Button fxml_button_close;

   public EUC() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public void setDialogStage(Stage var1) {
      EXF.getInstance().ICO();

      try {
         this.GKD = var1;
         this.GKD.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent var1) {
               if (WindowEvent.WINDOW_CLOSE_REQUEST.equals(var1.getEventType())) {
                  EUC.this.GKF.stop();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setImplementation(EUF var1) {
      EXF.getInstance().ICO();

      try {
         this.GKE = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setApplication(EMC var1) {
      this.QHW = var1;
   }

   public void setFxmlParentName(String var1) {
      this.QHX = var1;
   }

   private void HWW() {
      EXF.getInstance().ICO();
      MDP var1 = null;

      try {
         String var2 = this.GKE.getPkcs11LibraryFilePath();
         var1 = new MDP(this.resources, this.fxml_textArea_log, this.fxml_vBox_progress, var2);
         File var3 = this.HWY();
         if (var3 != null) {
            EQM var4 = new EQM();
            if (var4.HQL(var3)) {
               EVZ var5 = var4.HQO(var3);
               AGXA var6 = (AGXA)var5.getFirstValue();
               Integer var7 = 0;

               try {
                  var7 = Integer.parseInt((String)var5.getSecondValue());
               } catch (NumberFormatException | NullPointerException var24) {
                  EXF.getInstance().ICI(var24);
               }

               String[] var8 = var6.getKodFormularza().split("_");
               HM var9 = HM.valueOf(var8[0]);
               AGWW var10 = AGWW.valueOf(var8[1]);
               JN var11 = JN.AOE;
               Integer var12 = this.GKE.HXA(var11, var9, var10);
               File var13 = this.GKE.getWorkingDir(this.GKD);
               var1.getProgressBarContainer().setFirstValue(var1.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.md5.checksum")));
               boolean var14 = this.GKE.MXD();
               switch (var9) {
                  case JPK:
                     Object var15 = null;
                     switch (var10) {
                        case VAT:
                           var15 = new HK(var7, var3, var6, var14);
                           break;
                        case PKPIR:
                           var15 = new AGWS(var7, var3, var6);
                           break;
                        case EWP:
                           var15 = new AGWO(var7, var3, var6);
                           break;
                        case FA:
                           var15 = new AGWP(var7, var3, var6);
                           break;
                        case KR:
                           var15 = new AGWQ(var7, var3, var6);
                           break;
                        case MAG:
                           var15 = new AGWR(var7, var3, var6);
                           break;
                        case WB:
                           var15 = new AGWU(var7, var3, var6);
                           break;
                        default:
                           var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.invaliddeclaration.type").replaceFirst("##DECLARATIONTYPE##", var10.name()));
                     }

                     if (var15 != null) {
                        byte[] var16 = EPW.HOX(var1.getProgressReporter(), var3);
                        ((AGWN)var15).setDeclarationFileCheckSumMD5(new JT(var16));
                        File var17 = new File(var13, "tmp_" + System.nanoTime());
                        var17.mkdirs();
                        ((AGWN)var15).setContextDir(var17);
                        ((AGWN)var15).FJI().setValue(var12);
                        ((AGWN)var15).setDeclarationStatus(HL.NEW);
                        ((AGWN)var15).setPeriod(var11);
                        AGWN var18 = var1.HQF((AGWN)var15);
                        if (var18 != null) {
                           var18.setDeclarationStatus(HL.SENT);
                           this.GKE.HXB(var18);
                        }
                     }
                     break;
                  default:
                     var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.invaliddeclaration.subtype").replaceFirst("##DECLARATIONSUBTYPE##", var9.name()));
               }
            } else {
               var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.input.invalidfilename"));
            }
         } else {
            var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.input.filenotselected"));
         }
      } catch (QGU var25) {
         switch (var25.getReturnedValue()) {
            case 1:
               Platform.runLater(new Runnable() {
                  public void run() {
                     EUC.this.GKD.close();
                     EUC.this.QHW.HJE(EUC.this.QHX, EOS.CONFIG.getProcessFxmlFileName(), (ENB)null);
                  }
               });
               break;
            default:
               EXF.getInstance().ICA((Throwable)var25);
               FCT.IGX("", var25);
         }
      } catch (Exception var26) {
         EXF.getInstance().ICA((Throwable)var26);
         FCT.IGX("", var26);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private File QOU(final LocalDate var1, final LocalDate var2, final int var3, final String var4) {
      EXF.getInstance().ICO();

      File var5;
      try {
         var5 = (File)FEL.IKS(new FEM<File>() {
            public File IKT() {
               try {
                  FileChooser var1x = new FileChooser();
                  var1x.setTitle(EUC.this.resources.getString("micro.types.xml.fileselect"));
                  FileChooser.ExtensionFilter var2x = new FileChooser.ExtensionFilter(EUC.this.resources.getString("micro.types.xml.filetype.xml") + " (*.xml)", new String[]{"*.xml"});
                  var1x.getExtensionFilters().add(var2x);
                  File var3x = EUC.this.GKE.getWorkingDir(EUC.this.GKD);
                  var1x.setInitialDirectory(var3x);
                  String var4x = null;
                  KA var5 = EUC.this.GKE.QOX();
                  if (var5 != null && var5.getValue() != null) {
                     var4x = (String)var5.getValue() + "_";
                  } else {
                     var4x = "";
                  }

                  String var6 = var4 + "_" + var4x + var1.toString() + "__" + var2.toString() + "_" + var3 + ".xml";
                  var1x.setInitialFileName(var6);
                  File var7 = var1x.showSaveDialog(EUC.this.GKD);
                  return var7;
               } catch (FFK var8) {
                  EXF.getInstance().ICA((Throwable)var8);
                  return null;
               }
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var5;
   }

   public void setjJkFaGenerateSettings(QJX var1) {
      this.QMC = var1;
   }

   private void QOV() {
      EXF.getInstance().ICO();
      MDP var1 = null;

      try {
         String var2 = this.GKE.getPkcs11LibraryFilePath();
         var1 = new MDP(this.resources, this.fxml_textArea_log, this.fxml_vBox_progress, var2);
         File var3 = this.QOU(this.QMC.getDateFrom(), this.QMC.getDateTo(), 1, "JPK_FA_3");
         if (var3 != null) {
            List var4 = this.GKE.getInvoicesByDateAndNip(this.QMC.getPossibleDateTypeForSearch(), this.QMC.getDateFrom(), this.QMC.getDateTo(), this.QMC.getNip());
            if (var4 != null && var4.size() > 0) {
               File var5 = this.GKE.getWorkingDir(this.GKD);
               LY var6 = this.GKE.getUserData();
               var1.getProgressBarContainer().setFirstValue(var1.HQI(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.init_JPK_FA")));
               byte[] var7 = EPW.QOL(var1.getProgressReporter(), var3, this.QMC.getDateFrom(), this.QMC.getDateTo(), var6, var4);
               String var8 = HM.JPK.name() + "_" + AGWW.FA.name();
               List var9 = (new EQM()).HQP(var8);
               if (var9.size() != 1) {
                  throw new FFK("Invalid number of schema types for [" + var8 + "]");
               }

               AGXA var10 = (AGXA)var9.get(0);
               AGWP var11 = new AGWP(1, var3, var10);
               var11.setDeclarationFileCheckSumMD5(new JT(var7));
               File var12 = new File(var5, "tmp_" + System.nanoTime());
               var12.mkdirs();
               var11.setContextDir(var12);
               JN var13 = JN.AOE;
               Integer var14 = this.GKE.HXA(var13, HM.JPK, AGWW.FA);
               var11.setPeriod(var13);
               var11.FJI().setValue(var14);
               var11.setDeclarationStatus(HL.NEW);
               AGWN var15 = var1.HQF(var11);
               if (var15 != null) {
                  var15.setDeclarationStatus(HL.SENT);
                  this.GKE.HXB(var15);
               }
            } else {
               var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.missingdbresult"));
            }
         } else {
            var1.setProgressAndAlertError(FCW.getInstance().getMessageForKey("micro.jpk.sendout.generate.filenotselected"));
         }
      } catch (QGU var20) {
         switch (var20.getReturnedValue()) {
            case 1:
               Platform.runLater(new Runnable() {
                  public void run() {
                     EUC.this.GKD.close();
                     EUC.this.QHW.HJE(EUC.this.QHX, EOS.CONFIG.getProcessFxmlFileName(), (ENB)null);
                  }
               });
               break;
            default:
               EXF.getInstance().ICA((Throwable)var20);
               FCT.IGX("", var20);
         }
      } catch (Exception var21) {
         EXF.getInstance().ICA((Throwable)var21);
         FCT.IGX("", var21);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setGenerateFA(boolean var1) {
      this.QMD = var1;
   }

   public void HWX() {
      EXF.getInstance().ICO();

      try {
         this.GKF = new EVN() {
            public void HZI() {
               EXF.getInstance().ICO();

               try {
                  if (EUC.this.QMD) {
                     EUC.this.QOV();
                  } else {
                     EUC.this.HWW();
                  }
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         };
         this.GKF.start();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private File HWY() {
      EXF.getInstance().ICO();

      File var1;
      try {
         var1 = (File)FEL.IKS(new FEM<File>() {
            public File IKT() {
               try {
                  FileChooser var1 = new FileChooser();
                  var1.setTitle(EUC.this.resources.getString("micro.types.xml.fileselect"));
                  FileChooser.ExtensionFilter var2 = new FileChooser.ExtensionFilter(EUC.this.resources.getString("micro.types.xml.filetype.xml") + " (*.xml)", new String[]{"*.xml"});
                  var1.getExtensionFilters().add(var2);
                  File var3 = EUC.this.GKE.getWorkingDir(EUC.this.GKD);
                  var1.setInitialDirectory(var3);
                  File var4 = var1.showOpenDialog(EUC.this.GKD);
                  return var4;
               } catch (FFK var5) {
                  EXF.getInstance().ICA((Throwable)var5);
                  return null;
               }
            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   @FXML
   private void fxml_handleButton_close(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.GKD.close();
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
