package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import a.a.a.c.f.a.c.a.f.VariableRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldAndVariableAbstract<_T> extends ConditionOnFieldAbstract {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final VariableRef<_T> AHUP;

    protected ConditionOnFieldAndVariableAbstract() {

        this.AHUP = null;

    }

    public ConditionOnFieldAndVariableAbstract(ActionType var1, String var2, ConditionType var3, VariableRef<_T> var4) {
        super(var1, var2, var3);

        this.AHUP = var4;
        if (this.AHUP == null) {
            throw new FFI("Variable cannot be null!");
        }

    }

    public VariableRef<_T> getVariableRef() {
        return this.AHUP;
    }

    public String toString() {
        return "ConditionOnFieldAndVariableAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", variableRef=" + this.AHUP + "]";
    }

    protected String AIDB(String var1, BaseField var2) {
        return super.AIDB(var1, var2).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUP.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUP.getValueAsString()));
    }
}
