package a.a.a.c.f.c.b;

import a.a.a.c.f.c.c.DatePickerChanged;

import java.time.LocalDate;

public class FAM<_T extends DatePickerChanged> extends FAF<LocalDate> {
    protected _T GXS;

    public FAM(_T var1) {
        this.GXS = var1;
    }

    protected void IFV(LocalDate var1, LocalDate var2) {
        this.GXS.changedProperty().set(true);
    }
}
