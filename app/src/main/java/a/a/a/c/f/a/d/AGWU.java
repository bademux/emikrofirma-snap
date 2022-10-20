package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_WB"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class AGWU extends DeclarationJPK {
    public AGWU() {
        super(AGWW.WB, 0);

    }

    public AGWU(Integer var1, File var2, JPKSchemaType var3) {
        super(AGWW.WB, var1, var2, var3);

    }
}
