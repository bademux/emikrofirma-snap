package a.a.a.c.f.a.c.a.a;

import a.a.a.c.f.a.c.a.BaseRule;
import a.a.a.c.f.a.c.a.ActionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ConditionOnFieldsAbstract extends BaseRule {
    @XmlAttribute(
            name = "conditionType"
    )
    protected final ConditionType AHVE;

    protected ConditionOnFieldsAbstract() {

        this.AHVE = null;

    }

    public ConditionOnFieldsAbstract(ActionType var1, String var2, ConditionType var3) {
        super(var1, var2);

        this.AHVE = var3;

    }

    public String toString() {
        return "ConditionOnFieldsAbstract [actionType=" + this.AHTY + ", conditionType=" + this.AHVE + "]";
    }

    protected String AICW(String var1) {
        return super.AICW(var1).replaceAll("##CONDITION_TYPE##", Matcher.quoteReplacement(this.AHVE.getDescription()));
    }
}
