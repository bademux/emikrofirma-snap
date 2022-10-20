package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCP extends AHCL<String> {
    private AHCP() {
        EXF.getInstance().ICQ();
    }

    public AHCP(AHCJ var1, String var2, String var3) {
        super(var1, var2, AHDG.MATCHES, var3);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public EVZ<AHCI, String> AICX(AHDT var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("field " + var1);
            EXF.getInstance().ICK("conditionType " + this.AHUF);
            EXF.getInstance().ICK("value " + this.AHUG);
            String var2 = var1.getValue();
            boolean var3 = false;
            if (this.AHUF == AHDG.MATCHES) {
                Pattern var4 = Pattern.compile(this.AHUG);
                Matcher var5 = var4.matcher(var2);
                var3 = var5.matches();
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

                    EVZ var11 = new EVZ(var10, this.AIDB("", var1));
                    return var11;
                }

                EVZ var9 = new EVZ(AHCI.SUCCESS, null);
                return var9;
            }
            throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
