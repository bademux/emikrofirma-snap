package a.a.a.c.f.b.c.a;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum TaxReason implements EnumTypeValue {
    acquisition_of_general_goods(FCW.getInstance().getMessageForKey("micro.model.type.taxreason.acquisition_of_general_goods")),
    acquisition_of_fixed_assets(FCW.getInstance().getMessageForKey("micro.model.type.taxreason.acquisition_of_fixed_assets"));

    private final String AOZ;

    TaxReason(String var3) {

        this.AOZ = var3;

    }

    public String getDescription() {
        return this.AOZ;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((TaxReason) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
