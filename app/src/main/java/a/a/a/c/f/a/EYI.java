package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;

public class EYI<_PARENT extends RequiredGridPane, _CONTEXT extends EXV> extends EXT<_PARENT, _CONTEXT> {
    public EYI() {
        this(null);
    }

    public EYI(String var1) {
        super(var1);
    }

    public void initialize() {
        super.initialize();
        this.fxml_component_main_element.promptTextProperty().bindBidirectional(this.fxml_component_root_element.labelProperty());
        this.fxml_component_main_element.IFF().bind(this.fxml_component_root_element.maxLengthProperty());
        this.fxml_component_main_element.RHS().bind(this.fxml_component_root_element.doTrimProperty());
    }
}
