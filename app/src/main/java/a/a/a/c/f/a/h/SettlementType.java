package a.a.a.c.f.a.h;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum SettlementType implements EnumTypeValue {
    VAT(FCW.getInstance().getMessageForKey("micro.model.type.settlementtype.vat"));

    private final String ANQ;

    SettlementType(String var3) {

        this.ANQ = var3;

    }

    public String getDescription() {
        return this.ANQ;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((SettlementType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
