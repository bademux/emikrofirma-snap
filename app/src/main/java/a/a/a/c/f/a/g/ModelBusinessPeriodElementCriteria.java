package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.b.b.Period;

public abstract class ModelBusinessPeriodElementCriteria<_T extends ModelBusinessPeriodElement> extends ModelBusinessElementCriteria<_T> {
    private final Period ANA;

    public ModelBusinessPeriodElementCriteria(Class<_T> var1, Period var2, OrderType var3, Integer var4, Integer var5) {
        super(var1, var3, var4, var5);

        this.ANA = var2;

    }

    public ModelBusinessPeriodElementCriteria(Class<_T> var1, Period var2, OrderType var3) {
        this(var1, var2, var3, null, null);
    }

    public ModelBusinessPeriodElementCriteria(Class<_T> var1, Period var2) {
        this(var1, var2, OrderType.ASC);
    }

    public Period getPeriod() {
        return this.ANA;
    }
}
