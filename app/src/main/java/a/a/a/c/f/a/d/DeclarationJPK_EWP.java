package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_EWP"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationJPK_EWP extends DeclarationJPK {
    public DeclarationJPK_EWP() {
        super(AGWW.EWP, 0);

    }

    public DeclarationJPK_EWP(Integer var1, File var2, JPKSchemaType var3) {
        super(AGWW.EWP, var1, var2, var3);

    }
}
