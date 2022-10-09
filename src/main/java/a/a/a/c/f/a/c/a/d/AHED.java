package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.c.AHDV;
import a.a.a.c.f.a.c.a.f.AHEP;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHED extends AHDZ<Integer> {
    public AHED() {
        EXF.getInstance().ICQ();
    }

    public AHED(AHEF var1, AHEP var2) {
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
            if (this.AHWI == AHEF.COUNT) {
                this.AHWJ.setValue(this.AHWJ.getValue() + 1);
            } else {
                String var2 = var1.getValue();
                EXF.getInstance().ICK("selectedFieldValue " + var2);
                String var3 = var2 != null ? var2.trim() : "";
                EXF.getInstance().ICK("selectedFieldValueTrimed " + var3);
                Integer var4 = Integer.parseInt(var3);
                EXF.getInstance().ICK("selectedFieldValueParsed " + var4);
                switch (this.AHWI) {
                    case ADD:
                        this.AHWJ.setValue(this.AHWJ.getValue() + var4);
                        break;
                    case SUBTRACT:
                        this.AHWJ.setValue(this.AHWJ.getValue() - var4);
                        break;
                    case DIVIDE:
                        this.AHWJ.setValue(this.AHWJ.getValue() / var4);
                        break;
                    case MULTIPLY:
                        this.AHWJ.setValue(this.AHWJ.getValue() * var4);
                        break;
                    case SET:
                        this.AHWJ.setValue(var4);
                        break;
                    default:
                        throw new FFI("Invalid operationType [" + this.AHWI + "]!");
                }
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
