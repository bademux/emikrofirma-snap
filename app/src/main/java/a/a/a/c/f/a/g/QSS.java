package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.a.n.QSR;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.QSW;

import java.util.Date;

public class QSS<_T extends InvoiceOther<?>> extends IZ<_T, QSR, QSQ, RefId> {
    private final QSW QYO;
    private final KA QYP;
    private final KA QYQ;
    private final ValueContainer2<Date, Date> QYR;
    private final ValueContainer2<Date, Date> QYS;
    private final String QYT;

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, KA var7, KA var8, ValueContainer2<Date, Date> var9, ValueContainer2<Date, Date> var10, String var11, OrderType var12, Integer var13, Integer var14) {
        super(var1, var3, var4, var5, var6, var12, var13, var14);

        this.QYO = var2;
        this.QYP = var7;
        this.QYQ = var8;
        this.QYR = var9;
        this.QYS = var10;
        this.QYT = var11;

    }

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, KA var7, ValueContainer2<Date, Date> var8, ValueContainer2<Date, Date> var9, String var10, OrderType var11, Integer var12, Integer var13) {
        this(var1, var2, var3, var4, var5, var6, var7, null, var8, var9, var10, var11, var12, var13);

    }

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, KA var7, String var8, OrderType var9, Integer var10, Integer var11) {
        this(var1, var2, var3, var4, var5, var6, var7, null, null, var8, var9, var10, var11);

    }

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, KA var7, String var8, OrderType var9) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null, null);

    }

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, String var7, OrderType var8) {
        this(var1, var2, var3, var4, var5, var6, null, var7, var8);

    }

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, KA var7, String var8) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, OrderType.ASC);

    }

    public QSS(Class<_T> var1, QSW var2, Period var3, QSR var4, QSQ var5, RefId var6, String var7) {
        this(var1, var2, var3, var4, var5, var6, null, var7);

    }

    public KA getIssuerNumber() {
        return this.QYP;
    }

    public KA getContractorNIP() {
        return this.QYQ;
    }

    public QSW getState() {
        return this.QYO;
    }

    public ValueContainer2<Date, Date> getCreationDate() {
        return this.QYR;
    }

    public ValueContainer2<Date, Date> getTransactionDate() {
        return this.QYS;
    }

    public String getSearch() {
        return this.QYT;
    }
}
