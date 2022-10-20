package a.a.a.c.f.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.n.BaseInvoicePurchase;
import a.a.a.c.f.a.n.BaseInvoiceSell;

public enum EntityTypes {
    Invoice(a.a.a.c.f.a.e.Invoice.class),
    InvoiceSellType(a.a.a.c.f.a.e.BaseInvoiceSell.class),
    InvoiceSell(a.a.a.c.f.a.e.InvoiceSell.class),
    InvoiceSellCorrectionType(BaseInvoiceSellCorrection.class),
    InvoiceSellCorrection(a.a.a.c.f.a.e.InvoiceSellCorrection.class),
    InvoicePurchaseInvoiceType(a.a.a.c.f.a.e.BaseInvoicePurchase.class),
    InvoicePurchase(a.a.a.c.f.a.e.InvoicePurchase.class),
    AggregatePurchase(a.a.a.c.f.a.e.AggregatePurchase.class),
    InvoiceOther(a.a.a.c.f.a.n.InvoiceOther.class),
    InvoiceOtherPurchaseInvoiceType(BaseInvoicePurchase.class),
    InvoiceOtherPurchase(a.a.a.c.f.a.n.InvoiceOtherPurchase.class),
    InvoiceOtherSellInvoiceType(BaseInvoiceSell.class),
    InvoiceOtherSell(a.a.a.c.f.a.n.InvoiceOtherSell.class),
    ReceiptRecord(a.a.a.c.f.a.f.a.ReceiptRecord.class),
    ReceiptRecordVat(a.a.a.c.f.a.f.a.ReceiptRecordVat.class),
    Settlement(a.a.a.c.f.a.h.Settlement.class),
    SettlementVat(a.a.a.c.f.a.h.SettlementVat.class),
    Declaration(a.a.a.c.f.a.d.Declaration.class),
    DeclarationJPK(a.a.a.c.f.a.d.DeclarationJPK.class),
    DeclarationJPK_EWP(a.a.a.c.f.a.d.DeclarationJPK_EWP.class),
    DeclarationJPK_FA(a.a.a.c.f.a.d.DeclarationJPK_FA.class),
    DeclarationJPK_KR(a.a.a.c.f.a.d.DeclarationJPK_KR.class),
    DeclarationJPK_MAG(a.a.a.c.f.a.d.DeclarationJPK_MAG.class),
    DeclarationJPK_PKPIR(a.a.a.c.f.a.d.DeclarationJPK_PKPIR.class),
    DeclarationJPK_VAT(a.a.a.c.f.a.d.DeclarationJPK_VAT.class),
    DeclarationJPK_WB(a.a.a.c.f.a.d.DeclarationJPK_WB.class),
    DeclarationJPK_STATUSTRACKER(DeclarationJPK_StatusTracker.class),
    InvoiceRecord(a.a.a.c.f.a.e.a.InvoiceRecord.class),
    InvoiceRecordSell(a.a.a.c.f.a.e.a.InvoiceRecordSell.class),
    InvoiceRecordPurchase(a.a.a.c.f.a.e.a.InvoiceRecordPurchase.class),
    Contractor(a.a.a.c.f.a.c.Contractor.class);

    private final Class<? extends ModelBusinessTopElement> AMG;

    EntityTypes(Class var3) {
        this.AMG = var3;
    }

    public static EntityTypes getByType(Class<? extends ModelBusinessTopElement> var0) {
        EntityTypes[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            EntityTypes var4 = var1[var3];
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
