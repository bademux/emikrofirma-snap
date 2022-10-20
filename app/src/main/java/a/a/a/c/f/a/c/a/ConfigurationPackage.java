package a.a.a.c.f.a.c.a;

import a.a.a.c.e.a.d.ValueContainer1;
import a.a.a.c.f.a.c.a.b.Constant;
import a.a.a.c.f.a.c.a.b.AHDL;
import a.a.a.c.f.a.c.a.b.AHDM;
import a.a.a.c.f.a.c.a.b.AHDN;
import a.a.a.c.f.a.c.a.c.ParentField;
import a.a.a.c.f.a.c.a.c.SelectedField;
import a.a.a.c.f.a.c.a.f.*;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;

import java.io.OutputStream;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationPackage extends AHDI {
    @XmlElements({@XmlElement(
            name = "variableDate",
            type = AHEN.class
    ), @XmlElement(
            name = "variableDateTime",
            type = AHEO.class
    ), @XmlElement(
            name = "variableBigDecimal",
            type = AHEM.class
    ), @XmlElement(
            name = "variableInteger",
            type = AHEP.class
    )})
    private final List<Variable<?>> AHVK;
    @XmlElements({@XmlElement(
            name = "constantDate",
            type = AHDM.class
    ), @XmlElement(
            name = "constantBigDecimal",
            type = AHDL.class
    ), @XmlElement(
            name = "constantInteger",
            type = AHDN.class
    )})
    private final List<Constant<?>> AHVL;
    @XmlElement(
            name = "selectedFields"
    )
    private final List<SelectedField> AHVM;
    @XmlElement(
            name = "parentFields"
    )
    private final Set<ParentField> AHVN;
    @XmlElement(
            name = "conditionsOnVariables"
    )
    private final List<ActionOnVariable<?>> AHVO;

    public ConfigurationPackage() {

        this.AHVK = new ArrayList();
        this.AHVL = new ArrayList();
        this.AHVM = new ArrayList();
        this.AHVN = new HashSet();
        this.AHVO = new ArrayList();

    }

    public List<Variable<?>> getVariables() {
        return this.AHVK;
    }

    public List<Constant<?>> getConstants() {
        return this.AHVL;
    }

    public List<SelectedField> getSelectedFields() {
        return this.AHVM;
    }

    public Set<ParentField> getParentFields() {
        return this.AHVN;
    }

    public List<ActionOnVariable<?>> getConditionsOnVariables() {
        return this.AHVO;
    }

    public void AIDD(OutputStream var1, ValueContainer1<Integer> var2, String var3) {

        Iterator var4 = this.AHVO.iterator();

        while (var4.hasNext()) {
            ActionOnVariable var5 = (ActionOnVariable) var4.next();
            var5.AICZ();
        }

    }

    public AHCI getFinalActionResult() {
        AHCI var1 = AHCI.SUCCESS;

        Iterator var2;
        SelectedField var3;
        for (var2 = this.AHVM.iterator(); var2.hasNext(); var1 = this.AIDE(var1, var3.getGeneralResult())) {
            var3 = (SelectedField) var2.next();
        }

        ParentField var4;
        for (var2 = this.AHVN.iterator(); var2.hasNext(); var1 = this.AIDE(var1, var4.getGeneralResult())) {
            var4 = (ParentField) var2.next();
        }

        return var1;
    }

    private AHCI AIDE(AHCI var1, AHCI var2) {
        boolean var3 = true;
        int var4;
        if (var1.getLevel() >= var2.getLevel()) {
            var4 = var1.getLevel();
        } else {
            var4 = var2.getLevel();
        }

        return AHCI.getByLevel(var4);
    }

    public static String AIDF(String var0, boolean var1) {
        StringBuilder var2 = new StringBuilder();
        var2.append(FCW.getInstance().getMessageForKey("micro.rules.header.index")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.mainresultkey")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.mainresultdescription")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.mainresultvalue"));
        if (var1) {
            var2.append(System.lineSeparator());
        }

        return var2.toString();
    }

    public static String AIDG(String var0, boolean var1) {
        StringBuilder var2 = new StringBuilder();
        var2.append(FCW.getInstance().getMessageForKey("micro.rules.header.field")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.index")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.mainresultkey")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.mainresultdescription")).append(var0).append(FCW.getInstance().getMessageForKey("micro.rules.header.mainresultvalue"));
        if (var1) {
            var2.append(System.lineSeparator());
        }

        return var2.toString();
    }

    public String toString() {
        return "ConfigurationPackage [variables=" + this.AHVK + ", constants=" + this.AHVL + ", selectedFields=" + this.AHVM + ", parentFields=" + this.AHVN + ", conditionsOnVariables=" + this.AHVO + "]";
    }
}
