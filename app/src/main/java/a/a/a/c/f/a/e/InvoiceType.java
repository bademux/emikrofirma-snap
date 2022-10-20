package a.a.a.c.f.a.e;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum InvoiceType implements EnumTypeValue {
    SELL(FCW.getInstance().getMessageForKey("micro.model.type.invoicetype.sell")),
    PURCHASE(FCW.getInstance().getMessageForKey("micro.model.type.invoicetype.purchase"));

    private final String AKZ;

    InvoiceType(String var3) {

        this.AKZ = var3;

    }

    public String getDescription() {
        return this.AKZ;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((InvoiceType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
