package a.a.a.c.f.b.c;

import a.a.a.c.f.LL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class RefId extends LL {
    public RefId(String var1) {
        super(var1);

    }

    public RefId() {

    }

    public RefId(RefId var1) {
        this(var1 != null ? var1.getValue() : null);

    }

    public RefId DEL() {

        RefId var2;
        RefId var1 = new RefId();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public String toString() {
        return "RefId [" + super.toString() + "]";
    }
}
