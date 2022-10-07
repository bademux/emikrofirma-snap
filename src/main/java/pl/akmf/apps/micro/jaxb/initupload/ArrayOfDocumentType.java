package pl.akmf.apps.micro.jaxb.initupload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfDocumentType",
        propOrder = {"document"}
)
public class ArrayOfDocumentType {
    @XmlElement(
            name = "Document",
            required = true
    )
    protected List<Document> document;

    public ArrayOfDocumentType() {
    }

    public List<Document> getDocument() {
        if (this.document == null) {
            this.document = new ArrayList();
        }

        return this.document;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = ""
    )
    public static class Document extends DocumentType {
        public Document() {
        }
    }
}
