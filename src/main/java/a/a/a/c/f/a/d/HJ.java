package a.a.a.c.f.a.d;

import a.a.a.c.e.a.d.MME;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EXM;
import a.a.a.c.f.b.c.JY;

import javax.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlTransient
public abstract class HJ extends EXM {
    private HM AJB;
    private AGWW AHRN;
    private HL AJC;
    private JY AHRO;
    private EHK FFZ;
    private transient MME<Boolean, String, String, String, LocalDate, BigDecimal, String> MWA;

    public HJ() {
        EXF.getInstance().ICO();

        try {
            this.AJC = HL.NEW;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public HJ(HM var1, AGWW var2, Integer var3) {
        this();
        EXF.getInstance().ICO();

        try {
            this.AJB = var1;
            this.AHRN = var2;
            this.AHRO = new JY(var3);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public HM getDeclarationType() {
        return this.AJB;
    }

    public AGWW getDeclarationSubType() {
        return this.AHRN;
    }

    public HL getDeclarationStatus() {
        return this.AJC;
    }

    public void setDeclarationStatus(HL var1) {
        this.AJC = var1;
    }

    public JY getDeclarationReason() {
        return this.AHRO;
    }

    public void setDeclarationReason(JY var1) {
        this.AHRO = var1;
    }

    public EHK getSignatureType() {
        return this.FFZ;
    }

    public EHK MWX() {
        if (this.FFZ == null) {
            this.FFZ = EHK.Unknown;
        }

        return this.FFZ;
    }

    public void setSignatureType(EHK var1) {
        this.FFZ = var1;
    }

    public MME<Boolean, String, String, String, LocalDate, BigDecimal, String> getKdSignatureData() {
        return this.MWA;
    }

    public void setKdSignatureData(MME<Boolean, String, String, String, LocalDate, BigDecimal, String> var1) {
        this.MWA = var1;
    }

    public int hashCode() {
        int var2 = super.hashCode();
        var2 = 31 * var2 + (this.AJB == null ? 0 : this.AJB.hashCode());
        var2 = 31 * var2 + (this.AHRN == null ? 0 : this.AHRN.hashCode());
        var2 = 31 * var2 + (this.AHRO == null ? 0 : this.AHRO.hashCode());
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
            HJ var2 = (HJ) var1;
            if (this.AJB != var2.AJB) {
                return false;
            } else if (this.AHRN != var2.AHRN) {
                return false;
            } else {
                return this.AHRO == var2.AHRO;
            }
        }
    }

    public String toString() {
        return "Declaration [declarationType=" + this.AJB + ", declarationSubType=" + this.AHRN + ", declarationReason=" + this.AHRO + ", toString()=" + super.toString() + "]";
    }
}
