package pl.akmf.apps.micro.jaxb.pz.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ListaDokDoPobraniaType",
        propOrder = {"dokument"}
)
public class ListaDokDoPobraniaType {
    @XmlElement(
            required = true
    )
    protected List<DokumentType> dokument;

    public ListaDokDoPobraniaType() {
    }

    public List<DokumentType> getDokument() {
        if (this.dokument == null) {
            this.dokument = new ArrayList();
        }

        return this.dokument;
    }
}
