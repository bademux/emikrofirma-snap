package pl.akmf.apps.micro.jaxb.pz.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ListaDokWynikType",
        propOrder = {"dokument"}
)
public class ListaDokWynikType {
    @XmlElement(
            required = true
    )
    protected List<DokumentWynikType> dokument;

    public ListaDokWynikType() {
    }

    public List<DokumentWynikType> getDokument() {
        if (this.dokument == null) {
            this.dokument = new ArrayList();
        }

        return this.dokument;
    }
}
