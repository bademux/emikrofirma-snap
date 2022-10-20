package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldAndConstantAbstract<_T> extends ConditionOnFieldAbstract {
    @XmlElement(
            name = "value"
    )
    protected final _T AHUG;

    protected ConditionOnFieldAndConstantAbstract() {

        this.AHUG = null;

    }

    public ConditionOnFieldAndConstantAbstract(ActionType var1, String var2, ConditionType var3, _T var4) {
        super(var1, var2, var3);

        this.AHUG = var4;
        if (this.AHUG == null) {
            throw new FFI("Value cannot be null!");
        }

    }

    public _T getValue() {
        return this.AHUG;
    }

    public String toString() {
        return "ConditionOnFieldAndConstantAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", value=" + this.AHUG + "]";
    }

    protected String AIDB(String var1, BaseField var2) {
        return super.AIDB(var1, var2).replaceAll("##CONTEXT_VALUE##", Matcher.quoteReplacement(String.valueOf(this.AHUG)));
    }
}
