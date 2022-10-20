package a.a.a.c.f.a.c.a.c;

import a.a.a.c.f.a.c.a.AHDI;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDT extends AHDI {
    protected transient boolean AHVV = false;
    @XmlAttribute(
            name = "fieldType"
    )
    protected final AHDS AHVW;
    protected transient String AHVX;

    protected AHDT() {

        this.AHVW = null;

    }

    public AHDT(AHDS var1) {

        this.AHVW = var1;

    }

    public AHDS getFieldType() {
        return this.AHVW;
    }

    public String getValue() {
        return this.AHVX;
    }

    public void setValue(String var1) {
        this.AHVX = var1;
        this.AHVV = true;
    }

    public boolean AIDH() {
        return this.AHVV;
    }

    public void reset() {

        this.AHVV = false;
        this.AHVX = null;

    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.AHVW == null ? 0 : this.AHVW.hashCode());
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
            AHDT var2 = (AHDT) var1;
            return this.AHVW == var2.AHVW;
        }
    }

    public String toString() {
        return "Field [set=" + this.AHVV + ", fieldType=" + this.AHVW + ", value=" + this.AHVX + "]";
    }
}
