package a.a.a.c.d.b;

import a.a.a.b.c.FEL;

import java.util.function.Supplier;

public abstract class EQE {
    public EQE() {
    }

    protected abstract void HPZ();

    public void HQA() {
        FEL.IKS(new Supplier<Void>() {
            public Void get() {
                EQE.this.HPZ();
                return null;
            }
        });
    }
}
