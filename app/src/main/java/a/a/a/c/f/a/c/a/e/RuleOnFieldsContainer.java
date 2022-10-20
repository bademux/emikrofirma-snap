package a.a.a.c.f.a.c.a.e;

import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHDI;
import a.a.a.c.f.a.c.a.a.*;
import a.a.a.c.f.a.c.a.c.FieldType;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RuleOnFieldsContainer extends AHDI {
    @XmlAttribute
    protected final FieldType AHWX;
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
    protected final AHCE AHWY;

    private RuleOnFieldsContainer() {

        this.AHWX = null;
        this.AHWY = null;

    }

    public RuleOnFieldsContainer(FieldType var1, AHCE var2) {

        this.AHWX = var1;
        this.AHWY = var2;

    }

    public FieldType getDeclaredFieldType() {
        return this.AHWX;
    }

    public AHCE getActionOnField() {
        return this.AHWY;
    }

    public String toString() {
        return "RuleOnFieldsContainer [declaredFieldType=" + this.AHWX + ", actionOnField=" + this.AHWY + "]";
    }
}
