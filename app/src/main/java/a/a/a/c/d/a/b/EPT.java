package a.a.a.c.d.a.b;

import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.b.Constant;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.Field;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class EPT implements AHCB<Map<AHDS, Field>> {
    private final Constant<BigDecimal> FUF;
    private final AHDS FUG;
    private final AHDS FUH;
    private BigDecimal FUI;

    public EPT(Constant<BigDecimal> var1, String var2, String var3) {

        this.FUF = var1;
        this.FUG = AHDS.valueOf(var2);
        this.FUH = AHDS.valueOf(var3);

    }

    public boolean AIBY(Map<AHDS, Field> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("constantTax " + this.FUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueFieldName " + this.FUG);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueFieldName " + this.FUH);

        boolean var4;
        this.FUI = null;
        Field var2 = var1.get(this.FUG);
        Field var3 = var1.get(this.FUH);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueField " + var2);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueField " + var3);
        if (this.FUF != null && this.FUF.getValue().compareTo(BigDecimal.ZERO) > 0 && var2 != null && var2.AIDH() && var3 != null && var3.AIDH()) {
            BigDecimal var9 = (new BigDecimal(var2.getValue())).multiply(this.FUF.getValue()).divide(BigDecimal.valueOf(100.0)).setScale(2, RoundingMode.HALF_UP);
            this.FUI = var9;
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("newTaxValue " + var9);
            boolean var5 = var9.compareTo(new BigDecimal(var3.getValue())) == 0;
            return var5;
        }

        var4 = true;

        return var4;
    }

    public String getContextString(Map<AHDS, Field> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("constantTax " + this.FUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueFieldName " + this.FUG);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueFieldName " + this.FUH);

        String var4;
        Field var2 = var1.get(this.FUG);
        Field var3 = var1.get(this.FUH);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueField " + var2);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueField " + var3);
        var4 = this.FUG + " (" + var2.getValue() + ") * [" + this.FUF.getValue() + "%] = " + this.FUI + " | " + this.FUH + " (" + var3.getValue() + ")";

        return var4;
    }
}
