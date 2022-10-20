package pl.akmf.apps.micro.jaxb.initupload;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

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
