package a.a.a.c.e.a.b;

import a.a.a.c.e.a.k.a.EXF;

public class EVT extends EVV {
    private boolean GPP;
    private String GPQ;

    EVT(boolean var1, String var2) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.GPP = false;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void setValue(String var1) {
        this.GPQ = var1;
        this.GPP = true;
    }

    public String getValue() {
        return this.GPQ;
    }

    public boolean HZU() {
        return this.GPP;
    }

    public String HZV() {
        return this.GPQ;
    }

    public String toString() {
        return "MainArgumentSingle [name=" + this.GPU + ", mandatory=" + this.GPT + ", set=" + this.GPP + ", value=" + this.GPQ + "]";
    }
}
