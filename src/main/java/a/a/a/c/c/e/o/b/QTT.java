package a.a.a.c.c.e.o.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.o.a.QTN;
import a.a.a.c.c.e.o.c.QTU;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class QTT extends ELZ {
    public static final EOS RBR;

    public QTT() {
    }

    public String getName() {
        return RBR.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.other_purchase_list.menu.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.other_purchase_list.left_bar.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return RBR.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return QTU.class;
    }

    public Class<? extends ELU<?>> getProcessControllerWindowClass() {
        return QTN.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.LO.CONFIGURATION_PROPERTIES));
        var1.add(new LN(LN.LO.USER_DATA));
        var1.add(new LN(LN.LO.INVOICE_OTHER));
        var1.add(new LN(LN.LO.INVOICE_OTHER_PURCHASE));
        var1.add(new LN(LN.LO.SETTLEMENT));
        return var1;
    }

    static {
        RBR = EOS.OTHER_PURCHASE_LIST;
    }
}
