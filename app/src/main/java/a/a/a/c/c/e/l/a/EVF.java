package a.a.a.c.c.e.l.a;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.math.BigDecimal;

public class EVF {
    private final ObjectProperty<BigDecimal> GOJ;
    private final ObjectProperty<BigDecimal> GOK;
    private final ObjectProperty<BigDecimal> GOL;

    public EVF(BigDecimal var1, BigDecimal var2, BigDecimal var3) {
        this.GOJ = new SimpleObjectProperty(var1);
        this.GOK = new SimpleObjectProperty(var2);
        this.GOL = new SimpleObjectProperty(var3);
    }

    public ObjectProperty<BigDecimal> getSumNet() {
        return this.GOJ;
    }

    public ObjectProperty<BigDecimal> getSumTax() {
        return this.GOK;
    }

    public ObjectProperty<BigDecimal> getSumBrut() {
        return this.GOL;
    }
}
