package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.QSW;

import java.util.Date;

public class IU<_T extends Invoice<?>> extends IZ<_T, IB, IA, RefId> {
    private final QSW QYN;
    private final KA AMY;
    private final KA QLW;
    private final ValueContainer2<Date, Date> QLX;
    private final ValueContainer2<Date, Date> QLY;
    private final String AMZ;

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, KA var7, KA var8, ValueContainer2<Date, Date> var9, ValueContainer2<Date, Date> var10, String var11, OrderType var12, Integer var13, Integer var14) {
        super(var1, var3, var4, var5, var6, var12, var13, var14);

        this.QYN = var2;
        this.AMY = var7;
        this.QLW = var8;
        this.QLX = var9;
        this.QLY = var10;
        this.AMZ = var11;

    }

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, KA var7, ValueContainer2<Date, Date> var8, ValueContainer2<Date, Date> var9, String var10, OrderType var11, Integer var12, Integer var13) {
        this(var1, var2, var3, var4, var5, var6, var7, null, var8, var9, var10, var11, var12, var13);

    }

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, KA var7, String var8, OrderType var9, Integer var10, Integer var11) {
        this(var1, var2, var3, var4, var5, var6, var7, null, null, var8, var9, var10, var11);

    }

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, KA var7, String var8, OrderType var9) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null, null);

    }

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, String var7, OrderType var8) {
        this(var1, var2, var3, var4, var5, var6, null, var7, var8);

    }

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, KA var7, String var8) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, OrderType.ASC);

    }

    public IU(Class<_T> var1, QSW var2, Period var3, IB var4, IA var5, RefId var6, String var7) {
        this(var1, var2, var3, var4, var5, var6, null, var7);

    }

    public KA getIssuerNumber() {
        return this.AMY;
    }

    public KA getContractorNIP() {
        return this.QLW;
    }

    public QSW getState() {
        return this.QYN;
    }

    public ValueContainer2<Date, Date> getCreationDate() {
        return this.QLX;
    }

    public ValueContainer2<Date, Date> getTransactionDate() {
        return this.QLY;
    }

    public String getSearch() {
        return this.AMZ;
    }
}
