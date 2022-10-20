package a.a.a.c.f.a.c.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.c.a.f.AHEL;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlIDREF;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCH<_T> extends AHCG {
    @XmlIDREF
    protected final AHEL<_T> AHUA;

    protected AHCH() {

        this.AHUA = null;

    }

    public AHCH(AHEL<_T> var1, AHCJ var2, String var3) {
        super(var2, var3);

        this.AHUA = var1;
        if (this.AHUA == null) {
            throw new FFI("Variable cannot be null!");
        }

    }

    public AHEL<_T> getVariable() {
        return this.AHUA;
    }

    public abstract EVZ<AHCI, String> AICZ();

    public String toString() {
        return "ActionOnVariable [actionType=" + this.AHTY + ", variable=" + this.AHUA + "]";
    }

    protected String AICW(String var1) {
        return super.AICW(var1).replaceAll("##VARIABLE_ID##", Matcher.quoteReplacement(this.AHUA.getId())).replaceAll("##VARIABLE_VALUE##", Matcher.quoteReplacement(this.AHUA.getValueAsString()));
    }
}
