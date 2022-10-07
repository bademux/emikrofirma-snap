package a.a.a.c.f.a.c.a;

import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.b.AHDK;
import a.a.a.c.f.a.c.a.b.AHDL;
import a.a.a.c.f.a.c.a.b.AHDM;
import a.a.a.c.f.a.c.a.b.AHDN;
import a.a.a.c.f.a.c.a.c.AHDU;
import a.a.a.c.f.a.c.a.c.AHDV;
import a.a.a.c.f.a.c.a.f.*;
import a.a.a.c.g.b.FCW;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import java.io.OutputStream;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDJ extends AHDI {
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
    private final List<AHEL<?>> AHVK;
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
    private final List<AHDK<?>> AHVL;
    @XmlElement(
            name = "selectedFields"
    )
    private final List<AHDV> AHVM;
    @XmlElement(
            name = "parentFields"
    )
    private final Set<AHDU> AHVN;
    @XmlElement(
            name = "conditionsOnVariables"
    )
    private final List<AHCH<?>> AHVO;

    public AHDJ() {
        EXF.getInstance().ICO();

        try {
            this.AHVK = new ArrayList();
            this.AHVL = new ArrayList();
            this.AHVM = new ArrayList();
            this.AHVN = new HashSet();
            this.AHVO = new ArrayList();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public List<AHEL<?>> getVariables() {
        return this.AHVK;
    }

    public List<AHDK<?>> getConstants() {
        return this.AHVL;
    }

    public List<AHDV> getSelectedFields() {
        return this.AHVM;
    }

    public Set<AHDU> getParentFields() {
        return this.AHVN;
    }

    public List<AHCH<?>> getConditionsOnVariables() {
        return this.AHVO;
    }

    public void AIDD(OutputStream var1, EWD<Integer> var2, String var3) {
        EXF.getInstance().ICO();

        try {
            Iterator var4 = this.AHVO.iterator();

            while (var4.hasNext()) {
                AHCH var5 = (AHCH) var4.next();
                var5.AICZ();
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCI getFinalActionResult() {
        AHCI var1 = AHCI.SUCCESS;

        Iterator var2;
        AHDV var3;
        for (var2 = this.AHVM.iterator(); var2.hasNext(); var1 = this.AIDE(var1, var3.getGeneralResult())) {
            var3 = (AHDV) var2.next();
        }

        AHDU var4;
        for (var2 = this.AHVN.iterator(); var2.hasNext(); var1 = this.AIDE(var1, var4.getGeneralResult())) {
            var4 = (AHDU) var2.next();
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
