package a.a.a.c.f.a.f.a;

import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.TaxRateModel;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class RecordElementVat extends RecordElement implements Cloneable {
    private Amount AMN;
    private Amount AMO;
    private Amount AMP;
    private TaxRateModel AMQ;

    public Object RJT() {
        RecordElementVat var1 = new RecordElementVat();
        if (this.getNet() != null && this.getNet().getValue() != null) {
            var1.setNet(new Amount(this.getNet().getValue()));
        }

        if (this.getVat() != null && this.getVat().getValue() != null) {
            var1.setVat(new Amount(this.getVat().getValue()));
        }

        if (this.getGross() != null && this.getGross().getValue() != null) {
            var1.setGross(new Amount(this.getGross().getValue()));
        }

        if (this.getTaxRate() != null && this.getTaxRate().getValue() != null) {
            var1.setTaxRate(new TaxRateModel(this.getTaxRate().getValue()));
        }

        return var1;
    }

    public RecordElementVat() {

    }

    public Amount getNet() {
        return this.AMN;
    }

    public Amount DCF() {
        if (this.AMN == null) {
            this.AMN = new Amount();
        }

        return this.AMN;
    }

    public void setNet(Amount var1) {
        this.AMN = var1;
    }

    public Amount getVat() {
        return this.AMO;
    }

    public Amount DCG() {
        if (this.AMO == null) {
            this.AMO = new Amount();
        }

        return this.AMO;
    }

    public void setVat(Amount var1) {
        this.AMO = var1;
    }

    public Amount getGross() {
        return this.AMP;
    }

    public Amount DCH() {
        if (this.AMP == null) {
            this.AMP = new Amount();
        }

        return this.AMP;
    }

    public void setGross(Amount var1) {
        this.AMP = var1;
    }

    public TaxRateModel getTaxRate() {
        return this.AMQ;
    }

    public TaxRateModel DCI() {
        if (this.AMQ == null) {
            this.AMQ = new TaxRateModel();
        }

        return this.AMQ;
    }

    public void setTaxRate(TaxRateModel var1) {
        this.AMQ = var1;
    }
}
