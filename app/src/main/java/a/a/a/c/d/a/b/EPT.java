package a.a.a.c.d.a.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.b.AHCB;
import a.a.a.c.f.a.c.a.b.AHDK;
import a.a.a.c.f.a.c.a.c.AHDS;
import a.a.a.c.f.a.c.a.c.AHDT;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class EPT implements AHCB<Map<AHDS, AHDT>> {
    private final AHDK<BigDecimal> FUF;
    private final AHDS FUG;
    private final AHDS FUH;
    private BigDecimal FUI;

    public EPT(AHDK<BigDecimal> var1, String var2, String var3) {
        EXF.getInstance().ICO();

        try {
            this.FUF = var1;
            this.FUG = AHDS.valueOf(var2);
            this.FUH = AHDS.valueOf(var3);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean AIBY(Map<AHDS, AHDT> var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("fields " + var1);
        EXF.getInstance().ICK("constantTax " + this.FUF);
        EXF.getInstance().ICK("netValueFieldName " + this.FUG);
        EXF.getInstance().ICK("taxValueFieldName " + this.FUH);

        boolean var4;
        try {
            this.FUI = null;
            AHDT var2 = var1.get(this.FUG);
            AHDT var3 = var1.get(this.FUH);
            EXF.getInstance().ICK("netValueField " + var2);
            EXF.getInstance().ICK("taxValueField " + var3);
            if (this.FUF != null && this.FUF.getValue().compareTo(BigDecimal.ZERO) > 0 && var2 != null && var2.AIDH() && var3 != null && var3.AIDH()) {
                BigDecimal var9 = (new BigDecimal(var2.getValue())).multiply(this.FUF.getValue()).divide(BigDecimal.valueOf(100.0)).setScale(2, RoundingMode.HALF_UP);
                this.FUI = var9;
                EXF.getInstance().ICK("newTaxValue " + var9);
                boolean var5 = var9.compareTo(new BigDecimal(var3.getValue())) == 0;
                return var5;
            }

            var4 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }

    public String getContextString(Map<AHDS, AHDT> var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("fields " + var1);
        EXF.getInstance().ICK("constantTax " + this.FUF);
        EXF.getInstance().ICK("netValueFieldName " + this.FUG);
        EXF.getInstance().ICK("taxValueFieldName " + this.FUH);

        String var4;
        try {
            AHDT var2 = var1.get(this.FUG);
            AHDT var3 = var1.get(this.FUH);
            EXF.getInstance().ICK("netValueField " + var2);
            EXF.getInstance().ICK("taxValueField " + var3);
            var4 = this.FUG + " (" + var2.getValue() + ") * [" + this.FUF.getValue() + "%] = " + this.FUI + " | " + this.FUH + " (" + var3.getValue() + ")";
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
