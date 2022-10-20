package a.a.a.c.e.c;

import com.github.bademux.emk.utils.LocaleUtils;

import java.util.ResourceBundle;

public class EXN {
    private static volatile EXN GUQ;
    private final ResourceBundle GUR;

    public static EXN getInstance() {
        if (GUQ == null) {
            Class var0 = EXN.class;
            synchronized (EXN.class) {
                if (GUQ == null) {
                    GUQ = new EXN();
                }
            }
        }

        return GUQ;
    }

    public EXN() {

        this.GUR = ResourceBundle.getBundle("messages/launcher_messages", LocaleUtils.LOCALE);

    }

    public String getMessageForKey(String var1) {
        return this.GUR.getString(var1);
    }
}
