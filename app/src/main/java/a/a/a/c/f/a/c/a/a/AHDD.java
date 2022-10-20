package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.h.EWY;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.AHDH;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHDD<_T> extends AHDB {
    @XmlAttribute(
            name = "customActionClass"
    )
    protected final Class<? extends AHCB<_T>> AHVF;
    @XmlIDREF
    protected AHDH[] AHVG;
    protected String[] AHVH;

    protected AHDD() {
        EXF.getInstance().ICO();

        try {
            this.AHVF = null;
            this.AHVG = new AHDH[0];
            this.AHVH = new String[0];
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHDD(AHCJ var1, String var2, AHDG var3, Class<? extends AHCB<_T>> var4, AHDH[] var5, String[] var6) {
        super(var1, var2, var3);
        EXF.getInstance().ICO();

        try {
            this.AHVF = var4;
            if (this.AHVF == null) {
                throw new FFI("CustomActionClass cannot be null!");
            }

            this.AHVG = EWY.IBM(AHDH.class, var5);
            this.AHVH = EWY.IBM(String.class, var6);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Class<? extends AHCB<_T>> getCustomActionClass() {
        return this.AHVF;
    }

    public AHCB<_T> getCustomAction() {
        try {
            Constructor var1 = null;
            Constructor[] var2 = this.AHVF.getConstructors();
            Constructor[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                Constructor var6 = var3[var5];
                if (var6.getParameterTypes().length == this.AHVG.length + this.AHVH.length) {
                    boolean var7 = true;

                    for (int var8 = 0; var8 < this.AHVG.length + this.AHVH.length; ++var8) {
                        if (var8 < this.AHVG.length) {
                            if (!var6.getParameterTypes()[var8].isInstance(this.AHVG[var8])) {
                                var7 = false;
                                break;
                            }
                        } else if (!var6.getParameterTypes()[var8].isInstance(this.AHVH[var8 - this.AHVG.length])) {
                            var7 = false;
                            break;
                        }
                    }

                    if (var7) {
                        var1 = var6;
                        break;
                    }
                }
            }

            if (var1 != null) {
                Object[] var10 = new Object[this.AHVG.length + this.AHVH.length];

                for (var4 = 0; var4 < this.AHVG.length + this.AHVH.length; ++var4) {
                    if (var4 < this.AHVG.length) {
                        var10[var4] = this.AHVG[var4];
                    } else {
                        var10[var4] = this.AHVH[var4 - this.AHVG.length];
                    }
                }

                return (AHCB) var1.newInstance(var10);
            } else {
                throw new FFI("No constructor found!");
            }
        } catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException |
                 InvocationTargetException | NullPointerException var9) {
            EXF.getInstance().ICA(var9);
            throw new FFI(var9);
        }
    }

    public String toString() {
        return "ConditionOnFieldsAndCustomActionAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHVE + ", customActionClass=" + this.AHVF + ", referencedAttributes=" + Arrays.toString(this.AHVG) + ", stringAttributes=" + Arrays.toString(this.AHVH) + "]";
    }

    protected String AICW(String var1) {
        return super.AICW(var1).replaceAll("##CONTEXT_TYPE##", Matcher.quoteReplacement(this.AHVF.getSimpleName()));
    }
}
