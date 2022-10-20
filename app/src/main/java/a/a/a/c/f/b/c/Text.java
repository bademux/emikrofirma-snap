package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Text extends LL {
    public Text(String var1) {
        super(var1);

    }

    public Text() {

    }

    public Text DER() {

        Text var2;
        Text var1 = new Text();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }
}
