package a.a.a.c.c.e.i.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.e.i.a.ETZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWW;
import a.a.a.c.f.a.d.HJ;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ETW implements ChangeListener<HJ> {
    private final ETZ GJL;

    public ETW(ETZ var1) {
        this.GJL = var1;
    }

    public void changed(ObservableValue<? extends HJ> var1, HJ var2, HJ var3) {
        EXF.getInstance().ICO();

        try {
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
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
