package a.a.a.b.e.c;

import java.security.Provider;

public class FFE extends Provider {
    private static final long serialVersionUID = 1L;

    public FFE() {
        super("tmpPKCS11Provider", 0.0, "temporaryPKCS11Provider");
        this.putService(new Provider.Service(this, "Signature", "SHA256withRSA", FFB.class.getName(), null, null));
    }
}
