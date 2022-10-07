package a.a.a.c.e.a.f;

import a.a.a.c.e.a.g.EWX;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class EWT implements EWG<byte[]> {
    public EWT() {
    }

    public byte[] IAP(InputStream var1, EWX var2, Long var3) throws IOException {
        if (var1 == null) {
            return null;
        } else {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            int var6 = 1048576;
            byte[] var7 = new byte[var6];

            int var5;
            while ((var5 = var1.read(var7)) != -1) {
                var4.write(var7, 0, var5);
                var4.flush();
            }

            var4.flush();
            var1.close();
            return var4.toByteArray();
        }
    }

    public byte[] IAO(InputStream var1) throws IOException {
        return this.IAP(var1, null, null);
    }
}
