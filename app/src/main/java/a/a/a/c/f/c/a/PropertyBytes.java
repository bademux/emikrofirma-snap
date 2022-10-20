package a.a.a.c.f.c.a;

import a.a.a.c.f.b.c.Bytes;
import a.a.a.c.f.b.c.Text;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class PropertyBytes extends ConfigurationProperty<Bytes, byte[]> {
    public PropertyBytes(Text var1, Bytes var2) {
        super(var1, var2);

    }

    public PropertyBytes(String var1, byte[] var2) {
        this(new Text(var1), new Bytes(var2));

    }

    public PropertyBytes(String var1) {
        this(var1, null);

    }

    public PropertyBytes() {
        this(null);

    }

    public Bytes DEY() {
        if (this.AQH == null) {
            this.AQH = new Bytes();
        }

        return this.AQH;
    }
}
