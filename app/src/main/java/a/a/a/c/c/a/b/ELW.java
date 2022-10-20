package a.a.a.c.c.a.b;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.b.EMB;
import a.a.a.c.d.b.EQB;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.d.DeclarationJPK;
import a.a.a.c.f.a.d.HL;
import a.a.a.c.f.a.d.QJY;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.e.IB;
import a.a.a.c.f.a.g.IU;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.a.QSW;
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
        HL var3 = var1.getDeclarationStatus();
        EQB.EQC var4 = EQB.HPX(var1);
        if (var4 != EQB.EQC.SUCCESS) {
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

    public List<HY> getInvoicesByDateAndNip(QJY var1, LocalDate var2, LocalDate var3, KA var4) throws FFK, FFO {

        ArrayList var5 = new ArrayList();
        IU var6;
        switch (var1) {
            case CREATION_DATE:
                var6 = new IU(HY.class, QSW.ACTIVE, null, IB.SELL, null, null, null, var4, new ValueContainer2(Date.from(var2.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(var3.atStartOfDay(ZoneId.systemDefault()).toInstant())), null, null, OrderType.ASC, null, null);
                break;
            case TRANSACTION_DATE:
                var6 = new IU(HY.class, QSW.ACTIVE, null, IB.SELL, null, null, null, var4, null, new ValueContainer2(Date.from(var2.atStartOfDay(ZoneId.systemDefault()).toInstant()), Date.from(var3.atStartOfDay(ZoneId.systemDefault()).toInstant())), null, OrderType.ASC, null, null);
                break;
            default:
                throw new FFI("not known date search type");
        }

        ValueContainer2 var7 = this.getModelManager().HJY(this.getParentDefinition(), var6);
        Iterator var8 = ((List) var7.getSecondValue()).iterator();

        while (var8.hasNext()) {
            EDF var9 = (EDF) var8.next();
            var5.add(var9.getModelBaseElementWithIdObject());
        }

        ArrayList var13 = var5;
        return var13;
    }

    public KA QOX() {

        KA var2;
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
