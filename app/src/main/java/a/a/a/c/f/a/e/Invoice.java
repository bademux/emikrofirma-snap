package a.a.a.c.f.a.e;

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
public abstract class Invoice<_T extends InvoiceElement> extends ModelBusinessPeriodElement {
    private final IB AJF;
    private final IA AJG;
    private KA AJH;
    private RefId AJI;
    private JV AJJ;
    private JV AJK;
    private final List<ValueContainer2<KL, BigDecimal>> AJL;
    private final List<ValueContainer2<KL, BigDecimal>> AJM;
    private final List<ValueContainer2<KL, BigDecimal>> AJN;
    private JR AJO;
    private JR AJP;
    private JR AJQ;
    private KB AJR;
    private JV AJS;
    private JS AJT;
    private JS QLQ;
    private KO AJU;
    private KO QLR;
    private QSU QWN;
    @XmlElements({@XmlElement(
            name = "invoiceElementSell",
            type = InvoiceElementSell.class
    ), @XmlElement(
            name = "invoiceElementPurchase",
            type = InvoiceElementPurchase.class
    )})
    private List<_T> AJV;
    private JY AJW;

    protected Invoice(IB var1, IA var2) {

        this.AJF = var1;
        this.AJG = var2;
        this.AJL = new ArrayList();
        this.AJM = new ArrayList();
        this.AJN = new ArrayList();
        this.AJV = new ArrayList();

    }

    protected Invoice() {
        this(null, null);

    }

    public IB getInvoiceType() {
        return this.AJF;
    }

    public IA getInvoiceSubType() {
        return this.AJG;
    }

    public KA getIssuerNumber() {
        return this.AJH;
    }

    public KA DAR() {
        if (this.AJH == null) {
            this.AJH = new KA();
        }

        return this.AJH;
    }

    public void setIssuerNumber(KA var1) {
        this.AJH = var1;
    }

    public RefId getRefId() {
        return this.AJI;
    }

    public RefId DAS() {
        if (this.AJI == null) {
            this.AJI = new RefId();
        }

        return this.AJI;
    }

    public void setRefId(RefId var1) {
        this.AJI = var1;
    }

    public JV getCreationDate() {
        return this.AJJ;
    }

    public JV DAT() {
        if (this.AJJ == null) {
            this.AJJ = new JV();
        }

        return this.AJJ;
    }

    public void setCreationDate(JV var1) {
        this.AJJ = var1;
    }

    public JV getTransactionDate() {
        return this.AJK;
    }

    public JV DAU() {
        if (this.AJK == null) {
            this.AJK = new JV();
        }

        return this.AJK;
    }

    public void setTransactionDate(JV var1) {
        this.AJK = var1;
    }

    public List<ValueContainer2<KL, BigDecimal>> getSumOfAmountsDividedByTaxRate() {
        return this.AJL;
    }

    public List<ValueContainer2<KL, BigDecimal>> getAmountOfTaxDividedByTaxRate() {
        return this.AJM;
    }

    public List<ValueContainer2<KL, BigDecimal>> getSumOfGrossAmountsDividedByTaxRate() {
        return this.AJN;
    }

    public JR getAmountSummaryWithTax() {
        return this.AJO;
    }

    public JR DAV() {
        if (this.AJO == null) {
            this.AJO = new JR();
        }

        return this.AJO;
    }

    public void setAmountSummaryWithTax(JR var1) {
        this.AJO = var1;
    }

    public JR getAmountSummaryWithoutTax() {
        return this.AJP;
    }

    public JR DAW() {
        if (this.AJP == null) {
            this.AJP = new JR();
        }

        return this.AJP;
    }

    public void setAmountSummaryWithoutTax(JR var1) {
        this.AJP = var1;
    }

    public JR getAmountTax() {
        return this.AJQ;
    }

    public JR DAX() {
        if (this.AJQ == null) {
            this.AJQ = new JR();
        }

        return this.AJQ;
    }

