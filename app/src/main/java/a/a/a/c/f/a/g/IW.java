package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.IL;

public abstract class IW<_T extends IL> extends JA<_T> {
    public IW(Class<_T> var1, OrderType var2, Integer var3, Integer var4) {
        super(var1, var2, var3, var4);
    }

    public IW(Class<_T> var1, OrderType var2) {
        this(var1, var2, null, null);
    }

    public IW(Class<_T> var1) {
        this(var1, OrderType.ASC);
    }
}
