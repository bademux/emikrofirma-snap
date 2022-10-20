package a.a.a.c.f.c.a;

import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class PropertyString extends ConfigurationProperty<Text, String> {
    public PropertyString(Text var1, Text var2) {
        super(var1, var2);

    }

    public PropertyString(String var1, String var2) {
        this(new Text(var1), new Text(var2));

    }

    public PropertyString(String var1) {
        this(var1, null);

    }

    public PropertyString() {
        this(null);

    }

    public Text DEY() {
        if (this.AQH == null) {
            this.AQH = new Text();
        }

        return this.AQH;
    }
}
