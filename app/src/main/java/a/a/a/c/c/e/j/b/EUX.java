package a.a.a.c.c.e.j.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.j.a.EUV;
import a.a.a.c.c.e.j.c.EUY;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class EUX extends ELZ {
    public static final EOS GMQ;
    public static final String GMR = "invoice_sale_new_add_invoice_element.fxml";

    public EUX() {
    }

    public String getName() {
        return GMQ.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        if (var1 == ENH.MAIN) {
            return FCW.getInstance().getMessageForKey("micro.process.invoice_sale_new.main.title");
        }
        throw new FFK("Invalid anchor type [" + var1 + "]!");
    }

    public String getFXML() {
        return GMQ.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return EUY.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return EUV.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.LO.USER_DATA));
        var1.add(new LN(LN.LO.INVOICE));
        var1.add(new LN(LN.LO.SETTLEMENT));
        var1.add(new LN(LN.LO.DICTIONARY));
        var1.add(new LN(LN.LO.CONTRACTOR));
        return var1;
    }

    static {
        GMQ = EOS.INVOICE_SALE_NEW;
    }
}
