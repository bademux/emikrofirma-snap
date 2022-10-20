package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_MAG"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class DeclarationJPK_MAG extends DeclarationJPK {
    public DeclarationJPK_MAG() {
        super(DeclarationSubtype.MAG, 0);

    }

    public DeclarationJPK_MAG(Integer var1, File var2, JPKSchemaType var3) {
        super(DeclarationSubtype.MAG, var1, var2, var3);

    }
}
