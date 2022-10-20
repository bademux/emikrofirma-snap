package a.a.a.c.c.b;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EMY {
    private static volatile EMY FIX;
    private final List<File> FIY;

    public static EMY getInstance() {
        if (FIX == null) {
            synchronized (EMY.class) {
                if (FIX == null) {
                    FIX = new EMY();
                }
            }
        }

        return FIX;
    }

    private EMY() {

        this.FIY = new ArrayList();

    }

    public void HMY() {

        try {
            Iterator var1 = this.FIY.iterator();

            while (var1.hasNext()) {
                File var2 = (File) var1.next();

                try {
                    Files.delete(var2.toPath());
                } catch (Exception var8) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                }
            }
        } catch (Exception var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
        }

    }

    public void HMZ(File var1) {

        this.FIY.add(var1);

    }
}
