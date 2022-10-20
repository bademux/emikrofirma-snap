package a.a.a.c.f.a.e;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "aggregatePurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class QSF extends InvoicePurchase {
    public QSF() {
        super(IA.AGGREGATE);

    }
}
