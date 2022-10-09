package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEM;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCX extends AHCT<BigDecimal> {
    private AHCX() {
        EXF.getInstance().ICQ();
    }

    public AHCX(AHCJ var1, String var2, AHDG var3, AHEM var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
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
            BigDecimal var4 = new BigDecimal(var3);
            BigDecimal var5 = this.AHUP.getValue();
            boolean var6 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var6 = var4.compareTo(var5) == 0;
                    break;
                case GREATER:
                    var6 = var4.compareTo(var5) > 0;
                    break;
                case GREATER_OR_EQUAL:
                    var6 = var4.compareTo(var5) >= 0;
                    break;
                case LESSER:
                    var6 = var4.compareTo(var5) < 0;
                    break;
                case LESSER_OR_EQUAL:
                    var6 = var4.compareTo(var5) <= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (!var6) {
                var7 = null;
                AHCI var12;
                switch (this.AHTY) {
                    case WARNING:
                        var12 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var12 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                EVZ var8 = new EVZ(var12, this.AIDB("", var1));
                return var8;
            }

            var7 = new EVZ(AHCI.SUCCESS, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var7;
    }
}
