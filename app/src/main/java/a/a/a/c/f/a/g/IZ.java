package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.RefId;

public class IZ<_T extends ModelBusinessPeriodElement, _R extends Enum<_R>, _Q extends Enum<_Q>, _E extends RefId> extends IY<_T, _R, _Q> {
    protected _E AND;

    public IZ(Class<_T> var1, Period var2, _R var3, _Q var4, _E var5, OrderType var6, Integer var7, Integer var8) {
        super(var1, var2, var3, var4, var6, var7, var8);

        this.AND = var5;

    }

    public IZ(Class<_T> var1, Period var2, _R var3, _Q var4, _E var5, OrderType var6) {
        this(var1, var2, var3, var4, var5, var6, null, null);
    }

    public IZ(Class<_T> var1, Period var2, _R var3, _Q var4, _E var5) {
        this(var1, var2, var3, var4, var5, OrderType.ASC);
    }

    public _E getRefId() {
        return this.AND;
    }
}
