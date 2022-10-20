package a.a.a.c.c.e.h.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.h.a.ETT;
import a.a.a.c.c.e.h.c.ETV;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class ETU extends ProcessDefinitionBase {
    public static final EOS GJJ;

    public ETU() {
    }

    public String getName() {
        return GJJ.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.cash_register_list.Title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.cash_register_list.Title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GJJ.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return ETV.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return ETT.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.LO.RECEIPTRECORD));
        var1.add(new LN(LN.LO.SETTLEMENT));
        return var1;
    }

    static {
        GJJ = EOS.CASH_REGISTER_LIST;
    }
}
