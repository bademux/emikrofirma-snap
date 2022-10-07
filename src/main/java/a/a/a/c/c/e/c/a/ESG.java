package a.a.a.c.c.e.c.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENJ;
import a.a.a.c.c.d.a.ENO;
import a.a.a.c.c.d.d.ENV;
import a.a.a.c.c.d.d.EOA;
import a.a.a.c.c.d.d.EOF;
import a.a.a.c.c.d.d.EOH;
import a.a.a.c.c.d.d.EOM;
import a.a.a.c.c.d.d.EOR;
import a.a.a.c.c.d.h.EPD;
import a.a.a.c.c.e.c.a.a.ESD;
import a.a.a.c.c.e.c.a.a.ESE;
import a.a.a.c.c.e.c.c.ESJ;
import a.a.a.c.c.e.c.c.ESL;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.f.a.d.AGWW;
import a.a.a.c.f.a.d.AGXB;
import a.a.a.c.f.a.d.HJ;
import a.a.a.c.f.a.d.HK;
import a.a.a.c.f.a.d.HL;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JX;
import a.a.a.c.f.b.c.a.KH;
import a.a.a.c.f.c.c.ComboBoxRequired;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class ESG extends ELU<ESJ> {
   @FXML
   public Button fxml_generalButtonSettllePeriod;
   @FXML
   public Button fxml_generalButtonCancelSettlle;
   @FXML
   public Button fxml_generalButtonInvoiceRecordVat;
   @FXML
   public Button fxml_generalButtonNotSettledInvoices;
   @FXML
   public Button fxml_generalButtonGenerateAndSendJPKVAT;
   @FXML
   public Button fxml_generalButtonJPKList;
   @FXML
   public TreeTableView<ESL> fxml_settelmentTable;
   @FXML
   public TreeTableColumn<ESL, JN> fxml_settelmentTable_period;
   @FXML
   public TreeTableColumn<ESL, JX> fxml_settelmentTable_settlement_date;
   @FXML
   public TreeTableColumn<ESL, JG> fxml_settelmentTable_settlement_status;
   @FXML
   public TreeTableColumn<ESL, Date> fxml_settelmentTable_declaration_jpk_vat_sent_date;
   @FXML
   public TreeTableColumn<ESL, HL> fxml_settelmentTable_declaration_jpk_vat_status;
   @FXML
   public Hyperlink fxml_generalHyperlinkNextPeriods;
   @FXML
   public Hyperlink fxml_generalHyperlinkPreviousPeriods;
   @FXML
   public Hyperlink fxml_generalHyperlinkShowAllPeriods;
   @FXML
   public Hyperlink fxml_generalHyperlinkHidePeriods;
   @FXML
   public Hyperlink fxml_hyperlink_VATpage;
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private EMR fxml_include_top_menuController;
   private List<ESL> GBZ;
   public BooleanProperty GCA = new SimpleBooleanProperty(false);
   public BooleanProperty GCB = new SimpleBooleanProperty(false);
   public BooleanProperty GCC = new SimpleBooleanProperty(false);
   public BooleanProperty GCD = new SimpleBooleanProperty(false);
   public BooleanProperty GCE = new SimpleBooleanProperty(false);
   public BooleanProperty QMS = new SimpleBooleanProperty(false);
   public BooleanProperty QMT = new SimpleBooleanProperty(false);
   public BooleanProperty GCG = new SimpleBooleanProperty(false);
   private static final int GCH = 15;
   private int GCI = 0;
   public BooleanProperty GCJ = new SimpleBooleanProperty(false);
   public BooleanProperty GCK = new SimpleBooleanProperty(false);
   public BooleanProperty GCL = new SimpleBooleanProperty(false);
   public BooleanProperty GCM = new SimpleBooleanProperty(false);

   public ESG(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
      EXF.getInstance().ICQ();
   }

   @FXML
   public void initialize() {
      this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoices_settlements.Settlements"));
      this.fxml_generalButtonSettllePeriod.disableProperty().bind(this.fxml_settelmentTable.getSelectionModel().selectedItemProperty().isNull().not().and(this.GCA.not().and(this.GCE.not())).not());
      this.fxml_generalButtonCancelSettlle.disableProperty().bind(this.fxml_settelmentTable.getSelectionModel().selectedItemProperty().isNull().not().and(this.GCA).not());
      this.fxml_generalButtonInvoiceRecordVat.disableProperty().bind(this.fxml_settelmentTable.getSelectionModel().selectedItemProperty().isNull().not().and(this.GCA.or(this.GCE).or(this.GCD)).not());
      this.fxml_generalButtonGenerateAndSendJPKVAT.disableProperty().bind(this.fxml_settelmentTable.getSelectionModel().selectedItemProperty().isNull().not().and(this.GCA.or(this.QMS.not())).not());
      this.fxml_generalButtonNotSettledInvoices.disableProperty().bind(this.GCG.not());
      this.fxml_settelmentTable.setShowRoot(false);
      this.fxml_settelmentTable.setRowFactory(new EOM());
      this.fxml_settelmentTable.getSelectionModel().selectedItemProperty().addListener(new ESE(this));
      this.fxml_settelmentTable.expandedItemCountProperty().addListener(new ESD(this));
      this.fxml_settelmentTable_period.setCellFactory(new EOH());
      this.fxml_settelmentTable_settlement_date.setCellFactory(new EOF());
      this.fxml_settelmentTable_settlement_status.setCellFactory(new EOA(new Image(ESG.class.getResourceAsStream("/images/if_Tick_Mark_1398911.png")), new Image(ESG.class.getResourceAsStream("/images/if_Close_Icon_1398919.png"))));
      this.fxml_settelmentTable_declaration_jpk_vat_sent_date.setCellFactory(new ENV());
      this.fxml_settelmentTable_declaration_jpk_vat_status.setCellFactory(new EOR(new Image(ESG.class.getResourceAsStream("/images/if_Tick_Mark_1398911.png")), new Image(ESG.class.getResourceAsStream("/images/if_Close_Icon_1398919.png")), new Image(ESG.class.getResourceAsStream("/images/failure2.png")), new Image(ESG.class.getResourceAsStream("/images/blank.png"))));
      this.fxml_settelmentTable_period.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<ESL, JN>, ObservableValue<JN>>() {
         public ObservableValue<JN> call(TreeTableColumn.CellDataFeatures<ESL, JN> var1) {
            return ((ESL)var1.getValue().getValue()).getPeriod();
         }
      });
      this.fxml_settelmentTable_settlement_date.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<ESL, JX>, ObservableValue<JX>>() {
         public ObservableValue<JX> call(TreeTableColumn.CellDataFeatures<ESL, JX> var1) {
            return ((ESL)var1.getValue().getValue()).getSettlementDate();
         }
      });
      this.fxml_settelmentTable_settlement_status.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<ESL, JG>, ObservableValue<JG>>() {
         public ObservableValue<JG> call(TreeTableColumn.CellDataFeatures<ESL, JG> var1) {
            return ((ESL)var1.getValue().getValue()).getSettlementStatus();
         }
      });
      this.fxml_settelmentTable_declaration_jpk_vat_sent_date.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<ESL, Date>, ObservableValue<Date>>() {
         public ObservableValue<Date> call(TreeTableColumn.CellDataFeatures<ESL, Date> var1) {
            return ((ESL)var1.getValue().getValue()).getDeclarationJPKVATDate();
         }
      });
      this.fxml_settelmentTable_declaration_jpk_vat_status.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<ESL, HL>, ObservableValue<HL>>() {
         public ObservableValue<HL> call(TreeTableColumn.CellDataFeatures<ESL, HL> var1) {
            return ((ESL)var1.getValue().getValue()).getDeclarationJPKVATStatus();
         }
      });
      this.fxml_generalHyperlinkNextPeriods.disableProperty().bind(this.GCJ.and(this.GCM.not()).not());
      this.fxml_generalHyperlinkPreviousPeriods.disableProperty().bind(this.GCK.and(this.GCM.not()).not());
      this.fxml_generalHyperlinkHidePeriods.visibleProperty().bind(this.GCM);
      this.fxml_generalHyperlinkShowAllPeriods.visibleProperty().bind(this.GCM.not().and(this.GCL));
   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var2;
      try {
         ESJ var1 = (ESJ)this.getProcess();
         var1.HHL();
         this.fxml_include_top_menuController.HHB();
         this.fxml_include_left_barController.HHB();
         var2 = true;
         return var2;
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         FCT.IGX(this.resources.getString("micro.process.invoices_settlements.exception.saving"), var6);
         var2 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public void HHC() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_top_menuController.HHC();
         this.fxml_include_left_barController.HHC();
         ESJ var1 = (ESJ)this.HHG();
         this.GCG.set(var1.isUnsettledInvoicesExist());
         this.GCI = 0;
         this.HSY();
         this.HSZ();
         this.HTA();
         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICO();
         FCT.IGX(this.resources.getString("micro.process.invoices_settlements.exception.loading"), var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HSX() {
      this.GCK.set(false);
      this.GCJ.set(false);
      this.GCL.set(false);
      if (this.GCI > 0) {
         this.GCK.set(true);
      }

      if ((this.GCI + 1) * 15 < this.GBZ.size()) {
         this.GCJ.set(true);
      }

      if (this.GBZ.size() > 15) {
         this.GCL.set(true);
      }

   }

   private void HSY() throws FFK, FFO {
      EXF.getInstance().ICO();

      try {
         ESJ var1 = (ESJ)this.getProcess();
         this.GBZ = var1.getSettlementWithDeclarationList();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HSZ() {
      Collections.sort(this.GBZ);
      TreeItem var1 = new TreeItem(new ESL((EDF)null, (ESJ)null, (List)null, false, false, false));
      int var2 = 0;
      boolean var3 = false;
      int var10;
      if (this.GCM.get()) {
         var10 = this.GBZ.size();
      } else {
         var2 = this.GCI * 15;
         var10 = Math.min((this.GCI + 1) * 15, this.GBZ.size());
      }

      Iterator var4 = this.GBZ.subList(var2, var10).iterator();

      while(true) {
         ESL var5;
         TreeItem var6;
         do {
            do {
               if (!var4.hasNext()) {
                  this.fxml_settelmentTable.setRoot(var1);
                  this.HSX();
                  return;
               }

               var5 = (ESL)var4.next();
               var6 = new TreeItem(var5);
               var1.getChildren().add(var6);
            } while(var5.getHistorical() == null);
         } while(var5.getHistorical().size() <= 0);

         Iterator var7 = var5.getHistorical().iterator();

         while(var7.hasNext()) {
            ESL var8 = (ESL)var7.next();
            TreeItem var9 = new TreeItem(var8);
            var6.getChildren().add(var9);
         }
      }
   }

   public void HTA() {
      this.fxml_settelmentTable.refresh();
   }

   @FXML
   protected void fxml_handleRowSelect() {
   }

   private void QOY() {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [Generate And Send JPK_VAT] clicked");
         if (this.fxml_settelmentTable.getSelectionModel().getSelectedItem() == null) {
            return;
         }

         Integer var1 = this.fxml_settelmentTable.getSelectionModel().getSelectedIndex();
         HK var2 = ((ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue()).getDeclarationJPKVAT();
         ESL var3 = (ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue();
         HL var4 = null;
         if (var2 != null) {
            var4 = var2.getDeclarationStatus();
         }

         if (var4 != null) {
            switch (var4) {
               case NONE:
                  this.QOZ(AGWW.VAT);
                  this.resetSettlement(var3);
                  this.HTA();
                  break;
               case NEW:
               case SENT:
                  this.QPA(var3, (AGWN)var2);
                  break;
               case SUCCESS:
                  this.HTE(var2);
                  break;
               case FAILURE:
               case RETRY:
                  this.HTC((AGWN)var2);
                  this.resetSettlement(var3);
                  this.HTA();
                  break;
               default:
                  throw new FFI("unknown declaration status");
            }
         } else {
            this.QOZ(AGWW.VAT);
            this.resetSettlement(var3);
            this.HTA();
            this.HTF(var1);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_generateAndSend_JPK_VAT(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.QOY();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void QOZ(AGWW var1) {
      EXF.getInstance().ICO();

      try {
         JF var2 = ((ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue()).getSettlement();
         if (var2 != null && JG.SETTLED.equals(var2.getSettlementStatus())) {
            FXMLLoader var3 = new FXMLLoader();
            var3.setLocation(ESG.class.getResource("/fxml/invoicesSettlements_generateAndSend_JPK.fxml"));
            var3.setResources(this.resources);
            AnchorPane var4 = (AnchorPane)var3.load();
            Stage var5 = new Stage();
            var5.setTitle(this.resources.getString("micro.process.invoices_settlements.generateandsend_jpk_vat.dialog.header"));
            var5.initModality(Modality.WINDOW_MODAL);
            var5.initOwner(this.FGW);
            Scene var6 = new Scene(var4);
            var5.setScene(var6);
            QKI var7 = (QKI)var3.getController();
            var7.setDeclarationSubType(var1);
            var7.setDialogStage(var5);
            var7.setImplementation((ESJ)this.getProcess());
            var7.setSettlement(var2);
            var7.setApplication(this.getApplication());
            var7.setFxmlParentName(this.getFxmlName());
            var5.setResizable(false);
            var5.getIcons().add(new Image("/img/app/e_logo.png"));
            var7.QPC();
            var5.showAndWait();
         }
      } catch (FFO | IOException | FFK var11) {
         EXF.getInstance().ICA((Throwable)var11);
         FCT.IGX(this.resources.getString("micro.process.invoices_settlements.exception.dialogOpen"), var11);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HTC(AGWN var1) {
      EXF.getInstance().ICO();

      try {
         ((ESJ)this.getProcess()).HTL(var1);
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         FCT.IGX(this.resources.getString("micro.process.common.deleteObject.error"), var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void QPA(final ESL var1, final AGWN var2) {
      EXF.getInstance().ICO();

      try {
         final MTI var3 = new MTI(null);
         final MTI var4 = new MTI(new Boolean(false));
         MSX var5 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  var4.setObject(((ESJ)ESG.this.getProcess()).HHM(var2));
               } catch (FFO | FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  var3.setObject(var6);
               } catch (Exception var7) {
                  var3.setObject(var7);
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               EXF.getInstance().ICO();

               try {
                  if (var3.getObject() == null) {
                     if ((Boolean)var4.getObject()) {
                        FCR.IGE(ESG.this.resources.getString("micro.process.common.jpk.newState.title"), ESG.this.resources.getString("micro.process.common.jpk.newState.header"), ESG.this.resources.getString("micro.process.common.jpk.newState.content"), false);
                     }

                     Long var1x = -1L;
                     String var2x = "";
                     if (var2 != null) {
                        AGXB var3x = var2.getStatusResponseJSON();
                        if (var3x != null) {
                           JSONObject var4x = var3x.getValueAsJSONObject();
                           if (var4x != null) {
                              var1x = (Long)var4x.get("Code");
                              var2x = (String)var4x.get("Description");
                           }
                        }
                     }

                     FCR.IGE(ESG.this.resources.getString("micro.process.common.jpk.state.title"), ESG.this.resources.getString("micro.process.common.jpk.state.header"), var1x + ",  " + var2x, false);
                     ESG.this.resetSettlement(var1);
                     ESG.this.HTA();
                  } else {
                     EXF.getInstance().ICA((Throwable)var3.getObject());
                     FCT.IGX(ESG.this.resources.getString("micro.process.common.jpk.error.checkState"), (Exception)var3.getObject());
                  }
               } catch (ParseException var8) {
                  EXF.getInstance().ICA((Throwable)var8);
                  FCT.IGX(ESG.this.resources.getString("micro.process.common.jpk.error.checkState"), var8);
               } finally {
                  ESG.this.fxml_parent.requestFocus();
                  EXF.getInstance().ICP();
               }

            }
         };
         var5.MXH();
      } catch (FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.common.jpk.error.checkState"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HTE(HJ var1) {
      EXF.getInstance().ICO();

      try {
         EPD var2 = null;
         switch (var1.getDeclarationType()) {
            case JPK:
               AGWN var3 = (AGWN)var1;
               if (var3.getUpo() != null) {
                  var2 = new EPD(this.resources, ((ESJ)this.getProcess()).getTempFile(this.getStageToHandle(), "pdf"), var3);
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
         FCT.IGX(this.resources.getString("micro.process.common.print.error"), var7);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_back(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [back] clicked");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_goto_jpk_list(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.getApplication().HJE(this.getFxmlName(), EOS.DECLARATION_LIST.getProcessFxmlFileName(), (ENB)null);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_SettlePeriod(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [settlePeriod] clicked");
         if (this.fxml_settelmentTable.getSelectionModel().getSelectedItem() == null) {
            return;
         }

         final ESL var2 = (ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue();
         final JF var3 = ((ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue()).getSettlement();
         final Integer var4 = this.fxml_settelmentTable.getSelectionModel().getSelectedIndex();
         if (var3 != null && !JG.SETTLED.equals(var3.getSettlementStatus())) {
            var3.setSettlementStatus(JG.SETTLED);
            EXF.getInstance().ICE("Period is going to be settled.");
            final ESJ var5 = (ESJ)this.getProcess();
            final MTI var6 = new MTI(null);
            MSX var7 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
               public void MXI() {
                  EXF.getInstance().ICO();

                  try {
                     var5.HTN(var3);
                     EXF.getInstance().ICE("Updated settlement was saved to the database.");
                  } catch (Exception var5x) {
                     EXF.getInstance().ICA((Throwable)var5x);
                     var6.setObject(var5x);
                  } finally {
                     EXF.getInstance().ICP();
                  }

               }

               public void MXJ() {
                  if (var6.getObject() == null) {
                     ESG.this.resetSettlement(var2);
                     ESG.this.HTA();
                     ESG.this.fxml_parent.requestFocus();
                     ESG.this.HTF(var4);
                  } else {
                     EXF.getInstance().ICA((Throwable)var6.getObject());
                     throw new FFI((Throwable)var6.getObject());
                  }
               }
            };
            var7.MXH();
         } else {
            if (var3 == null) {
               FCR.IGM(this.resources.getString("micro.process.invoices_settlements.Error"), this.resources.getString("micro.process.invoices_settlements.Error.Selection"), this.resources.getString("micro.process.invoices_settlements.Error.NoSelectionToSettle"), false);
            }

            if (JG.SETTLED.equals(var3.getSettlementStatus())) {
               FCR.IGK(this.resources.getString("micro.process.invoices_settlements.Error"), this.resources.getString("micro.process.invoices_settlements.Error.Settle"), false);
            }
         }
      } catch (FFO | FFK var11) {
         EXF.getInstance().ICA((Throwable)var11);
         throw new FFI(var11);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void resetSettlement(ESL var1) {
      EXF.getInstance().ICO();

      try {
         this.fxml_settelmentTable.getSelectionModel().clearSelection();
         var1.reset();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HTF(Integer var1) {
      if (var1 != null) {
         this.fxml_settelmentTable.getSelectionModel().select(var1);
      }

   }

   @FXML
   protected void fxml_handleButton_CancelSettlle(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [cancelSettle] clicked");
         if (this.fxml_settelmentTable.getSelectionModel().getSelectedItem() == null) {
            return;
         }

         JF var2 = ((ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue()).getSettlement();
         ESL var3 = (ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue();
         Integer var4 = this.fxml_settelmentTable.getSelectionModel().getSelectedIndex();
         if (var2 != null && JG.SETTLED.equals(var2.getSettlementStatus())) {
            var2.setSettlementStatus(JG.CANCELED_UNCHANGED);
            EXF.getInstance().ICE("Period was canceled.");
            ESJ var5 = (ESJ)this.getProcess();
            var5.HTN(var2);
            EXF.getInstance().ICE("Updated settlement was saved to the database.");
         } else {
            if (var2 == null) {
               FCR.IGM(this.resources.getString("micro.process.invoices_settlements.Error"), this.resources.getString("micro.process.invoices_settlements.Error.Selection"), this.resources.getString("micro.process.invoices_settlements.Error.NoSelectionToCancel"), false);
            }

            if (!JG.SETTLED.equals(var2.getSettlementStatus())) {
               FCR.IGK(this.resources.getString("micro.process.invoices_settlements.Error"), this.resources.getString("micro.process.invoices_settlements.Error.Cancel"), false);
            }
         }

         this.resetSettlement(var3);
         this.HTA();
         this.fxml_parent.requestFocus();
         this.HTF(var4);
      } catch (FFO | FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         throw new FFI(var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_invoiceRecordVAT(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [invoiceRecordVAT] clicked");
         if (this.fxml_settelmentTable.getSelectionModel().getSelectedItem() == null) {
            return;
         }

         final JF var2 = ((ESL)((TreeItem)this.fxml_settelmentTable.getSelectionModel().getSelectedItem()).getValue()).getSettlement();
         if (var2 != null) {
            this.getApplication().HJE(this.getFxmlName(), EOS.INVOICES_RECORDS.getProcessFxmlFileName(), new ENB<ENJ<?>>() {
               public void HNE(ENJ<?> var1) {
                  EXF.getInstance().ICO();

                  try {
                     var1.setSettlement(var2);
                  } catch (FFK var6) {
                     EXF.getInstance().ICA((Throwable)var6);
                     throw new FFI(var6);
                  } finally {
                     EXF.getInstance().ICP();
                  }

               }
            });
         } else {
            FCR.IGM(this.resources.getString("micro.process.invoices_settlements.Error"), this.resources.getString("micro.process.invoices_settlements.Error.Selection"), this.resources.getString("micro.process.invoices_settlements.Error.NoSelectionToSettle"), false);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_NotSettledInvoices(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [No Settle Invoice Sell] clicked");
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_LIST.getProcessFxmlFileName(), new ENB<ENO<?>>() {
            public void HNE(ENO<?> var1) {
               EXF.getInstance().ICO();

               try {
                  var1.setOnlyEmptyPeriod();
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleHyperlink_ShowNextPeriods() {
      EXF.getInstance().ICO();

      try {
         ++this.GCI;
         this.HSZ();
         this.HTA();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   void fxml_handleHyperlink_ShowPreviousPeriods() {
      EXF.getInstance().ICO();

      try {
         --this.GCI;
         this.HSZ();
         this.HTA();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleHyperlink_ShowAllPeriods() {
      EXF.getInstance().ICO();

      try {
         this.GCM.set(true);
         this.HSZ();
         this.HTA();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleHyperlink_HidePeriods() {
      EXF.getInstance().ICO();

      try {
         this.GCM.set(false);
         this.HSZ();
         this.HTA();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleHyperlink_VATpage(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         (new EVN() {
            public void HZI() {
               EXF.getInstance().ICO();

               try {
                  Desktop.getDesktop().browse(new URI(ESG.this.fxml_hyperlink_VATpage.getText()));
               } catch (URISyntaxException | IOException var5) {
                  EXF.getInstance().ICA((Throwable)var5);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         }).start();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_createEmpty(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         FXMLLoader var2 = new FXMLLoader();
         var2.setLocation(ESG.class.getResource("/fxml/invoices_settlements_create_empty.fxml"));
         var2.setResources(this.resources);
         AnchorPane var3 = null;
         var3 = (AnchorPane)var2.load();
         Stage var4 = new Stage();
         var4.setTitle(this.resources.getString("micro.process.invoices_settlements.dialogEmpty.Title"));
         var4.initModality(Modality.WINDOW_MODAL);
         var4.initOwner(this.FGW);
         Scene var5 = new Scene(var3);
         var4.setScene(var5);
         var4.setResizable(false);
         var4.getIcons().add(new Image("/img/app/e_logo.png"));
         ESF var6 = (ESF)var2.getController();
         var6.setImplementation((ESJ)this.getProcess());
         var6.setDialogStage(var4);
         var6.HSU();
         var4.showAndWait();
         if (var6.HSV() && ((ComboBoxRequired)var6.fxml_invoice_settlements_yearController.fxml_component_main_element).getValue() != null && ((ComboBoxRequired)var6.fxml_invoice_settlements_monthController.fxml_component_main_element).getValue() != null) {
            ESJ var7 = (ESJ)this.getProcess();
            JN var8 = new JN((Integer)((ComboBoxRequired)var6.fxml_invoice_settlements_yearController.fxml_component_main_element).getValue(), ((KH)((ComboBoxRequired)var6.fxml_invoice_settlements_monthController.fxml_component_main_element).getValue()).getNumber());
            JG var9 = var7.getSettlementStatus(var8);
            if (var9 == null) {
               JI var10 = new JI();
               var10.setPeriod(var8.DDN());
               var7.HTK(var10);
               this.HTG(var10);
               this.HSZ();
               this.HTA();
            }
         }

         this.fxml_parent.requestFocus();
      } catch (FFO | FFK | IOException var14) {
         EXF.getInstance().ICA((Throwable)var14);
         FCT.IGX(this.resources.getString("micro.process.invoices_settlements.exception.dialogOpen"), var14);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HTG(JF var1) {
      EXF.getInstance().ICO();

      try {
         this.GBZ.add(new ESL((ESJ)this.getProcess(), (List)null, false, false, true, var1));
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
