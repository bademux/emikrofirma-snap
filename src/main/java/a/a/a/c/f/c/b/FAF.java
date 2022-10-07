package a.a.a.c.f.c.b;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public abstract class FAF<_T> implements ChangeListener<_T> {
    public FAF() {
    }

    protected abstract void IFV(_T var1, _T var2);

    public void changed(ObservableValue<? extends _T> var1, _T var2, _T var3) {
        this.IFV(var2, var3);
    }
}
