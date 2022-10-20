package a.a.a.c.f.a.c.a.c;

import a.a.a.c.f.a.c.AHEQ;

public class AHDQ {
    protected final AHEQ AHVQ;
    protected final String AHVR;
    protected String AHVS;

    public AHDQ(AHEQ var1, String var2, String var3) {

        this.AHVQ = var1;
        this.AHVR = var2;
        this.AHVS = var3;

    }

    public AHDQ(AHEQ var1, String var2) {
        this(var1, var2, null);

    }

    public AHEQ getElementNamespace() {
        return this.AHVQ;
    }

    public String getElementName() {
        return this.AHVR;
    }

    public void setValue(String var1) {
        this.AHVS = var1;
    }

    public String getValue() {
        return this.AHVS;
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.AHVR == null ? 0 : this.AHVR.hashCode());
        var2 = 31 * var2 + (this.AHVQ == null ? 0 : this.AHVQ.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 == null) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            AHDQ var2 = (AHDQ) var1;
            if (this.AHVR == null) {
                if (var2.AHVR != null) {
                    return false;
                }
            } else if (!this.AHVR.equals(var2.AHVR)) {
                return false;
            }

            return this.AHVQ == var2.AHVQ;
        }
    }

    public String toString() {
        return "DeclaredFieldBaseNS [elementNamespace=" + this.AHVQ + ", elementName=" + this.AHVR + ", value=" + this.AHVS + "]";
    }
}
