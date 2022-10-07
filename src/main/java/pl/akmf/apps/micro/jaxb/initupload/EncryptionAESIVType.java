package pl.akmf.apps.micro.jaxb.initupload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "EncryptionAESIVType",
   propOrder = {"value"}
)
@XmlSeeAlso({ArrayOfFileSignatureType.Encryption.AES.IV.class})
public class EncryptionAESIVType {
   @XmlValue
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   @XmlSchemaType(
      name = "token"
   )
   protected String value;
   @XmlAttribute(
      name = "bytes",
      required = true
   )
   @XmlSchemaType(
      name = "anySimpleType"
   )
   protected String bytes;
   @XmlAttribute(
      name = "encoding",
      required = true
   )
   @XmlSchemaType(
      name = "anySimpleType"
   )
   protected String encoding;

   public EncryptionAESIVType() {
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getBytes() {
      return this.bytes == null ? "16" : this.bytes;
   }

   public void setBytes(String var1) {
      this.bytes = var1;
   }

   public String getEncoding() {
      return this.encoding == null ? "Base64" : this.encoding;
   }

   public void setEncoding(String var1) {
      this.encoding = var1;
   }
}
