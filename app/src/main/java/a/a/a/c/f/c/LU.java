package a.a.a.c.f.c;

import a.a.a.b.f.FFI;

public enum LU {
    UserData(a.a.a.c.f.c.b.UserData.class),
    ConfigurationProperties(a.a.a.c.f.c.a.ConfigurationProperties.class);

    private final Class<? extends LW> AQI;

    LU(Class var3) {
        this.AQI = var3;
    }

    public static LU getByType(Class<? extends LW> var0) {
        LU[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            LU var4 = var1[var3];
            if (var4.getType().equals(var0)) {
                return var4;
            }
        }

        throw new FFI("Type [" + var0 + "] not found!");
    }

    public Class<? extends LW> getType() {
        return this.AQI;
    }
}
