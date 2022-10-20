package a.a.a.c.f.a.e.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EXM;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JY;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

@XmlTransient
public abstract class IC extends EXM {
    private IH ALA;
    @XmlElements({@XmlElement(
            name = "invoiceRecordElement",
            type = ID.class
    ), @XmlElement(
            name = "invoiceRecordElementPurchase",
            type = IE.class
    )})
    private Set<ID> ALB;
    private JR ALC;
    private JR ALD;
    private JR ALE;
    private EVZ<JR, JR> ALF;
    private EVZ<JR, JR> ALG;
    private EVZ<JR, JR> ALH;
    private EVZ<JR, JR> QLT;
    private EVZ<JR, JR> ALI;
    private EVZ<JR, JR> ALJ;
    private EVZ<JR, JR> ALK;
    private EVZ<JR, JR> ALL;
    private EVZ<JR, JR> ALM;
    private EVZ<JR, JR> ALN;
    private JY ALO;

    public IC() {
        this.ALB = new TreeSet();
        this.ALC = new JR(BigDecimal.ZERO);
        this.ALD = new JR(BigDecimal.ZERO);
        this.ALE = new JR(BigDecimal.ZERO);
        this.ALF = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALG = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALH = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.QLT = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALI = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALJ = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALK = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALL = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALM = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        this.ALN = new EVZ(new JR(BigDecimal.ZERO), new JR(BigDecimal.ZERO));
        EXF.getInstance().ICQ();
    }

    public IC(IH var1) {
        this();
        EXF.getInstance().ICO();

        try {
            this.ALA = var1;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public IH getInvoiceRecordType() {
        return this.ALA;
    }

    public Set<ID> getInvoiceRecordElements() {
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

    public EVZ<JR, JR> getVat23() {
        return this.ALF;
    }

    public EVZ<JR, JR> QQU() {
        if (this.ALF == null) {
            this.ALF = new EVZ(new JR(), new JR());
        }

        return this.ALF;
    }

    public void setVat23(EVZ<JR, JR> var1) {
        this.ALF = var1;
    }

    public EVZ<JR, JR> getVat8() {
        return this.ALG;
    }

    public EVZ<JR, JR> QQV() {
        if (this.ALG == null) {
            this.ALG = new EVZ(new JR(), new JR());
        }

        return this.ALG;
    }

    public void setVat8(EVZ<JR, JR> var1) {
        this.ALG = var1;
    }

    public EVZ<JR, JR> getVat5() {
        return this.ALH;
    }

    public EVZ<JR, JR> QQW() {
        if (this.ALH == null) {
            this.ALH = new EVZ(new JR(), new JR());
        }

        return this.ALH;
    }

    public void setVat5(EVZ<JR, JR> var1) {
        this.ALH = var1;
    }

    public EVZ<JR, JR> getVat4() {
        return this.QLT;
    }

    public EVZ<JR, JR> QQX() {
        if (this.QLT == null) {
            this.QLT = new EVZ(new JR(), new JR());
        }

        return this.QLT;
    }

    public void setVat4(EVZ<JR, JR> var1) {
        this.QLT = var1;
    }

    public EVZ<JR, JR> getVat0() {
        return this.ALI;
    }

    public EVZ<JR, JR> QQY() {
        if (this.ALI == null) {
            this.ALI = new EVZ(new JR(), new JR());
        }

        return this.ALI;
    }

    public void setVat0(EVZ<JR, JR> var1) {
        this.ALI = var1;
    }

    public EVZ<JR, JR> getVatZw() {
        return this.ALJ;
    }

    public EVZ<JR, JR> QQZ() {
        if (this.ALJ == null) {
            this.ALJ = new EVZ(new JR(), new JR());
        }

        return this.ALJ;
    }

    public void setVatZw(EVZ<JR, JR> var1) {
        this.ALJ = var1;
    }

    public EVZ<JR, JR> getVatNp() {
        return this.ALK;
    }

    public EVZ<JR, JR> QRA() {
        if (this.ALK == null) {
            this.ALK = new EVZ(new JR(), new JR());
        }

        return this.ALK;
    }

    public void setVatNp(EVZ<JR, JR> var1) {
        this.ALK = var1;
    }

    public EVZ<JR, JR> getVatOo23() {
        return this.ALL;
    }

    public EVZ<JR, JR> QRB() {
        if (this.ALL == null) {
            this.ALL = new EVZ(new JR(), new JR());
        }

        return this.ALL;
    }

    public void setVatOo23(EVZ<JR, JR> var1) {
        this.ALL = var1;
    }

    public EVZ<JR, JR> getVatOo8() {
        return this.ALM;
    }

    public EVZ<JR, JR> QRC() {
        if (this.ALM == null) {
            this.ALM = new EVZ(new JR(), new JR());
        }

        return this.ALM;
    }

    public void setVatOo8(EVZ<JR, JR> var1) {
        this.ALM = var1;
    }

    public EVZ<JR, JR> getVatOo5() {
        return this.ALN;
    }

    public EVZ<JR, JR> QRD() {
        if (this.ALN == null) {
            this.ALN = new EVZ(new JR(), new JR());
        }

        return this.ALN;
    }

    public void setVatOo5(EVZ<JR, JR> var1) {
        this.ALN = var1;
    }

    public EVZ<JR, JR> getVat4and8() {
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

        return var1 == null && var2 == null ? null : new EVZ(new JR(var1), new JR(var2));
    }

    public EVZ<JR, JR> QRE() {
        return this.getVat4and8();
    }

    public void setVat4and8(EVZ<JR, JR> var1) {
        throw new FFI("This method should not be used");
    }

    public void setInvoiceRecordType(IH var1) {
        this.ALA = var1;
    }

    public void setInvoiceRecordElements(Set<ID> var1) {
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
            IC var2 = (IC) var1;
            return this.ALA == var2.ALA;
        }
    }

    public String toString() {
        return "InvoiceRecord [invoiceRecordType=" + this.ALA + "] " + super.toString();
    }
}
