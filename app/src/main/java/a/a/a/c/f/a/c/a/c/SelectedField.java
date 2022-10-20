package a.a.a.c.f.a.c.a.c;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.e.a.d.ValueContainer1;
import a.a.a.c.f.a.c.a.AHCE;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.a.*;
import a.a.a.c.f.a.c.a.d.*;
import a.a.a.c.f.a.c.a.e.RuleOnField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class SelectedField extends Field {
    private transient AHCI AHWE;
    @XmlElements({@XmlElement(
            name = "operationOnFieldAndVariableDate",
            type = AHEB.class
    ), @XmlElement(
            name = "operationOnFieldAndVariableDateTime",
            type = AHEC.class
    ), @XmlElement(
            name = "OperationOnFieldAndVariableBigDecimal",
            type = AHEA.class
    ), @XmlElement(
            name = "operationOnFieldAndVariableInteger",
            type = AHED.class
    )})
    protected final List<OperationOnFieldAbstract> AHWF;
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
            name = "conditionOnFieldAndConstantBigDecimal",
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
    protected final List<AHCE> AHWG;

    private SelectedField() {

        this.AHWE = AHCI.SUCCESS;
        this.AHWF = new ArrayList();
        this.AHWG = new ArrayList();

    }

    public SelectedField(AHDS var1) {
        this(var1, new ArrayList(), new ArrayList());

    }

    public SelectedField(AHDS var1, List<OperationOnFieldAbstract> var2, List<AHCE> var3) {
        super(var1);

        this.AHWE = AHCI.SUCCESS;
        this.AHWF = var2;
        this.AHWG = var3;

    }

    public AHCI getGeneralResult() {
        return this.AHWE;
    }

    public List<OperationOnFieldAbstract> getOperations() {
        return this.AHWF;
    }

    public List<AHCE> getRules() {
        return this.AHWG;
    }

    public void AIDN() {

        Iterator var1 = this.AHWF.iterator();

        while (var1.hasNext()) {
            OperationOnFieldAbstract var2 = (OperationOnFieldAbstract) var1.next();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("operation " + var2);
            var2.AIDR(this);
        }

    }

    public void AIDO(OutputStream var1, ValueContainer1<Integer> var2, String var3) {

        try {
            Iterator var4 = this.AHWG.iterator();

            while (var4.hasNext()) {
                AHCE var5 = (AHCE) var4.next();
                org.slf4j.LoggerFactory.getLogger(getClass()).debug("rule " + var5);
                ValueContainer2 var6 = var5.AICX(this);
                switch ((AHCI) var6.getFirstValue()) {
                    case SUCCESS:
                        break;
                    case WARNING:
                    case ERROR:
                        this.AHWE = this.AIDP(this.AHWE, (AHCI) var6.getFirstValue());
                        var2.setFirstValue(var2.getFirstValue() + 1);
                        String var7 = this.getFieldType() + var3 + var3 + var6.getFirstValue() + var3 + ((AHCI) var6.getFirstValue()).getDescription() + var3 + var6.getSecondValue() + System.lineSeparator();
                        org.slf4j.LoggerFactory.getLogger(getClass()).info(var7);
                        var1.write(var7.getBytes(StandardCharsets.UTF_8));
                        var1.flush();
                        break;
                    default:
                        throw new FFI("Invalid actionResult [" + this.AHWE + "]!");
                }
            }
        } catch (IOException var11) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var11);
        }

    }

    private AHCI AIDP(AHCI var1, AHCI var2) {
        boolean var3 = true;
        int var4;
        if (var1.getLevel() >= var2.getLevel()) {
            var4 = var1.getLevel();
        } else {
            var4 = var2.getLevel();
        }

        return AHCI.getByLevel(var4);
    }

    public String toString() {
        return "SelectedField [set=" + this.AHVV + ", fieldType=" + this.AHVW + ", value=" + this.AHVX + ", operations=" + this.AHWF + ", rules=" + this.AHWG + "]";
    }
}
