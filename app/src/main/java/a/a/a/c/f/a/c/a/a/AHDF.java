package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDF extends AHCK {
    public AHDF() {

    }

    public AHDF(AHCJ var1, String var2) {
        super(var1, var2, AHDG.ISSET);

    }

    public EVZ<AHCI, String> AICX(AHDT var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        boolean var2 = false;
        if (this.AHUF == AHDG.ISSET) {
            var2 = var1.AIDH();
            if (var2) {
                EVZ var8 = new EVZ(AHCI.SUCCESS, null);
                return var8;
            } else {
                AHCI var3 = null;
                switch (this.AHTY) {
                    case WARNING:
                        var3 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var3 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                EVZ var4 = new EVZ(var3, this.AIDB("", var1));
                return var4;
            }
        }
        throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
    }
}
