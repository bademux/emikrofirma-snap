package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.h.EWY;
import a.a.a.c.f.a.b.CustomActionClass;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.ConfigurationBaseAbstract;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldsAndCustomActionAbstract<_T> extends ConditionOnFieldsAbstract {
    @XmlAttribute(
            name = "customActionClass"
    )
    protected final Class<? extends CustomActionClass<_T>> AHVF;
    @XmlIDREF
    protected ConfigurationBaseAbstract[] AHVG;
    protected String[] AHVH;

    protected ConditionOnFieldsAndCustomActionAbstract() {

        this.AHVF = null;
        this.AHVG = new ConfigurationBaseAbstract[0];
        this.AHVH = new String[0];

    }

    public ConditionOnFieldsAndCustomActionAbstract(ActionType var1, String var2, ConditionType var3, Class<? extends CustomActionClass<_T>> var4, ConfigurationBaseAbstract[] var5, String[] var6) {
        super(var1, var2, var3);

        this.AHVF = var4;
        if (this.AHVF == null) {
            throw new FFI("CustomActionClass cannot be null!");
        }

        this.AHVG = EWY.IBM(ConfigurationBaseAbstract.class, var5);
        this.AHVH = EWY.IBM(String.class, var6);

    }

    public Class<? extends CustomActionClass<_T>> getCustomActionClass() {
        return this.AHVF;
    }

    public CustomActionClass<_T> getCustomAction() {
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

                return (CustomActionClass) var1.newInstance(var10);
            } else {
                throw new FFI("No constructor found!");
            }
        } catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException |
                 InvocationTargetException | NullPointerException var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
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
