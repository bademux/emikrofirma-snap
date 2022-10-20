package a.a.a.c.f.a.e;

import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.b.c.a.TaxRate;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlTransient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlTransient
public abstract class Invoice<_T extends InvoiceElement> extends ModelBusinessPeriodElement {
    private final InvoiceType AJF;
    private final InvoiceSubtype AJG;
    private Nip AJH;
    private RefId AJI;
    private InvoicingDate AJJ;
    private InvoicingDate AJK;
    private final List<ValueContainer2<TaxRate, BigDecimal>> AJL;
    private final List<ValueContainer2<TaxRate, BigDecimal>> AJM;
    private final List<ValueContainer2<TaxRate, BigDecimal>> AJN;
    private Amount AJO;
    private Amount AJP;
    private Amount AJQ;
    private KB AJR;
    private InvoicingDate AJS;
    private PrivtePerson AJT;
    private PrivtePerson QLQ;
    private Text AJU;
    private Text QLR;
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

    protected Invoice(InvoiceType var1, InvoiceSubtype var2) {

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

    public InvoiceType getInvoiceType() {
        return this.AJF;
    }

    public InvoiceSubtype getInvoiceSubType() {
        return this.AJG;
    }

    public Nip getIssuerNumber() {
        return this.AJH;
    }

    public Nip DAR() {
        if (this.AJH == null) {
            this.AJH = new Nip();
        }

        return this.AJH;
    }

    public void setIssuerNumber(Nip var1) {
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

    public InvoicingDate getCreationDate() {
        return this.AJJ;
    }

    public InvoicingDate DAT() {
        if (this.AJJ == null) {
            this.AJJ = new InvoicingDate();
        }

        return this.AJJ;
    }

    public void setCreationDate(InvoicingDate var1) {
        this.AJJ = var1;
    }

    public InvoicingDate getTransactionDate() {
        return this.AJK;
    }

    public InvoicingDate DAU() {
        if (this.AJK == null) {
            this.AJK = new InvoicingDate();
        }

        return this.AJK;
    }

    public void setTransactionDate(InvoicingDate var1) {
        this.AJK = var1;
    }

    public List<ValueContainer2<TaxRate, BigDecimal>> getSumOfAmountsDividedByTaxRate() {
        return this.AJL;
    }

    public List<ValueContainer2<TaxRate, BigDecimal>> getAmountOfTaxDividedByTaxRate() {
        return this.AJM;
    }

    public List<ValueContainer2<TaxRate, BigDecimal>> getSumOfGrossAmountsDividedByTaxRate() {
        return this.AJN;
    }

    public Amount getAmountSummaryWithTax() {
        return this.AJO;
    }

    public Amount DAV() {
        if (this.AJO == null) {
            this.AJO = new Amount();
        }

        return this.AJO;
    }

    public void setAmountSummaryWithTax(Amount var1) {
        this.AJO = var1;
    }

    public Amount getAmountSummaryWithoutTax() {
        return this.AJP;
    }

    public Amount DAW() {
        if (this.AJP == null) {
            this.AJP = new Amount();
        }

        return this.AJP;
    }

    public void setAmountSummaryWithoutTax(Amount var1) {
        this.AJP = var1;
    }

    public Amount getAmountTax() {
        return this.AJQ;
    }

    public Amount DAX() {
        if (this.AJQ == null) {
            this.AJQ = new Amount();
        }

        return this.AJQ;
    }

    public void setAmountTax(Amount var1) {
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

    public InvoicingDate getPaymentDate() {
        return this.AJS;
    }

    public InvoicingDate DAZ() {
        if (this.AJS == null) {
            this.AJS = new InvoicingDate();
        }

        return this.AJS;
    }

    public void setPaymentDate(InvoicingDate var1) {
        this.AJS = var1;
    }

    public PrivtePerson getPayed() {
        return this.AJT;
    }

    public PrivtePerson DBA() {
        if (this.AJT == null) {
            this.AJT = new PrivtePerson();
        }

        return this.AJT;
    }

    public void setPayed(PrivtePerson var1) {
        this.AJT = var1;
    }

    public PrivtePerson getPaymentDateByDeal() {
        return this.QLQ;
    }

    public PrivtePerson QOP() {
        if (this.QLQ == null) {
            this.QLQ = new PrivtePerson(false);
        }

        return this.QLQ;
    }

    public void setPaymentDateByDeal(PrivtePerson var1) {
        this.QLQ = var1;
    }

    public Text getRemarks() {
        return this.AJU;
    }

    public Text DBB() {
        if (this.AJU == null) {
            this.AJU = new Text();
        }

        return this.AJU;
    }

    public void setRemarks(Text var1) {
        this.AJU = var1;
    }

    public Text getExemptionReason() {
        return this.QLR;
    }

    public Text QOQ() {
        if (this.QLR == null) {
            this.QLR = new Text();
        }

        return this.QLR;
    }

    public void setExemptionReason(Text var1) {
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

    public ValueContainer2<BigDecimal, BigDecimal> getNetAndTaxForTaxRate(TaxRate var1) {

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
