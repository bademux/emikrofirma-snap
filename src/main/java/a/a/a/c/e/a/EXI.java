package a.a.a.c.e.a;

public class EXI implements Comparable<EXI> {
    private final int GTI;
    private final int GTJ;
    private final int GTK;
    private final int GTL;

    public EXI(int var1, int var2, int var3, int var4) {
        this.GTI = var1;
        this.GTJ = var2;
        this.GTK = var3;
        this.GTL = var4;
    }

    public EXI(int var1, int var2, int var3) {
        this(var1, var2, var3, 0);
    }

    public EXI(int var1, int var2) {
        this(var1, var2, 0, 0);
    }

    public EXI(String[] var1) {
        this(Integer.parseInt(var1[0]), Integer.parseInt(var1[1]), Integer.parseInt(var1[2]), Integer.parseInt(var1[3]));
    }

    public EXI(String var1) {
        this(IDJ(var1)[0], IDJ(var1)[1], IDJ(var1)[2], IDJ(var1)[3]);
    }

    public EXI(EXI var1) {
        this(var1.getVersionA(), var1.getVersionB(), var1.getVersionC(), var1.getVersionD());
    }

    private static int[] IDJ(String var0) {
        if (var0 == null) {
            throw new RuntimeException("Version parameter is null!");
        } else {
            String[] var1 = var0.split("\\.");
            if (var1.length > 4) {
                throw new RuntimeException("Version parameter [" + var0 + "] has too many elements!");
            } else {
                int[] var2 = new int[4];

                int var3;
                for (var3 = 0; var3 < 4; ++var3) {
                    var2[var3] = 0;
                }

                for (var3 = 0; var3 < var1.length; ++var3) {
                    var2[var3] = Integer.parseInt(var1[var3]);
                }

                return var2;
            }
        }
    }

    public int getVersionA() {
        return this.GTI;
    }

    public int getVersionB() {
        return this.GTJ;
    }

    public int getVersionC() {
        return this.GTK;
    }

    public int getVersionD() {
        return this.GTL;
    }

    public String toString() {
        return "Version [" + this.GTI + "." + this.GTJ + "." + this.GTK + "." + this.GTL + "]";
    }

    public String getVersionString() {
        return this.getVersionString(".");
    }

    public String getVersionString(String var1) {
        return this.GTI + var1 + this.GTJ + var1 + this.GTK + var1 + this.GTL;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 == null) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            EXI var2 = (EXI) var1;
            if (this.GTI != var2.GTI) {
                return false;
            } else if (this.GTJ != var2.GTJ) {
                return false;
            } else if (this.GTK != var2.GTK) {
                return false;
            } else {
                return this.GTL == var2.GTL;
            }
        }
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + this.GTI;
        var2 = 31 * var2 + this.GTJ;
        var2 = 31 * var2 + this.GTK;
        var2 = 31 * var2 + this.GTL;
        return var2;
    }

    public int compareTo(EXI var1) {
        if (this.GTI == var1.getVersionA()) {
            if (this.GTJ == var1.getVersionB()) {
                if (this.GTK == var1.getVersionC()) {
                    if (this.GTL == var1.getVersionD()) {
                        return 0;
                    } else {
                        return this.GTL < var1.getVersionD() ? -1 : 1;
                    }
                } else {
                    return this.GTK < var1.getVersionC() ? -1 : 1;
                }
            } else {
                return this.GTJ < var1.getVersionB() ? -1 : 1;
            }
        } else {
            return this.GTI < var1.getVersionA() ? -1 : 1;
        }
    }
}
