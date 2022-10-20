package a.a.a.c.f.a.c.a.d;

import a.a.a.c.f.a.c.a.AHDI;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class OperationAbstract extends AHDI {
    @XmlAttribute(
            name = "operationType"
    )
    protected final OperationType AHWI;

    protected OperationAbstract() {

        this.AHWI = null;

    }

    public OperationAbstract(OperationType var1) {

        this.AHWI = var1;

    }

    public OperationType getOperationType() {
        return this.AHWI;
    }

    public String toString() {
        return "OperationAbstract [operationType=" + this.AHWI + "]";
    }
}
