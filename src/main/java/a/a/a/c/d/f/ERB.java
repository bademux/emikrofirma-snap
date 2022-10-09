package a.a.a.c.d.f;

import a.a.a.c.d.e.EQY;
import a.a.a.c.e.a.d.EWC;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.e.HP;
import a.a.a.c.f.b.c.a.KL;


import java.math.BigDecimal;

public class ERB {
    private BigDecimal FYH;
    private BigDecimal FYI;
    private BigDecimal FYJ;
    private BigDecimal FYK;
    private BigDecimal FYL;
    private BigDecimal FYM;
    private BigDecimal QLB;
    private BigDecimal FYN;
    private BigDecimal FYO;
    private BigDecimal FYP;
    private BigDecimal FYQ;
    private BigDecimal FYR;
    private BigDecimal FYS;
    private BigDecimal FYT;
    private BigDecimal FYU;
    private BigDecimal QLC;
    private BigDecimal FYV;
    private BigDecimal FYW;
    private BigDecimal FYX;
    private BigDecimal FYY;
    private BigDecimal FYZ;
    private boolean FZA;
    private final boolean FZB;

    public ERB(boolean var1) {
        this.FYH = BigDecimal.ZERO;
        this.FYI = BigDecimal.ZERO;
        this.FYJ = BigDecimal.ZERO;
        this.FYK = null;
        this.FYL = null;
        this.FYM = null;
        this.QLB = null;
        this.FYN = null;
        this.FYO = null;
        this.FYP = null;
        this.FYQ = null;
        this.FYR = null;
        this.FYS = null;
        this.FYT = null;
        this.FYU = null;
        this.QLC = null;
        this.FYV = null;
        this.FYW = null;
        this.FYX = null;
        this.FYY = null;
        this.FYZ = null;
        this.FZA = true;
        this.FZB = var1;
    }

    public void HRQ(HO var1) {
        this.FZA = false;
        BigDecimal var2 = var1.getNetPriceForAll().getValue();
        BigDecimal var3 = var1.getTaxValueForAll().getValue();
        BigDecimal var4 = var1.getGrossValueForAll().getValue();
        Boolean var5 = null;
        if (var1 instanceof HP) {
            var5 = ((HP) var1).getTaxDeduction50P().getValue();
        }

        KL var6 = var1.DBN().getValue();
        EWC var7 = null;
        switch (var6) {
            case RATE_23:
                var7 = this.QGM(var5, var2, var3, var4, this.getVat23Amount(), this.getVat23Tax(), this.getGrossPrice());
                this.setVat23Amount((BigDecimal) var7.getFirstValue());
                this.setVat23Tax((BigDecimal) var7.getSecondValue());
                break;
            case RATE_8:
                var7 = this.QGM(var5, var2, var3, var4, this.getVat8Amount(), this.getVat8Tax(), this.getGrossPrice());
                this.setVat8Amount((BigDecimal) var7.getFirstValue());
                this.setVat8Tax((BigDecimal) var7.getSecondValue());
                break;
            case RATE_5:
                var7 = this.QGM(var5, var2, var3, var4, this.getVat5Amount(), this.getVat5Tax(), this.getGrossPrice());
                this.setVat5Amount((BigDecimal) var7.getFirstValue());
                this.setVat5Tax((BigDecimal) var7.getSecondValue());
                break;
            case RATE_4:
                var7 = this.QGM(var5, var2, var3, var4, this.getVat4Amount(), this.getVat4Tax(), this.getGrossPrice());
                this.setVat4Amount((BigDecimal) var7.getFirstValue());
                this.setVat4Tax((BigDecimal) var7.getSecondValue());
                break;
            case RATE_0:
                var7 = this.QGM(var5, var2, var3, var4, this.getVat0Amount(), this.getVat0Tax(), this.getGrossPrice());
                this.setVat0Amount((BigDecimal) var7.getFirstValue());
                this.setVat0Tax((BigDecimal) var7.getSecondValue());
                break;
            case NP:
                var7 = this.QGM(var5, var2, var3, var4, this.getVatNpAmount(), this.getVatNpTax(), this.getGrossPrice());
                this.setVatNpAmount((BigDecimal) var7.getFirstValue());
                this.setVatNpTax((BigDecimal) var7.getSecondValue());
                break;
            case ZW:
                var7 = this.QGM(var5, var2, var3, var4, this.getVatZwAmount(), this.getVatZwTax(), this.getGrossPrice());
                this.setVatZwAmount((BigDecimal) var7.getFirstValue());
                this.setVatZwTax((BigDecimal) var7.getSecondValue());
                break;
            case OO_23:
                var7 = this.QGM(var5, var2, var3, var4, this.getVatOo23Amount(), this.getVatOo23Tax(), this.getGrossPrice());
                this.setVatOo23Amount((BigDecimal) var7.getFirstValue());
                this.setVatOo23Tax((BigDecimal) var7.getSecondValue());
                break;
            case OO_8:
                var7 = this.QGM(var5, var2, var3, var4, this.getVatOo8Amount(), this.getVatOo8Tax(), this.getGrossPrice());
                this.setVatOo8Amount((BigDecimal) var7.getFirstValue());
                this.setVatOo8Tax((BigDecimal) var7.getSecondValue());
                break;
            default:
                throw new UnsupportedOperationException();
        }

        this.setNetPrice(this.HRS(this.getVat23Amount(), this.getVat8Amount(), this.getVat5Amount(), this.getVat4Amount(), this.getVat0Amount(), this.getVatNpAmount(), this.getVatZwAmount(), this.getVatOo23Amount(), this.getVatOo8Amount()));
        this.setVatPrice(this.HRS(this.getVat23Tax(), this.getVat8Tax(), this.getVat5Tax(), this.getVat4Tax(), this.getVat0Tax(), this.getVatNpTax(), this.getVatZwTax(), this.getVatOo23Tax(), this.getVatOo8Tax()));
        this.setGrossPrice((BigDecimal) var7.getThirdValue());
    }

