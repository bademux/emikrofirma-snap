package a.a.a.c.f.a.c;

import a.a.a.c.f.a.ModelBusinessTopElement;
import a.a.a.c.f.b.a.Address;
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
    private Text AIT;
    private Nip AIU;
    private Regon AIV;
    private AccountNumber AIW;
    private Address AIX;
    private Telephone AIY;
    private Email AIZ;
    private Text AJA;
    private PrivtePerson AHRM = new PrivtePerson(false);

    public Contractor() {

    }

    public Text getName() {
        return this.AIT;
    }

    public Text DAI() {
        if (this.AIT == null) {
            this.AIT = new Text();
        }

        return this.AIT;
    }

    public void setName(Text var1) {
        this.AIT = var1;
    }

    public Nip getNip() {
        return this.AIU;
    }

    public Nip DAJ() {
        if (this.AIU == null) {
            this.AIU = new Nip();
        }

        return this.AIU;
    }

    public void setNip(Nip var1) {
        this.AIU = var1;
    }

    public Regon getRegon() {
        return this.AIV;
    }

    public Regon DAK() {
        if (this.AIV == null) {
            this.AIV = new Regon();
        }

        return this.AIV;
    }

    public void setRegon(Regon var1) {
        this.AIV = var1;
    }

    public AccountNumber getAccountNumber() {
        return this.AIW;
    }

    public AccountNumber DAL() {
        if (this.AIW == null) {
            this.AIW = new AccountNumber();
        }

        return this.AIW;
    }

    public void setAccountNumber(AccountNumber var1) {
        this.AIW = var1;
    }

    public Address getAddress() {
        return this.AIX;
    }

    public Address DAM() {
        if (this.AIX == null) {
            this.AIX = new Address();
        }

        return this.AIX;
    }

    public void setAddress(Address var1) {
        this.AIX = var1;
    }

    public void setTelephone(Telephone var1) {
        this.AIY = var1;
    }

    public Telephone DAN() {
        if (this.AIY == null) {
            this.AIY = new Telephone();
        }

        return this.AIY;
    }

    public Telephone getTelephone() {
        return this.AIY;
    }

    public void setEmail(Email var1) {
        this.AIZ = var1;
    }

    public Email DAO() {
        if (this.AIZ == null) {
            this.AIZ = new Email();
        }

        return this.AIZ;
    }

    public Email getEmail() {
        return this.AIZ;
    }

    public Text getRemarks() {
        return this.AJA;
    }

    public Text DAP() {
        if (this.AJA == null) {
            this.AJA = new Text();
        }

        return this.AJA;
    }

    public void setRemarks(Text var1) {
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
        var1.AHRM = new PrivtePerson(this.AICE());
        var2 = var1;

        return var2;
    }

    public String getType() {
        return FCW.getInstance().getMessageForKey("micro.model.type.contractor");
    }

    public void setPrivtePerson(boolean var1) {
        this.AHRM.setValue(var1);
    }

    public PrivtePerson getPrivatePerson() {
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
