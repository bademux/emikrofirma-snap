package a.a.a.c.f.a.d;

import a.a.a.c.f.b.c.Bytes;
import a.a.a.c.f.b.c.Text;

public class AGXC {
    private transient Bytes AHTE;
    private transient Bytes AHTF;
    private transient Text AHTG;
    private transient Text AHTH;

    public AGXC() {
    }

    public Bytes getInitialisationVector() {
        return this.AHTE;
    }

    public void setInitialisationVector(Bytes var1) {
        this.AHTE = var1;
    }

    public Bytes getSecretKeyBytes() {
        return this.AHTF;
    }

    public void setSecretKeyBytes(Bytes var1) {
        this.AHTF = var1;
    }

    public Text getSecretKeyAlgorithm() {
        return this.AHTG;
    }

    public void setSecretKeyAlgorithm(Text var1) {
        this.AHTG = var1;
    }

    public Text getSecretKeyFormat() {
        return this.AHTH;
    }

    public void setSecretKeyFormat(Text var1) {
        this.AHTH = var1;
    }
}
