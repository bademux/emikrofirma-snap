package a.a.a.c.f;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlTransient
public abstract class LL extends KX<String> {
    @XmlAttribute
    private Integer APZ;
    @XmlTransient
    private final StringProperty AQA;

    public LL(String var1) {
        super(var1);
        this.AQA = new LM(this);

        this.APZ = 2147483647;

    }

    public LL() {
        this(null);

    }

    public Integer getMaxLength() {
        return this.APZ;
    }

    public void setMaxLength(Integer var1) {
        this.APZ = var1;
    }

    public int compareTo(KX<String> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().compareTo(this.getValue()) : -1;
    }

    public final StringProperty DDG() {
        return this.AQA;
    }

    public String getValueAsString() {
        return this.getValue();
    }

    public void setValueFromString(String var1) {
        this.setValue(var1);
    }

    private class LM extends SimpleStringProperty {
        private final LL APY;

        public LM(LL var2) {
            this.APY = var2;
        }

        public String get() {
            return this.APY.getValue();
        }

        public void set(String var1) {
            this.APY.setValue(var1);
        }
    }
}
