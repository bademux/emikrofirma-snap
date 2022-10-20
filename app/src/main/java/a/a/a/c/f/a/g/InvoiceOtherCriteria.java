package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.a.n.InvoiceOtherType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.InvoiceState;

import java.util.Date;

public class InvoiceOtherCriteria<_T extends InvoiceOther<?>> extends ModelBusinessPeriodElementTypedIdCriteria<_T, InvoiceOtherType, InvoiceOtherSubtype, RefId> {
    private final InvoiceState QYO;
    private final Nip QYP;
    private final Nip QYQ;
    private final ValueContainer2<Date, Date> QYR;
    private final ValueContainer2<Date, Date> QYS;
    private final String QYT;

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, Nip var7, Nip var8, ValueContainer2<Date, Date> var9, ValueContainer2<Date, Date> var10, String var11, OrderType var12, Integer var13, Integer var14) {
        super(var1, var3, var4, var5, var6, var12, var13, var14);

        this.QYO = var2;
        this.QYP = var7;
        this.QYQ = var8;
        this.QYR = var9;
        this.QYS = var10;
        this.QYT = var11;

    }

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, Nip var7, ValueContainer2<Date, Date> var8, ValueContainer2<Date, Date> var9, String var10, OrderType var11, Integer var12, Integer var13) {
        this(var1, var2, var3, var4, var5, var6, var7, null, var8, var9, var10, var11, var12, var13);

    }

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, Nip var7, String var8, OrderType var9, Integer var10, Integer var11) {
        this(var1, var2, var3, var4, var5, var6, var7, null, null, var8, var9, var10, var11);

    }

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, Nip var7, String var8, OrderType var9) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null, null);

    }

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, String var7, OrderType var8) {
        this(var1, var2, var3, var4, var5, var6, null, var7, var8);

    }

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, Nip var7, String var8) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, OrderType.ASC);

    }

    public InvoiceOtherCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceOtherType var4, InvoiceOtherSubtype var5, RefId var6, String var7) {
        this(var1, var2, var3, var4, var5, var6, null, var7);

    }

    public Nip getIssuerNumber() {
        return this.QYP;
    }

    public Nip getContractorNIP() {
        return this.QYQ;
    }

    public InvoiceState getState() {
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
