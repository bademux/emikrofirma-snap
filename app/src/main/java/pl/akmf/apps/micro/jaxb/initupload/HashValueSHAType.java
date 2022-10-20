package pl.akmf.apps.micro.jaxb.initupload;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "HashValueSHAType",
        propOrder = {"value"}
)
@XmlSeeAlso({DocumentType.HashValue.class})
public class HashValueSHAType {
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
            name = "encoding",
            required = true
    )
    @XmlSchemaType(
            name = "anySimpleType"
    )
    protected String encoding;

    public HashValueSHAType() {
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String var1) {
        this.value = var1;
    }

    public String getAlgorithm() {
        return this.algorithm == null ? "SHA-256" : this.algorithm;
    }

    public void setAlgorithm(String var1) {
        this.algorithm = var1;
    }

    public String getEncoding() {
        return this.encoding == null ? "Base64" : this.encoding;
    }

    public void setEncoding(String var1) {
        this.encoding = var1;
    }
}
