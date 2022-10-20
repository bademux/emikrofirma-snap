package a.a.a.c.c.e.i.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.e.i.a.ETZ;
import a.a.a.c.f.a.d.AGWW;
import a.a.a.c.f.a.d.Declaration;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ETW implements ChangeListener<Declaration> {
    private final ETZ GJL;

    public ETW(ETZ var1) {
        this.GJL = var1;
    }

    public void changed(ObservableValue<? extends Declaration> var1, Declaration var2, Declaration var3) {

        this.GJL.GJU.set(false);
        this.GJL.GJV.set(false);
        this.GJL.GJT.set(false);
        this.GJL.QHS.set(false);
        if (var3 != null) {
            switch (var3.getDeclarationStatus()) {
                case SENT:
                    this.GJL.GJU.set(true);
                    break;
                case SUCCESS:
                    this.GJL.GJT.set(true);
                    break;
                case FAILURE:
                case RETRY:
                    this.GJL.GJU.set(true);
                case NONE:
                case NEW:
                    break;
                default:
                    throw new FFI("Not known declaration status");
            }

            if (AGWW.STATUS_TRACKER.equals(var3.getDeclarationSubType())) {
                this.GJL.QHS.set(true);
            }
        }

    }
}
