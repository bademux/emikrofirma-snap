package a.a.a.c.f.a.e.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.ModelBusinessPeriodAndDocIndexElement;
import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.JY;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlTransient;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

@XmlTransient
public abstract class InvoiceRecord extends ModelBusinessPeriodAndDocIndexElement {
    private InvoiceRecordType ALA;
    @XmlElements({@XmlElement(
            name = "invoiceRecordElement",
            type = InvoiceRecordElement.class
    ), @XmlElement(
            name = "invoiceRecordElementPurchase",
            type = InvoiceRecordElementPurchase.class
    )})
    private Set<InvoiceRecordElement> ALB;
    private Amount ALC;
    private Amount ALD;
    private Amount ALE;
    private ValueContainer2<Amount, Amount> ALF;
    private ValueContainer2<Amount, Amount> ALG;
    private ValueContainer2<Amount, Amount> ALH;
    private ValueContainer2<Amount, Amount> QLT;
    private ValueContainer2<Amount, Amount> ALI;
    private ValueContainer2<Amount, Amount> ALJ;
    private ValueContainer2<Amount, Amount> ALK;
    private ValueContainer2<Amount, Amount> ALL;
    private ValueContainer2<Amount, Amount> ALM;
    private ValueContainer2<Amount, Amount> ALN;
    private JY ALO;

