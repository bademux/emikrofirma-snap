package a.a.a.c.f.a.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IJ;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.a.KL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class HG extends IJ {
    private JR AIP;
    private JR AIQ;
    private JR AIR;
    private KL AIS;

    public HG() {
        EXF.getInstance().ICO();
        EXF.getInstance().ICP();
    }

    public void setValues(BigDecimal var1, KL var2) {
        this.AIP = new JR(var1);
        this.AIS = var2;
        this.AIQ = new JR(var1.multiply(var2.getRate()).divide(new BigDecimal(100)));
        this.AIR = new JR(var1.add(this.AIQ.getValue()));
    }

    public JR getNet() {
        return this.AIP;
    }

    public JR getVatAmount() {
        return this.AIQ;
    }

    public JR getGross() {
        return this.AIR;
    }

    public KL getTaxRate() {
        return this.AIS;
    }

    public void setNet(JR var1) {
        this.AIP = var1;
    }

    public void setVatAmount(JR var1) {
        this.AIQ = var1;
    }

    public void setGross(JR var1) {
        this.AIR = var1;
    }

    public void setTaxRate(KL var1) {
        this.AIS = var1;
    }
}
