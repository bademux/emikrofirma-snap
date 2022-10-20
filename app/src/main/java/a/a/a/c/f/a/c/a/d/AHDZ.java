package a.a.a.c.f.a.c.a.d;

import a.a.a.c.f.a.c.a.f.AHEL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDZ<_T> extends AHDY {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final AHEL<_T> AHWJ;

    protected AHDZ() {

        this.AHWJ = null;

    }

    public AHDZ(AHEF var1, AHEL<_T> var2) {
        super(var1);

        this.AHWJ = var2;

    }

    public AHEL<_T> getVariableRef() {
        return this.AHWJ;
    }

    public String toString() {
        return "OperationOnFieldAndVariableAbstract [operationType=" + this.AHWI + ", variableRef=" + this.AHWJ + "]";
    }
}
