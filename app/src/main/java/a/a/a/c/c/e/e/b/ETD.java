package a.a.a.c.c.e.e.b;

import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.c.Anchor;
import a.a.a.c.c.d.Stage;
import a.a.a.c.c.e.e.a.ETA;
import a.a.a.c.c.e.e.c.ETE;
import a.a.a.c.f.LN;
import a.a.a.c.g.b.FCW;

import java.util.ArrayList;
import java.util.List;

public class ETD extends ProcessDefinitionBase {
    public static final Stage GFW;
    public static final String GFX = "new_contact.fxml";

    public ETD() {
    }

    public String getName() {
        return GFW.getProcessName();
    }

    public String getTitle(Anchor var1) throws FFK {
        switch (var1) {
            case MAIN:
                return FCW.getInstance().getMessageForKey("micro.process.contacts_list.menu.title");
            case LEFT_BAR:
                return FCW.getInstance().getMessageForKey("micro.process.contacts_list.menu.title");
            default:
                throw new FFK("Invalid anchor type [" + var1 + "]!");
        }
    }

    public String getFXML() {
        return GFW.getProcessFxmlFileName();
    }

    public String getFxmlFileNamePopup() {
        return "new_contact.fxml";
    }

    public Class<? extends ELV> getProcessImplementationClass() {
        return ETE.class;
    }

    public Class<? extends BaseProgressFxController<?>> getProcessControllerWindowClass() {
        return ETA.class;
    }

    public List<LN> getObjectClasses() {
        ArrayList var1 = new ArrayList();
        var1.add(new LN(LN.StageType.CONTRACTOR));
        return var1;
    }

    static {
        GFW = Stage.CONTACTS_LIST;
    }
}
