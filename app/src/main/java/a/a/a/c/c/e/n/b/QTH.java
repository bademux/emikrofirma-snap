package a.a.a.c.c.e.n.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.e.n.a.QTG;
import a.a.a.c.c.e.n.c.QTI;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class QTH extends ProcessDefinitionBase {
    public static final EOS RAJ;

    public QTH() {
    }

    public String getName() {
        return RAJ.getProcessName();
    }

    public String getTitle(ENH var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.infoProgram.title");
            case TOP_MENU:
                return FCW.getInstance().getMessageForKey("micro.infoProgram.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return RAJ.getProcessFxmlFileName();
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return QTI.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return QTG.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        return var1;
    }

    static {
        RAJ = EOS.INFO_PROGRAM;
    }
}
