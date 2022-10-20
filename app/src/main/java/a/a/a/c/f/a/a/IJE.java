package a.a.a.c.f.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IL;
import a.a.a.c.f.b.c.KO;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class IJE extends IL {
    private KO IVK;
    private KO IVL;

    public IJE() {
        this(null);
        EXF.getInstance().ICQ();
    }

    public IJE(String var1) {
        EXF.getInstance().ICO();

        try {
            this.IVK = new KO(var1);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public KO getDictionaryName() {
        return this.IVK;
    }

    public KO IYW() {
        if (this.IVK == null) {
            this.IVK = new KO();
        }

        return this.IVK;
    }

    public void setDictionaryName(KO var1) {
        this.IVK = var1;
    }

    public KO getDictionaryEntryName() {
        return this.IVL;
    }

    public KO IYX() {
        if (this.IVL == null) {
            this.IVL = new KO();
        }

        return this.IVL;
    }

    public void setDictionaryEntryName(KO var1) {
        this.IVL = var1;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.IVL == null ? 0 : this.IVL.hashCode());
        var2 = 31 * var2 + (this.IVK == null ? 0 : this.IVK.hashCode());
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
            IJE var2 = (IJE) var1;
            if (this.IVL == null) {
                if (var2.IVL != null) {
                    return false;
                }
            } else if (!this.IVL.equals(var2.IVL)) {
                return false;
            }

            if (this.IVK == null) {
                return var2.IVK == null;
            } else return this.IVK.equals(var2.IVK);
        }
    }

    public String toString() {
        return "Dictionary [dictionaryName=" + this.IVK + ", dictionaryEntryName=" + this.IVL + ", toString()=" + super.toString() + "]";
    }
}
