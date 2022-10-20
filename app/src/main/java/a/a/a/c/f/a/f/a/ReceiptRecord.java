package a.a.a.c.f.a.f.a;

import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.b.c.RefId;
import a.a.a.c.f.b.c.a.TaxRate;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class ReceiptRecord extends ModelBusinessPeriodElement {
    public static final TaxRate[] AMJ;
    private RecordType AMK;
    private InvoicingDate AML;
    private RefId AMM;

    public ReceiptRecord() {

    }

    public ReceiptRecord(RecordType var1) {
        this();

        this.AMK = var1;

    }

    public RecordType getReceiptRecordType() {
        return this.AMK;
    }

    public InvoicingDate getCreationDate() {
        return this.AML;
    }

    public InvoicingDate DCE() {
        if (this.AML == null) {
            this.AML = new InvoicingDate();
        }

        return this.AML;
    }

    public void setCreationDate(InvoicingDate var1) {
        this.AML = var1;
    }

    public int hashCode() {
        int var1 = super.hashCode();
        var1 = 31 * var1 + (this.AMK != null ? this.AMK.hashCode() : 0);
        var1 = 31 * var1 + (this.AMM != null ? this.AMM.hashCode() : 0);
        var1 = 31 * var1 + (this.APB != null ? this.APB.hashCode() : 0);
        return var1;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (!super.equals(var1)) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            ReceiptRecord var2 = (ReceiptRecord) var1;
            if (this.AMK != var2.AMK) {
                return false;
            } else if (!this.AMM.equals(var2.getRefId())) {
                return false;
            } else {
                return this.APB.equals(var2.getId());
            }
        }
    }

    public String toString() {
        return "ReceiptRecord [receiptRecordType=" + this.AMK + ", toString()=" + super.toString() + "]";
    }

    public RefId getRefId() {
        return this.AMM;
    }

    public void setRefId(RefId var1) {
        this.AMM = var1;
    }

    static {
        AMJ = new TaxRate[]{TaxRate.RATE_23, TaxRate.RATE_8, TaxRate.RATE_5, TaxRate.RATE_4, TaxRate.RATE_0, TaxRate.ZW, TaxRate.NP};
    }
}
