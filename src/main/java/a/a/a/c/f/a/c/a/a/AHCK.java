package a.a.a.c.f.a.c.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AHCK extends AHCE {
    @XmlAttribute(
            name = "conditionType"
    )
    protected final AHDG AHUF;

    protected AHCK() {
        EXF.getInstance().ICO();

        try {
            this.AHUF = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCK(AHCJ var1, String var2, AHDG var3) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.AHUF = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String toString() {
        return "ConditionOnFieldAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + "]";
    }

    protected String AIDB(String var1, AHDT var2) {
        return super.AICW(var1).replaceAll("##CONDITION_TYPE##", Matcher.quoteReplacement(this.AHUF.getDescription())).replaceAll("##FIELD_TYPE##", Matcher.quoteReplacement(var2.getFieldType().name())).replaceAll("##FIELD_VALUE##", Matcher.quoteReplacement(var2.getValue()));
    }
}
