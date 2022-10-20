package a.a.a.c.b;

import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KE;

public class EDH<_T extends HN<?>> {
    private final EDF<_T> FFY;

    public EDH(EDF<_T> var1) {
        this.FFY = var1;
    }

    public JN getPeriod() {

        JN var3;
        Integer var1 = this.FFY.getValue("business_periodYear");
        Integer var2 = this.FFY.getValue("business_periodMonth");
        var3 = new JN(var1, var2);

        return var3;
    }

    public KE getRefId() {

        KE var2;
        String var1 = this.FFY.getValue("business_refid");
        var2 = new KE(var1);

        return var2;
    }

    public KA getIssuerNumber() {

        KA var2;
        String var1 = this.FFY.getValue("business_issuer_number");
        var2 = new KA(var1);

        return var2;
    }
}
