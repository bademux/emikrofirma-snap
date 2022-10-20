package a.a.a.c.c.e.c.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.c.a.ESG;
import a.a.a.c.c.e.c.c.ESJ;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class ESI extends ProcessDefinitionBase {
    public static final Stage GCR;
    public static final String QNB = "invoicesSettlements_generateAndSend_JPK.fxml";
    public static final String GCT = "invoices_settlements_create_empty.fxml";

    public ESI() {
    }

    public String getName() {
        return GCR.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.menu.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.invoices_settlements.left_bar.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GCR.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return ESJ.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return ESG.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.SETTLEMENT));
        var1.add(new LN(LN.StageType.INVOICE));
        var1.add(new LN(LN.StageType.INVOICERECORD));
        var1.add(new LN(LN.StageType.DECLARATION));
        var1.add(new LN(LN.StageType.CONFIGURATION_PROPERTIES));
        return var1;
    }

    static {
        GCR = Stage.INVOICES_SETTLEMENTS;
    }
}
