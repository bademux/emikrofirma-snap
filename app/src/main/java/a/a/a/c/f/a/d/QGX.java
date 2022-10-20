package a.a.a.c.f.a.d;

import a.a.a.c.f.b.b.Period;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
        name = "declarationJPK_StatusTracker"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class QGX extends DeclarationJPK {
    public QGX() {
        super(AGWW.STATUS_TRACKER, 0);

    }

    public QGX(String var1) {
        super(AGWW.STATUS_TRACKER, 0);
        this.setReferenceId(var1);
        this.setPeriod(Period.AOE);
        this.setDeclarationStatus(HL.NEW);

    }
}
