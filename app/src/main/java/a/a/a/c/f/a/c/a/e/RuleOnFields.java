package a.a.a.c.f.a.c.a.e;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.BaseRule;
import a.a.a.c.f.a.c.a.ActionResult;
import a.a.a.c.f.a.c.a.ActionType;
import a.a.a.c.f.a.c.a.a.ConditionType;
import a.a.a.c.f.a.c.a.c.FieldType;
import a.a.a.c.f.a.c.a.c.BaseField;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.Map;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public class RuleOnFields extends BaseRule {
    @XmlAttribute
    protected final LogicalOperator AHWU;
    protected final RuleOnFieldsContainer AHWV;
    protected final RuleOnFieldsContainer AHWW;

    private RuleOnFields() {

        this.AHWV = null;
        this.AHWU = null;
        this.AHWW = null;

    }

    public RuleOnFields(ActionType var1, String var2, RuleOnFieldsContainer var3, LogicalOperator var4, RuleOnFieldsContainer var5) {
        super(var1, var2);

        this.AHWV = var3;
        this.AHWU = var4;
        this.AHWW = var5;

    }

    public RuleOnFieldsContainer getConditionLeft() {
        return this.AHWV;
    }

    public LogicalOperator getLogicalOperator() {
        return this.AHWU;
    }

    public RuleOnFieldsContainer getConditionRight() {
        return this.AHWW;
    }

    public ValueContainer2<ActionResult, String> AICY(Map<FieldType, BaseField> var1) {

        ValueContainer2 var14;
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("fields " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionLeft " + this.AHWV);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("logicalOperator " + this.AHWU);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionRight " + this.AHWW);
        boolean var2 = false;
        BaseField var3 = var1.get(this.AHWV.getDeclaredFieldType());
        BaseField var4 = var1.get(this.AHWW.getDeclaredFieldType());
        ValueContainer2 var5 = null;
        ValueContainer2 var6 = null;
        String var7;
        if (var3.AIDH() && var4.AIDH()) {
            var5 = this.AHWV.getActionOnField().AICX(var3);
            var6 = this.AHWW.getActionOnField().AICX(var4);
            switch (this.AHWU) {
                case AND:
                    var2 = var5.getFirstValue().equals(ActionResult.SUCCESS) & var6.getFirstValue().equals(ActionResult.SUCCESS);
                    break;
                case OR:
                    var2 = var5.getFirstValue().equals(ActionResult.SUCCESS) | var6.getFirstValue().equals(ActionResult.SUCCESS);
                    break;
                case XOR:
                    var2 = var5.getFirstValue().equals(ActionResult.SUCCESS) ^ var6.getFirstValue().equals(ActionResult.SUCCESS);
                    break;
                case NXOR:
                    var2 = var5.getFirstValue().equals(ActionResult.SUCCESS) == var6.getFirstValue().equals(ActionResult.SUCCESS);
                    break;
                case IMPLY:
                    boolean var12 = var5.getFirstValue().equals(ActionResult.SUCCESS);
                    if (var12) {
                        var2 = var6.getFirstValue().equals(ActionResult.SUCCESS);
                    } else {
                        var2 = true;
                    }
                    break;
                default:
                    throw new FFI("Invalid logicalOperator [" + this.AHWU + "]!");
            }
        } else {
            var7 = FCW.getInstance().getMessageForKey("micro.rules.field.valueoffield") + " " + var3.getFieldType().name() + " " + (var3.AIDH() ? ConditionType.ISSET.getDescription() : ConditionType.ISNOTSET.getDescription());
            String var8 = FCW.getInstance().getMessageForKey("micro.rules.field.valueoffield") + " " + var4.getFieldType().name() + " " + (var4.AIDH() ? ConditionType.ISSET.getDescription() : ConditionType.ISNOTSET.getDescription());
            var5 = new ValueContainer2(null, var7);
            var6 = new ValueContainer2(null, var8);
        }

        if (var2) {
            ValueContainer2 var15 = new ValueContainer2(ActionResult.SUCCESS, null);
            return var15;
        }

        var7 = null;
        ActionResult var13;
        switch (this.AHTY) {
            case WARNING:
                var13 = ActionResult.WARNING;
                break;
            case ERROR:
                var13 = ActionResult.ERROR;
                break;
            default:
                throw new FFI("Invalid actionType [" + this.AHTY + "]!");
        }

        var14 = new ValueContainer2(var13, this.AIDU("", (String) var5.getSecondValue(), (String) var6.getSecondValue()));

        return var14;
    }

    private String AIDU(String var1, String var2, String var3) {
        String var4 = super.AICW(var1).replaceAll("##LOGICAL_OPERATOR##", Matcher.quoteReplacement(this.AHWU.getDescription()));
        String var5 = var2 != null ? var2 : "OK";
        var4 = var4.replaceAll("##RULE_LEFT_RESULT##", Matcher.quoteReplacement(var5));
        String var6 = var3 != null ? var3 : "OK";
        var4 = var4.replaceAll("##RULE_RIGHT_RESULT##", Matcher.quoteReplacement(var6));
        return var4;
    }

    public String toString() {
        return "RuleOnFields [actionType=" + this.AHTY + ", logicalOperator=" + this.AHWU + ", conditionLeft=" + this.AHWV + ", conditionRight=" + this.AHWW + "]";
    }
}
