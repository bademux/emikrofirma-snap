package a.a.a.c.c.e.f.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.f.a.ETJ;
import a.a.a.c.c.e.f.c.ETM;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class ETL extends ProcessDefinitionBase {
    public static final Stage GHN;

    public ETL() {
    }

    public String getName() {
        return GHN.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.invoices_records.menu.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.invoices_records.left_bar.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GHN.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return ETM.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return ETJ.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.StageType.INVOICERECORD));
        var1.add(new LN(LN.StageType.USER_DATA));
        return var1;
    }

    static {
        GHN = Stage.INVOICES_RECORDS;
    }
}
