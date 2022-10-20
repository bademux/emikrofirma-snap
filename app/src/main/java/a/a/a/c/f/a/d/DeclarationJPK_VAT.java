package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_VAT"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationJPK_VAT extends DeclarationJPK {
    private transient boolean AHSS;

    public DeclarationJPK_VAT() {
        super(AGWW.VAT, 0);

    }

    public DeclarationJPK_VAT(Integer var1, File var2, JPKSchemaType var3) {
        this(var1, var2, var3, true);

    }

    public DeclarationJPK_VAT(Integer var1, File var2, JPKSchemaType var3, boolean var4) {
        super(AGWW.VAT, var1, var2, var3);

        this.AHSS = var4;

    }

    public boolean AICF() {
        return this.AHSS;
    }

    public void setPerformVerification(boolean var1) {
        this.AHSS = var1;
    }
}
