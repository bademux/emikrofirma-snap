package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.Field;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDF extends ConditionOnFieldAbstract {
    public AHDF() {

    }

    public AHDF(AHCJ var1, String var2) {
        super(var1, var2, AHDG.ISSET);

    }

    public ValueContainer2<AHCI, String> AICX(Field var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        boolean var2 = false;
        if (this.AHUF == AHDG.ISSET) {
            var2 = var1.AIDH();
            if (var2) {
                ValueContainer2 var8 = new ValueContainer2(AHCI.SUCCESS, null);
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

                ValueContainer2 var4 = new ValueContainer2(var3, this.AIDB("", var1));
                return var4;
            }
        }
        throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
    }
}
