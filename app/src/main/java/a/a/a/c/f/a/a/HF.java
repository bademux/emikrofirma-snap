package a.a.a.c.f.a.a;

import a.a.a.c.f.a.ModelBaseAbstract;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.b.c.RefId;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
public class HF extends ModelBaseAbstract {
    private Period AII;
    private InvoicingDate AIJ;
    private RefId AIK;
    private Amount AIL;
    private Amount AIM;
    private Amount AIN;
    private final Set<AmountItem> AIO;

    public HF() {

        this.AIL = new Amount(BigDecimal.ZERO);
        this.AIM = new Amount(BigDecimal.ZERO);
        this.AIN = new Amount(BigDecimal.ZERO);
        this.AIO = new HashSet();

    }

    public void DAG(AmountItem var1) {
        this.AIO.add(var1);
        this.AIL = new Amount(this.AIL.getValue().add(var1.getNet().getValue()));
        this.AIM = new Amount(this.AIM.getValue().add(var1.getVatAmount().getValue()));
        this.AIN = new Amount(this.AIN.getValue().add(var1.getGross().getValue()));
    }

    public void DAH(AmountItem var1) {
        this.AIO.remove(var1);
        this.AIL = new Amount(this.AIL.getValue().subtract(var1.getNet().getValue()));
        this.AIM = new Amount(this.AIM.getValue().subtract(var1.getVatAmount().getValue()));
        this.AIN = new Amount(this.AIN.getValue().subtract(var1.getGross().getValue()));
    }

    public Set<AmountItem> getItems() {
        return this.AIO;
    }

    public Period getPeriod() {
        return this.AII;
    }

    public void setPeriod(Period var1) {
        this.AII = var1;
    }

    public InvoicingDate getDate() {
        return this.AIJ;
    }

    public void setDate(InvoicingDate var1) {
        this.AIJ = var1;
    }

    public RefId getRefId() {
        return this.AIK;
    }

    public void setRefId(RefId var1) {
        this.AIK = var1;
    }

    public Amount getNet() {
        return this.AIL;
    }

    public void setNet(Amount var1) {
        this.AIL = var1;
    }

    public Amount getVat() {
        return this.AIM;
    }

    public void setVat(Amount var1) {
        this.AIM = var1;
    }

    public Amount getGross() {
        return this.AIN;
    }

    public void setGross(Amount var1) {
        this.AIN = var1;
    }
}
