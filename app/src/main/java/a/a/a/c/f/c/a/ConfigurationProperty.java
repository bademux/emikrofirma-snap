package a.a.a.c.f.c.a;

import a.a.a.c.f.ModelBaseTypeElement;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class ConfigurationProperty<_A extends ModelBaseTypeElement<_B>, _B> extends LT {
    protected Text AQG;
    protected _A AQH;

    public ConfigurationProperty() {
        this(null, null);

    }

    public ConfigurationProperty(Text var1, _A var2) {

        this.AQG = var1;
        this.AQH = var2;

    }

    public Text getName() {
        return this.AQG;
    }

    public Text DEX() {
        if (this.AQG == null) {
            this.AQG = new Text();
        }

        return this.AQG;
    }

    public void setName(Text var1) {
        this.AQG = var1;
    }

    public _A getValue() {
        return this.AQH;
    }

    public abstract _A DEY();

    public void setValue(_A var1) {
        this.AQH = var1;
    }

    public String toString() {
        return "ConfigurationProperty [name=" + this.AQG + ", value=" + this.AQH + "]";
    }
}
