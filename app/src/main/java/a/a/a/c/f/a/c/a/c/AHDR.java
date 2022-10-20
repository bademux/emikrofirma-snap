package a.a.a.c.f.a.c.a.c;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.AHEQ;

import java.util.ArrayList;
import java.util.List;

public class AHDR extends AHDQ {
    private final List<AHDP> AHVT;

    public AHDR(AHEQ var1, String var2, List<AHDP> var3) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.AHVT = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHDR(AHEQ var1, String var2) {
        this(var1, var2, new ArrayList());
        EXF.getInstance().ICQ();
    }

    public List<AHDP> getAttributes() {
        return this.AHVT;
    }

    public String toString() {
        return "DeclaredFieldElementNS [elementNamespace=" + this.AHVQ + ", elementName=" + this.AHVR + ", value=" + this.AHVS + ", attributes=" + this.AHVT + "]";
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.AHVT == null ? 0 : this.AHVT.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}
