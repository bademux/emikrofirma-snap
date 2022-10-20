package a.a.a.c.f.a.n;

import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.KL;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlTransient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlTransient
public abstract class InvoiceOther<_T extends InvoiceOtherElement> extends ModelBusinessPeriodElement {
    private final QSR QXB;
    private QSQ QXC;
    private KA QXD;
    private RefId QXE;
    private JV QXF;
    private final List<ValueContainer2<KL, BigDecimal>> QXG;
    private final List<ValueContainer2<KL, BigDecimal>> QXH;
    private final List<ValueContainer2<KL, BigDecimal>> QXI;
    private JR QXJ;
    private JR QXK;
    private JR QXL;
    private KB QXM;
    private JV QXN;
    private JS QXO;
    private JS QXP;
    private KO QXQ;
    private KO QXR;
    @XmlElements({@XmlElement(
            name = "invoiceOtherElementSell",
            type = QSJ.class
    ), @XmlElement(
            name = "invoiceOtherElementPurchase",
            type = InvoiceOtherElementPurchase.class
    )})
    private List<_T> QXS;
    private JY QXT;

    protected InvoiceOther(QSR var1, QSQ var2) {

        this.QXB = var1;
        this.QXC = var2;
        this.QXG = new ArrayList();
        this.QXH = new ArrayList();
        this.QXI = new ArrayList();
        this.QXS = new ArrayList();

    }

    protected InvoiceOther() {
        this(null, null);

    }

    public QSR getInvoiceOtherType() {
        return this.QXB;
    }

    public QSQ getInvoiceOtherSubType() {
        return this.QXC;
    }

    public void setInvoiceOtherSubType(QSQ var1) {
        this.QXC = var1;
    }

    public KA getIssuerNumber() {
        return this.QXD;
    }

    public KA RIQ() {
        if (this.QXD == null) {
            this.QXD = new KA();
        }

        return this.QXD;
    }

    public void setIssuerNumber(KA var1) {
        this.QXD = var1;
    }

    public RefId getRefId() {
        return this.QXE;
    }

    public RefId RIR() {
        if (this.QXE == null) {
            this.QXE = new RefId();
        }

        return this.QXE;
    }

    public void setRefId(RefId var1) {
        this.QXE = var1;
    }

    public JV getCreationDate() {
        return this.QXF;
    }

    public JV RIS() {
        if (this.QXF == null) {
            this.QXF = new JV();
        }

        return this.QXF;
    }

    public void setCreationDate(JV var1) {
        this.QXF = var1;
    }

    public List<ValueContainer2<KL, BigDecimal>> getSumOfAmountsDividedByTaxRate() {
        return this.QXG;
    }

    public List<ValueContainer2<KL, BigDecimal>> getAmountOfTaxDividedByTaxRate() {
        return this.QXH;
    }

    public List<ValueContainer2<KL, BigDecimal>> getSumOfGrossAmountsDividedByTaxRate() {
        return this.QXI;
    }

    public JR getAmountSummaryWithTax() {
        return this.QXJ;
    }

    public JR RIT() {
        if (this.QXJ == null) {
            this.QXJ = new JR();
        }

        return this.QXJ;
    }

    public void setAmountSummaryWithTax(JR var1) {
        this.QXJ = var1;
    }

    public JR getAmountSummaryWithoutTax() {
        return this.QXK;
    }

    public JR RIU() {
        if (this.QXK == null) {
            this.QXK = new JR();
        }

        return this.QXK;
    }

    public void setAmountSummaryWithoutTax(JR var1) {
        this.QXK = var1;
    }

    public JR getAmountTax() {
        return this.QXL;
    }

    public JR RIV() {
        if (this.QXL == null) {
            this.QXL = new JR();
        }

        return this.QXL;
    }

    public void setAmountTax(JR var1) {
        this.QXL = var1;
    }

    public KB getPaymentMethod() {
        return this.QXM;
    }

    public KB RIW() {
        if (this.QXM == null) {
            this.QXM = new KB();
        }

        return this.QXM;
    }

    public void setPaymentMethod(KB var1) {
        this.QXM = var1;
    }

    public JV getPaymentDate() {
        return this.QXN;
    }

    public JV RIX() {
        if (this.QXN == null) {
            this.QXN = new JV();
        }

        return this.QXN;
    }

