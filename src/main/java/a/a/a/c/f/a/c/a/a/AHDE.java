package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDE extends AHCK {
    public AHDE() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public AHDE(AHCJ var1, String var2) {
        super(var1, var2, AHDG.ISNOTSET);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            boolean var2 = false;
            if (this.AHUF == AHDG.ISNOTSET) {
                var2 = !var1.AIDH();
                EVZ var3;
                if (!var2) {
                    var3 = null;
                    AHCI var8;
                    switch (this.AHTY) {
                        case WARNING:
                            var8 = AHCI.WARNING;
                            break;
                        case ERROR:
                            var8 = AHCI.ERROR;
                            break;
                        default:
                            throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                    }

                    EVZ var4 = new EVZ(var8, this.AIDB("", var1));
                    return var4;
                }

                var3 = new EVZ(AHCI.SUCCESS, null);
                return var3;
            }
            throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
