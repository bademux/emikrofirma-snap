package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceSubtype;
import a.a.a.c.f.a.e.InvoiceType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.InvoiceState;

import java.util.Date;

public class InvoiceCriteria<_T extends Invoice<?>> extends ModelBusinessPeriodElementTypedIdCriteria<_T, InvoiceType, InvoiceSubtype, RefId> {
    private final InvoiceState QYN;
    private final Nip AMY;
    private final Nip QLW;
    private final ValueContainer2<Date, Date> QLX;
    private final ValueContainer2<Date, Date> QLY;
    private final String AMZ;

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, Nip var7, Nip var8, ValueContainer2<Date, Date> var9, ValueContainer2<Date, Date> var10, String var11, OrderType var12, Integer var13, Integer var14) {
        super(var1, var3, var4, var5, var6, var12, var13, var14);

        this.QYN = var2;
        this.AMY = var7;
        this.QLW = var8;
        this.QLX = var9;
        this.QLY = var10;
        this.AMZ = var11;

    }

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, Nip var7, ValueContainer2<Date, Date> var8, ValueContainer2<Date, Date> var9, String var10, OrderType var11, Integer var12, Integer var13) {
        this(var1, var2, var3, var4, var5, var6, var7, null, var8, var9, var10, var11, var12, var13);

    }

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, Nip var7, String var8, OrderType var9, Integer var10, Integer var11) {
        this(var1, var2, var3, var4, var5, var6, var7, null, null, var8, var9, var10, var11);

    }

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, Nip var7, String var8, OrderType var9) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, var9, null, null);

    }

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, String var7, OrderType var8) {
        this(var1, var2, var3, var4, var5, var6, null, var7, var8);

    }

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, Nip var7, String var8) {
        this(var1, var2, var3, var4, var5, var6, var7, var8, OrderType.ASC);

    }

    public InvoiceCriteria(Class<_T> var1, InvoiceState var2, Period var3, InvoiceType var4, InvoiceSubtype var5, RefId var6, String var7) {
        this(var1, var2, var3, var4, var5, var6, null, var7);

    }

    public Nip getIssuerNumber() {
        return this.AMY;
    }

    public Nip getContractorNIP() {
        return this.QLW;
    }

    public InvoiceState getState() {
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
