package a.a.a.c.f.a;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

public interface EXW<_T> extends EYA {
    StringProperty promptTextProperty();

    String getPromptText();

    void setPromptText(String var1);

    _T getValue();

    void setValue(_T var1);

    ObjectProperty<_T> valueProperty();
}
