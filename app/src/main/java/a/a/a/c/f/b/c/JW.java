package a.a.a.c.f.b.c;

import a.a.a.b.DateFormat;
import a.a.a.b.f.FFK;
import a.a.a.c.f.LF;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Slf4j
@XmlTransient
public abstract class JW extends LF {
    public JW(boolean var1, Date var2) {
        super(var1, var2);

    }

    public JW(Date var1) {
        this(false, var1);

    }

    public JW(boolean var1, LocalDate var2) {
        super(var1, var2);

    }

    public JW(LocalDate var1) {
        this(false, var1);

    }

    public JW() {

    }

    protected String DED(DateFormat var1, Date var2) throws FFK {

        String var5;
        if (var1 == null || var2 == null) {
            throw new FFK("Input parameters cannot be NULL!");
        }

        SimpleDateFormat var3 = new SimpleDateFormat(var1.getValue());
        String var4 = var3.format(var2);
        var5 = var4;

        return var5;
    }

    protected static Date DEE(DateFormat var0, String var1) throws FFK {

        Date var4;
        try {
            if (var0 == null || var1 == null) {
                throw new FFK("Input parameters cannot be NULL!");
            }

            SimpleDateFormat var2 = new SimpleDateFormat(var0.getValue());
            Date var3 = var2.parse(var1);
            var4 = var3;
        } catch (ParseException e) {
            log.error("Something bad happened", e);
            throw new FFK(e);
        }

        return var4;
    }
}
