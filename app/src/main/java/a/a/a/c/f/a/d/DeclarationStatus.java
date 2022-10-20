package a.a.a.c.f.a.d;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public enum DeclarationStatus implements EnumTypeValue {
    NONE(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.none")),
    NEW(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.new")),
    SENT(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.sent")),
    SUCCESS(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.success")),
    FAILURE(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.failure")),
    RETRY(FCW.getInstance().getMessageForKey("micro.model.type.declarationstatus.retry"));

    private final String AJD;

    DeclarationStatus(String var3) {

        this.AJD = var3;

    }

    public String getDescription() {
        return this.AJD;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((DeclarationStatus) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
        return values();
    }
}
