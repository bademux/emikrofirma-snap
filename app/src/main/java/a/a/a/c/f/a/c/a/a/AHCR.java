package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.ConfigurationBaseAbstract;
import a.a.a.c.f.a.c.a.c.Field;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.io.IOException;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCR extends ConditionOnFieldAndCustomActionAbstract<String> {
    private AHCR() throws IOException {

    }

    public AHCR(AHCJ var1, String var2, Class<? extends AHCB<String>> var3, ConfigurationBaseAbstract... var4) throws IOException {
        super(var1, var2, AHDG.MATCHES, var3, var4);

    }

    public ValueContainer2<AHCI, String> AICX(Field var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        AHCB var2 = null;
        String var3 = var1.getValue();
        boolean var4 = false;
        if (this.AHUF == AHDG.MATCHES) {
            var2 = this.getCustomAction();
            var4 = var2.AIBY(var3);
            if (var4) {
                ValueContainer2 var11 = new ValueContainer2(AHCI.SUCCESS, null);
                return var11;
            } else {
                AHCI var5 = null;
                switch (this.AHTY) {
                    case WARNING:
                        var5 = AHCI.WARNING;
                        break;
                    case ERROR:
                        var5 = AHCI.ERROR;
                        break;
                    default:
                        throw new FFI("Invalid actionType [" + this.AHTY + "]!");
                }

                String var6 = var2.getContextString(var3);
                ValueContainer2 var7 = new ValueContainer2(var5, this.AIDB(var6, var1));
                return var7;
            }
        }
        throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
    }
}
