package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.d.DeclarationSubtype;
import a.a.a.c.f.a.d.Declaration;
import a.a.a.c.f.a.d.DeclarationType;
import a.a.a.c.f.b.b.Period;

public class DeclarationCriteria<_T extends Declaration> extends ModelBusinessPeriodElementTypedCriteria<_T, DeclarationType, DeclarationSubtype> {
    public DeclarationCriteria(Class<_T> var1, Period var2, DeclarationType var3, DeclarationSubtype var4, OrderType var5, Integer var6, Integer var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    public DeclarationCriteria(Class<_T> var1, Period var2, DeclarationType var3, DeclarationSubtype var4, OrderType var5) {
        super(var1, var2, var3, var4, var5);
    }

    public DeclarationCriteria(Class<_T> var1, Period var2, DeclarationType var3, DeclarationSubtype var4) {
        super(var1, var2, var3, var4);
    }
}
