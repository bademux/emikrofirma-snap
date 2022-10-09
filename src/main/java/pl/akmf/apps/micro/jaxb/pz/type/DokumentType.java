package pl.akmf.apps.micro.jaxb.pz.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DokumentType",
        propOrder = {"idDokumentu"}
)
@XmlSeeAlso({DokumentZadanieType.class, DokumentWynikType.class})
public class DokumentType {
    protected long idDokumentu;

    public DokumentType() {
    }

    public long getIdDokumentu() {
        return this.idDokumentu;
    }

    public void setIdDokumentu(long var1) {
        this.idDokumentu = var1;
    }
}
