package a.a.a.c.f.a.n;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class QSM extends InvoiceOther<InvoiceOtherElementPurchase> {
    protected QSM() {
        super(QSR.PURCHASE, null);

    }
}
