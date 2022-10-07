package a.a.a.c.c.e.g.c;

import a.a.a.b.a.a.FDL;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.d.b.ENP;
import a.a.a.c.c.d.g.EPA;
import a.a.a.c.c.e.g.b.ETR;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.g.c.FCZ;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ETS extends QVI {
   private boolean GIW = false;

   public ETS() {
      super(ETR.GIV.getProcessName());
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   protected void HHI() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   protected void HHJ() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   protected void resetAndCleanUpProcessImpl() {
      EXF.getInstance().ICO();

      try {
         this.getModelManager().resetData(this.getParentDefinition());
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public JG getSettlementStatus(LocalDate var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      Iterator var5;
      try {
         JN var2 = new JN(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
         IY var3 = new IY(JF.class, var2, JH.VAT, (Enum)null);
         EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
         if (((List)var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
         }

         var5 = ((List)var4.getSecondValue()).iterator();
         if (var5.hasNext()) {
            EDF var6 = (EDF)var5.next();
            JG var7 = ((JF)var6.getModelBaseElementWithIdObject()).getSettlementStatus();
            return var7;
         }

         return null;
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

   public List<EPA<HR>> getInvoices(ENP var1, Integer var2, Integer var3, String var4, String var5) throws FFK, FFO {
      EXF.getInstance().ICO();

      ArrayList var15;
      try {
         IU var6 = new IU(HR.class, QSW.ACTIVE, new JN(var2, var3), IB.PURCHASE, (IA)null, (KE)null, var4, FDL.DESC);
         EVZ var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
         ArrayList var8 = new ArrayList();
         if (var7 != null) {
            int var9 = 0;
            Iterator var10 = ((List)var7.getSecondValue()).iterator();

            while(var10.hasNext()) {
               EDF var11 = (EDF)var10.next();
               ++var9;
               var8.add(new EPA(var11, var9));
            }
         }

         var15 = var8;
      } finally {
         EXF.getInstance().ICP();
      }

      return var15;
   }

   public boolean RKH() {
      return this.GIW;
   }

   public void QPH(HR var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      try {
         if (var1 == null) {
            throw FCZ.getInstance().QNZ();
         }

         this.getModelManager().HKC(this.getParentDefinition(), var1);
         this.getModelManager().HKL(this.getParentDefinition());
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
