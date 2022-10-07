package a.a.a.c.e.a.g;

import java.io.IOException;
import java.io.InputStream;

public class EWW extends InputStream {
    private static final int GRJ = 20;
    private final InputStream GRK;
    private final long GRL;
    private final EWX GRM;
    long GRN;
    int GRO;
    long GRP;
    long GRQ;

    public EWW(InputStream var1, long var2, EWX var4) {
        this.GRK = var1;
        this.GRL = var2;
        this.GRM = var4;
        this.GRN = -1L;
        this.GRO = 0;
        this.GRP = 0L;
        this.GRQ = 0L;
    }

    public EWX getProgressReporter() {
        return this.GRM;
    }

    public int read() throws IOException {
        if (this.GRN < 0L) {
            this.GRN = System.currentTimeMillis();
        }

        ++this.GRO;
        int var1 = this.GRK.read();
        ++this.GRP;
        ++this.GRQ;
        if (this.GRO % 20 == 0) {
            long var2 = System.currentTimeMillis();
            long var4 = var2 - this.GRN;
            this.GRN = var2;
            EWX.IBJ(this.GRM, (double) this.GRP / (double) this.GRL, var4, this.GRQ);
            this.GRQ = 0L;
        }

        return var1;
    }

    public int read(byte[] var1) throws IOException {
        if (this.GRN < 0L) {
            this.GRN = System.currentTimeMillis();
        }

        int var2 = this.GRK.read(var1);
        this.GRP += var2;
        this.GRQ += var2;
        long var3 = System.currentTimeMillis();
        long var5 = var3 - this.GRN;
        this.GRN = var3;
        EWX.IBJ(this.GRM, (double) this.GRP / (double) this.GRL, var5, this.GRQ);
        this.GRQ = 0L;
        return var2;
    }

    public int read(byte[] var1, int var2, int var3) throws IOException {
        if (this.GRN < 0L) {
            this.GRN = System.currentTimeMillis();
        }

        int var4 = this.GRK.read(var1, var2, var3);
        this.GRP += var4;
        this.GRQ += var4;
        long var5 = System.currentTimeMillis();
        long var7 = var5 - this.GRN;
        this.GRN = var5;
        EWX.IBJ(this.GRM, (double) this.GRP / (double) this.GRL, var7, this.GRQ);
        this.GRQ = 0L;
        return var4;
    }
}
