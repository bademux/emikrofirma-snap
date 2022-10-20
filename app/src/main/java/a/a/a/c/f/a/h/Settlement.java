package a.a.a.c.f.a.h;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFO;
import a.a.a.c.f.a.ModelBusinessPeriodAndDocIndexElement;
import a.a.a.c.f.b.c.JX;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlTransient
public abstract class Settlement extends ModelBusinessPeriodAndDocIndexElement {
    @XmlAttribute
    private boolean ANK;
    private JH ANM;
    private JG ANN;
    private JX ANO;

    protected Settlement() {

        this.ANK = false;
        this.ANN = JG.NEW;

    }

    protected Settlement(JH var1) {
        this();

        this.ANM = var1;

    }

    public boolean DCP() {
        return this.ANK;
    }

    public void DCQ() {
        this.ANK = false;
    }

    public JH getSettlementType() {
        return this.ANM;
    }

    public JG getSettlementStatus() {
        return this.ANN;
    }

    public void setSettlementStatus(JG var1) throws FFO {
        Date var2 = new Date();
        switch (var1) {
            case SETTLED:
                switch (this.ANN) {
                    case SETTLED:
                        throw new FFO("Cannot change status from [" + this.ANN.name() + "] to [" + var1.name() + "]!");
                    case CANCELED_UNCHANGED:
                        this.ANN = var1;
                        return;
                    case NEW:
                    case CANCELED_CHANGED:
                        this.ANK = true;
                        this.ANO = new JX(var2);
                        this.ANN = var1;
                        return;
                    default:
                        throw new FFI("Unimplemented type " + var1 + "]!");
                }
            case CANCELED_UNCHANGED:
                switch (this.ANN) {
                    case SETTLED:
                        this.ANN = var1;
                        this.ANK = false;
                        return;
                    case CANCELED_UNCHANGED:
                    case NEW:
                    case CANCELED_CHANGED:
                        throw new FFO("Cannot change status from [" + this.ANN.name() + "] to [" + var1.name() + "]!");
                    default:
                        throw new FFI("Unimplemented type " + var1 + "]!");
                }
            case NEW:
                throw new FFO("Cannot change status to " + JG.NEW.name() + "!");
            case CANCELED_CHANGED:
                switch (this.ANN) {
                    case SETTLED:
                    case NEW:
                    case CANCELED_CHANGED:
                        throw new FFO("Cannot change status from [" + this.ANN.name() + "] to [" + var1.name() + "]!");
                    case CANCELED_UNCHANGED:
                        this.ANN = var1;
                        this.ANO = null;
                        return;
                    default:
                        throw new FFI("Unimplemented type " + var1 + "]!");
                }
            default:
                throw new FFI("Unimplemented type " + var1 + "]!");
        }
    }

    public JX getSettlementDateTime() {
        return this.ANO;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.ANM == null ? 0 : this.ANM.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (!super.equals(var1)) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            Settlement var2 = (Settlement) var1;
            return this.ANM == var2.ANM;
        }
    }

    public String toString() {
        return "Settlement [settlementType=" + this.ANM + ", settlementStatus=" + this.ANN + ", settlementDateTime=" + this.ANO + ", statusChangedToSettled=" + this.ANK + ", toString()=" + super.toString() + "]";
    }
}
