package a.a.a.c.e.a.a;

public class EVM extends Thread {
    public EVM(Runnable var1) {
        super(var1);
    }

    public void run() {

        try {
            EVK.getInstance().HZF(this);
            super.run();
        } catch (ThreadDeath var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).warn("ThreadDeath error skipped");
        } finally {
            EVK.getInstance().HZG(this);

        }

    }
}
