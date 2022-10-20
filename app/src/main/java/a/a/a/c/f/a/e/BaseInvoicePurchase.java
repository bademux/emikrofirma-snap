package a.a.a.c.f.a.e;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class BaseInvoicePurchase extends Invoice<InvoiceElementPurchase> {
    protected BaseInvoicePurchase(InvoiceSubtype var1) {
        super(InvoiceType.PURCHASE, var1);

    }
}
