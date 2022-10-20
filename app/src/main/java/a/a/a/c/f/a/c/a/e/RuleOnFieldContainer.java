package a.a.a.c.f.a.c.a.e;

import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHDI;
import a.a.a.c.f.a.c.a.a.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

@XmlAccessorType(XmlAccessType.FIELD)
public class RuleOnFieldContainer extends AHDI {
    @XmlElements({@XmlElement(
            name = "conditionOnFieldIsSet",
            type = ConditionOnFieldIsSet.class
    ), @XmlElement(
            name = "conditionOnFieldIsNotSet",
            type = ConditionOnFieldIsNotSet.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantDate",
            type = ConditionOnFieldAndConstantDate.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantDateTime",
            type = ConditionOnFieldAndConstantDateTime.class
    ), @XmlElement(
            name = "ConditionOnFieldAndConstantBigDecimal",
            type = ConditionOnFieldAndConstantBigDecimal.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantRegEx",
            type = ConditionOnFieldAndConstantRegEx.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantString",
            type = ConditionOnFieldAndConstantString.class
    ), @XmlElement(
            name = "conditionOnFieldAndCustomAction",
            type = ConditionOnFieldAndCustomAction.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableDate",
            type = ConditionOnFieldAndVariableDate.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableDateTime",
            type = ConditionOnFieldAndVariableDateTime.class
    ), @XmlElement(
            name = "ConditionOnFieldAndVariableBigDecimal",
            type = ConditionOnFieldAndVariableBigDecimal.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableInteger",
            type = ConditionOnFieldAndVariableInteger.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableOffsetDateLong",
            type = ConditionOnFieldAndVariableOffsetDateLong.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableOffsetDateTimeLong",
            type = ConditionOnFieldAndVariableOffsetDateTimeLong.class
    ), @XmlElement(
            name = "ruleOnField",
            type = RuleOnField.class
    )})
    protected final AHCE AHWT;

    private RuleOnFieldContainer() {

        this.AHWT = null;

    }

    public RuleOnFieldContainer(AHCE var1) {

        this.AHWT = var1;

    }

    public AHCE getActionOnField() {
        return this.AHWT;
    }

    public String toString() {
        return "RuleOnFieldContainer [actionOnField=" + this.AHWT + "]";
    }
}
