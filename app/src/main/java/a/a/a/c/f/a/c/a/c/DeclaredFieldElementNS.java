package a.a.a.c.f.a.c.a.c;

import a.a.a.c.f.a.c.XmlSchemaNamespace;

import java.util.ArrayList;
import java.util.List;

public class DeclaredFieldElementNS extends DeclaredFieldBaseNS {
    private final List<DeclaredAtributeElementNS> AHVT;

    public DeclaredFieldElementNS(XmlSchemaNamespace var1, String var2, List<DeclaredAtributeElementNS> var3) {
        super(var1, var2);

        this.AHVT = var3;

    }

    public DeclaredFieldElementNS(XmlSchemaNamespace var1, String var2) {
        this(var1, var2, new ArrayList());

    }

    public List<DeclaredAtributeElementNS> getAttributes() {
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
