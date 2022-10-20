package a.a.a.c.f.a.e.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.ModelBusinessPeriodAndDocIndexElement;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JY;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlTransient;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

@XmlTransient
public abstract class InvoiceRecord extends ModelBusinessPeriodAndDocIndexElement {
    private IH ALA;
    @XmlElements({@XmlElement(
            name = "invoiceRecordElement",
            type = InvoiceRecordElement.class
    ), @XmlElement(
            name = "invoiceRecordElementPurchase",
            type = InvoiceRecordElementPurchase.class
    )})
    private Set<InvoiceRecordElement> ALB;
    private JR ALC;
    private JR ALD;
    private JR ALE;
    private ValueContainer2<JR, JR> ALF;
    private ValueContainer2<JR, JR> ALG;
    private ValueContainer2<JR, JR> ALH;
    private ValueContainer2<JR, JR> QLT;
    private ValueContainer2<JR, JR> ALI;
    private ValueContainer2<JR, JR> ALJ;
    private ValueContainer2<JR, JR> ALK;
    private ValueContainer2<JR, JR> ALL;
    private ValueContainer2<JR, JR> ALM;
    private ValueContainer2<JR, JR> ALN;
    private JY ALO;

    public InvoiceRecord() {
        this.ALB = new TreeSet();
        this.ALC = new JR(BigDecimal.ZERO);
        this.ALD = new JR(BigDecimal.ZERO);
        this.ALE = new JR(BigDecimal.ZERO);
        this.ALF = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALG = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALH = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.QLT = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALI = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALJ = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALK = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALL = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALM = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALN = new ValueContainer2(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));

    }

    public InvoiceRecord(IH var1) {
        this();

        this.ALA = var1;

    }

    public IH getInvoiceRecordType() {
        return this.ALA;
    }

    public Set<InvoiceRecordElement> getInvoiceRecordElements() {
        return this.ALB;
    }

    public JR getGross() {
        return this.ALC;
    }

    public JR QQR() {
        if (this.ALC == null) {
            this.ALC = new JR();
        }

        return this.ALC;
    }

    public void setGross(JR var1) {
        this.ALC = var1;
    }

    public JR getNet() {
        return this.ALD;
    }

    public JR QQS() {
        if (this.ALD == null) {
            this.ALD = new JR();
        }

        return this.ALD;
    }

    public void setNet(JR var1) {
        this.ALD = var1;
    }

    public JR getVat() {
        return this.ALE;
    }

    public JR QQT() {
        if (this.ALE == null) {
            this.ALE = new JR();
        }

        return this.ALE;
    }

    public void setVat(JR var1) {
        this.ALE = var1;
    }

    public ValueContainer2<JR, JR> getVat23() {
        return this.ALF;
    }

    public ValueContainer2<JR, JR> QQU() {
        if (this.ALF == null) {
            this.ALF = new ValueContainer2(new JR(), new JR());
        }

        return this.ALF;
    }

    public void setVat23(ValueContainer2<JR, JR> var1) {
        this.ALF = var1;
    }

    public ValueContainer2<JR, JR> getVat8() {
        return this.ALG;
    }

    public ValueContainer2<JR, JR> QQV() {
        if (this.ALG == null) {
            this.ALG = new ValueContainer2(new JR(), new JR());
        }

        return this.ALG;
    }

    public void setVat8(ValueContainer2<JR, JR> var1) {
        this.ALG = var1;
    }

    public ValueContainer2<JR, JR> getVat5() {
        return this.ALH;
    }

    public ValueContainer2<JR, JR> QQW() {
        if (this.ALH == null) {
            this.ALH = new ValueContainer2(new JR(), new JR());
        }

        return this.ALH;
    }

    public void setVat5(ValueContainer2<JR, JR> var1) {
        this.ALH = var1;
    }

    public ValueContainer2<JR, JR> getVat4() {
        return this.QLT;
    }

    public ValueContainer2<JR, JR> QQX() {
        if (this.QLT == null) {
            this.QLT = new ValueContainer2(new JR(), new JR());
        }

        return this.QLT;
    }

    public void setVat4(ValueContainer2<JR, JR> var1) {
        this.QLT = var1;
    }

    public ValueContainer2<JR, JR> getVat0() {
        return this.ALI;
    }

    public ValueContainer2<JR, JR> QQY() {
        if (this.ALI == null) {
            this.ALI = new ValueContainer2(new JR(), new JR());
        }

        return this.ALI;
    }

    public void setVat0(ValueContainer2<JR, JR> var1) {
        this.ALI = var1;
    }

    public ValueContainer2<JR, JR> getVatZw() {
        return this.ALJ;
    }

    public ValueContainer2<JR, JR> QQZ() {
        if (this.ALJ == null) {
            this.ALJ = new ValueContainer2(new JR(), new JR());
        }

        return this.ALJ;
    }

    public void setVatZw(ValueContainer2<JR, JR> var1) {
        this.ALJ = var1;
    }

    public ValueContainer2<JR, JR> getVatNp() {
        return this.ALK;
    }

    public ValueContainer2<JR, JR> QRA() {
        if (this.ALK == null) {
            this.ALK = new ValueContainer2(new JR(), new JR());
        }

        return this.ALK;
    }

    public void setVatNp(ValueContainer2<JR, JR> var1) {
        this.ALK = var1;
    }

    public ValueContainer2<JR, JR> getVatOo23() {
        return this.ALL;
    }

    public ValueContainer2<JR, JR> QRB() {
        if (this.ALL == null) {
            this.ALL = new ValueContainer2(new JR(), new JR());
        }

        return this.ALL;
    }

    public void setVatOo23(ValueContainer2<JR, JR> var1) {
        this.ALL = var1;
    }

    public ValueContainer2<JR, JR> getVatOo8() {
        return this.ALM;
    }

    public ValueContainer2<JR, JR> QRC() {
        if (this.ALM == null) {
            this.ALM = new ValueContainer2(new JR(), new JR());
        }

        return this.ALM;
    }

    public void setVatOo8(ValueContainer2<JR, JR> var1) {
        this.ALM = var1;
    }

    public ValueContainer2<JR, JR> getVatOo5() {
        return this.ALN;
    }

    public ValueContainer2<JR, JR> QRD() {
        if (this.ALN == null) {
            this.ALN = new ValueContainer2(new JR(), new JR());
        }

        return this.ALN;
    }

    public void setVatOo5(ValueContainer2<JR, JR> var1) {
        this.ALN = var1;
    }

    public ValueContainer2<JR, JR> getVat4and8() {
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

        return var1 == null && var2 == null ? null : new ValueContainer2(new JR(var1), new JR(var2));
    }

    public ValueContainer2<JR, JR> QRE() {
        return this.getVat4and8();
    }

    public void setVat4and8(ValueContainer2<JR, JR> var1) {
        throw new FFI("This method should not be used");
    }

    public void setInvoiceRecordType(IH var1) {
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
