package a.a.a.c.f;

import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

@XmlTransient
public abstract class LJ extends ModelBaseTypeElement<Integer> {
    @XmlTransient
    private final IntegerProperty APX;

    public LJ(Integer var1) {
        super(var1);
        this.APX = new LK(this);

    }

    public LJ() {
        this(null);

    }

    public int compareTo(ModelBaseTypeElement<Integer> var1) {
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
