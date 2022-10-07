package a.a.a.c.e.a;

import a.a.a.c.e.a.k.a.EXF;

import java.util.HashMap;
import java.util.Map;

public class EXQ {
    private static volatile EXQ GVF;
    private final Map<String, Object> GVG;

    public static EXQ getInstance() {
        if (GVF == null) {
            Class var0 = EXQ.class;
            synchronized (EXQ.class) {
                if (GVF == null) {
                    GVF = new EXQ();
                }
            }
        }

        return GVF;
    }

    public EXQ() {
        EXF.getInstance().ICO();

        try {
            this.GVG = new HashMap();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Object IEN(String var1, Object var2) {
        EXF.getInstance().ICO();

        Object var3;
        try {
            var3 = this.GVG.put(var1, var2);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public Object IEO(String var1) {
        EXF.getInstance().ICO();

        Object var2;
        try {
            var2 = this.GVG.get(var1);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }
}
