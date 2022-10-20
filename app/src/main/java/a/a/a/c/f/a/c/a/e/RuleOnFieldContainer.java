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
            type = AHDF.class
    ), @XmlElement(
            name = "conditionOnFieldIsNotSet",
            type = AHDE.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantDate",
            type = AHCN.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantDateTime",
            type = AHCO.class
    ), @XmlElement(
            name = "ConditionOnFieldAndConstantBigDecimal",
            type = AHCM.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantRegEx",
            type = AHCP.class
    ), @XmlElement(
            name = "conditionOnFieldAndConstantString",
            type = AHCQ.class
    ), @XmlElement(
            name = "conditionOnFieldAndCustomAction",
            type = AHCR.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableDate",
            type = AHCY.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableDateTime",
            type = AHCZ.class
    ), @XmlElement(
            name = "ConditionOnFieldAndVariableBigDecimal",
            type = AHCX.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableInteger",
            type = AHDA.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableOffsetDateLong",
            type = AHCW.class
    ), @XmlElement(
            name = "conditionOnFieldAndVariableOffsetDateTimeLong",
            type = AHCV.class
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
