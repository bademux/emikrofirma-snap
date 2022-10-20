package a.a.a.c.f.a.a;

import a.a.a.c.f.a.ModelBusinessTopElement;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class Dictionary extends ModelBusinessTopElement {
    private Text IVK;
    private Text IVL;

    public Dictionary() {
        this(null);

    }

    public Dictionary(String var1) {

        this.IVK = new Text(var1);

    }

    public Text getDictionaryName() {
        return this.IVK;
    }

    public Text IYW() {
        if (this.IVK == null) {
            this.IVK = new Text();
        }

        return this.IVK;
    }

    public void setDictionaryName(Text var1) {
        this.IVK = var1;
    }

    public Text getDictionaryEntryName() {
        return this.IVL;
    }

    public Text IYX() {
        if (this.IVL == null) {
            this.IVL = new Text();
        }

        return this.IVL;
    }

    public void setDictionaryEntryName(Text var1) {
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
            Dictionary var2 = (Dictionary) var1;
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
