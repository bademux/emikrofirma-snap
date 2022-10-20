package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.b.b.Period;

public class EYD<_T extends ModelBusinessPeriodElement, _R extends Enum<_R>, _Q extends Enum<_Q>> extends IY<_T, _R, _Q> {
    private final Settlement FIK;

    public EYD(Class<_T> var1, Settlement var2, OrderType var3, Integer var4, Integer var5, Period var6, _R var7, _Q var8) {
        super(var1, var6, var7, var8, var3, var4, var5);

        this.FIK = var2;

    }

    public EYD(Class<_T> var1, Settlement var2, OrderType var3, Period var4, _R var5, _Q var6) {
        this(var1, var2, var3, null, null, var4, var5, var6);
    }

    public EYD(Class<_T> var1, Settlement var2, Period var3, _R var4, _Q var5) {
        this(var1, var2, OrderType.ASC, var3, var4, var5);
    }

    public Settlement getSettlement() {
        return this.FIK;
    }
}
