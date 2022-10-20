package a.a.a.c.f.a.n;

import a.a.a.c.f.a.IJ;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JY;
import a.a.a.c.f.b.c.KQ;
import a.a.a.c.f.b.c.QSU;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class InvoiceOtherElement extends IJ implements Cloneable {
    protected JY QXU;
    protected JR QXV;
    protected JR QXW;
    protected JR QXX;
    protected KQ QXY;
    protected QSU QXZ;

    public InvoiceOtherElement() {

    }

    public JY getPosition() {
        return this.QXU;
    }

    public JY RJD() {
        if (this.QXU == null) {
            this.QXU = new JY();
        }

        return this.QXU;
    }

    public void setPosition(JY var1) {
        this.QXU = var1;
    }

    public JR getNetPriceForAll() {
        return this.QXV;
    }

    public JR RJE() {
        if (this.QXV == null) {
            this.QXV = new JR();
        }

        return this.QXV;
    }

    public void setNetPriceForAll(JR var1) {
        this.QXV = var1;
    }

    public JR getTaxValueForAll() {
        return this.QXW;
    }

    public JR RJF() {
        if (this.QXW == null) {
            this.QXW = new JR();
        }

        return this.QXW;
    }

    public void setTaxValueForAll(JR var1) {
        this.QXW = var1;
    }

    public JR getGrossValueForAll() {
        return this.QXX;
    }

    public JR RJG() {
        if (this.QXX == null) {
            this.QXX = new JR();
        }

        return this.QXX;
    }

    public void setGrossValueForAll(JR var1) {
        this.QXX = var1;
    }

    public KQ getTaxRate() {
        return this.QXY;
    }

    public KQ RJH() {
        if (this.QXY == null) {
            this.QXY = new KQ();
        }

        return this.QXY;
    }

    public void setTaxRate(KQ var1) {
        this.QXY = var1;
    }

    public QSU getLastCalculationMethod() {
        return this.QXZ;
    }

    public QSU RJI() {
        if (this.QXZ == null) {
            this.QXZ = new QSU();
        }

        return this.QXZ;
    }

    public void setLastCalculationMethod(QSU var1) {
        this.QXZ = var1;
    }

    public String toString() {
        return "InvoiceOtherElement [position=" + this.QXU + ", netPriceForAll=" + this.QXV + ", taxValueForAll=" + this.QXW + ", grossValueForAll=" + this.QXX + ", taxRate=" + this.QXY + ", lastCalculationMethod=" + this.QXZ + "]";
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.QXX == null ? 0 : this.QXX.hashCode());
        var2 = 31 * var2 + (this.QXZ == null ? 0 : this.QXZ.hashCode());
        var2 = 31 * var2 + (this.QXV == null ? 0 : this.QXV.hashCode());
        var2 = 31 * var2 + (this.QXU == null ? 0 : this.QXU.hashCode());
        var2 = 31 * var2 + (this.QXY == null ? 0 : this.QXY.hashCode());
        var2 = 31 * var2 + (this.QXW == null ? 0 : this.QXW.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (var1 == null) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            InvoiceOtherElement var2 = (InvoiceOtherElement) var1;
            if (this.QXX == null) {
                if (var2.QXX != null) {
                    return false;
                }
            } else if (!this.QXX.equals(var2.QXX)) {
                return false;
            }

            if (this.QXZ == null) {
                if (var2.QXZ != null) {
                    return false;
                }
            } else if (!this.QXZ.equals(var2.QXZ)) {
                return false;
            }

            if (this.QXV == null) {
                if (var2.QXV != null) {
                    return false;
                }
            } else if (!this.QXV.equals(var2.QXV)) {
                return false;
            }

            if (this.QXU == null) {
                if (var2.QXU != null) {
                    return false;
                }
            } else if (!this.QXU.equals(var2.QXU)) {
                return false;
            }

            if (this.QXY == null) {
                if (var2.QXY != null) {
                    return false;
                }
            } else if (!this.QXY.equals(var2.QXY)) {
                return false;
            }

            if (this.QXW == null) {
                return var2.QXW == null;
            } else return this.QXW.equals(var2.QXW);
        }
    }

    public abstract Object RJJ();
}
