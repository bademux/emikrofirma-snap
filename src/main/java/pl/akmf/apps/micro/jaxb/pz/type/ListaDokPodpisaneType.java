package pl.akmf.apps.micro.jaxb.pz.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ListaDokPodpisaneType",
        propOrder = {"dokument"}
)
public class ListaDokPodpisaneType {
    @XmlElement(
            required = true
    )
    protected List<DokumentPodpisanyType> dokument;

    public ListaDokPodpisaneType() {
    }

    public List<DokumentPodpisanyType> getDokument() {
        if (this.dokument == null) {
            this.dokument = new ArrayList();
        }

        return this.dokument;
    }
}
