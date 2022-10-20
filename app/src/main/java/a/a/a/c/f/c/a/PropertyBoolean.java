package a.a.a.c.f.c.a;

import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class PropertyBoolean extends ConfigurationProperty<PrivtePerson, Boolean> {
    public PropertyBoolean(Text var1, PrivtePerson var2) {
        super(var1, var2);

    }

    public PropertyBoolean(String var1, Boolean var2) {
        this(new Text(var1), new PrivtePerson(var2));

    }

    public PropertyBoolean(String var1) {
        this(var1, null);

    }

    public PropertyBoolean() {
        this(null);

    }

    public PrivtePerson DEY() {
        if (this.AQH == null) {
            this.AQH = new PrivtePerson();
        }

        return this.AQH;
    }
}
