package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_PKPIR"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class AGWS extends DeclarationJPK {
    public AGWS() {
        super(AGWW.PKPIR, 0);

    }

    public AGWS(Integer var1, File var2, JPKSchemaType var3) {
        super(AGWW.PKPIR, var1, var2, var3);

    }
}
