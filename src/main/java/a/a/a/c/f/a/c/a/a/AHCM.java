package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCM extends AHCL<BigDecimal> {
    private AHCM() {
        EXF.getInstance().ICQ();
    }

    public AHCM(AHCJ var1, String var2, AHDG var3, BigDecimal var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        EVZ var6;
        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            EXF.getInstance().ICK("value " + this.AHUG);
            String var2 = var1.getValue();
            EXF.getInstance().ICK("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            EXF.getInstance().ICK("fieldValueTrimed " + var3);
            BigDecimal var4 = new BigDecimal(var3);
            boolean var5 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var5 = var4.compareTo(this.AHUG) == 0;
                    break;
                case NOT_EQUALS:
                    var5 = var4.compareTo(this.AHUG) != 0;
                    break;
                case GREATER:
                    var5 = var4.compareTo(this.AHUG) > 0;
                    break;
                case GREATER_OR_EQUAL:
                    var5 = var4.compareTo(this.AHUG) >= 0;
                    break;
                case LESSER:
                    var5 = var4.compareTo(this.AHUG) < 0;
                    break;
                case LESSER_OR_EQUAL:
                    var5 = var4.compareTo(this.AHUG) <= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (!var5) {
                var6 = null;
                AHCI var11;
                switch (this.AHTY) {
                    case WARNING:
                        var11 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var11 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                EVZ var7 = new EVZ(var11, this.AIDB("", var1));
                return var7;
            }

            var6 = new EVZ(AHCI.SUCCESS, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var6;
    }
}
