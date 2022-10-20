package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldAndConstantString extends ConditionOnFieldAndConstantAbstract<String> {
    private ConditionOnFieldAndConstantString() {

    }

    public ConditionOnFieldAndConstantString(ActionType var1, String var2, ConditionType var3, String var4) {
        super(var1, var2, var3, var4);

    }

    public ValueContainer2<ActionResult, String> AICX(BaseField var1) {

        ValueContainer2 var4;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + this.AHUG);
        String var2 = var1.getValue();
        boolean var3 = false;
        switch (this.AHUF) {
            case EQUALS:
                var3 = this.AHUG.equals(var2);
                break;
            case EQUALS_IGNORE_CASE:
                var3 = this.AHUG.equalsIgnoreCase(var2);
                break;
            default:
                throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
        }

        if (!var3) {
            var4 = null;
            ActionResult var9;
            switch (this.AHTY) {
                case WARNING:
                    var9 = ActionResult.WARNING;
                    break;
                case ERROR:
                    var9 = ActionResult.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            ValueContainer2 var5 = new ValueContainer2(var9, this.AIDB("", var1));
            return var5;
        }

        var4 = new ValueContainer2(ActionResult.SUCCESS, null);

        return var4;
    }
}
