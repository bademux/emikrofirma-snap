package a.a.a.c.e.a.a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EVK {
    private static volatile EVK GPI;
    private final Set<Thread> GPJ;

    public static EVK getInstance() {
        if (GPI == null) {
            Class var0 = EVK.class;
            synchronized (EVK.class) {
                if (GPI == null) {
                    GPI = new EVK();
                }
            }
        }

        return GPI;
    }

    public EVK() {

        this.GPJ = new HashSet();

    }

    public void HZF(Thread var1) {

        synchronized (this.GPJ) {
            if (!this.GPJ.add(var1)) {
                throw new RuntimeException("Cannot register thread twice!");
            }
        }

    }

    public void HZG(Thread var1) {

        synchronized (this.GPJ) {
            if (!this.GPJ.remove(var1)) {
                throw new RuntimeException("Cannot deRegister not registered thread!");
            }
        }

    }

    public void HZH() {

        synchronized (this.GPJ) {
            Iterator var2 = this.GPJ.iterator();

            while (var2.hasNext()) {
                Thread var3 = (Thread) var2.next();
                org.slf4j.LoggerFactory.getLogger(getClass()).debug("killing thread " + var3.getName() + " (" + var3.getId() + ")");

                try {
                    var3.stop();
                } catch (Throwable var10) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
                }
            }
        }

    }
}