    public void setPaymentDate(JV var1) {
        this.QXN = var1;
    }

    public JS getPayed() {
        return this.QXO;
    }

    public JS RIY() {
        if (this.QXO == null) {
            this.QXO = new JS();
        }

        return this.QXO;
    }

    public void setPayed(JS var1) {
        this.QXO = var1;
    }

    public JS getPaymentDateByDeal() {
        return this.QXP;
    }

    public JS RIZ() {
        if (this.QXP == null) {
            this.QXP = new JS(false);
        }

        return this.QXP;
    }

    public void setPaymentDateByDeal(JS var1) {
        this.QXP = var1;
    }

    public KO getRemarks() {
        return this.QXQ;
    }

    public KO RJA() {
        if (this.QXQ == null) {
            this.QXQ = new KO();
        }

        return this.QXQ;
    }

    public void setRemarks(KO var1) {
        this.QXQ = var1;
    }

    public KO getExemptionReason() {
        return this.QXR;
    }

    public KO RJB() {
        if (this.QXR == null) {
            this.QXR = new KO();
        }

        return this.QXR;
    }

    public void setExemptionReason(KO var1) {
        this.QXR = var1;
    }

    public List<_T> getInvoiceOtherElements() {
        return this.QXS;
    }

    public void setInvoiceOtherElements(List<_T> var1) {
        this.QXS = var1;
    }

    public JY getUserDataVersion() {
        return this.QXT;
    }

    public JY RJC() {
        if (this.QXT == null) {
            this.QXT = new JY();
        }

        return this.QXT;
    }

    public void setUserDataVersion(JY var1) {
        this.QXT = var1;
    }

    public InvoiceOther<?> getParentInvoiceOnlyActive() {
        return (InvoiceOther) super.getParentOnlyActiveState();
    }

    public InvoiceOther<?> getParentInvoiceWithCanceled() {
        return (InvoiceOther) super.getParent();
    }

    public void setParentInvoice(InvoiceOther<?> var1) {
        super.setParent(var1);
    }

    public InvoiceOther<?> getChildInvoiceWithCanceled() {
        InvoiceOther var1 = (InvoiceOther) super.getChild();
        return var1;
    }

    public InvoiceOther<?> getChildInvoiceOnlyActive() {
        InvoiceOther var1 = (InvoiceOther) super.getChildOnlyActiveState();
        return var1;
    }

    public ValueContainer2<BigDecimal, BigDecimal> getNetAndTaxForTaxRate(KL var1) {

        BigDecimal var2 = BigDecimal.ZERO;
        BigDecimal var3 = BigDecimal.ZERO;
        Iterator var4 = this.getSumOfAmountsDividedByTaxRate().iterator();

        ValueContainer2 var5;
        while (var4.hasNext()) {
            var5 = (ValueContainer2) var4.next();
            if (var5.getFirstValue().equals(var1)) {
                var2 = (BigDecimal) var5.getSecondValue();
            }
        }

        var4 = this.getAmountOfTaxDividedByTaxRate().iterator();

        while (var4.hasNext()) {
            var5 = (ValueContainer2) var4.next();
            if (var5.getFirstValue().equals(var1)) {
                var3 = (BigDecimal) var5.getSecondValue();
            }
        }

        ValueContainer2 var9 = new ValueContainer2(var2, var3);
        return var9;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.QXC == null ? 0 : this.QXC.hashCode());
        var2 = 31 * var2 + (this.QXB == null ? 0 : this.QXB.hashCode());
        var2 = 31 * var2 + (this.QXD == null ? 0 : this.QXD.hashCode());
        var2 = 31 * var2 + (this.QXE == null ? 0 : this.QXE.hashCode());
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
            InvoiceOther var2 = (InvoiceOther) var1;
            if (this.QXC != var2.QXC) {
                return false;
            } else if (this.QXB != var2.QXB) {
                return false;
            } else {
                if (this.QXD == null) {
                    if (var2.QXD != null) {
                        return false;
                    }
                } else if (!this.QXD.equals(var2.QXD)) {
                    return false;
                }

                if (this.QXE == null) {
                    return var2.QXE == null;
                } else return this.QXE.equals(var2.QXE);
            }
        }
    }

    public String toString() {
        return "InvoiceOther [issuerNumber=" + this.QXD + ", refId=" + this.QXE + "]";
    }
}
