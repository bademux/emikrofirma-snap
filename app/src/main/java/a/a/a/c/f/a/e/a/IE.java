package a.a.a.c.f.a.e.a;

import a.a.a.c.f.b.c.KR;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class IE extends ID {
    private KR AME;

    public IE() {

    }

    public KR getTaxReason() {
        return this.AME;
    }

    public KR DCD() {
        if (this.AME == null) {
            this.AME = new KR();
        }

        return this.AME;
    }

    public void setTaxReason(KR var1) {
        this.AME = var1;
    }
}
