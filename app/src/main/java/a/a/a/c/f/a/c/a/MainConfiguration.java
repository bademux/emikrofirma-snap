package a.a.a.c.f.a.c.a;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@XmlRootElement(
        name = "mainConfiguration"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class MainConfiguration {
    @XmlElement(
            name = "packages"
    )
    private final List<ConfigurationPackage> AHWH;

    public MainConfiguration() {

        this.AHWH = new ArrayList();

    }

    public List<ConfigurationPackage> getRulesPackages() {
        return this.AHWH;
    }

    public ActionResult getFinalActionResult() {
        ActionResult var1 = ActionResult.SUCCESS;

        ConfigurationPackage var3;
        for (Iterator var2 = this.AHWH.iterator(); var2.hasNext(); var1 = this.AIDQ(var1, var3.getFinalActionResult())) {
            var3 = (ConfigurationPackage) var2.next();
        }

        return var1;
    }

    private ActionResult AIDQ(ActionResult var1, ActionResult var2) {
        boolean var3 = true;
        int var4;
        if (var1.getLevel() >= var2.getLevel()) {
            var4 = var1.getLevel();
        } else {
            var4 = var2.getLevel();
        }

        return ActionResult.getByLevel(var4);
    }

    public String toString() {
        return "MainConfiguration [rulesPackages=" + this.AHWH + "]";
    }
}
