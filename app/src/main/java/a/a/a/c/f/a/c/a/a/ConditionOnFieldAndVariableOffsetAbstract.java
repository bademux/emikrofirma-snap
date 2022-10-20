package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import a.a.a.c.f.a.c.a.f.VariableRef;
import jakarta.xml.bind.annotation.*;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldAndVariableOffsetAbstract<_T, _S> extends ConditionOnFieldAbstract {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final VariableRef<_T> AHUQ;
    @XmlElement(
            name = "offset"
    )
    protected final _S AHUR;

    protected ConditionOnFieldAndVariableOffsetAbstract() {

        this.AHUQ = null;
        this.AHUR = null;

    }

    public ConditionOnFieldAndVariableOffsetAbstract(ActionType var1, String var2, ConditionType var3, VariableRef<_T> var4, _S var5) {
        super(var1, var2, var3);

        this.AHUQ = var4;
        if (this.AHUQ == null) {
            throw new FFI("Variable cannot be null!");
        }

        this.AHUR = var5;

    }

    public VariableRef<_T> getVariableRef() {
        return this.AHUQ;
    }

    public _S getOffset() {
        return this.AHUR;
    }

    public String toString() {
        return "ConditionOnFieldAndVariableOffsetAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", variableRef=" + this.AHUQ + ", offset=" + this.AHUR + "]";
    }

    protected String AIDB(String var1, BaseField var2) {
        return super.AIDB(var1, var2).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUQ.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUQ.getValueAsString())).replaceAll("##CONTEXT_OFFSET##", Matcher.quoteReplacement(String.valueOf(this.AHUR)));
    }
}
