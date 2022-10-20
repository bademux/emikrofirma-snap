package a.a.a.c.c.e.r.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.r.a.QUM;
import a.a.a.c.c.e.r.c.QUU;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class QUT extends ProcessDefinitionBase {
    public static final Stage RES;
    public static final String RET = "sale_new_add_element.fxml";

    public QUT() {
    }

    public String getName() {
        return RES.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        switch (var1) {
            case MAIN:
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.other_sale_new.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return RES.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return QUU.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return QUM.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.StageType.USER_DATA));
        var1.add(new LN(LN.StageType.INVOICE));
        var1.add(new LN(LN.StageType.SETTLEMENT));
        var1.add(new LN(LN.StageType.DICTIONARY));
        var1.add(new LN(LN.StageType.CONTRACTOR));
        var1.add(new LN(LN.StageType.INVOICE_OTHER_SELL));
        return var1;
    }

    static {
        RES = Stage.SALE_NEW;
    }
}
