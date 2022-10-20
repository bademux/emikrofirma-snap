package a.a.a.c.e.a.f;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Slf4j
public class EWK<_RESULT_TYPE> implements Serializable {
    private static final long serialVersionUID = 5810622504331436028L;
    private final Map<String, List<String>> GQQ;
    private final _RESULT_TYPE GQR;
    private final Throwable QWD;

    public EWK(_RESULT_TYPE var1, Throwable var2, Map<String, List<String>> var3) {
        this.GQQ = Collections.unmodifiableMap(var3);
        this.GQR = var1;
        this.QWD = var2;
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.GQQ;
    }

    public int getStatus() {
        try {
            List var1 = this.GQQ.get(null);
            if (var1 != null) {
                String var2 = (String) var1.get(0);
                if (var2 != null) {
                    String[] var3 = var2.split(" ");
                    if (var3 != null && var3.length > 1) {
                        String var4 = var3[1];

                        try {
                            return Integer.parseInt(var4);
                        } catch (NumberFormatException e) {
                            log.warn("Something bad happened", e);
                        }
                    }
                }
            }

            return -1;
        } catch (RuntimeException e) {
            log.error("Something bad happened", e);
            return -2;
        } catch (Exception e) {
            log.error("Something bad happened", e);
            return -3;
        }
    }

    public _RESULT_TYPE getContent() {
        return this.GQR;
    }

    public String getContentAsString() {
        return this.GQR instanceof byte[] ? new String((byte[]) this.GQR, StandardCharsets.UTF_8) : String.valueOf(this.GQR);
    }

    public Throwable getException() {
        return this.QWD;
    }

    public String toString() {
        return "HttpSenderResult [headerFields=" + this.GQQ + ", content=" + this.GQR + ", exception=" + this.QWD + "]";
    }
}
