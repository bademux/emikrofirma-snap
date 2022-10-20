package a.a.a.c.f.a.h;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "settlementVat"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class SettlementVat extends Settlement {
    public SettlementVat() {
        super(SettlementType.VAT);

    }
}
