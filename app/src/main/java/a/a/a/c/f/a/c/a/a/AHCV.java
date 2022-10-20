package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.Field;
import a.a.a.c.f.a.c.a.f.AHEO;
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
public class AHCV extends ConditionOnFieldAndVariableOffsetAbstract<XMLGregorianCalendar, Long> {
    private final transient SimpleDateFormat AHUS;
    private final transient SimpleDateFormat AHUT;
    private final transient SimpleDateFormat AHUU;
    private final transient SimpleDateFormat AHUV;
    private final transient SimpleDateFormat AHUW;

    private AHCV() {

        this.AHUS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        this.AHUT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHUU = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHUV = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHUW = new SimpleDateFormat("yyyy-MM-dd");

    }

    public AHCV(AHCJ var1, String var2, AHDG var3, AHEO var4, Long var5) {
        super(var1, var2, var3, var4, var5);

        this.AHUS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        this.AHUT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHUU = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHUV = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHUW = new SimpleDateFormat("yyyy-MM-dd");

    }

    public ValueContainer2<AHCI, String> AICX(Field var1) {

        ValueContainer2 var10;
        try {
            log.debug("field " + var1);
            log.debug("conditionType " + this.AHUF);
            log.debug("variable " + this.AHUQ);
            log.debug("offset " + this.AHUR);
            String var2 = var1.getValue();
            log.debug("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            log.debug("fieldValueTrimed " + var3);
            Date var4 = null;

            try {
                var4 = this.AHUS.parse(var3);
            } catch (ParseException var22) {
                log.warn("Something bad happened", var22);

                try {
                    var4 = this.AHUT.parse(var3);
                } catch (ParseException var21) {
                    log.warn("Something bad happened", var21);

                    try {
                        var4 = this.AHUU.parse(var3);
                    } catch (ParseException var20) {
                        log.warn("Something bad happened", var20);

                        try {
                            var4 = this.AHUV.parse(var3);
                        } catch (ParseException var19) {
                            log.warn("Something bad happened", var19);
                            var4 = this.AHUW.parse(var3);
                        }
                    }
                }
            }

            XMLGregorianCalendar var5 = this.AICS(var4);
            XMLGregorianCalendar var6 = this.AHUQ.getValue();
            XMLGregorianCalendar var7 = (XMLGregorianCalendar) var6.clone();
            var7.add(this.AICT(this.AHUR));
            int var8 = this.AICU(var7, var5);
            boolean var9 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var9 = var8 == 0;
                    break;
                case GREATER:
                    var9 = var8 < 0;
                    break;
                case GREATER_OR_EQUAL:
                    var9 = var8 <= 0;
                    break;
                case LESSER:
                    var9 = var8 > 0;
                    break;
                case LESSER_OR_EQUAL:
                    var9 = var8 >= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (!var9) {
                var10 = null;
                AHCI var25;
                switch (this.AHTY) {
                    case WARNING:
                        var25 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var25 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                ValueContainer2 var11 = new ValueContainer2(var25, this.AIDB("", var1));
                return var11;
            }

            var10 = new ValueContainer2(AHCI.SUCCESS, null);
        } catch (DatatypeConfigurationException | ParseException var23) {
            log.error("Something bad happened", var23);
            throw new FFI(var23);
        }

        return var10;
    }
}
