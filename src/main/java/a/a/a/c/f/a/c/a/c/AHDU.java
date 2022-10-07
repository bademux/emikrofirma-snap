package a.a.a.c.f.a.c.a.c;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.d.EWD;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHDI;
import a.a.a.c.f.a.c.a.a.AHDC;
import a.a.a.c.f.a.c.a.d.AHEE;
import a.a.a.c.f.a.c.a.e.AHEJ;

import javax.xml.bind.annotation.*;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHDU extends AHDI {
    private transient AHCI AHVY;
    private transient Long AHVZ;
    @XmlAttribute(
            name = "fieldType"
    )
    protected final AHDS AHWA;
    @XmlElement(
            name = "childFields"
    )
    protected final Set<AHDO> AHWB;
    @XmlElements({})
    protected final List<AHEE> AHWC;
    @XmlElements({@XmlElement(
            name = "conditionOnFieldsAndCustomAction",
            type = AHDC.class
    ), @XmlElement(
            name = "ruleOnFields",
            type = AHEJ.class
    )})
    protected final List<AHCF> AHWD;

    private AHDU() {
        EXF.getInstance().ICO();

        try {
            this.AHVY = AHCI.SUCCESS;
            this.AHVZ = 0L;
            this.AHWA = null;
            this.AHWB = new HashSet();
            this.AHWC = new ArrayList();
            this.AHWD = new ArrayList();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHDU(AHDS var1) {
        this(var1, new HashSet(), new ArrayList(), new ArrayList());
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public AHDU(AHDS var1, Set<AHDO> var2, List<AHEE> var3, List<AHCF> var4) {
        EXF.getInstance().ICO();

        try {
            this.AHVY = AHCI.SUCCESS;
            this.AHVZ = 0L;
            this.AHWA = var1;
            this.AHWB = var2;
            this.AHWC = var3;
            this.AHWD = var4;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHCI getGeneralResult() {
        return this.AHVY;
    }

    public void AIDJ() {
        this.AHVZ = this.AHVZ + 1L;
    }

    public AHDS getFieldType() {
        return this.AHWA;
    }

    public Set<AHDO> getChildFields() {
        return this.AHWB;
    }

    public List<AHEE> getOperations() {
        return this.AHWC;
    }

    public List<AHCF> getRules() {
        return this.AHWD;
    }

    public void AIDK() {
        EXF.getInstance().ICO();

        try {
            Iterator var1 = this.AHWC.iterator();

            while (var1.hasNext()) {
                AHEE var2 = (AHEE) var1.next();
                var2.AIDS(this.AHWB);
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void AIDL(OutputStream var1, EWD<Integer> var2, String var3) {
        EXF.getInstance().ICO();

        try {
            HashMap var4 = new HashMap();
            Iterator var5 = this.AHWB.iterator();

            while (var5.hasNext()) {
                AHDO var6 = (AHDO) var5.next();
                var4.put(var6.getFieldType(), var6);
            }

            var5 = this.AHWD.iterator();

            while (var5.hasNext()) {
                AHCF var14 = (AHCF) var5.next();
                EXF.getInstance().ICK("rule " + var14);
                EVZ var7 = var14.AICY(var4);
                switch ((AHCI) var7.getFirstValue()) {
                    case SUCCESS:
                        break;
                    case WARNING:
                    case ERROR:
                        this.AHVY = this.AIDM(this.AHVY, (AHCI) var7.getFirstValue());
                        var2.setFirstValue(var2.getFirstValue() + 1);
                        String var8 = this.getFieldType() + var3 + this.AHVZ + var3 + var7.getFirstValue() + var3 + ((AHCI) var7.getFirstValue()).getDescription() + var3 + var7.getSecondValue() + System.lineSeparator();
                        EXF.getInstance().ICE(var8);
                        var1.write(var8.getBytes(StandardCharsets.UTF_8));
                        var1.flush();
                        break;
                    default:
                        throw new FFI("Invalid actionResult [" + this.AHVY + "]!");
                }
            }
        } catch (IOException var12) {
            EXF.getInstance().ICA(var12);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void executeReset() {
        EXF.getInstance().ICO();

        try {
            Iterator var1 = this.AHWB.iterator();

            while (var1.hasNext()) {
                AHDO var2 = (AHDO) var1.next();
                var2.reset();
            }
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private AHCI AIDM(AHCI var1, AHCI var2) {
        boolean var3 = true;
        int var4;
        if (var1.getLevel() >= var2.getLevel()) {
            var4 = var1.getLevel();
        } else {
            var4 = var2.getLevel();
        }

        return AHCI.getByLevel(var4);
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.AHWA == null ? 0 : this.AHWA.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (!super.equals(var1)) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            AHDU var2 = (AHDU) var1;
            return this.AHWA == var2.AHWA;
        }
    }

    public String toString() {
        return "ParentField [fieldType=" + this.AHWA + ", childFields=" + this.AHWB + ", operations=" + this.AHWC + ", rules=" + this.AHWD + "]";
    }
}
