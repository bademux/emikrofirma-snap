package a.a.a.c.f.a.e;

import a.a.a.c.f.a.ModelBaseAbstract;
import a.a.a.c.f.b.c.*;
import jakarta.xml.bind.annotation.XmlTransient;

import java.math.BigDecimal;

@XmlTransient
public abstract class InvoiceElement extends ModelBaseAbstract implements Cloneable {
    protected JY AJX;
    protected Text AJY;
    protected Text AJZ;
    protected Amount AKA;
    protected Text AKB;
    protected Amount AKC;
    protected Amount QWO;
    protected Amount AKD;
    protected Amount AKE;
    protected Amount AKF;
    protected Amount AKG;
    protected TaxRateModel AKH;
    protected QSU QWP;

    public InvoiceElement() {

    }

    public JY getPosition() {
        return this.AJX;
    }

    public JY DBD() {
        if (this.AJX == null) {
            this.AJX = new JY();
        }

        return this.AJX;
    }

    public void setPosition(JY var1) {
        this.AJX = var1;
    }

    public Text getName() {
        return this.AJY;
    }

    public Text DBE() {
        if (this.AJY == null) {
            this.AJY = new Text();
        }

        return this.AJY;
    }

    public void setName(Text var1) {
        this.AJY = var1;
    }

    public Text getDescription() {
        return this.AJZ;
    }

    public Text DBF() {
        if (this.AJZ == null) {
            this.AJZ = new Text();
        }

        return this.AJZ;
    }

    public void setDescription(Text var1) {
        this.AJZ = var1;
    }

    public Amount getQuantity() {
        return this.AKA;
    }

    public Amount DBG() {
        if (this.AKA == null) {
            this.AKA = new Amount();
        }

        return this.AKA;
    }

    public void setQuantity(Amount var1) {
        this.AKA = var1;
    }

    public Text getUnit() {
        return this.AKB;
    }

    public Text DBH() {
        if (this.AKB == null) {
            this.AKB = new Text();
        }

        return this.AKB;
    }

    public void setUnit(Text var1) {
        this.AKB = var1;
    }

    public Amount getNetPriceForUnit() {
        return this.AKC;
    }

    public Amount DBI() {
        if (this.AKC == null) {
            this.AKC = new Amount();
        }

        return this.AKC;
    }

    public void setNetPriceForUnit(Amount var1) {
        this.AKC = var1;
    }

    public Amount getGrossPriceForUnit() {
        if (this.QWO == null && this.AKC != null && this.AKH != null && this.AKH.getValue() != null) {
            this.QWO = new Amount();
            byte var1 = 2;
            byte var2 = 4;
            BigDecimal var3 = BigDecimal.ZERO;
            if (!this.AKH.getValue().DEQ()) {
                var3 = this.AKH.getValue().getRate().divide(new BigDecimal(100));
            }

            BigDecimal var4 = this.AKC.getValue().add(this.AKC.getValue().multiply(var3)).setScale(var1, var2);
            this.QWO.setValue(var4);
        }

        return this.QWO;
    }

    public Amount RIF() {
        if (this.QWO == null && this.AKC != null) {
            this.QWO = new Amount();
            if (this.AKH.getValue() == null) {
                return this.QWO;
            }

            byte var1 = 2;
            byte var2 = 4;
            BigDecimal var3 = BigDecimal.ZERO;
            if (!this.AKH.getValue().DEQ()) {
                var3 = this.AKH.getValue().getRate().divide(new BigDecimal(100));
            }

            BigDecimal var4 = this.AKC.getValue().add(this.AKC.getValue().multiply(var3)).setScale(var1, var2);
            this.QWO.setValue(var4);
        } else if (this.QWO == null) {
            this.QWO = new Amount();
        }

        return this.QWO;
    }

    public void setGrossPriceForUnit(Amount var1) {
        this.QWO = var1;
    }

    public Amount getDiscountAmount() {
        return this.AKD;
    }

    public Amount DBJ() {
        if (this.AKD == null) {
            this.AKD = new Amount();
        }

        return this.AKD;
    }

    public void setDiscountAmount(Amount var1) {
        this.AKD = var1;
    }

    public Amount getNetPriceForAll() {
        return this.AKE;
    }

    public Amount DBK() {
        if (this.AKE == null) {
            this.AKE = new Amount();
        }

        return this.AKE;
    }

    public void setNetPriceForAll(Amount var1) {
        this.AKE = var1;
    }

    public Amount getTaxValueForAll() {
        return this.AKF;
    }

    public Amount DBL() {
        if (this.AKF == null) {
            this.AKF = new Amount();
        }

        return this.AKF;
    }

    public void setTaxValueForAll(Amount var1) {
        this.AKF = var1;
    }

    public Amount getGrossValueForAll() {
        return this.AKG;
    }

