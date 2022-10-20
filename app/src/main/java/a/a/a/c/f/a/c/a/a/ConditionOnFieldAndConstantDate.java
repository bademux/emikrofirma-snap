package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldAndConstantDate extends ConditionOnFieldAndConstantAbstract<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHUH;

    private ConditionOnFieldAndConstantDate() {

        this.AHUH = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ConditionOnFieldAndConstantDate(ActionType var1, String var2, ConditionType var3, XMLGregorianCalendar var4) {
        super(var1, var2, var3, var4);

        this.AHUH = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ValueContainer2<ActionResult, String> AICX(BaseField var1) {

        ValueContainer2 var8;
        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + this.AHUG);
            String var2 = var1.getValue();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValueTrimed " + var3);
            Date var4 = this.AHUH.parse(var3);
            XMLGregorianCalendar var5 = this.AICS(var4);
            boolean var6 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var6 = this.AICU(this.AHUG, var5) == 0;
                    break;
                case GREATER:
                    var6 = this.AICU(this.AHUG, var5) < 0;
                    break;
                case GREATER_OR_EQUAL:
                    var6 = this.AICU(this.AHUG, var5) <= 0;
                    break;
                case LESSER:
                    var6 = this.AICU(this.AHUG, var5) > 0;
                    break;
                case LESSER_OR_EQUAL:
                    var6 = this.AICU(this.AHUG, var5) >= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (var6) {
                ValueContainer2 var14 = new ValueContainer2(ActionResult.SUCCESS, null);
                return var14;
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
        } catch (DatatypeConfigurationException | ParseException var12) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
            throw new FFI(var12);
        }

        return var8;
    }
}
