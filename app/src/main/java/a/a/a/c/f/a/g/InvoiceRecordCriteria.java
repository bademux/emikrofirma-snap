package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.b.SqlReturn;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.e.a.InvoiceRecordType;
import a.a.a.c.f.b.b.Period;

public class InvoiceRecordCriteria<_T extends InvoiceRecord> extends ModelBusinessPeriodElementTypedCriteria<_T, InvoiceRecordType, SqlReturn> {
    public InvoiceRecordCriteria(Class<_T> var1, Period var2, InvoiceRecordType var3, OrderType var4, Integer var5, Integer var6) {
        super(var1, var2, var3, SqlReturn.VOID, var4, var5, var6);
    }

    public InvoiceRecordCriteria(Class<_T> var1, Period var2, InvoiceRecordType var3, OrderType var4) {
        super(var1, var2, var3, SqlReturn.VOID, var4);
    }

    public InvoiceRecordCriteria(Class<_T> var1, Period var2, InvoiceRecordType var3) {
        super(var1, var2, var3, SqlReturn.VOID);
    }
}
