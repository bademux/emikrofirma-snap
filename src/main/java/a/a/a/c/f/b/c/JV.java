package a.a.a.c.f.b.c;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class JV extends JW {
    public static final String AOL = "yyyy-MM-dd";

    public JV(boolean var1, Date var2) {
        super(var1, var2);
        EXF.getInstance().ICQ();
    }

    public JV(boolean var1, LocalDate var2) {
        super(var1, var2);
        EXF.getInstance().ICQ();
    }

    public JV(boolean var1, String var2) throws FFK {
        super(var1, DEE("yyyy-MM-dd", var2));
        EXF.getInstance().ICQ();
    }

    public JV(String var1) throws FFK {
        this(false, var1);
        EXF.getInstance().ICQ();
    }

    public JV(Date var1) {
        super(var1);
        EXF.getInstance().ICQ();
    }

    public JV(LocalDate var1) {
        super(var1);
        EXF.getInstance().ICQ();
    }

    public JV() {
        EXF.getInstance().ICQ();
    }

    public JV DEF() {
        EXF.getInstance().ICO();

        JV var2;
        try {
            JV var1 = new JV();
            var1.setValue(this.getValue());
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public String DDZ() throws FFK {
        EXF.getInstance().ICO();

        String var1;
        try {
            var1 = this.DED("yyyy-MM-dd", this.getValueDate());
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public XMLGregorianCalendar DEA(String var1) throws FFK {
        EXF.getInstance().ICO();

        XMLGregorianCalendar var3;
        try {
            Date var2 = DEE("yyyy-MM-dd", var1);
            var3 = DEB(var2);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }
}
