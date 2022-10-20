package a.a.a.c.f.a.c.a.e;

import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHDI;
import a.a.a.c.f.a.c.a.a.*;
import a.a.a.c.f.a.c.a.c.AHDS;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEK extends AHDI {
    @XmlAttribute
    protected final AHDS AHWX;
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
            type = AHEH.class
    )})
    protected final AHCE AHWY;

    private AHEK() {

        this.AHWX = null;
        this.AHWY = null;

    }

    public AHEK(AHDS var1, AHCE var2) {

        this.AHWX = var1;
        this.AHWY = var2;

    }

    public AHDS getDeclaredFieldType() {
        return this.AHWX;
    }

    public AHCE getActionOnField() {
        return this.AHWY;
    }

    public String toString() {
        return "RuleOnFieldsContainer [declaredFieldType=" + this.AHWX + ", actionOnField=" + this.AHWY + "]";
    }
}
