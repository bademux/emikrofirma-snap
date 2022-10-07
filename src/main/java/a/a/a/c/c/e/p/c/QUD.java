package a.a.a.c.c.e.p.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.p.b.QUC;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.a.n.QSK;
import a.a.a.c.f.b.b.JN;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QUD extends ELX implements EYL {
   private QSK RCT;
   private EPB RCU;

   public QUD() {
      super(QUC.RCR.getProcessName());
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   protected void HHI() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   protected void HHJ() {
      EXF.getInstance().ICO();

      try {
         switch (this.RCU) {
            case NEW:
               this.getModelManager().HJZ(this.getParentDefinition(), this.RCT);
               break;
            case EDIT:
               this.getModelManager().HKB(this.getParentDefinition(), this.RCT);
         }

         this.RCT = null;
         this.getModelManager().HKL(this.getParentDefinition());
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5.getMessage());
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void resetAndCleanUpProcessImpl() {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().resetData(this.getParentDefinition());
         this.RCT = null;
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public JG getSettlementStatus(LocalDate var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      JG var7;
      try {
         JN var2 = new JN(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
         IY var3 = new IY(JF.class, var2, JH.VAT, (Enum)null);
         EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
         if (((List)var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
         }

         Iterator var5 = ((List)var4.getSecondValue()).iterator();
         if (!var5.hasNext()) {
            return null;
         }

         EDF var6 = (EDF)var5.next();
         var7 = ((JF)var6.getModelBaseElementWithIdObject()).getSettlementStatus();
      } finally {
         EXF.getInstance().ICP();
      }

      return var7;
   }

   public List<QJW> getContractorsByText(String var1) {
      EXF.getInstance().ICO();
      ArrayList var2 = new ArrayList();

      ArrayList var4;
      try {
         AGYN var3 = new AGYN(HI.class, var1);
         EVZ var13 = this.getModelManager().HJY(this.getParentDefinition(), var3);
         if (var13 != null) {
            Iterator var5 = ((List)var13.getSecondValue()).iterator();

            while(var5.hasNext()) {
               EDF var6 = (EDF)var5.next();
               if (var6 != null) {
                  var2.add(new QJW(var6));
               }
            }
         }

         ArrayList var12 = var2;
         return var12;
      } catch (FFO | FFK var10) {
         EXF.getInstance().ICA((Throwable)var10);
         var4 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public void setMode(EPB var1) {
      this.RCU = var1;
      this.HHI();
   }

   public void setInvoiceOtherPurchase(QSK var1) {
      EXF.getInstance().ICO();

      try {
         this.RCT = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public QSK getInvoiceOtherPurchase() throws FFK, FFO {
      EXF.getInstance().ICO();

      QSK var1;
      try {
         if (this.RCT == null) {
            this.RCT = (QSK)this.getModelManager().ROG(this.getParentDefinition(), QSK.class);
         }

         var1 = this.RCT;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }
}
