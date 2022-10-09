package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEL;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlIDREF;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCT<_T> extends AHCK {
    @XmlAttribute(
            name = "variableRef"
    )
    @XmlIDREF
    protected final AHEL<_T> AHUP;

    protected AHCT() {
        EXF.getInstance().ICO();

        try {
            this.AHUP = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCT(AHCJ var1, String var2, AHDG var3, AHEL<_T> var4) {
        super(var1, var2, var3);
        EXF.getInstance().ICO();

        try {
            this.AHUP = var4;
            if (this.AHUP == null) {
                throw new FFI("Variable cannot be null!");
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEL<_T> getVariableRef() {
        return this.AHUP;
    }

    public String toString() {
        return "ConditionOnFieldAndVariableAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + ", variableRef=" + this.AHUP + "]";
    }

    protected String AIDB(String var1, AHDT var2) {
        return super.AIDB(var1, var2).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUP.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUP.getValueAsString()));
    }
}
