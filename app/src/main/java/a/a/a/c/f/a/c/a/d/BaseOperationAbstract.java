package a.a.a.c.f.a.c.a.d;

import a.a.a.c.f.a.c.a.c.Field;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseOperationAbstract extends OperationAbstract {
    private BaseOperationAbstract() {

    }

    public BaseOperationAbstract(OperationType var1) {
        super(var1);

    }

    public abstract void AIDS(Set<Field> var1);
}
