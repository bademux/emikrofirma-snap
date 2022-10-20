package a.a.a.c.f.a.c.a;

import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.a.c.FieldType;
import a.a.a.c.f.a.c.a.c.BaseField;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class BaseRule extends ActionOnObject {
    public BaseRule() {

    }

    public BaseRule(ActionType var1, String var2) {
        super(var1, var2);

    }

    public abstract ValueContainer2<ActionResult, String> AICY(Map<FieldType, BaseField> var1);
}
