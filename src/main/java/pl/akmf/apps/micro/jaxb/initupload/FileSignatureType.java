package pl.akmf.apps.micro.jaxb.initupload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "FileSignatureType",
   propOrder = {"ordinalNumber", "fileName", "contentLength", "hashValue"}
)
public class FileSignatureType {
   @XmlElement(
      name = "OrdinalNumber"
   )
   protected int ordinalNumber;
   @XmlElement(
      name = "FileName",
      required = true
   )
   protected String fileName;
   @XmlElement(
      name = "ContentLength"
   )
   protected int contentLength;
   @XmlElement(
      name = "HashValue",
      required = true
   )
   protected HashValue hashValue;

   public FileSignatureType() {
   }

   public int getOrdinalNumber() {
      return this.ordinalNumber;
   }

   public void setOrdinalNumber(int var1) {
      this.ordinalNumber = var1;
   }

   public String getFileName() {
      return this.fileName;
   }

   public void setFileName(String var1) {
      this.fileName = var1;
   }

   public int getContentLength() {
      return this.contentLength;
   }

   public void setContentLength(int var1) {
      this.contentLength = var1;
   }

   public HashValue getHashValue() {
      return this.hashValue;
   }

   public void setHashValue(HashValue var1) {
      this.hashValue = var1;
   }

   @XmlAccessorType(XmlAccessType.FIELD)
   @XmlType(
      name = ""
   )
   public static class HashValue extends HashValueMD5Type {
      public HashValue() {
      }
   }
}
