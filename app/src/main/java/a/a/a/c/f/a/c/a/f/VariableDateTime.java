package a.a.a.c.f.a.c.a.f;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;

@XmlAccessorType(XmlAccessType.FIELD)
public class VariableDateTime extends VariableRef<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHXC;

    private VariableDateTime() {

        this.AHXC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    }

    public VariableDateTime(String var1, XMLGregorianCalendar var2) {
        super(var1, var2);

        this.AHXC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXC.format(this.AHXA.toGregorianCalendar().getTime()) : "NULL";
    }
}
