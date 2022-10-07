package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCO extends AHCL<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHUI;
    private final transient SimpleDateFormat AHUJ;
    private final transient SimpleDateFormat AHUK;
    private final transient SimpleDateFormat AHUL;
    private final transient SimpleDateFormat AHUM;

    private AHCO() {
        EXF.getInstance().ICO();

        try {
            this.AHUI = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHUJ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHUK = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHUL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHUM = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCO(AHCJ var1, String var2, AHDG var3, XMLGregorianCalendar var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();

        try {
            this.AHUI = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHUJ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHUK = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHUL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHUM = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        EVZ var8;
        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            EXF.getInstance().ICK("value " + this.AHUG);
            String var2 = var1.getValue();
            EXF.getInstance().ICK("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            EXF.getInstance().ICK("fieldValueTrimed " + var3);
            Date var4 = null;

            try {
                var4 = this.AHUI.parse(var3);
            } catch (ParseException var20) {
                EXF.getInstance().ICI(var20);

                try {
                    var4 = this.AHUJ.parse(var3);
                } catch (ParseException var19) {
                    EXF.getInstance().ICI(var19);

                    try {
                        var4 = this.AHUK.parse(var3);
                    } catch (ParseException var18) {
                        EXF.getInstance().ICI(var18);

                        try {
                            var4 = this.AHUL.parse(var3);
                        } catch (ParseException var17) {
                            EXF.getInstance().ICI(var17);
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
                AHCI var23;
                switch (this.AHTY) {
                    case WARNING:
                        var23 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var23 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                EVZ var9 = new EVZ(var23, this.AIDB("", var1));
                return var9;
            }

            var8 = new EVZ(AHCI.SUCCESS, null);
        } catch (DatatypeConfigurationException | ParseException var21) {
            EXF.getInstance().ICA(var21);
            throw new FFI(var21);
        } finally {
            EXF.getInstance().ICP();
        }

        return var8;
    }
}
