package a.a.a.c.b;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IK;

import java.util.Map;

public class EDG<_A extends IK> extends IK {
    private _A FFV;
    private final EDE<_A> FFW;
    private final Map<String, Object> FFX;

    public EDG(EDE<_A> var1, String var2, Map<String, Object> var3) {
        super(var2);
        EXF.getInstance().ICO();

        try {
            this.FFW = var1;
            this.FFV = null;
            this.FFX = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public _A getModelBaseElementWithIdObject() throws FFK {
        EXF.getInstance().ICO();

        IK var1;
        try {
            if (this.FFV == null) {
                this.FFV = this.FFW.HGW();
            }

            var1 = this.FFV;
        } finally {
            EXF.getInstance().ICP();
        }

        return (_A) var1;
    }

    public Map<String, Object> getValuesMap() {
        return this.FFX;
    }
}
