package a.a.a.c.f.c.b;

import a.a.a.c.f.b.a.Address;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.c.LW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "userData"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class UserData extends LW {
    private Nip AQP;
    private Regon AQQ;
    private Text AQR;
    private Text AQS;
    private Text AQT;
    private Telephone AQU;
    private Email AQV;
    private Bytes AQW;
    private Address AQX;
    private AccountNumber AQY;
    private InvoicingDate AQZ;
    private KP ARA;
    private KC ARB;

    public UserData() {

        this.DFN().DCV().setValue("PL");

    }

    public UserData DFE() {

        UserData var2;
        UserData var1 = new UserData();
        var1.AQJ = this.AQJ != null ? this.AQJ.DEH() : null;
        var1.AQP = this.AQP != null ? this.AQP.DEJ() : null;
        var1.AQQ = this.AQQ != null ? this.AQQ.DEM() : null;
        var1.AQR = this.AQR != null ? this.AQR.DER() : null;
        var1.AQS = this.AQS != null ? this.AQS.DER() : null;
        var1.AQT = this.AQT != null ? this.AQT.DER() : null;
        var1.AQU = this.AQU != null ? this.AQU.DET() : null;
        var1.AQV = this.AQV != null ? this.AQV.DDY() : null;
        var1.AQW = this.AQW != null ? this.AQW.DDX() : null;
        var1.AQX = this.AQX != null ? this.AQX.DCU() : null;
        var1.AQY = this.AQY != null ? this.AQY.DDP() : null;
        var1.AQZ = this.AQZ != null ? this.AQZ.DEF() : null;
        var1.ARA = this.ARA != null ? this.ARA.DES() : null;
        var1.ARB = this.ARB != null ? this.ARB.DEK() : null;
        var2 = var1;

        return var2;
    }

    public Nip getNip() {
        return this.AQP;
    }

    public Nip DFF() {
        if (this.AQP == null) {
            this.AQP = new Nip();
        }

        return this.AQP;
    }

    public void setNip(Nip var1) {
        this.AQP = var1;
    }

    public Regon getRegon() {
        return this.AQQ;
    }

    public Regon DFG() {
        if (this.AQQ == null) {
            this.AQQ = new Regon();
        }

        return this.AQQ;
    }

    public void setRegon(Regon var1) {
        this.AQQ = var1;
    }

    public Text getCompanyName() {
        return this.AQR;
    }

    public Text DFH() {
        if (this.AQR == null) {
            this.AQR = new Text();
        }

        return this.AQR;
    }

    public void setCompanyName(Text var1) {
        this.AQR = var1;
    }

    public Text getFirstName() {
        return this.AQS;
    }

    public Text DFI() {
        if (this.AQS == null) {
            this.AQS = new Text();
        }

        return this.AQS;
    }

    public void setFirstName(Text var1) {
        this.AQS = var1;
    }

    public Text getSurname() {
        return this.AQT;
    }

    public Text DFJ() {
        if (this.AQT == null) {
            this.AQT = new Text();
        }

        return this.AQT;
    }

    public void setSurname(Text var1) {
        this.AQT = var1;
    }

    public Telephone getTelephone() {
        return this.AQU;
    }

    public Telephone DFK() {
        if (this.AQU == null) {
            this.AQU = new Telephone();
        }

        return this.AQU;
    }

    public void setTelephone(Telephone var1) {
        this.AQU = var1;
    }

    public Email getEmail() {
        return this.AQV;
    }

    public Email DFL() {
        if (this.AQV == null) {
            this.AQV = new Email();
        }

        return this.AQV;
    }

    public void setEmail(Email var1) {
        this.AQV = var1;
    }

    public Bytes getLogoImg() {
        return this.AQW;
    }

    public Bytes DFM() {
        if (this.AQW == null) {
            this.AQW = new Bytes();
        }

        return this.AQW;
    }

    public void setLogoImg(Bytes var1) {
        this.AQW = var1;
    }

    public Address getAddress() {
        return this.AQX;
    }

    public Address DFN() {
        if (this.AQX == null) {
            this.AQX = new Address();
        }

        return this.AQX;
    }

    public void setAddress(Address var1) {
        this.AQX = var1;
    }

    public AccountNumber getAccountNumber() {
        return this.AQY;
    }

    public AccountNumber DFO() {
        if (this.AQY == null) {
            this.AQY = new AccountNumber();
        }

        return this.AQY;
    }

    public void setAccountNumber(AccountNumber var1) {
        this.AQY = var1;
    }

    public InvoicingDate getStartDate() {
        return this.AQZ;
    }

    public InvoicingDate DFP() {
        if (this.AQZ == null) {
            this.AQZ = new InvoicingDate();
        }

        return this.AQZ;
    }

    public void setStartDate(InvoicingDate var1) {
        this.AQZ = var1;
    }

    public KP getTaxOffice() {
        return this.ARA;
    }

    public KP DFQ() {
        if (this.ARA == null) {
            this.ARA = new KP();
        }

        return this.ARA;
    }

    public void setTaxOffice(KP var1) {
        this.ARA = var1;
    }

    public KC getPeriodType() {
        return this.ARB;
    }

    public KC DFR() {
        if (this.ARB == null) {
            this.ARB = new KC();
        }

        return this.ARB;
    }

    public void setPeriodType(KC var1) {
        this.ARB = var1;
    }

    public String toString() {
        return "UserData [version=" + this.AQJ + ", nip=" + this.AQP + ", regon=" + this.AQQ + ", companyName=" + this.AQR + ", firstName=" + this.AQS + ", surname=" + this.AQT + ", telephone=" + this.AQU + ", email=" + this.AQV + ", logoImg=" + this.AQW + ", address=" + this.AQX + ", accountNumber=" + this.AQY + ", startDate=" + this.AQZ + ", taxOffice=" + this.ARA + ", periodType=" + this.ARB + ", toString()=" + super.toString() + "]";
    }
}
