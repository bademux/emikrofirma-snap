package a.a.a.c.f.a.c.a.f;

import a.a.a.c.f.a.c.a.ConfigurationBaseAbstract;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
@XmlSeeAlso({AHEN.class, AHEM.class, AHEP.class})
public abstract class Variable<_T> extends ConfigurationBaseAbstract {
    protected transient boolean AHWZ;
    @XmlElement(
            name = "value"
    )
    protected _T AHXA;

    protected Variable() {

        this.AHWZ = false;
        this.AHXA = null;

    }

    public Variable(String var1, _T var2) {
        super(var1);

        this.AHWZ = false;
        this.AHXA = var2;

    }

    public _T getValue() {
        return this.AHXA;
    }

    public void setValue(_T var1) {
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("value " + var1);
        this.AHXA = var1;
        this.AHWZ = true;
    }

    public boolean AIDV() {
        return this.AHWZ;
    }

    public String toString() {
        return "Variable [id=" + this.AHVJ + ", value=" + this.AHXA + ", set=" + this.AHWZ + "]";
    }

    public abstract String getValueAsString();
}
