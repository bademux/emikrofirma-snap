package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.b.CustomActionClass;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.ConfigurationBaseAbstract;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldAndCustomActionAbstract<_T> extends ConditionOnFieldAbstract {
    @XmlAttribute(
            name = "customActionClass"
    )
    protected final Class<? extends CustomActionClass<_T>> AHUN;
    @XmlIDREF
    protected ConfigurationBaseAbstract[] AHUO;

    protected ConditionOnFieldAndCustomActionAbstract() {

        this.AHUN = null;
        this.AHUO = new ConfigurationBaseAbstract[0];

    }

    public ConditionOnFieldAndCustomActionAbstract(ActionType var1, String var2, ConditionType var3, Class<? extends CustomActionClass<_T>> var4, ConfigurationBaseAbstract... var5) {
        super(var1, var2, var3);

        this.AHUN = var4;
        if (this.AHUN == null) {
            throw new FFI("CustomActionClass cannot be null!");
        }

        this.AHUO = var5;

    }

    public Class<? extends CustomActionClass<_T>> getCustomActionClass() {
        return this.AHUN;
    }

    public CustomActionClass<_T> getCustomAction() {
        try {
            Constructor var1 = null;
            Constructor[] var2 = this.AHUN.getConstructors();
            Constructor[] var3 = var2;
            int var4 = var2.length;

            for (int var5 = 0; var5 < var4; ++var5) {
                Constructor var6 = var3[var5];
                if (var6.getParameterTypes().length == this.AHUO.length) {
                    boolean var7 = true;

                    for (int var8 = 0; var8 < this.AHUO.length; ++var8) {
                        if (!var6.getParameterTypes()[var8].isInstance(this.AHUO[var8])) {
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

            if (var1 == null) {
                throw new FFI("No constructor found!");
            }
            return (CustomActionClass) var1.newInstance((Object[]) this.AHUO);
        } catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException |
                 InvocationTargetException | NullPointerException e) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", e);
            throw new FFI(e);
        }
    }

    public String toString() {
        return "ConditionOnFieldAndCustomActionAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", customActionClass=" + this.AHUN + ", referencedAttributes=" + Arrays.toString(this.AHUO) + "]";
    }

    protected String AIDB(String var1, BaseField var2) {
        return super.AIDB(var1, var2).replaceAll("##CONTEXT_TYPE##", Matcher.quoteReplacement(this.AHUN.getSimpleName()));
    }
}
