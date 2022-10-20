package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import a.a.a.c.f.a.c.a.f.VariableInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldAndVariableInteger extends ConditionOnFieldAndVariableAbstract<Integer> {
    private ConditionOnFieldAndVariableInteger() {

    }

    public ConditionOnFieldAndVariableInteger(ActionType var1, String var2, ConditionType var3, VariableInteger var4) {
        super(var1, var2, var3, var4);

    }

    public ValueContainer2<ActionResult, String> AICX(BaseField var1) {

        ValueContainer2 var8;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("variable " + this.AHUP);
        String var2 = var1.getValue();
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValue " + var2);
        String var3 = var2 != null ? var2.trim() : "";
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValueTrimed " + var3);
        Integer var4 = Integer.valueOf(var3);
        Integer var5 = this.AHUP.getValue();
        boolean var6 = false;
        switch (this.AHUF) {
            case EQUALS:
                var6 = var5.equals(var4);
                break;
            case GREATER:
                var6 = var4 > var5;
                break;
            case GREATER_OR_EQUAL:
                var6 = var4 >= var5;
                break;
            case LESSER:
                var6 = var4 < var5;
                break;
            case LESSER_OR_EQUAL:
                var6 = var4 <= var5;
                break;
            default:
                throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
        }

        if (var6) {
            ValueContainer2 var12 = new ValueContainer2(ActionResult.SUCCESS, null);
            return var12;
        }

        ActionResult var7 = null;
        switch (this.AHTY) {
            case WARNING:
                var7 = ActionResult.WARNING;
                break;
            case ERROR:
                var7 = ActionResult.ERROR;
                break;
            default:
                throw new FFI("Invalid actionType [" + this.AHTY + "]!");
        }

        var8 = new ValueContainer2(var7, this.AIDB("", var1));

        return var8;
    }
}
