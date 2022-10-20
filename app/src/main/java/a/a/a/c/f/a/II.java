package a.a.a.c.f.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.IF;
import a.a.a.c.f.a.e.a.IG;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.a.n.*;

public enum II {
    Invoice(a.a.a.c.f.a.e.Invoice.class),
    InvoiceSellType(HY.class),
    InvoiceSell(HU.class),
    InvoiceSellCorrectionType(HW.class),
    InvoiceSellCorrection(HV.class),
    InvoicePurchaseInvoiceType(HT.class),
    InvoicePurchase(a.a.a.c.f.a.e.InvoicePurchase.class),
    AggregatePurchase(QSF.class),
    InvoiceOther(a.a.a.c.f.a.n.InvoiceOther.class),
    InvoiceOtherPurchaseInvoiceType(QSM.class),
    InvoiceOtherPurchase(a.a.a.c.f.a.n.InvoiceOtherPurchase.class),
    InvoiceOtherSellInvoiceType(QSO.class),
    InvoiceOtherSell(a.a.a.c.f.a.n.InvoiceOtherSell.class),
    ReceiptRecord(a.a.a.c.f.a.f.a.ReceiptRecord.class),
    ReceiptRecordVat(IR.class),
    Settlement(a.a.a.c.f.a.h.Settlement.class),
    SettlementVat(JI.class),
    Declaration(a.a.a.c.f.a.d.Declaration.class),
    DeclarationJPK(a.a.a.c.f.a.d.DeclarationJPK.class),
    DeclarationJPK_EWP(AGWO.class),
    DeclarationJPK_FA(AGWP.class),
    DeclarationJPK_KR(AGWQ.class),
    DeclarationJPK_MAG(AGWR.class),
    DeclarationJPK_PKPIR(AGWS.class),
    DeclarationJPK_VAT(HK.class),
    DeclarationJPK_WB(AGWU.class),
    DeclarationJPK_STATUSTRACKER(QGX.class),
    InvoiceRecord(a.a.a.c.f.a.e.a.InvoiceRecord.class),
    InvoiceRecordSell(IG.class),
    InvoiceRecordPurchase(IF.class),
    Contractor(a.a.a.c.f.a.c.Contractor.class);

    private final Class<? extends ModelBusinessTopElement> AMG;

    II(Class var3) {
        this.AMG = var3;
    }

    public static II getByType(Class<? extends ModelBusinessTopElement> var0) {
        II[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            II var4 = var1[var3];
            if (var4.getType().equals(var0)) {
                return var4;
            }
        }

        throw new FFI("Type [" + var0 + "] not found!");
    }

    public Class<? extends ModelBusinessTopElement> getType() {
        return this.AMG;
    }
}
