package a.a.a.c.f.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.f.a.d.AGWO;
import a.a.a.c.f.a.d.AGWP;
import a.a.a.c.f.a.d.AGWQ;
import a.a.a.c.f.a.d.AGWR;
import a.a.a.c.f.a.d.AGWS;
import a.a.a.c.f.a.d.AGWU;
import a.a.a.c.f.a.d.HJ;
import a.a.a.c.f.a.d.HK;
import a.a.a.c.f.a.d.QGX;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.a.e.HT;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.a.e.HW;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.QSF;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.e.a.IF;
import a.a.a.c.f.a.e.a.IG;
import a.a.a.c.f.a.f.a.IN;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSK;
import a.a.a.c.f.a.n.QSM;
import a.a.a.c.f.a.n.QSN;
import a.a.a.c.f.a.n.QSO;

public enum II {
   Invoice(HN.class),
   InvoiceSellType(HY.class),
   InvoiceSell(HU.class),
   InvoiceSellCorrectionType(HW.class),
   InvoiceSellCorrection(HV.class),
   InvoicePurchaseInvoiceType(HT.class),
   InvoicePurchase(HR.class),
   AggregatePurchase(QSF.class),
   InvoiceOther(QSG.class),
   InvoiceOtherPurchaseInvoiceType(QSM.class),
   InvoiceOtherPurchase(QSK.class),
   InvoiceOtherSellInvoiceType(QSO.class),
   InvoiceOtherSell(QSN.class),
   ReceiptRecord(IN.class),
   ReceiptRecordVat(IR.class),
   Settlement(JF.class),
   SettlementVat(JI.class),
   Declaration(HJ.class),
   DeclarationJPK(AGWN.class),
   DeclarationJPK_EWP(AGWO.class),
   DeclarationJPK_FA(AGWP.class),
   DeclarationJPK_KR(AGWQ.class),
   DeclarationJPK_MAG(AGWR.class),
   DeclarationJPK_PKPIR(AGWS.class),
   DeclarationJPK_VAT(HK.class),
   DeclarationJPK_WB(AGWU.class),
   DeclarationJPK_STATUSTRACKER(QGX.class),
   InvoiceRecord(IC.class),
   InvoiceRecordSell(IG.class),
   InvoiceRecordPurchase(IF.class),
   Contractor(HI.class);

   private final Class<? extends IL> AMG;

   private II(Class var3) {
      this.AMG = var3;
   }

   public static II getByType(Class<? extends IL> var0) {
      II[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         II var4 = var1[var3];
         if (var4.getType().equals(var0)) {
            return var4;
         }
      }

      throw new FFI("Type [" + var0 + "] not found!");
   }

   public Class<? extends IL> getType() {
      return this.AMG;
   }
}
