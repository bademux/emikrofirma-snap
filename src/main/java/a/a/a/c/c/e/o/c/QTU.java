package a.a.a.c.c.e.o.c;

import a.a.a.b.a.a.FDL;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.d.n.QVB;
import a.a.a.c.c.e.o.b.QTT;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.g.QSS;
import a.a.a.c.f.a.n.QSK;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.a.n.QSR;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.g.c.FCZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QTU extends QVI {
   public QTU() {
      super(QTT.RBR.getProcessName());
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

   public List<QVB<QSK>> getInvoicesOtherPurchase(Integer var1, Integer var2, String var3, QSW var4) throws FFK, FFO {
      EXF.getInstance().ICO();

      ArrayList var15;
      try {
         JN var5 = null;
         if (var1 != null && var2 != null) {
            var5 = new JN(var1, var2);
         }

         if (var3 != null && var1 != null) {
            var5 = new JN(var1, (Integer)null);
         }

         QSS var6 = new QSS(QSK.class, var4, var5, QSR.PURCHASE, (QSQ)null, (KE)null, var3, FDL.DESC);
         EVZ var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
         ArrayList var8 = new ArrayList();
         if (var7 != null) {
            int var9 = 0;
            Iterator var10 = ((List)var7.getSecondValue()).iterator();

            while(var10.hasNext()) {
               EDF var11 = (EDF)var10.next();
               ++var9;
               var8.add(new QVB(var11, var9));
            }
         }

         var15 = var8;
      } finally {
         EXF.getInstance().ICP();
      }

      return var15;
   }

   public void RLU(QSK var1) throws FFK, FFO {
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
