package a.a.a.c.f.a.e.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.ModelBaseAbstract;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.n.InvoiceOtherSubtype;
import a.a.a.c.f.b.c.Amount;
import a.a.a.c.f.b.c.PrivtePerson;
import a.a.a.c.f.b.c.InvoicingDate;
import a.a.a.c.f.b.c.RefId;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.math.BigDecimal;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceRecordElement extends ModelBaseAbstract implements Comparable<InvoiceRecordElement> {
    private InvoicingDate AHTN;
    private InvoicingDate AHTO;
    private InvoicingDate AHTP;
    private InvoicingDate ALP;
    private RefId ALQ;
    private Contractor ALR;
    private Amount ALS;
    private Amount ALT;
    private Amount ALU;
    private ValueContainer2<Amount, Amount> ALV;
    private ValueContainer2<Amount, Amount> ALW;
    private ValueContainer2<Amount, Amount> ALX;
    private ValueContainer2<Amount, Amount> QLU;
    private ValueContainer2<Amount, Amount> ALY;
    private ValueContainer2<Amount, Amount> ALZ;
    private ValueContainer2<Amount, Amount> AMA;
    private ValueContainer2<Amount, Amount> AMB;
    private ValueContainer2<Amount, Amount> AMC;
    private ValueContainer2<Amount, Amount> AMD;
    private PrivtePerson FGB;
    private PrivtePerson QWR;
    private PrivtePerson QWS;
    private PrivtePerson QWT;
    private PrivtePerson QWU;
    private PrivtePerson QWV;
    private PrivtePerson QWW;
    private PrivtePerson QWX;
    private PrivtePerson QWY;
    private InvoiceOtherSubtype QWZ;
    private Boolean QXA;

    public InvoiceRecordElement() {

    }

    public InvoicingDate getDate() {
        return this.ALP;
    }

    public InvoicingDate QRF() {
        if (this.ALP == null) {
            this.ALP = new InvoicingDate();
        }

        return this.ALP;
    }

    public void setDate(InvoicingDate var1) {
        this.ALP = var1;
    }

    public Amount getGross() {
        return this.ALS;
    }

    public Amount QRG() {
        if (this.ALS == null) {
            this.ALS = new Amount();
        }

        return this.ALS;
    }

    public void setGross(Amount var1) {
        this.ALS = var1;
    }

    public Amount getNet() {
        return this.ALT;
    }

    public Amount QRH() {
        if (this.ALT == null) {
            this.ALT = new Amount();
        }

        return this.ALT;
    }

    public void setNet(Amount var1) {
        this.ALT = var1;
    }

    public Amount getVat() {
        return this.ALU;
    }

    public Amount QRI() {
        if (this.ALU == null) {
            this.ALU = new Amount();
        }

        return this.ALU;
    }

    public void setVat(Amount var1) {
        this.ALU = var1;
    }

    public ValueContainer2<Amount, Amount> getVat23() {
        return this.ALV;
    }

    public ValueContainer2<Amount, Amount> QRJ() {
        if (this.ALV == null) {
            this.ALV = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALV;
    }

    public void setVat23(ValueContainer2<Amount, Amount> var1) {
        this.ALV = var1;
    }

    public ValueContainer2<Amount, Amount> getVat8() {
        return this.ALW;
    }

    public ValueContainer2<Amount, Amount> QRK() {
        if (this.ALW == null) {
            this.ALW = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALW;
    }

    public void setVat8(ValueContainer2<Amount, Amount> var1) {
        this.ALW = var1;
    }

    public ValueContainer2<Amount, Amount> getVat5() {
        return this.ALX;
    }

    public ValueContainer2<Amount, Amount> QRL() {
        if (this.ALX == null) {
            this.ALX = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALX;
    }

    public void setVat5(ValueContainer2<Amount, Amount> var1) {
        this.ALX = var1;
    }

    public ValueContainer2<Amount, Amount> getVat4() {
        return this.QLU;
    }

    public ValueContainer2<Amount, Amount> QRM() {
        if (this.QLU == null) {
            this.QLU = new ValueContainer2(new Amount(), new Amount());
        }

        return this.QLU;
    }

    public void setVat4(ValueContainer2<Amount, Amount> var1) {
        this.QLU = var1;
    }

    public ValueContainer2<Amount, Amount> getVat0() {
        return this.ALY;
    }

    public ValueContainer2<Amount, Amount> QRN() {
        if (this.ALY == null) {
            this.ALY = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALY;
    }

    public void setVat0(ValueContainer2<Amount, Amount> var1) {
        this.ALY = var1;
    }

    public ValueContainer2<Amount, Amount> getVatZw() {
        return this.ALZ;
    }

    public ValueContainer2<Amount, Amount> QRO() {
        if (this.ALZ == null) {
            this.ALZ = new ValueContainer2(new Amount(), new Amount());
        }

        return this.ALZ;
    }

    public void setVatZw(ValueContainer2<Amount, Amount> var1) {
        this.ALZ = var1;
    }

    public ValueContainer2<Amount, Amount> getVatNp() {
        return this.AMA;
    }

    public ValueContainer2<Amount, Amount> QRP() {
        if (this.AMA == null) {
            this.AMA = new ValueContainer2(new Amount(), new Amount());
        }

        return this.AMA;
    }

    public void setVatNp(ValueContainer2<Amount, Amount> var1) {
        this.AMA = var1;
    }

    public ValueContainer2<Amount, Amount> getVatOo23() {
        return this.AMB;
    }

    public ValueContainer2<Amount, Amount> QRQ() {
        if (this.AMB == null) {
            this.AMB = new ValueContainer2(new Amount(), new Amount());
        }

        return this.AMB;
    }

    public void setVatOo23(ValueContainer2<Amount, Amount> var1) {
        this.AMB = var1;
    }

    public ValueContainer2<Amount, Amount> getVatOo8() {
        return this.AMC;
    }

    public ValueContainer2<Amount, Amount> QRR() {
        if (this.AMC == null) {
            this.AMC = new ValueContainer2(new Amount(), new Amount());
        }

        return this.AMC;
    }

    public void setVatOo8(ValueContainer2<Amount, Amount> var1) {
        this.AMC = var1;
    }

    public ValueContainer2<Amount, Amount> getVatOo5() {
        return this.AMD;
    }

    public ValueContainer2<Amount, Amount> QRS() {
        if (this.AMD == null) {
            this.AMD = new ValueContainer2(new Amount(), new Amount());
        }

        return this.AMD;
    }

    public void setVatOo5(ValueContainer2<Amount, Amount> var1) {
        this.AMD = var1;
    }

    public RefId getRefId() {
        return this.ALQ;
    }

    public RefId HGX() {
        if (this.ALQ == null) {
            this.ALQ = new RefId();
        }

        return this.ALQ;
    }

    public void setRefId(RefId var1) {
        this.ALQ = var1;
    }

    public Contractor getContractor() {
        return this.ALR;
    }

    public Contractor HGY() {
        if (this.ALR == null) {
            this.ALR = new Contractor();
        }

        return this.ALR;
    }

    public void setContractor(Contractor var1) {
        this.ALR = var1;
    }

    public int compareTo(InvoiceRecordElement var1) {
        int var2 = var1.ALP.compareTo(this.ALP);
        if (var2 == 0) {
            var2 = var1.ALQ.compareTo(this.ALQ);
            if (var2 == 0) {
                var2 = 1;
            }
        }

        return var2;
    }

    public InvoicingDate AICN() {
        if (this.AHTN == null) {
            if (this.ALP != null) {
                this.AHTN = this.ALP.DEF();
            } else {
                this.AHTN = new InvoicingDate(new Date());
            }
        }

        return this.AHTN;
    }

    public InvoicingDate AICO() {
        if (this.AHTO == null) {
            if (this.ALP != null) {
                this.AHTO = this.ALP.DEF();
            } else {
                this.AHTO = new InvoicingDate(new Date());
            }
        }

        return this.AHTO;
    }

    public InvoicingDate AICP() {
        if (this.AHTP == null) {
            if (this.ALP != null) {
                this.AHTP = this.ALP.DEF();
            } else {
                this.AHTP = new InvoicingDate(new Date());
            }
        }

        return this.AHTP;
    }

    public void setCreationDate(InvoicingDate var1) {
        this.AHTN = var1;
    }

    public void setTransactionDate(InvoicingDate var1) {
        this.AHTO = var1;
    }

    public void setReceiveDate(InvoicingDate var1) {
        this.AHTP = var1;
    }

    public PrivtePerson getFromPurchase() {
        return this.FGB;
    }

    public void setFromPurchase(PrivtePerson var1) {
        this.FGB = var1;
    }

    public PrivtePerson HGZ() {
        if (this.FGB == null) {
            this.FGB = new PrivtePerson();
        }

        return this.FGB;
    }

    public ValueContainer2<Amount, Amount> getVat4and8() {
        BigDecimal var1 = BigDecimal.ZERO;
        BigDecimal var2 = BigDecimal.ZERO;
        if (this.QLU != null && this.QLU.getFirstValue() != null && this.QLU.getFirstValue().getValue() != null) {
            var1 = var1.add(this.QLU.getFirstValue().getValue());
        }

        if (this.ALW != null && this.ALW.getFirstValue() != null && this.ALW.getFirstValue().getValue() != null) {
            var1 = var1.add(this.ALW.getFirstValue().getValue());
        }

        if (this.QLU != null && this.QLU.getSecondValue() != null && this.QLU.getSecondValue().getValue() != null) {
            var2 = var2.add(this.QLU.getSecondValue().getValue());
        }

        if (this.ALW != null && this.ALW.getSecondValue() != null && this.ALW.getSecondValue().getValue() != null) {
            var2 = var2.add(this.ALW.getSecondValue().getValue());
        }

        return new ValueContainer2(new Amount(var1), new Amount(var2));
    }

    public ValueContainer2<Amount, Amount> QRT() {
        return this.getVat4and8();
    }

    public void setVat4and8(ValueContainer2<Amount, Amount> var1) {
        throw new FFI("This method should not be used");
    }

    public PrivtePerson getOtherSellReason1() {
        return this.QWR;
    }

    public void setOtherSellReason1(PrivtePerson var1) {
        this.QWR = var1;
    }

    public PrivtePerson RII() {
        if (this.QWR == null) {
            this.QWR = new PrivtePerson();
        }

        return this.QWR;
    }

    public PrivtePerson getOtherSellReason2() {
        return this.QWS;
    }

    public void setOtherSellReason2(PrivtePerson var1) {
        this.QWS = var1;
    }

    public PrivtePerson RIJ() {
        if (this.QWS == null) {
            this.QWS = new PrivtePerson();
        }

        return this.QWS;
    }

    public PrivtePerson getOtherSellReason3() {
        return this.QWT;
    }

    public void setOtherSellReason3(PrivtePerson var1) {
        this.QWT = var1;
    }

    public PrivtePerson RIK() {
        if (this.QWT == null) {
            this.QWT = new PrivtePerson();
        }

        return this.QWT;
    }

    public PrivtePerson getOtherSellReason4() {
        return this.QWU;
    }

    public void setOtherSellReason4(PrivtePerson var1) {
        this.QWU = var1;
    }

    public PrivtePerson RIL() {
        if (this.QWU == null) {
            this.QWU = new PrivtePerson();
        }

        return this.QWU;
    }

    public PrivtePerson getOtherPurchaseReason1() {
        return this.QWV;
    }

    public void setOtherPurchaseReason1(PrivtePerson var1) {
        this.QWV = var1;
    }

    public PrivtePerson RIM() {
        if (this.QWV == null) {
            this.QWV = new PrivtePerson();
        }

        return this.QWV;
    }

    public PrivtePerson getOtherPurchaseReason2() {
        return this.QWW;
    }

    public void setOtherPurchaseReason2(PrivtePerson var1) {
        this.QWW = var1;
    }

    public PrivtePerson RIN() {
        if (this.QWW == null) {
            this.QWW = new PrivtePerson();
        }

        return this.QWW;
    }

    public PrivtePerson getOtherPurchaseReason3() {
        return this.QWX;
    }

    public void setOtherPurchaseReason3(PrivtePerson var1) {
        this.QWX = var1;
    }

    public PrivtePerson RIO() {
        if (this.QWX == null) {
            this.QWX = new PrivtePerson();
        }

        return this.QWX;
    }

    public PrivtePerson getOtherPurchaseReason4() {
        return this.QWY;
    }

    public void setOtherPurchaseReason4(PrivtePerson var1) {
        this.QWY = var1;
    }

    public PrivtePerson RIP() {
        if (this.QWY == null) {
            this.QWY = new PrivtePerson();
        }

        return this.QWY;
    }

    public void setIsAggregatePurchase(Boolean var1) {
        this.QXA = var1;
    }

    public Boolean getIsAggregatePurchase() {
        return this.QXA;
    }

    public InvoiceOtherSubtype getInvoiceOtherSubType() {
        return this.QWZ;
    }

    public void setInvoiceOtherSubType(InvoiceOtherSubtype var1) {
        this.QWZ = var1;
    }
}
