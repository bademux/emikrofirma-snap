package a.a.a.c.f.a.c.a.d;

import a.a.a.c.f.a.c.a.f.VariableRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class OperationOnFieldAndVariableAbstract<_T> extends OperationOnFieldAbstract {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final VariableRef<_T> AHWJ;

    protected OperationOnFieldAndVariableAbstract() {

        this.AHWJ = null;

    }

    public OperationOnFieldAndVariableAbstract(OperationType var1, VariableRef<_T> var2) {
        super(var1);

        this.AHWJ = var2;

    }

    public VariableRef<_T> getVariableRef() {
        return this.AHWJ;
    }

    public String toString() {
        return "OperationOnFieldAndVariableAbstract [operationType=" + this.AHWI + ", variableRef=" + this.AHWJ + "]";
    }
}
