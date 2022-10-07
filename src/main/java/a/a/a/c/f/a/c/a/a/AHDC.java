package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.AHDH;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.AHDT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.IOException;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDC extends AHDD<Map<AHDS, AHDT>> {
    private AHDC() throws IOException {
        EXF.getInstance().ICQ();
    }

    public AHDC(AHCJ var1, String var2, Class<? extends AHCB<Map<AHDS, AHDT>>> var3, AHDH[] var4, String[] var5) throws IOException {
        super(var1, var2, AHDG.MATCHES, var3, var4, var5);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public EVZ<AHCI, String> AICY(Map<AHDS, AHDT> var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("fields " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHVE);
            AHCB var2 = null;
            boolean var3 = false;
            if (this.AHVE == AHDG.MATCHES) {
                var2 = this.getCustomAction();
                var3 = var2.AIBY(var1);
                EVZ var4;
                if (!var3) {
                    var4 = null;
                    AHCI var10;
                    switch (this.AHTY) {
                        case WARNING:
                            var10 = AHCI.WARNING;
                            break;
                        case ERROR:
                            var10 = AHCI.ERROR;
                            break;
                        default:
                            throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                    }

                    String var5 = var2.getContextString(var1);
                    EVZ var6 = new EVZ(var10, this.AICW(var5));
                    return var6;
                }

                var4 = new EVZ(AHCI.SUCCESS, null);
                return var4;
            }
            throw new FFI("Invalid conditionType [" + this.AHVE + "]!");
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
