package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;

public class EYD<_TYPE, _PARENT extends RequiredGridPane, _CONTEXT extends EXW<_TYPE>> extends EXT<_PARENT, _CONTEXT> {
   public EYD() {
      this((String)null);
   }

   public EYD(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((EXW)this.fxml_component_main_element).promptTextProperty().bindBidirectional(this.fxml_component_root_element.labelProperty());
   }
}
