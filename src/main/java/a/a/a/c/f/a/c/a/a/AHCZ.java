package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCZ extends AHCT<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHUZ;
    private final transient SimpleDateFormat AHVA;
    private final transient SimpleDateFormat AHVB;
    private final transient SimpleDateFormat AHVC;
    private final transient SimpleDateFormat AHVD;

    private AHCZ() {
        EXF.getInstance().ICO();

        try {
            this.AHUZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHVA = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHVB = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHVC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHVD = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCZ(AHCJ var1, String var2, AHDG var3, AHEO var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();

        try {
            this.AHUZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHVA = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHVB = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHVC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHVD = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        EVZ var10;
        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            EXF.getInstance().ICK("variable " + this.AHUP);
            String var2 = var1.getValue();
            EXF.getInstance().ICK("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            EXF.getInstance().ICK("fieldValueTrimed " + var3);
            Date var4 = null;

            try {
                var4 = this.AHUZ.parse(var3);
            } catch (ParseException var21) {
                EXF.getInstance().ICI(var21);

                try {
                    var4 = this.AHVA.parse(var3);
                } catch (ParseException var20) {
                    EXF.getInstance().ICI(var20);

                    try {
                        var4 = this.AHVB.parse(var3);
                    } catch (ParseException var19) {
                        EXF.getInstance().ICI(var19);

                        try {
                            var4 = this.AHVC.parse(var3);
                        } catch (ParseException var18) {
                            EXF.getInstance().ICI(var18);
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
                EVZ var24 = new EVZ(AHCI.SUCCESS, null);
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

            var10 = new EVZ(var9, this.AIDB("", var1));
        } catch (DatatypeConfigurationException | ParseException var22) {
            EXF.getInstance().ICA(var22);
            throw new FFI(var22);
        } finally {
            EXF.getInstance().ICP();
        }

        return var10;
    }
}
