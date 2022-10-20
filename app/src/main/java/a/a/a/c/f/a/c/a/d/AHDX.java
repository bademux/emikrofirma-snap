package a.a.a.c.f.a.c.a.d;

import a.a.a.c.f.a.c.a.AHDI;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDX extends AHDI {
    @XmlAttribute(
            name = "operationType"
    )
    protected final AHEF AHWI;

    protected AHDX() {

        this.AHWI = null;

    }

    public AHDX(AHEF var1) {

        this.AHWI = var1;

    }

    public AHEF getOperationType() {
        return this.AHWI;
    }

    public String toString() {
        return "OperationAbstract [operationType=" + this.AHWI + "]";
    }
}
