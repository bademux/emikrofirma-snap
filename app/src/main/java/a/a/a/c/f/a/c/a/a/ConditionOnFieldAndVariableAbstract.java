package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.Field;
import a.a.a.c.f.a.c.a.f.Variable;
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
    protected final Variable<_T> AHUP;

    protected ConditionOnFieldAndVariableAbstract() {

        this.AHUP = null;

    }

    public ConditionOnFieldAndVariableAbstract(AHCJ var1, String var2, AHDG var3, Variable<_T> var4) {
        super(var1, var2, var3);

        this.AHUP = var4;
        if (this.AHUP == null) {
            throw new FFI("Variable cannot be null!");
        }

    }

    public Variable<_T> getVariableRef() {
        return this.AHUP;
    }

    public String toString() {
        return "ConditionOnFieldAndVariableAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", variableRef=" + this.AHUP + "]";
    }

    protected String AIDB(String var1, Field var2) {
        return super.AIDB(var1, var2).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUP.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUP.getValueAsString()));
    }
}
