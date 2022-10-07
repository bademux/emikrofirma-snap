package a.a.a.c.c.e.m.a;

import a.a.a.b.a.a.FDO;
import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENK;
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.m.c.QTB;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

public class QSZ extends ENN<QTB> {
   private HR QZF;
   @FXML
   protected QSX fxml_include_aggregatePurchaseNewLogicController;
   private BooleanProperty QZG = new SimpleBooleanProperty(this, "changedPropertyHolder", false);
   private BooleanProperty QZH = new SimpleBooleanProperty(this, "readOnlyPropertyHolder", false);
   private boolean QZI;
   @FXML
   private Button fxml_generalButtonCancel;
   @FXML
   private Button fxml_generalButtonSave;
   @FXML
   protected ScrollPane fxml_include_container;
   @FXML
   protected EMP fxml_include_left_barController;
   @FXML
   protected EMR fxml_include_top_menuController;
   private HR QZJ = null;
   private EPB QZK;
   private HI QZL;

   public QSZ(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
      this.QZK = EPB.NEW;
   }

   public void HHE() throws FFK {
      EXF.getInstance().ICO();

      try {
         super.HHE();
         this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.aggregate_purchase_new.title"));
         this.QZG.bind(this.fxml_include_aggregatePurchaseNewLogicController.RFB);
         this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_aggregatePurchaseNewLogicController.RFC.and(this.fxml_include_aggregatePurchaseNewLogicController.RFB.and(this.QZH.not())).not());
         this.fxml_include_aggregatePurchaseNewLogicController.RFA.bind(this.QZH);
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
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
         if (this.QZI) {
            var1 = true;
         } else if (this.QZG.get()) {
            FEN var9 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), (String)null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.disableProperty().get(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
            QTB var3;
            switch (var9) {
               case ExitAndSave:
                  var3 = (QTB)this.getProcess();
                  var3.HHL();
                  var1 = true;
                  break;
               case ExitWithoutSave:
                  var3 = (QTB)this.getProcess();
                  var3.resetAndCleanUpProcess();
                  var1 = true;
                  break;
               case CancelExit:
               default:
                  var1 = false;
            }
         } else {
            QTB var10 = (QTB)this.getProcess();
            var10.resetAndCleanUpProcess();
            var1 = true;
         }

         if (!var1) {
            this.fxml_parent.requestFocus();
            var2 = false;
            return var2;
         }

         this.RKC();
         this.fxml_include_aggregatePurchaseNewLogicController.HHB();
         this.fxml_include_left_barController.HHB();
         this.fxml_include_top_menuController.HHB();
         var2 = true;
      } catch (Exception var7) {
         EXF.getInstance().ICA((Throwable)var7);
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
         this.QZI = false;
         QTB var1 = (QTB)this.HHG();
         if (this.QZK != null && !EPB.NEW.equals(this.QZK)) {
            if (EPB.VIEW.equals(this.QZK)) {
               this.QZH.set(true);
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_purchase_new.View"));
               this.QZK = EPB.NEW;
               this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Return_AlternateCancel"));
               var1.setInvoicePurchase(this.QZJ);
               var1.setActionType(FDO.select);
               var1.setInvoicePurchaseEditKey((EWC)null);
            } else {
               if (!EPB.EDIT.equals(this.QZK)) {
                  throw new FFK("Invalid mode [" + this.QZK + "]!");
               }

               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_purchase_new.Edit"));
               this.QZH.set(false);
               this.QZK = EPB.NEW;
               this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
               this.fxml_include_aggregatePurchaseNewLogicController.fxml_include_invoicingDate_boxController.IFN(var1.getRangesWhereSettled(this.resources.getString("micro.process.invoice_purchase_new.Tooltip.SettledPeriod")));
               this.QZJ.setPreviousPeriod(this.QZJ.getPeriod().DDN());
               var1.setInvoicePurchase(this.QZJ);
               var1.setActionType(FDO.update);
               JN var2 = this.QZJ.getPeriod() != null ? this.QZJ.getPeriod().DDN() : null;
               KE var3 = this.QZJ.getRefId() != null ? this.QZJ.getRefId().DEL() : null;
               KA var4 = this.QZJ.getIssuerNumber() != null ? this.QZJ.getIssuerNumber().DEJ() : null;
               var1.setInvoicePurchaseEditKey(new EWC(var2, var3, var4));
            }
         } else {
            this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.aggregate_purchase_new.title"));
            this.QZH.set(false);
            this.fxml_generalButtonCancel.setText(FCW.getInstance().getMessageForKey("micro.process.button.Cancel"));
            this.fxml_include_aggregatePurchaseNewLogicController.fxml_include_invoicingDate_boxController.IFN(var1.getRangesWhereSettled(this.resources.getString("micro.process.invoice_purchase_new.Tooltip.SettledPeriod")));
            var1.setActionType(FDO.insert);
            var1.setInvoicePurchaseEditKey((EWC)null);
         }

         this.QZF = var1.getInvoicePurchase(this.QZL);
         this.QZL = null;
         this.fxml_include_aggregatePurchaseNewLogicController.setProcessImplementation(var1);
         this.fxml_include_aggregatePurchaseNewLogicController.RKB(this.QZF);
         this.fxml_include_aggregatePurchaseNewLogicController.HHC();
         this.fxml_include_left_barController.HHC();
         this.fxml_include_top_menuController.HHC();
         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var8) {
         EXF.getInstance().ICA((Throwable)var8);
         throw new FFI(var8);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void initialize() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   @FXML
   protected void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [cancel] clicked");
         this.QZI = true;
         JN var2 = null;
         if (this.QZF != null && this.QZF.getPeriod() != null) {
            var2 = this.QZF.getPeriod();
         }

         QTB var4 = (QTB)this.getProcess();
         var4.resetAndCleanUpProcess();
         JN finalVar = var2;
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_PURCHASE_LIST.getProcessFxmlFileName(), new ENB<ENK<?>>() {
            public void HNE(ENK<?> var1) {
               EXF.getInstance().ICO();

               try {
                  var1.setPeriod(finalVar);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
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

   @FXML
   protected void fxml_handleButton_generalButtonSave(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         this.QZF.setIsAggregatePurchase(true);
         EXF.getInstance().ICE("Button [save] clicked");
         this.QZI = true;
         JN var2 = null;
         if (this.QZF != null && this.QZF.getPeriod() != null) {
            var2 = this.QZF.getPeriod();
         }

         QTB var4 = (QTB)this.getProcess();
         var4.HHL();
         JN finalVar = var2;
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_PURCHASE_LIST.getProcessFxmlFileName(), new ENB<ENK<?>>() {
            public void HNE(ENK<?> var1) {
               EXF.getInstance().ICO();

               try {
                  var1.setPeriod(finalVar);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } catch (Exception var8) {
         EXF.getInstance().ICA((Throwable)var8);
         FCT.IGX("", var8);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RKC() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_aggregatePurchaseNewLogicController.RJZ(this.QZF);
         this.QZF = null;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setInvoice(HN<?> var1) throws FFK {
      this.QZJ = (HR)var1;
   }

   public void setMode(EPB var1) {
      this.QZK = var1;
   }

   public void setContractor(HI var1) {
      this.QZK = EPB.NEW;
      this.QZL = var1;
   }
}
