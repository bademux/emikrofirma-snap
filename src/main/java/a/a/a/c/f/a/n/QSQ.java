package a.a.a.c.f.a.n;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum QSQ implements JM {
    SELL_REASON_1(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason1")),
    SELL_REASON_2(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason2")),
    SELL_REASON_3(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason3")),
    SELL_REASON_4(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason4")),
    PURCHASE_REASON_1(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason1")),
    PURCHASE_REASON_2(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason2")),
    PURCHASE_REASON_3(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason3")),
    PURCHASE_REASON_4(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason4"));

    private final String QYL;

    QSQ(String var3) {
        EXF.getInstance().ICO();

        try {
            this.QYL = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getDescription() {
        return this.QYL;
    }

    public int DAQ(JM var1) {
        return this.compareTo((QSQ) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
