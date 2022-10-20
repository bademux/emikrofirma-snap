package a.a.a.c.c.e.o.a;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.math.BigDecimal;

public class QTS {
    private final ObjectProperty<BigDecimal> RBO;
    private final ObjectProperty<BigDecimal> RBP;
    private final ObjectProperty<BigDecimal> RBQ;

    public QTS(BigDecimal var1, BigDecimal var2, BigDecimal var3) {
        this.RBO = new SimpleObjectProperty(var1);
        this.RBP = new SimpleObjectProperty(var2);
        this.RBQ = new SimpleObjectProperty(var3);
    }

    public ObjectProperty<BigDecimal> getSumNet() {
        return this.RBO;
    }

    public ObjectProperty<BigDecimal> getSumTax() {
        return this.RBP;
    }

    public ObjectProperty<BigDecimal> getSumBrut() {
        return this.RBQ;
    }
}