    public void setAmountTax(JR var1) {
        this.AJQ = var1;
    }

    public KB getPaymentMethod() {
        return this.AJR;
    }

    public KB DAY() {
        if (this.AJR == null) {
            this.AJR = new KB();
        }

        return this.AJR;
    }

    public void setPaymentMethod(KB var1) {
        this.AJR = var1;
    }

    public JV getPaymentDate() {
        return this.AJS;
    }

    public JV DAZ() {
        if (this.AJS == null) {
            this.AJS = new JV();
        }

        return this.AJS;
    }

    public void setPaymentDate(JV var1) {
        this.AJS = var1;
    }

    public JS getPayed() {
        return this.AJT;
    }

    public JS DBA() {
        if (this.AJT == null) {
            this.AJT = new JS();
        }

        return this.AJT;
    }

    public void setPayed(JS var1) {
        this.AJT = var1;
    }

    public JS getPaymentDateByDeal() {
        return this.QLQ;
    }

    public JS QOP() {
        if (this.QLQ == null) {
            this.QLQ = new JS(false);
        }

        return this.QLQ;
    }

    public void setPaymentDateByDeal(JS var1) {
        this.QLQ = var1;
    }

    public KO getRemarks() {
        return this.AJU;
    }

    public KO DBB() {
        if (this.AJU == null) {
            this.AJU = new KO();
        }

        return this.AJU;
    }

    public void setRemarks(KO var1) {
        this.AJU = var1;
    }

    public KO getExemptionReason() {
        return this.QLR;
    }

    public KO QOQ() {
        if (this.QLR == null) {
            this.QLR = new KO();
        }

        return this.QLR;
    }

    public void setExemptionReason(KO var1) {
        this.QLR = var1;
    }

    public List<_T> getInvoiceElements() {
        return this.AJV;
    }

    public void setInvoiceElements(List<_T> var1) {
        this.AJV = var1;
    }

    public JY getUserDataVersion() {
        return this.AJW;
    }

    public JY DBC() {
        if (this.AJW == null) {
            this.AJW = new JY();
        }

        return this.AJW;
    }

    public void setUserDataVersion(JY var1) {
        this.AJW = var1;
    }

    public Invoice<?> getParentInvoiceOnlyActive() {
        return (Invoice) super.getParentOnlyActiveState();
    }

    public Invoice<?> getParentInvoiceWithCanceled() {
        return (Invoice) super.getParent();
    }

    public void setParentInvoice(Invoice<?> var1) {
        super.setParent(var1);
    }

    public Invoice<?> getChildInvoiceWithCanceled() {
        Invoice var1 = (Invoice) super.getChild();
        return var1;
    }

    public Invoice<?> getChildInvoiceOnlyActive() {
        Invoice var1 = (Invoice) super.getChildOnlyActiveState();
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

    public QSU getLastCalculationMethod() {
        return this.QWN;
    }

    public QSU RIE() {
        if (this.QWN == null) {
            this.QWN = new QSU();
        }

        return this.QWN;
    }

    public void setLastCalculationMethod(QSU var1) {
        this.QWN = var1;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.AJF == null ? 0 : this.AJF.hashCode());
        var2 = 31 * var2 + (this.AJH == null ? 0 : this.AJH.hashCode());
        var2 = 31 * var2 + (this.AJI == null ? 0 : this.AJI.hashCode());
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
            Invoice var2 = (Invoice) var1;
            if (this.AJF != var2.AJF) {
                return false;
            } else {
                if (this.AJH == null) {
                    if (var2.AJH != null) {
                        return false;
                    }
                } else if (!this.AJH.equals(var2.AJH)) {
                    return false;
                }

                if (this.AJI == null) {
                    return var2.AJI == null;
                } else return this.AJI.equals(var2.AJI);
            }
        }
    }

    public String toString() {
        return "Invoice [issuerNumber=" + this.AJH + ", refId=" + this.AJI + "] " + super.toString();
    }
}
