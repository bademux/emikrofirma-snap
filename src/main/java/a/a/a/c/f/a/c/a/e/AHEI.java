package a.a.a.c.f.a.c.a.e;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHDI;
import a.a.a.c.f.a.c.a.a.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEI extends AHDI {
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
    protected final AHCE AHWT;

    private AHEI() {
        EXF.getInstance().ICO();

        try {
            this.AHWT = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEI(AHCE var1) {
        EXF.getInstance().ICO();

        try {
            this.AHWT = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCE getActionOnField() {
        return this.AHWT;
    }

    public String toString() {
        return "RuleOnFieldContainer [actionOnField=" + this.AHWT + "]";
    }
}
