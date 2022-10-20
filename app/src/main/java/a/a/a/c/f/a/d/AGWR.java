package a.a.a.c.f.a.d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;

@XmlRootElement(
        name = "declarationJPK_MAG"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class AGWR extends DeclarationJPK {
    public AGWR() {
        super(AGWW.MAG, 0);

    }

    public AGWR(Integer var1, File var2, JPKSchemaType var3) {
        super(AGWW.MAG, var1, var2, var3);

    }
}
