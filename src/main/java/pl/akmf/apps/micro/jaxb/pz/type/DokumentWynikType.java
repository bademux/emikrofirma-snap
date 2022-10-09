package pl.akmf.apps.micro.jaxb.pz.type;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DokumentWynikType",
        propOrder = {"wynik"}
)
@XmlSeeAlso({DokumentPodpisanyType.class})
public class DokumentWynikType extends DokumentType {
    @XmlElement(
            required = true
    )
    protected String wynik;

    public DokumentWynikType() {
    }

    public String getWynik() {
        return this.wynik;
    }

    public void setWynik(String var1) {
        this.wynik = var1;
    }
}
