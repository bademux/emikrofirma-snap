package a.a.a.c.f.a.c.a.f;

import a.a.a.b.DateFormat;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class VariableDate extends VariableRef<Date> {
    private final transient SimpleDateFormat AHXB;

    private VariableDate() {

        this.AHXB = new SimpleDateFormat(DateFormat.yyyy_MM_dd.getValue());

    }

    public VariableDate(String var1, Date var2) {
        super(var1, var2);

        this.AHXB = new SimpleDateFormat(DateFormat.yyyy_MM_dd.getValue());

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXB.format(this.AHXA) : "NULL";
    }
}
