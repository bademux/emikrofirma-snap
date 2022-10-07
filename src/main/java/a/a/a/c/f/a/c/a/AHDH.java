package a.a.a.c.f.a.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.AHCC;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

public abstract class AHDH extends AHCC {
    @XmlID
    @XmlAttribute(
            name = "id"
    )
    protected final String AHVJ;

    protected static String AIDC() {
        return "generatedId#" + System.nanoTime();
    }

    protected AHDH() {
        EXF.getInstance().ICO();

        try {
            this.AHVJ = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHDH(String var1) {
        EXF.getInstance().ICO();

        try {
            this.AHVJ = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getId() {
        return this.AHVJ;
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.AHVJ == null ? 0 : this.AHVJ.hashCode());
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
            AHDH var2 = (AHDH) var1;
            if (this.AHVJ == null) {
                return var2.AHVJ == null;
            } else return this.AHVJ.equals(var2.AHVJ);
        }
    }

    public String toString() {
        return "ConfigurationBaseAbstract [id=" + this.AHVJ + "]";
    }
}
