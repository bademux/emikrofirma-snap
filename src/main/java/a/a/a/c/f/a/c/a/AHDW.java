package a.a.a.c.f.a.c.a;

import a.a.a.c.e.a.k.a.EXF;

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
public class AHDW {
    @XmlElement(
            name = "packages"
    )
    private final List<AHDJ> AHWH;

    public AHDW() {
        EXF.getInstance().ICO();

        try {
            this.AHWH = new ArrayList();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public List<AHDJ> getRulesPackages() {
        return this.AHWH;
    }

    public AHCI getFinalActionResult() {
        AHCI var1 = AHCI.SUCCESS;

        AHDJ var3;
        for (Iterator var2 = this.AHWH.iterator(); var2.hasNext(); var1 = this.AIDQ(var1, var3.getFinalActionResult())) {
            var3 = (AHDJ) var2.next();
        }

        return var1;
    }

    private AHCI AIDQ(AHCI var1, AHCI var2) {
        boolean var3 = true;
        int var4;
        if (var1.getLevel() >= var2.getLevel()) {
            var4 = var1.getLevel();
        } else {
            var4 = var2.getLevel();
        }

        return AHCI.getByLevel(var4);
    }

    public String toString() {
        return "MainConfiguration [rulesPackages=" + this.AHWH + "]";
    }
}
