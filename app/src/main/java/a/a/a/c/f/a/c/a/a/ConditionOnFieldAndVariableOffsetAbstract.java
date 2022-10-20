package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.Field;
import a.a.a.c.f.a.c.a.f.Variable;
import jakarta.xml.bind.annotation.*;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldAndVariableOffsetAbstract<_T, _S> extends ConditionOnFieldAbstract {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final Variable<_T> AHUQ;
    @XmlElement(
            name = "offset"
    )
    protected final _S AHUR;

    protected ConditionOnFieldAndVariableOffsetAbstract() {

        this.AHUQ = null;
        this.AHUR = null;

    }

    public ConditionOnFieldAndVariableOffsetAbstract(AHCJ var1, String var2, AHDG var3, Variable<_T> var4, _S var5) {
        super(var1, var2, var3);

        this.AHUQ = var4;
        if (this.AHUQ == null) {
            throw new FFI("Variable cannot be null!");
        }

        this.AHUR = var5;

    }

    public Variable<_T> getVariableRef() {
        return this.AHUQ;
    }

    public _S getOffset() {
        return this.AHUR;
    }

    public String toString() {
        return "ConditionOnFieldAndVariableOffsetAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", variableRef=" + this.AHUQ + ", offset=" + this.AHUR + "]";
    }

    protected String AIDB(String var1, Field var2) {
        return super.AIDB(var1, var2).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUQ.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUQ.getValueAsString())).replaceAll("##CONTEXT_OFFSET##", Matcher.quoteReplacement(String.valueOf(this.AHUR)));
    }
}
