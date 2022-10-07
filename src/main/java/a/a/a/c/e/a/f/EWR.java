package a.a.a.c.e.a.f;

import a.a.a.c.e.a.g.EWX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class EWR implements EWG<String> {
    public EWR() {
    }

    public String IAP(InputStream var1, EWX var2, Long var3) throws IOException {
        if (var1 == null) {
            return "";
        } else {
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8));
            StringBuilder var5 = new StringBuilder();

            String var6;
            while ((var6 = var4.readLine()) != null) {
                var5.append(var6).append(System.lineSeparator());
            }

            return var5.toString();
        }
    }

    public String IAO(InputStream var1) throws IOException {
        return this.IAP(var1, null, null);
    }
}
