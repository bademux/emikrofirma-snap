package a.a.a.c.f.a.a;

import a.a.a.c.f.a.ModelBaseAbstract;
import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.a.TaxRate;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class AmountItem extends ModelBaseAbstract {
    private Amount AIP;
    private Amount AIQ;
    private Amount AIR;
    private TaxRate AIS;

    public AmountItem() {

    }

    public void setValues(BigDecimal var1, TaxRate var2) {
        this.AIP = new Amount(var1);
        this.AIS = var2;
        this.AIQ = new Amount(var1.multiply(var2.getRate()).divide(new BigDecimal(100)));
        this.AIR = new Amount(var1.add(this.AIQ.getValue()));
    }

    public Amount getNet() {
        return this.AIP;
    }

    public Amount getVatAmount() {
        return this.AIQ;
    }

    public Amount getGross() {
        return this.AIR;
    }

    public TaxRate getTaxRate() {
        return this.AIS;
    }

    public void setNet(Amount var1) {
        this.AIP = var1;
    }

    public void setVatAmount(Amount var1) {
        this.AIQ = var1;
    }

    public void setGross(Amount var1) {
        this.AIR = var1;
    }

    public void setTaxRate(TaxRate var1) {
        this.AIS = var1;
    }
}
