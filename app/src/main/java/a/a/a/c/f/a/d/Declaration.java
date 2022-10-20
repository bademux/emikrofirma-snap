package a.a.a.c.f.a.d;

import a.a.a.c.e.a.d.ValueContainer7;
import a.a.a.c.f.a.ModelBusinessPeriodAndDocIndexElement;
import a.a.a.c.f.b.c.JY;
import jakarta.xml.bind.annotation.XmlTransient;

import java.math.BigDecimal;
import java.time.LocalDate;

@XmlTransient
public abstract class Declaration extends ModelBusinessPeriodAndDocIndexElement {
    private DeclarationType AJB;
    private DeclarationSubtype AHRN;
    private DeclarationStatus AJC;
    private JY AHRO;
    private SignatureType FFZ;
    private transient ValueContainer7<Boolean, String, String, String, LocalDate, BigDecimal, String> MWA;

    public Declaration() {

        this.AJC = DeclarationStatus.NEW;

    }

    public Declaration(DeclarationType var1, DeclarationSubtype var2, Integer var3) {
        this();

        this.AJB = var1;
        this.AHRN = var2;
        this.AHRO = new JY(var3);

    }

    public DeclarationType getDeclarationType() {
        return this.AJB;
    }

    public DeclarationSubtype getDeclarationSubType() {
        return this.AHRN;
    }

    public DeclarationStatus getDeclarationStatus() {
        return this.AJC;
    }

    public void setDeclarationStatus(DeclarationStatus var1) {
        this.AJC = var1;
    }

    public JY getDeclarationReason() {
        return this.AHRO;
    }

    public void setDeclarationReason(JY var1) {
        this.AHRO = var1;
    }

    public SignatureType getSignatureType() {
        return this.FFZ;
    }

    public SignatureType MWX() {
        if (this.FFZ == null) {
            this.FFZ = SignatureType.Unknown;
        }

        return this.FFZ;
    }

    public void setSignatureType(SignatureType var1) {
        this.FFZ = var1;
    }

    public ValueContainer7<Boolean, String, String, String, LocalDate, BigDecimal, String> getKdSignatureData() {
        return this.MWA;
    }

    public void setKdSignatureData(ValueContainer7<Boolean, String, String, String, LocalDate, BigDecimal, String> var1) {
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
            Declaration var2 = (Declaration) var1;
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
