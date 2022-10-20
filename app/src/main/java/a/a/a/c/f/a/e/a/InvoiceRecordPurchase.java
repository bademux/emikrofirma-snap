package a.a.a.c.f.a.e.a;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "invoiceRecordPurchase"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceRecordPurchase extends InvoiceRecord {
    public InvoiceRecordPurchase() {
        super(IH.PURCHASE);

    }
}
