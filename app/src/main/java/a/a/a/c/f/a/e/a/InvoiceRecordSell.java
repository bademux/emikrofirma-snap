package a.a.a.c.f.a.e.a;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceRecordSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceRecordSell extends InvoiceRecord {
    public InvoiceRecordSell() {
        super(InvoiceRecordType.SELL);

    }
}
