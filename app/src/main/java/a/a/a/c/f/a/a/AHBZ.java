package a.a.a.c.f.a.a;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AHBZ extends XmlAdapter<String, Date> {
    public static final String AHTS = "yyyy-MM-dd";

    public AHBZ() {
    }

    public Date unmarshal(String var1) throws Exception {
        SimpleDateFormat var2 = new SimpleDateFormat("yyyy-MM-dd");
        return var2.parse(var1);
    }

    public String marshal(Date var1) throws Exception {
        SimpleDateFormat var2 = new SimpleDateFormat("yyyy-MM-dd");
        return var2.format(var1);
    }
}
