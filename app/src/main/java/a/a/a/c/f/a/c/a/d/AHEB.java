package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
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
        EXF.getInstance().ICQ();
    }

    public AHEB(AHEF var1, AHEN var2) {
        super(var1, var2);
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public void AIDR(AHDV var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("selectedField " + var1);
            EXF.getInstance().ICK("operationType " + this.AHWI);
            EXF.getInstance().ICK("variable " + this.AHWJ);
            if (this.AHWI == AHEF.SET) {
                if (this.AHWJ.AIDV()) {
                    throw new FFI("The variable was already set!");
                }

                String var2 = var1.getValue();
                EXF.getInstance().ICK("selectedFieldValue " + var2);
                String var3 = var2 != null ? var2.trim() : "";
                EXF.getInstance().ICK("selectedFieldValueTrimed " + var3);
                SimpleDateFormat var4 = new SimpleDateFormat("yyyy-MM-dd");
                Date var5 = var4.parse(var3);
                this.AHWJ.setValue(var5);
                return;
            }
            throw new FFI("Invalid operationType [" + this.AHWI + "]!");
        } catch (ParseException var9) {
            EXF.getInstance().ICA(var9);
            throw new FFI(var9);
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
