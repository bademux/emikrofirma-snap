package a.a.a.c.e.a.f;

import a.a.a.c.e.a.g.EWX;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class EWL implements EWG<File> {
    private final int GQS = 200;
    private final int GQT = 1048576;
    private final File GQU;
    private final Long GQV;

    public EWL(File var1, Long var2) {
        this.GQU = var1;
        this.GQV = var2;
    }

    public File IAP(InputStream var1, EWX var2, Long var3) throws IOException {
        EWX.IBJ(var2, 0.0, 0L, 0L);
        if (var3 == null || var3 == 0L) {
            var3 = this.GQV;
        }

        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        long var9 = System.nanoTime();
        FileOutputStream var11 = null;
        this.getClass();
        byte[] var13 = new byte[1048576];

        try {
            var11 = new FileOutputStream(this.GQU);
            boolean var14 = false;

            int var12;
            long var15;
            long var17;
            while ((var12 = var1.read(var13)) != -1) {
                ++var4;
                var14 = true;
                var11.write(var13, 0, var12);
                var11.flush();
                var5 += var12;
                var7 = var12;
                this.getClass();
                if (var4 % 200 == 0) {
                    var14 = false;
                    var15 = System.nanoTime();
                    var17 = var15 - var9;
                    var9 = var15;
                    EWX.IBJ(var2, (double) var5 / (double) var3, var17, var7);
                    var7 = 0L;
                }
            }

            var11.flush();
            if (var14) {
                var15 = System.nanoTime();
                var17 = var15 - var9;
                EWX.IBJ(var2, (double) var5 / (double) var3, var17, var7);
            }

            File var22 = this.GQU;
            return var22;
        } finally {
            if (var11 != null) {
                var11.close();
            }

            var1.close();
        }
    }

    public File IAO(InputStream var1) throws IOException {
        return this.IAP(var1, null, null);
    }
}
