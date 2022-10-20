package a.a.a.c.f.c.a;

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
public class ConfigurationProperties extends LW {
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
    private final List<ConfigurationProperty<?, ?>> AQF;

    public ConfigurationProperties() {

        this.AQF = new ArrayList();
        ConfigurationProperty var1 = QJZ.getDefaultConfigurationProperty(FCQ.WorkingDir);
        this.AQF.add(var1);
        ConfigurationProperty var2 = QJZ.getDefaultConfigurationProperty(FCQ.SellRefIdPattern);
        this.AQF.add(var2);
        ConfigurationProperty var3 = QJZ.getDefaultConfigurationProperty(FCQ.SellCorrectionRefIdPattern);
        this.AQF.add(var3);
        ConfigurationProperty var4 = QJZ.getDefaultConfigurationProperty(FCQ.CalculationMethod);
        this.AQF.add(var4);

    }

    public List<ConfigurationProperty<?, ?>> getConfigurationProperties() {
        return this.AQF;
    }

    public ConfigurationProperty<?, ?> getConfigurationPropertyOrDefault(FCQ var1) {
        ConfigurationProperty var2 = null;
        Iterator var3 = this.AQF.iterator();

        while (var3.hasNext()) {
            ConfigurationProperty var4 = (ConfigurationProperty) var3.next();
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
