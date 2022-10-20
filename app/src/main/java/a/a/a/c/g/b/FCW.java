package a.a.a.c.g.b;

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

        this.HBH = ResourceBundle.getBundle("messages/messages", LocaleUtils.LOCALE);

    }

    public String getMessageForKey(String var1) {
        return this.HBH.getString(var1);
    }
}
