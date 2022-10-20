package a.a.a.c.f.a.c.a;

import a.a.a.c.f.a.c.AHCC;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;

public abstract class ConfigurationBaseAbstract extends AHCC {
    @XmlID
    @XmlAttribute(
            name = "id"
    )
    protected final String AHVJ;

    protected static String AIDC() {
        return "generatedId#" + System.nanoTime();
    }

    protected ConfigurationBaseAbstract() {

        this.AHVJ = null;

    }

    public ConfigurationBaseAbstract(String var1) {

        this.AHVJ = var1;

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
            ConfigurationBaseAbstract var2 = (ConfigurationBaseAbstract) var1;
            if (this.AHVJ == null) {
                return var2.AHVJ == null;
            } else return this.AHVJ.equals(var2.AHVJ);
        }
    }

    public String toString() {
        return "ConfigurationBaseAbstract [id=" + this.AHVJ + "]";
    }
}
