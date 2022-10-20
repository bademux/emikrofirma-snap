package a.a.a.c.f;

import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

@XmlTransient
public abstract class LA extends ModelBaseTypeElement<Boolean> {
    @XmlTransient
    private final BooleanProperty APN;

    public LA(Boolean var1) {
        super(var1);
        this.APN = new LB(this);

    }

    public LA() {
        this(null);

    }

    public int compareTo(ModelBaseTypeElement<Boolean> var1) {
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
