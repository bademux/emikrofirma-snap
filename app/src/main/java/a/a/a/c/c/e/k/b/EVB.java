package a.a.a.c.c.e.k.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.k.a.EUZ;
import a.a.a.c.c.e.k.c.EVC;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class EVB extends ProcessDefinitionBase {
    public static final Stage GNN;
    public static final String GNO = "cash_register_new_item.fxml";

    public EVB() {
    }

    public String getName() {
        return GNN.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        if (var1 == Anchor.MAIN) {
            return FCW.getInstance().getMessageForKey("micro.process.cash_register_new.Title");
        }
        throw new FFK("Invalid anchor type [" + var1 + "]!");
    }

    public String getFXML() {
        return GNN.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return EVC.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return EUZ.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.RECEIPTRECORD));
        var1.add(new LN(LN.StageType.SETTLEMENT));
        return var1;
    }

    static {
        GNN = Stage.CASH_REGISTER_NEW;
    }
}
