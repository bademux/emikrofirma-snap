package a.a.a.c.f.a.c.a.e;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.Field;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public class RuleOnField extends AHCE {
    @XmlElement(
            name = "conditionLeft"
    )
    protected final RuleOnFieldContainer AHWQ;
    @XmlElement(
            name = "logicalOperator"
    )
    protected final AHEG AHWR;
    @XmlElement(
            name = "conditionRight"
    )
    protected final RuleOnFieldContainer AHWS;

    private RuleOnField() {

        this.AHWQ = null;
        this.AHWR = null;
        this.AHWS = null;

    }

    public RuleOnField(AHCJ var1, String var2, RuleOnFieldContainer var3, AHEG var4, RuleOnFieldContainer var5) {
        super(var1, var2);

        this.AHWQ = var3;
        this.AHWR = var4;
        this.AHWS = var5;

    }

    public RuleOnFieldContainer getConditionLeft() {
        return this.AHWQ;
    }

    public AHEG getLogicalOperator() {
        return this.AHWR;
    }

    public RuleOnFieldContainer getConditionRight() {
        return this.AHWS;
    }

    public ValueContainer2<AHCI, String> AICX(Field var1) {

        ValueContainer2 var5;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionLeft " + this.AHWQ);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("logicalOperator " + this.AHWR);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionRight " + this.AHWS);
        ValueContainer2 var2 = null;
        ValueContainer2 var3 = null;
        switch (this.AHWR) {
            case AND:
            case OR:
                var2 = this.AHWQ.getActionOnField().AICX(var1);
                var3 = this.AHWS.getActionOnField().AICX(var1);
                break;
            case NOT:
                var2 = this.AHWQ.getActionOnField().AICX(var1);
                var3 = new ValueContainer2(AHCI.SUCCESS, "");
                break;
            default:
                throw new FFI("Invalid logicalOperator [" + this.AHWR + "]!");
        }

        boolean var4 = false;
        switch (this.AHWR) {
            case AND:
                var4 = var2.getFirstValue().equals(AHCI.SUCCESS) & var3.getFirstValue().equals(AHCI.SUCCESS);
                break;
            case OR:
                var4 = var2.getFirstValue().equals(AHCI.SUCCESS) | var3.getFirstValue().equals(AHCI.SUCCESS);
                break;
            case NOT:
                var4 = !var2.getFirstValue().equals(AHCI.SUCCESS);
                break;
            default:
                throw new FFI("Invalid logicalOperator [" + this.AHWR + "]!");
        }

        if (!var4) {
            var5 = null;
            AHCI var10;
            switch (this.AHTY) {
                case WARNING:
                    var10 = AHCI.WARNING;
                    break;
                case ERROR:
                    var10 = AHCI.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            ValueContainer2 var6 = new ValueContainer2(var10, this.AIDT("", (String) var2.getSecondValue(), (String) var3.getSecondValue()));
            return var6;
        }

        var5 = new ValueContainer2(AHCI.SUCCESS, null);

        return var5;
    }

    private String AIDT(String var1, String var2, String var3) {
        String var4 = super.AICW(var1).replaceAll("##LOGICAL_OPERATOR##", Matcher.quoteReplacement(this.AHWR.getDescription()));
        String var5 = var2 != null ? var2 : "OK";
        var4 = var4.replaceAll("##RULE_LEFT_RESULT##", Matcher.quoteReplacement(var5));
        String var6 = var3 != null ? var3 : "OK";
        var4 = var4.replaceAll("##RULE_RIGHT_RESULT##", Matcher.quoteReplacement(var6));
        return var4;
    }

    public String toString() {
        return "RuleOnField [actionType=" + this.AHTY + ", conditionLeft=" + this.AHWQ + ", logicalOperator=" + this.AHWR + ", conditionRight=" + this.AHWS + "]";
    }
}
