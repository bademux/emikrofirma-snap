package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCQ extends AHCL<String> {
    private AHCQ() {
        EXF.getInstance().ICQ();
    }

    public AHCQ(AHCJ var1, String var2, AHDG var3, String var4) {
        super(var1, var2, var3, var4);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        EVZ var4;
        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            EXF.getInstance().ICK("value " + this.AHUG);
            String var2 = var1.getValue();
            boolean var3 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var3 = this.AHUG.equals(var2);
                    break;
                case EQUALS_IGNORE_CASE:
                    var3 = this.AHUG.equalsIgnoreCase(var2);
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (!var3) {
                var4 = null;
                AHCI var9;
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

                EVZ var5 = new EVZ(var9, this.AIDB("", var1));
                return var5;
            }

            var4 = new EVZ(AHCI.SUCCESS, null);
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
