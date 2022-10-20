package a.a.a.c.c.e.d.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.d.a.EST;
import a.a.a.c.c.e.d.c.ESX;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class ESW extends ProcessDefinitionBase {
    public static final Stage GFC;
    public static final String GFD = "invoicePurchaseNewLogic_addNewPosition.fxml";

    public ESW() {
    }

    public String getName() {
        return GFC.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        if (var1 == Anchor.MAIN) {
            return FCW.getInstance().getMessageForKey("micro.process.invoice_purchase_new.menu.title");
        }
        throw new FFK("Invalid anchor type [" + var1 + "]!");
    }

    public String getFXML() {
        return GFC.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return ESX.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return EST.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.StageType.INVOICE_PURCHASE));
        var1.add(new LN(LN.StageType.SETTLEMENT));
        var1.add(new LN(LN.StageType.DICTIONARY));
        var1.add(new LN(LN.StageType.CONTRACTOR));
        return var1;
    }

    static {
        GFC = Stage.INVOICE_PURCHASE_NEW;
    }
}
