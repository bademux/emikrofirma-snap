package a.a.a.c.d.a.b;

import a.a.a.c.f.a.b.CustomActionClass;
import a.a.a.c.f.a.c.a.b.Constant;
import a.a.a.c.f.a.c.a.c.FieldType;
import a.a.a.c.f.a.c.a.c.BaseField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class EPT implements CustomActionClass<Map<FieldType, BaseField>> {
    private final Constant<BigDecimal> FUF;
    private final FieldType FUG;
    private final FieldType FUH;
    private BigDecimal FUI;

    public EPT(Constant<BigDecimal> var1, String var2, String var3) {

        this.FUF = var1;
        this.FUG = FieldType.valueOf(var2);
        this.FUH = FieldType.valueOf(var3);

    }

    public boolean AIBY(Map<FieldType, BaseField> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("constantTax " + this.FUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueFieldName " + this.FUG);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueFieldName " + this.FUH);

        boolean var4;
        this.FUI = null;
        BaseField var2 = var1.get(this.FUG);
        BaseField var3 = var1.get(this.FUH);
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

    public String getContextString(Map<FieldType, BaseField> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("constantTax " + this.FUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueFieldName " + this.FUG);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueFieldName " + this.FUH);

        String var4;
        BaseField var2 = var1.get(this.FUG);
        BaseField var3 = var1.get(this.FUH);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("netValueField " + var2);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("taxValueField " + var3);
        var4 = this.FUG + " (" + var2.getValue() + ") * [" + this.FUF.getValue() + "%] = " + this.FUI + " | " + this.FUH + " (" + var3.getValue() + ")";

        return var4;
    }
}
