package a.a.a.c.f.a.d;

import a.a.a.c.f.b.b.Period;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "declarationJPK_StatusTracker"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationJPK_StatusTracker extends DeclarationJPK {
    public DeclarationJPK_StatusTracker() {
        super(DeclarationSubtype.STATUS_TRACKER, 0);

    }

    public DeclarationJPK_StatusTracker(String var1) {
        super(DeclarationSubtype.STATUS_TRACKER, 0);
        this.setReferenceId(var1);
        this.setPeriod(Period.AOE);
        this.setDeclarationStatus(DeclarationStatus.NEW);

    }
}
