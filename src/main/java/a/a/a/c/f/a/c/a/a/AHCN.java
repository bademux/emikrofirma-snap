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
public class AHCN extends AHCL<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHUH;

    private AHCN() {
        EXF.getInstance().ICO();

        try {
            this.AHUH = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCN(AHCJ var1, String var2, AHDG var3, XMLGregorianCalendar var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();

        try {
            this.AHUH = new SimpleDateFormat("yyyy-MM-dd");
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
                EVZ var14 = new EVZ(AHCI.SUCCESS, null);
                return var14;
            }

            AHCI var7 = null;
            switch (this.AHTY) {
                case WARNING:
                    var7 = AHCI.WARNING;
                    break;
                case ERROR:
                    var7 = AHCI.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            var8 = new EVZ(var7, this.AIDB("", var1));
        } catch (DatatypeConfigurationException | ParseException var12) {
            EXF.getInstance().ICA(var12);
            throw new FFI(var12);
        } finally {
            EXF.getInstance().ICP();
        }

        return var8;
    }
}
