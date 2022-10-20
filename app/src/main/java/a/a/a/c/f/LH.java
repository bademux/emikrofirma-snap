package a.a.a.c.f;

import a.a.a.b.f.FFI;
import a.a.a.c.f.b.JM;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

@XmlTransient
public abstract class LH<_T extends JM> extends KX<_T> {
    @XmlTransient
    private final ObjectProperty<_T> APV;

    public LH(_T var1) {
        super(var1);
        this.APV = new LI(this);

    }

    public LH() {
        this(null);

    }

    public int compareTo(KX<_T> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().DAQ(this.getValue()) : -1;
    }

    public final ObjectProperty<_T> DEI() {
        return this.APV;
    }

    public String getValueAsString() {
        JM var1 = this.getValue();
        return var1 != null ? var1.getDescription() : "";
    }

    public void setValueFromString(String var1) {
        throw new FFI("Do NOT use!");
    }

    private class LI extends SimpleObjectProperty<_T> {
        private final LH<_T> APU;

        public LI(LH<_T> var2) {
            this.APU = var2;
        }

        public _T get() {
            return this.APU.getValue();
        }

        public void set(_T var1) {
            this.APU.setValue(var1);
        }
    }
}
