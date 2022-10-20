package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.Field;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCQ extends ConditionOnFieldAndConstantAbstract<String> {
    private AHCQ() {

    }

    public AHCQ(AHCJ var1, String var2, AHDG var3, String var4) {
        super(var1, var2, var3, var4);

    }

    public ValueContainer2<AHCI, String> AICX(Field var1) {

        ValueContainer2 var4;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + this.AHUG);
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

            ValueContainer2 var5 = new ValueContainer2(var9, this.AIDB("", var1));
            return var5;
        }

        var4 = new ValueContainer2(AHCI.SUCCESS, null);

        return var4;
    }
}
