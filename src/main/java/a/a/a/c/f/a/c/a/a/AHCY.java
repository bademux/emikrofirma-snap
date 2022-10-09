package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEN;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCY extends AHCT<Date> {
    private final transient SimpleDateFormat AHUY;

    private AHCY() {
        EXF.getInstance().ICO();

        try {
            this.AHUY = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCY(AHCJ var1, String var2, AHDG var3, AHEN var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();

        try {
            this.AHUY = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        EVZ var7;
        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            EXF.getInstance().ICK("variable " + this.AHUP);
            String var2 = var1.getValue();
            EXF.getInstance().ICK("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            EXF.getInstance().ICK("fieldValueTrimed " + var3);
            Date var4 = this.AHUY.parse(var3);
            Date var5 = this.AHUP.getValue();
            boolean var6 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var6 = var5.compareTo(var4) == 0;
                    break;
                case GREATER:
                    var6 = var5.compareTo(var4) < 0;
                    break;
                case GREATER_OR_EQUAL:
                    var6 = var5.compareTo(var4) <= 0;
                    break;
                case LESSER:
                    var6 = var5.compareTo(var4) > 0;
                    break;
                case LESSER_OR_EQUAL:
                    var6 = var5.compareTo(var4) >= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (!var6) {
                var7 = null;
                AHCI var14;
                switch (this.AHTY) {
                    case WARNING:
                        var14 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var14 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                EVZ var8 = new EVZ(var14, this.AIDB("", var1));
                return var8;
            }

            var7 = new EVZ(AHCI.SUCCESS, null);
        } catch (ParseException var12) {
            EXF.getInstance().ICA(var12);
            throw new FFI(var12);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }
}