    public void RIC(HO var1) {
        this.FZA = false;
        BigDecimal var2 = var1.getNetPriceForAll().getValue();
        BigDecimal var3 = var1.getTaxValueForAll().getValue();
        BigDecimal var4 = var1.getGrossValueForAll().getValue();
        Boolean var5 = null;
        if (var1 instanceof HP) {
            var5 = ((HP) var1).getTaxDeduction50P().getValue();
        }

        EWC var6 = null;
        var6 = this.QGM(var5, var2, var3, var4, this.getNetPrice(), this.getVatPrice(), this.getGrossPrice());
        this.setNetPrice((BigDecimal) var6.getFirstValue());
        this.setVatPrice((BigDecimal) var6.getSecondValue());
        this.setGrossPrice((BigDecimal) var6.getThirdValue());
    }

    private BigDecimal HRS(BigDecimal... var1) {
        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal[] var3 = var1;
        int var4 = var1.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            BigDecimal var6 = var3[var5];
            var2 = EQY.HRI(var2, var6);
        }

        return var2;
    }

    private EWC<BigDecimal, BigDecimal, BigDecimal> QGM(Boolean var1, BigDecimal var2, BigDecimal var3, BigDecimal var4, BigDecimal var5, BigDecimal var6, BigDecimal var7) {
        BigDecimal var8;
        BigDecimal var9;
        BigDecimal var10;
        if (var1 != null && var1) {
            BigDecimal var11 = EQY.HRH(var2, new BigDecimal("0.5"));
            BigDecimal var12 = EQY.HRH(var3, new BigDecimal("0.5"));
            BigDecimal var13 = EQY.HRH(var4, new BigDecimal("0.5"));
            var8 = EQY.HRI(var5, var11);
            var9 = EQY.HRI(var6, var12);
            var10 = EQY.HRI(var7, var13);
        } else {
            var8 = EQY.HRI(var5, var2);
            var9 = EQY.HRI(var6, var3);
            var10 = EQY.HRI(var7, var4);
        }

        return new EWC(var8, var9, var10);
    }

    public BigDecimal getNetPrice() {
        return this.FYH;
    }

    public BigDecimal getVat23Amount() {
        return this.FYK;
    }

    public BigDecimal getVat8Amount() {
        return this.FYL;
    }

    public BigDecimal getVat5Amount() {
        return this.FYM;
    }

    public BigDecimal getVat4Amount() {
        return this.QLB;
    }

    public BigDecimal getVat0Amount() {
        return this.FYN;
    }

    public BigDecimal getVatZwAmount() {
        return this.FYO;
    }

    public BigDecimal getVatNpAmount() {
        return this.FYP;
    }

    public BigDecimal getVatOo23Amount() {
        return this.FYQ;
    }

    public BigDecimal getVatOo8Amount() {
        return this.FYR;
    }

    public Boolean getInvoiceIsOo() {
        return this.FYQ != null || this.FYR != null;
    }

    public BigDecimal getGrossPrice() {
        return this.FYI;
    }

    public BigDecimal getVatPrice() {
        return this.FYJ;
    }

    public boolean HRU() {
        return this.FZA;
    }

    public void setNetPrice(BigDecimal var1) {
        this.FYH = var1;
    }

    public void setGrossPrice(BigDecimal var1) {
        this.FYI = var1;
    }

    public void setVatPrice(BigDecimal var1) {
        this.FYJ = var1;
    }

    public void setVat23Amount(BigDecimal var1) {
        this.FYK = var1;
    }

    public void setVat8Amount(BigDecimal var1) {
        this.FYL = var1;
    }

    public void setVat5Amount(BigDecimal var1) {
        this.FYM = var1;
    }

    public void setVat4Amount(BigDecimal var1) {
        this.QLB = var1;
    }

    public void setVat0Amount(BigDecimal var1) {
        this.FYN = var1;
    }

    public void setVatZwAmount(BigDecimal var1) {
        this.FYO = var1;
    }

    public void setVatNpAmount(BigDecimal var1) {
        this.FYP = var1;
    }

    public void setVatOo23Amount(BigDecimal var1) {
        this.FYQ = var1;
    }

    public void setVatOo8Amount(BigDecimal var1) {
        this.FYR = var1;
    }

    public BigDecimal getVat23Tax() {
        return this.FYS;
    }

    public void setVat23Tax(BigDecimal var1) {
        this.FYS = var1;
    }

    public BigDecimal getVat8Tax() {
        return this.FYT;
    }

    public void setVat8Tax(BigDecimal var1) {
        this.FYT = var1;
    }

    public BigDecimal getVat5Tax() {
        return this.FYU;
    }

    public void setVat5Tax(BigDecimal var1) {
        this.FYU = var1;
    }

    public BigDecimal getVat4Tax() {
        return this.QLC;
    }

    public void setVat4Tax(BigDecimal var1) {
        this.QLC = var1;
    }

    public BigDecimal getVat0Tax() {
        return this.FYV;
    }

    public void setVat0Tax(BigDecimal var1) {
        this.FYV = var1;
    }

    public BigDecimal getVatZwTax() {
        return this.FYW;
    }

    public void setVatZwTax(BigDecimal var1) {
        this.FYW = var1;
    }

    public BigDecimal getVatNpTax() {
        return this.FYX;
    }

    public BigDecimal getProperVatNpTax() {
        return this.FYX;
    }

    public void setVatNpTax(BigDecimal var1) {
        this.FYX = var1;
    }

    public BigDecimal getVatOo23Tax() {
        return this.FYY;
    }

    public void setVatOo23Tax(BigDecimal var1) {
        this.FYY = var1;
    }

    public BigDecimal getVatOo8Tax() {
        return this.FYZ;
    }

    public void setVatOo8Tax(BigDecimal var1) {
        this.FYZ = var1;
    }
}
