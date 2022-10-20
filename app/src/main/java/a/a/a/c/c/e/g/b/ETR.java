package a.a.a.c.c.e.g.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.g.a.ETN;
import a.a.a.c.c.e.g.c.ETS;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class ETR extends ELZ {
    public static final EOS GIV;

    public ETR() {
    }

    public String getName() {
        return GIV.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.invoice_purchase_list.menu.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.invoice_purchase_list.left_bar.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GIV.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return ETS.class;
    }

    public Class<? extends ELU<?>> getProcessControllerWindowClass() {
        return ETN.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.LO.INVOICE));
        var1.add(new LN(LN.LO.SETTLEMENT));
        return var1;
    }

    static {
        GIV = EOS.INVOICE_PURCHASE_LIST;
    }
}
