package a.a.a.c.e.a.g;

import java.io.IOException;
import java.io.OutputStream;

public class EWV extends OutputStream {
    private static final int GRB = 20;
    private final OutputStream GRC;
    private final long GRD;
    private final EWX GRE;
    long GRF;
    int GRG;
    long GRH;
    long GRI;

    public EWV(OutputStream var1, long var2, EWX var4) {
        this.GRC = var1;
        this.GRD = var2;
        this.GRE = var4;
        this.GRF = -1L;
        this.GRG = 0;
        this.GRH = 0L;
        this.GRI = 0L;
    }

    public EWX getProgressReporter() {
        return this.GRE;
    }

    public void IBC() throws IOException {
        this.GRC.close();
    }

    public void write(int var1) throws IOException {
        if (this.GRF < 0L) {
            this.GRF = System.currentTimeMillis();
        }

        ++this.GRG;
        this.GRC.write(var1);
        ++this.GRH;
        ++this.GRI;
        if (this.GRG % 20 == 0) {
            long var2 = System.currentTimeMillis();
            long var4 = var2 - this.GRF;
            this.GRF = var2;
            EWX.IBJ(this.GRE, (double) this.GRH / (double) this.GRD, var4, this.GRI);
            this.GRI = 0L;
        }

    }

    public void write(byte[] var1) throws IOException {
        if (this.GRF < 0L) {
            this.GRF = System.currentTimeMillis();
        }

        this.GRC.write(var1);
        this.GRH += var1.length;
        this.GRI += var1.length;
        long var2 = System.currentTimeMillis();
        long var4 = var2 - this.GRF;
        this.GRF = var2;
        EWX.IBJ(this.GRE, (double) this.GRH / (double) this.GRD, var4, this.GRI);
        this.GRI = 0L;
    }

    public void write(byte[] var1, int var2, int var3) throws IOException {
        if (this.GRF < 0L) {
            this.GRF = System.currentTimeMillis();
        }

        this.GRC.write(var1, var2, var3);
        this.GRH += var3;
        this.GRI += var3;
        long var4 = System.currentTimeMillis();
        long var6 = var4 - this.GRF;
        this.GRF = var4;
        EWX.IBJ(this.GRE, (double) this.GRH / (double) this.GRD, var6, this.GRI);
        this.GRI = 0L;
    }

    public void IBD() throws IOException {
        this.GRC.flush();
    }

    public boolean IBE(Object var1) {
        return this.GRC.equals(var1);
    }

    public int IBF() {
        return this.GRC.hashCode();
    }

    public String IBG() {
        return this.GRC.toString();
    }
}
