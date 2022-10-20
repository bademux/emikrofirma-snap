package a.a.a.c.e.a.g;

public abstract class EWX {
    private long GRT;
    private double GRU;
    private long GRV;
    private long GRW;
    private long GRX;
    private long GRY;

    public EWX() {
        this(10);
    }

    public EWX(int var1) {
        this(var1, 1, 1);
    }

    public EWX(int var1, int var2, int var3) {

        this.GRT = System.currentTimeMillis();
        this.GRU = 0.0;
        this.GRV = 0L;
        this.GRW = 0L;
        this.GRX = 0L;
        this.GRY = 0L;

    }

    public void IBH(double var1, long var3, long var5) {

        this.GRT = System.currentTimeMillis();
        this.GRU = var1;
        this.GRV = var3;
        this.GRW = var5;
        this.GRX += this.GRV;
        this.GRY += this.GRW;
        this.IBI(this.GRT, this.GRU, this.GRV, this.GRW, this.GRX, this.GRY);

    }

    public abstract void IBI(long var1, double var3, long var5, long var7, long var9, long var11);

    public static void IBJ(EWX var0, double var1, long var3, long var5) {

        if (var0 != null) {
            var0.IBH(var1, var3, var5);
        }

    }
}
