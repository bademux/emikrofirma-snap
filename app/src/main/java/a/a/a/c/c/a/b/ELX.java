package a.a.a.c.c.a.b;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.a.h.SettlementType;
import a.a.a.c.f.b.EZT;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ELX extends ELV {
    public ELX() {
        throw new FFI("Must be overridden!");
    }

    protected ELX(String var1) {
        super(var1);
    }

    public List<EZT> getRangesWhereSettled(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            ModelBusinessPeriodElementTypedCriteria var3 = new ModelBusinessPeriodElementTypedCriteria(Settlement.class, null, SettlementType.VAT, null);
            ValueContainer2 var18 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            Iterator var5 = ((List) var18.getSecondValue()).iterator();

            while (var5.hasNext()) {
                ParametrizedModel var6 = (ParametrizedModel) var5.next();
                Settlement var7 = (Settlement) var6.getModelBaseElementWithIdObject();
                if (var7.getSettlementStatus().equals(SettlementStatus.SETTLED)) {
                    LocalDate var8 = LocalDate.of(var7.getPeriod().getYear().getValue(), var7.getPeriod().getMonth().getValue(), 1);
                    LocalDate var9 = LocalDate.of(var7.getPeriod().getYear().getValue(), var7.getPeriod().getMonth().getValue(), var8.lengthOfMonth());
                    EZT var10 = new EZT(var8, var9, var1, false);
                    var2.add(var10);
                }
            }

            ArrayList var19 = var2;
            return var19;
        } catch (FFK var15) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var15);
            var4 = var2;
            return var4;
        } catch (FFO var16) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var16);
            var4 = var2;
        }

        return var4;
    }
}
