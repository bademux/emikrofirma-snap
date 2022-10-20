package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.b.SqlReturn;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.b.b.Period;

public class SettlementCriteria<_T extends Settlement> extends ModelBusinessPeriodElementTypedCriteria<_T, SettlementType, SqlReturn> {
    public SettlementCriteria(Class<_T> var1, Period var2, SettlementType var3, OrderType var4, Integer var5, Integer var6) {
        super(var1, var2, var3, SqlReturn.VOID, var4, var5, var6);
    }

    public SettlementCriteria(Class<_T> var1, Period var2, SettlementType var3, OrderType var4) {
        super(var1, var2, var3, SqlReturn.VOID, var4);
    }

    public SettlementCriteria(Class<_T> var1, Period var2, SettlementType var3) {
        super(var1, var2, var3, SqlReturn.VOID);
    }
}
