package a.a.a.c.f.a.c.a.a;

import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldAbstract extends AHCE {
    @XmlAttribute(
            name = "conditionType"
    )
    protected final ConditionType AHUF;

    protected ConditionOnFieldAbstract() {

        this.AHUF = null;

    }

    public ConditionOnFieldAbstract(ActionType var1, String var2, ConditionType var3) {
        super(var1, var2);

        this.AHUF = var3;

    }

    public String toString() {
        return "ConditionOnFieldAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHUF + "]";
    }

    protected String AIDB(String var1, BaseField var2) {
        return super.AICW(var1).replaceAll("##CONDITION_TYPE##", Matcher.quoteReplacement(this.AHUF.getDescription())).replaceAll("##FIELD_TYPE##", Matcher.quoteReplacement(var2.getFieldType().name())).replaceAll("##FIELD_VALUE##", Matcher.quoteReplacement(var2.getValue()));
    }
}
