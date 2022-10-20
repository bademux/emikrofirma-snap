package a.a.a.c.e.a.b;

import a.a.a.c.e.a.k.a.EXF;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EVQ extends EVV {
    private final Map<String, String> GPN;

    EVQ(boolean var1, String var2) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.GPN = new HashMap();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HZW(String var1, String var2) {
        this.GPN.put(var1, var2);
    }

    public Map<String, String> getValues() {
        return this.GPN;
    }

    public boolean HZU() {
        return this.GPN.size() > 0;
    }

    public String HZV() {
        StringBuilder var1 = new StringBuilder();
        boolean var2 = true;

        Map.Entry var4;
        for (Iterator var3 = this.GPN.entrySet().iterator(); var3.hasNext(); var1.append(var4)) {
            var4 = (Map.Entry) var3.next();
            if (var2) {
                var2 = false;
            } else {
                var1.append(", ");
            }
        }

        return var1.toString();
    }

    public String toString() {
        return "MainArgumentMapOfStrings [name=" + this.GPU + ", mandatory=" + this.GPT + ", values=" + this.GPN + "]";
    }
}
