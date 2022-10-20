package a.a.a.c.f.a.g;

import a.a.a.b.a.a.OrderType;
import a.a.a.c.f.a.b.SqlReturn;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.RecordType;
import a.a.a.c.f.b.b.Period;

public class ReceiptRecordCriteria<_T extends ReceiptRecord> extends ModelBusinessPeriodElementTypedCriteria<_T, RecordType, SqlReturn> {
    public ReceiptRecordCriteria(Class<_T> var1, Period var2, RecordType var3, OrderType var4, Integer var5, Integer var6) {
        super(var1, var2, var3, SqlReturn.VOID, var4, var5, var6);
    }

    public ReceiptRecordCriteria(Class<_T> var1, Period var2, RecordType var3, OrderType var4) {
        super(var1, var2, var3, SqlReturn.VOID, var4);
    }

    public ReceiptRecordCriteria(Class<_T> var1, Period var2, RecordType var3) {
        super(var1, var2, var3, SqlReturn.VOID);
    }
}
