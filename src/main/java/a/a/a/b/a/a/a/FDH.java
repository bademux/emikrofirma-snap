package a.a.a.b.a.a.a;

public abstract class FDH {
    protected final String HDI;
    protected final String HDJ;
    protected final String HDK;

    public FDH(String var1, String var2, String var3) {
        this.HDI = var1;
        this.HDJ = var2;
        this.HDK = var3;
    }

    public String getSchema() {
        return this.HDI;
    }

    public String getAlias() {
        return this.HDJ;
    }

    public String getName() {
        return this.HDK;
    }

    public String toString() {
        return "Table [schema=" + this.HDI + ", name=" + this.HDK + ", alias=" + this.HDJ + "]";
    }
}
