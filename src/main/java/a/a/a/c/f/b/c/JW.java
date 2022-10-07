package a.a.a.c.f.b.c;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.LF;

import javax.xml.bind.annotation.XmlTransient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@XmlTransient
public abstract class JW extends LF {
    public JW(boolean var1, Date var2) {
        super(var1, var2);
        EXF.getInstance().ICQ();
    }

    public JW(Date var1) {
        this(false, var1);
        EXF.getInstance().ICQ();
    }

    public JW(boolean var1, LocalDate var2) {
        super(var1, var2);
        EXF.getInstance().ICQ();
    }

    public JW(LocalDate var1) {
        this(false, var1);
        EXF.getInstance().ICQ();
    }

    public JW() {
        EXF.getInstance().ICQ();
    }

    protected String DED(String var1, Date var2) throws FFK {
        EXF.getInstance().ICO();

        String var5;
        try {
            if (var1 == null || var2 == null) {
                throw new FFK("Input parameters cannot be NULL!");
            }

            SimpleDateFormat var3 = new SimpleDateFormat(var1);
            String var4 = var3.format(var2);
            var5 = var4;
        } finally {
            EXF.getInstance().ICP();
        }

        return var5;
    }

    protected static Date DEE(String var0, String var1) throws FFK {
        EXF.getInstance().ICO();

        Date var4;
        try {
            if (var0 == null || var1 == null) {
                throw new FFK("Input parameters cannot be NULL!");
            }

            SimpleDateFormat var2 = new SimpleDateFormat(var0);
            Date var3 = var2.parse(var1);
            var4 = var3;
        } catch (ParseException var8) {
            EXF.getInstance().ICA(var8);
            throw new FFK(var8);
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
