package a.a.a.c.c.e.c.c;

import a.a.a.b.a.a.FDL;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELW;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.e.c.b.ESI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWP;
import a.a.a.c.f.a.d.AGWW;
import a.a.a.c.f.a.d.HJ;
import a.a.a.c.f.a.d.HK;
import a.a.a.c.f.a.d.HM;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.e.a.IH;
import a.a.a.c.f.a.g.EYD;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.IV;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.KO;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.a.AILX;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.a.LQ;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.g.FCQ;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.stage.Stage;

public class ESJ extends ELW {
   private LP GCU;
   private LS GCV;
   private LS GCW;
   private AILX GCX;
   private LY GCY;

   public ESJ() {
      super(ESI.GCR.getProcessName());
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   protected void HHI() {
      EXF.getInstance().ICO();

      try {
         if (this.GCU == null) {
            JB var1 = new JB(LP.class);
            this.GCU = (LP)this.getModelManager().HJT(this.getParentDefinition(), var1);
            Iterator var2 = this.GCU.getConfigurationProperties().iterator();

            while(var2.hasNext()) {
               LQ var3 = (LQ)var2.next();
               if (FCQ.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                  this.GCV = (LS)var3;
               } else if (FCQ.Pkcs11LibraryFile.getPropertyName().equals(var3.DEX().getValue())) {
                  this.GCW = (LS)var3;
               } else if (FCQ.PerformVerification.getPropertyName().equals(var3.DEX().getValue())) {
                  this.GCX = (AILX)var3;
               }
            }
         }
      } catch (FFK var7) {
         EXF.getInstance().ICA((Throwable)var7);
         throw new FFI(var7);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void HHJ() {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().HKL(this.getParentDefinition());
         this.GCU = null;
         this.GCY = null;
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void resetAndCleanUpProcessImpl() {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().resetData(this.getParentDefinition());
         this.GCU = null;
         this.GCY = null;
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public List<ESL> getSettlementWithDeclarationList() {
      EXF.getInstance().ICO();

      try {
         ArrayList var1 = new ArrayList();
         List var2 = this.getSettlements();
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            EDF var4 = (EDF)var3.next();
            if (!JN.AOE.equals(var4.getPeriod())) {
               EDF var5 = var4;
               ArrayList var6 = new ArrayList();

               ESL var7;
               while(var5.getParentWrapperWithCanceledState() != null) {
                  var5 = (EDF)var5.getParentWrapperWithCanceledState();
                  var7 = new ESL(var5, this, (List)null, true, true, false);
                  var6.add(var7);
               }

               var7 = new ESL(var4, this, var6, false, false, true);
               var1.add(var7);
            }
         }

         ArrayList var11 = var1;
         return var11;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public HK getDeclarationJPK_VAT(JF var1) {
      EXF.getInstance().ICO();

      HK var4;
      try {
         EYD var2 = new EYD(HK.class, var1, (JN)null, HM.JPK, AGWW.VAT);
         EVZ var3 = this.getModelManager().HKD(this.getParentDefinition(), var2);
         if (var3 == null || var3.getSecondValue() == null || ((List)var3.getSecondValue()).size() <= 0) {
            var4 = null;
            return var4;
         }

         var4 = (HK)((EDF)((List)var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
      } catch (FFO | FFK var8) {
         EXF.getInstance().ICA((Throwable)var8);
         throw new FFI(var8);
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public AGWP getDeclarationJPK_FA(JF var1) {
      EXF.getInstance().ICO();

      AGWP var4;
      try {
         EYD var2 = new EYD(AGWP.class, var1, (JN)null, HM.JPK, AGWW.FA);
         EVZ var3 = this.getModelManager().HKD(this.getParentDefinition(), var2);
         if (var3 == null || var3.getSecondValue() == null || ((List)var3.getSecondValue()).size() <= 0) {
            var4 = null;
            return var4;
         }

         var4 = (AGWP)((EDF)((List)var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
      } catch (FFO | FFK var8) {
         EXF.getInstance().ICA((Throwable)var8);
         throw new FFI(var8);
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public List<EDF<JF>> getSettlements() {
      EXF.getInstance().ICO();

      List var3;
      try {
         IY var1 = new IY(JF.class, (JN)null, JH.VAT, (Enum)null, FDL.DESC);
         EVZ var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
         var3 = (List)var2.getSecondValue();
      } catch (FFO | FFK var7) {
         EXF.getInstance().ICA((Throwable)var7);
         throw new FFI(var7);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public boolean isUnsettledInvoicesExist() {
      EXF.getInstance().ICO();

      boolean var3;
      try {
         IU var1 = new IU(HV.class, QSW.ACTIVE, JN.AOE, IB.SELL, IA.CORRECTION, (KE)null, (String)null, FDL.DESC);
         EVZ var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
         if (((List)var2.getSecondValue()).size() <= 0) {
            var3 = false;
            return var3;
         }

         var3 = true;
      } catch (FFO | FFK var7) {
         EXF.getInstance().ICA((Throwable)var7);
         throw new FFI(var7);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public void HTK(JF var1) {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().HJZ(this.getParentDefinition(), var1);
         this.getModelManager().HKL(this.getParentDefinition());
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HTL(HJ var1) {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().HKC(this.getParentDefinition(), var1);
         this.getModelManager().HKL(this.getParentDefinition());
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public File getWorkingDir(Stage var1) throws FFK {
      return this.getOrSelectWorkingDir(var1);
   }

   public String getPkcs11LibraryFilePath() {
      return this.GCW != null && this.GCW.getValue() != null ? (String)((KO)this.GCW.getValue()).getValue() : null;
   }

   public boolean HTM() {
      return this.GCX != null && this.GCX.getValue() != null ? (Boolean)((JS)this.GCX.getValue()).getValue() : true;
   }

   public LY getUserData() throws FFK {
      if (this.GCY == null) {
         this.GCY = EMB.getInstance().HHV();
      }

      return this.GCY;
   }

   public File getTempFile(Stage var1, String var2) throws FFK {
      EXF.getInstance().ICO();

      File var5;
      try {
         File var3 = this.getWorkingDir(var1);
         File var4 = new File(var3, "" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var2);
         var5 = var4;
      } finally {
         EXF.getInstance().ICP();
      }

      return var5;
   }

   public void HTN(JF var1) {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().HKB(this.getParentDefinition(), var1);
         this.getModelManager().HKL(this.getParentDefinition());
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public JG getSettlementStatus(JN var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      JG var6;
      try {
         IY var2 = new IY(JF.class, var1, JH.VAT, (Enum)null);
         EVZ var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
         if (((List)var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
         }

         Iterator var4 = ((List)var3.getSecondValue()).iterator();
         if (!var4.hasNext()) {
            return null;
         }

         EDF var5 = (EDF)var4.next();
         var6 = ((JF)var5.getModelBaseElementWithIdObject()).getSettlementStatus();
      } finally {
         EXF.getInstance().ICP();
      }

      return var6;
   }

   public List<EDF<IC>> HTO(JN var1) {
      EXF.getInstance().ICO();

      IV var2;
      try {
         List var3;
         try {
            if (var1 != null && var1.getMonth() != null && var1.getMonth().getValue() != null && var1.getYear() != null && var1.getYear().getValue() != null) {
               var2 = new IV(IC.class, var1, (IH)null);
               var3 = (List)this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
               List var4 = var3;
               return var4;
            }

            return null;
         } catch (FFK | FFO var8) {
            EXF.getInstance().ICA((Throwable)var8);
            var3 = null;
            return var3;
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public List<EDF<HY>> QPE(JN var1) {
      EXF.getInstance().ICO();

      List var3;
      try {
         IU var2;
         if (var1 != null && var1.getMonth() != null && var1.getMonth().getValue() != null && var1.getYear() != null && var1.getYear().getValue() != null) {
            var2 = new IU(HY.class, QSW.ACTIVE, var1, IB.SELL, (IA)null, (KE)null, (String)null, FDL.DESC);
            var3 = (List)this.getModelManager().HJY(this.getParentDefinition(), var2).getSecondValue();
            List var4 = var3;
            return var4;
         }

         return null;
      } catch (FFK | FFO var8) {
         EXF.getInstance().ICA((Throwable)var8);
         var3 = null;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public Integer HTQ(JN var1, HM var2, AGWW var3) {
      EXF.getInstance().ICO();

      Object var5;
      try {
         Integer var4 = this.getModelManager().getMaxDocumentIndex(this.getParentDefinition(), HJ.class, var1, var2, var3);
         return var4;
      } catch (FFO | FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         var5 = null;
      } finally {
         EXF.getInstance().ICP();
      }

      return (Integer)var5;
   }

   public void HTR(HJ var1, JF var2) {
      EXF.getInstance().ICO();

      try {
         if (var1 != null) {
            this.getModelManager().HKA(this.getParentDefinition(), var1, var2);
            this.getModelManager().HKL(this.getParentDefinition());
         }
      } catch (FFO | FFK var7) {
         EXF.getInstance().ICA((Throwable)var7);
         throw new FFI(var7);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
