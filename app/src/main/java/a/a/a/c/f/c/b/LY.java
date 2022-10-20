package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.c.*;
import a.a.a.c.f.c.LW;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "userData"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class LY extends LW {
    private KA AQP;
    private KF AQQ;
    private KO AQR;
    private KO AQS;
    private KO AQT;
    private KS AQU;
    private JU AQV;
    private JT AQW;
    private JJ AQX;
    private JQ AQY;
    private JV AQZ;
    private KP ARA;
    private KC ARB;

    public LY() {
        EXF.getInstance().ICO();

        try {
            this.DFN().DCV().setValue("PL");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public LY DFE() {
        EXF.getInstance().ICO();

        LY var2;
        try {
            LY var1 = new LY();
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
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public KA getNip() {
        return this.AQP;
    }

    public KA DFF() {
        if (this.AQP == null) {
            this.AQP = new KA();
        }

        return this.AQP;
    }

    public void setNip(KA var1) {
        this.AQP = var1;
    }

    public KF getRegon() {
        return this.AQQ;
    }

    public KF DFG() {
        if (this.AQQ == null) {
            this.AQQ = new KF();
        }

        return this.AQQ;
    }

    public void setRegon(KF var1) {
        this.AQQ = var1;
    }

    public KO getCompanyName() {
        return this.AQR;
    }

    public KO DFH() {
        if (this.AQR == null) {
            this.AQR = new KO();
        }

        return this.AQR;
    }

    public void setCompanyName(KO var1) {
        this.AQR = var1;
    }

    public KO getFirstName() {
        return this.AQS;
    }

    public KO DFI() {
        if (this.AQS == null) {
            this.AQS = new KO();
        }

        return this.AQS;
    }

    public void setFirstName(KO var1) {
        this.AQS = var1;
    }

    public KO getSurname() {
        return this.AQT;
    }

    public KO DFJ() {
        if (this.AQT == null) {
            this.AQT = new KO();
        }

        return this.AQT;
    }

    public void setSurname(KO var1) {
        this.AQT = var1;
    }

    public KS getTelephone() {
        return this.AQU;
    }

    public KS DFK() {
        if (this.AQU == null) {
            this.AQU = new KS();
        }

        return this.AQU;
    }

    public void setTelephone(KS var1) {
        this.AQU = var1;
    }

    public JU getEmail() {
        return this.AQV;
    }

    public JU DFL() {
        if (this.AQV == null) {
            this.AQV = new JU();
        }

        return this.AQV;
    }

    public void setEmail(JU var1) {
        this.AQV = var1;
    }

    public JT getLogoImg() {
        return this.AQW;
    }

    public JT DFM() {
        if (this.AQW == null) {
            this.AQW = new JT();
        }

        return this.AQW;
    }

    public void setLogoImg(JT var1) {
        this.AQW = var1;
    }

    public JJ getAddress() {
        return this.AQX;
    }

    public JJ DFN() {
        if (this.AQX == null) {
            this.AQX = new JJ();
        }

        return this.AQX;
    }

    public void setAddress(JJ var1) {
        this.AQX = var1;
    }

    public JQ getAccountNumber() {
        return this.AQY;
    }

    public JQ DFO() {
        if (this.AQY == null) {
            this.AQY = new JQ();
        }

        return this.AQY;
    }

    public void setAccountNumber(JQ var1) {
        this.AQY = var1;
    }

    public JV getStartDate() {
        return this.AQZ;
    }

    public JV DFP() {
        if (this.AQZ == null) {
            this.AQZ = new JV();
        }

        return this.AQZ;
    }

    public void setStartDate(JV var1) {
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
