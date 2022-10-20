package a.a.a.c.f.a.n;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum InvoiceOtherSubtype implements EnumTypeValue {
    SELL_REASON_1(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason1")),
    SELL_REASON_2(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason2")),
    SELL_REASON_3(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason3")),
    SELL_REASON_4(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.sell.reason4")),
    PURCHASE_REASON_1(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason1")),
    PURCHASE_REASON_2(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason2")),
    PURCHASE_REASON_3(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason3")),
    PURCHASE_REASON_4(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothersubtype.purchase.reason4"));

    private final String QYL;

    InvoiceOtherSubtype(String var3) {

        this.QYL = var3;

    }

    public String getDescription() {
        return this.QYL;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((InvoiceOtherSubtype) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
