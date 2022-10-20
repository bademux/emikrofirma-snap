package a.a.a.c.f.a.n;

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
public abstract class InvoiceOther<_T extends InvoiceOtherElement> extends ModelBusinessPeriodElement {
    private final InvoiceOtherType QXB;
    private InvoiceOtherSubtype QXC;
    private Nip QXD;
    private RefId QXE;
    private InvoicingDate QXF;
    private final List<ValueContainer2<TaxRate, BigDecimal>> QXG;
    private final List<ValueContainer2<TaxRate, BigDecimal>> QXH;
    private final List<ValueContainer2<TaxRate, BigDecimal>> QXI;
    private Amount QXJ;
    private Amount QXK;
    private Amount QXL;
    private KB QXM;
    private InvoicingDate QXN;
    private PrivtePerson QXO;
    private PrivtePerson QXP;
    private Text QXQ;
    private Text QXR;
    @XmlElements({@XmlElement(
            name = "invoiceOtherElementSell",
            type = InvoiceOtherElementSell.class
    ), @XmlElement(
            name = "invoiceOtherElementPurchase",
            type = InvoiceOtherElementPurchase.class
    )})
    private List<_T> QXS;
    private JY QXT;

    protected InvoiceOther(InvoiceOtherType var1, InvoiceOtherSubtype var2) {

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

    public InvoiceOtherType getInvoiceOtherType() {
        return this.QXB;
    }

    public InvoiceOtherSubtype getInvoiceOtherSubType() {
        return this.QXC;
    }

    public void setInvoiceOtherSubType(InvoiceOtherSubtype var1) {
        this.QXC = var1;
    }

    public Nip getIssuerNumber() {
        return this.QXD;
    }

    public Nip RIQ() {
        if (this.QXD == null) {
            this.QXD = new Nip();
        }

        return this.QXD;
    }

    public void setIssuerNumber(Nip var1) {
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

    public InvoicingDate getCreationDate() {
        return this.QXF;
    }

    public InvoicingDate RIS() {
        if (this.QXF == null) {
            this.QXF = new InvoicingDate();
        }

        return this.QXF;
    }

    public void setCreationDate(InvoicingDate var1) {
        this.QXF = var1;
    }

    public List<ValueContainer2<TaxRate, BigDecimal>> getSumOfAmountsDividedByTaxRate() {
        return this.QXG;
    }

    public List<ValueContainer2<TaxRate, BigDecimal>> getAmountOfTaxDividedByTaxRate() {
        return this.QXH;
    }

    public List<ValueContainer2<TaxRate, BigDecimal>> getSumOfGrossAmountsDividedByTaxRate() {
        return this.QXI;
    }

    public Amount getAmountSummaryWithTax() {
        return this.QXJ;
    }

    public Amount RIT() {
        if (this.QXJ == null) {
            this.QXJ = new Amount();
        }

        return this.QXJ;
    }

    public void setAmountSummaryWithTax(Amount var1) {
        this.QXJ = var1;
    }

    public Amount getAmountSummaryWithoutTax() {
        return this.QXK;
    }

    public Amount RIU() {
        if (this.QXK == null) {
            this.QXK = new Amount();
        }

        return this.QXK;
    }

    public void setAmountSummaryWithoutTax(Amount var1) {
        this.QXK = var1;
    }

    public Amount getAmountTax() {
        return this.QXL;
    }

    public Amount RIV() {
        if (this.QXL == null) {
            this.QXL = new Amount();
        }

        return this.QXL;
    }

    public void setAmountTax(Amount var1) {
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

    public InvoicingDate getPaymentDate() {
        return this.QXN;
    }

    public InvoicingDate RIX() {
        if (this.QXN == null) {
            this.QXN = new InvoicingDate();
        }

        return this.QXN;
    }

    public void setPaymentDate(InvoicingDate var1) {
        this.QXN = var1;
    }

    public PrivtePerson getPayed() {
        return this.QXO;
    }

    public PrivtePerson RIY() {
        if (this.QXO == null) {
            this.QXO = new PrivtePerson();
        }

        return this.QXO;
    }

    public void setPayed(PrivtePerson var1) {
        this.QXO = var1;
    }

    public PrivtePerson getPaymentDateByDeal() {
        return this.QXP;
    }

    public PrivtePerson RIZ() {
        if (this.QXP == null) {
            this.QXP = new PrivtePerson(false);
        }

        return this.QXP;
    }

    public void setPaymentDateByDeal(PrivtePerson var1) {
        this.QXP = var1;
    }

    public Text getRemarks() {
        return this.QXQ;
    }

    public Text RJA() {
        if (this.QXQ == null) {
            this.QXQ = new Text();
        }

        return this.QXQ;
    }

    public void setRemarks(Text var1) {
        this.QXQ = var1;
    }

    public Text getExemptionReason() {
        return this.QXR;
    }

    public Text RJB() {
        if (this.QXR == null) {
            this.QXR = new Text();
        }

        return this.QXR;
    }

    public void setExemptionReason(Text var1) {
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
