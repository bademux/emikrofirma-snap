package a.a.a.c.c.e.g.c;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.d.b.ENP;
import a.a.a.c.c.d.g.EPA;
import a.a.a.c.c.e.g.b.ETR;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.InvoicePurchase;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.g.c.FCZ;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ETS extends QVI {
    private final boolean GIW = false;

    public ETS() {
        super(ETR.GIV.getProcessName());

    }

    protected void HHI() {

    }

    protected void HHJ() {

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public JG getSettlementStatus(LocalDate var1) throws FFK, FFO {

        Iterator var5;
        Period var2 = new Period(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        IY var3 = new IY(Settlement.class, var2, JH.VAT, null);
        ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        var5 = ((List) var4.getSecondValue()).iterator();
        if (var5.hasNext()) {
            EDF var6 = (EDF) var5.next();
            JG var7 = ((Settlement) var6.getModelBaseElementWithIdObject()).getSettlementStatus();
            return var7;
        }

        return null;
    }

    public JG getSettlementStatus(Period var1) throws FFK, FFO {

        JG var6;
        IY var2 = new IY(Settlement.class, var1, JH.VAT, null);
        ValueContainer2 var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
        if (((List) var3.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var4 = ((List) var3.getSecondValue()).iterator();
        if (!var4.hasNext()) {
            return null;
        }

        EDF var5 = (EDF) var4.next();
        var6 = ((Settlement) var5.getModelBaseElementWithIdObject()).getSettlementStatus();

        return var6;
    }

    public List<EPA<InvoicePurchase>> getInvoices(ENP var1, Integer var2, Integer var3, String var4, String var5) throws FFK, FFO {

        ArrayList var15;
        IU var6 = new IU(InvoicePurchase.class, QSW.ACTIVE, new Period(var2, var3), IB.PURCHASE, null, null, var4, OrderType.DESC);
        ValueContainer2 var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
        ArrayList var8 = new ArrayList();
        if (var7 != null) {
            int var9 = 0;
            Iterator var10 = ((List) var7.getSecondValue()).iterator();

            while (var10.hasNext()) {
                EDF var11 = (EDF) var10.next();
                ++var9;
                var8.add(new EPA(var11, var9));
            }
        }

        var15 = var8;

        return var15;
    }

    public boolean RKH() {
        return this.GIW;
    }

    public void QPH(InvoicePurchase var1) throws FFK, FFO {

        if (var1 == null) {
            throw FCZ.getInstance().QNZ();
        }

        this.getModelManager().HKC(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }
}
