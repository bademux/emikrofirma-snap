package pl.akmf.apps.micro.jaxb.pz.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DokumentPodpisanyType",
        propOrder = {"podpisanaZawartosc"}
)
public class DokumentPodpisanyType extends DokumentWynikType {
    @XmlElement(
            required = true
    )
    protected byte[] podpisanaZawartosc;

    public DokumentPodpisanyType() {
    }

    public byte[] getPodpisanaZawartosc() {
        return this.podpisanaZawartosc;
    }

    public void setPodpisanaZawartosc(byte[] var1) {
        this.podpisanaZawartosc = var1;
    }
}
