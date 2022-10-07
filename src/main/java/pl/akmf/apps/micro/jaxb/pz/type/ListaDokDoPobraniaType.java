package pl.akmf.apps.micro.jaxb.pz.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
