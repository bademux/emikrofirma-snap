package a.a.a.c.c.d.g;

import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.e.a.d.ThreeValueBox;
import a.a.a.c.f.a.e.*;
import a.a.a.c.f.b.c.a.KL;
import a.a.a.c.g.c.FCZ;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EOZ {
    private EOZ() {
    }

    public static boolean HOD(EDF<HY> var0) {
        return var0.getParentWrapperWithCanceledState() != null;
    }

    public static boolean HOD(HN<?> var0) {
        return var0.getInvoiceSubType().equals(IA.CORRECTION);
    }

    public static boolean HOD(EPA<HY> var0) {
        return HOD(var0.getInvoiceWrapper());
    }

    public static HU getOriginalInvoice(HN<HQ> var0) throws FFO {
        if (var0.getParentInvoiceOnlyActive() == null) {
            throw FCZ.getInstance().IHN();
        } else {
            HN var1;
            for (var1 = var0; var1.getParentInvoiceOnlyActive() != null; var1 = var1.getParentInvoiceOnlyActive()) {
            }

            return (HU) var1;
        }
    }

    public static Map<KL, ThreeValueBox<BigDecimal, BigDecimal, BigDecimal>> getTaxRateSummaryDiffForCorrection(HV var0) {

        HN var1 = var0.getParentInvoiceOnlyActive();
        HashMap var2 = new HashMap();
        Iterator var3 = var0.getSumOfAmountsDividedByTaxRate().iterator();
        Iterator var4 = var0.getAmountOfTaxDividedByTaxRate().iterator();
        Iterator var5 = var0.getSumOfGrossAmountsDividedByTaxRate().iterator();

        TwoValueBox var6;
        TwoValueBox var7;
        TwoValueBox var8;
        while (var3.hasNext()) {
            var6 = (TwoValueBox) var3.next();
            var7 = (TwoValueBox) var4.next();
            var8 = (TwoValueBox) var5.next();
            var2.put(var6.getFirstValue(), new ThreeValueBox(var6.getSecondValue(), var7.getSecondValue(), var8.getSecondValue()));
        }

        var3 = var1.getSumOfAmountsDividedByTaxRate().iterator();
        var4 = var1.getAmountOfTaxDividedByTaxRate().iterator();
        var5 = var1.getSumOfGrossAmountsDividedByTaxRate().iterator();

        while (var3.hasNext()) {
            var6 = (TwoValueBox) var3.next();
            var7 = (TwoValueBox) var4.next();
            var8 = (TwoValueBox) var5.next();
            if (var2.get(var6.getFirstValue()) == null) {
                var2.put(var6.getFirstValue(), new ThreeValueBox(EQY.HRJ(BigDecimal.ZERO, (BigDecimal) var6.getSecondValue()), EQY.HRJ(BigDecimal.ZERO, (BigDecimal) var7.getSecondValue()), EQY.HRJ(BigDecimal.ZERO, (BigDecimal) var8.getSecondValue())));
            } else {
                ((ThreeValueBox) var2.get(var6.getFirstValue())).setFirstValue(EQY.HRJ((BigDecimal) ((ThreeValueBox) var2.get(var6.getFirstValue())).getFirstValue(), (BigDecimal) var6.getSecondValue()));
                ((ThreeValueBox) var2.get(var6.getFirstValue())).setSecondValue(EQY.HRJ((BigDecimal) ((ThreeValueBox) var2.get(var6.getFirstValue())).getSecondValue(), (BigDecimal) var7.getSecondValue()));
                ((ThreeValueBox) var2.get(var6.getFirstValue())).setThirdValue(EQY.HRJ((BigDecimal) ((ThreeValueBox) var2.get(var6.getFirstValue())).getThirdValue(), (BigDecimal) var8.getSecondValue()));
            }
        }

        HashMap var12 = var2;
        return var12;
    }
}
