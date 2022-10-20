package a.a.a.c.c.e.o.c;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.QVI;
import a.a.a.c.c.d.n.QVB;
import a.a.a.c.c.e.o.b.QTT;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.g.InvoiceOtherCriteria;
import a.a.a.c.f.a.n.InvoiceOtherPurchase;
import a.a.a.c.f.a.n.InvoiceOtherType;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.InvoiceState;
import a.a.a.c.g.c.FCZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QTU extends QVI {
    public QTU() {
        super(QTT.RBR.getProcessName());

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

    public List<QVB<InvoiceOtherPurchase>> getInvoicesOtherPurchase(Integer var1, Integer var2, String var3, InvoiceState var4) throws FFK, FFO {

        ArrayList var15;
        Period var5 = null;
        if (var1 != null && var2 != null) {
            var5 = new Period(var1, var2);
        }

        if (var3 != null && var1 != null) {
            var5 = new Period(var1, null);
        }

        InvoiceOtherCriteria var6 = new InvoiceOtherCriteria(InvoiceOtherPurchase.class, var4, var5, InvoiceOtherType.PURCHASE, null, null, var3, OrderType.DESC);
        ValueContainer2 var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
        ArrayList var8 = new ArrayList();
        if (var7 != null) {
            int var9 = 0;
            Iterator var10 = ((List) var7.getSecondValue()).iterator();

            while (var10.hasNext()) {
                EDF var11 = (EDF) var10.next();
                ++var9;
                var8.add(new QVB(var11, var9));
            }
        }

        var15 = var8;

        return var15;
    }

    public void RLU(InvoiceOtherPurchase var1) throws FFK, FFO {

        if (var1 == null) {
            throw FCZ.getInstance().QNZ();
        }

        this.getModelManager().HKC(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }
}
