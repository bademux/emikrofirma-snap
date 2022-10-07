package a.a.a.c.f.a.c.a;

import a.a.a.b.f.FFI;
import a.a.a.c.g.b.FCW;

public enum AHCI {
    SUCCESS(0, FCW.getInstance().getMessageForKey("micro.rules.actionresult.success")),
    WARNING(1, FCW.getInstance().getMessageForKey("micro.rules.actionresult.warning")),
    ERROR(2, FCW.getInstance().getMessageForKey("micro.rules.actionresult.error"));

    private final int AHUB;
    private final String AHUC;

    AHCI(int var3, String var4) {
        this.AHUB = var3;
        this.AHUC = var4;
    }

    public int getLevel() {
        return this.AHUB;
    }

    public String getDescription() {
        return this.AHUC;
    }

    public static AHCI getByLevel(int var0) {
        AHCI[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            AHCI var4 = var1[var3];
            if (var4.getLevel() == var0) {
                return var4;
            }
        }

        throw new FFI("Level [" + var0 + "] not found!");
    }
}
