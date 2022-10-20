package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.ModelBase;

public abstract class ModelElementCriteria<_T extends ModelBase> {
    private final Class<_T> ANE;
    private final OrderType ANF;
    private final Integer ANG;
    private final Integer ANH;

    public ModelElementCriteria(Class<_T> var1, OrderType var2, Integer var3, Integer var4) {

        this.ANE = var1;
        this.ANF = var2;
        this.ANG = var3;
        this.ANH = var4;

    }

    public ModelElementCriteria(Class<_T> var1, OrderType var2) {
        this(var1, var2, null, null);

    }

    public ModelElementCriteria(Class<_T> var1) {
        this(var1, OrderType.ASC);

    }

    public Class<_T> getTypeClass() {
        return this.ANE;
    }

    public OrderType getOrderType() {
        return this.ANF;
    }

    public Integer getPageSize() {
        return this.ANG;
    }

    public Integer getPageOffset() {
        return this.ANH;
    }
}
