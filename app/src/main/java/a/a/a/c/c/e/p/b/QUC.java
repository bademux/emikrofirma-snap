package a.a.a.c.c.e.p.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.p.a.QTV;
import a.a.a.c.c.e.p.c.QUD;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class QUC extends ProcessDefinitionBase {
    public static final Stage RCR;
    public static final String RCS = "invoice_other_purchase_new_add_element.fxml";

    public QUC() {
    }

    public String getName() {
        return RCR.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        switch (var1) {
            case MAIN:
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.other_purchase_new.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return RCR.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return QUD.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return QTV.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.StageType.USER_DATA));
        var1.add(new LN(LN.StageType.INVOICE));
        var1.add(new LN(LN.StageType.SETTLEMENT));
        var1.add(new LN(LN.StageType.DICTIONARY));
        var1.add(new LN(LN.StageType.CONTRACTOR));
        var1.add(new LN(LN.StageType.INVOICE_OTHER_PURCHASE));
        return var1;
    }

    static {
        RCR = Stage.OTHER_PURCHASE_NEW;
    }
}
