package a.a.a.c.c.a.b;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.MonthType;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public abstract class QVI extends ELV {
    private boolean RHE = false;

    protected QVI(String var1) {
        super(var1);
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
                if (Integer.valueOf(var4) >= 0 && Integer.valueOf(var5) >= 0) {
                    if (var3.get(var4) == null) {
                        var3.put(var4, new TreeSet());
                    }

                    ((SortedSet) var3.get(var4)).add(MonthType.getMonthByIntValue(Integer.valueOf(var5)));
                }
            } else {
                this.RHE = true;
            }
        }

        return var3;
    }

    public boolean RKH() {
        return this.RHE;
    }

    public SettlementStatus getSettlementStatus(LocalDate var1) throws FFK, FFO {

        SettlementStatus var7;
        Period var2 = new Period(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        ModelBusinessPeriodElementTypedCriteria var3 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, var2, SettlementType.VAT, null);
        ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var5 = ((List) var4.getSecondValue()).iterator();
        if (!var5.hasNext()) {
            return null;
        }

        ParametrizedModel var6 = (ParametrizedModel) var5.next();
        var7 = ((Settlement) var6.getModelBaseElementWithIdObject()).getSettlementStatus();

        return var7;
    }

    public boolean RKI(Period var1) throws FFK, FFO {

        boolean var3;
        SettlementStatus var2 = this.getSettlementStatus(var1);
        if (var2 == SettlementStatus.SETTLED) {
            var3 = true;
            return var3;
        }

        var3 = false;

        return var3;
    }

    public SettlementStatus getSettlementStatus(Period var1) throws FFK, FFO {

        Iterator var4;
        ModelBusinessPeriodElementTypedCriteria var2 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, var1, SettlementType.VAT, null);
        ValueContainer2 var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
        if (((List) var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        var4 = ((List) var3.getSecondValue()).iterator();
        if (var4.hasNext()) {
            ParametrizedModel var5 = (ParametrizedModel) var4.next();
            SettlementStatus var6 = ((Settlement) var5.getModelBaseElementWithIdObject()).getSettlementStatus();
            return var6;
        }

        return null;
    }
}
