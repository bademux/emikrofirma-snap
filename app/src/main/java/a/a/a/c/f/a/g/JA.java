package a.a.a.c.f.a.g;

import a.a.a.b.a.a.FDL;
import a.a.a.c.f.KU;

public abstract class JA<_T extends KU> {
    private final Class<_T> ANE;
    private final FDL ANF;
    private final Integer ANG;
    private final Integer ANH;

    public JA(Class<_T> var1, FDL var2, Integer var3, Integer var4) {

        this.ANE = var1;
        this.ANF = var2;
        this.ANG = var3;
        this.ANH = var4;

    }

    public JA(Class<_T> var1, FDL var2) {
        this(var1, var2, null, null);

    }

    public JA(Class<_T> var1) {
        this(var1, FDL.ASC);

    }

    public Class<_T> getTypeClass() {
        return this.ANE;
    }

    public FDL getOrderType() {
        return this.ANF;
    }

    public Integer getPageSize() {
        return this.ANG;
    }

    public Integer getPageOffset() {
        return this.ANH;
    }
}
