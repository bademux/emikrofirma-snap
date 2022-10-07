package a.a.a.c.f.a.g;

import a.a.a.b.a.a.FDL;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.b.b.JN;

public class EYD<_T extends IK, _R extends Enum<_R>, _Q extends Enum<_Q>> extends IY<_T, _R, _Q> {
    private final JF FIK;

    public EYD(Class<_T> var1, JF var2, FDL var3, Integer var4, Integer var5, JN var6, _R var7, _Q var8) {
        super(var1, var6, var7, var8, var3, var4, var5);
        EXF.getInstance().ICO();

        try {
            this.FIK = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EYD(Class<_T> var1, JF var2, FDL var3, JN var4, _R var5, _Q var6) {
        this(var1, var2, var3, null, null, var4, var5, var6);
    }

    public EYD(Class<_T> var1, JF var2, JN var3, _R var4, _Q var5) {
        this(var1, var2, FDL.ASC, var3, var4, var5);
    }

    public JF getSettlement() {
        return this.FIK;
    }
}
