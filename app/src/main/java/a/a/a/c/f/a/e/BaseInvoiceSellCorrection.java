package a.a.a.c.f.a.e;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class BaseInvoiceSellCorrection extends BaseInvoiceSell {
    protected BaseInvoiceSellCorrection() {
        super(InvoiceSubtype.CORRECTION);

    }
}
