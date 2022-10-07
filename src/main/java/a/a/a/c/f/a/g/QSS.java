package a.a.a.c.f.a.g;

import a.a.a.b.a.a.FDL;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.a.n.QSR;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.a.QSW;
import java.util.Date;

public class QSS<_T extends QSG<?>> extends IZ<_T, QSR, QSQ, KE> {
   private QSW QYO;
   private KA QYP;
   private KA QYQ;
   private EVZ<Date, Date> QYR;
   private EVZ<Date, Date> QYS;
   private String QYT;

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, KA var7, KA var8, EVZ<Date, Date> var9, EVZ<Date, Date> var10, String var11, FDL var12, Integer var13, Integer var14) {
      super(var1, var3, var4, var5, var6, var12, var13, var14);
      EXF.getInstance().ICO();

      try {
         this.QYO = var2;
         this.QYP = var7;
         this.QYQ = var8;
         this.QYR = var9;
         this.QYS = var10;
         this.QYT = var11;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, KA var7, EVZ<Date, Date> var8, EVZ<Date, Date> var9, String var10, FDL var11, Integer var12, Integer var13) {
      this(var1, var2, var3, var4, var5, var6, var7, (KA)null, var8, var9, var10, var11, var12, var13);
      EXF.getInstance().ICQ();
   }

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, KA var7, String var8, FDL var9, Integer var10, Integer var11) {
      this(var1, var2, var3, var4, var5, var6, var7, (EVZ)null, (EVZ)null, var8, var9, var10, var11);
      EXF.getInstance().ICQ();
   }

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, KA var7, String var8, FDL var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, (Integer)null, (Integer)null);
      EXF.getInstance().ICQ();
   }

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, String var7, FDL var8) {
      this(var1, var2, var3, var4, var5, var6, (KA)null, var7, var8);
      EXF.getInstance().ICQ();
   }

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, KA var7, String var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, FDL.ASC);
      EXF.getInstance().ICQ();
   }

   public QSS(Class<_T> var1, QSW var2, JN var3, QSR var4, QSQ var5, KE var6, String var7) {
      this(var1, var2, var3, var4, var5, var6, (KA)null, (String)var7);
      EXF.getInstance().ICQ();
   }

   public KA getIssuerNumber() {
      return this.QYP;
   }

   public KA getContractorNIP() {
      return this.QYQ;
   }

   public QSW getState() {
      return this.QYO;
   }

   public EVZ<Date, Date> getCreationDate() {
      return this.QYR;
   }

   public EVZ<Date, Date> getTransactionDate() {
      return this.QYS;
   }

   public String getSearch() {
      return this.QYT;
   }
}
