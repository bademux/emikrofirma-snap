package a.a.a.c.f.a.a;

import a.a.a.c.f.a.c.TitledContractor;
import a.a.a.c.f.b.ObjectWithTitle;
import a.a.a.c.f.c.c.ComboBoxValidated_NIP;
import a.a.a.c.f.d.FCL;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class EZO extends FCL<ComboBoxValidated_NIP> {
    private final String GWG;
    private EYR GWH;
    private EYL GWI;

    public EZO() {
        this(null);
    }

    public EZO(String var1) {
        super(var1, 10, 3);
        this.GWG = FCW.getInstance().getMessageForKey("micro.process.general.nip.null");
    }

    public void setContractorSetter(EYR var1) {
        this.GWH = var1;
    }

    public void setContractorGetter(EYL var1) {
        this.GWI = var1;
    }

    protected void set(ObjectWithTitle var1) {
        if (this.GWH != null) {
            this.GWH.setContractorFromAutocomplete((TitledContractor) var1);
        }

    }

    protected List<TitledContractor> getByString(String var1) {
        return this.GWI != null ? this.GWI.getContractorsByText(var1) : new ArrayList();
    }

    public boolean isAllowed(String var1) {
        return var1.matches("\\d{0,10}") || this.GWG.equalsIgnoreCase(var1);
    }

    protected int getTitleType() {
        return 2;
    }
}
