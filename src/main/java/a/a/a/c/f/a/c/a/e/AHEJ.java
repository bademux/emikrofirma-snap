package a.a.a.c.f.a.c.a.e;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.AHCF;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.a.AHDG;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.g.b.FCW;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import java.util.Map;
import java.util.regex.Matcher;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEJ extends AHCF {
    @XmlAttribute
    protected final AHEG AHWU;
    protected final AHEK AHWV;
    protected final AHEK AHWW;

    private AHEJ() {
        EXF.getInstance().ICO();

        try {
            this.AHWV = null;
            this.AHWU = null;
            this.AHWW = null;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEJ(AHCJ var1, String var2, AHEK var3, AHEG var4, AHEK var5) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.AHWV = var3;
            this.AHWU = var4;
            this.AHWW = var5;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEK getConditionLeft() {
        return this.AHWV;
    }

    public AHEG getLogicalOperator() {
        return this.AHWU;
    }

    public AHEK getConditionRight() {
        return this.AHWW;
    }

    public EVZ<AHCI, String> AICY(Map<AHDS, AHDT> var1) {
        EXF.getInstance().ICO();

        EVZ var14;
        try {
            EXF.getInstance().ICK("fields " + var1);
            EXF.getInstance().ICK("conditionLeft " + this.AHWV);
            EXF.getInstance().ICK("logicalOperator " + this.AHWU);
            EXF.getInstance().ICK("conditionRight " + this.AHWW);
            boolean var2 = false;
            AHDT var3 = var1.get(this.AHWV.getDeclaredFieldType());
            AHDT var4 = var1.get(this.AHWW.getDeclaredFieldType());
            EVZ var5 = null;
            EVZ var6 = null;
            String var7;
            if (var3.AIDH() && var4.AIDH()) {
                var5 = this.AHWV.getActionOnField().AICX(var3);
                var6 = this.AHWW.getActionOnField().AICX(var4);
                switch (this.AHWU) {
                    case AND:
                        var2 = var5.getFirstValue().equals(AHCI.SUCCESS) & var6.getFirstValue().equals(AHCI.SUCCESS);
                        break;
                    case OR:
                        var2 = var5.getFirstValue().equals(AHCI.SUCCESS) | var6.getFirstValue().equals(AHCI.SUCCESS);
                        break;
                    case XOR:
                        var2 = var5.getFirstValue().equals(AHCI.SUCCESS) ^ var6.getFirstValue().equals(AHCI.SUCCESS);
                        break;
                    case NXOR:
                        var2 = var5.getFirstValue().equals(AHCI.SUCCESS) == var6.getFirstValue().equals(AHCI.SUCCESS);
                        break;
                    case IMPLY:
                        boolean var12 = var5.getFirstValue().equals(AHCI.SUCCESS);
                        if (var12) {
                            var2 = var6.getFirstValue().equals(AHCI.SUCCESS);
                        } else {
                            var2 = true;
                        }
                        break;
                    default:
                        throw new FFI("Invalid logicalOperator [" + this.AHWU + "]!");
                }
            } else {
                var7 = FCW.getInstance().getMessageForKey("micro.rules.field.valueoffield") + " " + var3.getFieldType().name() + " " + (var3.AIDH() ? AHDG.ISSET.getDescription() : AHDG.ISNOTSET.getDescription());
                String var8 = FCW.getInstance().getMessageForKey("micro.rules.field.valueoffield") + " " + var4.getFieldType().name() + " " + (var4.AIDH() ? AHDG.ISSET.getDescription() : AHDG.ISNOTSET.getDescription());
                var5 = new EVZ(null, var7);
                var6 = new EVZ(null, var8);
            }

            if (var2) {
                EVZ var15 = new EVZ(AHCI.SUCCESS, null);
                return var15;
            }

            var7 = null;
            AHCI var13;
            switch (this.AHTY) {
                case WARNING:
                    var13 = AHCI.WARNING;
                    break;
                case ERROR:
                    var13 = AHCI.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            var14 = new EVZ(var13, this.AIDU("", (String) var5.getSecondValue(), (String) var6.getSecondValue()));
        } finally {
            EXF.getInstance().ICP();
        }

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
