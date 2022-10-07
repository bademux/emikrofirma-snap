package a.a.a.c.f.b.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IJ;
import a.a.a.c.f.b.c.KO;
import a.a.a.c.f.b.c.KT;
import a.a.a.c.g.b.FCW;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Optional;

@XmlAccessorType(XmlAccessType.FIELD)
public class JJ extends IJ {
    private JK ANR;
    private KT ANS;
    private KO ANT;
    private KO ANU;
    private KO ANV;
    private KO ANW;
    private KO ANX;
    private KO ANY;
    private JL ANZ;
    private KO AOA;

    public JJ() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public String AICQ() {
        StringBuilder var1 = new StringBuilder();
        var1.append(Optional.ofNullable(this.ANW.getValue()).orElse(""));
        var1.append(" ");
        var1.append(Optional.ofNullable(this.ANX.getValue()).orElse(""));
        String var2 = Optional.ofNullable(this.ANY.getValue()).orElse("");
        if (var2.trim().length() > 0) {
            var1.append(" ");
            var1.append(FCW.getInstance().getMessageForKey("micro.process.invoices_records.apartmentAbbr"));
            var1.append(" ");
            var1.append(this.ANY.getValue());
        }

        var1.append(" ");
        var1.append(Optional.ofNullable(this.ANZ.getValue()).orElse(""));
        var1.append(" ");
        var1.append(Optional.ofNullable(this.ANV.getValue()).orElse(""));
        return var1.toString();
    }

    public JJ DCU() {
        EXF.getInstance().ICO();

        JJ var2;
        try {
            JJ var1 = new JJ();
            var1.ANR = this.ANR != null ? this.ANR.DDH() : null;
            var1.ANS = this.ANS != null ? this.ANS.DEU() : null;
            var1.ANT = this.ANT != null ? this.ANT.DER() : null;
            var1.ANU = this.ANU != null ? this.ANU.DER() : null;
            var1.ANV = this.ANV != null ? this.ANV.DER() : null;
            var1.ANW = this.ANW != null ? this.ANW.DER() : null;
            var1.ANX = this.ANX != null ? this.ANX.DER() : null;
            var1.ANY = this.ANY != null ? this.ANY.DER() : null;
            var1.ANZ = this.ANZ != null ? this.ANZ.DDI() : null;
            var1.AOA = this.AOA != null ? this.AOA.DER() : null;
            var2 = var1;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public JK getCountryCode() {
        return this.ANR;
    }

    public JK DCV() {
        if (this.ANR == null) {
            this.ANR = new JK();
        }

        return this.ANR;
    }

    public void setCountryCode(JK var1) {
        this.ANR = var1;
    }

    public KT getVoivodeship() {
        return this.ANS;
    }

    public KT DCW() {
        if (this.ANS == null) {
            this.ANS = new KT();
        }

        return this.ANS;
    }

    public void setVoivodeship(KT var1) {
        this.ANS = var1;
    }

    public KO getDistrict() {
        return this.ANT;
    }

    public KO DCX() {
        if (this.ANT == null) {
            this.ANT = new KO();
        }

        return this.ANT;
    }

    public void setDistrict(KO var1) {
        this.ANT = var1;
    }

    public KO getCommunity() {
        return this.ANU;
    }

    public KO DCY() {
        if (this.ANU == null) {
            this.ANU = new KO();
        }

        return this.ANU;
    }

    public void setCommunity(KO var1) {
        this.ANU = var1;
    }

    public KO getCity() {
        return this.ANV;
    }

    public KO DCZ() {
        if (this.ANV == null) {
            this.ANV = new KO();
        }

        return this.ANV;
    }

    public void setCity(KO var1) {
        this.ANV = var1;
    }

    public KO getStreet() {
        return this.ANW;
    }

    public KO DDA() {
        if (this.ANW == null) {
            this.ANW = new KO();
        }

        return this.ANW;
    }

    public void setStreet(KO var1) {
        this.ANW = var1;
    }

    public KO getHouseNumber() {
        return this.ANX;
    }

    public KO DDB() {
        if (this.ANX == null) {
            this.ANX = new KO();
        }

        return this.ANX;
    }

    public void setHouseNumber(KO var1) {
        this.ANX = var1;
    }

    public KO getApartmentNumber() {
        return this.ANY;
    }

    public KO DDC() {
        if (this.ANY == null) {
            this.ANY = new KO();
        }

        return this.ANY;
    }

    public void setApartmentNumber(KO var1) {
        this.ANY = var1;
    }

    public JL getPostalCode() {
        return this.ANZ;
    }

    public JL DDD() {
        if (this.ANZ == null) {
            this.ANZ = new JL();
        }

        return this.ANZ;
    }

    public void setPostalCode(JL var1) {
        this.ANZ = var1;
    }

    public KO getPostOffice() {
        return this.AOA;
    }

    public KO DDE() {
        if (this.AOA == null) {
            this.AOA = new KO();
        }

        return this.AOA;
    }

    public void setPostOffice(KO var1) {
        this.AOA = var1;
    }

    public int QOR() {
        int var2 = 1;
        var2 = 31 * var2 + (this.ANY == null ? 0 : this.ANY.hashCode());
        var2 = 31 * var2 + (this.ANV == null ? 0 : this.ANV.hashCode());
        var2 = 31 * var2 + (this.ANU == null ? 0 : this.ANU.hashCode());
        var2 = 31 * var2 + (this.ANR == null ? 0 : this.ANR.hashCode());
        var2 = 31 * var2 + (this.ANT == null ? 0 : this.ANT.hashCode());
        var2 = 31 * var2 + (this.ANX == null ? 0 : this.ANX.hashCode());
        var2 = 31 * var2 + (this.AOA == null ? 0 : this.AOA.hashCode());
        var2 = 31 * var2 + (this.ANZ == null ? 0 : this.ANZ.hashCode());
        var2 = 31 * var2 + (this.ANW == null ? 0 : this.ANW.hashCode());
        var2 = 31 * var2 + (this.ANS == null ? 0 : this.ANS.hashCode());
        return var2;
    }
}