    public Amount DBM() {
        if (this.AKG == null) {
            this.AKG = new Amount();
        }

        return this.AKG;
    }

    public void setGrossValueForAll(Amount var1) {
        this.AKG = var1;
    }

    public TaxRateModel getTaxRate() {
        return this.AKH;
    }

    public TaxRateModel DBN() {
        if (this.AKH == null) {
            this.AKH = new TaxRateModel();
        }

        return this.AKH;
    }

    public void setTaxRate(TaxRateModel var1) {
        this.AKH = var1;
    }

    public QSU getLastCalculationMethod() {
        return this.QWP;
    }

    public QSU RIG() {
        if (this.QWP == null) {
            this.QWP = new QSU();
        }

        return this.QWP;
    }

    public void setLastCalculationMethod(QSU var1) {
        this.QWP = var1;
    }

    public String toString() {
        return "InvoiceElement [position=" + this.AJX + ", name=" + this.AJY + ", description=" + this.AJZ + ", quantity=" + this.AKA + ", unit=" + this.AKB + ", netPriceForUnit=" + this.AKC + ", grossPriceForUnit=" + this.QWO + ", discountAmount=" + this.AKD + ", netPriceForAll=" + this.AKE + ", taxRate=" + this.AKH + ", lastCalculationMethod=" + this.QWP + "]";
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.AJZ == null ? 0 : this.AJZ.hashCode());
        var2 = 31 * var2 + (this.AKD == null ? 0 : this.AKD.hashCode());
        var2 = 31 * var2 + (this.AKG == null ? 0 : this.AKG.hashCode());
        var2 = 31 * var2 + (this.AJY == null ? 0 : this.AJY.hashCode());
        var2 = 31 * var2 + (this.AKE == null ? 0 : this.AKE.hashCode());
        var2 = 31 * var2 + (this.AKC == null ? 0 : this.AKC.hashCode());
        var2 = 31 * var2 + (this.QWO == null ? 0 : this.QWO.hashCode());
        var2 = 31 * var2 + (this.AJX == null ? 0 : this.AJX.hashCode());
        var2 = 31 * var2 + (this.AKA == null ? 0 : this.AKA.hashCode());
        var2 = 31 * var2 + (this.QWP == null ? 0 : this.QWP.hashCode());
        var2 = 31 * var2 + (this.AKH == null ? 0 : this.AKH.hashCode());
        var2 = 31 * var2 + (this.AKF == null ? 0 : this.AKF.hashCode());
        var2 = 31 * var2 + (this.AKB == null ? 0 : this.AKB.hashCode());
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
            InvoiceElement var2 = (InvoiceElement) var1;
            if (this.AJZ == null) {
                if (var2.AJZ != null) {
                    return false;
                }
            } else if (!this.AJZ.equals(var2.AJZ)) {
                return false;
            }

            if (this.AKD == null) {
                if (var2.AKD != null) {
                    return false;
                }
            } else if (!this.AKD.equals(var2.AKD)) {
                return false;
            }

            if (this.AKG == null) {
                if (var2.AKG != null) {
                    return false;
                }
            } else if (!this.AKG.equals(var2.AKG)) {
                return false;
            }

            if (this.AJY == null) {
                if (var2.AJY != null) {
                    return false;
                }
            } else if (!this.AJY.equals(var2.AJY)) {
                return false;
            }

            if (this.AKE == null) {
                if (var2.AKE != null) {
                    return false;
                }
            } else if (!this.AKE.equals(var2.AKE)) {
                return false;
            }

            if (this.AKC == null) {
                if (var2.AKC != null) {
                    return false;
                }
            } else if (!this.AKC.equals(var2.AKC)) {
                return false;
            }

            if (this.QWO == null) {
                if (var2.QWO != null) {
                    return false;
                }
            } else if (!this.QWO.equals(var2.QWO)) {
                return false;
            }

            if (this.AJX == null) {
                if (var2.AJX != null) {
                    return false;
                }
            } else if (!this.AJX.equals(var2.AJX)) {
                return false;
            }

            if (this.AKA == null) {
                if (var2.AKA != null) {
                    return false;
                }
            } else if (!this.AKA.equals(var2.AKA)) {
                return false;
            }

            if (this.AKH == null) {
                if (var2.AKH != null) {
                    return false;
                }
            } else if (!this.AKH.equals(var2.AKH)) {
                return false;
            }

            if (this.AKF == null) {
                if (var2.AKF != null) {
                    return false;
                }
            } else if (!this.AKF.equals(var2.AKF)) {
                return false;
            }

            if (this.AKB == null) {
                if (var2.AKB != null) {
                    return false;
                }
            } else if (!this.AKB.equals(var2.AKB)) {
                return false;
            }

            if (this.QWP == null) {
                return var2.QWP == null;
            } else return this.QWP.equals(var2.QWP);
        }
    }

    public abstract Object RIH();
}
