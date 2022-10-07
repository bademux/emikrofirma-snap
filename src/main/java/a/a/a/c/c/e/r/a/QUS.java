package a.a.a.c.c.e.r.a;

import a.a.a.c.f.b.JM;

public enum QUS implements JM {
    CORRECT_ART89A_UST1("CORRECT_ART89A_UST1"),
    CORRECT_ART89A_UST4("CORRECT_ART89A_UST4"),
    TAX_FROM_NATURE("TAX_FROM_NATURE"),
    RETURN_FROM_CASH_REGISTER("RETURN_FROM_CASH_REGISTER");

    private final String RER;

    QUS(String var3) {
        this.RER = var3;
    }

    public String getDescription() {
        return this.RER;
    }

    public int DAQ(JM var1) {
        return this.compareTo((QUS) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
