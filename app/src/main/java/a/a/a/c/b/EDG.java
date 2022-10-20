package a.a.a.c.b;

import a.a.a.b.f.FFK;
import a.a.a.c.f.a.ModelBusinessPeriodElement;

import java.util.Map;

public class EDG<_A extends ModelBusinessPeriodElement> extends ModelBusinessPeriodElement {
    private _A FFV;
    private final EDE<_A> FFW;
    private final Map<String, Object> FFX;

    public EDG(EDE<_A> var1, String var2, Map<String, Object> var3) {
        super(var2);

        this.FFW = var1;
        this.FFV = null;
        this.FFX = var3;

    }

    public _A getModelBaseElementWithIdObject() throws FFK {

        ModelBusinessPeriodElement var1;
        if (this.FFV == null) {
            this.FFV = this.FFW.HGW();
        }

        var1 = this.FFV;

        return (_A) var1;
    }

    public Map<String, Object> getValuesMap() {
        return this.FFX;
    }
}
