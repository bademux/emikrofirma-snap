package a.a.a.c.f.a.n;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class BaseInvoicePurchase extends InvoiceOther<InvoiceOtherElementPurchase> {
    protected BaseInvoicePurchase() {
        super(InvoiceOtherType.PURCHASE, null);

    }
}
