package a.a.a.c.c.d.h;

import a.a.a.c.c.d.ENI;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public abstract class EPL extends EPF {
    protected final DecimalFormat FQJ;

    public EPL(ResourceBundle var1, File var2) {
        super(var1, var2);

        this.FQJ = ENI.get();

    }

    public String HOI(BigDecimal var1) {
        String var2 = this.FQJ.format(var1);
        return this.HOJ(var2);
    }

    public String HOJ(String var1) {
        return var1.replace(this.FQJ.getDecimalFormatSymbols().getGroupingSeparator(), ' ');
    }

    public String HOK(BigDecimal var1) {
        var1 = var1.setScale(2, RoundingMode.FLOOR);
        long var2 = var1.longValue();
        short var4 = var1.remainder(BigDecimal.ONE).movePointRight(var1.scale()).abs().toBigInteger().shortValue();
        String var5 = this.HON(var2);
        var5 = var5 + this.getEnding(AmountType.ZLOTY, var2) + ", ";
        var5 = var5 + this.HON(var4);
        var5 = var5 + this.getEnding(AmountType.GROSZ, var4);
        return var5;
    }

    protected String HOL(String var1, int var2) {
        StringBuilder var3 = new StringBuilder();
        String[] var4 = var1.split(" ");
        String[] var5 = var4;
        int var6 = var4.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            if (var8.length() > var2) {
                var3.append(this.HOM(var8, var2));
            } else {
                var3.append(var8);
            }

            var3.append(' ');
        }

        return var3.toString();
    }

    protected String HOM(String var1, int var2) {
        int var3 = 0;

        for (int var4 = 0; var4 < var1.length(); var4 += var2) {
            if (var4 + var3 < var1.length() - 1) {
                var1 = var1.substring(0, var4 + var3) + "\u200b" + var1.substring(var4 + var3);
                ++var3;
            }
        }

        return var1;
    }

    public String HON(long var1) {
        String[] var3 = new String[]{null, this.FPQ.getString("micro.model.commons.numberToWord.1"), this.FPQ.getString("micro.model.commons.numberToWord.2"), this.FPQ.getString("micro.model.commons.numberToWord.3"), this.FPQ.getString("micro.model.commons.numberToWord.4"), this.FPQ.getString("micro.model.commons.numberToWord.5"), this.FPQ.getString("micro.model.commons.numberToWord.6"), this.FPQ.getString("micro.model.commons.numberToWord.7"), this.FPQ.getString("micro.model.commons.numberToWord.8"), this.FPQ.getString("micro.model.commons.numberToWord.9")};
        String[] var4 = new String[]{null, this.FPQ.getString("micro.model.commons.numberToWord.11"), this.FPQ.getString("micro.model.commons.numberToWord.12"), this.FPQ.getString("micro.model.commons.numberToWord.13"), this.FPQ.getString("micro.model.commons.numberToWord.14"), this.FPQ.getString("micro.model.commons.numberToWord.15"), this.FPQ.getString("micro.model.commons.numberToWord.16"), this.FPQ.getString("micro.model.commons.numberToWord.17"), this.FPQ.getString("micro.model.commons.numberToWord.18"), this.FPQ.getString("micro.model.commons.numberToWord.19")};
        String[] var5 = new String[]{null, this.FPQ.getString("micro.model.commons.numberToWord.10"), this.FPQ.getString("micro.model.commons.numberToWord.20"), this.FPQ.getString("micro.model.commons.numberToWord.30"), this.FPQ.getString("micro.model.commons.numberToWord.40"), this.FPQ.getString("micro.model.commons.numberToWord.50"), this.FPQ.getString("micro.model.commons.numberToWord.60"), this.FPQ.getString("micro.model.commons.numberToWord.70"), this.FPQ.getString("micro.model.commons.numberToWord.80"), this.FPQ.getString("micro.model.commons.numberToWord.90")};
        String[] var6 = new String[]{null, this.FPQ.getString("micro.model.commons.numberToWord.100"), this.FPQ.getString("micro.model.commons.numberToWord.200"), this.FPQ.getString("micro.model.commons.numberToWord.300"), this.FPQ.getString("micro.model.commons.numberToWord.400"), this.FPQ.getString("micro.model.commons.numberToWord.500"), this.FPQ.getString("micro.model.commons.numberToWord.600"), this.FPQ.getString("micro.model.commons.numberToWord.700"), this.FPQ.getString("micro.model.commons.numberToWord.800"), this.FPQ.getString("micro.model.commons.numberToWord.900")};
        String[][] var7 = new String[][]{{null, null, null}, {this.FPQ.getString("micro.model.commons.numberToWord.000.0"), this.FPQ.getString("micro.model.commons.numberToWord.000.2"), this.FPQ.getString("micro.model.commons.numberToWord.000.5")}, {this.FPQ.getString("micro.model.commons.numberToWord.000000.0"), this.FPQ.getString("micro.model.commons.numberToWord.000000.2"), this.FPQ.getString("micro.model.commons.numberToWord.000000.5")}, {this.FPQ.getString("micro.model.commons.numberToWord.000000000.0"), this.FPQ.getString("micro.model.commons.numberToWord.000000000.0"), this.FPQ.getString("micro.model.commons.numberToWord.000000000.0")}};
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        long var14 = 0L;
        long var16 = 0L;
        long var18 = 0L;
        String var20 = "";
        String var21 = null;
        if (var1 < 0L) {
            var21 = this.FPQ.getString("micro.model.commons.numberToWord.minus");
            var1 = -var1;
        }

        if (var1 == 0L) {
            var20 = this.FPQ.getString("micro.model.commons.numberToWord.all_zeros") + " ";
        }

        do {
            if (var1 == 0L) {
                if (var21 != null) {
                    var20 = var21 + " " + var20;
                }

                return var20;
            }

            var14 = var1 % 1000L / 100L;
            var12 = var1 % 100L / 10L;
            var8 = var1 % 10L;
            if (var12 == 1L & var8 > 0L) {
                var10 = var8;
                var12 = 0L;
                var8 = 0L;
            } else {
                var10 = 0L;
            }

            if (var8 == 1L & var14 + var12 + var10 == 0L) {
                var18 = 0L;
                if (var14 + var12 == 0L && var16 > 0L) {
                    var8 = 0L;
                    if (var16 != 0L) {
                        var20 = var7[(int) var16][(int) var18] + " " + var20;
                    }
                }
            } else if (var8 == 2L) {
                var18 = 1L;
            } else if (var8 == 3L) {
                var18 = 1L;
            } else if (var8 == 4L) {
                var18 = 1L;
            } else {
                var18 = 2L;
            }

            if (var14 + var12 + var10 + var8 > 0L) {
                if (var16 != 0L) {
                    var20 = var7[(int) var16][(int) var18] + " " + var20;
                }

                if (var8 != 0L) {
                    var20 = var3[(int) var8] + " " + var20;
                }

                if (var10 != 0L) {
                    var20 = var4[(int) var10] + " " + var20;
                }

                if (var12 != 0L) {
                    var20 = var5[(int) var12] + " " + var20;
                }

                if (var14 != 0L) {
                    var20 = var6[(int) var14] + " " + var20;
                }
            }

            var1 /= 1000L;
            ++var16;
        } while (var16 <= 3L);

        return "";
    }

    public String getEnding(AmountType var1, long var2) {
        if (var2 < 0L) {
            var2 = -var2;
        }

        byte var6;
        int var4 = (int) var2 % 100 / 10;
        int var5 = (int) var2 % 10;
        var6 = 0;
        label55:
        switch (var4) {
            case 0:
                switch (var5) {
                    case 0:
                        var6 = 2;
                        break label55;
                    case 1:
                        if (var2 == 1L) {
                            var6 = 0;
                        } else {
                            var6 = 2;
                        }
                        break label55;
                    case 2:
                        var6 = 1;
                        break label55;
                    case 3:
                        var6 = 1;
                        break label55;
                    case 4:
                        var6 = 1;
                        break label55;
                    case 5:
                        var6 = 2;
                        break label55;
                    case 6:
                        var6 = 2;
                        break label55;
                    case 7:
                        var6 = 2;
                        break label55;
                    case 8:
                        var6 = 2;
                        break label55;
                    case 9:
                        var6 = 2;
                    default:
                        break label55;
                }
            case 1:
                var6 = 2;
                break;
            default:
                switch (var5) {
                    case 0:
                        var6 = 2;
                        break;
                    case 1:
                        var6 = 2;
                        break;
                    case 2:
                        var6 = 1;
                        break;
                    case 3:
                        var6 = 1;
                        break;
                    case 4:
                        var6 = 1;
                        break;
                    case 5:
                        var6 = 2;
                        break;
                    case 6:
                        var6 = 2;
                        break;
                    case 7:
                        var6 = 2;
                        break;
                    case 8:
                        var6 = 2;
                        break;
                    case 9:
                        var6 = 2;
                }
        }

        switch (var1) {
            case ZLOTY:
                switch (var6) {
                    case 0:
                        return this.FPQ.getString("micro.model.commons.numberToWord.PLN.0");
                    case 1:
                        return this.FPQ.getString("micro.model.commons.numberToWord.PLN.2");
                    case 2:
                        return this.FPQ.getString("micro.model.commons.numberToWord.PLN.5");
                    default:
                        return "";
                }
            case GROSZ:
                switch (var6) {
                    case 0:
                        return this.FPQ.getString("micro.model.commons.numberToWord.partPLN.0");
                    case 1:
                        return this.FPQ.getString("micro.model.commons.numberToWord.partPLN.2");
                    case 2:
                        return this.FPQ.getString("micro.model.commons.numberToWord.partPLN.5");
                    default:
                        return "";
                }
            default:
                return "";
        }
    }
}
