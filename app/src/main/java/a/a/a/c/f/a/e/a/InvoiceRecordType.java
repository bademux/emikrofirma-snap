package a.a.a.c.f.a.e.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum InvoiceRecordType implements EnumTypeValue {
    SELL(FCW.getInstance().getMessageForKey("micro.model.type.invoicerecordtype.sell")),
    PURCHASE(FCW.getInstance().getMessageForKey("micro.model.type.invoicerecordtype.purchase"));

    private final String AMF;

    InvoiceRecordType(String var3) {

        this.AMF = var3;

    }

    public String getDescription() {
        return this.AMF;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((InvoiceRecordType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
