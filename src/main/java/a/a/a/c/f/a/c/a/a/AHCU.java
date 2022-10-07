package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEL;

import javax.xml.bind.annotation.*;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCU<_T, _S> extends AHCK {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final AHEL<_T> AHUQ;
    @XmlElement(
            name = "offset"
    )
    protected final _S AHUR;

    protected AHCU() {
        EXF.getInstance().ICO();

        try {
            this.AHUQ = null;
            this.AHUR = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCU(AHCJ var1, String var2, AHDG var3, AHEL<_T> var4, _S var5) {
        super(var1, var2, var3);
        EXF.getInstance().ICO();

        try {
            this.AHUQ = var4;
            if (this.AHUQ == null) {
                throw new FFI("Variable cannot be null!");
            }

            this.AHUR = var5;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEL<_T> getVariableRef() {
        return this.AHUQ;
    }

    public _S getOffset() {
        return this.AHUR;
    }

    public String toString() {
        return "ConditionOnFieldAndVariableOffsetAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", variableRef=" + this.AHUQ + ", offset=" + this.AHUR + "]";
    }

    protected String AIDB(String var1, AHDT var2) {
        return super.AIDB(var1, var2).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUQ.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUQ.getValueAsString())).replaceAll("##CONTEXT_OFFSET##", Matcher.quoteReplacement(String.valueOf(this.AHUR)));
    }
}
