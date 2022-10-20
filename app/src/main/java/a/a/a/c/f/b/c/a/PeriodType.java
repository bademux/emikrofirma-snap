package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;

public enum PeriodType implements EnumTypeValue {
    monthly(FCW.getInstance().getMessageForKey("micro.model.type.periodtype.monthly")),
    quarterly(FCW.getInstance().getMessageForKey("micro.model.type.periodtype.quarterly"));

    private final String AOR;

    PeriodType(String var3) {

        this.AOR = var3;

    }

    public String getDescription() {
        return this.AOR;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((PeriodType) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
