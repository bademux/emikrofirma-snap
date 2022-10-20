package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import a.a.a.c.f.a.c.a.f.VariableBigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldAndVariableBigDecimal extends ConditionOnFieldAndVariableAbstract<BigDecimal> {
    private ConditionOnFieldAndVariableBigDecimal() {

    }

    public ConditionOnFieldAndVariableBigDecimal(ActionType var1, String var2, ConditionType var3, VariableBigDecimal var4) {
        super(var1, var2, var3, var4);

    }

    public ValueContainer2<ActionResult, String> AICX(BaseField var1) {

        ValueContainer2 var7;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("variable " + this.AHUP);
        String var2 = var1.getValue();
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValue " + var2);
        String var3 = var2 != null ? var2.trim() : "";
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValueTrimed " + var3);
        BigDecimal var4 = new BigDecimal(var3);
        BigDecimal var5 = this.AHUP.getValue();
        boolean var6 = false;
        switch (this.AHUF) {
            case EQUALS:
                var6 = var4.compareTo(var5) == 0;
                break;
            case GREATER:
                var6 = var4.compareTo(var5) > 0;
                break;
            case GREATER_OR_EQUAL:
                var6 = var4.compareTo(var5) >= 0;
                break;
            case LESSER:
                var6 = var4.compareTo(var5) < 0;
                break;
            case LESSER_OR_EQUAL:
                var6 = var4.compareTo(var5) <= 0;
                break;
            default:
                throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
        }

        if (!var6) {
            var7 = null;
            ActionResult var12;
            switch (this.AHTY) {
                case WARNING:
                    var12 = ActionResult.WARNING;
                    break;
                case ERROR:
                    var12 = ActionResult.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            ValueContainer2 var8 = new ValueContainer2(var12, this.AIDB("", var1));
            return var8;
        }

        var7 = new ValueContainer2(ActionResult.SUCCESS, null);

        return var7;
    }
}
