package a.a.a.c.f.a.c.a.f;

import a.a.a.c.e.a.k.a.EXF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEN extends AHEL<Date> {
    private final transient SimpleDateFormat AHXB;

    private AHEN() {
        EXF.getInstance().ICO();

        try {
            this.AHXB = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEN(String var1, Date var2) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.AHXB = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getValueAsString() {
        return this.AHXA != null ? this.AHXB.format(this.AHXA) : "NULL";
    }
}
