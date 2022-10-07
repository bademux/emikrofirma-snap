package a.a.a.b.a.a;

public enum FEI {
    NONE("", ""),
    MIN("MIN(", ")"),
    MAX("MAX(", ")"),
    SUM("SUM(", ")"),
    COUNT("COUNT(", ")"),
    COALESCE_0_MAX_PLUS_1("COALESCE(MAX(", ")+1, 0)");

    private final String HES;
    private final String HET;

    FEI(String var3, String var4) {
        this.HES = var3;
        this.HET = var4;
    }

    public String getPrefix() {
        return this.HES;
    }

    public String getSuffix() {
        return this.HET;
    }
}
