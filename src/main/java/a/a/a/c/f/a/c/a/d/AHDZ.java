package a.a.a.c.f.a.c.a.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.f.AHEL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDZ<_T> extends AHDY {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final AHEL<_T> AHWJ;

    protected AHDZ() {
        EXF.getInstance().ICO();

        try {
            this.AHWJ = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHDZ(AHEF var1, AHEL<_T> var2) {
        super(var1);
        EXF.getInstance().ICO();

        try {
            this.AHWJ = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEL<_T> getVariableRef() {
        return this.AHWJ;
    }

    public String toString() {
        return "OperationOnFieldAndVariableAbstract [operationType=" + this.AHWI + ", variableRef=" + this.AHWJ + "]";
    }
}
