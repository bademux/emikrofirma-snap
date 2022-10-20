package a.a.a.c.f.b.c;

import a.a.a.b.f.FFK;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoicingDate extends JW {
    public static final String AOL = "yyyy-MM-dd";

    public InvoicingDate(boolean var1, Date var2) {
        super(var1, var2);

    }

    public InvoicingDate(boolean var1, LocalDate var2) {
        super(var1, var2);

    }

    public InvoicingDate(boolean var1, String var2) throws FFK {
        super(var1, DEE("yyyy-MM-dd", var2));

    }

    public InvoicingDate(String var1) throws FFK {
        this(false, var1);

    }

    public InvoicingDate(Date var1) {
        super(var1);

    }

    public InvoicingDate(LocalDate var1) {
        super(var1);

    }

    public InvoicingDate() {

    }

    public InvoicingDate DEF() {

        InvoicingDate var2;
        InvoicingDate var1 = new InvoicingDate();
        var1.setValue(this.getValue());
        var2 = var1;

        return var2;
    }

    public String DDZ() throws FFK {

        String var1;
        var1 = this.DED("yyyy-MM-dd", this.getValueDate());

        return var1;
    }

    public XMLGregorianCalendar DEA(String var1) throws FFK {

        XMLGregorianCalendar var3;
        Date var2 = DEE("yyyy-MM-dd", var1);
        var3 = DEB(var2);

        return var3;
    }
}
