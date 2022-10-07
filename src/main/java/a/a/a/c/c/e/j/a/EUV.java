package a.a.a.c.c.e.j.a;

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
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.d.h.EPE;
import a.a.a.c.c.d.h.EPI;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HQ;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

public class EUV extends ENN<EUY> {
   private EPB GMK;
   private HY GML;
   private HV GMM;
   @FXML
   private ScrollPane fxml_include_container;
   @FXML
   public EUT fxml_include_invoiceSaleLogicController;
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private EMR fxml_include_top_menuController;
   @FXML
   public Button fxml_generalButtonSave;
   @FXML
   public Button fxml_generalButtonCancel;
   @FXML
   public Button fxml_generalButtonSaveAndPrint;
   private boolean GMN;
   private HI GMO;

   public EUV(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
      this.GMK = EPB.NEW;
      this.GMN = false;
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public void setMode(EPB var1) {
      EXF.getInstance().ICO();

      try {
         this.GMK = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void initialize() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public void HHE() {
      EXF.getInstance().ICO();

      try {
         super.HHE();
         this.fxml_generalButtonSave.visibleProperty().bind(this.fxml_include_invoiceSaleLogicController.GLT);
         this.fxml_generalButtonSave.managedProperty().bind(this.fxml_include_invoiceSaleLogicController.GLT);
         this.fxml_generalButtonSave.disableProperty().bind(this.fxml_include_invoiceSaleLogicController.GLS.and(this.fxml_include_invoiceSaleLogicController.GLT.and(this.fxml_include_invoiceSaleLogicController.GLU)).not());
         this.fxml_generalButtonSaveAndPrint.disableProperty().bind(this.fxml_include_invoiceSaleLogicController.GLS.and(this.fxml_include_invoiceSaleLogicController.GLU).or(this.fxml_include_invoiceSaleLogicController.GLT.not()).not());
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX("", var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var2;
      try {
         if (!this.fxml_include_invoiceSaleLogicController.GLU.get()) {
            this.GMN = true;
         }

         boolean var1 = true;
         if (!this.GMN) {
            this.GMN = false;
            FEN var8 = FCR.getUnsavedDataDialog(this.resources.getString("micro.dialog.changes.confirm.title"), (String)null, this.resources.getString("micro.dialog.changes.confirm.button.exitSave"), this.resources.getString("micro.dialog.changes.confirm.button.exitWithoutSave"), this.resources.getString("micro.dialog.changes.confirm.button.cancel"), this.fxml_generalButtonSave.isDisable(), 500.0, 100.0, this.resources.getString("micro.dialog.changes.confirm.message"));
            switch (var8) {
               case ExitAndSave:
                  var1 = true;
                  this.HXU();
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
         this.GMK = EPB.NEW;
         this.GML = null;
         this.GMM = null;
         this.GMO = null;
         ((EUY)this.getProcess()).resetAndCleanUpProcess();
         var2 = true;
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
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
         this.GMN = false;
         this.fxml_include_container.setVvalue(this.fxml_include_container.getVmin());
         this.setNameExceptions();
         EUY var1 = (EUY)this.HHG();
         this.fxml_include_invoiceSaleLogicController.setProcessImplementation(var1);
         var1.setMode(this.GMK);
         this.fxml_include_invoiceSaleLogicController.QNH.set(false);
         switch (this.GMK) {
            case NEW:
               this.GML = var1.getInvoiceSell(this.GMO);
               this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.NewName"));
               break;
            case EDIT:
               this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
               var1.setInvoiceSell((HU)this.GML);
               this.GML.setPreviousPeriod(this.GML.getPeriod().DDN());
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.EditName"));
               this.fxml_include_invoiceSaleLogicController.QNH.set(true);
               break;
            case CORRECT:
               this.GMM = var1.getInvoiceSellCorrection();
               HY var2 = this.getPrevoiusInvoiceFromHierarchyForNewCorrectionToGetElements(this.GML);
               HY var3 = this.getPrevoiusInvoiceFromHierarchyForNewCorrectionToSetHierarchy(this.GML);
               this.GMM.RIE().setValue(var2.RIE().getValue());
               this.GMM.setParentInvoice(var3);
               this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GMM);
               this.fxml_include_invoiceSaleLogicController.setInvoicePrevoiusParent(var2);
               this.fxml_include_invoiceSaleLogicController.setInvoiceFirstParent(getInvoiceFirstParent(this.GML));
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.CorrectName"));
               break;
            case VIEW:
               this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.ViewName"));
               break;
            case VIEW_CORRECTION:
               this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
               this.fxml_include_invoiceSaleLogicController.setInvoicePrevoiusParent(this.getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(this.GML));
               this.fxml_include_invoiceSaleLogicController.setInvoiceFirstParent(getInvoiceFirstParent(this.GML));
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.CorrectionViewName"));
               break;
            case EDIT_CORRECTION:
               this.fxml_include_invoiceSaleLogicController.setInvoiceMain(this.GML);
               this.fxml_include_invoiceSaleLogicController.setInvoicePrevoiusParent(this.getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(this.GML));
               this.fxml_include_invoiceSaleLogicController.setInvoiceFirstParent(getInvoiceFirstParent(this.GML));
               var1.setInvoiceSellCorrection((HV)this.GML);
               this.GML.setPreviousPeriod(this.GML.getPeriod().DDN());
               this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoice_sale_new.CorrectionEditName"));
               this.fxml_include_invoiceSaleLogicController.QNH.set(true);
         }

         this.fxml_include_invoiceSaleLogicController.setProcessImplementation(var1);
         this.fxml_include_invoiceSaleLogicController.setMode(this.GMK);
         this.fxml_include_invoiceSaleLogicController.GLR.set(this.GMK.getCorrectFields());
         this.fxml_include_invoiceSaleLogicController.GLT.set(this.GMK.getFieldsEditable());
         this.fxml_include_invoiceSaleLogicController.HHC();
         this.fxml_include_left_barController.HHC();
         this.fxml_include_top_menuController.HHC();
         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var7) {
         EXF.getInstance().ICA((Throwable)var7);
         FCT.IGX("", var7);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private HY getPrevoiusInvoiceFromHierarchyForNewCorrectionToGetElements(HY var1) {
      EXF.getInstance().ICO();

      try {
         HY var2;
         for(var2 = var1; var2.getChildInvoiceOnlyActive() != null; var2 = (HY)var2.getChildInvoiceOnlyActive()) {
         }

         HY var3 = var2;
         return var3;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   private HY getPrevoiusInvoiceFromHierarchyForNewCorrectionToSetHierarchy(HY var1) {
      EXF.getInstance().ICO();

      try {
         HY var2;
         for(var2 = var1; var2.getChildInvoiceWithCanceled() != null; var2 = (HY)var2.getChildInvoiceWithCanceled()) {
         }

         HY var3 = var2;
         return var3;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   private HY getPrevoiusInvoiceFromHierarchyForFromCorrectionToGetElements(HY var1) {
      EXF.getInstance().ICO();

      HY var2;
      try {
         var2 = (HY)var1.getParentInvoiceOnlyActive();
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private static HU getInvoiceFirstParent(HY var0) {
      EXF.getInstance().ICO();

      try {
         HY var1;
         for(var1 = var0; var1.getParentInvoiceWithCanceled() != null; var1 = (HY)var1.getParentInvoiceWithCanceled()) {
         }

         HU var2 = (HU)var1;
         return var2;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   private void setNameExceptions() {
      EXF.getInstance().ICO();

      try {
         if (this.GMK.getFieldsEditable()) {
            this.fxml_generalButtonCancel.setText(this.resources.getString("micro.process.button.Cancel"));
            this.fxml_generalButtonSaveAndPrint.setText(this.resources.getString("micro.process.button.SaveAndPrint"));
         } else {
            this.fxml_generalButtonCancel.setText(this.resources.getString("micro.process.button.Return_AlternateCancel"));
            this.fxml_generalButtonSaveAndPrint.setText(this.resources.getString("micro.process.button.Print"));
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setInvoice(HN<?> var1) throws FFK {
      EXF.getInstance().ICO();

      try {
         this.GML = (HY)var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_back(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [back] clicked");
         this.HXY();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonCancel(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [cancel] clicked");
         this.GMN = true;
         this.HXY();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonSave(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [save] clicked");
         this.GMN = true;
         this.HXU();
         this.HXY();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonSaveAndPrint(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [save_and_print] clicked");
         this.GMN = true;
         if (this.GMK.getFieldsEditable()) {
            this.HXU();
         }

         this.HXZ();
         this.HXY();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HXU() {
      EXF.getInstance().ICO();

      try {
         this.HXX();
         if (this.GMK.equals(EPB.CORRECT)) {
            this.GMM.setUsingInvoicingDate(new JS(true));
         } else {
            this.GML.setUsingInvoicingDate(new JS(true));
         }

         EUY var1 = (EUY)this.getProcess();
         var1.HHL();
         if (this.fxml_include_invoiceSaleLogicController.GLV.get()) {
            HU var2 = (HU)this.GML;
            this.HXV(var2.getContractor());
         }
      } catch (FFO | FFI | FFK var8) {
         EXF.getInstance().ICA((Throwable)var8);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Error.SaveInvoice"), var8);

         try {
            ((EUY)this.getProcess()).resetAndCleanUpProcess();
         } catch (FFO | FFK var7) {
            EXF.getInstance().ICA((Throwable)var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Error.SaveInvoice"), var8);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HXV(HI var1) {
      try {
         new ArrayList();
         EUY var3 = (EUY)this.HHG();
         List var2 = this.HXW(var1);
         HI var4;
         if (var2.size() == 0) {
            var4 = var1.AICD();
            var3.getModelManager().HJZ(var3.getParentDefinition(), var4);
         } else {
            var4 = (HI)((EDF)var2.get(0)).getModelBaseElementWithIdObject();
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
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
      }

   }

   private List<EDF<HI>> HXW(HI var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      Object var8;
      try {
         Object var2 = new ArrayList();
         EUY var3 = (EUY)this.getProcess();
         if (var1 != null) {
            AGYN var4;
            if (!var1.AICE()) {
               if (var1.getNip() != null && var1.getNip().getValue() != null) {
                  var4 = new AGYN(HI.class, (String)var1.getNip().getValue());
                  var2 = (List)var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
               }
            } else if (var1.getName() != null && var1.getName().getValue() != null) {
               var4 = new AGYN(HI.class, var1.QON(), (String)null);
               var2 = (List)var3.getModelManager().HJY(var3.getParentDefinition(), var4).getSecondValue();
            }
         }

         var8 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return (List)var8;
   }

   private void HXX() {
      EXF.getInstance().ICO();

      try {
         HashMap var1 = new HashMap();
         List var2;
         if (this.GMK.equals(EPB.CORRECT)) {
            var2 = this.GMM.getInvoiceElements();
         } else {
            var2 = this.GML.getInvoiceElements();
         }

         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            HQ var4 = (HQ)var3.next();
            if (var1.get(var4.getTaxRate().getValue()) == null) {
               var1.put(var4.getTaxRate().getValue(), new EWC(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
            }

            ((EWC)var1.get(var4.getTaxRate().getValue())).setFirstValue(EQY.HRI((BigDecimal)((EWC)var1.get(var4.getTaxRate().getValue())).getFirstValue(), (BigDecimal)var4.getNetPriceForAll().getValue()));
            ((EWC)var1.get(var4.getTaxRate().getValue())).setSecondValue(EQY.HRI((BigDecimal)((EWC)var1.get(var4.getTaxRate().getValue())).getSecondValue(), (BigDecimal)var4.getTaxValueForAll().getValue()));
            ((EWC)var1.get(var4.getTaxRate().getValue())).setThirdValue(EQY.HRI((BigDecimal)((EWC)var1.get(var4.getTaxRate().getValue())).getThirdValue(), (BigDecimal)var4.getGrossValueForAll().getValue()));
         }

         if (this.GMK.equals(EPB.CORRECT)) {
            this.GMM.getSumOfAmountsDividedByTaxRate().clear();
            this.GMM.getAmountOfTaxDividedByTaxRate().clear();
            this.GMM.getSumOfGrossAmountsDividedByTaxRate().clear();
         } else {
            this.GML.getSumOfAmountsDividedByTaxRate().clear();
            this.GML.getAmountOfTaxDividedByTaxRate().clear();
            this.GML.getSumOfGrossAmountsDividedByTaxRate().clear();
         }

         var3 = var1.keySet().iterator();

         while(var3.hasNext()) {
            KL var8 = (KL)var3.next();
            if (this.GMK.equals(EPB.CORRECT)) {
               this.GMM.getSumOfAmountsDividedByTaxRate().add(new EVZ(var8, ((EWC)var1.get(var8)).getFirstValue()));
               this.GMM.getAmountOfTaxDividedByTaxRate().add(new EVZ(var8, ((EWC)var1.get(var8)).getSecondValue()));
               this.GMM.getSumOfGrossAmountsDividedByTaxRate().add(new EVZ(var8, ((EWC)var1.get(var8)).getThirdValue()));
            } else {
               this.GML.getSumOfAmountsDividedByTaxRate().add(new EVZ(var8, ((EWC)var1.get(var8)).getFirstValue()));
               this.GML.getAmountOfTaxDividedByTaxRate().add(new EVZ(var8, ((EWC)var1.get(var8)).getSecondValue()));
               this.GML.getSumOfGrossAmountsDividedByTaxRate().add(new EVZ(var8, ((EWC)var1.get(var8)).getThirdValue()));
            }
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HXY() {
      EXF.getInstance().ICO();

      try {
         JN var1 = null;
         if (this.fxml_include_invoiceSaleLogicController.GLN != null && this.fxml_include_invoiceSaleLogicController.GLN.getPeriod() != null) {
            var1 = this.fxml_include_invoiceSaleLogicController.GLN.getPeriod();
         }

         JN finalVar = var1;
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_LIST.getProcessFxmlFileName(), new ENB<ENK<?>>() {
            public void HNE(ENK<?> var1x) {
               EXF.getInstance().ICO();

               try {
                  var1x.setPeriod(finalVar);
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

   private void HXZ() {
      EXF.getInstance().ICO();

      try {
         EUY var1 = (EUY)this.getProcess();
         File var2 = var1.getTempFile("pdf");
         LY var3 = var1.getUserDataForInvoice(this.GML);
         switch (this.GMK) {
            case NEW:
            case EDIT:
            case VIEW:
               EPE var4 = new EPE(this.resources, (HU)this.GML, var3, var2);
               var4.HOE();
               break;
            case CORRECT:
               EPI var5 = new EPI(this.resources, this.GMM, var3, var2);
               var5.HOE();
               break;
            case VIEW_CORRECTION:
            case EDIT_CORRECTION:
               EPI var6 = new EPI(this.resources, (HV)this.GML, var3, var2);
               var6.HOE();
         }
      } catch (FFO | FFK var10) {
         EXF.getInstance().ICA((Throwable)var10);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_new.Print.Error"), var10);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setContractor(HI var1) {
      this.GMK = EPB.NEW;
      this.GMO = var1;
   }
}
