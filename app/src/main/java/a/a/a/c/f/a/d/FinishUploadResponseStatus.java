package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class FinishUploadResponseStatus {
    private int AHSU;

    public FinishUploadResponseStatus() {
    }

    public FinishUploadResponseStatus(int var1) {
        this.AHSU = var1;
    }

    public int getStatus() {
        return this.AHSU;
    }

    public void setStatus(int var1) {
        this.AHSU = var1;
    }
}
