package a.a.a.c.f.a.a;

import a.a.a.b.DateFormat;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AHBZ extends XmlAdapter<String, Date> {
    public static final String AHTS = DateFormat.yyyy_MM_dd.getValue();

    public AHBZ() {
    }

    public Date unmarshal(String var1) throws Exception {
        SimpleDateFormat var2 = new SimpleDateFormat(DateFormat.yyyy_MM_dd.getValue());
        return var2.parse(var1);
    }

    public String marshal(Date var1) throws Exception {
        SimpleDateFormat var2 = new SimpleDateFormat(DateFormat.yyyy_MM_dd.getValue());
        return var2.format(var1);
    }
}
