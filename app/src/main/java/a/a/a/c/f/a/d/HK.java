package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_VAT"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class HK extends AGWN {
    private transient boolean AHSS;

    public HK() {
        super(AGWW.VAT, 0);

    }

    public HK(Integer var1, File var2, AGXA var3) {
        this(var1, var2, var3, true);

    }

    public HK(Integer var1, File var2, AGXA var3, boolean var4) {
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
