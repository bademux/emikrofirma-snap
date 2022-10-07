package a.a.a.c.f.b;

import java.time.LocalDate;

public class EZT {
    private final LocalDate GWJ;
    private final LocalDate GWK;
    private final String GWL;
    private final boolean GWM;

    public EZT(LocalDate var1, LocalDate var2, String var3, boolean var4) {
        this.GWJ = var1;
        this.GWK = var2;
        this.GWL = var3;
        this.GWM = var4;
    }

    public LocalDate getStartDate() {
        return this.GWJ;
    }

    public LocalDate getEndDate() {
        return this.GWK;
    }

    public String getReasonText() {
        return this.GWL;
    }

    public boolean getDisable() {
        return this.GWM;
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.GWM ? 1231 : 1237);
        var2 = 31 * var2 + (this.GWK == null ? 0 : this.GWK.hashCode());
        var2 = 31 * var2 + (this.GWJ == null ? 0 : this.GWJ.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 == null) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            EZT var2 = (EZT) var1;
            if (this.GWM != var2.GWM) {
                return false;
            } else {
                if (this.GWK == null) {
                    if (var2.GWK != null) {
                        return false;
                    }
                } else if (!this.GWK.equals(var2.GWK)) {
                    return false;
                }

                if (this.GWJ == null) {
                    return var2.GWJ == null;
                } else return this.GWJ.equals(var2.GWJ);
            }
        }
    }
}
