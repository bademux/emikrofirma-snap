package pl.akmf.apps.micro.jaxb.initupload;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {
    private static final QName _InitUpload_QNAME = new QName("http://e-dokumenty.mf.gov.pl", "InitUpload");

    public ObjectFactory() {
    }

    public ArrayOfDocumentType createArrayOfDocumentType() {
        return new ArrayOfDocumentType();
    }

    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    public ArrayOfFileSignatureType createArrayOfFileSignatureType() {
        return new ArrayOfFileSignatureType();
    }

    public ArrayOfFileSignatureType.Encryption createArrayOfFileSignatureTypeEncryption() {
        return new ArrayOfFileSignatureType.Encryption();
    }

    public ArrayOfFileSignatureType.Encryption.AES createArrayOfFileSignatureTypeEncryptionAES() {
        return new ArrayOfFileSignatureType.Encryption.AES();
    }

    public ArrayOfFileSignatureType.Packaging createArrayOfFileSignatureTypePackaging() {
        return new ArrayOfFileSignatureType.Packaging();
    }

    public FileSignatureType createFileSignatureType() {
        return new FileSignatureType();
    }

    public InitUploadType createInitUploadType() {
        return new InitUploadType();
    }

    public HashValueSHAType createHashValueSHAType() {
        return new HashValueSHAType();
    }

    public EncryptionKeyRSAType createEncryptionKeyRSAType() {
        return new EncryptionKeyRSAType();
    }

    public HashValueMD5Type createHashValueMD5Type() {
        return new HashValueMD5Type();
    }

    public EncryptionAESIVType createEncryptionAESIVType() {
        return new EncryptionAESIVType();
    }

    public ArrayOfDocumentType.Document createArrayOfDocumentTypeDocument() {
        return new ArrayOfDocumentType.Document();
    }

    public DocumentType.FormCode createDocumentTypeFormCode() {
        return new DocumentType.FormCode();
    }

    public DocumentType.HashValue createDocumentTypeHashValue() {
        return new DocumentType.HashValue();
    }

    public DocumentType.FileSignatureList createDocumentTypeFileSignatureList() {
        return new DocumentType.FileSignatureList();
    }

    public ArrayOfFileSignatureType.Encryption.AES.IV createArrayOfFileSignatureTypeEncryptionAESIV() {
        return new ArrayOfFileSignatureType.Encryption.AES.IV();
    }

    public ArrayOfFileSignatureType.Packaging.SplitZip createArrayOfFileSignatureTypePackagingSplitZip() {
        return new ArrayOfFileSignatureType.Packaging.SplitZip();
    }

    public FileSignatureType.HashValue createFileSignatureTypeHashValue() {
        return new FileSignatureType.HashValue();
    }

    public InitUploadType.EncryptionKey createInitUploadTypeEncryptionKey() {
        return new InitUploadType.EncryptionKey();
    }

    @XmlElementDecl(
            namespace = "http://e-dokumenty.mf.gov.pl",
            name = "InitUpload"
    )
    public JAXBElement<InitUploadType> createInitUpload(InitUploadType var1) {
        return new JAXBElement(_InitUpload_QNAME, InitUploadType.class, null, var1);
    }
}
