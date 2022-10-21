package a.a.a.c.c.e.h.c;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.e.h.b.ETU;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.RecordType;
import a.a.a.c.f.a.f.a.ReceiptRecordVat;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.g.ReceiptRecordCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.MonthType;
import a.a.a.c.g.c.FCZ;

import java.util.*;

public class ETV extends QVI {
    Set<ReceiptRecord> GJK;

    public ETV() {
        super(ETU.GJJ.getProcessName());

    }

    protected void HHI() {

    }

    protected void HHJ() {

    }

    protected void resetAndCleanUpProcessImpl() {

    }

    public ValueContainer2<Integer, List<ParametrizedModel<ReceiptRecordVat>>> getReceiptRecords(int var1, int var2, Period var3) {
        try {
            ReceiptRecordCriteria var4 = new ReceiptRecordCriteria(ReceiptRecordVat.class, var3, RecordType.VAT, OrderType.DESC, var1, var2);
            ValueContainer2 var5 = this.getModelManager().HJY(this.getParentDefinition(), var4);
            return var5;
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            throw new FFI(var6);
        }
    }

    public SortedMap<String, SortedSet<MonthType>> getPossibleDates() throws FFK, FFO {
        ModelBusinessPeriodElementTypedCriteria var1 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, null, SettlementType.VAT, null);
        ValueContainer2 var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
        TreeMap var3 = new TreeMap();
        Iterator var6 = ((List) var2.getSecondValue()).iterator();

        while (var6.hasNext()) {
            ParametrizedModel var7 = (ParametrizedModel) var6.next();
            Period var8 = var7.getPeriod();
            if (!var8.equals(Period.AOE)) {
                String var4 = String.valueOf(var8.getYear().getValue());
                String var5 = String.valueOf(var8.getMonth().getValue());
                if (var3.get(var4) == null) {
                    var3.put(var4, new TreeSet());
                }

                ((SortedSet) var3.get(var4)).add(MonthType.getMonthByIntValue(Integer.valueOf(var5)));
            }
        }

        return var3;
    }

    public boolean HWH(Date var1) throws FFK, FFO {

        boolean var7;
        Period var2 = new Period(var1);
        ModelBusinessPeriodElementTypedCriteria var3 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, var2, SettlementType.VAT, null);
        ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var5 = ((List) var4.getSecondValue()).iterator();
        if (!var5.hasNext()) {
            boolean var11 = false;
            return var11;
        }

        ParametrizedModel var6 = (ParametrizedModel) var5.next();
        var7 = SettlementStatus.SETTLED.equals(((Settlement) var6.getModelBaseElementWithIdObject()).getSettlementStatus());

        return var7;
    }

    public void QOS(ReceiptRecordVat var1) throws FFK, FFO {

        if (var1 == null) {
            throw FCZ.getInstance().QNZ();
        }

        this.getModelManager().HKC(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }
}
