package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@XmlAccessorType(XmlAccessType.FIELD)
public class ConditionOnFieldAndConstantDateTime extends ConditionOnFieldAndConstantAbstract<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHUI;
    private final transient SimpleDateFormat AHUJ;
    private final transient SimpleDateFormat AHUK;
    private final transient SimpleDateFormat AHUL;
    private final transient SimpleDateFormat AHUM;

    private ConditionOnFieldAndConstantDateTime() {

        this.AHUI = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        this.AHUJ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHUK = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHUL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHUM = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ConditionOnFieldAndConstantDateTime(ActionType var1, String var2, ConditionType var3, XMLGregorianCalendar var4) {
        super(var1, var2, var3, var4);

        this.AHUI = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        this.AHUJ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHUK = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHUL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHUM = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ValueContainer2<ActionResult, String> AICX(BaseField var1) {

        ValueContainer2 var8;
        try {
            log.debug("field " + var1);
            log.debug("conditionType " + this.AHUF);
            log.debug("value " + this.AHUG);
            String var2 = var1.getValue();
            log.debug("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            log.debug("fieldValueTrimed " + var3);
            Date var4 = null;

            try {
                var4 = this.AHUI.parse(var3);
            } catch (ParseException var20) {
                log.warn("Something bad happened", var20);

                try {
                    var4 = this.AHUJ.parse(var3);
                } catch (ParseException var19) {
                    log.warn("Something bad happened", var19);

                    try {
                        var4 = this.AHUK.parse(var3);
                    } catch (ParseException var18) {
                        log.warn("Something bad happened", var18);

                        try {
                            var4 = this.AHUL.parse(var3);
                        } catch (ParseException var17) {
                            log.warn("Something bad happened", var17);
                            var4 = this.AHUM.parse(var3);
                        }
                    }
                }
            }

            XMLGregorianCalendar var5 = this.AICS(var4);
            int var6 = this.AICU(this.AHUG, var5);
            boolean var7 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var7 = var6 == 0;
                    break;
                case GREATER:
                    var7 = var6 < 0;
                    break;
                case GREATER_OR_EQUAL:
                    var7 = var6 <= 0;
                    break;
                case LESSER:
                    var7 = var6 > 0;
                    break;
                case LESSER_OR_EQUAL:
                    var7 = var6 >= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (!var7) {
                var8 = null;
                ActionResult var23;
                switch (this.AHTY) {
                    case WARNING:
                        var23 = ActionResult.WARNING;
                        break;
                    case ERROR:
                        var23 = ActionResult.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                ValueContainer2 var9 = new ValueContainer2(var23, this.AIDB("", var1));
                return var9;
            }

            var8 = new ValueContainer2(ActionResult.SUCCESS, null);
        } catch (DatatypeConfigurationException | ParseException var21) {
            log.error("Something bad happened", var21);
            throw new FFI(var21);
        }

        return var8;
    }
}
