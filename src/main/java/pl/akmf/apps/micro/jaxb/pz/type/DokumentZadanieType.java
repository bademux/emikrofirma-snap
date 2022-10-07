package pl.akmf.apps.micro.jaxb.pz.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DokumentZadanieType",
        propOrder = {"opis", "zawartosc"}
)
public class DokumentZadanieType extends DokumentType {
    @XmlElement(
            required = true
    )
    protected String opis;
    @XmlElement(
            required = true
    )
    protected byte[] zawartosc;

    public DokumentZadanieType() {
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String var1) {
        this.opis = var1;
    }

    public byte[] getZawartosc() {
        return this.zawartosc;
    }

    public void setZawartosc(byte[] var1) {
        this.zawartosc = var1;
    }
}
