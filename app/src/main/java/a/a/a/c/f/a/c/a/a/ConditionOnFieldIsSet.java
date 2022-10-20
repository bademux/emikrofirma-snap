package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldIsSet extends ConditionOnFieldAbstract {
    public ConditionOnFieldIsSet() {

    }

    public ConditionOnFieldIsSet(ActionType var1, String var2) {
        super(var1, var2, ConditionType.ISSET);

    }

    public ValueContainer2<ActionResult, String> AICX(BaseField var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        boolean var2 = false;
        if (this.AHUF == ConditionType.ISSET) {
            var2 = var1.AIDH();
            if (var2) {
                ValueContainer2 var8 = new ValueContainer2(ActionResult.SUCCESS, null);
                return var8;
            } else {
                ActionResult var3 = null;
                switch (this.AHTY) {
                    case WARNING:
                        var3 = ActionResult.WARNING;
                        break;
                    case ERROR:
                        var3 = ActionResult.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                ValueContainer2 var4 = new ValueContainer2(var3, this.AIDB("", var1));
                return var4;
            }
        }
        throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
    }
}
