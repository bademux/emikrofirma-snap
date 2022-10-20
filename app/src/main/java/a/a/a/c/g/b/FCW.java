package a.a.a.c.g.b;

import a.a.a.c.e.a.k.a.EXF;
import com.github.bademux.emk.utils.LocaleUtils;

import java.util.ResourceBundle;

public class FCW {
    private static volatile FCW HBG;
    private final ResourceBundle HBH;

    public static FCW getInstance() {
        if (HBG == null) {
            Class var0 = FCW.class;
            synchronized (FCW.class) {
                if (HBG == null) {
                    HBG = new FCW();
                }
            }
        }

        return HBG;
    }

    public FCW() {
        EXF.getInstance().ICO();

        try {
            this.HBH = ResourceBundle.getBundle("messages/messages", LocaleUtils.LOCALE);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getMessageForKey(String var1) {
        return this.HBH.getString(var1);
    }
}
