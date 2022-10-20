package a.a.a.c.b;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.f.ModelBaseElementWithId;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.a.InvoiceState;
import lombok.SneakyThrows;

import java.util.Map;
import java.util.concurrent.Callable;

public class EDF<_A extends ModelBaseElementWithId> extends ModelBaseElementWithId {
    private _A FFS;
    private final Callable<_A> FFT;
    private final Map<String, Object> FFU;

    public EDF(Callable<_A> var1, String var2, Map<String, Object> var3) {
        super(var2);

        this.FFT = var1;
        this.FFS = null;
        this.FFU = var3;

    }

    @SneakyThrows
    public _A getModelBaseElementWithIdObject() throws FFK {

        ModelBaseElementWithId var1;
        if (this.FFS == null) {
            this.FFS = this.FFT.call();
        }

        var1 = this.FFS;

        return (_A) var1;
    }

    public Map<String, Object> getValuesMap() {
        return this.FFU;
    }

    public <_B> _B getValue(String var1) {

        Object var3;
        Object var2 = this.getFromValuesMap(var1);
        var3 = var2;

        return (_B) var3;
    }

    public <_B extends Enum<_B>> _B getEnumValue(Class<_B> var1, String var2) {

        Enum var4;
        Object var3 = this.getFromValuesMap(var2);
        var4 = Enum.valueOf(var1, (String) var3);

        return (_B) var4;
    }

    public InvoiceState getState() {
        return this.getEnumValue(InvoiceState.class, "business_state");
    }

    public Period getPeriod() {

        Period var3;
        Integer var1 = this.getValue("business_periodYear");
        Integer var2 = this.getValue("business_periodMonth");
        var3 = new Period(var1, var2);

        return var3;
    }

    private Object getFromValuesMap(String var1) {

        Object var2;
        if (this.FFU != null) {
            var2 = this.FFU.get(var1);
            return var2;
        }

        var2 = null;

        return var2;
    }

    public void setValue(String var1, Object var2) {

        if (this.FFU != null) {
            if (!this.FFU.containsKey(var1)) {
                throw new FFI("key not found!");
            }

            this.FFU.put(var1, var2);
        }

    }

    public ModelBaseElementWithId getParentWrapperWithCanceledState() {
        return super.getParent();
    }

    public ModelBaseElementWithId getParentWrapperOnlyActiveState() {
        return super.getParentOnlyActiveState();
    }

    public ModelBaseElementWithId getChildWrapperWithCanceledState() {
        return super.getChild();
    }

    public ModelBaseElementWithId getChildWrapperOnlyActiveState() {
        return super.getChildOnlyActiveState();
    }
}
