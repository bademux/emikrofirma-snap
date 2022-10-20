package a.a.a.c.f.a.c.a.f;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class VariableBigDecimal extends VariableRef<BigDecimal> {
    public VariableBigDecimal() {

    }

    public VariableBigDecimal(String var1, BigDecimal var2) {
        super(var1, var2);

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXA.toPlainString() : "NULL";
    }
}
