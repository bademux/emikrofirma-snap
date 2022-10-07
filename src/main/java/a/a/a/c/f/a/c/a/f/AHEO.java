package a.a.a.c.f.a.c.a.f;

import a.a.a.c.e.a.k.a.EXF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEO extends AHEL<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHXC;

    private AHEO() {
        EXF.getInstance().ICO();

        try {
            this.AHXC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEO(String var1, XMLGregorianCalendar var2) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.AHXC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXC.format(this.AHXA.toGregorianCalendar().getTime()) : "NULL";
    }
}
