package a.a.a.c.e.a.a;

public abstract class EVN extends Thread {
    public EVN() {
    }

    public abstract void HZI();

    public void run() {

        try {
            EVK.getInstance().HZF(this);
            this.HZI();
        } catch (ThreadDeath var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).warn("ThreadDeath error skipped");
        } finally {
            EVK.getInstance().HZG(this);

        }

    }
}
