package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.b.b.Period;

public class ModelBusinessPeriodElementTypedCriteria<_T extends ModelBusinessPeriodElement, _R extends Enum<_R>, _Q extends Enum<_Q>> extends ModelBusinessPeriodElementCriteria<_T> {
    protected _R ANB;
    protected _Q ANC;

    public ModelBusinessPeriodElementTypedCriteria(Class<_T> var1, Period var2, _R var3, _Q var4, OrderType var5, Integer var6, Integer var7) {
        super(var1, var2, var5, var6, var7);

        this.ANB = var3;
        this.ANC = var4;

    }

    public ModelBusinessPeriodElementTypedCriteria(Class<_T> var1, Period var2, _R var3, _Q var4, OrderType var5) {
        this(var1, var2, var3, var4, var5, null, null);
    }

    public ModelBusinessPeriodElementTypedCriteria(Class<_T> var1, Period var2, _R var3, _Q var4) {
        this(var1, var2, var3, var4, OrderType.ASC);
    }

    public _R getType() {
        return this.ANB;
    }

    public _Q getSubType() {
        return this.ANC;
    }
}
