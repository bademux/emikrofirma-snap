package a.a.a.c.f.c.a;

import a.a.a.c.f.c.LW;
import a.a.a.c.g.ConfigurationProperty;
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
            type = PropertyBytes.class
    ), @XmlElement(
            name = "propertyString",
            type = PropertyString.class
    ), @XmlElement(
            name = "propertyBoolean",
            type = PropertyBoolean.class
    )})
    private final List<a.a.a.c.f.c.a.ConfigurationProperty<?, ?>> AQF;

    public ConfigurationProperties() {

        this.AQF = new ArrayList();
        a.a.a.c.f.c.a.ConfigurationProperty var1 = QJZ.getDefaultConfigurationProperty(ConfigurationProperty.WorkingDir);
        this.AQF.add(var1);
        a.a.a.c.f.c.a.ConfigurationProperty var2 = QJZ.getDefaultConfigurationProperty(ConfigurationProperty.SellRefIdPattern);
        this.AQF.add(var2);
        a.a.a.c.f.c.a.ConfigurationProperty var3 = QJZ.getDefaultConfigurationProperty(ConfigurationProperty.SellCorrectionRefIdPattern);
        this.AQF.add(var3);
        a.a.a.c.f.c.a.ConfigurationProperty var4 = QJZ.getDefaultConfigurationProperty(ConfigurationProperty.CalculationMethod);
        this.AQF.add(var4);

    }

    public List<a.a.a.c.f.c.a.ConfigurationProperty<?, ?>> getConfigurationProperties() {
        return this.AQF;
    }

    public a.a.a.c.f.c.a.ConfigurationProperty<?, ?> getConfigurationPropertyOrDefault(ConfigurationProperty var1) {
        a.a.a.c.f.c.a.ConfigurationProperty var2 = null;
        Iterator var3 = this.AQF.iterator();

        while (var3.hasNext()) {
            a.a.a.c.f.c.a.ConfigurationProperty var4 = (a.a.a.c.f.c.a.ConfigurationProperty) var3.next();
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
