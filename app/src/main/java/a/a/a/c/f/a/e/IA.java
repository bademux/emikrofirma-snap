package a.a.a.c.f.a.e;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum IA implements JM {
    INVOICE(FCW.getInstance().getMessageForKey("micro.model.type.invoicesubtype.invoice"), FCW.getInstance().getMessageForKey("micro.model.type.invoicesubtype.invoice.jpkName")),
    CORRECTION(FCW.getInstance().getMessageForKey("micro.model.type.invoicesubtype.correction"), FCW.getInstance().getMessageForKey("micro.model.type.invoicesubtype.correction.jpkName")),
    AGGREGATE(FCW.getInstance().getMessageForKey("micro.model.type.invoicesubtype.aggregate"), FCW.getInstance().getMessageForKey("micro.model.type.invoicesubtype.aggregate.jpkName"));

    private final String AKY;
    private final String QLS;

    IA(String var3, String var4) {

        this.AKY = var3;
        this.QLS = var4;

    }

    public String getDescription() {
        return this.AKY;
    }

    public int DAQ(JM var1) {
        return this.compareTo((IA) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }

    public String getJpkName() {
        return this.QLS;
    }
}
