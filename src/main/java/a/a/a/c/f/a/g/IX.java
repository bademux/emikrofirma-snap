package a.a.a.c.f.a.g;

import a.a.a.b.a.a.FDL;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.b.b.JN;

public abstract class IX<_T extends IK> extends IW<_T> {
    private final JN ANA;

    public IX(Class<_T> var1, JN var2, FDL var3, Integer var4, Integer var5) {
        super(var1, var3, var4, var5);
        EXF.getInstance().ICO();

        try {
            this.ANA = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public IX(Class<_T> var1, JN var2, FDL var3) {
        this(var1, var2, var3, null, null);
    }

    public IX(Class<_T> var1, JN var2) {
        this(var1, var2, FDL.ASC);
    }

    public JN getPeriod() {
        return this.ANA;
    }
}
