package a.a.a.c.f.a.c;

import a.a.a.c.f.a.ModelBusinessTopElement;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.c.*;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "contractor"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class Contractor extends ModelBusinessTopElement implements Comparable<Contractor> {
    private KO AIT;
    private KA AIU;
    private KF AIV;
    private JQ AIW;
    private JJ AIX;
    private KS AIY;
    private JU AIZ;
    private KO AJA;
    private JS AHRM = new JS(false);

    public Contractor() {

    }

    public KO getName() {
        return this.AIT;
    }

    public KO DAI() {
        if (this.AIT == null) {
            this.AIT = new KO();
        }

        return this.AIT;
    }

    public void setName(KO var1) {
        this.AIT = var1;
    }

    public KA getNip() {
        return this.AIU;
    }

    public KA DAJ() {
        if (this.AIU == null) {
            this.AIU = new KA();
        }

        return this.AIU;
    }

    public void setNip(KA var1) {
        this.AIU = var1;
    }

    public KF getRegon() {
        return this.AIV;
    }

    public KF DAK() {
        if (this.AIV == null) {
            this.AIV = new KF();
        }

        return this.AIV;
    }

    public void setRegon(KF var1) {
        this.AIV = var1;
    }

    public JQ getAccountNumber() {
        return this.AIW;
    }

    public JQ DAL() {
        if (this.AIW == null) {
            this.AIW = new JQ();
        }

        return this.AIW;
    }

    public void setAccountNumber(JQ var1) {
        this.AIW = var1;
    }

    public JJ getAddress() {
        return this.AIX;
    }

    public JJ DAM() {
        if (this.AIX == null) {
            this.AIX = new JJ();
        }

        return this.AIX;
    }

    public void setAddress(JJ var1) {
        this.AIX = var1;
    }

    public void setTelephone(KS var1) {
        this.AIY = var1;
    }

    public KS DAN() {
        if (this.AIY == null) {
            this.AIY = new KS();
        }

        return this.AIY;
    }

    public KS getTelephone() {
        return this.AIY;
    }

    public void setEmail(JU var1) {
        this.AIZ = var1;
    }

    public JU DAO() {
        if (this.AIZ == null) {
            this.AIZ = new JU();
        }

        return this.AIZ;
    }

    public JU getEmail() {
        return this.AIZ;
    }

    public KO getRemarks() {
        return this.AJA;
    }

    public KO DAP() {
        if (this.AJA == null) {
            this.AJA = new KO();
        }

        return this.AJA;
    }

    public void setRemarks(KO var1) {
        this.AJA = var1;
    }

    public int compareTo(Contractor var1) {
        return this.AIT.getValue().compareToIgnoreCase(var1.AIT.getValue());
    }

    public String toString() {
        return "Contractor [name=" + this.AIT + ", nip=" + this.AIU + "]";
    }

    public Contractor AICD() {

        Contractor var2;
        Contractor var1 = new Contractor();
        var1.AIT = this.AIT != null ? this.AIT.DER() : null;
        var1.AIU = this.AIU != null ? this.AIU.DEJ() : null;
        var1.AIV = this.AIV != null ? this.AIV.DEM() : null;
        var1.AIW = this.AIW != null ? this.AIW.DDP() : null;
        var1.AIX = this.AIX != null ? this.AIX.DCU() : null;
        var1.AIZ = this.AIZ != null ? this.AIZ.DDY() : null;
        var1.AIY = this.AIY != null ? this.AIY.DET() : null;
        var1.AJA = this.AJA != null ? this.AJA.DER() : null;
        var1.AHRM = new JS(this.AICE());
        var2 = var1;

        return var2;
    }

    public String getType() {
        return FCW.getInstance().getMessageForKey("micro.model.type.contractor");
    }

    public void setPrivtePerson(boolean var1) {
        this.AHRM.setValue(var1);
    }

    public JS getPrivatePerson() {
        return this.AHRM;
    }

    public boolean AICE() {
        return this.AHRM.getValue();
    }

    public int QON() {
        int var2 = 1;
        var2 = 31 * var2 + (this.AIW == null ? 0 : this.AIW.hashCode());
        var2 = 31 * var2 + (this.AIX == null ? 0 : this.AIX.QOR());
        var2 = 31 * var2 + (this.AIZ == null ? 0 : this.AIZ.hashCode());
        var2 = 31 * var2 + (this.AIT == null ? 0 : this.AIT.hashCode());
        var2 = 31 * var2 + (this.AIU == null ? 0 : this.AIU.hashCode());
        var2 = 31 * var2 + (this.AHRM == null ? 0 : this.AHRM.hashCode());
        var2 = 31 * var2 + (this.AIV == null ? 0 : this.AIV.hashCode());
        var2 = 31 * var2 + (this.AJA == null ? 0 : this.AJA.hashCode());
        var2 = 31 * var2 + (this.AIY == null ? 0 : this.AIY.hashCode());
        return var2;
    }
}
