package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.b.b.JN;

public abstract class IX<_T extends IK> extends IW<_T> {
    private final JN ANA;

    public IX(Class<_T> var1, JN var2, OrderType var3, Integer var4, Integer var5) {
        super(var1, var3, var4, var5);

        this.ANA = var2;

    }

    public IX(Class<_T> var1, JN var2, OrderType var3) {
        this(var1, var2, var3, null, null);
    }

    public IX(Class<_T> var1, JN var2) {
        this(var1, var2, OrderType.ASC);
    }

    public JN getPeriod() {
        return this.ANA;
    }
}
