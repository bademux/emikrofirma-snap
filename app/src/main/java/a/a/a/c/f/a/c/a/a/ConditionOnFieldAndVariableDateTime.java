package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import a.a.a.c.f.a.c.a.f.VariableDateTime;
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
public class ConditionOnFieldAndVariableDateTime extends ConditionOnFieldAndVariableAbstract<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHUZ;
    private final transient SimpleDateFormat AHVA;
    private final transient SimpleDateFormat AHVB;
    private final transient SimpleDateFormat AHVC;
    private final transient SimpleDateFormat AHVD;

    private ConditionOnFieldAndVariableDateTime() {

        this.AHUZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        this.AHVA = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHVB = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHVC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHVD = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ConditionOnFieldAndVariableDateTime(ActionType var1, String var2, ConditionType var3, VariableDateTime var4) {
        super(var1, var2, var3, var4);

        this.AHUZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        this.AHVA = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHVB = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHVC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHVD = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ValueContainer2<AHCI, String> AICX(BaseField var1) {

        ValueContainer2 var10;
        try {
            log.debug("field " + var1);
            log.debug("conditionType " + this.AHUF);
            log.debug("variable " + this.AHUP);
            String var2 = var1.getValue();
            log.debug("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            log.debug("fieldValueTrimed " + var3);
            Date var4 = null;

            try {
                var4 = this.AHUZ.parse(var3);
            } catch (ParseException var21) {
                log.warn("Something bad happened", var21);

                try {
                    var4 = this.AHVA.parse(var3);
                } catch (ParseException var20) {
                    log.warn("Something bad happened", var20);

                    try {
                        var4 = this.AHVB.parse(var3);
                    } catch (ParseException var19) {
                        log.warn("Something bad happened", var19);

                        try {
                            var4 = this.AHVC.parse(var3);
                        } catch (ParseException var18) {
                            log.warn("Something bad happened", var18);
                            var4 = this.AHVD.parse(var3);
                        }
                    }
                }
            }

            XMLGregorianCalendar var5 = this.AICS(var4);
            XMLGregorianCalendar var6 = this.AHUP.getValue();
            int var7 = this.AICU(var6, var5);
            boolean var8 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var8 = var7 == 0;
                    break;
                case GREATER:
                    var8 = var7 < 0;
                    break;
                case GREATER_OR_EQUAL:
                    var8 = var7 <= 0;
                    break;
                case LESSER:
                    var8 = var7 > 0;
                    break;
                case LESSER_OR_EQUAL:
                    var8 = var7 >= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (var8) {
                ValueContainer2 var24 = new ValueContainer2(AHCI.SUCCESS, null);
                return var24;
            }

            AHCI var9 = null;
            switch (this.AHTY) {
                case WARNING:
                    var9 = AHCI.WARNING;
                    break;
                case ERROR:
                    var9 = AHCI.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            var10 = new ValueContainer2(var9, this.AIDB("", var1));
        } catch (DatatypeConfigurationException | ParseException var22) {
            log.error("Something bad happened", var22);
            throw new FFI(var22);
        }

        return var10;
    }
}
