package a.a.a.c.c.e.i.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.i.a.EUA;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class EUD extends ELZ {
    public static final EOS GKG;
    public static final String GKH = "declarationList_selectAndSend_JPK.fxml";
    public static final String GKI = "declarationList_jpkConvertCSV2XML.fxml";
    public static final String QMQ = "declarationList_dialog_generate_jpk_fa_options.fxml";

    public EUD() {
    }

    public String getName() {
        return GKG.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.jpk_list.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.jpk_list.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GKG.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return EUF.class;
    }

    public Class<? extends ELU<?>> getProcessControllerWindowClass() {
        return EUA.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.LO.DECLARATIONJPK));
        var1.add(new LN(LN.LO.DECLARATION));
        var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.LO.USER_DATA));
        var1.add(new LN(LN.LO.CONTRACTOR));
        var1.add(new LN(LN.LO.INVOICE_SELL_TYPE));
        return var1;
    }

    static {
        GKG = EOS.DECLARATION_LIST;
    }
}
