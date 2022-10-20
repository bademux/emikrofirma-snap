package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_KR"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class AGWQ extends DeclarationJPK {
    public AGWQ() {
        super(AGWW.KR, 0);

    }

    public AGWQ(Integer var1, File var2, JPKSchemaType var3) {
        super(AGWW.KR, var1, var2, var3);

    }
}
