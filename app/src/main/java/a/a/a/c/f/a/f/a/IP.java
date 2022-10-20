package a.a.a.c.f.a.f.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.KQ;
import a.a.a.c.f.b.c.a.KL;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class IP extends IO implements Cloneable {
    private JR AMN;
    private JR AMO;
    private JR AMP;
    private KQ AMQ;

    public Object RJT() {
        IP var1 = new IP();
        if (this.getNet() != null && this.getNet().getValue() != null) {
            var1.setNet(new JR(this.getNet().getValue()));
        }

        if (this.getVat() != null && this.getVat().getValue() != null) {
            var1.setVat(new JR(this.getVat().getValue()));
        }

        if (this.getGross() != null && this.getGross().getValue() != null) {
            var1.setGross(new JR(this.getGross().getValue()));
        }

        if (this.getTaxRate() != null && this.getTaxRate().getValue() != null) {
            var1.setTaxRate(new KQ(this.getTaxRate().getValue()));
        }

        return var1;
    }

    public IP() {
        EXF.getInstance().ICQ();
    }

    public JR getNet() {
        return this.AMN;
    }

    public JR DCF() {
        if (this.AMN == null) {
            this.AMN = new JR();
        }

        return this.AMN;
    }

    public void setNet(JR var1) {
        this.AMN = var1;
    }

    public JR getVat() {
        return this.AMO;
    }

    public JR DCG() {
        if (this.AMO == null) {
            this.AMO = new JR();
        }

        return this.AMO;
    }

    public void setVat(JR var1) {
        this.AMO = var1;
    }

    public JR getGross() {
        return this.AMP;
    }

    public JR DCH() {
        if (this.AMP == null) {
            this.AMP = new JR();
        }

        return this.AMP;
    }

    public void setGross(JR var1) {
        this.AMP = var1;
    }

    public KQ getTaxRate() {
        return this.AMQ;
    }

    public KQ DCI() {
        if (this.AMQ == null) {
            this.AMQ = new KQ();
        }

        return this.AMQ;
    }

    public void setTaxRate(KQ var1) {
        this.AMQ = var1;
    }
}
