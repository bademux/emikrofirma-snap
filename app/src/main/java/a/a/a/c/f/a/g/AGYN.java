package a.a.a.c.f.a.g;

import a.a.a.c.f.a.c.Contractor;

public class AGYN<_T extends Contractor> extends IW<_T> {
    private final String AJHJ;
    private final Integer QLV;

    public AGYN(Class<_T> var1, String var2) {
        this(var1, null, var2);

    }

    public AGYN(Class<_T> var1, Integer var2, String var3) {
        super(var1);

        this.QLV = var2;
        this.AJHJ = var3;

    }

    public Integer getHash() {
        return this.QLV;
    }

    public String getSearch() {
        return this.AJHJ;
    }
}
