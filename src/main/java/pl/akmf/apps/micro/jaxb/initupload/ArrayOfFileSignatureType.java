package pl.akmf.apps.micro.jaxb.initupload;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ArrayOfFileSignatureType",
        propOrder = {"packaging", "encryption", "fileSignature"}
)
@XmlSeeAlso({DocumentType.FileSignatureList.class})
public class ArrayOfFileSignatureType {
    @XmlElement(
            name = "Packaging",
            required = true
    )
    protected Packaging packaging;
    @XmlElement(
            name = "Encryption",
            required = true
    )
    protected Encryption encryption;
    @XmlElement(
            name = "FileSignature",
            required = true
    )
    protected List<FileSignatureType> fileSignature;

    public ArrayOfFileSignatureType() {
    }

    public Packaging getPackaging() {
        return this.packaging;
    }

    public void setPackaging(Packaging var1) {
        this.packaging = var1;
    }

    public Encryption getEncryption() {
        return this.encryption;
    }

    public void setEncryption(Encryption var1) {
        this.encryption = var1;
    }

    public List<FileSignatureType> getFileSignature() {
        if (this.fileSignature == null) {
            this.fileSignature = new ArrayList();
        }

        return this.fileSignature;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"splitZip"}
    )
    public static class Packaging {
        @XmlElement(
                name = "SplitZip"
        )
        protected SplitZip splitZip;

        public Packaging() {
        }

        public SplitZip getSplitZip() {
            return this.splitZip;
        }

        public void setSplitZip(SplitZip var1) {
            this.splitZip = var1;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
                name = ""
        )
        public static class SplitZip {
            @XmlAttribute(
                    name = "type",
                    required = true
            )
            @XmlSchemaType(
                    name = "anySimpleType"
            )
            protected String type;
            @XmlAttribute(
                    name = "mode",
                    required = true
            )
            @XmlSchemaType(
                    name = "anySimpleType"
            )
            protected String mode;

            public SplitZip() {
            }

            public String getType() {
                return this.type == null ? "split" : this.type;
            }

            public void setType(String var1) {
                this.type = var1;
            }

            public String getMode() {
                return this.mode == null ? "zip" : this.mode;
            }

            public void setMode(String var1) {
                this.mode = var1;
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"aes"}
    )
    public static class Encryption {
        @XmlElement(
                name = "AES"
        )
        protected AES aes;

        public Encryption() {
        }

        public AES getAES() {
            return this.aes;
        }

        public void setAES(AES var1) {
            this.aes = var1;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
                name = "",
                propOrder = {"iv"}
        )
        public static class AES {
            @XmlElement(
                    name = "IV",
                    required = true
            )
            protected IV iv;
            @XmlAttribute(
                    name = "size",
                    required = true
            )
            protected int size;
            @XmlAttribute(
                    name = "block",
                    required = true
            )
            protected int block;
            @XmlAttribute(
                    name = "mode",
                    required = true
            )
            @XmlSchemaType(
                    name = "anySimpleType"
            )
            protected String mode;
            @XmlAttribute(
                    name = "padding",
                    required = true
            )
            @XmlSchemaType(
                    name = "anySimpleType"
            )
            protected String padding;

            public AES() {
            }

            public IV getIV() {
                return this.iv;
            }

            public void setIV(IV var1) {
                this.iv = var1;
            }

            public int getSize() {
                return this.size;
            }

            public void setSize(int var1) {
                this.size = var1;
            }

            public int getBlock() {
                return this.block;
            }

            public void setBlock(int var1) {
                this.block = var1;
            }

            public String getMode() {
                return this.mode == null ? "CBC" : this.mode;
            }

            public void setMode(String var1) {
                this.mode = var1;
            }

            public String getPadding() {
                return this.padding == null ? "PKCS#7" : this.padding;
            }

            public void setPadding(String var1) {
                this.padding = var1;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                    name = ""
            )
            public static class IV extends EncryptionAESIVType {
                public IV() {
                }
            }
        }
    }
}
