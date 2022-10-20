package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_KR"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationJPK_KR extends DeclarationJPK {
    public DeclarationJPK_KR() {
        super(DeclarationSubtype.KR, 0);

    }

    public DeclarationJPK_KR(Integer var1, File var2, JPKSchemaType var3) {
        super(DeclarationSubtype.KR, var1, var2, var3);

    }
}
