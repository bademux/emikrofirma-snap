package a.a.a.c.f.a.c.a.f;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEN extends Variable<Date> {
    private final transient SimpleDateFormat AHXB;

    private AHEN() {

        this.AHXB = new SimpleDateFormat("yyyy-MM-dd");

    }

    public AHEN(String var1, Date var2) {
        super(var1, var2);

        this.AHXB = new SimpleDateFormat("yyyy-MM-dd");

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXB.format(this.AHXA) : "NULL";
    }
}
