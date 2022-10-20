package a.a.a.c.e.a.a;

import a.a.a.c.e.a.k.a.EXF;

public class EVM extends Thread {
    public EVM(Runnable var1) {
        super(var1);
    }

    public void run() {
        EXF.getInstance().ICO();

        try {
            EVK.getInstance().HZF(this);
            super.run();
        } catch (ThreadDeath var5) {
            EXF.getInstance().ICI("ThreadDeath error skipped");
        } finally {
            EVK.getInstance().HZG(this);
            EXF.getInstance().ICP();
        }

    }
}
