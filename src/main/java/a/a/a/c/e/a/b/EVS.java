package a.a.a.c.e.a.b;

import a.a.a.c.e.a.k.a.EXF;

import java.util.*;

public class EVS extends EVV {
    private final Map<String, List<String>> GPO;

    EVS(boolean var1, String var2) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.GPO = new HashMap();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HZX(String var1, String var2) {
        if (!this.GPO.containsKey(var1)) {
            this.GPO.put(var1, new ArrayList());
        }

        this.GPO.get(var1).add(var2);
    }

    public Map<String, List<String>> getValues() {
        return this.GPO;
    }

    public boolean HZU() {
        return this.GPO.size() > 0;
    }

    public String HZV() {
        StringBuilder var1 = new StringBuilder();
        boolean var2 = true;
        Iterator var3 = this.GPO.entrySet().iterator();

        while (var3.hasNext()) {
            Map.Entry var4 = (Map.Entry) var3.next();
            if (var2) {
                var2 = false;
            } else {
                var1.append(", ");
            }

            var1.append((String) var4.getKey()).append("=[");
            boolean var5 = true;

            String var7;
            for (Iterator var6 = ((List) var4.getValue()).iterator(); var6.hasNext(); var1.append(var7)) {
                var7 = (String) var6.next();
                if (var5) {
                    var5 = false;
                } else {
                    var1.append("|");
                }
            }

            var1.append("]");
        }

        return var1.toString();
    }

    public String toString() {
        return "MainArgumentMapOfListsOfStrings [name=" + this.GPU + ", mandatory=" + this.GPT + ", values=" + this.GPO + "]";
    }
}
