package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;

public enum KH implements JM {
    M1(FCW.getInstance().getMessageForKey("micro.model.type.month.1"), 1),
    M2(FCW.getInstance().getMessageForKey("micro.model.type.month.2"), 2),
    M3(FCW.getInstance().getMessageForKey("micro.model.type.month.3"), 3),
    M4(FCW.getInstance().getMessageForKey("micro.model.type.month.4"), 4),
    M5(FCW.getInstance().getMessageForKey("micro.model.type.month.5"), 5),
    M6(FCW.getInstance().getMessageForKey("micro.model.type.month.6"), 6),
    M7(FCW.getInstance().getMessageForKey("micro.model.type.month.7"), 7),
    M8(FCW.getInstance().getMessageForKey("micro.model.type.month.8"), 8),
    M9(FCW.getInstance().getMessageForKey("micro.model.type.month.9"), 9),
    M10(FCW.getInstance().getMessageForKey("micro.model.type.month.10"), 10),
    M11(FCW.getInstance().getMessageForKey("micro.model.type.month.11"), 11),
    M12(FCW.getInstance().getMessageForKey("micro.model.type.month.12"), 12);

    private final String AOO;
    private final int AOP;

    KH(String var3, int var4) {
        this.AOO = var3;
        this.AOP = var4;
    }

    public String getDescription() {
        return this.AOO;
    }

    public int getNumber() {
        return this.AOP;
    }

    public static KH getMonthByNumber(int var0) {
        KH[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            KH var4 = var1[var3];
            if (var4.getNumber() == var0) {
                return var4;
            }
        }

        return null;
    }

    public String getMonthNumberString() {
        Integer var1 = new Integer(this.AOP);
        String var2 = var1.toString();
        if (var2.length() == 1) {
            String var3 = "0";
            var2 = var3.concat(var2);
        }

        return var2;
    }

    public Integer getMonthLength() {
        Integer var1 = -1;
        if (this.AOP <= 7) {
            if (this.AOP % 2 != 0) {
                var1 = 31;
            } else if (this.AOP != 2) {
                var1 = 30;
            } else {
                var1 = 28;
            }
        } else if (this.AOP % 2 == 0) {
            var1 = 31;
        } else {
            var1 = 30;
        }

        return var1;
    }

    public static KH getMonthByIntValue(int var0) {
        switch (var0) {
            case 1:
                return M1;
            case 2:
                return M2;
            case 3:
                return M3;
            case 4:
                return M4;
            case 5:
                return M5;
            case 6:
                return M6;
            case 7:
                return M7;
            case 8:
                return M8;
            case 9:
                return M9;
            case 10:
                return M10;
            case 11:
                return M11;
            case 12:
                return M12;
            default:
                return null;
        }
    }

    public int DAQ(JM var1) {
        return this.compareTo((KH) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
