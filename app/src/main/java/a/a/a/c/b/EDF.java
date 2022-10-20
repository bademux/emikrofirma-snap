package a.a.a.c.b;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.KV;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.QSW;

import java.util.Map;

public class EDF<_A extends KV> extends KV {
    private _A FFS;
    private final EDE<_A> FFT;
    private final Map<String, Object> FFU;

    public EDF(EDE<_A> var1, String var2, Map<String, Object> var3) {
        super(var2);
        EXF.getInstance().ICO();

        try {
            this.FFT = var1;
            this.FFS = null;
            this.FFU = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public _A getModelBaseElementWithIdObject() throws FFK {
        EXF.getInstance().ICO();

        KV var1;
        try {
            if (this.FFS == null) {
                this.FFS = this.FFT.HGW();
            }

            var1 = this.FFS;
        } finally {
            EXF.getInstance().ICP();
        }

        return (_A) var1;
    }

    public Map<String, Object> getValuesMap() {
        return this.FFU;
    }

    public <_B> _B getValue(String var1) {
        EXF.getInstance().ICO();

        Object var3;
        try {
            Object var2 = this.getFromValuesMap(var1);
            var3 = var2;
        } finally {
            EXF.getInstance().ICP();
        }

        return (_B) var3;
    }

    public <_B extends Enum<_B>> _B getEnumValue(Class<_B> var1, String var2) {
        EXF.getInstance().ICO();

        Enum var4;
        try {
            Object var3 = this.getFromValuesMap(var2);
            var4 = Enum.valueOf(var1, (String) var3);
        } finally {
            EXF.getInstance().ICP();
        }

        return (_B) var4;
    }

    public QSW getState() {
        return this.getEnumValue(QSW.class, "business_state");
    }

    public JN getPeriod() {
        EXF.getInstance().ICO();

        JN var3;
        try {
            Integer var1 = this.getValue("business_periodYear");
            Integer var2 = this.getValue("business_periodMonth");
            var3 = new JN(var1, var2);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    private Object getFromValuesMap(String var1) {
        EXF.getInstance().ICO();

        Object var2;
        try {
            if (this.FFU != null) {
                var2 = this.FFU.get(var1);
                return var2;
            }

            var2 = null;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public void setValue(String var1, Object var2) {
        EXF.getInstance().ICO();

        try {
            if (this.FFU != null) {
                if (!this.FFU.containsKey(var1)) {
                    throw new FFI("key not found!");
                }

                this.FFU.put(var1, var2);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public KV getParentWrapperWithCanceledState() {
        return super.getParent();
    }

    public KV getParentWrapperOnlyActiveState() {
        return super.getParentOnlyActiveState();
    }

    public KV getChildWrapperWithCanceledState() {
        return super.getChild();
    }

    public KV getChildWrapperOnlyActiveState() {
        return super.getChildOnlyActiveState();
    }
}
