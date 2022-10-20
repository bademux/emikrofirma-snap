package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.AHDH;
import a.a.a.c.f.a.c.a.c.AHDT;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCS<_T> extends AHCK {
    @XmlAttribute(
            name = "customActionClass"
    )
    protected final Class<? extends AHCB<_T>> AHUN;
    @XmlIDREF
    protected AHDH[] AHUO;

    protected AHCS() {

        this.AHUN = null;
        this.AHUO = new AHDH[0];

    }

    public AHCS(AHCJ var1, String var2, AHDG var3, Class<? extends AHCB<_T>> var4, AHDH... var5) {
        super(var1, var2, var3);

        this.AHUN = var4;
        if (this.AHUN == null) {
            throw new FFI("CustomActionClass cannot be null!");
        }

        this.AHUO = var5;

    }

    public Class<? extends AHCB<_T>> getCustomActionClass() {
        return this.AHUN;
    }

    public AHCB<_T> getCustomAction() {
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
            return (AHCB) var1.newInstance((Object[]) this.AHUO);
        } catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException |
                 InvocationTargetException | NullPointerException e) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", e);
            throw new FFI(e);
        }
    }

    public String toString() {
        return "ConditionOnFieldAndCustomActionAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", customActionClass=" + this.AHUN + ", referencedAttributes=" + Arrays.toString(this.AHUO) + "]";
    }

    protected String AIDB(String var1, AHDT var2) {
        return super.AIDB(var1, var2).replaceAll("##CONTEXT_TYPE##", Matcher.quoteReplacement(this.AHUN.getSimpleName()));
    }
}
