package a.a.a.c.d.g;

import a.a.a.c.e.a.j.EXC;
import a.a.a.c.f.b.c.JR;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ERF {
    private final boolean FZE;
    private final int FZF;
    private final int FZG;
    private final String FZH;
    private final DecimalFormat FZI;

    public ERF(boolean var1, int var2, int var3) {
        this.FZE = var1;
        this.FZF = var2;
        this.FZG = var3;
        this.FZI = (DecimalFormat) DecimalFormat.getInstance(EXC.getInstance().getCurrentLocale());
        this.FZI.setParseBigDecimal(true);
        this.FZI.setMinimumFractionDigits(this.FZG);
        this.FZI.setMaximumFractionDigits(this.FZG);
        this.FZI.setRoundingMode(RoundingMode.HALF_UP);
        boolean var4 = this.FZG > 0;
        this.FZH = (this.FZE ? "^[\\" + this.FZI.getNegativePrefix() + "]{0,1}" : "") + "[\\d]{0," + this.FZF + "}" + (var4 ? "([\\" + this.FZI.getDecimalFormatSymbols().getDecimalSeparator() + "][\\d]{0," + this.FZG + "})?" : "") + "$";
    }

    public String HRW(BigDecimal var1) {
        return var1 != null ? this.FZI.format(var1) : this.FZI.format(BigDecimal.ZERO);
    }

    public BigDecimal HRX(String var1) {
        try {
            return var1 != null ? (BigDecimal) this.FZI.parseObject(var1) : BigDecimal.ZERO;
        } catch (ParseException var3) {
            return BigDecimal.ZERO;
        }
    }

    public String HRY(String var1) {
        if (var1 != null) {
            if (this.FZI.getNegativePrefix().equals(var1)) {
                return this.FZI.getNegativePrefix();
            }

            BigDecimal var2 = this.HRX(var1);
            if (var2 != null) {
                return this.HRW(var2);
            }
        }

        return "";
    }

    public boolean HRZ(String var1) {
        if (var1 != null) {
            String var2 = var1.replaceAll("[\\" + this.FZI.getDecimalFormatSymbols().getGroupingSeparator() + "\\s ]", "");
            return var2.matches(this.FZH);
        }

        return false;
    }

    public char getGroupingSep() {
        return this.FZI.getDecimalFormatSymbols().getGroupingSeparator();
    }

    public static boolean HSA(JR var0, JR var1) {
        if (var0 != null && var1 == null) {
            return false;
        } else if (var0 == null && var1 != null) {
            return false;
        } else if (var0 == null && var1 == null) {
            return true;
        } else if (var0 != null && var0.getValue() != null && var1 != null && var1.getValue() == null) {
            return false;
        } else if (var0 != null && var0.getValue() == null && var1 != null && var1.getValue() != null) {
            return false;
        } else {
            if (var0 != null && var1 != null && var0.getPresicion().equals(var1.getPresicion()) && var0.getScale().equals(var1.getScale()) && var0.DDQ() == var1.DDQ()) {
                ERF var2 = new ERF(var0.DDQ(), var0.getScale(), var0.getPresicion());
                return var2.HRW(var0.getValue()).equals(var2.HRW(var1.getValue()));
            }

            return false;
        }
    }
}
