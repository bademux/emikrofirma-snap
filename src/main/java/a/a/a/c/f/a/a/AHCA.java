package a.a.a.c.f.a.a;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AHCA extends XmlAdapter<String, Date> {
    public static final String AHTT = "yyyy-MM-dd'T'HH:mm:ssXXX";
    public static final String AHTU = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final String AHTV = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    public static final String AHTW = "yyyy-MM-dd'T'HH:mm:ss";

    public AHCA() {
    }

    public Date unmarshal(String var1) throws Exception {
        SimpleDateFormat var2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return var2.parse(var1);
    }

    public String marshal(Date var1) throws Exception {
        SimpleDateFormat var2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return var2.format(var1);
    }
}
