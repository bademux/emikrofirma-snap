package a.a.a.c.c.e.m.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.m.a.QSZ;
import a.a.a.c.c.e.m.c.QTB;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class QTA extends ProcessDefinitionBase {
    public static final EOS QZM;
    public static final String QZN = "aggregatePurchaseNewLogic_addNewPosition.fxml";

    public QTA() {
    }

    public String getName() {
        return QZM.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        if (var1 == ENH.MAIN) {
            return FCW.getInstance().getMessageForKey("micro.process.aggregate_purchase_new.menu.title");
        }
        throw new FFK("Invalid anchor type [" + var1 + "]!");
    }

    public String getFXML() {
        return QZM.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return QTB.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return QSZ.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.LO.INVOICE_PURCHASE));
        var1.add(new LN(LN.LO.SETTLEMENT));
        var1.add(new LN(LN.LO.DICTIONARY));
        var1.add(new LN(LN.LO.CONTRACTOR));
        return var1;
    }

    static {
        QZM = EOS.AGGREGATE_PURCHASE_NEW;
    }
}
