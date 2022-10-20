package a.a.a.c.c.e.h.c;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.e.h.b.ETU;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.f.a.ReceiptRecord;
import a.a.a.c.f.a.f.a.IQ;
import a.a.a.c.f.a.f.a.IR;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JD;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.KH;
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

    public ValueContainer2<Integer, List<EDF<IR>>> getReceiptRecords(int var1, int var2, Period var3) {
        try {
            JD var4 = new JD(IR.class, var3, IQ.VAT, OrderType.DESC, var1, var2);
            ValueContainer2 var5 = this.getModelManager().HJY(this.getParentDefinition(), var4);
            return var5;
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            throw new FFI(var6);
        }
    }

    public SortedMap<String, SortedSet<KH>> getPossibleDates() throws FFK, FFO {
        IY var1 = new IY(Settlement.class, null, JH.VAT, null);
        ValueContainer2 var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
        TreeMap var3 = new TreeMap();
        Iterator var6 = ((List) var2.getSecondValue()).iterator();

        while (var6.hasNext()) {
            EDF var7 = (EDF) var6.next();
            Period var8 = var7.getPeriod();
            if (!var8.equals(Period.AOE)) {
                String var4 = String.valueOf(var8.getYear().getValue());
                String var5 = String.valueOf(var8.getMonth().getValue());
                if (var3.get(var4) == null) {
                    var3.put(var4, new TreeSet());
                }

                ((SortedSet) var3.get(var4)).add(KH.getMonthByIntValue(Integer.valueOf(var5)));
            }
        }

        return var3;
    }

    public boolean HWH(Date var1) throws FFK, FFO {

        boolean var7;
        Period var2 = new Period(var1);
        IY var3 = new IY(Settlement.class, var2, JH.VAT, null);
        ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var5 = ((List) var4.getSecondValue()).iterator();
        if (!var5.hasNext()) {
            boolean var11 = false;
            return var11;
        }

        EDF var6 = (EDF) var5.next();
        var7 = JG.SETTLED.equals(((Settlement) var6.getModelBaseElementWithIdObject()).getSettlementStatus());

        return var7;
    }

    public void QOS(IR var1) throws FFK, FFO {

        if (var1 == null) {
            throw FCZ.getInstance().QNZ();
        }

        this.getModelManager().HKC(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }
}
