package a.a.a.c.f.c.a;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.LW;
import a.a.a.c.g.FCQ;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlRootElement(
        name = "configuration"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class LP extends LW {
    @XmlElements({@XmlElement(
            name = "propertyBytes",
            type = LR.class
    ), @XmlElement(
            name = "propertyString",
            type = LS.class
    ), @XmlElement(
            name = "propertyBoolean",
            type = AILX.class
    )})
    private final List<LQ<?, ?>> AQF;

    public LP() {
        EXF.getInstance().ICO();

        try {
            this.AQF = new ArrayList();
            LQ var1 = QJZ.getDefaultConfigurationProperty(FCQ.WorkingDir);
            this.AQF.add(var1);
            LQ var2 = QJZ.getDefaultConfigurationProperty(FCQ.SellRefIdPattern);
            this.AQF.add(var2);
            LQ var3 = QJZ.getDefaultConfigurationProperty(FCQ.SellCorrectionRefIdPattern);
            this.AQF.add(var3);
            LQ var4 = QJZ.getDefaultConfigurationProperty(FCQ.CalculationMethod);
            this.AQF.add(var4);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public List<LQ<?, ?>> getConfigurationProperties() {
        return this.AQF;
    }

    public LQ<?, ?> getConfigurationPropertyOrDefault(FCQ var1) {
        LQ var2 = null;
        Iterator var3 = this.AQF.iterator();

        while (var3.hasNext()) {
            LQ var4 = (LQ) var3.next();
            if (var4.DEX().getValue().equals(var1.getPropertyName())) {
                var2 = var4;
                break;
            }
        }

        if (var2 == null) {
            var2 = QJZ.getDefaultConfigurationProperty(var1);
            this.AQF.add(var2);
        }

        return var2;
    }

    public String toString() {
        return "ConfigurationProperties [configurationProperties=" + this.AQF + ", toString()=" + super.toString() + "]";
    }
}
