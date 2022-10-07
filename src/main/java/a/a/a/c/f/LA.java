package a.a.a.c.f;

import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class LA extends KX<Boolean> {
    @XmlTransient
    private final BooleanProperty APN;

    public LA(Boolean var1) {
        super(var1);
        this.APN = new LB(this);
        EXF.getInstance().ICQ();
    }

    public LA() {
        this(null);
        EXF.getInstance().ICQ();
    }

    public int compareTo(KX<Boolean> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().compareTo(this.getValue()) : -1;
    }

    public final BooleanProperty DDS() {
        return this.APN;
    }

    public String getValueAsString() {
        Boolean var1 = this.getValue();
        return var1 != null ? var1.toString() : Boolean.FALSE.toString();
    }

    public void setValueFromString(String var1) {
        if (var1 != null) {
            this.setValue(Boolean.valueOf(var1));
        }

    }

    private class LB extends SimpleBooleanProperty {
        private final LA APM;

        public LB(LA var2) {
            this.APM = var2;
        }

        public boolean get() {
            return Boolean.parseBoolean(this.APM.getValueAsString());
        }

        public void set(boolean var1) {
            this.APM.setValue(var1);
        }
    }
}
