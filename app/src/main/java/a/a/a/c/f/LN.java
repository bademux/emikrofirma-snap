package a.a.a.c.f;

import a.a.a.c.f.a.a.Dictionary;
import a.a.a.c.f.a.a.DictionaryEntry;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.e.a.InvoiceRecordPurchase;
import a.a.a.c.f.a.e.a.InvoiceRecordSell;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.ReceiptRecordVat;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementVat;
import a.a.a.c.f.a.n.*;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.b.UserData;

import java.util.ArrayList;
import java.util.List;

public final class LN {
    private final LO AQE;

    public LN(LO var1) {
        this.AQE = var1;
    }

    public LO getType() {
        return this.AQE;
    }

    public enum LO {
        CONFIGURATION_PROPERTIES(ConfigurationProperties.class),
        USER_DATA(UserData.class),
        INVOICE(Invoice.class),
        INVOICE_SELL_TYPE(HY.class, INVOICE),
        INVOICE_PURCHASE_INVOICE_TYPE(HT.class, INVOICE),
        INVOICE_SELL_INVOICE_TYPE(HX.class, INVOICE_SELL_TYPE),
        INVOICE_SELL_CORRECTION_TYPE(HW.class, INVOICE_SELL_TYPE),
        INVOICE_SELL(InvoiceSell.class, INVOICE_SELL_INVOICE_TYPE),
        INVOICE_SELL_CORRECTION(InvoiceSellCorrection.class, INVOICE_SELL_CORRECTION_TYPE),
        INVOICE_PURCHASE(InvoicePurchase.class, INVOICE_PURCHASE_INVOICE_TYPE),
        AGGREGATE_PURCHASE(AggregatePurchase.class, INVOICE_PURCHASE),
        INVOICE_OTHER(InvoiceOther.class),
        INVOICE_OTHER_PURCHASE_INVOICE_TYPE(QSM.class),
        INVOICE_OTHER_PURCHASE(InvoiceOtherPurchase.class),
        INVOICE_OTHER_SELL_INVOICE_TYPE(QSO.class),
        INVOICE_OTHER_SELL(InvoiceOtherSell.class),
        RECEIPTRECORD(ReceiptRecord.class),
        RECEIPTRECORDVAT(ReceiptRecordVat.class, RECEIPTRECORD),
        SETTLEMENT(Settlement.class),
        SETTLEMENTVAT(SettlementVat.class, SETTLEMENT),
        DECLARATION(Declaration.class),
        DECLARATIONJPK(DeclarationJPK.class, DECLARATION),
        DECLARATIONJPK_EWP(DeclarationJPK_EWP.class, DECLARATIONJPK),
        DECLARATIONJPK_FA(DeclarationJPK_FA.class, DECLARATIONJPK),
        DECLARATIONJPK_KR(DeclarationJPK_KR.class, DECLARATIONJPK),
        DECLARATIONJPK_MAG(DeclarationJPK_MAG.class, DECLARATIONJPK),
        DECLARATIONJPK_PKPIR(DeclarationJPK_PKPIR.class, DECLARATIONJPK),
        DECLARATIONJPK_VAT(DeclarationJPK_VAT.class, DECLARATIONJPK),
        DECLARATIONJPK_WB(DeclarationJPK_WB.class, DECLARATIONJPK),
        DECLARATIONJPK_STATUSTRACKER(DeclarationJPK_StatusTracker.class, DECLARATIONJPK),
        INVOICERECORD(InvoiceRecord.class),
        INVOICERECORDSELL(InvoiceRecordSell.class, INVOICERECORD),
        INVOICERECORDPURCHASE(InvoiceRecordPurchase.class, INVOICERECORD),
        CONTRACTOR(Contractor.class),
        DICTIONARY(Dictionary.class),
        DICTIONARYCOMMODITY(DictionaryEntry.class, DICTIONARY);

        private final Class<? extends ModelBase> AQB;
        private final LO AQC;
        private final List<LO> AQD;

        LO(Class var3) {
            this(var3, null);
        }

        LO(Class var3, LO var4) {
            this.AQB = var3;
            this.AQD = new ArrayList();
            this.AQC = var4;
            if (this.AQC != null) {
                this.AQC.AQD.add(this);
            }

        }

        public Class<? extends ModelBase> getClazz() {
            return this.AQB;
        }

        public LO getParent() {
            return this.AQC;
        }

        public List<LO> getChildren() {
            return this.AQD;
        }
    }
}
