package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.ModelBusinessTopElement;

public abstract class ModelBusinessElementCriteria<_T extends ModelBusinessTopElement> extends ModelElementCriteria<_T> {
    public ModelBusinessElementCriteria(Class<_T> var1, OrderType var2, Integer var3, Integer var4) {
        super(var1, var2, var3, var4);
    }

    public ModelBusinessElementCriteria(Class<_T> var1, OrderType var2) {
        this(var1, var2, null, null);
    }

    public ModelBusinessElementCriteria(Class<_T> var1) {
        this(var1, OrderType.ASC);
    }
}