    public InvoiceRecord() {
        this.ALB = new TreeSet();
        this.ALC = new Amount(BigDecimal.ZERO);
        this.ALD = new Amount(BigDecimal.ZERO);
        this.ALE = new Amount(BigDecimal.ZERO);
        this.ALF = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALG = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALH = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.QLT = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALI = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALJ = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALK = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALL = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALM = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));
        this.ALN = new ValueContainer2(new Amount(BigDecimal.ZERO), new Amount(BigDecimal.ZERO));

    }

    public InvoiceRecord(InvoiceRecordType var1) {
        this();

        this.ALA = var1;

    }

    public InvoiceRecordType getInvoiceRecordType() {
        return this.ALA;
    }

    public Set<InvoiceRecordElement> getInvoiceRecordElements() {
        return this.ALB;
    }

    public Amount getGross() {
        return this.ALC;
    }

    public Amount QQR() {
        if (this.ALC == null) {
            this.ALC = new Amount();
        }

        return this.ALC;
    }

    public void setGross(Amount var1) {
        this.ALC = var1;
    }

    public Amount getNet() {
        return this.ALD;
    }

    public Amount QQS() {
        if (this.ALD == null) {
            this.ALD = new Amount();
        }

        return this.ALD;
    }

    public void setNet(Amount var1) {
        this.ALD = var1;
    }

    public Amount getVat() {
        return this.ALE;
    }

    public Amount QQT() {
        if (this.ALE == null) {
            this.ALE = new Amount();
        }

        return this.ALE;
    }

    public void setVat(Amount var1) {
        this.ALE = var1;
    }

    public ValueContainer2<Amount, Amount> getVat23() {
        return this.ALF;
    }

    public ValueContainer2<Amount, Amount> QQU() {
        if (this.ALF == null) {
            this.ALF = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALF;
    }

    public void setVat23(ValueContainer2<Amount, Amount> var1) {
        this.ALF = var1;
    }

    public ValueContainer2<Amount, Amount> getVat8() {
        return this.ALG;
    }

    public ValueContainer2<Amount, Amount> QQV() {
        if (this.ALG == null) {
            this.ALG = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALG;
    }

    public void setVat8(ValueContainer2<Amount, Amount> var1) {
        this.ALG = var1;
    }

    public ValueContainer2<Amount, Amount> getVat5() {
        return this.ALH;
    }

    public ValueContainer2<Amount, Amount> QQW() {
        if (this.ALH == null) {
            this.ALH = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALH;
    }

    public void setVat5(ValueContainer2<Amount, Amount> var1) {
        this.ALH = var1;
    }

    public ValueContainer2<Amount, Amount> getVat4() {
        return this.QLT;
    }

    public ValueContainer2<Amount, Amount> QQX() {
        if (this.QLT == null) {
            this.QLT = new ValueContainer2(new Amount(), new Amount());
        }

        return this.QLT;
    }

    public void setVat4(ValueContainer2<Amount, Amount> var1) {
        this.QLT = var1;
    }

    public ValueContainer2<Amount, Amount> getVat0() {
        return this.ALI;
    }

    public ValueContainer2<Amount, Amount> QQY() {
        if (this.ALI == null) {
            this.ALI = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALI;
    }

    public void setVat0(ValueContainer2<Amount, Amount> var1) {
        this.ALI = var1;
    }

    public ValueContainer2<Amount, Amount> getVatZw() {
        return this.ALJ;
    }

    public ValueContainer2<Amount, Amount> QQZ() {
        if (this.ALJ == null) {
            this.ALJ = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALJ;
    }

    public void setVatZw(ValueContainer2<Amount, Amount> var1) {
        this.ALJ = var1;
    }

    public ValueContainer2<Amount, Amount> getVatNp() {
        return this.ALK;
    }

    public ValueContainer2<Amount, Amount> QRA() {
        if (this.ALK == null) {
            this.ALK = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALK;
    }

    public void setVatNp(ValueContainer2<Amount, Amount> var1) {
        this.ALK = var1;
    }

    public ValueContainer2<Amount, Amount> getVatOo23() {
        return this.ALL;
    }

    public ValueContainer2<Amount, Amount> QRB() {
        if (this.ALL == null) {
            this.ALL = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALL;
    }

    public void setVatOo23(ValueContainer2<Amount, Amount> var1) {
        this.ALL = var1;
    }

    public ValueContainer2<Amount, Amount> getVatOo8() {
        return this.ALM;
    }

    public ValueContainer2<Amount, Amount> QRC() {
        if (this.ALM == null) {
            this.ALM = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALM;
    }

    public void setVatOo8(ValueContainer2<Amount, Amount> var1) {
        this.ALM = var1;
    }

    public ValueContainer2<Amount, Amount> getVatOo5() {
        return this.ALN;
    }

    public ValueContainer2<Amount, Amount> QRD() {
        if (this.ALN == null) {
            this.ALN = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALN;
    }

    public void setVatOo5(ValueContainer2<Amount, Amount> var1) {
        this.ALN = var1;
    }

    public ValueContainer2<Amount, Amount> getVat4and8() {
        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        if (this.QLT != null && this.QLT.getFirstValue() != null && this.QLT.getFirstValue().getValue() != null) {
            var1 = var1.add(this.QLT.getFirstValue().getValue());
        }

        if (this.ALG != null && this.ALG.getFirstValue() != null && this.ALG.getFirstValue().getValue() != null) {
            var1 = var1.add(this.ALG.getFirstValue().getValue());
        }

        if (this.QLT != null && this.QLT.getSecondValue() != null && this.QLT.getSecondValue().getValue() != null) {
            var2 = var2.add(this.QLT.getSecondValue().getValue());
        }

        if (this.ALG != null && this.ALG.getSecondValue() != null && this.ALG.getSecondValue().getValue() != null) {
            var2 = var2.add(this.ALG.getSecondValue().getValue());
        }

        return var1 == null && var2 == null ? null : new ValueContainer2(new Amount(var1), new Amount(var2));
    }

    public ValueContainer2<Amount, Amount> QRE() {
        return this.getVat4and8();
    }

    public void setVat4and8(ValueContainer2<Amount, Amount> var1) {
        throw new FFI("This method should not be used");
    }

    public void setInvoiceRecordType(InvoiceRecordType var1) {
        this.ALA = var1;
    }

    public void setInvoiceRecordElements(Set<InvoiceRecordElement> var1) {
        this.ALB = var1;
    }

    public JY getUserDataVersion() {
        return this.ALO;
    }

    public JY DCC() {
        if (this.ALO == null) {
            this.ALO = new JY();
        }

        return this.ALO;
    }

    public void setUserDataVersion(JY var1) {
        this.ALO = var1;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.ALA == null ? 0 : this.ALA.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (!super.equals(var1)) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            InvoiceRecord var2 = (InvoiceRecord) var1;
            return this.ALA == var2.ALA;
        }
    }

    public String toString() {
        return "InvoiceRecord [invoiceRecordType=" + this.ALA + "] " + super.toString();
    }
}
