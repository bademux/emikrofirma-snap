package a.a.a.c.c.a.b;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.c.b.EMB;
import a.a.a.c.d.b.EQB;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.d.DeclarationJPK;
import a.a.a.c.f.a.d.DeclarationStatus;
import a.a.a.c.f.a.d.DateType;
import a.a.a.c.f.a.e.BaseInvoiceSell;
import a.a.a.c.f.a.e.InvoiceType;
import a.a.a.c.f.a.g.InvoiceCriteria;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.a.InvoiceState;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.c.FCZ;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public abstract class ELW extends ELV {
    public ELW() {
        throw new FFI("Must be overridden!");
    }

    protected ELW(String var1) {
        super(var1);
    }

    public boolean HHM(DeclarationJPK var1) throws FFK, FFO {

        boolean var5;
        boolean var2 = false;
        DeclarationStatus var3 = var1.getDeclarationStatus();
        EQB.SendoutStatus var4 = EQB.HPX(var1);
        if (var4 != EQB.SendoutStatus.SUCCESS) {
            throw FCZ.getInstance().QGS();
        }

        if (!var3.equals(var1.getDeclarationStatus())) {
            var2 = true;
        }

        this.getModelManager().HKB(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());
        var5 = var2;

        return var5;
    }

    public List<BaseInvoiceSell> getInvoicesByDateAndNip(DateType var1, LocalDate var2, LocalDate var3, Nip var4) throws FFK, FFO {

        ArrayList var5 = new ArrayList();
        InvoiceCriteria var6;
        switch (var1) {
            case CREATION_DATE:
                var6 = new InvoiceCriteria(BaseInvoiceSell.class, InvoiceState.ACTIVE, null, InvoiceType.SELL, null, null, null, var4, new ValueContainer2(Date.from(var2.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(var3.atStartOfDay(ZoneId.systemDefault()).toInstant())), null, null, OrderType.ASC, null, null);
                break;
            case TRANSACTION_DATE:
                var6 = new InvoiceCriteria(BaseInvoiceSell.class, InvoiceState.ACTIVE, null, InvoiceType.SELL, null, null, null, var4, null, new ValueContainer2(Date.from(var2.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(var3.atStartOfDay(ZoneId.systemDefault()).toInstant())), null, OrderType.ASC, null, null);
                break;
            default:
                throw new FFI("not known date search type");
        }

        ValueContainer2 var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
        Iterator var8 = ((List) var7.getSecondValue()).iterator();

        while (var8.hasNext()) {
            ParametrizedModel var9 = (ParametrizedModel) var8.next();
            var5.add(var9.getModelBaseElementWithIdObject());
        }

        ArrayList var13 = var5;
        return var13;
    }

    public Nip QOX() {

        Nip var2;
        try {
            UserData var1 = EMB.getInstance().HHV();
            if (var1 == null || var1.getNip() == null) {
                var2 = null;
                return var2;
            }

            var2 = var1.getNip();
        } catch (FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            var2 = null;
            return var2;
        }

        return var2;
    }
}
