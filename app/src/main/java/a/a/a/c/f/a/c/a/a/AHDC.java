package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.ConfigurationBaseAbstract;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.Field;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.io.IOException;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDC extends ConditionOnFieldsAndCustomActionAbstract<Map<AHDS, Field>> {
    private AHDC() throws IOException {

    }

    public AHDC(AHCJ var1, String var2, Class<? extends AHCB<Map<AHDS, Field>>> var3, ConfigurationBaseAbstract[] var4, String[] var5) throws IOException {
        super(var1, var2, AHDG.MATCHES, var3, var4, var5);

    }

    public ValueContainer2<AHCI, String> AICY(Map<AHDS, Field> var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHVE);
        AHCB var2 = null;
        boolean var3 = false;
        if (this.AHVE == AHDG.MATCHES) {
            var2 = this.getCustomAction();
            var3 = var2.AIBY(var1);
            ValueContainer2 var4;
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
                ValueContainer2 var6 = new ValueContainer2(var10, this.AICW(var5));
                return var6;
            }

            var4 = new ValueContainer2(AHCI.SUCCESS, null);
            return var4;
        }
        throw new FFI("Invalid conditionType [" + this.AHVE + "]!");
    }
}
