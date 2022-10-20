package a.a.a.c.f.a.n;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum InvoiceOtherType implements EnumTypeValue {
    SELL(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothertype.sell")),
    PURCHASE(FCW.getInstance().getMessageForKey("micro.model.type.invoiceothertype.purchase"));

    private final String QYM;

    InvoiceOtherType(String var3) {

        this.QYM = var3;

    }

    public String getDescription() {
        return this.QYM;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((InvoiceOtherType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
