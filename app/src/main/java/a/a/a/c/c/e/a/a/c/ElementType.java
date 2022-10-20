package a.a.a.c.c.e.a.a.c;

import a.a.a.c.g.b.FCW;

import java.util.regex.Pattern;

public enum ElementType {
    text(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.text")),
    year(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.year")),
    month(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.month")),
    day(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.day")),
    sequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.1"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.1.list")),
    sequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.2"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.2.list")),
    sequence3(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.3"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.month.3.list")),
    ysequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.1"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.1.list")),
    ysequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.2"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.year.2.list")),
    hsequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.1"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.1.list")),
    hsequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.2"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.halfyear.2.list")),
    qsequence1(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.1"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.1.list")),
    qsequence2(FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.2"), null, FCW.getInstance().getMessageForKey("micro.config.controll.element.type.sequence.quarter.2.list")),
    separator_slash(null, "/"),
    separator_backslash(null, "\\"),
    separator_underscore(null, "_"),
    separator_minus(null, "-"),
    const_F(null, "F"),
    const_FVAT(null, "FVAT"),
    const_F_VAT(null, "F_VAT"),
    const_FV(null, "FV"),
    const_FA(null, "FA"),
    const_FK(null, "FK"),
    const_KOR(null, "KOR");

    public static String GAO = "[" + Pattern.quote(separator_slash.getLiteral()) + Pattern.quote(separator_backslash.getLiteral()) + Pattern.quote(separator_underscore.getLiteral()) + Pattern.quote(separator_minus.getLiteral()) + "]{1}";
    private final String GAP;
    private final String GAQ;
    private final String QZR;

    ElementType(String var3) {
        this(var3, null);
    }

    ElementType(String var3, String var4) {
        this(var3, var4, null);
    }

    ElementType(String var3, String var4, String var5) {

        this.GAP = var3;
        this.GAQ = var4;
        this.QZR = var5;

    }

    public String getDescription() {
        return this.GAP;
    }

    public String getLiteral() {
        return this.GAQ;
    }

    public String getListDescription() {
        return this.QZR;
    }

    public static ElementType HSD(String var0) {
        if (var0 != null) {
            ElementType[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ElementType var4 = var1[var3];
                if (var0.equals(var4.getLiteral())) {
                    return var4;
                }
            }
        }

        return null;
    }

    public static ElementType RKJ(String var0) {
        if (var0 != null) {
            ElementType[] var1 = values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ElementType var4 = var1[var3];
                if (var0.equals(var4.name())) {
                    return var4;
                }
            }
        }

        return null;
    }
}
