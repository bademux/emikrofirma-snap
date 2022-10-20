package a.a.a.b.a.a.c;

public abstract class View {
    protected final String HDR;
    protected final String HDS;
    protected final String HDT;

    public View(String var1, String var2, String var3) {
        this.HDR = var1;
        this.HDS = var2;
        this.HDT = var3;
    }

    public String getSchema() {
        return this.HDR;
    }

    public String getAlias() {
        return this.HDS;
    }

    public String getName() {
        return this.HDT;
    }

    public String toString() {
        return "View [schema=" + this.HDR + ", name=" + this.HDT + ", alias=" + this.HDS + "]";
    }
}
