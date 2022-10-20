package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.c.AHDV;
import a.a.a.c.f.a.c.a.f.AHEN;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEB extends AHDZ<Date> {
    private AHEB() {

    }

    public AHEB(AHEF var1, AHEN var2) {
        super(var1, var2);

    }

    public void AIDR(AHDV var1) {

        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedField " + var1);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("operationType " + this.AHWI);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("variable " + this.AHWJ);
            if (this.AHWI == AHEF.SET) {
                if (this.AHWJ.AIDV()) {
                    throw new FFI("The variable was already set!");
                }

                String var2 = var1.getValue();
                org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValue " + var2);
                String var3 = var2 != null ? var2.trim() : "";
                org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValueTrimed " + var3);
                SimpleDateFormat var4 = new SimpleDateFormat("yyyy-MM-dd");
                Date var5 = var4.parse(var3);
                this.AHWJ.setValue(var5);
                return;
            }
            throw new FFI("Invalid operationType [" + this.AHWI + "]!");
        } catch (ParseException var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            throw new FFI(var9);
        }
    }
}
