package a.a.a.c.f;

import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;

@XmlTransient
public abstract class KY extends KX<BigDecimal> {
    @XmlAttribute
    private boolean API;
    @XmlAttribute
    private boolean QZA;
    @XmlAttribute
    private Integer APJ;
    @XmlAttribute
    private Integer APK;
    @XmlTransient
    private final DoubleProperty APL;

    public KY(BigDecimal var1) {
        super(var1);
        this.APL = new KZ(this);
        EXF.getInstance().ICO();

        try {
            this.API = true;
            this.APJ = 20;
            this.APK = 2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public KY() {
        this(null);
        EXF.getInstance().ICQ();
    }

    public boolean DDQ() {
        return this.API;
    }

    public void setAllowNegative(boolean var1) {
        this.API = var1;
    }

    public boolean RJU() {
        return this.QZA;
    }

    public void setAllowOnlyNegative(boolean var1) {
        this.QZA = var1;
    }

    public Integer getScale() {
        return this.APJ;
    }

    public void setScale(Integer var1) {
        this.APJ = var1;
    }

    public Integer getPresicion() {
        return this.APK;
    }

    public void setPresicion(Integer var1) {
        this.APK = var1;
    }

    public int compareTo(KX<BigDecimal> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().compareTo(this.getValue()) : -1;
    }

    public final DoubleProperty DDR() {
        return this.APL;
    }

    public String getValueAsString() {
        BigDecimal var1 = this.getValue();
        return var1 != null ? var1.toPlainString() : "";
    }

    public void setValueFromString(String var1) {
        if (var1 != null) {
            this.setValue(new BigDecimal(var1));
        }

    }

    private class KZ extends SimpleDoubleProperty {
        private final KY APH;

        public KZ(KY var2) {
            this.APH = var2;
        }

        public double get() {
            return this.APH.getValue().doubleValue();
        }

        public void set(double var1) {
            this.APH.setValue(new BigDecimal(var1));
        }
    }
}
