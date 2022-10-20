package pl.akmf.apps.micro.jaxb.initupload;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DocumentType",
        propOrder = {"formCode", "fileName", "contentLength", "hashValue", "fileSignatureList"}
)
@XmlSeeAlso({ArrayOfDocumentType.Document.class})
public class DocumentType {
    @XmlElement(
            name = "FormCode",
            required = true
    )
    protected FormCode formCode;
    @XmlElement(
            name = "FileName",
            required = true
    )
    protected String fileName;
    @XmlElement(
            name = "ContentLength"
    )
    protected long contentLength;
    @XmlElement(
            name = "HashValue",
            required = true
    )
    protected HashValue hashValue;
    @XmlElement(
            name = "FileSignatureList",
            required = true
    )
    protected FileSignatureList fileSignatureList;

    public DocumentType() {
    }

    public FormCode getFormCode() {
        return this.formCode;
    }

    public void setFormCode(FormCode var1) {
        this.formCode = var1;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String var1) {
        this.fileName = var1;
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public void setContentLength(long var1) {
        this.contentLength = var1;
    }

    public HashValue getHashValue() {
        return this.hashValue;
    }

    public void setHashValue(HashValue var1) {
        this.hashValue = var1;
    }

    public FileSignatureList getFileSignatureList() {
        return this.fileSignatureList;
    }

    public void setFileSignatureList(FileSignatureList var1) {
        this.fileSignatureList = var1;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = ""
    )
    public static class HashValue extends HashValueSHAType {
        public HashValue() {
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"value"}
    )
    public static class FormCode {
        @XmlValue
        protected String value;
        @XmlAttribute(
                name = "systemCode",
                required = true
        )
        protected String systemCode;
        @XmlAttribute(
                name = "schemaVersion",
                required = true
        )
        protected String schemaVersion;

        public FormCode() {
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String var1) {
            this.value = var1;
        }

        public String getSystemCode() {
            return this.systemCode;
        }

        public void setSystemCode(String var1) {
            this.systemCode = var1;
        }

        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public void setSchemaVersion(String var1) {
            this.schemaVersion = var1;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = ""
    )
    public static class FileSignatureList extends ArrayOfFileSignatureType {
        @XmlAttribute(
                name = "filesNumber",
                required = true
        )
        protected int filesNumber;

        public FileSignatureList() {
        }

        public int getFilesNumber() {
            return this.filesNumber;
        }

        public void setFilesNumber(int var1) {
            this.filesNumber = var1;
        }
    }
}
