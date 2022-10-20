package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldAndConstantBigDecimal extends ConditionOnFieldAndConstantAbstract<BigDecimal> {
    private ConditionOnFieldAndConstantBigDecimal() {

    }

    public ConditionOnFieldAndConstantBigDecimal(ActionType var1, String var2, ConditionType var3, BigDecimal var4) {
        super(var1, var2, var3, var4);

    }

    public ValueContainer2<AHCI, String> AICX(BaseField var1) {

        ValueContainer2 var6;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + this.AHUG);
        String var2 = var1.getValue();
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValue " + var2);
        String var3 = var2 != null ? var2.trim() : "";
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValueTrimed " + var3);
        BigDecimal var4 = new BigDecimal(var3);
        boolean var5 = false;
        switch (this.AHUF) {
            case EQUALS:
                var5 = var4.compareTo(this.AHUG) == 0;
                break;
            case NOT_EQUALS:
                var5 = var4.compareTo(this.AHUG) != 0;
                break;
            case GREATER:
                var5 = var4.compareTo(this.AHUG) > 0;
                break;
            case GREATER_OR_EQUAL:
                var5 = var4.compareTo(this.AHUG) >= 0;
                break;
            case LESSER:
                var5 = var4.compareTo(this.AHUG) < 0;
                break;
            case LESSER_OR_EQUAL:
                var5 = var4.compareTo(this.AHUG) <= 0;
                break;
            default:
                throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
        }

        if (!var5) {
            var6 = null;
            AHCI var11;
            switch (this.AHTY) {
                case WARNING:
                    var11 = AHCI.WARNING;
                    break;
                case ERROR:
                    var11 = AHCI.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            ValueContainer2 var7 = new ValueContainer2(var11, this.AIDB("", var1));
            return var7;
        }

        var6 = new ValueContainer2(AHCI.SUCCESS, null);

        return var6;
    }
}
