package a.a.a.c.f;

import a.a.a.c.f.a.a.IJE;
import a.a.a.c.f.a.a.IJF;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.e.a.IF;
import a.a.a.c.f.a.e.a.IG;
import a.a.a.c.f.a.f.a.IN;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JI;
import a.a.a.c.f.a.n.*;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.b.LY;

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
        CONFIGURATION_PROPERTIES(LP.class),
        USER_DATA(LY.class),
        INVOICE(HN.class),
        INVOICE_SELL_TYPE(HY.class, INVOICE),
        INVOICE_PURCHASE_INVOICE_TYPE(HT.class, INVOICE),
        INVOICE_SELL_INVOICE_TYPE(HX.class, INVOICE_SELL_TYPE),
        INVOICE_SELL_CORRECTION_TYPE(HW.class, INVOICE_SELL_TYPE),
        INVOICE_SELL(HU.class, INVOICE_SELL_INVOICE_TYPE),
        INVOICE_SELL_CORRECTION(HV.class, INVOICE_SELL_CORRECTION_TYPE),
        INVOICE_PURCHASE(HR.class, INVOICE_PURCHASE_INVOICE_TYPE),
        AGGREGATE_PURCHASE(QSF.class, INVOICE_PURCHASE),
        INVOICE_OTHER(QSG.class),
        INVOICE_OTHER_PURCHASE_INVOICE_TYPE(QSM.class),
        INVOICE_OTHER_PURCHASE(QSK.class),
        INVOICE_OTHER_SELL_INVOICE_TYPE(QSO.class),
        INVOICE_OTHER_SELL(QSN.class),
        RECEIPTRECORD(IN.class),
        RECEIPTRECORDVAT(IR.class, RECEIPTRECORD),
        SETTLEMENT(JF.class),
        SETTLEMENTVAT(JI.class, SETTLEMENT),
        DECLARATION(HJ.class),
        DECLARATIONJPK(AGWN.class, DECLARATION),
        DECLARATIONJPK_EWP(AGWO.class, DECLARATIONJPK),
        DECLARATIONJPK_FA(AGWP.class, DECLARATIONJPK),
        DECLARATIONJPK_KR(AGWQ.class, DECLARATIONJPK),
        DECLARATIONJPK_MAG(AGWR.class, DECLARATIONJPK),
        DECLARATIONJPK_PKPIR(AGWS.class, DECLARATIONJPK),
        DECLARATIONJPK_VAT(HK.class, DECLARATIONJPK),
        DECLARATIONJPK_WB(AGWU.class, DECLARATIONJPK),
        DECLARATIONJPK_STATUSTRACKER(QGX.class, DECLARATIONJPK),
        INVOICERECORD(IC.class),
        INVOICERECORDSELL(IG.class, INVOICERECORD),
        INVOICERECORDPURCHASE(IF.class, INVOICERECORD),
        CONTRACTOR(HI.class),
        DICTIONARY(IJE.class),
        DICTIONARYCOMMODITY(IJF.class, DICTIONARY);

        private final Class<? extends KU> AQB;
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

        public Class<? extends KU> getClazz() {
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
