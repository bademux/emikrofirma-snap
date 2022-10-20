package a.a.a.c.c.e.l.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.l.a.EVD;
import a.a.a.c.c.e.l.c.EVJ;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class EVI extends ProcessDefinitionBase {
    public static final Stage GPE;
    public static final String GPF = "invoice_sale_list_set_receive_date.fxml";

    public EVI() {
    }

    public String getName() {
        return GPE.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.invoice_sale_list.menu.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.invoice_sale_list.left_bar.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GPE.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return EVJ.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return EVD.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.StageType.USER_DATA));
        var1.add(new LN(LN.StageType.INVOICE));
        var1.add(new LN(LN.StageType.SETTLEMENT));
        return var1;
    }

    static {
        GPE = Stage.INVOICE_SALE_LIST;
    }
}
