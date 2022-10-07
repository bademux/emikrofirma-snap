package pl.akmf.apps.micro.jaxb.initupload;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "InitUploadType",
   propOrder = {"documentType", "version", "encryptionKey", "documentList"}
)
public class InitUploadType {
   @XmlElement(
      name = "DocumentType",
      required = true
   )
   protected String documentType;
   @XmlElement(
      name = "Version",
      required = true
   )
   protected String version;
   @XmlElement(
      name = "EncryptionKey",
      required = true
   )
   protected EncryptionKey encryptionKey;
   @XmlElement(
      name = "DocumentList",
      required = true
   )
   protected ArrayOfDocumentType documentList;

   public InitUploadType() {
   }

   public String getDocumentType() {
      return this.documentType;
   }

   public void setDocumentType(String var1) {
      this.documentType = var1;
   }

   public String getVersion() {
      return this.version;
   }

   public void setVersion(String var1) {
      this.version = var1;
   }

   public EncryptionKey getEncryptionKey() {
      return this.encryptionKey;
   }

   public void setEncryptionKey(EncryptionKey var1) {
      this.encryptionKey = var1;
   }

   public ArrayOfDocumentType getDocumentList() {
      return this.documentList;
   }

   public void setDocumentList(ArrayOfDocumentType var1) {
      this.documentList = var1;
   }

   @XmlAccessorType(XmlAccessType.FIELD)
   @XmlType(
      name = ""
   )
   public static class EncryptionKey extends EncryptionKeyRSAType {
      public EncryptionKey() {
      }
   }
}
