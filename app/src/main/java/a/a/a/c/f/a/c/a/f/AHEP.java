package a.a.a.c.f.a.c.a.f;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEP extends Variable<Integer> {
    public AHEP() {

    }

    public AHEP(String var1, Integer var2) {
        super(var1, var2);

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXA.toString() : "NULL";
    }
}
