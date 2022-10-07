package a.a.a.c.f;

import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class LJ extends KX<Integer> {
    @XmlTransient
    private final IntegerProperty APX;

    public LJ(Integer var1) {
        super(var1);
        this.APX = new LK(this);
        EXF.getInstance().ICQ();
    }

    public LJ() {
        this(null);
        EXF.getInstance().ICQ();
    }

    public int compareTo(KX<Integer> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().compareTo(this.getValue()) : -1;
    }

    public final IntegerProperty DEG() {
        return this.APX;
    }

    public String getValueAsString() {
        Integer var1 = this.getValue();
        return var1 != null ? var1.toString() : "";
    }

    public void setValueFromString(String var1) {
        if (var1 != null) {
            this.setValue(Integer.parseInt(var1));
        }

    }

    private class LK extends SimpleIntegerProperty {
        private final LJ APW;

        public LK(LJ var2) {
            this.APW = var2;
        }

        public int get() {
            return this.APW.getValue();
        }

        public void set(int var1) {
            this.APW.setValue(var1);
        }
    }
}
