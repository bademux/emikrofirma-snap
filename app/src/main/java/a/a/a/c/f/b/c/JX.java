package a.a.a.c.f.b.c;

import a.a.a.b.f.FFK;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class JX extends JW {
    public static final String AOM = "yyyy-MM-dd' 'HH:mm:ss";
    public static final String QYU = "yyyy-MM-dd";

    public JX(boolean var1, Date var2) {
        super(var1, var2);

    }

    public JX(boolean var1, String var2) throws FFK {
        super(var1, DEE("yyyy-MM-dd' 'HH:mm:ss", var2));

    }

    public JX(String var1) throws FFK {
        this(false, var1);

    }

    public JX(Date var1) {
        this(false, var1);

    }

    public JX() {

    }

    public String DDZ() throws FFK {

        String var1;
        var1 = this.DED("yyyy-MM-dd' 'HH:mm:ss", this.getValueDate());

        return var1;
    }

    public XMLGregorianCalendar DEA(String var1) throws FFK {

        XMLGregorianCalendar var3;
        Date var2 = DEE("yyyy-MM-dd' 'HH:mm:ss", var1);
        var3 = DEB(var2);

        return var3;
    }
}
