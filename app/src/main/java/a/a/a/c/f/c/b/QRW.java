package a.a.a.c.f.c.b;

import a.a.a.c.f.b.ObjectWithTitle;
import a.a.a.c.f.c.c.ComboBoxRequired;

public class QRW extends FAE<ObjectWithTitle, ComboBoxRequired<ObjectWithTitle>> {
    public QRW(ComboBoxRequired<ObjectWithTitle> var1) {
        super(var1);
    }

    protected void IFV(ObjectWithTitle var1, ObjectWithTitle var2) {

        if (var2 != null && var2.getTitle(1) != null && var2.getTitle(1).length() > 0) {
            this.GXH.IEU().set(true);
            super.IFV(var1, var2);
        } else {
            this.GXH.IEU().set(false);
            super.IFV(var1, var2);
        }

    }
}
