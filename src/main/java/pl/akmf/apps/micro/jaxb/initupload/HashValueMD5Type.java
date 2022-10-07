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
   name = "HashValueMD5Type",
   propOrder = {"value"}
)
@XmlSeeAlso({FileSignatureType.HashValue.class})
public class HashValueMD5Type {
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

   public HashValueMD5Type() {
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getAlgorithm() {
      return this.algorithm == null ? "MD5" : this.algorithm;
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
