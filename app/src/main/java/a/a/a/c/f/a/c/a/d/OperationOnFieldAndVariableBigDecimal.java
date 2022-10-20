package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.c.SelectedField;
import a.a.a.c.f.a.c.a.f.VariableBigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class OperationOnFieldAndVariableBigDecimal extends OperationOnFieldAndVariableAbstract<BigDecimal> {
    public OperationOnFieldAndVariableBigDecimal() {

    }

    public OperationOnFieldAndVariableBigDecimal(OperationType var1, VariableBigDecimal var2) {
        super(var1, var2);

    }

    public void AIDR(SelectedField var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedField " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("operationType " + this.AHWI);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("variable " + this.AHWJ);
        BigDecimal var2 = this.AHWJ.getValue();
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("variableValue " + var2);
        String var3 = var1.getValue();
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValue " + var3);
        String var4 = var3 != null ? var3.trim() : "";
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValueTrimed " + var4);
        BigDecimal var5 = new BigDecimal(var4);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValueParsed " + var5);
        switch (this.AHWI) {
            case ADD:
                this.AHWJ.setValue(var2.add(var5));
                break;
            case SUBTRACT:
                this.AHWJ.setValue(var2.subtract(var5));
                break;
            case DIVIDE:
                this.AHWJ.setValue(var2.divide(var5));
                break;
            case MULTIPLY:
                this.AHWJ.setValue(var2.multiply(var5));
                break;
            default:
                throw new FFI("Invalid operationType [" + this.AHWI + "]!");
        }

    }
}
