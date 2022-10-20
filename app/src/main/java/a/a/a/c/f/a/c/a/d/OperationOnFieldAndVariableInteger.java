package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.c.SelectedField;
import a.a.a.c.f.a.c.a.f.VariableInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class OperationOnFieldAndVariableInteger extends OperationOnFieldAndVariableAbstract<Integer> {
    public OperationOnFieldAndVariableInteger() {

    }

    public OperationOnFieldAndVariableInteger(OperationType var1, VariableInteger var2) {
        super(var1, var2);

    }

    public void AIDR(SelectedField var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedField " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("operationType " + this.AHWI);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("variable " + this.AHWJ);
        if (this.AHWI == OperationType.COUNT) {
            this.AHWJ.setValue(this.AHWJ.getValue() + 1);
        } else {
            String var2 = var1.getValue();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValueTrimed " + var3);
            Integer var4 = Integer.parseInt(var3);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("selectedFieldValueParsed " + var4);
            switch (this.AHWI) {
                case ADD:
                    this.AHWJ.setValue(this.AHWJ.getValue() + var4);
                    break;
                case SUBTRACT:
                    this.AHWJ.setValue(this.AHWJ.getValue() - var4);
                    break;
                case DIVIDE:
                    this.AHWJ.setValue(this.AHWJ.getValue() / var4);
                    break;
                case MULTIPLY:
                    this.AHWJ.setValue(this.AHWJ.getValue() * var4);
                    break;
                case SET:
                    this.AHWJ.setValue(var4);
                    break;
                default:
                    throw new FFI("Invalid operationType [" + this.AHWI + "]!");
            }
        }

    }
}
