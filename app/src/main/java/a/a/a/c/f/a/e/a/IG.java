package a.a.a.c.f.a.e.a;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceRecordSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class IG extends InvoiceRecord {
    public IG() {
        super(IH.SELL);

    }
}
