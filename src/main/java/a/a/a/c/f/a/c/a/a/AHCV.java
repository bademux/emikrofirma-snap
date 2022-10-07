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
public class AHCV extends AHCU<XMLGregorianCalendar, Long> {
    private final transient SimpleDateFormat AHUS;
    private final transient SimpleDateFormat AHUT;
    private final transient SimpleDateFormat AHUU;
    private final transient SimpleDateFormat AHUV;
    private final transient SimpleDateFormat AHUW;

    private AHCV() {
        EXF.getInstance().ICO();

        try {
            this.AHUS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHUT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHUU = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHUV = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHUW = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCV(AHCJ var1, String var2, AHDG var3, AHEO var4, Long var5) {
        super(var1, var2, var3, var4, var5);
        EXF.getInstance().ICO();

        try {
            this.AHUS = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHUT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHUU = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHUV = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHUW = new SimpleDateFormat("yyyy-MM-dd");
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
            EXF.getInstance().ICK("variable " + this.AHUQ);
            EXF.getInstance().ICK("offset " + this.AHUR);
            String var2 = var1.getValue();
            EXF.getInstance().ICK("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            EXF.getInstance().ICK("fieldValueTrimed " + var3);
            Date var4 = null;

            try {
                var4 = this.AHUS.parse(var3);
            } catch (ParseException var22) {
                EXF.getInstance().ICI(var22);

                try {
                    var4 = this.AHUT.parse(var3);
                } catch (ParseException var21) {
                    EXF.getInstance().ICI(var21);

                    try {
                        var4 = this.AHUU.parse(var3);
                    } catch (ParseException var20) {
                        EXF.getInstance().ICI(var20);

                        try {
                            var4 = this.AHUV.parse(var3);
                        } catch (ParseException var19) {
                            EXF.getInstance().ICI(var19);
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

                EVZ var11 = new EVZ(var25, this.AIDB("", var1));
                return var11;
            }

            var10 = new EVZ(AHCI.SUCCESS, null);
        } catch (DatatypeConfigurationException | ParseException var23) {
            EXF.getInstance().ICA(var23);
            throw new FFI(var23);
        } finally {
            EXF.getInstance().ICP();
        }

        return var10;
    }
}
