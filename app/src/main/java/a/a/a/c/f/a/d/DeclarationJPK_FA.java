package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_FA"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationJPK_FA extends DeclarationJPK {
    private JpkFaGenerateSettings QLI;

    public DeclarationJPK_FA() {
        super(DeclarationSubtype.FA, 0);

    }

    public DeclarationJPK_FA(Integer var1, File var2, JPKSchemaType var3) {
        super(DeclarationSubtype.FA, var1, var2, var3);

    }
}
