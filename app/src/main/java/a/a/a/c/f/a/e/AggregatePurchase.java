package a.a.a.c.f.a.e;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "aggregatePurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class AggregatePurchase extends InvoicePurchase {
    public AggregatePurchase() {
        super(IA.AGGREGATE);

    }
}
