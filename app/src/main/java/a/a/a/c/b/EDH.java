package a.a.a.c.b;

import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.RefId;

public class EDH<_T extends Invoice<?>> {
    private final ParametrizedModel<_T> FFY;

    public EDH(ParametrizedModel<_T> var1) {
        this.FFY = var1;
    }

    public Period getPeriod() {

        Period var3;
        Integer var1 = this.FFY.getValue("business_periodYear");
        Integer var2 = this.FFY.getValue("business_periodMonth");
        var3 = new Period(var1, var2);

        return var3;
    }

    public RefId getRefId() {

        RefId var2;
        String var1 = this.FFY.getValue("business_refid");
        var2 = new RefId(var1);

        return var2;
    }

    public Nip getIssuerNumber() {

        Nip var2;
        String var1 = this.FFY.getValue("business_issuer_number");
        var2 = new Nip(var1);

        return var2;
    }
}
