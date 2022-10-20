package pl.akmf.apps.micro.jaxb.initupload;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "EncryptionKeyRSAType",
        propOrder = {"value"}
)
@XmlSeeAlso({InitUploadType.EncryptionKey.class})
public class EncryptionKeyRSAType {
    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(
            name = "token"
    )
    protected String value;
    @XmlAttribute(
            name = "algorithm",
            required = true
    )
    @XmlSchemaType(
            name = "anySimpleType"
    )
    protected String algorithm;
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
    @XmlAttribute(
            name = "encoding",
            required = true
    )
    @XmlSchemaType(
            name = "anySimpleType"
    )
    protected String encoding;

    public EncryptionKeyRSAType() {
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String getAlgorithm() {
        return this.algorithm == null ? "RSA" : this.algorithm;
    }

    public void setAlgorithm(String var1) {
        this.algorithm = var1;
    }

    public String getMode() {
        return this.mode == null ? "ECB" : this.mode;
    }

    public void setMode(String var1) {
        this.mode = var1;
    }

    public String getPadding() {
        return this.padding == null ? "PKCS#1" : this.padding;
    }

    public void setPadding(String var1) {
        this.padding = var1;
    }

    public String getEncoding() {
        return this.encoding == null ? "Base64" : this.encoding;
    }

    public void setEncoding(String var1) {
        this.encoding = var1;
    }
}
