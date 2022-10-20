package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.io.File;

@XmlAccessorType(XmlAccessType.FIELD)
public class ZipFileEntry {
    protected transient File AHTI;
    protected String AHTJ;
    protected transient File AHTK;
    protected String AHTL;
    protected FinishUploadResponseStatus AHTM;

    public ZipFileEntry() {
    }

    public ZipFileEntry(File var1, File var2, FinishUploadResponseStatus var3, String var4) {
        this.AHTI = var1;
        if (this.AHTI != null) {
            this.AHTJ = this.AHTI.getName();
        }

        this.AHTK = var2;
        if (this.AHTK != null) {
            this.AHTL = this.AHTK.getName();
        }

        this.AHTM = var3;
    }

    public File getSplitFile() {
        return this.AHTI;
    }

    public void setSplitFile(File var1) {
        this.AHTI = var1;
        if (this.AHTI != null) {
            this.AHTJ = this.AHTI.getName();
        }

    }

    public String getSplitFileName() {
        return this.AHTJ;
    }

    public void setSplitFileName(String var1) {
        this.AHTJ = var1;
    }

    public File getSplitFileEncrypted() {
        return this.AHTK;
    }

    public void setSplitFileEncrypted(File var1) {
        this.AHTK = var1;
        if (this.AHTK != null) {
            this.AHTL = this.AHTK.getName();
        }

    }

    public String getSplitFileEncryptedName() {
        return this.AHTL;
    }

    public void setSplitFileEncryptedName(String var1) {
        this.AHTL = var1;
    }

    public FinishUploadResponseStatus getFileUploadResponseStatus() {
        return this.AHTM;
    }

    public void setFileUploadResponseStatus(FinishUploadResponseStatus var1) {
        this.AHTM = var1;
    }

    public void setFileUploadResponseString(String var1) {
    }

    public String toString() {
        return "ZipFileEntry [splitFile=" + this.AHTI + ", splitFileName=" + this.AHTJ + ", splitFileEncrypted=" + this.AHTK + ", splitFileEncryptedName=" + this.AHTL + ", fileUploadResponseStatus=" + this.AHTM + "]";
    }
}
