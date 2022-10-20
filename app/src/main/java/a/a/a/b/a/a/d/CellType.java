package a.a.a.b.a.a.d;

public enum CellType {
    NULL(0),
    TINYINT(-6),
    INTEGER(4),
    REAL(7),
    TEXT(12),
    BLOB(2004),
    DATE(91),
    TIMESTAMP(93);

    private final int HEE;

    CellType(int var3) {
        this.HEE = var3;
    }

    public int getSqlType() {
        return this.HEE;
    }

    public static CellType getCellDataTypeType(int var0) {
        CellType[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            CellType var4 = var1[var3];
            if (var4.getSqlType() == var0) {
                return var4;
            }
        }

        return null;
    }
}
