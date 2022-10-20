package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum KM implements JM {
    acquisition_of_general_goods(FCW.getInstance().getMessageForKey("micro.model.type.taxreason.acquisition_of_general_goods")),
    acquisition_of_fixed_assets(FCW.getInstance().getMessageForKey("micro.model.type.taxreason.acquisition_of_fixed_assets"));

    private final String AOZ;

    KM(String var3) {

        this.AOZ = var3;

    }

    public String getDescription() {
        return this.AOZ;
    }

    public int DAQ(JM var1) {
        return this.compareTo((KM) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }
}
