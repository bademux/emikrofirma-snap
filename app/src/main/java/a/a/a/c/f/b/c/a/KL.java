package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public enum KL implements JM {
    RATE_23(false, false, 23.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_23"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_23.jpkName")),
    RATE_8(false, false, 8.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_8"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_8.jpkName")),
    RATE_5(false, false, 5.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_5"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_5.jpkName")),
    RATE_4(false, false, 4.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_4"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_4.jpkName")),
    RATE_0(false, false, 0.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_0"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.rate_0.jpkName")),
    ZW(false, false, 0.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.zw"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.zw.jpkName")),
    NP(false, false, 0.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.np"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.np.jpkName")),
    OO_23(false, true, 23.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.oo_23"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.oo_23.jpkName")),
    OO_8(false, true, 8.0, FCW.getInstance().getMessageForKey("micro.model.type.taxrate.oo_8"), FCW.getInstance().getMessageForKey("micro.model.type.taxrate.oo_8"));

    private final boolean AOV;
    private final boolean AOW;
    private final BigDecimal AOX;
    private final String AOY;
    private final String QMA;

    KL(boolean var3, boolean var4, Double var5, String var6, String var7) {

        this.AOV = var3;
        this.AOW = var4;
        if (var5 != null) {
            this.AOX = BigDecimal.valueOf(var5);
        } else {
            this.AOX = null;
        }

        this.AOY = var6;
        this.QMA = var7;

    }

    public BigDecimal getRate() {
        return this.AOX;
    }

    public boolean DEP() {
        return this.AOV;
    }

    public boolean DEQ() {
        return this.AOW;
    }

    public String getJpkName() {
        return this.QMA;
    }

    public String getDescription() {
        return this.AOY;
    }

    public int DAQ(JM var1) {
        return this.compareTo((KL) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
