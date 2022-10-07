package a.a.a.c.c.e.i.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.h.EPD;
import a.a.a.c.c.e.i.a.a.ETX;
import a.a.a.c.c.e.i.a.a.ETY;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.f.a.d.AGXB;
import a.a.a.c.f.a.d.HJ;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import java.io.IOException;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class EUA extends ELU<EUF> {
   @FXML
   private ScrollPane fxml_include_container;
   @FXML
   public ETZ fxml_include_declarationListLogicController;
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private EMR fxml_include_top_menuController;
   @FXML
   public Button fxml_generalButtonState;
   @FXML
   public Button fxml_generalButtonSendJPK;
   @FXML
   public Button fxml_generalButtonConvertCSV2XML;
   @FXML
   public Button fxml_generalButtonDeleteJPK;
   @FXML
   public Button fxml_generalButtonGenerateAndSendJPK_FA;
   public BooleanProperty QHY = new SimpleBooleanProperty(false);

   public EUA(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var2;
      try {
         EUF var1 = (EUF)this.getProcess();
         var1.HHL();
         this.fxml_include_declarationListLogicController.HHB();
         this.fxml_include_left_barController.HHB();
         this.fxml_include_top_menuController.HHB();
         var2 = true;
         return var2;
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         FCT.IGX(this.resources.getString("micro.process.declaration_list.exception.saving"), var6);
         var2 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public void HHC() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_left_barController.HHC();
         this.fxml_include_top_menuController.HHC();
         this.fxml_parent.requestFocus();
         EUF var1 = (EUF)this.HHG();
         this.fxml_include_declarationListLogicController.setImplementation(var1);
         this.fxml_include_declarationListLogicController.setDeclarations(var1.getDeclarations());
         this.fxml_include_declarationListLogicController.setParent(this);
         this.fxml_include_declarationListLogicController.setFxml_parent_node(this.fxml_parent);
         this.fxml_include_declarationListLogicController.HHC();
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX(this.resources.getString("micro.process.declaration_list.exception.loading"), var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void initialize() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.jpk_list.title"));
         this.fxml_generalButtonState.disableProperty().bind(this.fxml_include_declarationListLogicController.GJT.or(this.fxml_include_declarationListLogicController.GJU).not().or(this.QHY));
         this.fxml_include_declarationListLogicController.GJT.addListener(new ETX(this));
         this.fxml_include_declarationListLogicController.GJU.addListener(new ETY(this));
         this.fxml_generalButtonDeleteJPK.disableProperty().bind(this.fxml_include_declarationListLogicController.QHS.not());
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonState(ActionEvent var1) {
      this.QHY.set(true);
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [checkState] clicked");
         if (this.fxml_include_declarationListLogicController.GJU.get()) {
            this.HWL((AGWN)this.fxml_include_declarationListLogicController.getSelectedDeclaration());
         } else {
            if (!this.fxml_include_declarationListLogicController.GJT.get()) {
               throw new FFI("Wrong state - button should be disabled");
            }

            if (this.fxml_include_declarationListLogicController.getSelectedDeclaration() != null) {
               this.HWM(this.fxml_include_declarationListLogicController.getSelectedDeclaration());
            }

            this.QHY.set(false);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HWL(final AGWN var1) {
      EXF.getInstance().ICO();

      try {
         final MTI var2 = new MTI(null);
         final MTI var3 = new MTI(new Boolean(false));
         MSX var4 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  var3.setObject(((EUF)EUA.this.getProcess()).HHM(var1));
               } catch (FFO | FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  var2.setObject(var6);
               } catch (Exception var7) {
                  EXF.getInstance().ICA((Throwable)var7);
                  var2.setObject(var7);
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               EXF.getInstance().ICO();

               try {
                  if (var2.getObject() == null) {
                     if ((Boolean)var3.getObject()) {
                        FCR.IGE(EUA.this.resources.getString("micro.process.common.jpk.newState.title"), EUA.this.resources.getString("micro.process.common.jpk.newState.header"), EUA.this.resources.getString("micro.process.common.jpk.newState.content"), false);
                     }

                     AGXB var1x = var1.getStatusResponseJSON();
                     JSONObject var2x = var1x.getValueAsJSONObject();
                     Long var3x = (Long)var2x.get("Code");
                     String var4 = (String)var2x.get("Description");
                     FCR.IGE(EUA.this.resources.getString("micro.process.common.jpk.state.title"), EUA.this.resources.getString("micro.process.common.jpk.state.header"), var3x + ",  " + var4, false);
                     EUA.this.HWN();
                  } else {
                     EXF.getInstance().ICA((Throwable)var2.getObject());
                     FCT.IGX(EUA.this.resources.getString("micro.process.common.jpk.error.checkState"), (Exception)var2.getObject());
                  }
               } catch (ParseException var8) {
                  EXF.getInstance().ICA((Throwable)var2.getObject());
                  FCT.IGX(EUA.this.resources.getString("micro.process.common.jpk.error.checkState"), (Exception)var2.getObject());
               } finally {
                  EUA.this.fxml_parent.requestFocus();
                  EUA.this.fxml_parent.setDisable(false);
                  EUA.this.QHY.set(false);
                  EXF.getInstance().ICP();
               }

            }
         };
         var4.MXH();
      } catch (FFK var8) {
         EXF.getInstance().ICA((Throwable)var8);
         FCT.IGX(this.resources.getString("micro.process.common.jpk.error.checkState"), var8);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HWM(HJ var1) {
      EXF.getInstance().ICO();

      try {
         EPD var2 = null;
         switch (var1.getDeclarationType()) {
            case JPK:
               AGWN var3 = (AGWN)var1;
               if (var3.getUpo() != null) {
                  var2 = new EPD(this.resources, ((EUF)this.getProcess()).getDeclarationTmpFile(this.getStageToHandle(), var3.getDeclarationType(), var3.getDeclarationSubType(), ".pdf"), var3);
               } else {
                  FCR.IGM(this.resources.getString("micro.process.common.upo.null.title"), this.resources.getString("micro.process.common.upo.null.header"), this.resources.getString("micro.process.common.upo.null.content"), false);
               }

               if (var2 != null) {
                  var2.HOE();
               }
               break;
            default:
               throw new FFI("unknown declaration type");
         }
      } catch (FFO | FFK var7) {
         EXF.getInstance().ICA((Throwable)var7);
         FCT.IGX(this.resources.getString("micro.process.print.error"), var7);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonSendJPK(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [sendJPK] clicked");
         FXMLLoader var2 = new FXMLLoader();
         var2.setLocation(EUA.class.getResource("/fxml/declarationList_selectAndSend_JPK.fxml"));
         var2.setResources(this.resources);
         AnchorPane var3 = (AnchorPane)var2.load();
         Stage var4 = new Stage();
         var4.setTitle(this.resources.getString("micro.process.declaration_list.generateandsend_jpk.dialog.header"));
         var4.initModality(Modality.WINDOW_MODAL);
         var4.initOwner(this.FGW);
         Scene var5 = new Scene(var3);
         var4.setScene(var5);
         var4.getIcons().add(new Image("/img/app/e_logo.png"));
         EUC var6 = (EUC)var2.getController();
         var6.setDialogStage(var4);
         var6.setImplementation((EUF)this.getProcess());
         var6.setApplication(this.getApplication());
         var6.setFxmlParentName(this.getFxmlName());
         var6.setGenerateFA(false);
         var6.HWX();
         var4.showAndWait();
         this.HWN();
      } catch (FFO | IOException | FFK var10) {
         EXF.getInstance().ICA((Throwable)var10);
         FCT.IGX(this.resources.getString("micro.process.declaration_list.exception.dialogOpen"), var10);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_jpkConvertCSV2XML(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [convertCSV2XML] clicked");
         FXMLLoader var2 = new FXMLLoader();
         var2.setLocation(EMP.class.getResource("/fxml/declarationList_jpkConvertCSV2XML.fxml"));
         var2.setResources(this.resources);
         AnchorPane var3 = (AnchorPane)var2.load();
         Stage var4 = new Stage();
         var4.setTitle(this.resources.getString("micro.process.declaration_list.selectandconvert.dialog.header"));
         var4.initModality(Modality.WINDOW_MODAL);
         var4.initOwner(this.FGW);
         var4.getIcons().add(new Image("/img/app/e_logo.png"));
         Scene var5 = new Scene(var3);
         var4.setScene(var5);
         EUB var6 = (EUB)var2.getController();
         var6.setDialogStage(var4);
         var6.setImplementation((EUF)this.getProcess());
         var6.HWT();
         var4.showAndWait();
      } catch (FFK | FFO | IOException var10) {
         EXF.getInstance().ICA((Throwable)var10);
         FCT.IGX(this.resources.getString("micro.process.declaration_list.exception.dialogOpen"), var10);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonDeleteJPK(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         ((EUF)this.getProcess()).QIY(this.fxml_include_declarationListLogicController.getSelectedDeclaration());
         this.HWN();
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         FCT.IGX(this.resources.getString("micro.process.jpk_list.button.error.Deletedeclaration"), var6);
      } finally {
         this.fxml_parent.requestFocus();
         EXF.getInstance().ICP();
      }

   }

   public void HWN() {
      EXF.getInstance().ICO();

      try {
         EUF var1 = (EUF)this.getProcess();
         this.fxml_include_declarationListLogicController.setDeclarations(var1.getDeclarations());
         this.fxml_include_declarationListLogicController.HWK();
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX(this.resources.getString("micro.process.jpk_list.button.error.LoadingDeclarations"), var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonGenerateAndSendJPK_FA(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         FXMLLoader var2 = new FXMLLoader();
         var2.setLocation(EUA.class.getResource("/fxml/declarationList_dialog_generate_jpk_fa_options.fxml"));
         var2.setResources(this.resources);
         AnchorPane var3 = (AnchorPane)var2.load();
         Stage var4 = new Stage();
         var4.setTitle(this.resources.getString("micro.process.jpk_list.dialog_fa_settings.Title"));
         var4.initModality(Modality.WINDOW_MODAL);
         var4.initOwner(this.FGW);
         var4.setResizable(false);
         Scene var5 = new Scene(var3);
         var4.setScene(var5);
         QKA var6 = (QKA)var2.getController();
         var6.setImplementation((EUF)this.getProcess());
         var6.setResource(this.resources);
         var6.setDialogStage(var4);
         var6.QOW();
         var4.showAndWait();
         if (var6.getJpkFaGenerateSettings() != null) {
            EXF.getInstance().ICE("Button [sendJPKFA] clicked");
            var2 = new FXMLLoader();
            var2.setLocation(EUA.class.getResource("/fxml/declarationList_selectAndSend_JPK.fxml"));
            var2.setResources(this.resources);
            var3 = (AnchorPane)var2.load();
            var4 = new Stage();
            var4.setTitle(this.resources.getString("micro.process.declaration_list.generateandsend_jpk.dialog.header"));
            var4.initModality(Modality.WINDOW_MODAL);
            var4.initOwner(this.FGW);
            var5 = new Scene(var3);
            var4.setScene(var5);
            var4.getIcons().add(new Image("/img/app/e_logo.png"));
            EUC var7 = (EUC)var2.getController();
            var7.setDialogStage(var4);
            var7.setImplementation((EUF)this.getProcess());
            var7.setApplication(this.getApplication());
            var7.setFxmlParentName(this.getFxmlName());
            var7.setGenerateFA(true);
            var7.setjJkFaGenerateSettings(var6.getJpkFaGenerateSettings());
            var7.HWX();
            var4.showAndWait();
            this.HWN();
         }
      } catch (FFK | FFO | IOException var11) {
         var11.printStackTrace();
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
